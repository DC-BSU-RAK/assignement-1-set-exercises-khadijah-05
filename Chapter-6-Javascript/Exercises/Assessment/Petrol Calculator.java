/* Reset some default styles */
body, h1, p, input, button {
    margin: 0;
    padding: 0;
    font-family: 'Segoe UI', sans-serif;
    box-sizing: border-box;
  }
  /* Container styling */
  .container {
    max-width: 400px;
    margin: 100px auto;
    padding: 30px;
    background-color: #f7f9fc;
    border-radius: 12px;
    box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
    text-align: center;
  }
  /* Title */
  h1 {
    margin-bottom: 20px;
    color: #333;
  }
  /* Label styling */
  label {
    display: block;
    margin: 15px 0 5px;
    color: #555;
    text-align: left;
  }
  /* Input field styling */
  input[type="number"] {
    width: 100%;
    padding: 10px;
    font-size: 1rem;
    border: 2px solid #ccc;
    border-radius: 8px;
    transition: border-color 0.3s;
  }
  /* Input focus effect */
  input[type="number"]:focus {
    outline: none;
    border-color: #0077cc;
    background-color: #eef6ff;
  }
  /* Button styling */
  button {
    margin-top: 20px;
    padding: 12px 20px;
    font-size: 1rem;
    background-color: #0077cc;
    color: white;
    border: none;
    border-radius: 8px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }
  /* Button hover effect */
  button:hover {
    background-color: #005fa3;
  }
  /* Output paragraph */
  #totalCost {
    margin-top: 20px;
    font-size: 1.2rem;
    color: #333;
  }
