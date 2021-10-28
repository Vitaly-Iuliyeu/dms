import React from 'react';



const Item = () => {
    return (
        <div className = "post">
            <div className = "content">
                <strong>тут будет картинка</strong>
            </div>
            <div>модель</div>
            <div>характеристики </div>
            <div>стоимость</div>
            <div className = "btn">
                <button>Просмотр объявления</button>
            </div>
        </div>
    );
};

export default Item;