import React, { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = () => {
    const exchangeRate = 0.011;
    const convertedValue = (rupees * exchangeRate).toFixed(2);
    setEuro(convertedValue);
  };

  return (
    <div style={{margin : '25px'}}>
      <h2 style={{color:'green'}}>Currency Convertor!!!</h2>

      <label>Indian Rupees: </label>
      <input
        type="number"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />

      <br /><br />

      <button onClick={handleSubmit}>Convert</button>

      <h3>Euro: €{euro}</h3>
    </div>
  );
}

export default CurrencyConvertor;