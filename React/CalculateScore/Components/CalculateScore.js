import React from "react";

const convert = (value) => Math.round(value * 100) + "%";

const calcScore = (total, goal) => convert(total / goal);

export const CalculateScore = ({ name, school, total, goal }) => {
    return (
        <div className="Calculator">
            <h1 id="heading">Student Details:</h1>

            <div className="Name">
                <span>Name: {name}</span>
            </div>

            <div className="School">
                <span>School: {school}</span>
            </div>

            <div className="goal">
                <span>Goal: {goal}</span>
            </div>

            <div className="total">
                <span>Score: {calcScore(total, goal)}</span>
            </div>
        </div>
    );
};