let hora = new Date();
let horaText = document.getElementById('hora');
let diaText = document.getElementById('dia');
let monthText = ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic']
let weekText = ['Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab', 'Dom'];

const clock = setInterval(()=>{
  hora = new Date();
  let horaClock = hora.getHours() +":" + hora.getMinutes() + ":" + hora.getSeconds();
  let diaClock = weekText[hora.getDay()-1]+", "+hora.getDate() + " " + monthText[hora.getMonth()];
  diaText.innerHTML = diaClock;
  horaText.innerHTML = horaClock;
}, 1000);