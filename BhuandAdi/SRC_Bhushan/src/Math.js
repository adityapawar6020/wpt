import React, { useState } from 'react'
import Calci from './Calci';

function Math(props) {

  // const [ans,setAns]=useState(0);
  return (
    <div>
      <h1>Hello Welcome to our Calculator</h1>
      {
        props.operator1==='+'?<h1>{parseInt(props.num11)+parseInt(props.num22)}</h1>:
        props.operator1==='-'?<h1>{parseInt(props.num11)-parseInt(props.num22)}</h1>:
        props.operator1==='*'?<h1>{parseInt(props.num11)*parseInt(props.num22)}</h1>:<h1>{parseInt(props.num11)/parseInt(props.num22)}</h1>
      }

      
    </div>



  )
}

export default Math