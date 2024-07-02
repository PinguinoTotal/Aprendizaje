"use strict"

let listaDeIngresosArray = [new Ingreso("Salario", 2100),
                      new Ingreso("Venta cohe", 1500)
];
let listaDeEgresosArray = [new Egreso("Renta departamento", 900),
                      new Egreso("Reyes de reyezs", 1200),
                      new Egreso("Reyes", 200)
];

//datos necesarios 
let ingresos=0;
let egresos=0;
let presupuesto=0;

//lista de ingresos DOM
let listaDeIngresosDOM = document.getElementById('listaIngresos');
//lista de egresos DOM
let listaDeEgresosDOM = document.getElementById('listaEgresos');
//ingresos generales DOM
let ingresosGeneralesDOM = document.getElementById('ingresoGeneral');
//egresos generales DOM
let egresosGeneralesDOM = document.getElementById('egresoGeneral');
//presupuesto disponible DOM
let presupuestoDisponibleDOM = document.getElementById('presupuestoValor');
//boton para capturar los datos
let botonAgregar = document.getElementById('botonAgregar');
//campos que se van a agregar
let signo = document.getElementById('sumaResta');
let conceptoText = document.getElementById('conceptoAgregar');
let valorText = document.getElementById('valorNumero');

calculaYEnsenaParametros();

botonAgregar.addEventListener('click',()=>{
  if(conceptoText.value === "" || isNaN(parseInt(valorText.value))){
    alert('Comprube los datos de entrada');
  }else{
    if(signo.value==="ingreso"){
      let ingreso = new Ingreso(conceptoText.value, parseInt(valorText.value));
      listaDeIngresosArray.push(ingreso);
    }else{
      let egreso = new Egreso(conceptoText.value, parseInt(valorText.value));
      listaDeEgresosArray.push(egreso);
    }
    calculaYEnsenaParametros();
  }
});

function calculaYEnsenaParametros(){
  calcularIngresosYEgresos();
  construirListaDeIngresos();
  construirListaDeEgresos();
}

function calcularIngresosYEgresos(){
  ingresos=0;
  egresos=0;
  presupuesto=0;

  let porcentajeEgreso=0.0;

  listaDeIngresosArray.forEach(ingreso => {
    ingresos += ingreso.valor;
  });

  listaDeEgresosArray.forEach(egreso => {
    egresos += egreso.valor;
  });
  presupuesto = ingresos - egresos;

  porcentajeEgreso = (egresos*100)/ingresos;

  console.log(porcentajeEgreso);
  ingresosGeneralesDOM.innerHTML = `${formatoDinero(ingresos)} <div class="porcentajeVacio"></div>`;
  egresosGeneralesDOM.innerHTML = `-${formatoDinero(egresos)}<div class="porcentaje">${porcentajeEgreso.toFixed(2)}%</div>`;
  presupuestoDisponibleDOM.textContent = formatoDinero(presupuesto);
}

//construyendo la lista de ingresos
function construirListaDeIngresos(){
  let codigo = '';
  listaDeIngresosArray.forEach(ingreso => {
    codigo += hacerElementoDeListaIngresos(ingreso);
  });
  listaDeIngresosDOM.innerHTML = codigo;
}

function hacerElementoDeListaIngresos(ingreso){
  let elemento = `<div class="elemento">
                    <div class="concepto">${ingreso.concepto}</div>
                    <div class="valor textoVerde">+ ${formatoDinero(ingreso.valor)}</div>
                   <button class="eliminar textoVerde" onclick="eliminarIngreso(${ingreso.idIngreso})">
                      <ion-icon name="close-circle-outline"></ion-icon>
                    </button>
                  </div>`
  return elemento;
}

function eliminarIngreso(index){
  let indiceAEliminar = listaDeIngresosArray.findIndex(ingreso => ingreso.idIngreso === index);
  listaDeIngresosArray.splice(indiceAEliminar,1);
  calculaYEnsenaParametros();
}

//construiyendo la lista de egresos
function construirListaDeEgresos(){
  let codigo = '';
  listaDeEgresosArray.forEach(egreso => {
    codigo += hacerElementoDeListaEgresos(egreso);
  });
  listaDeEgresosDOM.innerHTML = codigo;
}

function hacerElementoDeListaEgresos(egreso){
  let porcentajeEgresoLocal = (egreso.valor * 100) / egresos;

  let elemento = `<div class="elemento">
                    <div class="concepto">${egreso.concepto}</div>
                    <div class="valor textoRojo">-${formatoDinero(egreso.valor)}<div class="porcentajeEgreso">${porcentajeEgresoLocal.toFixed(2)}%</div></div>
                    <button class="eliminar textoRojo" onclick="eliminarEgreso(${egreso.idEgreso})">
                      <ion-icon name="close-circle-outline"></ion-icon>
                    </button>
                  </div>`
  return elemento;
}

function eliminarEgreso(index){
  let indiceAEliminar = listaDeEgresosArray.findIndex(egreso => egreso.idEgreso === index);
  listaDeEgresosArray.splice(indiceAEliminar,1);
  calculaYEnsenaParametros();
}

function formatoDinero(cantidad){
  let miles = parseInt( cantidad / 1000);
  let cientos = cantidad - (miles*1000);
  let dinero;
  if(miles != 0){
    dinero = ' $'+miles+','+cientos+'.00';
  }else{
    dinero = ' $'+cientos+'.00';
  }
  
  return dinero;
}
