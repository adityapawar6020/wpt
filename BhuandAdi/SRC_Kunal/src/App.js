import logo from './logo.svg';
import './App.css';
import Math from './Math';
import { useState } from 'react';
function App() {

  const [a,setA]=useState(0);
  const [b,setB]=useState(0)
   const [op,setOp]=useState('');
   const [ans,setAns]=useState(0)

   function handler(e){
     e.preventDefault();

     if(op=="+"){
      setAns(parseInt(a)+parseInt(b));
     }if(op=="-"){
      setAns(parseInt(a)-parseInt(b));
     }
     if(op=="*"){
      setAns(parseInt(a)*parseInt(b));
     }
     if(op=="/"){
      setAns(parseInt(a)/parseInt(b));
     }
   }
  return (
    <div className="App">
<form  action="" >
Enter num1: <input text="number" name="number1" value={a} onChange={(e)=>setA(e.target.value)}/>
Enter num2: <input text="number" name="number2" value={b} onChange={(e)=>setB(e.target.value)} />
Enter opertion <input type="text" name="operator" value={op} onChange={(e)=>setOp(e.target.value)}/>
<br>
</br>
<button onClick={(e)=>handler(e)}>SUBMIT</button> 
</form>
    <h1>{ans}</h1>
    </div>
  );
}
export default App;
