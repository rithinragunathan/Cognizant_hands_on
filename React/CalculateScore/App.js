import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
    <CalculateScore 
      name = "Rithin"
      school = "Srv"
      total = {52}
      goal = {12}
      />
    </div>
  );
}

export default App;
