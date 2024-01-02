import logo from './logo.svg';
import './App.css';
import Math from './Math';
import Calci from './Calci';
import { useEffect, useState } from 'react';







function App() {
  const[num1, setNum1] = useState();
  const[num2, setNum2] = useState();
  const [op, setOp] = useState();

  // useEffect(()=>{
  //    setnum1=document.getElementById("num1").Value;
  //    setnum2=document.getElementById("num2").Value;
  //    setop=document.getElementById("operator").Value;
  // })

  function handler(e){
    e.preventDefault();
    console.log(num1+" "+num2+" "+op);
  }
  return (
 <>
Enter num1: <input text="number" id="num1" onChange={(e)=>setNum1(e.target.value)} />


Enter num2: <input text="number" id="num2" onChange={(e)=>setNum2(e.target.value)}  />

Enter opertion <input type="text" id="operator" onChange={(e)=>setOp(e.target.value)}/>

{/* <button onClick={(e)=>handler(e)}>Submit</button> */}

{/* <h1>{num1}  {num2}</h1> */}


<Math num11={num1} num22={num2} operator1={op}/>
</>
  );
}

export default App;
