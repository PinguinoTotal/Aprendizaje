//haciendo una clase
class Persona{
  //atributos estaticos
  static contadorObjetosPersona = 0;//atributo de nuestra clase

  static get MAX_OBJ(){ //haciendo un atributo constante, aunque se hace hace 
    //como su fuera un metodo 
    return 5;
  }

  email = 'valor default email';//atributo de nuestro objeto

  constructor(nombre, apellido){
    this._nombre = nombre;
    this._apellido = apellido;
  }

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get apellido(){
    return this._apellido;
  }

  set apellido(apellido){
    this._apellido = apellido;
  }

  //añadiendo una funcion a la clase, que al
  //empleados heredar de esta tambien lo tiene 
  nombreCompleto(){
    return this._nombre + " " +this._apellido;
  }

  //sobreescribiendo un metodo del object
  toString(){
    return this._nombre + " " +this._apellido;
  }

  //metodos estaticos
  static saludar(){
    console.log("Hola desde estatic");
  }

  static saludar2(persona){
    console.log("saludando a : " + persona.nombre)
  }
}

let persona1 = new Persona('Juan', 'Perez');
console.log(persona1);

//usando el metodo get
console.log(persona1.nombre);

//usando el metodo set
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);

let persona2 = new Persona('Carlos','Lara');
console.log(persona2);

//haciendo una clase que extiende de persona
class Empleado extends Persona{
  constructor(nombre,apellido,departamento){
    //inicializando al padre y al hijo
    super(nombre,apellido);
    this.departamento = departamento;
  }

  get departamento(){
    return this._departamento;
  }

  set departamento(departamento){
    this._departamento = departamento;
  }

  //tambien se pueden sobreescribir los metodos
  //de los hijos sobre los padres
  nombreCompleto(){
    return this._nombre + " " +this._apellido+ " " +this._departamento;
  }
}

let empleado1 = new Empleado('juan','lopez','finanzas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//como las clases extienden del objeto object, podemos hacer uso de
//sus metodos
console.log(empleado1.toString());

//es polimorfismo porque si se llama nombre completo este depende quien lo llame
//van a pasar cosas diferentes 

//los metodos estaticos se asocian desde la clase y no desde un objeto 
Persona.saludar();
Persona.saludar2(persona1);

//los metodos estaticos tambien son heredables, y tambien el polimorfismo se 
//asoscian a sus entradas, por ende si se llama a un objeto persona, podemos 
//pasarle un objeto empleado sin problemas

//usando atributos estaticos 
Persona.contadorObjetosPersona = 5;

//las clases hijas tambien heredan los atributos estaticos
//si incrementamos el atributo estatico en el constructor, tambien lo suma su hijo 

console.log(persona1.email);

console.log(Persona.MAX_OBJ);