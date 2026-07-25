import React from 'react'

const players = [
  { name: "Virat Kohli", score: 95 },
  { name: "Rohit Sharma", score: 88 },
  { name: "Shubman Gill", score: 67 },
  { name: "KL Rahul", score: 73 },
  { name: "Hardik Pandya", score: 60 },
  { name: "Ravindra Jadeja", score: 55 },
  { name: "Rishabh Pant", score: 82 },
  { name: "Suryakumar Yadav", score: 91 },
  { name: "Jasprit Bumrah", score: 45 },
  { name: "Mohammed Shami", score: 65 },
  { name: "Mohammed Siraj", score: 78 }
];

export default function ListOfPlayers() {
  return (
    <div>

      <div className={'ListOfPlayer'}>
        <h2>List Of Players</h2>
        <ul>
          {
            players.map((player) => (
              <li key={player.name}>Mr. {player.name} {player.score}</li>
            ))}
        </ul>
      </div>

      <hr/>
        
      <div className={'playerBelow70'}>
        <h2>List Of Players Having score Less than 70</h2>
        <ul>
          {players.filter((player) => player.score < 70)
            .map((player) => (
              <li key={player.name}>Mr. {player.name} {player.score}</li>
            ))}
        </ul>
      </div>
    </div>
  )
}
