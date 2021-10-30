
import { Button } from 'bootstrap';
import { useEffect, useState } from 'react';
import Head from './components/Head';
import PostItem from './components/PostItem';
import PostList from './components/PostList';
import CarService from '../src/service/CarService';


import './styles/App.css'
function App() {
  const[posts, setPosts] = useState( [ ])

  useEffect(()=>{
    fetchPosts()
  },[])
  
  async function fetchPosts(){
    const response = await CarService.getCar();
    setPosts(response.data)
  }
  return (
    <div className = "App">
     <Head/>
     <PostList posts = {posts}/>
    </div>
  );
}

export default App;
