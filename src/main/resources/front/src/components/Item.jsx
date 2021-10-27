import React from 'react';

const Item = () => {
    return (
        <div className = "post">
            <div className = "content">
                <strong>Название</strong>
                <div>Описание</div>
            </div>
            <div className = "btn">
                <button>Удалить</button>
            </div>
        </div>
    );
};

export default Item;