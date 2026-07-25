import React, { useState } from 'react'

export default function EventHandle() {
    const [count, setCounter] = useState(0);
    const increment = () => setCounter(count + 1);
    const decrement = () => setCounter(count - 1);

    const sayHello = () => {
        alert("Hello! Welcome to React Event Handling.");
    };

    const EventHandleIncrement = () => {
        increment();
        sayHello();
    }

    const EventHandleDecrement = () => decrement();
    function sayWelcome(value) {
        alert(value)
    }

    return (
        <div style={{margin : '25px',padding : '2px', border : '25px'}}>
            <span><p>{count}</p></span>
            <div>
                <button onClick={EventHandleIncrement}>Increment</button>
            </div>
            <div>
                <button onClick={EventHandleDecrement}>decrement</button>
            </div>
            <div>
                <button onClick={() => sayWelcome("Welcome")}>Say Hello</button>
            </div>
            <div>
                <button onClick={() => alert("I was Clicked")}>Click On Me</button>
            </div>
        </div>
    )
}
