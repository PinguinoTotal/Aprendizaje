'use strict'
let formulario = document.getElementById('calculadora');
formulario.addEventListener('submit',sumar);
let operacionA = document.getElementById('operacionA');
let operacionB = document.getElementById('operacionB');
let resultado = document.getElementById('resultado');


function sumar(){
  let resultadoText = "Resultado: "
  let opAval = parseFloat(operacionA.value);
  let opAva2 = parseFloat(operacionB.value);
  if (!isNaN(opAval) && !isNaN(opAva2)) {
    resultadoText += (opAval + opAva2);
  } else{
    resultadoText += 'La operación no incluye números';
  }
  resultado.innerHTML = resultadoText;
  event.preventDefault();
}