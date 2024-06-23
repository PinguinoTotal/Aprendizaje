//aqui recivimos el formulario que nos manda el html
function validarForma(formulario){
  var usuario = formulario.usuario;
  if(usuario.value == ""){
    alert("el usuario esta vacio");
    
    //hacemos focus en el campo usuario
    usuario.focus();

    //seleccionamos el campo usuario para que ponga el usuario
    usuario.select();

    //se regresa falso porque no queremos que pase el evento post
    return false;
  }

  var password = formulario.password;
  if(password.value == "" && password.value.length < 3){
    alert("password invalido");
    
    //hacemos focus en el campo usuario
    password.focus();

    //seleccionamos el campo usuario para que ponga el usuario
    password.select();

    //se regresa falso porque no queremos que pase el evento post
    return false;
  }

  //al ser un checkbox este puede regresar un array 
  var tecnologias = formulario.tecnologia;

  var checkSeleccionado = false;

  for (let i = 0; i < tecnologias.length; i++) {
    if (tecnologias[i].checked) {
      //si fue seleccionado un checkbox
      checkSeleccionado = true;
    }
  }

  if (!checkSeleccionado) {
    alert("Debe seleccionar una tecnologia");
    return false;
  }

  var generos = formulario.genero;
  var radioSeleccionado = false;

  for (let i = 0; i < generos.length; i++) {
    if (generos[i].checked) {
      radioSeleccionado = true;
    }
    
  }

  if(!radioSeleccionado){
    alert("Debe seleccionar un genero")
    return false;
  }

  var ocupacion = formulario.ocupacion;
  if (ocupacion.value == "") {
    console.log(ocupacion);
    alert("Debe seleccionar una ocupacion");
    return false;
  }

  //si no ha regresado false el formulario es valido
  alert("formulario valido, enviando datos al servidor");
  return true;
}