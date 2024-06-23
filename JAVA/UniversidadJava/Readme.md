# Universidad Java - De Ceroa a Experto - más de +106 hrs

## Fundamentos
### 5.-
~~~java
//haciendo comentarios en java 
public class HolaMundo {
    //siempre en java debemos empezar con una clase 
    //Java diferencia entre mayusculas y minusculas
    public static void main(String args[]){
        System.out.println("Hola mundo desde java");
    }
}
~~~
por el momento (clase 8) estoy haciendo toda la estructura de los archivos en apacheNetbeans, pero me gusta más el autocompletar de visual studio ya que es más agresivo, asi que mejor genero la estructura de archivos en appache y trato el codigo en visual studio code

### 7.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //las variables empiezan en minuscula
    int miVariableEntera = 10;
    System.out.println(miVariableEntera);
  }
}

~~~

### 8.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    int miVariableEntera = 10;
    System.out.println(miVariableEntera);

    //modificamos el valor de la variable 
    miVariableEntera = 5;

    System.out.println(miVariableEntera);

    //variable string
    String miVariableCadena = "Saludos";
    System.out.println(miVariableCadena);

    //si le amos ctl + click en la variable nos lleva en donde fue
    //declarada la variable 
    miVariableCadena = "Adios";
    System.out.println(miVariableCadena);
  }
}
~~~

### 9.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    int miVariableEntera = 10;
    System.out.println(miVariableEntera);
    miVariableEntera = 5;

    System.out.println(miVariableEntera);

    String miVariableCadena = "Saludos";
    System.out.println(miVariableCadena);
 
    miVariableCadena = "Adios";
    System.out.println(miVariableCadena);

    //con var infiere que tipo de variable va a ser
    //cuando se esta dentro de un metodo no se puede usar var
    //tiene limitaciones que veremos más adelante 
    var miVariableEntera2 = 15;
    System.out.println(miVariableEntera2);

    //para concatenar cosas pues se le pone un + como casi siempre 
    var miVariableCadena2 = "nueva cadena";
    System.out.println("miVariableCadena2" + miVariableCadena2);
  }
}
~~~

### 10.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    int miVariableEntera = 10;
    System.out.println(miVariableEntera);
    miVariableEntera = 5;

    System.out.println(miVariableEntera);

    String miVariableCadena = "Saludos";
    System.out.println(miVariableCadena);
 
    miVariableCadena = "Adios";
    System.out.println(miVariableCadena);

    var miVariableEntera2 = 15;
    System.out.println(miVariableEntera2);

    var miVariableCadena2 = "nueva cadena";
    System.out.println("miVariableCadena2" + miVariableCadena2);

    //reglas para nombrar variables:
    //no se puede usar numeros o caracteres especiales al principio, pero si puede ser _ o $
    //no se recomienda que se usen los acentos
    var miVariable = 1;
  }
}
~~~

### 11.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //concatenacion de cadenas
    var usuario = "juan";
    var titulo = "Ingeniero";
    var union = titulo + " " + usuario;
    System.out.println(union);

    var i = 3;
    var j = 4;

    System.out.println(i + j); //se suman numeros

    //si de izquierda a derecha se encuentran numero primero se va a hacer la suma 
    //y despues se concatena 
    System.out.println(i+j+usuario);
    //si primero encuentra cadena, suma lo demas
    System.out.println(usuario+i+j);
    //a menos que se utilicen parentesis
    System.out.println(usuario+(i+j));
  }
}

~~~

### 12.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //caracteres especiales

    var nombre = "karla";

    //salto de linea 
    System.out.println("Nuvea linea: \n" + nombre);

    //tabulador
    System.out.println("Tabulador: \t" + nombre );

    //retroceso 
    //esto hace que lo que se imprima, se imprima un espacio antes
    System.out.println("Retroceso: \b" + nombre);

    //comilla simple
    System.out.println("Comilla simple: \'" +nombre +"\'");

    //comilla doble
    System.out.println("Comilla doble: \"" + nombre +"\"");
  }
}
~~~

### 13.-

e aqui un problema en visual studio se necesita cerrar el leak pero al hacer esto el programa crashea, entonces en visual studio code es necesario dar click izqueiro en la pantalla y seleccionar "run with java", esto pasa por estar usando una clase scanner
~~~java
import java.util.Scanner; //se importa para poder usar scanner

public class VariablesEnJava {
  public static void main(String[] args) {
    //meter datos por el teclado
    System.out.println("escribe tu nombre");
    Scanner consola = new Scanner(System.in);

    //con next line hacemos que la ejecucion pare para que se pueda
    //escribir la respuesta
    var usuario = consola.nextLine();
    System.out.println("tu nombre es: "+usuario);

    System.out.println("escribe el titulo");
    //con el mismo objeto escaner podemos pedir cosas
    var titulo = consola.nextLine();
    System.out.println("el titulo es: "+ titulo);
  }
}
~~~

### 14.-
~~~java
package Tareas;

import java.util.Scanner;

public class Tarea2 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Proporciona el titulo:");
    String titulo = consola.nextLine();
    System.out.println("Proporciona el autor");
    String autor = consola.nextLine();
    System.out.println(titulo + " fue escrito por " + autor);
  }
}
~~~

### 15, 16.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    /*
     * un multi comentario
     * tipos primitivos: byte, chort, int, long
     */

     //en un tipo byte podemos ocupar numeros desde le -128 al 127
     byte numeroByte = 125;

     //en un tipo short puede ir de -32768 al 32767 
     short numeroSgort = 10;

     //pero siempre es mejor utilizar el int para no tener tantas broncas 
     //el int puede ir de -24147483648 al 24147483647
     int numeroInt = 10;

     //el long puede ir de -9223372036854775808 al 9223372036854775807
     int numeroLong = 10;
     System.out.println("valor minimo: " + Long.MAX_VALUE);
     System.out.println("valor minimo: " + Long.MIN_VALUE);
  }
}

~~~

### 17.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    /*
     * tipos primitivos: float , double
     */

     //en un tipo float podemos ocupar numeros desde le 1.4E-45 al 3.4028235E38
     float numeroFloat = 10;

     //en un tipo float podemos ocupar numeros desde le 4.9E-324 al 1.7976931348623157E308
     float numeroDouble = 10;
     System.out.println("valor maximo: " + Double.MAX_VALUE);
     System.out.println("valor minimo: " + Double.MIN_VALUE);
  }
}
~~~

### 18.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //si es solo un numero normal es entera
    var numeroEntero = 10;

    //al usar un punto se hace double
    var numeroDoble = 10.0;

    //al usar la f se crea una variable flotante
    var numeroFloat = 10.0f;
  }
}
~~~

### 19.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    char miCaracter = 'a';

    //los caracteres que pueden ser usados son los caracteres unicode

    // si a un int se le pone un caracter se le da el valor unicode 
  }
}

~~~

### 20.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    boolean varBollean = true;

    //los booleanos de toda la vida, tambien son conocidos como valores 
    //de tipo bandera 

    int edad = 18;
    //tambien se pueden asignar booleanos con los ifs recortados
    var esAdulto = edad >= 18;
  }
}

~~~

### 21, 22.-
~~~java
import java.util.Scanner;

public class VariablesEnJava {
  public static void main(String[] args) {
    //conversiones de tipos

    //convertir un string a un int
    var edad = Integer.parseInt("25");

    //converti de string a double
    var valorPi = Double.parseDouble("3.1416");
    System.out.println(valorPi);
    //pedir valor
    Scanner consola = new Scanner(System.in);

    System.out.println("proporciona tu edad");
    edad = Integer.parseInt(consola.nextLine());
    System.out.println("tu edad es: "+ edad);

    //convertir de in a string
    var edadTexto = String.valueOf(10);
    System.out.println(edadTexto);
    consola.close();
  }
}

~~~

### 23.-
~~~java
package Tareas;

import java.util.Scanner;

public class Tarea3 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("Proporciona el nombre:");
    String nombre = consola.nextLine();
    
    System.out.println("Proporciona el id:");
    int id = Integer.parseInt(consola.nextLine());
    

    System.out.println("Proporciona el precio:");
    int precio = Integer.parseInt(consola.nextLine());
    
    System.out.println("Proporciona el envio gratuito:");
    boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());

    System.out.println(nombre + " #" + id);
    System.out.println("Precio: $"+precio);
    System.out.println("Envio Gratuito: "+ envioGratuito);
  }
}

~~~

### 24.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //operadores aritmeticos 

    //se pueden definir varias variables en la misma linea
    int a=3, b=2;
    var resultado = a + b;
    System.out.println("resultado suma = "+resultado);

    resultado = a-b;
    System.out.println("resultado resta = "+resultado);

    resultado = a*b;
    System.out.println("resultado multiplicacion = "+resultado);

    //como es una divicion y la variable es enteri se elimina el punto 
    var resultado2 = 3f/b;
    System.out.println("resultado division = "+resultado2);

    //operacion de modulo, regresa el residuo de la divicion
    resultado = a%b;
    System.out.println("resultado residuo = "+resultado);


    //preguntanmdo si un numero es par o impar 
    if (a%2 == 0) {
      System.out.println("el numero es par");
    }else{
      System.out.println("el numero es impar");
    }
  }
}

~~~

### 25.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //operadores de asignacion
    
    int a = 3, b=2;
    int c = a + 5 - b;
    System.out.println("c= " + c);

    a+=1; //a = a+1;
    System.out.println("a="+a);
    
    a+=3; //a = a+1;
    System.out.println("a="+a);

    a-=1; //a = a-1;
    System.out.println("a="+a);

    a*=2; //a = a*2;
    System.out.println("a="+a);

    a/=2; //a = a/2;
    System.out.println("a="+a);

    a%=2; //a = a%2;
    System.out.println("a="+a);
  }
}

~~~

### 26.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //operadores de unario

    //camviando el signo a una variable
    var a = 3;
    var b = -a;
    System.out.println("a ="+a);
    System.out.println("b ="+b);

    var c = true;
    var d = !c;
    System.out.println("c ="+c);
    System.out.println("d ="+d);

    //incrementos
    //pre incremento
    var e = 3;
    //piermo se invcremente la variable y despues se usa su valor
    var f = ++e;
    //como primero se incrementa la variable e vale 4
    System.out.println("e ="+e); //4
    System.out.println("f ="+f); //4

    //post incremento
    var g = 5;
    //piermo se usa su valor y despues se invcremente la variable 
    var h = g++;
    //como primero se incrementa la variable e vale 4
    System.out.println("g ="+g); //6
    System.out.println("h ="+h); //5

    //decremento 
    //pre decremento
    var i=2;
    var j = --i;
    System.out.println("i ="+i); //1
    System.out.println("j ="+j); //1

    //ppst decremento
    var k=4;
    var l = k--;
    System.out.println("k ="+k); //3
    System.out.println("l ="+l); //4
  }
}

~~~

### 27, 28, 29, 30, 31.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //operadores de asignacion y racionales

    var a = 3;
    var b = 2;
    //son iguales
    var c = (a==b);
    System.out.println("c = " + c);

    //son diferentes
    var d = (a!=b);
    System.out.println("d = " + d);

    //cuando se utiliza con objetos se hace referencia a donde esten sus referencias
    //no si lo que tienen dentro es igual 

    var cadena = "Hola";
    var cadena2 = "Adios";
    var e = cadena == cadena2;//compara referencias de objetos 
    System.out.println("e = " + e);

    var f = cadena.equals(cadena2); //vemos si lo que tienen dentro sea igual
    System.out.println("f = " + f);

    //operadores relacionales
    // > mayor 
    // >= mayor o igual
    // == igual 
    // < menor
    // <= menor o igual 

    //operadores condicionales o logicos
    // && compuerta and o "y"
    // || compuerta or o "o"
  }
}

~~~

### Tarea 4.-
~~~java
package Tareas;

import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Proporciona el alto");
    int alto = Integer.parseInt(consola.nextLine());

    System.out.println("Proporciona el ancho");
    int ancho = Integer.parseInt(consola.nextLine());

    System.out.println("Area: " + (alto*ancho));
    System.out.println("Perimetro: " + (alto+ancho)*2);
  }
}

~~~

### Tarea 5.-
~~~java
package Tareas;

import java.util.Scanner;

public class Tarea5 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("Proporciona el numero1:");
    var n1 = Float.parseFloat(consola.nextLine());

    System.out.println("Proporciona el numero2:");
    var n2 = Float.parseFloat(consola.nextLine());

    System.out.println("El numero mayor es:");
    if(n1 >= n2){
      System.out.println("numero 1 con valor: "+n1);
    }else{
      System.out.println("numero 2 con valor: "+n2);
    }
  }
}

~~~

### 34, 35.-
el if de toda la vida
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //estructura if
    var condicion = true;
    if (condicion) {
      System.out.println("Condicion verdadera");
    }else{
      System.out.println("Condicion falsa");
    }

    //estructura if else
    var numero = 2;
    var numeroTexto = "numero desconocido";

    if(numero == 1){
      numeroTexto = "Numero1";
    }else if (numero == 2) {
      numeroTexto = "Numero2";
    }else if (numero == 3) {
      numeroTexto = "Numero2";
    }else if (numero == 4) {
      numeroTexto = "Numero2";
    }else{
      numeroTexto = "numero no encontrado";
    }
    System.out.println(numeroTexto);
  }
}

~~~

### 36.-
ejercicio con los meses del año y las estaciones del año con if

### 37.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //estructura switch
    //es importante tener la sentencia break para que no siga 
    //corriendo el programa 
    //el switch es muy bueno para la creacion de menus
    var numero = 2;
    var numeroTexto = "numero desconocido";

    switch (numero) {
      case 1:
        numeroTexto = "Numero1";
        break;
      case 2:
        numeroTexto = "Numero2";
        break;
      case 3:
        numeroTexto = "Numero3";
        break;
      case 4:
        numeroTexto = "Numero4";
        break;
    
      default:
        numeroTexto = "numero no encontrado";
        break;
    }
    System.out.println(numeroTexto);
  }
}

~~~

### 38.-
ejercicio con los meses del año y las estaciones del año con switch

### Tarea 6.-
~~~java
package Tareas;

import java.util.Scanner;

public class Tarea6 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Proporciona un valor entre el 0 y 10");

    var valor = Float.parseFloat(consola.nextLine());
    var valorTexto = "";
    valorTexto = "A";

    if (valor>=0 && valor<6) {
      valorTexto = "F";
    }else if(valor>=6 && valor <7){
      valorTexto = "D";
    }else if(valor>=7 && valor <8){
      valorTexto = "C";
    }else if(valor>=8 && valor <9){
      valorTexto = "B";
    }else if(valor>=9 && valor <=10){
      valorTexto = "A";
    }else{
      valorTexto = "Valor desconocido";
    }
    System.out.println(valorTexto);
  }
}

~~~

### 40, 41, 42, 43, 44.-
~~~java
public class VariablesEnJava {
  public static void main(String[] args) {
    //ciclo while
    var contador = 0;
    while (contador<3) {
      System.out.println("contador = "+contador);
      contador++;
    }

    //el ciclo do while primero hace algo y luego ya sigue iterando
    //ciclo do while 
    contador = 0;
    do {
      System.out.println("contador2 = "+contador);
      contador++;
    } while (contador<3);

    //ciclo for
    //inicalizacion de la variable, sentencia de corte y suma
    //ya no se puede usar i despues  
    for (int i = 0; i < 3; i++) {
      System.out.println("contador con for = " + i);
    }
  }
}

~~~

con brak rompe el ciclo en el que estamos iterando  y continue nos obliga a ir a la siguiente iteracion del ciclo 

las etiquetas son una manera de programar cincorrecta, ya que es el go to, ya que puede corromper los programas en los que estamos trabanjo

### 45, 46, 47, 48, 49.-
las clases, sus archivos deben empezar en mayuscualas por semantica de saber que estamos trabajanco con una clase 

Personas.java
~~~java
package clases;

public class Persona {
  //Atributos de las clases
  String nombre;
  String apellido;

  public void desplegarInformacio(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
  }
}

~~~

PruebasPersona.java
~~~java
package clases;

public class PruebaPersona {
  public static void main(String[] args) {
    Persona persona1;
    //llamando al constructor para darles valores y darle espacio
    //en la memoria con el new 
    persona1 = new Persona();
    persona1.nombre = "Juan";
    persona1.apellido = "Gutierritos";
    persona1.desplegarInformacio();

    Persona persona2 = new Persona();
    persona2.nombre = "Karla";
    persona2.apellido = "Lara";
    persona2.desplegarInformacio();

    //si los imprimimos direcatmente nos da su localizacion en la memoria 
    System.out.println("espacio en memoria de persona 1 = " + persona1);
    System.out.println("espacio en memoria de persona 2 = " + persona2);
  }
}

~~~

### 50, 51, 52, 53.-
clase aritemtica Aritmetica.java
~~~java
package operaciones;

public class Aritmetica {
  //atributos
  int a;
  int b;

  //metodo
  //la primer letra del metodo que sea minuscula
  public void sumar(){
    int resultado = a + b;
    System.out.println(resultado);
  }

  public int sumarConRetorno(){
    int resultado = a+b;
    return resultado;
  }

  //metodo que requiere argumentos
  public int SumarConArgumentos(int a, int b){
    //con el this toma los valores de la clase creada porque estamos en 
    //esta sentencia en un pedazo de codigo que se encuentra en la posicion de memoria
    this.a = a;
    this.b = b;
    return a+b;
  }
   
}
~~~

PruebaAritmetica.java
~~~java
package operaciones;

public class PruebaAritmetica {
  public static void main(String[] args) {
    Aritmetica aritmetica1 = new Aritmetica();
    aritmetica1.a = 3;
    aritmetica1.b = 2;
    aritmetica1.sumar();

    int resultado = aritmetica1.sumarConRetorno();
    System.out.println(resultado);

    resultado = aritmetica1.SumarConArgumentos(5, 8);
    System.out.println(resultado);
  }
}

~~~

### 54, 55, 56.-
~~~java

~~~

### 57.-
las variables se guardan en la memoria stack, los atibutos de la clase y las clases se guardan en la memoria heap
~~~java

~~~

### 58.-
Caja.java
~~~java
package operaciones;

public class Caja {
  int ancho;
  int alto;
  int profundo;

  Caja(){
    System.out.println("inicializando vacio");
  }

  Caja(int ancho, int alto, int profundo){
    this.ancho = ancho;
    this.alto = alto;
    this.profundo = profundo;
  }

  public void calcularVolumen(){
    System.out.println("El ancho de la caja es: " +ancho);
    System.out.println("El alto de la caja es: " +alto);
    System.out.println("El profundo de la caja es: " +profundo);
    System.out.println("El volumen de la caja es: " + (ancho*alto*profundo));
  }
}

~~~

PruebaCaja.java
~~~java
package operaciones;

public class PruebaCaja {
  public static void main(String[] args) {
    Caja caja1 = new Caja();
    caja1.calcularVolumen();

    Caja caja2 = new Caja(3,2,6);
    caja2.calcularVolumen();
  }
}

~~~

### 59.-
pasar por valor solo pasa una copia del valor, pero no la referencia pro ende no se le puede cambiar el valor a la variable
~~~java
package PasoPorValor;

public class PasoPorValor {
  public static void main(String[] args) {
    //pasar por valor solo pasa una copia del valor, pero no la referencia
    var x = 10;
    System.out.println("x =" + x);
  }

  public static void cambioValor(int arg1){
    //sin poner x = algo;
    //no es posible que cambie el valor de x con arg1
  }

  
}
~~~

### 60.-
~~~java
package PasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {
  public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.nombre = "juan";
    System.out.println(persona1.nombre);

    //al ser persona un objeto y no una "unitaria" se pasa la referencia 
    //entonces al tener un metodo que cambia la referencia tambien afecta 
    //al original 
    cambioValor(persona1);

    System.out.println(persona1.nombre);
  }

  public static void cambioValor(Persona persona){
    persona.nombre = "karla";
  }
}

~~~

### 61.-
~~~java
package PasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {
  public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.nombre = "juan";
    System.out.println(persona1.nombre);

    persona1 = cambioValor(persona1);

    System.out.println(persona1.nombre);
  }

  //tenemos que decirle que tipo de valor vamos a regresar
  //si la funcion fuera un void regresaria un return ;
  public static Persona cambioValor(Persona persona){
    persona.nombre = "karla";
    return persona;
    //despues de que se agrege el return ya no se puede psar nada más 
    //a menos que regrese a traves de un if 
  }
}

~~~

### 62, 63.-
~~~java
package palabraThis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre:" + persona.nombre);
        System.out.println("persona nombre:" + persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); llamada al constructor de la clase Padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this:" + this);
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    
    public Imprimir(){
        super();//el constructor de la clase object (padre) para reservar memoria
    }
    
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir:" + persona);
        System.out.println("impresion del objeto actual(this)" + this);
    }
}

~~~


### 64, 65, 66.-
vamos a mepezar a encapsular nuestros objetos

Persona
~~~java
package dominio;

public class Persona {
  private String nombre;
  private double sueldo;
  private boolean eliminado;

  public Persona(String nombre, Double sueldo, boolean eliminado){
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.eliminado = eliminado;
  }

  //haciendo los seters y geters del objeto
  public String getNombre(){
    return this.nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public Double getSueldo(){
    return this.sueldo;
  }

  public void setSueldo(Double sueldo){
    this.sueldo = sueldo;
  }

  //se usa is porque es un boolean
  public boolean isEliminado(){
    return this.eliminado;
  }

  public void setEliminado(Boolean eliminado){
    this.eliminado = eliminado;
  }

  //se hace este para que se pueda ver la info que tiene el obejto
  public String toString(){
    return "Persona [nombre: " + this.nombre +
           ", sueldo: " + this.sueldo +
           ", eliminado: " + this.eliminado +"]";
  }
}
~~~

PersonaPrueba
~~~java
package personaPrueba;

import dominio.Persona;
//import dominio.*; cargar toda la libreria

public class PersonaPrueba {
  public static void main(String[] args) {
    Persona persona1 = new Persona("Juan", 500.00, false);
    //como ya son privadas las variables y estan encapsuladas, debemos hacer 
    //uso de los seters y geters
    //usando el set que ya le pusimos
    persona1.setNombre("Juan Carlos");
    //usando los geters 
    //System.out.println("persona1 nombre: "+ persona1.getNombre());
    //System.out.println("persona1 sueldo: "+ persona1.getSueldo());
    //System.out.println("persona1 eliminado: "+ persona1.isEliminado());

    System.out.println(persona1.toString());
  }
}
~~~

### 67, 68.-
Persona.java
~~~java
package domain;

public class Persona {

    
    private int idPersona;
    private String nombre;
    //esta variablñe al ser estatica se asocia con la clase y no con 
    //los que se crean, por ende se puede sumar y sera una cosntante para 
    //todas kas instancias de la clase
    private static int contadorPersonas;

    public Persona(String nombre){
      this.nombre = nombre;
      this.idPersona = Persona.contadorPersonas;
      Persona.contadorPersonas++;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
      return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
      contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }


}

~~~

PersonaPrueba.java
~~~java
package test;

import domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
      Persona persona1 = new Persona("Juan");
      //como sobreescribimos el toString() y le dimos una nueva funcionalidad
      //ahora podemos llamar este sin más y ya nos arroja la informacion del
      //objeto
      System.out.println(persona1);
    
      //como contador personas es static esta se incrementa de manera estatica
      //en la clase  
      Persona persona2 = new Persona("Karla");
      System.out.println(persona2);
    }
}

~~~

### 69.-
PersonaPrueba
~~~java
package test;

import domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
      Persona persona1 = new Persona("Juan");
      Persona persona2 = new Persona("Karla");

      imprimir(persona1);
      imprimir(persona2);
    }

    //los metodos estaticos solo pueden llamar otros metodos estaticos 
    public static void imprimir(Persona persona){
      System.out.println("Persona = " + persona);
    }
}
~~~

### 70, 71, 72, 73, 74, 75.-
HERENCIA 
Persona.java
~~~java
package domain;

public class Persona {
  // este modificador de acceso deja que las clases hijas puedan acceder a ellas
  // si se pone en privada se puede acceder a ellas a atraves de los geters
  protected String nombre;
  protected char genero;
  protected int edad;
  protected String direccion;

  //los constructores no se heredan de manera automatica, solo poniendole super 
  public Persona() {

  }

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public Persona(String nombre, char genero, int edad, String direccion) {
    this.nombre = nombre;
    this.genero = genero;
    this.edad = edad;
    this.direccion = direccion;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public char getGenero() {
    return this.genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
  }

}

~~~

Empleado.java
~~~java
package domain;

//con la palabra de extends decimos que es hijo de algo 
public class Empleado extends Persona {
  private int idEmpelado;
  private double sueldo;
  private static int contadorEmpleado;

  public Empleado(String nombre, double sueldo) {
    // como no se generan los constructores automaticamente
    // debemos usar super para "pasarle los valores" desde la clase hija
    // al padre para que genere el constructor
    super(nombre);
    this.idEmpelado = contadorEmpleado;
    Empleado.contadorEmpleado++;
    this.sueldo = sueldo;
  }

  public int getIdEmpelado() {
    return this.idEmpelado;
  }

  public double getSueldo() {
    return this.sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Empleado{");
    sb.append("idEmpelado=").append(this.idEmpelado);
    sb.append(", sueldo=").append(this.sueldo);
    //puedo acceder a this.nombre porque en la clase padre esta en protected.
    //con super puedo acceder a los metodos del padre, por ende puedo usar el 
    //to string que se encuentra en el.
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }

}

~~~

Cliente.java
~~~java
package domain;

import java.time.LocalDate;

public class Cliente extends Persona {
  private int idCliente;
  private static int contadorCliente;
  private LocalDate fechaRegistro;
  private boolean vip;

  public Cliente(LocalDate fechaRegistro, String nombre, char genero, int edad, String direccion, boolean vip) {
    /*
    es importante que la primer linea de un constructor que tiene padre pongamos
    "super" ya que siempre por detras del programa este corre super y si no lo
    definimos nosotros, se definira por default y generara conflicto en el 
    programa 
    */
    super(nombre, genero, edad, direccion);
    this.idCliente = contadorCliente;
    Cliente.contadorCliente++;
    this.fechaRegistro = fechaRegistro;
    this.vip = vip;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public LocalDate getFechaRegistro() {
    return fechaRegistro;
  }

  public void setFechaRegistro(LocalDate fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

  public boolean isVip() {
    return this.vip;
  }

  public void setVip(boolean vip) {
    this.vip = vip;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Cliente{");
    sb.append("idCliente=").append(idCliente);
    sb.append(", fechaRegistro=").append(fechaRegistro);
    sb.append(", vip=").append(vip);
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }

}

~~~

TestHerencia.java
~~~java
package test;

import java.time.LocalDate;

import domain.Cliente;
import domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
      Empleado empleado1 = new Empleado("juan", 5000.0);
      System.out.println(empleado1.toString());

      Cliente cliente1 = new Cliente(LocalDate.now(),"juanito", 'm', 34 , "por ahi", false);
      System.out.println(cliente1.toString());

      Cliente cliente2 = new Cliente(LocalDate.now(), "juanita", 'f', 27 , "por ahi", true);
      System.out.println(cliente2.toString());
    }
}

~~~

### 76.-
la sobrecarga de constructores es que tenemos diferentes constructores dependiendo de cuantos argumentos tiene el constructor 

~~~java
public Empleado(){
    Empleado.contadorEmpleado++;
  }

  public Empleado(String nombre, double sueldo) {
    /*con this(); podemos llamatr otros constructores dentro de 
     * este constructor, en este caso siempre queremos que se cuente 
     * uno más a el contador empleado por ende este llama al 
     * constructor vacio, es importante poner el this hasta el inicio del codigo 
     * pero para pasarle los atributos al padre se hace directamente sobre los
     * atributos, ya que estos son protected, ya que no podemos usar super 
     */
    this();
    this.nombre = nombre; //se puede hacer esto porque es protectted 
    this.idEmpelado = contadorEmpleado;
    this.sueldo = sueldo;
  }
~~~

### 77.-
Operaciones.java
~~~java
package operaciones;

public class Operaciones {
    public static int sumar(int a, int b){
      System.out.println("sumando con enteros");
      return a+b;
    }

    public static double sumar(double a, double b){
      System.out.println("sumando con doubles");
      return a+b;
    }
  }

~~~

TestOperaciones.java
~~~java
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
      //la sobrecarga de metodos es importante ya que depende de los parameytros que le 
      //vamos a meter y java decide cual queda mejor paea usarlo 
      var resultado = Operaciones.sumar(5, 3);

      var resultado1 = Operaciones.sumar(5.0, 0);

    }
}

~~~

### 79.-
~~~java
//si final se le pone a una variable esta ya no puede ser cambida
final int miVariable =10; //ya no puede ser cambiada

//esto hace que ya no pueda heredar hijos
//ya no se puede poner extends de este 
public final class Persona{
  //hace que ya no se pueda modificar el metodo, osease
  //que al heredarlo a una hija esta ya no puede sobreescribirlo
  public final void imprimir(){

  }
}
~~~

### 80.-
si hacemos un objeto con final pues ya no se le puede dar otro valor, podemos ca,biar sus propiedades con steres y geters pero no se le puede dar otra referencia 
~~~java
final Persona = new Persona();
~~~

### 81, 82, 83, 84, 85, 86.-
ARRAYS

TestArreglos.java
~~~java
package test;

public class TestArreglos {
  public static void main(String[] args) {
    //haciendo un array 
    int edades[] = new int[3];
    System.out.println(edades);

    //acceder a los elementos
    edades[0] = 4;

    //haciendo iteraciones 
    for (int i = 0; i < edades.length; i++) {
      System.out.println(edades[i]);
    }

    //como inicializar los lugares del array de una vez 
    String frutas[] = {"naranja", "platano", "uva"};
    for (int i = 0; i < frutas.length; i++) {
      System.out.println(frutas[i]);
    }
  }  
}

~~~

Persona.java
~~~java
package domain;

public class Persona {
  private String nombre;

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + '}';
  }

}

~~~

TestArreglosObject.java
~~~java
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
      //haciendo un array de objetos de tipo persona 
      Persona personas[] = new Persona[2];

      personas[0] = new Persona("juancho");
      personas[1] = new Persona("juanchita");

      //iterando en arrays de tipo object
      for (int i = 0; i < personas.length; i++) {
        System.out.println(personas[i].toString());
      }
    }
}

~~~

### 87, 88, 89, 90, 91.-
Persona.java
~~~java
package domain;

public class Persona {
  private String nombre;

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + '}';
  }

}

~~~

TestMatrices.java
~~~java
package test;

import domain.Persona;

public class TestMatrcies {
    public static void main(String[] args) {
      //crando una matriz 
      //3 renglones, 2 columnas 
      int edades[][] = new int[3][2];
      //cuando lo imprimimos se imprime un objeto y sale el 
      //lugar que ocupa en memoria 

      edades[0][0] = 5;
      edades[0][1] = 7;
      edades[1][0] = 8;
      edades[1][1] = 4;

      //ciclo con matrices
      for (int ren = 0; ren < edades.length; ren++) {
        //asi se le dice que queremos el largo de los renglones
        for (int col = 0; col < edades[ren].length; col++) {
          System.out.println(edades[ren][col]);
        }
      }

      //sintaxis simplificada
      String frutas[][] = {{"naranja", "limon"}, {"fresa", "zarzamoara"}};
      for (int i = 0; i < frutas.length; i++) {
        for (int j = 0; j < frutas[i].length; j++) {
          System.out.println(frutas[i][j]);
        }
      }

      imprimir(frutas);

      Persona personas[][] = new Persona[2][3];
      personas[0][0] = new Persona("juan");
      personas[0][1] = new Persona("Karla");

      imprimir(personas);
    }

    public static void imprimir(Object matriz[][]){
      System.out.println("imprimiendo una nueva matriz");
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
          System.out.println("lugar: [" + i + "][" + i + "] = " + matriz[i][j]);
        }
      }
    }
}
~~~

### 92.-
Explicacion del ejercicio que vamos a hacer ahora 

en los siguientes veremos el codigo que yo hice, parece ser una buena idea, pero no se como lo hace el maestro y como puedo mejorar mi codigo

Producto.java
~~~java
package orden;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
      idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
      this();
      this.nombre = nombre;
      this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
~~~

Orden.java
~~~java
package orden;

public class Orden {
  private final static int MAX_PRODUCTOS = 10;
  private int idOrden;
  private Producto productos[] = new Producto[MAX_PRODUCTOS];
  private static int contadorOrdenes;
  private int punteroOrden;   

  public Orden() {
    idOrden = ++contadorOrdenes;
    System.out.println("orden creada: "+idOrden);
  }
  
  public void agregarProducto(Producto producto){
    productos[punteroOrden] = producto;
    punteroOrden++;
  }

  public double calcularTotal(){
    double resultado = 0;
    for (int i = 0; i < productos.length; i++) {
      if (productos[i]!= null) {
        resultado += productos[i].getPrecio();
      }
    }
    return resultado;
  }

  public void mostrarOrden(){
    System.out.println("Productos              Precio");
    System.out.println("_____________________________");
    for (int i = 0; i < productos.length; i++) {
      if (productos[i]!=null) {
        System.out.println(productos[i].getNombre()+"         "+productos[i].getPrecio());
      }
    }
    System.out.println("_____________________________");
    System.out.println("Total:          "+this.calcularTotal());
  } 
}

~~~

VentasTest.java
~~~java
package test;

import orden.Orden;
import orden.Producto;

public class VentasTest {
  public static void main(String[] args) {
    Orden orden1 = new Orden();
    orden1.agregarProducto(new Producto("Jeans rectos Lavado medio", 88));
    orden1.agregarProducto(new Producto("Joggers con aplicacion del logo", 84));
    orden1.agregarProducto(new Producto("Chandal con icono clásico", 74));
    orden1.agregarProducto(new Producto("Jeans Super Slim Lavado oscuro", 88));
    orden1.agregarProducto(new Producto("Calcetines casual a rallas", 16));
    orden1.agregarProducto(new Producto("Calcetines casual", 16));

    orden1.mostrarOrden();
  }
}

~~~

### 93, 94, 95, 96, 97, 98.-
Producto.java
~~~java
package mx.com.gm.ventas;

public class Producto {
  //lo pone final porque una vez creada, ya no se va a 
  //volver a cambiar de valor 
  private final int idProducto;
  private String nombre;
  private double precio;
  private static int contadorProductos;

  private Producto() {
    idProducto = ++Producto.contadorProductos;
  }

  public Producto(String nombre, double precio) {
    this();
    this.nombre = nombre;
    this.precio = precio;
  }

  public int getIdProducto() {
      return idProducto;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public double getPrecio() {
      return precio;
  }

  public void setPrecio(double precio) {
      this.precio = precio;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Producto{");
      sb.append(", nombre=").append(nombre);
      sb.append(", precio=").append(precio);
      sb.append('}');
      return sb.toString();
  }
}

~~~

Orden.java
~~~java
package mx.com.gm.ventas;

public class Orden {
  private int idOrden;
  //dando solo el espacio en memoria
  //esto hace que su valor sea null porque aun no esta siendo inicializada
  //ni tampoco se le pueden meter valores
  private Producto productos[];
  private static int contadorOrdenes;
  private int punteroOrden;   
  private final static int MAX_PRODUCTOS = 10;

  public Orden() {
    this.idOrden = ++contadorOrdenes;
    //inicializando el array
    this.productos = new Producto[Orden.MAX_PRODUCTOS];
    System.out.println("orden creada: "+idOrden);
  }
  
  public void agregarProducto(Producto producto){
    if (this.punteroOrden < Orden.MAX_PRODUCTOS) {
      this.productos[this.punteroOrden++] = producto;
    }else{
      System.out.println("se ha sueprado el maximo de productos: "+punteroOrden);
    }
  }

  public double calcularTotal(){
    double resultado = 0;
    for (int i = 0; i < this.punteroOrden; i++) {
      resultado += this.productos[i].getPrecio();
    }
    return resultado;
  }

  public void mostrarOrden(){
    System.out.println("Productos de la orden ");
    for (int i = 0; i < this.punteroOrden; i++) {
      System.out.println(this.productos[i].toString());
    }
    System.out.println("Total: "+this.calcularTotal());
  } 
}

~~~

VentasTest.java
~~~java
package mx.com.gm.ventas.test;

//asi importamos todos los scripts que estan en la carpeta
import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
      Producto producto1 = new Producto("Casmisa", 50.00);
      Producto producto2 = new Producto("Pantalon", 100.00);

    Orden orden1 = new Orden();
    orden1.agregarProducto(producto1);
    orden1.agregarProducto(producto2);

    orden1.mostrarOrden();
  }
}

~~~

### 99.-
explicacion del siguiente ejercicio 

esta es mi version del ejemplo, despues se vera como se hizo con el profe 

DispositivoEntrada.java
~~~java
package com.gm.mundopc;

public class DispositivoEntrada {
  private String entrada;
  private String marca;

    public DispositivoEntrada(String entrada, String marca) {
        this.entrada = entrada;
        this.marca = marca;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{");
        sb.append("entrada=").append(entrada);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
}
~~~

Teclado.java
~~~java
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String entrada, String marca) {
        super(entrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
~~~

Raton.java
~~~java
package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
  private int idRaton;
  private static int contadorRatones;

    public Raton(String entrada, String marca) {
        super(entrada, marca);
        this.idRaton = ++Raton.contadorRatones; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
~~~

Monitor.java
~~~java
package com.gm.mundopc;

public class Monitor {
  private int idMonitor;
  private String marca;
  private double tamano;
  private static int contadorMonitores;

  private Monitor() {
    this.idMonitor = ++Monitor.contadorMonitores;
  }

  public Monitor(String marca, double tamano) {
    this();
    this.marca = marca;
    this.tamano = tamano;
  }

  public int getIdMonitor() {
    return idMonitor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getTamano() {
    return tamano;
  }

  public void setTamano(double tamano) {
    this.tamano = tamano;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Monitor{");
    sb.append("idMonitor=").append(idMonitor);
    sb.append(", marca=").append(marca);
    sb.append(", tamaño=").append(tamano);
    sb.append('}');
    return sb.toString();
  }
}
~~~

Computadora.java
~~~java
package com.gm.mundopc;

public class Computadora {
  private int idComputadora;
  private String nombre;
  private Monitor monitor;
  private Teclado teclado;
  private Raton raton;
  private static int contadorComputadoras;

  public Computadora() {
    this.idComputadora = ++Computadora.contadorComputadoras;
  }

  public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
    this();
    this.nombre = nombre;
    this.monitor = monitor;
    this.teclado = teclado;
    this.raton = raton;
  }

  public int getIdComputadora() {
    return idComputadora;
  }

  public void setIdComputadora(int idComputadora) {
    this.idComputadora = idComputadora;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }

  public Teclado getTeclado() {
    return teclado;
  }

  public void setTeclado(Teclado teclado) {
    this.teclado = teclado;
  }

  public Raton getRaton() {
    return raton;
  }

  public void setRaton(Raton raton) {
    this.raton = raton;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Computadora{");
    sb.append("idComputadora=").append(idComputadora);
    sb.append(", nombre=").append(nombre);
    sb.append(", monitor=").append(monitor);
    sb.append(", teclado=").append(teclado);
    sb.append(", raton=").append(raton);
    sb.append('}');
    return sb.toString();
  }
}
~~~

Orden.java
~~~java
package com.gm.mundopc;

public class Orden {
  private int idOrden;
  private Computadora computadoras[];
  private int contadorComputadoras;
  private static int contadorOrdenes;
  private static final int maxComputadoras = 10;

  public Orden(){
    this.idOrden = ++Orden.contadorOrdenes;
    this.computadoras = new Computadora[maxComputadoras];
  }

  public void agregarComputadora(Computadora computadora){
    if (contadorComputadoras < maxComputadoras) {
      computadoras[contadorComputadoras++] = computadora;
    }
  }

  public void mostrarOrden(){
    System.out.println("imprimiendo orden " + idOrden);
    for (int i = 0; i < contadorComputadoras; i++) {
      System.out.println(computadoras[i].toString());
    }
  }

  public int getIdOrden() {
    return idOrden;
  }
}
~~~

MundoPC.java
~~~java
package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
      Monitor monitoHP = new Monitor("HP", 13);
      Teclado tecladoHP = new Teclado("bluetooth", "HP");
      Raton ratonHP = new Raton("bluetooth", "Hp");
      Computadora computadoraHP = new Computadora("ComputadoraHP", monitoHP, tecladoHP, ratonHP);

      Monitor monitoGamer = new Monitor("Gamer", 13);
      Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
      Raton ratonGamer = new Raton("bluetooth", "Gamer");
      Computadora computadoraGamer = new Computadora("ComputadoraGamer", monitoGamer, tecladoGamer, ratonGamer);

      Orden orden1 = new Orden();
      orden1.agregarComputadora(computadoraHP);
      orden1.agregarComputadora(computadoraGamer);

      orden1.mostrarOrden();
    }
}
~~~

### 100, 101, 102, 103, 104.-
DispositivoEntrada.java
~~~java
package mx.com.gm.mundopc;

public class DispositivoEntrada {
  private String entrada;
  private String marca;

  public DispositivoEntrada(String entrada, String marca) {
    this.entrada = entrada;
    this.marca = marca;
  }

  public String getEntrada() {
    return this.entrada;
  }

  public void setEntrada(String entrada) {
    this.entrada = entrada;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("DispositivoEntrada{");
    sb.append("entrada=").append(entrada);
    sb.append(", marca=").append(marca);
    sb.append('}');
    return sb.toString();
  }
}
~~~

Teclado.java
~~~java
package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
  private final int idTeclado;
  private static int contadorTeclados;

  public Teclado(String entrada, String marca) {
    super(entrada, marca);
    this.idTeclado = ++Teclado.contadorTeclados;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Teclado{");
    sb.append("idTeclado=").append(idTeclado);
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
~~~

Raton.java
~~~java
package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {
  private final int idRaton;
  private static int contadorRatones;

  public Raton(String entrada, String marca) {
    super(entrada, marca);
    this.idRaton = ++Raton.contadorRatones;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Raton{");
    sb.append("idRaton=").append(idRaton);
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
~~~

Monitor.java
~~~java
package mx.com.gm.mundopc;

public class Monitor {
  private final int idMonitor;
  private String marca;
  private double tamano;
  private static int contadorMonitores;

  private Monitor() {
    this.idMonitor = ++Monitor.contadorMonitores;
  }

  public Monitor(String marca, double tamano) {
    this();
    this.marca = marca;
    this.tamano = tamano;
  }

  public int getIdMonitor() {
    return idMonitor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getTamano() {
    return tamano;
  }

  public void setTamano(double tamano) {
    this.tamano = tamano;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Monitor{");
    sb.append("idMonitor=").append(idMonitor);
    sb.append(", marca=").append(marca);
    sb.append(", tamaño=").append(tamano);
    sb.append('}');
    return sb.toString();
  }
}
~~~

Computadora.java
~~~java
package mx.com.gm.mundopc;

public class Computadora {
  private final int idComputadora;
  private String nombre;
  private Monitor monitor;
  private Teclado teclado;
  private Raton raton;
  private static int contadorComputadoras;

  private Computadora() {
    this.idComputadora = ++Computadora.contadorComputadoras;
  }

  public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
    this();
    this.nombre = nombre;
    this.monitor = monitor;
    this.teclado = teclado;
    this.raton = raton;
  }

  public int getIdComputadora() {
    return idComputadora;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }

  public Teclado getTeclado() {
    return teclado;
  }

  public void setTeclado(Teclado teclado) {
    this.teclado = teclado;
  }

  public Raton getRaton() {
    return raton;
  }

  public void setRaton(Raton raton) {
    this.raton = raton;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Computadora{");
    sb.append("idComputadora=").append(idComputadora);
    sb.append(", nombre=").append(nombre);
    sb.append(", monitor=").append(monitor);
    sb.append(", teclado=").append(teclado);
    sb.append(", raton=").append(raton);
    sb.append('}');
    return sb.toString();
  }
}
~~~

Orden.java
~~~java
package mx.com.gm.mundopc;

public class Orden {
  private final int idOrden;
  private Computadora computadoras[];
  private static int contadorOrdenes;
  private static final int maxComputadoras = 10;
  private int contadorComputadoras;

  public Orden() {
    this.idOrden = ++Orden.contadorOrdenes;
    this.computadoras = new Computadora[Orden.maxComputadoras];
  }

  public void agregarComputadora(Computadora computadora) {
    if (this.contadorComputadoras < Orden.maxComputadoras) {
      this.computadoras[this.contadorComputadoras++] = computadora;
    }else{
      System.out.println("has superado el limite: " + Orden.maxComputadoras);
    }
  }

  public void mostrarOrden() {
    System.out.println("imprimiendo orden " + idOrden);
    for (int i = 0; i < this.contadorComputadoras; i++) {
      System.out.println(this.computadoras[i].toString());
    }
  }
}
~~~

MundoPC.java
~~~java
package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPc {
  public static void main(String[] args) {
    Monitor monitoHP = new Monitor("HP", 13);
    Teclado tecladoHP = new Teclado("bluetooth", "HP");
    Raton ratonHP = new Raton("bluetooth", "Hp");
    Computadora computadoraHP = new Computadora("ComputadoraHP", monitoHP, tecladoHP, ratonHP);

    Monitor monitoGamer = new Monitor("Gamer", 13);
    Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
    Raton ratonGamer = new Raton("bluetooth", "Gamer");
    Computadora computadoraGamer = new Computadora("ComputadoraGamer", monitoGamer, tecladoGamer, ratonGamer);

    Orden orden1 = new Orden();
    orden1.agregarComputadora(computadoraHP);
    orden1.agregarComputadora(computadoraGamer);

    orden1.mostrarOrden();
  }
}
~~~

### 105.-
~~~java
package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
      imprimirNumeros(3,4,5,6);
      imprimirNumeros(2,4);
      imprimirNumeros(9,8,7,5,4,3,2,1,0);

      variosParametros("juan", 2,3,4,5,5,2,2);
    }

    //los argumentos variables siempre deben ser los ultimos 
    private static void variosParametros(String nombre, int... numeros){
      System.out.println("nombre: " + nombre);
      imprimirNumeros(numeros);
    }

    //con los "..." decimos que los datos de entrada seran variables
    //si se le pone un arreglo, ya se debe saber cuantos elementos se le 
    //mandaran
    //se dice que no tenemos argumentos definidos o argumentos variables
    private static void imprimirNumeros(int... numeros){
      for (int i = 0; i < numeros.length; i++) {
        System.out.println("elementos: "+numeros[i]);
      }
    }
}

~~~

### 106, 107, 108.-
ENUMERACIONES 

Dias.java
~~~java
package enumeracion;

//se le tiene que cambiar el clase por el enum
public enum Dias {
  //por default son strings
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;
}

~~~

Continentes.java
~~~java
package enumeracion;

public enum Continentes {
  //puede tener más elementos que entran a los enumerados 
    AFRICA(53), //en los () van el numero paises que tienen
    EUROPA(46), 
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int paises;

    Continentes(int paises){
      this.paises = paises;
    }

    public int getPaises(){
      return this.paises;
    }
}

~~~

TestEnumeraciones.java
~~~java
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
  public static void main(String[] args) {
    System.out.println("Dia 1: " + Dias.LUNES);
    indicarDiaSemana(Dias.LUNES);

    System.out.println("================================");

    System.out.println("Continente no 4:" + Continentes.AMERICA);
    System.out.println("No. Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
    System.out.println("================================");
    System.out.println("Continente no 1:" + Continentes.AFRICA);
    System.out.println("No. Paises en el 4to continente: " + Continentes.AFRICA.getPaises());

  }

  //usando un enum en un metodo switch 
  private static void indicarDiaSemana(Dias dias) {
    switch (dias) {
      case LUNES:
        System.out.println("Primer dia de la semana");
        break;
      case MARTES:
        System.out.println("Segundo dia de la semana");                                        
        break;
      case MIERCOLES:
        System.out.println("Tercer dia de la semana");
        break;
      case JUEVES:  
        System.out.println("Cuarto dia de la semana");
        break;
      case VIERNES:
        System.out.println("Quinto dia de la semana");
        break;
      case SABADO:
        System.out.println("Sexto dia de la semana");
        break;
      case DOMINGO:
        System.out.println("Septimo dia de la semana");
        break;
      default:
        break;
    }
  }
}

~~~

### 109, 110.-
Manejo de Bloques de codigo de inicializacion de las clases

Persona.java
~~~java
package domain;

public class Persona {
  //tenemos bloques estaticos y no estaticos 
    private final int idPersona; //no estatica
    private static int contadorPersonas; //estatico

    //bloque de inicializacion estatico
    //este corre antes que el constructor
    //y antes de cualquier bloque no estatico
    static{ 
      System.out.println("ejecucion bloque estatico");
      ++Persona.contadorPersonas;
      //en los bloques estaticos solo se pueden inicializar estaticos

      //este solo se corre una sola vez para todas las clases
    }

    //los {} vacios es un bloque de inicializacion no estatico
    //y se ejecuta antes que nuestro constructor pero despues de 
    //los bloques estaticos 
    {
      //tambien se le conoce como contexto dinamico
      System.out.println("ejecucion de bloque no estatico");
      //aqui si podemos usar el this
      this.idPersona = contadorPersonas++;

      //este bloque siempre se corre cuando creamos una de estas clases
    }

    public Persona(){
      System.out.println("ejecucion en el constructor");
    }

    public int getIdPersona() {
      return idPersona;
    }
}

~~~

TestBloquesInicializacion.java
~~~java
package test;

import domain.Persona;

public class TestBloquesInicializacion {
    public static void main(String[] args) {
      Persona persona1 = new Persona();
      System.out.println(persona1);
      //primero se crea el bloque estatico, luego el bloque no estatico
      //luego el constructor

      Persona persona2 = new Persona();
      System.out.println(persona2);
      //ahora ya no se ejecuta el bloque estatico, ya que este solo se 
      //corre una sola vez por clase
    }
}

~~~

### 111.-
CICLO FOREACH

persona.java
~~~java
package domain;


public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
}

~~~

TestForEach.java
~~~java
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
      int edades[] = {5,6,8,4};
      //usando el cilco for each
      for (int edad : edades) {
        System.out.println(edad);
      }

      Persona personas[] = {new Persona("juan"), new Persona("Agustin"), new Persona("Karla")};
      for (Persona persona : personas) {
        System.out.println(persona.toString());
      }
    }
}
~~~

### 113.-
AUTOBOXING Y UNBOXING en java 

TestAutoBoxingUnboxing.java
~~~java
package test;

public class TestAutoboxingUnboxing {
  public static void main(String[] args) {
    //clases envolventes de tipos primitivos
    /*
     * int - Integer
     * long - Long
     * float - Float
     * double - Double
     * boolean - Boolean
     * byte - Byte
     * char - Character
     * short - Short
     */
    //los primitivos solo gaurdan valores mientras que los 
    //envolventes guardan metodos
    //si no se hacen tantos calculos se puede usar tipos objet (envolventes)

    Integer entero = 10; //auto boxing
    System.out.println("entero =" + entero); // esto es un valor int
    System.out.println("entero = " + entero.toString()); //y esto es un string
    //pero agarramos el string desde la clase objeto y asi con los demas valores
    System.out.println("entero = " + entero.doubleValue()); //metodo para cambiar a double

    int entero2 = entero; //unboxing porque ya no es un objeto
    System.out.println(entero2);
  }
}
~~~

### 114, 115.-
MODIFICADORES DE ACCESO

los niveles de restriccion son:
Public (menos restrictivo)
protected
default
private (mas restrictivo)

Clase1.java
~~~java
package paquete1;

public class Clase1 {
    public String atributoPublico = "atributo publico";
    protected String atributoProtected = "atributo protected";

    public Clase1(){
      System.out.println("constructor publico");
    }

    protected Clase1(String pro){
      System.out.println("constructor protected");
    }

    public void metodoProtected(){
      System.out.println("metodo protected");
    }

    public void metodoPublico(){
      System.out.println("metodo publico");
    }
}
~~~

ClaseHija.java
~~~java
package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1{
    public ClaseHija(){
      //desde una clase hija podemos hacer uso de los constructores
      //protegidos asi como sus variables protegidas 
      super("hola");
      System.out.println(this.atributoProtected);
      this.metodoProtected();
    }
}

~~~

TestModificadoresAcceso.java
~~~java
package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
      //se puede hacer una instancia de un objeto publico, sin ningun problema 
      //tambien haciendo uso de un constructor publico 
      Clase1 clase1 = new Clase1();
      System.out.println("clase1 = " + clase1);

      //podemos accesar al atributo publico de una clase sin ningun problema
      //tambien podemos cambiar el valor de este sin un seter
      System.out.println(clase1.atributoPublico);

      //con los portecteds no podemos llamarlos, son como si fueran 
      //privates, solo los pueden usar las clases que heredan de ellos
      Clase1 clase2 = new Clase1();
      //tampoco podemos hacer uso de el atributo protegido 
      System.out.println(clase2);
      
      ClaseHija clasehija1 = new ClaseHija();
      System.out.println(clasehija1);
    }
}

~~~
### 116.-
MODIFICADORES DE ACCESO

si tuvieramos una clase con atributo default esta no puede ser accesada ni puede heredar de otras clases que no esten dentro del mismo paquete (que esten en la misma carpeta), no asi como los que tienen el atributo protected

Clase1.java
~~~java
package paquete1;

//para poner que una clase es default solo no se le pone nada 
class Clase1 {
    String atributoDefault = "atributo Default";

    Clase1(){
      System.out.println("constructor Default");
    }

    void metodoDefault(){
      System.out.println("metodo Default");
    }
}

~~~

ClaseHija.java
~~~java
package paquete1;

public class ClaseHija extends Clase1{
    public ClaseHija(){
      //la clase hija siempre puede hacer uso de las 
      //cosas del padre siempre que se necuentre en el mismo paquete 
      super();
      System.out.println(this.atributoDefault);
      this.metodoDefault();
    }
}
~~~

TestModificadoresAcceso.java
~~~java
package paquete1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
      //ya podemos hacer objetos de esta clase siempre y cuando nos encontremos
      //en el mismo pauquete que el que tiene default 
      Clase1 clase1 = new Clase1();

      //podemos cambiar un atributo default, siempre que estemos en el
      //mismo paquete 
      clase1.atributoDefault = "cambiando el atributo default";

      //tambien se puede utilizar los metodos default 
      clase1.metodoDefault();
    }
}
~~~

### 117.-
MODIFICADORES DE ACCESO

Clase1.java
~~~java
package paquete1;

//no podemos poner una clase privada 
class Clase1 {
    private String atributoDefault = "atributo Privado";

    private Clase1(){
      System.out.println("constructor Privado");
    }


    //debemos hacer un cosntructor publcio, porque si no las clases hijas no pdoran 
    //instanciar el objeto padre que es lo quer le da toda la base 
    public Clase1(String argumento){
      this();
      System.out.println("Constructor publico");
    }

    //y el metodo privado solo podra ser usado en esta clase y por nadie más 
    private void metodoPrivado(){
      System.out.println("metodo Privado");
    }
}
~~~

ClaseHija.java
~~~java
package paquete1;

public class ClaseHija extends Clase1{
    public ClaseHija(){
      //ya no podemos hacer uso de nada de la clase 
      //porque es privado y aunque sea hija de esta clase1 
      super("argumento");
    }
}

~~~

TestModificadoresAcceso.java
~~~java
package paquete1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
      //ahora debemos usar el cosntructor publcio, porque el privado 
      //no podemos accedera a el 
      Clase1 clase1 = new Clase1("argumento");
      //y tampoco podemos modificar sus atributos, a menos que se haga por
      //seters o geters 

      System.out.println(clase1);
    }
}

~~~

### 118, 119.-
SOBREESCRITURA DE METODOS

Empleado.java
~~~java
package domain;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obetenerDetalles(){
      return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
~~~

Gerente.java
~~~java
package domain;

public class Gerente extends Empleado {

  private String departamento;

  public Gerente(String nombre, double sueldo, String departamento) {
    super(nombre, sueldo);
    this.departamento = departamento;
  }

  //sobreescribiendo un metodo que se pueda usar solo en este tipo de clases
  //al ser llamado desde el padre dara otro resultado
  @Override
  public String obetenerDetalles(){
    return super.obetenerDetalles() + ", departamento: " + departamento;
  }
}
~~~

TestSobreescritura.java
~~~java
package test;

import domain.Gerente;

public class TestSobreescritura {
  public static void main(String[] args) {
    Gerente gerente1 = new Gerente("juan", 3000, "ventas");
    System.out.println(gerente1.obetenerDetalles());
  }
}
~~~

### 120, 121.-
POLIMORFISMO (multiples comportamientos)

Empleado.java
~~~java
package domain;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obetenerDetalles(){
      return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
~~~

Gerente.java
~~~java
package domain;

public class Gerente extends Empleado {

  private String departamento;

  public Gerente(String nombre, double sueldo, String departamento) {
    super(nombre, sueldo);
    this.departamento = departamento;
  }

  @Override
  public String obetenerDetalles(){
    return super.obetenerDetalles() + ", departamento: " + departamento;
  }
}
~~~

TestSobreescritura.java
~~~java
package test;

import domain.*;

public class TestSobreescritura {
  public static void main(String[] args) {
    Empleado empleado = new Empleado("juan", 500);
    //System.out.println(empleado.obetenerDetalles());
    imprimir(empleado);

    Gerente gerente = new Gerente("karla", 1000, "Contabilidad");
    //System.out.println(gerente.obetenerDetalles());
    imprimir(gerente);
  }

  //esto es polimorfismo proque al entrar una clase empleado hace lo que se espera
  //pero al entrar un tipo gerente hace que se imprima obtener detalles, pero este no es 
  //de clase empleado, extiende de ella, pero no lo es, por ende podemos tener metodos 
  //sobreescritos que tendran diferentes comportamientos dependeiendo de si son hijos de 
  //una clase base 
  //mas tecnicamente depende de donde apunte en memoria y de que tipo sea este hara cosas
  //diferetes 
  public static void imprimir(Empleado empleado){
    System.out.println(empleado.obetenerDetalles());
  }
}

~~~

### 122, 123.-
se ocupan archivos Empelado.java y Gerente.java, pero esos ya estan ariba 

TestInstanceOf.java
~~~java
package test;

import domain.*;

public class TestInstanceOf {
  public static void main(String[] args) {
    Empleado empleado = new Empleado("juan", 500);
    empleado = new Gerente("karla", 1000, "Contabilidad");
    determinarTipo(empleado);
  }

  public static void determinarTipo(Empleado empleado){
    //esta apuntando en memoria a un tipo gerente 
    if (empleado instanceof Gerente) {
      //hacemos instance of para saber si podemos hacer los cambios o casteos
      //de manera segura 
      System.out.println("Es de tipo gerente");
      //como nosotros metemos un tipo padre (empleado) lo volvemos hijo (gerente)
      Gerente gerente = (Gerente)empleado;
      System.out.println(gerente.getDepartamento());
      
    }else if (empleado instanceof Empleado) {
      System.out.println("Es de tipo empleado");
      //ya que si hacemos esto va a saltar error porque es un padre que se covierte hijo
      Gerente gerente = (Gerente)empleado;
      System.out.println(gerente.getDepartamento());
    }else if (empleado instanceof Object){
      System.out.println("Es de tipo Object");
    }
  }
}
~~~

### 124, 125.-
CONVERSION DE OBJETOS

cambiar de un hijo a un padre se le llama Upcasting e ir de un padre a un hijo se le llama Downcasting 

Empleados.java
~~~java
package domain;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obetenerDetalles(){
      return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombre=").append(nombre);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
}
~~~

Gerente.java
~~~java
package domain;

public class Gerente extends Empleado {

  private String departamento;

  public Gerente(String nombre, double sueldo, String departamento) {
    super(nombre, sueldo);
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  @Override
  public String obetenerDetalles() {
    return super.obetenerDetalles() + ", departamento: " + departamento;
  }
}
~~~

Escritor.java
~~~java
package domain;

public class Escritor extends Empleado {
  final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
  
    @Override
    public String obetenerDetalles(){
      return super.obetenerDetalles() + ", tipoEscritura: " + this.tipoEscritura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escritor{");
        sb.append("tipoEscritura=").append(tipoEscritura);
        sb.append(", empleado=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    public TipoEscritura getTipoEscritura(){
      return this.tipoEscritura;
    }
}
~~~

TipoEscritura.java
~~~java
package domain;

public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");

    private final String descripcion;

    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
      return this.descripcion;
    }
}
~~~

TestConversionObjetos.java
~~~java
package test;

import domain.*;

public class tesrConversionObjetos {
    public static void main(String[] args) {
      Empleado empleado;

      empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);

      //por el polimorfismo como apunta a un espacio en memoria que e shijo ejecuta 
      //el metodo de hijo ya que es lo mas exterior posible
      System.out.println(empleado.obetenerDetalles());

      //pero como empezamos partiendo de un objeto padre no podemos hacer uso de 
      //los metodos especiales del hijo, por ende debemos castearlo para que los pueda usar 
      //DOWNCASTING
      //asi:
      //((Escritor)empleado).getTipoEscritura();
      //o asi haciendo una variable de tipo escritor
      Escritor escritor = (Escritor)empleado;
      escritor.getTipoEscritura();

      //aqui la variable de tipo Empleado la apuntamos a un tipo hijo sin problemas
      //y podemos hace uso de los metodos del padre
      //UPCASTING
      Empleado empleado2 = escritor;
      System.out.println(empleado2.obetenerDetalles());
      
    }
}
~~~

### 126, 127.-
COMPARANDO LOS VALORES POR REFERENCIA Y POR CONTENIDO

Empleado.java
~~~java
package domain;

import java.util.Objects;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obetenerDetalles(){
      return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombre=").append(nombre);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }

    //con este codigo se intenta sacar un numero entero del calculo de los parametris
    //que tenemos dentro de la clase para ver sis u contenido es "igual" a otro
    //intenta generar un entero unico, lo mas unico posible 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    //todo esto es más paso por paso el contenido de las objetos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
}
~~~

TestClaseObject.java
~~~java
package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
      Empleado empleado1 = new Empleado("Juan", 500);
      Empleado empleado2 = new Empleado("Juan", 500);

      //esto dice que tienen diferente referencia en memoria
      if(empleado1 == empleado2){
        System.out.println("Tienen la misma referencia en memoria");
      }else{
        System.out.println("Tienen diferente referencia en memoria");
      }

      //usando equals
      if (empleado1.equals(empleado2)) {
        System.out.println("Los objetos sonn iguales en contenido");
      }else{
        System.out.println("Los objetos son iguales en contenido");
      }

      if (empleado1.hashCode() == empleado2.hashCode()) {
        System.out.println("El valor hashcode es igual"); 
      }else{
        System.out.println("El valor hashcode es distinto");
      }
    }
}
~~~

### 128, 129.-
CLASES ABSTRACTAS

FiguraGeometrica.java
~~~java
package domain;

//la clase debe ser abstact aunque sea que uno solo de sus metodos sea abstracto
public abstract class FiguraGeometrica {
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura){
      this.tipoFigura = tipoFigura;
    }

    //los metodos abstactos no necesitan definir los metodos 
    //solo los crean para que sus hijos los usen y los hijos
    //son los que implementan los metodos en sus propios codigos
    public abstract void dibujar();
}
~~~

Rectangulo.java
~~~java
package domain;

public class Rectangulo extends FiguraGeometrica{
    
  public Rectangulo(String tipoFigura){
    super(tipoFigura);
  }

  //no lo estamos sobreescribiendo, lo implementamos por primera vez
  //porque el padre lo pone, pero no lo define
  @Override 
  public void dibujar(){
    System.out.println("se imprime un: " + this.getClass().getSimpleName());
  }
}
~~~

TestClasesAbstractas.java
~~~java
package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
      //no se pueden utilizar o crear las clases padre si son abstractas

      //aunque no se puede crear una variable de tipo Figura con el new
      //se puede usar la base para poder hacer polimorfismo
      FiguraGeometrica figura = new Rectangulo("Rectangulo");
      figura.dibujar();
    }
}
~~~
### 130, 131, 132, 133.-
las interfaces se parecen a las clases abstractas ya que no tienen una implementacion, pero no dependen de la herencia, más bien a se relacionan mediante la similitud en sus comportamientos o en su funcionamiento de sus metodos, y los atributos de las interfaces son constantes 

IAccesoDatos.java
~~~java
package accesodatos;

public interface IAccesoDatos {
  //las clases son las que integran las interfaces 

  //las interfaecs no tienen constructores y los metodos deben 
  //ser publicos y abstractos
    int MAX_REDISTRO = 10;

    void insertar();

    void listar();

    void actualizar();

    void analizar();
}
~~~

ImplementacionMySql.java
~~~java
package accesodatos;

//obligamos a que las clases implementen los metodos que tienen 
//las interfaces 
public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void analizar() {
        System.out.println("Analizar desde Mysql");
    }
}
~~~

ImplementacionOracle.java
~~~java
package accesodatos;

public class ImplementacionOracle implements IAccesoDatos{

  @Override
  public void insertar() {
      System.out.println("Insertar desde Oracle");
  }

  @Override
  public void listar() {
      System.out.println("Listar desde Oracle");
  }

  @Override
  public void actualizar() {
      System.out.println("Actualizar desde Oracle");
  }

  @Override
  public void analizar() {
      System.out.println("Analizar desde Oracle");
  }
}
~~~

TestInterface.java
~~~java
package test;

import accesodatos.*;

public class TestInterface {
    public static void main(String[] args) {
      //podemos hacer una variable interface que apunta a una
      //clase que implementa esa interface 
      IAccesoDatos datos = new ImplementacionMySql();
      imprimir(datos);

      //y luego la variable interface de tipo IAccesoDatos puede apuntar
      //a un nuevo objeto que la implemente siendo asi que podemos darle 
      //ahora la ImpementacionOracle
      datos = new ImplementacionOracle();
      imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos){
      datos.listar();
      datos.actualizar();
      datos.analizar();
      datos.insertar();
    }
}
~~~

### 134, 135.-
JAVABEANS

Persona.java
~~~java
package domain;

import java.io.Serializable;

//todo esto es necesario para que cumpla la norma de ser un "JavaBean"
//siendo lo primero que implemente Serializable s
public class Persona implements Serializable {
  // las variables deben ser privadas
  private String nombre;
  private String apellido;

  // se debe agregar un constructor vacio publico
  public Persona() {
  }

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  // tener get y set para cada atributo de la clase
  // JavaBeans trabaja con encapsulamiento entonces
  // atributos privados con seters y geters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  // equal, hashcode y to string ya es opcional

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
  }
}
~~~

TestJavaBeans
~~~java
package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
      Persona persona = new Persona();

      //como no se sabe cuantos constructores tiene pues
      //se crea un nuevo objeto vacio y lo inicializamos con sus seters
      persona.setNombre("Juan");
      persona.setApellido("Perez");

      System.out.println(persona);
    }
}
~~~

### 136, 137, 138, 139, 140, 141.-
EXCEPCIONES O ERRORES

OperacionExcepcion.java
~~~java
package excepcion;

//creando nuestra propia excepcion 
public class OperacionExcepcion extends Exception{
    public OperacionExcepcion(String mensaje){
      super(mensaje);
    }
}

~~~

Aritmetica.java
~~~java
package aritmetica;

import excepcion.OperacionExcepcion;

public class Aritmetica {
  //throws indica que este metodo puede arrojar una excepcion 
  //pero si OperacionExcepcion extiende de RuntimeExeption no es necesario
  //que se ponga el throws OperacionExcepcion 
   public static int division(int numerador, int denominador) throws OperacionExcepcion{
      if (denominador == 0) {
        //arrojar execpcion
        throw new OperacionExcepcion("Division entre cero");
      }

      return numerador/denominador;
   } 
}
~~~

TestExcepciones.java
~~~java
package test;

import aritmetica.Aritmetica;
import excepcion.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
      int resultado = 0;

      //las excepciones se hacen para que el codigo no pare 
      //abrutamente si no que podemos "controlar" los errores que 
      //nos marca el codigo de una manera organizada 

      //y si OperacionExtencion extiende de RuntimeException no es necesario
      //poner el try catch
      try{
        resultado = Aritmetica.division(10, 0);
        //capturando la excepcion

        //se pueden obtener varios errores de una sentencia try catch 
      }catch(OperacionExcepcion e){
        System.out.println("Ocurrio un error de ripo OperacionExcepcion");
        System.out.println(e.getMessage());
      }
      catch(Exception e){
        //imprimiendo la pila de excepciones
        System.out.println("Ocurrio un error");
        e.printStackTrace(System.out);
      }
      finally{
        //el bloque finaly siempre se va a lanzar, haya una excepcion 
        //o no la haya 
        System.out.println("se reviso la divicion entre 0");
      }
      System.out.println("resultado = " + resultado);

      //lo mejor seria siempre extender de runtimeException, ya que queda más
      //limpio el codigo 
    }
}
~~~


### 142, 143, 144, 145-

TestColecciones.java
~~~java
package test;

import java.util.*;

public class TestColecciones {
  public static void main(String[] args) {
    // las listas pueden crecer dinamicamente
    // esta mantiene el orden de como van entrando los elementos
    // y se pueden duplicar los elementos que entran a la lista
    List<String> miLista = new ArrayList<>();
    miLista.add("Lunes");
    miLista.add("Martes");
    miLista.add("Miercoles");
    miLista.add("Jueves");
    miLista.add("Viernes");

    for (Object elemento : miLista) {
      System.out.println(elemento);
    }

    // tambien se pueden usar funciones lamda o funciones flecha
    miLista.forEach(elemento -> {
      System.out.println("elemento: " + elemento);
    });

    // los sets tambien se le puedne meter muchos elementos
    // y van creciendo de forma dinamica, pero este no guarda los
    // lugares en los que se fueron metiendo, pero es más rapido para guardar y
    // usar los elementos dentro de este y tambien este no acepta que se repitan
    // elementos
    // dentro de el
    Set<String> miSet = new HashSet<>();
    miSet.add("Lunes");
    miSet.add("Martes");
    miSet.add("Miercoles");
    miSet.add("Jueves");
    miSet.add("Viernes");

    imprimir(miSet);

    Map<String, String> miMapa = new HashMap<>();

    miMapa.put("valor1", "Juan");
    miMapa.put("valor2", "Karla");
    miMapa.put("valor3", "Rosario");
    
    //asi se recupera una llave 
    String elemento = miMapa.get("valor1");
    System.out.println(elemento);

    //imprimiendo todos los elementos del mapa 
    imprimir(miMapa.keySet()); //se imprimen las llaves
    imprimir(miMapa.values()); //se impirmen los valores 

  }

  public static void imprimir(Collection coleccion) {
    for (Object elemento : coleccion) {
      System.out.println(elemento);
    }
  }
}
~~~

### 146, 147.-
DATOS GENERICOS 

ClaseGenerica.java
~~~java
package genericos;

//definciendo una clase generica
public class ClaseGenerica<T>{
    
  T objeto;

  public ClaseGenerica(T objeto){
    this.objeto = objeto;
  }

  public void obtenerTipo(){
    System.out.println("El tipo T es: "+objeto.getClass().getSimpleName());
  }
}
~~~

TestGenerics
~~~java
package test;

import genericos.ClaseGenerica;

public class TestGeberics {
  public static void main(String[] args) {
    ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15);
    objetoInt.obtenerTipo();

    ClaseGenerica<String> objetoString = new ClaseGenerica<String>("juan");
    objetoString.obtenerTipo();
  }  
}
~~~

### 148, 149.-
pues las clases genericas parece ser que ya no queiren ser genericos por ende como yo lo escribi la primera vez es correcto

TestCoeleccionesGenericas
~~~java
package test;

import java.util.*;

public class TestColeccionesGenericas {
  public static void main(String[] args) {
    List<String> miLista = new ArrayList<>(); //lo mejor es poner que sea tipo string
    miLista.add("Lunes");
    miLista.add("Martes");
    miLista.add("Miercoles");
    miLista.add("Jueves");
    miLista.add("Viernes");

    for (Object elemento : miLista) {
      System.out.println(elemento);
    }

    miLista.forEach(elemento -> {
      System.out.println("elemento: " + elemento);
    });

    Set<String> miSet = new HashSet<>();
    miSet.add("Lunes");
    miSet.add("Martes");
    miSet.add("Miercoles");
    miSet.add("Jueves");
    miSet.add("Viernes");

    imprimir(miSet);

    Map<String, String> miMapa = new HashMap<>();

    miMapa.put("valor1", "Juan");
    miMapa.put("valor2", "Karla");
    miMapa.put("valor3", "Rosario");
    
    String elemento = miMapa.get("valor1");
    System.out.println(elemento);
 
    imprimir(miMapa.keySet()); 
    imprimir(miMapa.values()); 

  }

  //se le pone string para que no sea tan dificl hacer la conversion de
  //objeto a string 
  public static void imprimir(Collection<String> coleccion) {
    for (Object elemento : coleccion) {
      System.out.println(elemento);
    }
  }
}
~~~

### 150, 151, 152, 153, 154.-
MANEJO DE ARCHIVOS, CREACION Y ECSRITURA

ManejoArchivos.java
~~~java
package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
      File archivo = new File(nombreArchivo); //guardando el archivo en la memoria 
      try {
        PrintWriter salida = new PrintWriter(archivo);
        salida.close(); // cuando cerramos este bloque de codigo 
        //es cuando realmente se crea el archivo y se guarda
        System.out.println("Se ha creado el archivo ");
      } catch (FileNotFoundException e) {
        e.printStackTrace(System.out);
      }
    }

    public static void escirbirArchivo(String nombreArchivo, String contenido){
      File archivo = new File(nombreArchivo);  
      try {
        PrintWriter salida = new PrintWriter(archivo);
        //mandamos nuestra cadena a que se escriba en el archivo que acabamos de crear 
        salida.println(contenido);
        salida.close(); 
        System.out.println("Se ha escrito al archivo ");
      } catch (FileNotFoundException e) {
        e.printStackTrace(System.out);
      }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido){
      File archivo = new File(nombreArchivo);  
      try {
        //con el true de este codigo decimos que se va a hacer append en el codigo
        PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
        salida.println(contenido);
        salida.close(); 
        System.out.println("Se ha anexado informacion al archivo ");
      } catch (FileNotFoundException e) {
        e.printStackTrace(System.out);
      } catch (IOException ex) {
        ex.printStackTrace(System.out);
      }
    }

    public static void leerArchivo(String nombreArchivo){
      var archivo = new File(nombreArchivo);
        try {
            //leer lineas completas del archivo
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine(); //este codigo solo lee una linea de lectura
            //por enede se utiliza un ciclo while apra que se pueda leer todo el texto
            while (lectura != null) {
              System.out.println("lectura = " + lectura);
              lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
        } catch (IOException ex) {
          ex.printStackTrace(System.out);
        }
    }
}

~~~

TestManejoArchivos.java
~~~java
package test;

import manejoarchivos.ManejoArchivos;

public class TestManejoArchivos {
    public static void main(String[] args) {
      //el archivo se crea en la raiz de nuestro proyecto, ahi
      //aparece el archivo prueba.txt
      var nombreArchivo = "prueba.txt";
      //cuando hice el curso ajecute la linea que estaba abajoi una vez
      //y para despues de corre el progrma ya no 
      //ManejoArchivos.crearArchivo(nombreArchivo);

      //si llamamos a la misma linea nuestro texto se esta sobreescribiendo, pero si 
      //la llamamos una vez, hacemos que escriba en el archivo
      ManejoArchivos.escirbirArchivo(nombreArchivo, "Hola desde java");


      //esto hace un append a lo que ya teniamos escrito en nuestro archivo 
      ManejoArchivos.anexarArchivo(nombreArchivo, "adios");
      ManejoArchivos.anexarArchivo(nombreArchivo, "hola de nuevo");
      ManejoArchivos.anexarArchivo(nombreArchivo, "espero");
      ManejoArchivos.anexarArchivo(nombreArchivo, "que");
      ManejoArchivos.anexarArchivo(nombreArchivo, "estes");
      ManejoArchivos.anexarArchivo(nombreArchivo, "muy");
      ManejoArchivos.anexarArchivo(nombreArchivo, "bien");

      //vamos a leer linea por linea lo que tiene el archivo que creamos, 
      //metimos informacion y la concatenamos

      ManejoArchivos.leerArchivo(nombreArchivo);
    }
}

~~~

### 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167.-
EJERCICIO MUY COMPLETO de java y muchas cosas interesantes 

AccesoDatosEx.java
~~~java
package mx.com.gm.peliculas.excepciones;

public class AccesoDatosEx extends Exception{
    public AccesoDatosEx(String mensaje){
      super(mensaje);
    }
}

~~~

EscrituraDatosExjava
~~~java
package mx.com.gm.peliculas.excepciones;

public class EscrituraDatosEx extends AccesoDatosEx{
    
    public EscrituraDatosEx(String mensaje) {
        super(mensaje);
    }
    
}

~~~

LecturaDatosExjava
~~~java
package mx.com.gm.peliculas.excepciones;

public class LecturaDatosEx extends AccesoDatosEx{
    
    public LecturaDatosEx(String mensaje) {
        super(mensaje);
    }
    
}

~~~

Peliculajava
~~~java
package mx.com.gm.peliculas.domain;

public class Pelicula {
    private String nombre;

    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
~~~

IAccesoDatosjava
~~~java
package mx.com.gm.peliculas.datos;

import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public interface IAccesoDatos {
  // puede arrojar una excepcion
  // este indica si el archivo con el que vamos a trabar existe o no
  public boolean existe(String nombreRecurso) throws AccesoDatosEx;

  public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

  public void escribir(Pelicula pelicula, String nombreArchivo, Boolean anexar) throws EscrituraDatosEx;

  public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

  public void crear(String nombreArchivo) throws AccesoDatosEx;

  public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
~~~

AccesoDatosImpljava
~~~java
package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;;

public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean existe(String nombreRecurso){
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            //abrimos el buffer para que podamos leer el archivo
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //inicializamos el valor de linea
            String linea = null;
            //leemos la primer linea que esta en nuestri buffer 
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            //ponemos entrada close para que podamos cerra nuestro flujo del buffer
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            //si tenemos errores propagamos los errores a traves de nuestras 
            //excepciones de Lectura de datos, que ya habiamos dicho que podian 
            //pasar al poner el throw en el metodo
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas" + ex.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, Boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion ala archivo" + pelicula.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //la variablle con la cual vamos a leer el archivo
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while (linea != null) {
                //con iqualsIgnoreCase hacemos que no nos importe las mayusculas 
                //y las minusculas
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "pelicula "+ linea +" encontrada en el indice: " + indice;
                    break;
                }else{
                    resultado = "pelicula no encontrada";
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula" + ex.getMessage());
        }


        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("se ha creado el archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear el archivo");
        }
    }

    @Override
    public void borrar(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        if(archivo.exists()){
            archivo.delete();
            System.out.println("archivo borrado");
        }else{
            System.out.println("el archivo ya fue borrado");
        }
    }
    
}
~~~

ICatalogoPeliculasjava
~~~java
package mx.com.gm.peliculas.servivicio;

public interface ICatalogoPeliculas {

    String NOMBRE_RECURSO = "peliculas.txt";

    public void agregarPelicula(String nombrePelicula);

    public void listarPeliculas();

    public void buscarPelicula(String buscar);

    public void iniciarArchivo();
  }
~~~

CatalogoPeliculasImpljava
~~~java
package mx.com.gm.peliculas.servivicio;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

  // como los servicios que van a utilizar los usuarios son
  // muy similares o iguales los de acceso datos, podemos
  // o debemos hacer uso de estos, ya que ya los tenemos echos
  // por ende creamos una clase interfaz y luego le damos el valor
  // de una clase que la implemente para poder usar los metodos
  private final IAccesoDatos datos;

  public CatalogoPeliculasImpl() {
    this.datos = new AccesoDatosImpl();
  }

  @Override
  public void agregarPelicula(String nombrePelicula){
    Pelicula pelicula = new Pelicula(nombrePelicula);
    boolean anexar = false;

    try {
      // podemos usar el de nombre curso porque es una constante en la interfaz
      // de catalogo de peliculas
      anexar = this.datos.existe(NOMBRE_RECURSO);
      this.datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
    } catch (AccesoDatosEx ex) {
      System.out.println("Error de acceso a los datos");
      ex.printStackTrace();
    }

  }

  @Override
  public void listarPeliculas(){
    List<Pelicula> peliculas;
      try {
          peliculas = this.datos.listar(NOMBRE_RECURSO);
          for (Pelicula pelicula : peliculas) {
            System.out.println("pelicula = " + pelicula);
          }
      } catch (LecturaDatosEx ex) {
          Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
    
  }

  @Override
  public void buscarPelicula(String buscar){
    String resultado = null;
    try {
      resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
      System.out.println(resultado);
    } catch (Exception e) {
      System.out.println("Error de acceso de datos");
      e.printStackTrace(System.out);
    }

  }

  @Override
  public void iniciarArchivo(){
    try {
      if (this.datos.existe(NOMBRE_RECURSO)) {
        datos.borrar(NOMBRE_RECURSO);
        datos.crear(NOMBRE_RECURSO);
      } else {
        datos.crear(NOMBRE_RECURSO);
      }
    } catch (Exception e) {
      System.out.println("Error al iniciar catalogo de peliculas");
      e.printStackTrace(System.out);
    }

  }

}
~~~


CatalogoPeliculasPresentacionjava
~~~java
package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;

import mx.com.gm.peliculas.servivicio.*;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
      int opcion = -1;
      Scanner scanner = new Scanner(System.in);

      ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
      //la implementacion de bajo acomplamiento y alta cuercion es que nosotros 
      //ya no necesitamos toca la parte donde se utiliza acceso de datos, sino 
      //solamente la capa de servicio que es la que solo debe ver el cliente final, 
      //por ende se intenta reducir los errores en la ejecucion

      while (opcion != 0) {
        System.out.println("elige una opcion: \n" 
                    +"1. Iniciar catalogo peliculas \n"
                    +"2. Agregar pelicula \n"
                    +"3. Lista pelicula \n"
                    +"4. Buscar pelicula \n"
                    +"0. Salir \n" 
                    );
        opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
          case 1:
            catalogo.iniciarArchivo();
            break;

          case 2:
            System.out.println("Introduce el nombre de la pelicula: \n");
            String nombrePeliculaString = scanner.nextLine().toString(); 
            catalogo.agregarPelicula(nombrePeliculaString);
            break;

          case 3:
            catalogo.listarPeliculas();
            break;

          case 4:
            System.out.println("Introduce una pelicula a buscar: \n");
            String buscar = scanner.nextLine().toString(); 
            catalogo.buscarPelicula(buscar);
            break;

          case 0:
            System.out.println("hasta pronto");;
            break;
        
          default:
            System.out.println("opcion no reconodica");
            break;
        }

      }
    }
}
~~~

### 168.-
~~~java

~~~

### 169.-
~~~java

~~~

### 170.-
~~~MySql
/*asi se hacen los comentarios en MySql*/
/*no pondremos el id_perosna porque este es autoaumentable
como ya lo habiamos puesto, en mysql se utilizan comillas simples */ 
INSERT INTO persona(nombre, apellido, email, telefono) VALUES('Juan','Peres','jperez@mail.com',5544332211);

/*Cuando se utiliza Upsate y Deelete se tiene que tener cuidado, ya que se puede
boorar toda la base de datos, entonces debemos usar where para que se limite en donde 
va a hacer los cambios */
/*Cambiando los valores que ya teniamos de un registro*/
UPDATE persona SET nombre = 'Juanito', apellido = 'Gomez' WHERE id_persona = 1;
~~~

### 171.-
~~~java

~~~

### 172, 173, 174, 175.-
ahora para poder comunicarnos con una base de datos es necesario usar maven, para poder hacer la conexion, ya que esta nos ayuda a mantener bien nuestras dependencias 
TestMySqlJDBC.java
~~~java
package test;

import java.sql.*;

public class TestMySqlJDBC {
  public static void main(String[] args) {
    //con esta liena hacemos el link con la base de datos que ya tenemos echa
    String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
      try {
          //hacemos la coneccion mediante la url que ya le pasamos anteriormente
          Connection conexion = DriverManager.getConnection(url, "root", "admin");
          //creamos un statement para darle ordenes a la base de datos
          Statement instruccion = conexion.createStatement();
          //la linea de "codigo" de sql que le vamos a pasar a la base de datos
          var sql = "SELECT id_persona, nombre,apellido, email, telefono FROM persona";
          //mandar la orden a la base de datos
          ResultSet resultado = instruccion.executeQuery(sql);
          //aqui vemos todos los resultados hasta que se termine la base de datos
          while (resultado.next()) {
            //con resultado.getInt se toma el valor de la base de datos, pero dentro de 
            //los parentesis puede ir su index (que puede cambiar en cualqueir momento)
            //por ende es mejor usar el nombre del campo
            System.out.println("--------------------------------------------------------------");
            System.out.println("Id persona : " + resultado.getInt("id_persona"));
            System.out.println("Nombre : " + resultado.getString("nombre"));
            System.out.println("Apellido : " + resultado.getString("apellido"));
            System.out.println("Email : " + resultado.getString("nombre"));
            System.out.println("Telefono : " + resultado.getString("telefono"));
          }
          //cerrando todos los parametros que abrimos
          resultado.close();
          instruccion.close();
          conexion.close();
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);    
      }
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace(System.out);
    }
  }
}

~~~

### 176, 177, 178, 179, 180, 181, 182, 183, 184.-
Persona.java
~~~java
package domain;

//clase de entidad
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    //un constructor vacio porque siempre puede ser necesaio
    public Persona() {
    }

    //un constructor con solo el id por si necesitamos borrar 
    //el registro solo es ncesario pasar el id para borrar todo
    //el registro completo
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    //uno para crear un objeto sin el id, ya que ese se llama a si mismo
    //por ende es autoincrementable 
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    //uno por si queremos editar de golpe todos los parametros de nuestro registro
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    //y sus geters y seters por si queremos cambiar algo en 
    //nuestro registro de manera puntual 
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //y el metodo toString para ver como esta nuestro registro 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }


}
~~~

Conexion.java
~~~java
package datos;

import java.sql.*;

public class Conexion {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
  private static final String JDBC_USER = "root";
  private static final String JDBC_PASSWORD = "admin";

  public static Connection getConection() throws SQLException {
    return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
  }

  public static void close(ResultSet rs) throws SQLException {
    rs.close();
  }

  public static void close(Statement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(PreparedStatement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}

~~~

PersonaDAO.java
~~~java
//DAO = DATA ACCES OBJECT
package datos;
//reasliza las operaciones de insert, update o delete 

//sobre la tabla de persona 

import java.sql.*;
import java.util.*;

import domain.Persona;
import java.sql.SQLException;

public class PersonaDAO {
  private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
  private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
  private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
  private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?;";

  public List<Persona> seleccionar() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Persona persona = null;
    List<Persona> personas = new ArrayList<>();
    try {
      // creamos la conexion con la base de datos
      conn = Conexion.getConection();
      // creamos el statement para dar instrucciones y pasarle el comando
      stmt = conn.prepareStatement(SQL_SELECT);
      // aplicamos el comando y vemos que nos devuelve la base de datos
      // esto solo le dara a rs una pequeña base de datos que
      // tienen lineas de la base de datos
      // execute query es de tipo consulta
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idPersona = rs.getInt("id_persona");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");

        // con los datos que nos proporciona la base de datos inicializamos
        // objetos de la clase persona
        persona = new Persona(idPersona, nombre, apellido, email, telefono);

        personas.add(persona);
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return personas;
  }

  public int insertar(Persona persona) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      // hacemos la conexion
      conn = Conexion.getConection();
      // cargamos el comando que le mandaremos, pero
      // esta vez contiene variables que son las ?
      stmt = conn.prepareStatement(SQL_INSERT);
      // en el registro 1 donde esta la ? cambiamo el valor por:
      // es importante decir que en sql empiezan desde 1 y no desde 0
      // y los numeros de index a continuacion, son los numeros que se
      // pondran en la sentencia string SQL_INSERT como vienen en la
      // sentencia
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      // executeUpdate es de metodo sentencia, puede hacer
      // update, delete, insert
      registros = stmt.executeUpdate();

    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(Persona persona) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      // haciendo la conexion
      conn = Conexion.getConection();
      // cargando el comando
      stmt = conn.prepareStatement(SQL_UPDATE);
      // configurando el comando
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      stmt.setInt(5, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(Persona persona) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      // haciendo la conexion
      conn = Conexion.getConection();
      // cargando el comando
      stmt = conn.prepareStatement(SQL_DELETE);
      // configurando el comando
      stmt.setInt(1, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}

~~~

TestPersonas.java
~~~java
package test;

import java.util.List;

import datos.PersonaDAO;
import domain.Persona;

public class TestPersonas {
    public static void main(String[] args) {
      PersonaDAO personaDAO = new PersonaDAO();

      imprimeBaseDeDatos(personaDAO);

      //insertando un nuevo objeto persona en la base de datos
      Persona persona = new Persona("Carlos", "Esparza", "cesparza@mail.com", "5544565577");
      personaDAO.insertar(persona);
      imprimeBaseDeDatos(personaDAO);

      System.out.println("==============================");

      //modificaodo un registro que ya existe 
      Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "5544565577");
      personaDAO.actualizar(personaModificar);

      imprimeBaseDeDatos(personaDAO);

      //eliminando un registro que ya existe 
      Persona personaEliminar = new Persona(5);
      personaDAO.eliminar(personaEliminar);

      imprimeBaseDeDatos(personaDAO);
    }

    public static void imprimeBaseDeDatos(PersonaDAO personaDAO){
      //aqui ya hacemos que la base de datos
      //nos regrese objetos persona que ya construyo 
      //en la clase PersonaDAO, que a su vez, resibe la 
      //conexion con la base de datos de la clase Conexion
      List<Persona> personas = personaDAO.seleccionar();
      for (Persona persona : personas) {
        System.out.println("persona = " + persona);
      }
    }
}
~~~

### 185, 186.-
MI propio lavoratorio de Mnaejo de Usuarios en JDBC
Usuario.java
~~~java
package domain;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String password;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(int idUsuario, String nombreUsuario, String password) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", nombreUsuario=").append(nombreUsuario);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }


}
~~~

Es importante decir que el script de coneecion se uda en el mismo contexto ya que como apunta hacia el mismo servidor por medio de los comandos es posible acceder a las tablas, ya que estan en el mismo servidor 
Conexion.java
~~~java
package datos;

import java.sql.*;

public class Conexion {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
  private static final String JDBC_USER = "root";
  private static final String JDBC_PASSWORD = "admin";

  public static Connection getConection() throws SQLException {
    return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
  }

  public static void close(ResultSet rs) throws SQLException {
    rs.close();
  }

  public static void close(Statement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(PreparedStatement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}
~~~

UsuarioDAO.java
~~~java
//DAO = DATA ACCES OBJECT
package datos;
//reasliza las operaciones de insert, update o delete 

//sobre la tabla de usuario 

import java.sql.*;
import java.util.*;

import domain.Usuario;

import java.sql.SQLException;

public class UsuarioDAO {
  private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
  private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
  private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?;";
  private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?;";

  public List<Usuario> seleccionar() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Usuario usuario = null;
    List<Usuario> usuarios = new ArrayList<>();
    try {
      // creamos la conexion con la base de datos
      conn = Conexion.getConection();
      // creamos el statement para dar instrucciones y pasarle el comando
      stmt = conn.prepareStatement(SQL_SELECT);
      // aplicamos el comando y vemos que nos devuelve la base de datos
      // esto solo le dara a rs una pequeña base de datos que
      // tienen lineas de la base de datos
      // execute query es de tipo consulta
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idUsuario = rs.getInt("id_usuario");
        String nombreUsuario = rs.getString("usuario");
        String password = rs.getString("password");

        // con los datos que nos proporciona la base de datos inicializamos
        // objetos de la clase usuario
        usuario = new Usuario(idUsuario, nombreUsuario, password);

        usuarios.add(usuario);
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return usuarios;
  }

  public int insertar(Usuario usuario) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      // hacemos la conexion
      conn = Conexion.getConection();
      // cargamos el comando que le mandaremos, pero
      // esta vez contiene variables que son las ?
      stmt = conn.prepareStatement(SQL_INSERT);
      // en el registro 1 donde esta la ? cambiamo el valor por:
      // es importante decir que en sql empiezan desde 1 y no desde 0
      // y los numeros de index a continuacion, son los numeros que se
      // pondran en la sentencia string SQL_INSERT como vienen en la
      // sentencia
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      // executeUpdate es de metodo sentencia, puede hacer
      // update, delete, insert
      registros = stmt.executeUpdate();

    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(Usuario usuario) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      // haciendo la conexion
      conn = Conexion.getConection();
      // cargando el comando
      stmt = conn.prepareStatement(SQL_UPDATE);
      // configurando el comando
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      stmt.setInt(3, usuario.getIdUsuario());
      registros = stmt.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(Usuario usuario) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      // haciendo la conexion
      conn = Conexion.getConection();
      // cargando el comando
      stmt = conn.prepareStatement(SQL_DELETE);
      // configurando el comando
      stmt.setInt(1, usuario.getIdUsuario());
      registros = stmt.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
~~~

TestUsuario.java
~~~java
package test;

import java.util.List;

import datos.UsuarioDAO;
import domain.Usuario;

public class TestUsuario {
    public static void main(String[] args) {
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      imprimeBaseDeDatos(usuarioDAO);

      //Usuario usuarioAInsertar = new Usuario("juanito", "1547");
      //usuarioDAO.insertar(usuarioAInsertar);
      //imprimeBaseDeDatos(usuarioDAO);

      Usuario usuarioAActualziar = new Usuario(5, "carmelo", "1746");
      usuarioDAO.actualizar(usuarioAActualziar);
      imprimeBaseDeDatos(usuarioDAO);

      Usuario usuarioABorrar = new Usuario(4);
      usuarioDAO.eliminar(usuarioABorrar);
      imprimeBaseDeDatos(usuarioDAO);
    }

    public static void imprimeBaseDeDatos(UsuarioDAO usuarioDAO){
      List<Usuario> usuarios;
      usuarios = usuarioDAO.seleccionar();

      for (Usuario usuario : usuarios) {
        System.out.println(usuario);
      }
      System.out.println("=================================");
    }
}
~~~

### 187, 188.-
MANEJO DE TRANSACCIONES 
LAS TRANSACCIONES NOS SIRVEN POR SI NOS EQUIVOCAMOS AL HACER CAMBIOS EN LA BASE DE DATOS PORQUE NO GUARDAMOS LOS VALORES QUE LE DIMOS HANTES DE QUE NOS EQUIVOCARAMOS

Conexiones.java
~~~java
package datos;

import java.sql.*;

public class Conexion {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
  private static final String JDBC_USER = "root";
  private static final String JDBC_PASSWORD = "admin";

  public static Connection getConection() throws SQLException {
    return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
  }

  public static void close(ResultSet rs) throws SQLException {
    rs.close();
  }

  public static void close(Statement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(PreparedStatement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}

~~~

Persona.java
~~~java
package domain;

//clase de entidad
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    //un constructor vacio porque siempre puede ser necesaio
    public Persona() {
    }

    //un constructor con solo el id por si necesitamos borrar 
    //el registro solo es ncesario pasar el id para borrar todo
    //el registro completo
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    //uno para crear un objeto sin el id, ya que ese se llama a si mismo
    //por ende es autoincrementable 
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    //uno por si queremos editar de golpe todos los parametros de nuestro registro
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    //y sus geters y seters por si queremos cambiar algo en 
    //nuestro registro de manera puntual 
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //y el metodo toString para ver como esta nuestro registro 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }


}
~~~

PersonaDAO.java
~~~java
//DAO = DATA ACCES OBJECT
package datos;
//reasliza las operaciones de insert, update o delete 

//sobre la tabla de persona 

import java.sql.*;
import java.util.*;

import domain.Persona;
import java.sql.SQLException;

public class PersonaDAO {

  private Connection conexionTransaccional;

  private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
  private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
  private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
  private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?;";


  public PersonaDAO(){
  }

  //la unica diferencia es que esta conexion no se 
  //va a cerra al terminanr los metodos si no que se 
  //mantendra abierta y la transaccion sera por afuera de la clase
  //y la clase externa decide cuando terminar conexion, hacer commit y rollback
  public PersonaDAO(Connection conexionTransaccional){
    this.conexionTransaccional = conexionTransaccional;
  }

  //y reportamos que arroje una excepcion para que la procese
  //el script que ivoque esta clase, esta clase no debe procesar
  //las excepciones, si no que las propague 
  public List<Persona> seleccionar() throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Persona persona = null;
    List<Persona> personas = new ArrayList<>();
    try {
      //como abrimos y cerramos conecciones no es posible
      //hacer transacciones y hacer comits o rollbacks por dende
      //resivimos una conneccion externa
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idPersona = rs.getInt("id_persona");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");

        
        persona = new Persona(idPersona, nombre, apellido, email, telefono);

        personas.add(persona);
      }
    } //quitamos el bloque catch para que el error bote en 
      //la clase que llama a esta clase y se pueda crear el 
      //rollback 
     finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          // si la coneccion no fue de la transaccional 
          //hay que cerrarla despues de llamar al metodo
          Conexion.close(conn);
        }
        
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return personas;
  }

  public int insertar(Persona persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      //como abrimos y cerramos conecciones no es posible
      //hacer transacciones y hacer comits o rollbacks por dende
      //resivimos una conneccion externa
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      registros = stmt.executeUpdate();

    } //quitamos el bloque catch para que el error bote en 
    //la clase que llama a esta clase y se pueda crear el 
    //rollback 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          // si la coneccion no fue de la transaccional 
          //hay que cerrarla despues de llamar al metodo
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(Persona persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      //como abrimos y cerramos conecciones no es posible
      //hacer transacciones y hacer comits o rollbacks por dende
      //resivimos una conneccion externa
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      stmt.setInt(5, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } //quitamos el bloque catch para que el error bote en 
    //la clase que llama a esta clase y se pueda crear el 
    //rollback 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          // si la coneccion no fue de la transaccional 
          //hay que cerrarla despues de llamar al metodo
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(Persona persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      //como abrimos y cerramos conecciones no es posible
      //hacer transacciones y hacer comits o rollbacks por dende
      //resivimos una conneccion externa
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } 
    //quitamos el bloque catch para que el error bote en 
    //la clase que llama a esta clase y se pueda crear el 
    //rollback 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          // si la coneccion no fue de la transaccional 
          //hay que cerrarla despues de llamar al metodo
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
~~~

TestPersona.java
~~~java
package test;

import java.sql.*;
import java.util.List;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;

public class TestPersonas {
  public static void main(String[] args) {
    //ponemos la conexion aqui para que pueda ser usada
    //por cualquier parte del codigo
    Connection conn = null;
    try {
      // creamos una conexion por fuera de la clase personaDAO
      conn = Conexion.getConection();
      if (conn.getAutoCommit()) {
        // si el autocomit de nuestra conexion es true, la pasamos
        // a false, porque no queremos que haga commit
        conn.setAutoCommit(false);
        //le pasamos la conexion que hicimos por fuera para que pueda
        //hacer uso de las transacciones de rollback y demas 
        PersonaDAO personaDao = new PersonaDAO(conn);

        //vamos  a hacer cambios en la base de datos que tiene
        //una conexion exterior que le proporcionamos
        Persona cambioPersona = new Persona(2, "karla ivon ", "Gomez", "KGomez@mail.com", "7713445678");
        personaDao.actualizar(cambioPersona);

        //para ver como no se hacen los cambios al hacer un rollback, vamos
        //a desboradar uno de los parametros para que no acepte tantos dijitos
        // y pues si funciono, hace rollback y no se guardan los registros en la 
        //bas de datos
        //Persona nuevaPersona = new Persona("Carlos", "Ramirez1111111111111111111111111111111111111111111111111111111111111111", "CRamirez@mail.com", "5544778899");
        //ahora si con datos validos
        Persona nuevaPersona = new Persona("Carlos", "Ramirez", "CRamirez@mail.com", "5544778899");
        personaDao.insertar(nuevaPersona);

        //hasta este momento al hacer commit es cuando se van a hacer los 
        //en la base de datos
        conn.commit();
        System.out.println("haciendo comit de la transaccion");
        //con este codigo anterios hacemos que se ejecute un update de manera correcta
        //pero un insert de manera incorrecta haciendo que esto genere un problema
        //y haciendo que nada de esto se aplique por el rollback

        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona : personas) {
          System.out.println(persona);
        }
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
      System.out.println("ha ocurrido un error, haciendo rollback");
        try {
          //hacemos el rollback porque algo ha fallado 
          //entonces no guardamos nada de la informacion en 
          //la base de datos
            conn.rollback();
            //para que el rollback funcione tenemos que hacer salte 
            //el error en esta parte del codigo, por ende 
            //debemos quitar las tentencias try catch 
            //de las clases de personaDAO.insertar()
        } catch (SQLException ex1) {
            ex1.printStackTrace(System.out);
        }
    }
  }
}
~~~

### 189.-
LABORATORIO DEL PROYECTO PERO CON USUARIOS
Conexiones.java
~~~java
package datos;

import java.sql.*;

public class Conexion {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
  private static final String JDBC_USER = "root";
  private static final String JDBC_PASSWORD = "admin";

  public static Connection getConection() throws SQLException {
    return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
  }

  public static void close(ResultSet rs) throws SQLException {
    rs.close();
  }

  public static void close(Statement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(PreparedStatement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}

~~~

Usuario.java
~~~java
package domain;

public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String password;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(int idUsuario, String nombreUsuario, String password) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", nombreUsuario=").append(nombreUsuario);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }
}
~~~

UsuarioDAO.java
~~~java
//DAO = DATA ACCES OBJECT
package datos;
//reasliza las operaciones de insert, update o delete 

//sobre la tabla de usuario 

import java.sql.*;
import java.util.*;

import domain.Usuario;

import java.sql.SQLException;

public class UsuarioDAO {
  Connection conexionTransaccional = null;

  private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
  private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
  private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?;";
  private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?;";

  public UsuarioDAO() {
  }

  public UsuarioDAO(Connection conexionTransaccional) {
    this.conexionTransaccional = conexionTransaccional;
  }

  public List<Usuario> seleccionar() throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Usuario usuario = null;
    List<Usuario> usuarios = new ArrayList<>();
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idUsuario = rs.getInt("id_usuario");
        String nombreUsuario = rs.getString("usuario");
        String password = rs.getString("password");
        usuario = new Usuario(idUsuario, nombreUsuario, password);
        usuarios.add(usuario);
      }
    } finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return usuarios;
  }

  public int insertar(Usuario usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      registros = stmt.executeUpdate();

    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(Usuario usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      stmt.setInt(3, usuario.getIdUsuario());
      registros = stmt.executeUpdate();
    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(Usuario usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, usuario.getIdUsuario());
      registros = stmt.executeUpdate();
    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
~~~

TestUsuario.java
~~~java
package test;

import java.sql.Connection;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.SQLException;

public class TestUsuario {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = Conexion.getConection();
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
        UsuarioDAO usuarioDAO = new UsuarioDAO(conn);

        Usuario updateUsuario = new Usuario(2, "bebe", "pass");
        usuarioDAO.actualizar(updateUsuario);

        Usuario nuevoUsuario = new Usuario("warTurtle", "terror");
        usuarioDAO.insertar(nuevoUsuario);

        conn.commit();

        System.out.println("commit realizado con exito");
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
      System.out.println("error en la transaccion, haciendo rollback");
        try {
            conn.rollback();
        } catch (SQLException ex1) {
            ex1.printStackTrace(System.out);
        }
    }
  }
}
~~~

### 190, 191.-
CON LAS CAPAS HACEMOS QUE TODO SEA LO MAS GENERICO POSIBLE, POR ENDE IMPLEMENTAMOS UNA INTREFACE PARA HACER UPDATE Y DEMAS COMANDOS, POR SI OTRA CLASE QUIERE IMPLEMENTARLOS

Conexion.java
~~~java
package datos;

import java.sql.*;

public class Conexion {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
  private static final String JDBC_USER = "root";
  private static final String JDBC_PASSWORD = "admin";

  public static Connection getConection() throws SQLException {
    return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
  }

  public static void close(ResultSet rs) throws SQLException {
    rs.close();
  }

  public static void close(Statement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(PreparedStatement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}
~~~

PersonaDTO.java
~~~java
package domain;

//lo llamamos DTO por Data Transfer Object
public class PersonaDTO {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public PersonaDTO() {
    }

    public PersonaDTO(int idPersona) {
        this.idPersona = idPersona;
    }

    public PersonaDTO(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public PersonaDTO(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
}
~~~

IPersonaDAO.java
~~~java
package datos;

import java.sql.SQLException;
import java.util.List;

import domain.PersonaDTO;

public interface IPersonaDAO {
  public List<PersonaDTO> seleccionar() throws SQLException;

  public int insertar(PersonaDTO personaDTO) throws SQLException;

  public int actualizar(PersonaDTO personaDTO) throws SQLException;

  public int eliminar(PersonaDTO personaDTO) throws SQLException;

}
~~~

PersonaDaoJDBC.java
~~~java
package datos;

import java.sql.*;
import java.util.*;

import domain.PersonaDTO;
import java.sql.SQLException;

//la clase implementa una interaface por si otra clase tambien quieran
//implementar la interface pero con otra tecnologia como jpa un api
public class PersonaDaoJDBC implements IPersonaDAO{


  private Connection conexionTransaccional;

  private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
  private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
  private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
  private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?;";


  public PersonaDaoJDBC(){
  }

  public PersonaDaoJDBC(Connection conexionTransaccional){
    this.conexionTransaccional = conexionTransaccional;
  }
  public List<PersonaDTO> seleccionar() throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    PersonaDTO persona = null;
    List<PersonaDTO> personas = new ArrayList<>();
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idPersona = rs.getInt("id_persona");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");

        
        persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono);

        personas.add(persona);
      }
    } 
     finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
        
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return personas;
  }

  public int insertar(PersonaDTO persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      registros = stmt.executeUpdate();

    } 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(PersonaDTO persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      stmt.setInt(5, persona.getIdPersona());
      registros = stmt.executeUpdate();
    }  
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(PersonaDTO persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
~~~

TestPersonas.java
~~~java
package test;

import java.sql.*;
import java.util.List;

import datos.Conexion;
import datos.IPersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;

public class TestPersonas {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = Conexion.getConection();
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);

        //como es una interface y PersonaDaoJDBC lo implementa
        //podemos apuntar hacia ese sin problemas
        IPersonaDAO personaDao = new PersonaDaoJDBC(conn);

        List<PersonaDTO> personasDTO = personaDao.seleccionar();
        for (PersonaDTO personaDTO : personasDTO) {
          System.out.println("Persona DTO: " + personaDTO);
        }

        conn.commit();
        System.out.println("haciendo comit de la transaccion");
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
      System.out.println("ha ocurrido un error, haciendo rollback");
      try {
        conn.rollback();
      } catch (SQLException ex1) {
        ex1.printStackTrace(System.out);
      }
    }
  }
}

~~~

UsuarioDTO.java
~~~java
package domain;

public class UsuarioDTO {
    private int idUsuario;
    private String nombreUsuario;
    private String password;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public UsuarioDTO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioDTO(int idUsuario, String nombreUsuario, String password) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", nombreUsuario=").append(nombreUsuario);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }
}
~~~

IUsuarioDAO.java
~~~java
package datos;

import java.sql.SQLException;
import java.util.List;

import domain.UsuarioDTO;

public interface IUsuarioDAO {
  public List<UsuarioDTO> seleccionar() throws SQLException;

  public int insertar(UsuarioDTO UsuarioDTO) throws SQLException;

  public int actualizar(UsuarioDTO UsuarioDTO) throws SQLException;

  public int eliminar(UsuarioDTO UsuarioDTO) throws SQLException;
}
~~~

UsuarioDaoJDBC.java
~~~java
package datos;

import java.sql.*;
import java.util.*;

import domain.UsuarioDTO;

import java.sql.SQLException;

public class UsuarioDaoJDBC implements IUsuarioDAO{
  Connection conexionTransaccional = null;

  private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
  private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
  private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?;";
  private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?;";

  public UsuarioDaoJDBC() {
  }

  public UsuarioDaoJDBC(Connection conexionTransaccional) {
    this.conexionTransaccional = conexionTransaccional;
  }

  public List<UsuarioDTO> seleccionar() throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    UsuarioDTO usuario = null;
    List<UsuarioDTO> usuarios = new ArrayList<>();
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idUsuario = rs.getInt("id_usuario");
        String nombreUsuario = rs.getString("usuario");
        String password = rs.getString("password");
        usuario = new UsuarioDTO(idUsuario, nombreUsuario, password);
        usuarios.add(usuario);
      }
    } finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return usuarios;
  }

  public int insertar(UsuarioDTO usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      registros = stmt.executeUpdate();

    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(UsuarioDTO usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      stmt.setInt(3, usuario.getIdUsuario());
      registros = stmt.executeUpdate();
    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(UsuarioDTO usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, usuario.getIdUsuario());
      registros = stmt.executeUpdate();
    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
~~~

TestUsuario.java
~~~java
package test;

import java.sql.Connection;

import datos.Conexion;
import datos.IUsuarioDAO;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

public class TestUsuario {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = Conexion.getConection();
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
        IUsuarioDAO  usuarioDAO = new UsuarioDaoJDBC(conn);

        List<UsuarioDTO> usuarios = usuarioDAO.seleccionar();
        for (UsuarioDTO usuario : usuarios) {
          System.out.println(usuario);
        } 

        conn.commit();

        System.out.println("commit realizado con exito");
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
      System.out.println("error en la transaccion, haciendo rollback");
        try {
            conn.rollback();
        } catch (SQLException ex1) {
            ex1.printStackTrace(System.out);
        }
    }
  }
}
~~~

### 192, 193.-
POOL DE CONEXIONES
POR EJEMPLO:
ESTO HACE QUE SE ABRAN 5 CONEXIONES QUE SE ABREN PERO NO SE CIERRAN, ENTONCES SI MUCHAS COMPUTADORAS QUIEREN ACCEDER A LAS BASE DE DATOS SE USAN UNA DE LAS 5 Y ASI SE REPARTREN DEPENDIENDO DE QUIEN PIDA ACCESO A LA BASE DE DATOS Y ASI SUCESIVAMENTE 


Conexion.java
~~~java
package datos;

import java.sql.*;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
  private static final String JDBC_USER = "root";
  private static final String JDBC_PASSWORD = "admin";

  //inicialiazando el pool de conexiones 
  public static DataSource getDataSource(){
    BasicDataSource ds = new BasicDataSource();
    //inicialiazando los valores del pool
    ds.setUrl(JDBC_URL);
    ds.setUsername(JDBC_USER);
    ds.setPassword(JDBC_PASSWORD);
    //definimos el tamaño inicial del pool de conexiones
    //tenemos que tener cuidado con cuantos inicializamos
    //ya que esto consume mucha memoria 
    ds.setInitialSize(5);
    return ds;
  }


  public static Connection getConection() throws SQLException {
    return getDataSource().getConnection();
  }

  public static void close(ResultSet rs) throws SQLException {
    rs.close();
  }

  public static void close(Statement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(PreparedStatement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}
~~~

### 194, 195.-
CORTE, DE AQUI ME MANDA A VER HTML CSS Y JAVASCRIPT A LAS ULTIMAS PARTES DEL CURSO, ENTONCES LOS NUMEROS SE VAN A MOVER DESDE 553 
(EL CURSO PIDE SOLO EL HTML Y CSS, PERO DE UNA VEZ YA HACEMOS EL JAVASCRIPT)

------------------------------------------------

### 553, 554, 555, 556, 557, 558, 559.-
INICIOS DE HTML
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!--lo que se vera arriba en la pestaña del navegador-->
  <title>Universidad HTML</title>
</head>
<body>
  <!--Heading o titulo-->
  <h1>Curso Universidad HTML</h1>
  <!--Parrafo-->
  <p>Mi primer pagina HTML</p>
  
</body>
</html>
~~~

### 560, 561, 562, 563, 564, 565, 566, 567.-
EL PROFE EN ESTA SECCION UTILIZA LA ETIQUETA STYLE PARA CAMBAIR EL CSS DESDE EL HTML PERO NO LO HICE PORQUE NO ES UNA BUENA PRAXTICA QUE YA SABIA 

index.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Universidad HTML</title>
</head>
<body>
  <!--Titulos -->
  <h1>Titulo h1</h1>
  <h2>Titulo h2</h2>
  <h3>Titulo h3</h3>
  <h4>Titulo h4</h4>
  <h5>Titulo h5</h5>
  <h6>Titulo h6</h6>

  <!--Parrafos-->
  <!--Con br haces un salto de linea en el mismo parrafo-->
  <p>cualquier texto <br/> dalto de linea</p>
  <!--pre: preformated, un parrafo preformado-->
  <pre>Se respeta 
    el texto en este tipo de 
    textos
  </pre>
  <!--es buena practica cerrar las etiquetas con /-->

  <!--hr es una linea que divide toda la pagina -->
  <hr>

  <!--links-->
  <!--target = _blank hace que la pagina abra el link en una nueva pagina -->
  <a href="http://www.globalmentoring.com.mx" target="_blank">Sitio Global Mentoring</a>
  <br/>
  <a href="pagina1.html">Ir a pagina1</a>

  <hr>

  <!--imagenes-->
  <!--las imagenes por lo general estan en subcarpetas-->
  <!--src es source-->
  <!--Title es el titulo de la imagen o de lo que le entre al tittle-->
  <img src="img/html5.png" alt="logo html5" title="html5"/>
  <!--tambien se puede usar las url para las imagenes-->
  <!--pues se necesita el url-->
  <!--si no se encuentra el archivo de la imagen en alt se ve
   un texto descriptivo, texto alternativo-->
  <!--poniendole el ancho y alto de una imagen-->
  <img src="img/css3.png" alt="logo css" width="50px" height="100px">

  <hr>

  <!--formato de texto-->
  <p><b>Negritas</b></p>
  <p><strong>Tetxo importante (negritas)</strong></p>
  <p><i>tercer parrafo en italica</i></p>
  <p><em>tetxo para enfatizar en cursiva</em></p>
  <p><small>Texto pequeño</small></p>
  <p><mark> Texto subrayado </mark></p>
  <p><del>Texto que se borra (tienen una linea )</del></p>
  <p><ins>Texto insertado (subrayado con linea)</ins></p>
  <p>Texto en subindice H <sub>2</sub> 0</p>
  <p>Texto en superindice H<sup>la</sup> </p>

  <hr>

  <p><code>Mostrar codigo</code></p>
  <!--en la pagina char ref hrml buscamos el icono que querramos
  y lo ponemos -->
  <p>&yacute</p>
</body>
</html>
~~~

pagina1.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Pagina1</title>
</head>
<body>
  <h1>Pagina 1 Html</h1>
  <p>cualquier contenido</p>
  <a href="index.html">Inicio</a>
</body>
</html>
~~~

### 568, 569, 570.-
inde.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Universidad HTML</title>
</head>
<body>
  <h1>Universidad HTML</h1>
  <hr>

  <a href="index.html" style="border-right: 1px solid black; padding: 5px;">Inicio</a>
  <a href="Contacto.html" style="border-right: 1px solid black; padding: 5px;">Contacto</a>
  <a href="AcercaDe.html" style="padding: 5px;">Acerca De</a>

  <p>Bienvenidos al curso de Universidad HTML</p>
  
</body>
</html>
~~~

Contacto.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Contacto</title>
</head>
<body>
  <h1>Contacto GlobalMentoring.com.mx</h1>
  <hr>
  <p>Página de contacto</p>

  <a href="http://www.globalmentoring.com.mx" target="_blank">Facebook</a>
  <br>
  <a href="index.html">Inicio</a>
</body>
</html>
~~~

AcercaDe.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Acerca de GlobalMentoring.com.mx</title>
</head>
<body>
  <h1>Acerca de GlobalMentoring.com.mx</h1>
  <hr>
  <p>Empresa con más de 10 años de experiencia en capacitacion online</p>
  <a href="http://www.globalmentoring.com.mx" target="_blank">Ir A GlobalMentoring.com.mx</a>
  <br>
  <a href="index.html">Inicio</a>
</body>
</html>
~~~

### 571, 572, 573, 574, 575, 576, 577.-
EN ESTA CLASE SE MUESTRA COMO PONER COLORES EN HTML 
COLOR POR NOMBRE
COLOR POR RGB 
COLOR POR RGBA 
COLOR POR EXADECIMAL

se puede usar la paleta de colores de colors.co
index.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!--añadiendo el css a traves de un documento externo-->
  <link rel="stylesheet" href="estilos.css">
  <title>Universidad HTML</title>
  <!--
  <style>
    
    h1{
      color: blue;
    }
    p{
      color: white;
      background-color: crimson;
    }
  </style>
  -->
</head>
<body>
  <h1>Universidad HTML</h1>
  <p>Bienvenido al css</p>
  <p>Saludos</p>
</body>
</html>
~~~

estilos.css
~~~css
h1 {
  color: blue;
}
p {
  color: white;
  background-color: crimson;
  /*Comentarios */
  /*Tambien todos tienen border left, margin top, padding right
  y asi */
  /*Padding*/
  padding: 15px;
  /*Border*/
  border:  10px solid powderblue;
  /*Margen*/
  margin: 50px;
  /*arriba, derecha, abajo, izquierda*/
  margin: 40px 10px 20px 10px;
  /*arriba abajo, derecha izquierda*/
  margin: 40px 10px;

  /*centrando las cajas*/
  margin: auto 50px;
  /*centrando el texto de las cajas*/
  text-align: center;

  /*las paletas de colores son importantes*/
}
~~~

### 578, 579, 580, 581.-
~~~css
/*link que no hemos precionado*/
a:link{
  /*no poner decoracion*/
  text-decoration : none; 
}

/*link ya visitado*/
a:visited{

}

/*estando sobre el link*/
a:hover{

}

/*cuando lo pulsemos*/
a:active{

}
~~~

### 582, 583, 584, 585.-
index.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/styles.css">
  <title>Tablas</title>
</head>
<body>
  <table>
    <!--titulo de la tabla-->
    <caption>Listado de personas</caption>
    <!--tr es columna-->
    <tr>
      <!--th es fila en negritas-->
      <!--extendemos una columna -->
      <th colspan="2">Nombre</th>
      <th>Email</th>
    </tr>
    <tr>
      <td >jorde</td>
      <td>Guapisomo</td>
      <!--extendiendo la fila hacia abajo-->
      <td rowspan="2">gjorge@mail.com</td>
    </tr>
    <tr>
      <td>joan</td>
      <td>Guapa</td>
    </tr>
    <tr>
      <td>Cralos</td>
      <td>lara</td>
      <td>Lcarlos@mail.com</td>
    </tr>

  </table>
</body>
</html>
~~~

styles.css
~~~css
table, th, td{
  border: 1px solid red;
  border-collapse: collapse;
}

td{
  text-align: center;
}

caption{
  color: red;
  font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
  font-size: 45px;
  line-height: 70px
}
th{
  color: #f1faee;
  background-color:  #1d3557;
}

/*renglones pares*/
tr:nth-child(even){
  background-color: #f1faee;
}
/*renglones pares*/
tr:nth-child(odd){
  background-color: antiquewhite;
}
~~~

### 586, 587, 588, 589, 590.-
Index.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!--
  <link rel="stylesheet" href="style.css">
  -->
  <title>Listas</title>
</head>
<body>
  <!--listas desordenadas-->
  <ul>
    <li>Juan</li>
    <li>Karla</li>
    <!--listas anidadas-->
      <ul>
        <li>54315846</li>
      </ul>
    <li>Maria</li>
  </ul>

  <!--listas ordenadas-->
  <!--con esto decimos como queremos que los enumere-->
  <ol type="A">
    <li>Juan</li>
    <li>Karla</li>
    <li>Maria</li>
  </ol>  
</body>
</html>
~~~

MenuNavegacion.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title>Menu de navegacion</title>
</head>
<body>
  <ul>
    <li><a href="index.html">Inicio</a></li>
    <li><a href="contacto.html">Contacto</a></li>
    <li><a href="acercaDe.html">AcercaDe</a></li>
  </ul>
  
  <h1>Inicio</h1>
  
</body>
</html>
~~~

ListasOrdenadas.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title>Document</title>
</head>
<body>
  <ol>
    <li>Universidad Java</li>
    <li>Universidad Python</li>
    <li>Universidad Pascal</li>
  </ol>
</body>
</html>
~~~

ListasDeDescripcion.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <h1>Lenguajes de Programacion</h1>

  <!--asi se ponen las listas de descripcion-->
  <!--es como la descricpcion de lo qeu quieres decir -->
  <dl>
    <dt>Java</dt>
    <dd>Creador: James Gosling</dd>

    <dt>Python</dt>
    <dd>Creador: Guido van Russen</dd>
  </dl>
</body>
</html>
~~~

style.css
~~~css
ul{
  /*iconos de las listas*/
  list-style-type: none;
  background-color: #437b9d;
  overflow: hidden;
  margin: 0;
  padding: 0;
}
ul li{
  float: left;
  
}
ul li a{
  display: block;
  color: white;
  padding: 15px;
  text-decoration: none;
}

ul li a:hover{
  background-color: #26475c;
}

ol{
  list-style: none;
  /*creamos un contador y lo reseteamos cada que aparezaca un ol*/
  counter-reset: contador;
}

ol li{
  /*incrementamos el contador*/
  counter-increment: contador;
}

ol li::before{
  /*le ponermos esto antes de cada li*/
  content: 'Curso ' counter(contador) ' : ';
  color: orange;
}

ol li::after{
  /*le ponemos esto despues de cada li */
  content: '.';
}
~~~

### 591, 592, 593, 594, 595, 596, 597.-
usando el class en el html para usarlo en css, class es reutilizanle, no como el id que solo es para un solo elemento en la pagina en css se llama a las clases por .clsae y los id se les llama como #id

para los identifiacores para que la pagina vaya de un lugar a otro de la pagina tenemos el id = "Playa" y con el a = "#playa" entonces ya nos lleva el link a el elemento que tenga el id = playa 

los iframes son cajas que pueden cargar o ser como ventanas que ven hacia otras paginas 
<iframe src = "link "></iframe>

### 598 , 599, 600, 601, 602, 603, 604, 605, 606, 607.-
siempre se abre la etiqueta form para capturar unformulario

lo mas basico es usar type= text, lo mejor es ponerle un id a el input 

el input type submit es el boton que envia los datos

label son las etiquetas que le dan el titulo a la caja de texto

poner el name en las etiquetas input para que se sepa que se manda por el servidor a traves del http

placeholdere es un placeholder de lo que se tiene que escribir en este campo 

se le pone required = "true" para que sea necesario que se llene este campo 

formnovalidate =  "formnovalidate" es un comando que se le pone al input submit para que no sea necesario valida elk formulario al mandarlo, aunque los parametros que tenga sean required

el metodo de envio GET hace que la informacion de los formularios pase a traves de la url, mientras que el metodo POST hace una HTTP request con los campos llenos hacia el servidor para cambiarlo es en form methoth = POST

podemos grabar las peticiones que hacemos con el metodo POST (ver clase 601) esto nos sirve para ver que se esta mandando 

el @ se pasa como 40 al ser UTF-8, asi con todos lso caracteres que se pasan por url, pra que no haya espacios en este 

el type = "number" solo pasa numeros enterors, para punto decimal es con step= any

type="radio" es para poner un parametro para seleccionar, si el valor de name es el mismo, estas seran las opciones que se le dara para darle valor 

type="checkbox" es para seleccionar varias respuestas que se le den al checkbox 

la diferencua entre los radio y los checkbox es que los radio solo deberias poder seleccionar 1 

el select se le dan a escoger las opciones al usuario

el textarea es un area donde el usuario puede escribir mucho texto que quiera mandar 

despues de form se puede usar fieldset que emvuelbe a todo el formulario, esto le pone un marco

y se le puede poner legend que hace que se le de un titulo a nuestro formulario

action es la url que va a procesar lo que le estamos pasando 

en form autocomplete=off desabilitamos el autocompletado del navegador

el type reste, nos deja hacer que todos los campos pasen a ser como venian por default

con readonly = true no podemos modificar la informacion que tenemos, porque esperamos que eso lo hagamos a traves de la base de datos

con hidden esa etiqueta que manda infomacion oculta que no puede ver el usuario

y el atributo disabled es que se desabilitan para que no se les pueda dar click en ellos, aunque si esta desabilitado no se envia al servidor 


~~~java

~~~

### 608, 609, 610.-
index.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title>Formulario HTML</title>
</head>
<body>
  <div id="caja">
    <h1>Login</h1>

    <form action="" method="get">
      <label class="word" for="usuario">Usuario</label><br>
      <input type="text" name="usuario" id="usuario" required="true"><br>

      <label for="password">Password</label><br>
      <input type="password" name="password id="password" required="true"><br>

      <input type="submit" value="ENVIAR">
    </form>
  </div>
</body>
</html>
~~~

style.css
~~~css
*{
  padding: 0;
  margin: 0;
}

body{
    background-image: linear-gradient(to bottom, #7209b7, #3f37c0);
    height: 100vh;
    color: white;
}

#caja{
  width: 50%;
  margin: 0px auto;
  margin-top: 60px;
  background-color: rgba(0,0,0, .5);
  padding: 40px;
  border-radius: 15px;
}

#caja h1{
  color: #4cc9f0;
  text-align: center;
  margin-bottom: 40px;
}

#caja .word{
  margin-bottom: px;
}

input[type="text"],
input[type="password"]{
  background-color: transparent;
  border: 0;
  border-bottom: 1px solid white;
  width: 100%;
  margin-bottom: 30px;
  height: 40px;
  color: white;
  font-size: 20px;
}

input[type="submit"]{
  margin-top: 30px;
  width: 100%;
  height: 40px;
  background-color: #f72585;
  border: none;
  color: white;
  letter-spacing: 3px;
  cursor: pointer;
}
~~~

### 611, 612, 613.-
article 

aside 

section

header 

footer

nav

### 621, 622, 623, 624, 625, 626, 627, 628, 629.-
01-01-HolaMundo.js
~~~java
//Ejemplo de tipos de datos en javascript
//tipo de dato string  
var nombre = "ubaldo";
console.log(nombre);

var apellido = "lara";

nombre = 10;
//saber el tipo de dato que es la vraiable
console.log(typeof nombre);

//tipo de dato numerico
var numero = 1000;
console.log(numero);

//tipo de dato object
var objeto = {
  nombre: "juan",
  apellido: "perez",
  telefono: 45445
}
console.log(objeto);

//tipo de dato boolean (true, false)
var bandera = false;

//tipo de dato function
function miFuncion(){}
//las funciones son tipos de datos

//tipo de dato symbol
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

//tipo cakase es una function
class Persona{
  constructor(nombre, apellido){
    this.nombre = nombre;
    this.apellido = apellido;
  }
} //las clases son tipo funcion

//tipo undefined
var x; //undefined es un valor que se le da a una variable
// pero tambien es un tipo de dato
console.log(x);

//null es ausencia de valor, es tipo object
var y = null; //no es como undefined

//arrays en javascript
var autos = ["BMW", "Volvo"]; //es un tipo object
console.log(autos);

//concatenar cadena
var nombreCompleto = nombre + ' ' + apellido;
console.log(nombreCompleto);

//esto lo convierte en un string todo, hasta los numeros
var x = nombre + 2 + 4;

//ya no es tan recomendable poner var a una variable
//esto no e sun abuena practiva
//nombre = "Juan";

let nombre1 = "juan";
console.log(nombre1);

//const ya no es posible cambiarlo
const apellido1 = "Perez";

//las variables deben ser en camell case 
let h,j;
h = 10, j =20;

console.log(h,j);

//javascript es sencible a mayusculas y minusculas
let nombreCompleto1 = "Juan Perez";

//las variables no pueden empezar con numeros

//en javacript las variables son dinamicas
~~~

### 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644.-
03-01-OperadoresJavaSript.js
~~~javaScript
//operadores
/*
suma +
resta -
multiplicacion *
exponente **
division /
modulo (resto de division) %
++ incremento
-- decremento
*/

//preincremento ++variable
//primero se incrementa luego se usa
//postinremento variable++
//primero se usa despues de incrementa

//predecremento --variable
//primero se decrementa luego se usa
//postdecremento variable--
//primero se usa despues de decrementa

//precedencia de operadores 
/*
todo se evalua de derecha a izqueirda, lo mejor 
es tener todo controlado usando los parentesis
depende mucho tambien de la importancia de cada una de las 
operaciones 
*/

//operadores compuestos
/*
a += 3; a = a + 3;
a -= 2; a = a - 2;
a *= 2; a = a * 2;
a /= 2; a = a / 2;
a %= 2; a = a % 2;
a **= 2; a = a ** 2;
*/

//operadores de comparacion
/*
== revisa el valor sin importar el tipo
comparacion estricta
=== se revisa el valor e importa el tipo
>=
<= 
<
>
!= operador distinto
distinto estricto
si son diferentes en valor o son diferentes en tipo regresa true
!== 
!
*/

//ejercicio de numero par

let a = 20;

if(a%2==0){
  console.log("el numero es par")
} else{
  console.log("el numero es impar");
}

//lo mejor es no poner valores sin variables, para poder cambiarlo sin problemas
//en el codigo
let adulto = 18;
if(a>=adulto){
  console.log("ya es un adulto")
} else{
  console.log("aun no es un adulto");
}

//operadores logicos
// and && y or || 

//operador ternario es la manera compacta de hacer if else 
let resultado = 3==2 ? true: false;

let hola =  "4";

//convertir de string a numero
let numero = Number(hola);
//esto nos dara NAN si no es un numero

if(isNaN(numero)){
  console.log("no es un numero");
}else{
  console.log("es un numero");
}
~~~

### 653, 654, 655, 656, 657, 658.-
Ciclo While
Ciclo Do while
Ciclo for
palabra break
palabra continue
etiquetas (go to )

### 659, 660, 661, 662, 663.-
~~~javaScript
//arrays
//asi se hacia antes 
//let autos = new Array('BMW, Mercedes');
let autos = ['BRMW', 'Merceedes', 'ASKD'];

//agregando cosas a el array, hasta el final
autos.push("audi");

//tambien se puede agregar asi un nuevo valor
autos[autos.length] = "carro";

//saber si es un arreglo
Array.isArray(autos);

autos instanceof Array;
~~~

### 664, 665, 666, 667, 668, 669, 670, 671, 672, 673.-
07-01-Funciones
~~~javaScript
//la funcion es un codigo reutilizable
function miFuncion(a, b){
  console.log("suma: " + (a + b));
  return a+b;
}

let resultado = miFuncion(2,3);

//funciones anonimas
let x = function(a,b){
  return a+b
};

//la varaibel guarda la referencia de la funcion 
resultado = x(1,2);

//las funciones son objetos que tienen propeidades y metodos

//haciendo una funcion flecha
const sumarFuncionTipoFlecha = (a,b) =>{
a+b;
}

resultado = sumarFuncionTipoFlecha(3,5);
console.log(resultado);

//parametros y argumentos
let sumar = funcion(a,b){
  //tomando el argumento 
  arguments[0];
}

resultado = suma(2); //si no se le ponen todos los
//parametros el que no esta asignado sera undefined
//si no le damos valores por default
//si se le pasa más de los que tienen, se pueden usar pero
//usando arguments

let resultadoTodo = sumarTodo(5,4,13,10,9);

function sumarTodo() {
  let suma = 0;
  //tomando el numero de argumentos que entra en la funcion 
  for (let i = 0; i < arguments.length; i++) {
    suma += arguments[i]
  }
}

/*el paso por valor es que cuando le pasamos un valor a 
una funcion se crea una copia de el valor de esta, pero si lo 
pasamos por referencia si cambiamos el valor de este si se vera 
afectado por fuera de la funcion, solo se copian los que no tienen 
atributos ni metodos, pero los que si, se pasara la referencia 

para pasar la referencia se le pone $variable
*/

//haciendo un objeto
const persona = {
  nombre: 'Juan',
  apellido: 'Perez'
}
~~~

### 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688.-

08-01-Objects
~~~javaScript
//haciendo un objeto
let persona = {
  nombre: 'Juan',
  apellido: 'Perez',
  email: 'Jperez@mail.com',
  edad: 28,
  idioma: 'es',

  //agregar metodos a los objetos
  nombreCompleto: function(){
    //se puede usar this como en las clases de 
    //java 
    return this.nombre + " " + this.apellido;
  },

  get miFuncion(){
    return "otra funcion";
  }, 

  get lang(){
    return this.idioma.toUpperCase();
  },

  set lang(lang){
    this.idioma = lang.toUpperCase();
  }
};

//accediendo a los parametros del objeto
console.log(persona.nombre);
//llamando a la funcion que tenemos en el objeto
console.log(persona.nombreCompleto());

//tambien se puede acceder a las propiedades asi:
console.log(persona['apellido']);

//ciclo for in 
for (proipiedad in persona) {
  //en el ciclo for in obtenemos las claves de los objetos
  console.log(proipiedad);   
  console.log(persona[proipiedad])
}

//agregando nuevas propiedades dinamicamente
persona.tel = 462862;

//eliminando propiedades
delete persona.email;

//volvemos nuestro objeto a un array 
let personaArray = Object.values(persona);
console.log(personaArray)

//metodo get de un objeto 
//ya no es necesario poner ()
console.log(persona.miFuncion)

console.log(persona.lang)

//usando una funcion set
//aunque no se llame como funcion, se esta llamando
//internamente un set que tiene el objeto 
persona.lang ='en';

//otra manera de hacer objetos
let persona2 = new Object();
persona2.nombre = "carlos";
persona2.direccion = "saturno15";
persona2.tel = 46551652;

//funcion constructor
function Persona(nombre, apellido, email){
  //constructor de objetos de tipo persona 
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
  //agregando metodos
  this.nombreCompleto = function(){
    return this.nombre + " " + this.apellido;
  }
}

//usando prototipe para poner parametros dinamicamente
// y ahora ya podemos usar tel
Persona.prototype.tel = '415215354';

//creando objetos que son echos con el constructor, cuando
//ponemos new le damos un nuevo espacio en memoria 
//asi que se crean 
let padre= new Persona('Juan', 'Perez', 'Jperez@mial.com');
padre.tel = '45421385';
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona('Lupe', 'Escupe', 'Elupe@mail.com');
console.log(madre);
console.log(madre.nombreCompleto());

padre.nombre = "Jose";
console.log(padre);


//distintas formas de crear objetos ne JavaScript
let miObjeyto = new Object();
let miObjeto2 = {};

let persona3 = {
  nombre: 'Juan',
  apellido: 'Perez',

  nombreCompleto: function(){
    return this.nombre + " " + this.apellido;
  },

  nombreCompleto2: function(titulo, tel){
    return titulo+ ' ' + this.nombre + ' ' + this.apellido + ' ' + tel;
  }
}

let persona4 = {
  nombre: 'Carlos',
  apellido: 'Lara',
}

//uso del metodo nombre completo que esta en persona 3
//con la persona 4 para que ponga todo el nombre 
console.log(persona3.nombreCompleto.call(persona4));
//con call pasamos parametros a objetos que implementan
//un metodo que no implementa el objeto que trenemos pero funciona 

//usando call, pero con más parametros que le podemos pasar
console.log(persona3.nombreCompleto2.call(persona3, 'Ingeniero', 465182));


//el metodo apply es muy similar a call
//solo que al pasar los otros parametros, se pasan por array
let arreglo = ['Ing', '54132854'];
console.log(persona3.nombreCompleto2.apply(persona4, arreglo));
~~~

### 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700.-
~~~javaScript
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
~~~

### 701, 702, 703, 704, 705.-
EjercicioPersona.js
~~~javaScript
//todo lo ponemos en el mismo archivo, pero se puede hacer en archivos separados, pero 
//como no tenemos servidor,esto aun no es posible 
class Persona{
  static contadorPersonas = 0;

  constructor(nombre, apellido, edad){
    this._nombre = nombre;
    this._apellido = apellido;
    this._edad = edad;
    this._idPersona = ++Persona.contadorPersonas;
  }

  get idPersona(){
    return this._idPersona;
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

  get edad(){
    return this._edad;
  }

  set edad(edad){
    this._edad = edad;
  }

  toString(){
     return "idPersona: " + this._idPersona + " nombre: " + this._nombre + " apellido: " + this._apellido + " edad: " + this._edad;
  }
}

class Empleado extends Persona{
  static contadorEmpleados = 0;
  constructor(nombre, apellido, edad,sueldo){
    super(nombre, apellido, edad);
    this._sueldo = sueldo;
    this._idEmpleado = ++Empleado.contadorEmpleados;
  }

  get idEmpleado(){
    return this._idEmpleado;
  }

  get sueldo(){
    return this.sueldo;
  }

  set sueldo(sueldo){
    this._sueldo =sueldo;
  }

  toString(){
    return super.toString() + " idEmpleado: " + this._idEmpleado + " sueldo: " + this._sueldo;
  }
}

class Cliente extends Persona{
  static contadorClientes = 0;

  constructor(nombre, apellido, edad,fechaDeRegistro){
    super(nombre, apellido, edad);
    this._fechaDeRegistro = fechaDeRegistro;
    this._idCliente = ++Cliente.contadorClientes;
  }

  get idCliente(){
    return this._idCliente
  }

  get fechaDeRegistro(){
    return this._fechaDeRegistro
  }

  set fechaDeRegistro(fechaDeRegistro){
    this._fechaDeRegistro = fechaDeRegistro;
  }

  toString(){
    return super.toString() + " idCliente: " + this._idCliente + " fechaDeRegistro: " + this._fechaDeRegistro;
  }
}

let persona1 = new Persona("Ramiro","Perez",22);
console.log(persona1);

let empleado1 = new Empleado("Chucho", "Ramirez",22, 500);
console.log(empleado1);

let cliente1 = new Cliente("Johana", "Todd", 23, new Date());
console.log(cliente1);
~~~

### 706, 707, 708, 709, 710.-
Ventas.js
~~~javaScript
class Producto{
  static contadorProductos = 0;
  constructor(nombre, precio){
    this._idProducto = ++Producto.contadorProductos;
    this._nombre = nombre;
    this._precio = precio;
  }

  get idProducto(){
    return this._idProducto;
  }

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get precio(){
    return this._precio;
  }

  set precio(precio){
    this._precio = precio;
  }

  toString(){
    return "idProducto: " + this._idProducto + " nombre: " + this._nombre + " precio: " + this._precio;
  }
}

class Orden{
  static contadorOrdenes = 0;
  constructor(){
    this._idOrden = ++Orden.contadorOrdenes;
    this._productos = [];
  }

  static get MAX_PRODUCTOS(){
    return 5;
  }

  agregarProductos(producto){
    if(this._productos.length < Orden.MAX_PRODUCTOS){
      this._productos.push(producto);
    }else{
      console.log("la orden a superado el numero maximo de productos");
    }
  }

  calcularTotal(){
    if(this._productos != 0){
      let total = 0;
      for (let i = 0; i < this._productos.length; i++) {
        total += this._productos[i].precio;
      }
      return "el total de la orden es: " + total;
    }else{
      console.log("la orden no tiene productos");
    }
  }

  toString(){
    return "idOrden " + this._idOrden+ " productos: " + this._productos;
  }
}

let orden1 = new Orden();

let producto1 = new Producto("chicles", 2);
console.log(producto1);
let producto2 = new Producto("mouse", 500);
console.log(producto2);
let producto3 = new Producto("rancheritos", 1441);
console.log(producto3);

orden1.agregarProductos(producto1);
orden1.agregarProductos(producto2);
orden1.agregarProductos(producto3);

console.log(orden1);

console.log(orden1.calcularTotal());


~~~

### 711, 712, 713, 714, 715, 716, 717.-
MundoPC.js
~~~javaScript
'use strict';

class DispositivoEntrada{
  constructor(tipoEntrada, marca){
    this._tipoEntrada = tipoEntrada;
    this._marca = marca;
  }

  get tipoEntrada(){
    return this._tipoEntrada;
  }

  set tipoEntrada(tipoEntrada){
    return this._tipoEntrada = tipoEntrada;
  }

  get marca(){
    return this._marca;
  }

  set marca(marca){
    return this._marca = marca;
  }

  toString(){
    return "tipoEntrada: " + this._tipoEntrada + " marca: " + this._marca;
  }
}

class Raton extends DispositivoEntrada{
  static contadorRatones = 0;
  constructor(tipoEntrada, marca){
    super(tipoEntrada, marca);
    this.idRaton = ++Raton.contadorRatones;
  }

  toString(){
    return super.toString + " idRaton: " + this._idRaton;
  }
}

class Teclado extends DispositivoEntrada{
  static contadorTeclados = 0;
  constructor(tipoEntrada, marca){
    super(tipoEntrada, marca);
    this.idTeclado = ++Teclado.contadorTeclados;
  }

  toString(){
    return super.toString + " idTeclado: " + this._idTeclado;
  }
}

class Monitor{
  static contadorMonitores = 0;
  constructor(marca, tamano){
    this._marca = marca;
    this._tamano = tamano;
    this._idMonitor = ++Monitor.contadorMonitores;
  }

  get idMonitor(){
    return this._idMonitor;
  }

  get marca(){
    return this._marca;
  }

  set marca(marca){
    this._marca = marca;
  }

  get tamano(){
    return this._tamano;
  }

  set tamano(tamano){
    this._tamano = tamano;
  }

  toString(){
    return "idMonitor: " + this._idMonitor + " marca: " + this._marca + " tamaño: " + this._tamano;
  }
}

class Computadora{
  static contadorComputadoras = 0;
  constructor(nombre, monitor, teclado, raton){
    this._nombre = nombre;
    this._monitor = monitor;
    this._teclado = teclado;
    this._raton = raton;
    this._idComputadora = ++Computadora.contadorComputadoras;
  }

  get idComputadora(){
    return this._idComputadora;
  } 

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get monitor(){
    return this._monitor;
  }

  set monitor(monitor){
    this._monitor = monitor;
  }

  get teclado(){
    return this._teclado;
  }

  set teclado(teclado){
    this._teclado = teclado;
  }

  get raton(){
    return this._raton;
  }

  set raton(raton){
    this._raton = raton;
  }

  toString(){
    return "idComputadora: " +this.idComputadora
    + " nombre: "+this._nombre
    + " monitor: "+this._monitor
    + " teclado: "+this._teclado
    + " raton: "+this._raton; 
  }
}

class Orden{
  static contadorOrdenes = 0;
  constructor(){
    this._idOrden = ++Orden.contadorOrdenes;
    this._computadoras = [];
  }

  agregarComputadora(computadora){
    this._computadoras.push(computadora);
  }

  mostraOrden(){
    this._computadoras.forEach(computadora => {
      console.log(computadora);
    });
  }

  get idOrden(){
    return this._idOrden;
  }

  get computadoras(){
    return this._computadoras;
  }

  set computadoras(computadoras){
    this._computadoras = computadoras;
  }

  toString(){
    return "idOrden: " + this._idOrden + " computadoras: " + this._computadoras;
  }
}

let raton1 = new Raton("raton", "marcanius");
console.log(raton1);
let raton2 = new Raton("raton", "Razer");
console.log(raton2);

let teclado1 = new Teclado("teclado", "marcanius");
console.log(teclado1);
let teclado2 = new Teclado("teclado", "Razer");
console.log(teclado2);

let monitor1 = new Monitor("marcanius", "3 pulgadas");
console.log(monitor1);
let monitor2 = new Monitor("razer", "20 pulgadas");
console.log(monitor2);

let computadora1 = new Computadora("computadora1", monitor1, teclado1, raton1);
let computadora2 = new Computadora("computadora2", monitor1, teclado1, raton2);
let computadora3 = new Computadora("computadora3", monitor1, teclado2, raton1);
let computadora4 = new Computadora("computadora4", monitor1, teclado2, raton2);
let computadora5 = new Computadora("computadora5", monitor2, teclado1, raton1);
let computadora6 = new Computadora("computadora6", monitor2, teclado1, raton2);
let computadora7 = new Computadora("computadora7", monitor2, teclado2, raton1);
let computadora8 = new Computadora("computadora8", monitor2, teclado2, raton2);

let orden = new Orden();

orden.agregarComputadora(computadora1);
orden.agregarComputadora(computadora2);
orden.agregarComputadora(computadora3);
orden.agregarComputadora(computadora4);
orden.agregarComputadora(computadora5);
orden.agregarComputadora(computadora6);
orden.agregarComputadora(computadora7);
orden.agregarComputadora(computadora8);

orden.mostraOrden();
~~~

### 718, 719, 720, 721.-
la sobreescritura es ponerle el mismo nombre a la funcion que tiene el padre en el hijo y asi se puede sobreescribir la funcion

polimorfismo quiere decir multiples formas 

podemosa saber de que clase sea 
if(tipo instanceof empleado1) true or false

el instance of nos puede reconocer como true si preguntamos por la clase padre a una clase hija, porque esta hereda de su padre

### 722, 723, 724, 725.-
~~~javaScript
'use strict'

//el bloque try catch hace que 
//se intente algo y capura el error si ocurre
//pero no hace que el programa colapse abruptamente
let resultado = -1;
try {
  //x =10;
  //el throw hace que podemos hacer nuestros propios errores
  if(isNaN(resultado))throw"no es un numero"
} catch (error) {
 console.log(error); 
}
finally{
  //siempre se ejecuta este bloque de codigo,
  //aunque lance o no el error 
}


//funciones flecha o funciones anonimas 
let miFuncionFlecha = () =>{
  console.log("saludos desde mi funcion flecha");
}

miFuncionFlecha();

const funcionesConParametros = (mensaje) => console.log(mensaje);

funcionesConParametros("hola");

~~~

### 726, 727, 728.-
Callbaks
~~~javaScript
//los callbacks son funciones que 
//se pasan como parametros a otras funciones 

function miFuncion1(){
  console.log('funcion1');
}

function miFuncion2(){
  console.log('funcion2');
}

function imprimir(mesnsaje){
  console.log(mesnsaje);
}

function sumar(op1, op2, funcionCallback){
  let res = op1 + op2;
  funcionCallback(`Se imprime el resultado que es: ${res}`);
}

sumar(5,3,imprimir)

//en la funcion callback se usa la funcion que pasamos a la funcion 
//ver el ejemplo anterior 

//los callbacks son para procesos que se ejecutan de manera asincrona 

//lamadas asicnronas con uso setTimeout
function miFuncionCallback(){
  console.log('saludo asincrono despues de 3 segundos')
}

setTimeout(miFuncionCallback, 3000);

miFuncion1();

//con set time out hace que una funcion se dispare despues de 3 segundos 
setTimeout(()=>console.log("saludo asincrono 2 de 5 segundos"), 5000);

//la clase 728 explica muy bien de porque usar 
//funciones asincronas 

//usando set interval
//manda a llamar una funcion cada cierto tiempo

let reloj = () =>{
  let fecha = new Date();
  console.log(`${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
}

//el set interval llama la funcion reloj cada segundo 
setInterval(reloj, 1000);

~~~

### 729, 730, 731, 732, 733.-
~~~javaScript
//las promesas son codigo que tienen varios estados
/*primero se corre el codigo y pasa a pendiente, luego 
pasa a ser resuelto o rechazar*/

//las promesas debenn resivir callbacks
let miPromesa = new Promise((resolver,rechazar)=>{
  let expresion = false;
  if(expresion){
    resolver('Resolvio correcto');
  }else{
    rechazar('Se produjo un error');
  }
});

//se meten callbacks a los parametros
miPromesa.then(valor => console.log(valor),error => console.log(error));

//lo de arriba es lo mimso que esto de abajo 
miPromesa.then(valor => console.log(valor)).catch(error => console.log(error));


//en las promesas no es necsario hacer uso de la parte de error 
//aqui s eve que se puede suar la funcion timeout, para
//hacer asicnrono esto 
let promesa = new Promise(resolver => {
  console.log('Inicio promesa');
  setTimeout(()=> resolver('saludos con promesa y timeput'), 3000);
  console.log('Fin de la promesa');
});

promesa.then(valor => console.log(valor));

//async significa que una funcion esta obligada a regresar una promesa 
//esto hacxe que ya no sea necesario meter el resolver
//por que siempre va a estar activo
async function miFuncionConPromesa(){
  return 'saludos con promesa y async';
}

miFuncionConPromesa().then(valor => console.log(valor));

//await y async
//await espera el resultado de la promesa

async function miFuncionConPromesaYAwait(){
  let miPromesa = new Promise(resolver => {
    resolver('promesa con await');
  });

  //await llama la promesa y espera el resultado 
  //de la promesa y lo imprime
  console.log(await miPromesa);
}

miFuncionConPromesaYAwait();

//promesas await async y setTimeout, esta promesa se 
//realizara despues de cierto tiempo

async function funcionConPromesaAwaitTimeout(){
  let miPromesa = new Promise((resolver)=>{
    setTimeout(() => resolver('Promesa con timeout'), 3000)
  });
  console.log(await miPromesa);
}

//es necsario poner async para poder usar el 
//await dentro de una funcion 
funcionConPromesaAwaitTimeout();
~~~

### 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756.-
Manejo del DOM HTML con JavaScript y Manejo de Eventos con DOM HTML y Javascript
~~~html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title>Document</title>
</head>
<!--este metodo se pone para ver en que momento se carga el body 
de la pagina -->
<body onload="entrar()">
  <h1 id="cabecero">Ejemplo DOM con javascript</h1>
  <p class="parrafo">saludos</p>
  <p class="parrafo">saludos</p>
  <p class="parrafo">saludos</p>

  <h2>Formulario</h2>
  <form action="get" id="formulario">
    <label for="nombre">Nombre: </label>
    <input type="text" name="nombre" id="nombre" placeholder="escribe tu nombre"><br>

    <label for="apellido">Apellido: </label>
    <input type="text" name="apellido" id="apellido" placeholder="escribe tu apellido"><br>
  </form>

  <button onclick="mostrarValores()">Mostrar</button>

  <div id="valores">

  </div>

  <h2>Cambiando imagenes</h2>
  <img id="imagen" src="html5.png" alt="javascript">

  <button onclick="cambioImagen()">Cambiar Imagen</button>

  <h2>Eventos</h2>
  <!--si se le pone on se pueden ver todos los eventos que se le pueden 
  poner en el html-->
  <h3 onclick="cambiarTexto(this)">link que se puede puchurrar</h3>

  <h3 id="titulo3">Titulo que cambia desde javascript</h3>

  <!--el script de javascript debe estar despues de los
  eleemntos que queremos manipular-->
  <script src="script.js"></script>

  <h2>Evento Onchange</h2>
  Nombre: <input type="text" name="nombre1" id="nombre1" onchange="convertir(this)">

  <!--asi se ponemn los onmouse  cuando se pasa sobre el texto o sale del texto-->
  <h2 onmouseover="funcionDeOnmouseOver()">OnmouseOver</h2>
  <h2 onmouseout="funcionDeOnmouseOut()">OnmouseOut</h2>

  <!--asi se ponemn los onmouse  cuando se da click y se levanta el click-->
  <h2 onmousedown="funcionDeOnmouseDown()">OnmouseOver</h2> <!--cuando tenemos el mouse abajo-->
  <h2 onmouseup="funcionDeOnmouseUp()">OnmouseOut</h2> <!--cuando levantamos el click-->
  <h2 onclick="funcionDeonClick()">OnmouseOut</h2> <!--este se hace muy rapido, pero se hace-->

  <!--cuando un evento pierde el focus se le pone el blur-->
  <h2 onfocus="" onblur=""></h2>

</body>
</html>
~~~

~~~javaScript
'use strict'

//accediendo a lo que tiene dentro cabecero
let cabecero = document.querySelector('#cabecero').innerHTML;

console.log(cabecero);

//console.log(document.querySelector('#parrafo').innerHTML);

//cambiando lo que tien el h1 a traves de javascript
document.querySelector('#cabecero').innerHTML = 'nuvo cabecero';

//tomando todos los elementos que tienen una misma etiqueta
//document.getElementsByTagName();

//tomando todos los elementos que tienen esa clase
let parrafos = document.getElementsByClassName('parrafo');
console.log(parrafos);

//usando el query selectorAll agrra todos los elemntos que tienen una misma classe 
//pero este puede ser más especifico como

let parra = document.querySelectorAll('h1.parrafo');

let par = document.querySelectorAll('.parrafo');
console.log(par);

function mostrarValores(){
  //asi accedemos a el formulario, que es el id que le dimos en html
  let formulario = document.forms['formulario'];
  let texto = '';
  //tambien se puede acceder a los valores de esta manera:
  //aqui accedemos al objeto input de name nombre
  let nombre = formulario['nombre'];

  for (let i = 0; i < formulario.length; i++) {
    //con le value se toma el valor de el formulario, lo que la 
    //escribio dentro de el 
    texto += formulario[i].value + ' ';
    
  }
  console.log(texto);

  document.querySelector("#valores").innerHTML = texto;

  //al usar document.write despues de que ya fue compilado toda la
  //pagina este sobreecribe todo el contenido que tenga la pagina 
  //document.write('saludos desde javascript')
}

let ruta1Imagen = "javascript.png";
let ruta2Imagen = "html5.png";
function cambioImagen(){
  let imagen = document.querySelector('#imagen');
  if (imagen.src === ruta1Imagen) {
    imagen.src = ruta2Imagen;
  }else{
    imagen.src = ruta1Imagen;
  }
}

//eventos
function cambiarTexto(texto){
  //aqui podemos hacer esto porque le pasamos 
  //por parametros la refencia del objeto htm que queremos cambiar
  texto.innerHTML = 'otro texto';
}

//añadiendo el llamdo de la funcion en el javascripe en lugar de en el 
//html
let titulo3 = document.querySelector('#titulo3');
titulo3.onclick = cambiaTexto;

function cambiaTexto(){
  titulo3.innerHTML = 'nuevo titulo'
}

function entrar(){
  alert('entrando a la pagina web');
  let texto = '';
  //revisando si las cookies estan habilitadas
  if(navigator.cookieEnabled){
    texto = 'cookies estan habilitadas';
  }else{
    texto = 'las cookies estan deshabilitadas';
  } console.log(texto);
}

function convertir(nombreInput){
  nombreInput.value = nombreInput.value.toUpperCase();
}

//para usar adeventListener necesitamos llamarlo desde javascript
//se escribe igual que en el html, solo que se le quita el "on" de "onclick"
document.querySelector('#nombre').addEventListener('focus',cambiar);
document.querySelector('#nombre').addEventListener('blur',regresar);
document.querySelector('#apellido').addEventListener('focus',cambiar);
document.querySelector('#apellido').addEventListener('blur',regresar);

//funciones flecha con addEventListener
document.querySelector('#nombre').addEventListener('focus',(evento) => {
  evento.target.style.background = 'pink';
});
document.querySelector('#nombre').addEventListener('blur',(evento) => {
  evento.target.style.background = 'white';
});

//tambien es posible hacer que se le aplique todos los event listeners 
//a todos los elementos de un formulario 
const forma = document.getElementById('forma');
forma.addEventListener('focus', cambiar);
forma.addEventListener('focus',(evento) => {
  evento.target.style.background = 'pink';
}, true);
forma.addEventListener('blur',(evento) => {
  evento.target.style.background = 'white';
}, true);


function cambiar(evento){
  //esto hace referencia al elemento u objetop que lanza el evento
  let componente = evento.target;
  componente.style.background = 'yellow';
}

function regresar(evento){
  let componente = evento.target;
  componente.style.background = 'white';
}
~~~

### 757, 758, 759, 760.-
Calculadora
este proyecto no tiene css porque se hiz con clases a traves de boostrap
~~~html
<!doctype html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <h1 class="m-3 mb-5 mt-5">Aplicación Calculadora</h1>
      <form id="calculadora">
        <div class="mt-3 mb-3">
          <label for="operacionA" class="form-label">Operacion A</label>
          <input type="number" class="form-control" placeholder="Operacion A" aria-label="Recipient's username" aria-describedby="basic-addon2" id="operacionA">
        </div>
        <div class="mt-3 mb-3">
          <label for="operacionB" class="form-label">Operacion B</label>
          <input type="number" class="form-control" placeholder="Operacion B" aria-label="Recipient's username" aria-describedby="basic-addon2" id="operacionB">
        </div>
        <button type="submit" class="btn btn-outline-primary" >Sumar</button>
        <div class="mt-3" id="resultado">
        </div>
      </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="js/script.js"></script>
  </body>
</html>
~~~

~~~javaScript
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
~~~

### 761, 762, 763, 764, 765.-
Listado de personas
~~~html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles/style.css">
  <title>Listado de Personas</title>
</head>
<body>
  <h1>Listado de personas</h1>

  <div id="nombres">
    <ul id="listaNombres">
    </ul>
  </div>

  <div id="agregar">
    <div id="boton_sumar">
      <button id="agregar_nombre">+</button>
    </div>

    <div id="campos">
      <input type="text" id="nombre" placeholder="Nombre">
      <input type="text" id="apellido" placeholder="Apellido">
    </div>


    <script src="js/app.js"></script>
  </div>
</body>
</html>
~~~

~~~css
* {
  padding: 0;
  margin: 0;
  font-family: "Franklin Gothic Medium", "Arial Narrow", Arial, sans-serif;
}

body {
  background: linear-gradient(to right, #00878b, #1c8df1);
}

h1 {
  background-color: #3c55bd;
  width: 550px;
  color: white;
  text-align: center;
  font-size: 35px;
  letter-spacing: 5px;
  padding: 15px;
  border-radius: 5px;
  margin: 0px auto;
  margin-top: 55px;
}

#nombres {
  background-color: white;
  width: 500px;
  margin: 0px auto;
  padding: 40px;
  border-radius: 5px;
  margin-top: 55px;
  height: auto;
}

#agregar {
  background-color: white;
  width: 580px;
  margin: 0px auto;
  border-radius: 5px;
  margin-top: 55px;
  height: 100px;
}

#boton_sumar {
  margin: 0px auto;
  text-align: center;
  border-radius: 5px;
}

#boton_sumar button {
  height: 50px;
  
  width: 50px;
  border-radius: 90px;
  border: 0px;
  background-color: #3c55bd;
  color: white;
  font-size: 35px;
  margin-top: 5px;
}

#boton_sumar button:hover {
  cursor: pointer;
  background-color: #00878b;
}

#campos{
  display: flex;
  justify-content: space-around;
  margin-top: 15px;
}

input[type=text]{
  border: 0px;
  font-size: 20px;
  text-align: center;
}

~~~

~~~javaScript
let botonAgregarNombre= document.getElementById('agregar_nombre');
botonAgregarNombre.addEventListener('click',agregarNombre);
let lista = document.getElementById('listaNombres');
let nombre = document.getElementById('nombre');
let apellido = document.getElementById('apellido');



function agregarNombre(){
  let listItem = document.createElement("li");
  let nombreCompleto = nombre.value + " " + apellido.value;
  listItem.textContent = nombreCompleto;
  lista.appendChild(listItem);
  nombre.value = "";
  apellido.value = "";
}
~~~

### 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787.-
index.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles/style.css">
  <title>Document</title>
</head>
<body>

  <header>
    <h3>Presupuesto Disponible:</h3>

    <h1 id="presupuestoValor">$800.00</h1>

    <div id="ingresosEgresosHeader">

      <div id="ingresosTotalesBox" class="totales">
        <div class="ingresosEgresosHeaderText">Ingresos</div>
        <div id="ingresoGeneral">$ 2,100.00 <div class="porcentajeVacio"></div></div>
      </div>

      <div id="egresosTotalesBox" class="totales">
        <div class="ingresosEgresosHeaderText">Egresos</div>
        <div id="egresoGeneral">- $ 1,300.00<div class="porcentaje">61.90%</div></div>
      </div>

    </div>
    
  </header>

  <div id="agregar">

    <select id="sumaResta" name="iOe" class="elementoAgregar">
      <option value="ingreso">+</option>
      <option value="egreso">-</option>
    </select>

    <input id="conceptoAgregar" type="text" class="elementoAgregar" placeholder="Nuevo Concepto">

    <input id="valorNumero" type="number" class="elementoAgregar" name="valorNumero" placeholder="100">

    <button id="botonAgregar" class="elementoAgregar textoVerde"><ion-icon name="checkmark-circle-outline"></ion-icon></button>
  
  </div>

  <div id="cajaIngresoEgreso">

    <div class="cuerpo">
      <h3 id="cajaIngresoText" class="textoVerde">INGRESOS</h3>
      <div id="listaIngresos">

        <!--aqui van los elementos que se ponen atraves de javascript
        de tipo ingreso-->

      </div>
    </div>

    <div class="cuerpo">
      <h3 id="cajaEgresoText" class="textoRojo">EGRESOS</h3>
      <div id="listaEgresos">

        <!--aqui van los elementos que se ponen atraves de javascript
        de tipo egreso-->

      </div>
  </div>


  <!--los datos que vamos a usar-->
  <script src="js/Dato.js"></script>
  <script src="js/Ingeso.js"></script>
  <script src="js/Egreso.js"></script>
  <!--main de la pagina-->
  <script src="js/app.js"></script>
  <!--haciendo el link para que funcionen los iconos-->
  <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>
~~~

style.css
~~~css
*{
  padding: 0;
  margin: 0;
}

.textoRojo{
  color: #D18576;
}

.textoVerde{
  color: #70B6C0;
}

button:hover{
  cursor: pointer;
}

header{
  background: linear-gradient(to right, #EB342E, #6A5191);
  color: white;
  text-align: center;
  font-family: Arial, Helvetica, sans-serif;
  padding: .1px;
}

header h1,h3{
  font-weight: normal;
}

header h3{
  font-size: 30px;
  letter-spacing: 2px;
  margin-top: 20px;
}

header h1{
  margin: 30px;
  font-size: 70px;
}

#ingresosEgresosHeader{
  width: 450px;
  margin: 0px auto;
}

#ingresosTotalesBox{
  background-color: #1CAAB7;
}

#egresosTotalesBox{
  background-color: #FF6046;
}

.totales{
  display: flex;
  justify-content: space-between;
  padding: 15px;
  margin-bottom: 15px;
}

.ingresosEgresosHeaderText{
  text-transform: uppercase;
}

.porcentaje, .porcentajeVacio, .porcentajeEgreso{
  width: 60px;
  height: 20px;
  float: right;
  margin-left: 10px;
  line-height: 20px;
}
.porcentaje, .porcentajeEgreso{
  background-color: #FF816F;
  font-size: 12px;
  border-radius: 11px;;
}

.porcentajeEgreso{
  background-color: #FFDED9;
  text-align: center;
}



#agregar{
  display: flex;
  background-color: #F7F7F7;
  height: 60px;
  justify-content: center;
}

.elementoAgregar{
  margin: 11px 8px;
  border: 2px solid #f1f1f1a1;
  border-radius: 5px;
}

#sumaResta{
  width: 50px;
  padding-left: 8px;
}

#conceptoAgregar{
  width: 450px;
}

#valorNumero{
  width: 100px;
  
}

#botonAgregar{
  background-color: transparent;
  font-size: 30px;
  margin-top: 16px;
  border: none;
}

#cajaIngresoEgreso{
  display: flex;
  justify-content: center;
}

.cuerpo{
  margin: 32px;
  margin-top: 50px;
}

#cajaIngresoText, #cajaEgresoText{
  border-bottom: 1px solid #e7dfdf;;
  padding-bottom: 10px;
}

.elemento {
  display: flex;
  position: relative;
  padding: 12px;
  border-bottom: 1px solid #e7dfdf;;
  font-size: 19px;
  color: #848488;
  width: 400px;
  justify-content: space-between;
  transition: all .3s;
}

.valor{
  transition: all .3s;
}



.eliminar{
  position: absolute;
  border: none;
  background-color: transparent;
  font-size: 22px;
  font-weight: bolder;
  right: 10px;
  display: inline-block;
  opacity: 0;
  transition: all .3s;
}

.elemento:hover .eliminar{opacity: 1;}
.elemento:hover .valor{
  transform: translateX(-25px);
}
~~~

app.js
~~~javaScript
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
~~~

Dato.js
~~~javaScript
class Dato{
  constructor(concepto, valor){
    this._concepto = concepto;
    this._valor = valor;
  }

  get concepto(){
    return this._concepto;
  }

  set concepto(concepto){
    this.concepto = concepto;
  }

  get valor(){
    return this._valor;
  }

  set valor(valor){
    this.valor = valor;
  }
  
}
~~~

Ingreso.js
~~~javaScript
class Ingreso extends Dato{
  static contadorIngresos = 0;
  constructor(concepto, valor){
    super(concepto, valor)
    this._idIngreso = ++Ingreso.contadorIngresos;
  }

  get idIngreso(){
    return this._idIngreso;
  }
}
~~~

Egreso.js
~~~javaScript
class Egreso extends Dato{
  static contadorEgresos = 0;
  constructor(concepto, valor){
    super(concepto, valor)
    this._idEgreso = ++Egreso.contadorEgresos;
  }

  get idEgreso(){
    return this._idEgreso;
  }
}
~~~

### 788.-
Promocion a sus demas cursos

----------------------------------------------------
AQUI YA SE TERMINARON LOS MODULOS DE HTML CSS Y JAVASCRIPT
----------------------------------------------------
### 196, 197.-
introdccion a www y la instalacion de glassfish

### 198.-
ESTA CLASE ES IMPORTANTE PORQUE VEMOS COMO INICIAR CON UN PROYECTO DE JAVA WEB
Hola mundo con java web 

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Hola mundo Java Web!</h1>
    </body>
</html>
~~~

### 199.-
ESTA CLASE ES IMPORTANTE PORQUE VEMOS COMO INICAR UN SERVLET
Hola mundo con servlets

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>LLamando al servlet</h1>
        <a href="/HolaMundoServlets/HolaMundo">Servlet Hola mundo</a>
    </body>
</html>
~~~

HolaMundo.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//aqui hacemos que podamos acceder a el servlet
@WebServlet("/HolaMundo")
//los servlets son clases de java solo que extienden de los HttpServlets
public class HolaMundo extends HttpServlet{
    
  /*
  cual es el metodo que vamos a procesar en el servlet?
  si lo llamamos directamente desde el navegador entonces la llamada se conoce como 
  peticion get

  si utilizamos un fopmulario, va a ser una peticion post, va a hacer una peticion 
  de tipo post a nuestro servlet 

  todo esto se puede hacer con el metodo doGet o doPost
  */

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    //le ponemos que tipo de respuesta es la que le vamos a dar
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    //se recominda no responder en html a traves de servlets 
    out.println("Hola Mundo desde Servlets");
  }

  //despues de darle clean and bulid nos genera un archivo .war
}
~~~


### 200 201.-
LECCION y ejercicio de servlets

los servlets son clases de javascript que se encargan de procesar las peticiones en formato http

asi se copmienza la comunicacion entre cliente y srvidor 

index.html
~~~html
<!DOCTYPE html>

<html lang="es">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Formulario servlet</title>
  </head>
  <body>
    <h1>Formulario servlet</h1>

    <!--aqui ponemos el nombre de nuestra apliacuion y el nombre de 
    nuestro servlet
    utilizamos el metodo post ya que por default esta en get y esto se vera
    en el url cuando se mande la informacion
    -->
    <form name="form1" action="/ManejoParametros/Servlet" method="post">
        <!--el metodo post va a mandar 2 parametros, el usuario y el 
        password, estos van a ser reconocidos por el "name"-->
        Usuario: <input type="text" name="usuario">
        <br>
        Password: <input type="password" name="password">
        <br>
        <input type="submit" value="Enviar">

    </form>
  </body>
</html>
~~~

servlets.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//este es el nombre con el cual sera llamado el servlet
//esto es puesto en el action por parte del form 
@WebServlet("/Servlet")
//para que esta clase realmente sea un servlet, forzosamente 
//debe extender de HttpServlet
public class Sevlet extends HttpServlet {
    
    @Override
    //debeos sobreescribir el metodo doPost de esta manera porque estas son las 
    //cosas que se necesitan para hacer la peticion, pero tambien sobreescribimos
    //el metodo doPost porque es el que estamos llamando en el formulario
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //ahora porcesamos los parametros que nos manda el formulario y le mandamos una respuesta

        //LEER LOS PARAMETROS DEL FORMUARIO HTML
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        //esto lo va a imprimir dentro de la consola de glasfish
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);

        PrintWriter out = response.getWriter();
        //se puede manejar codigo html, pero no es lo mejor 
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br>");
        out.print("El parametro password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
~~~

### 202, 203, 204, 205, 206.-

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Ejercicio Formulario</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css">
    </head>
    <body>
        <!--llamando al componente Servlet
        le ponemos onsubmit porque queremos que al dar submit este llame a una funcion en 
        javascript para ver si el formulario es correcto-->
        <form name="form1" action="/ManejoFormulariosEnHTML/Servlet" method="post" onsubmit="return validarForma(this)">
            <!--es pisible mandar datos ocultos en los formularios y esta es la manera
            toda la informacion la checaremos en el servlet -->
            <input type="hidden" name="oculto" value="valorOculto"/>

            <table width="200" id="enfasisColumna">
                <caption>
                    Formulario Registro de Datos
                </caption>

                <tr>
                    <td class="columna">
                        Usuario: (*)
                    </td>
                    <td>
                        <input class="default" type="text" name="usuario" placeholder="Escribir Usuario" id=""/>
                    </td>
                </tr>

                <tr>
                    <td class="columna">
                        Password: (*)
                    </td>
                    <td>
                        <input class="default" type="password" name="password" placeholder="Password" id=""/>
                    </td>
                </tr>

                <tr>
                    <td class="columna">
                            Tecnologias de Internet: (*)
                    </td>
                    <td>
                        <!--los checkbox pueden seleccionar varios elementos-->
                        Java <input type="checkbox" name="tecnologia" value="java">
                        &nbsp; &nbsp; &nbsp;
                        .Net <input type="checkbox" name="tecnologia" value="net">
                        &nbsp; &nbsp; &nbsp;
                        Php <input type="checkbox" name="tecnologia" value="php">
                    </td>
                </tr>

                <tr>
                    <td class="columna">
                            Genero: (*)
                    </td>
                    <td>
                        Hombre <input type="radio" name="genero" value="H">
                        &nbsp; &nbsp; &nbsp;
                        Mujer <input type="radio" name="genero" value="M">
                        &nbsp; &nbsp; &nbsp;
                    </td>
                </tr>

                <tr>
                    <td class="columna">
                            Ocupacion: (*)
                    </td>
                    <td>
                       <select name="ocupacion" class="default">
                        <option value="">Seleccionar</option>
                        <option value="1">Profesor</option>
                        <option value="2">Ingeniero</option>
                        <option value="3">Jubilado</option>
                        <option value="4">Otro</option>
                       </select>
                    </td>
                </tr>

                <tr>
                    <td class="columna">
                            Musica favorita:
                    </td>
                    <td>
                       <select name="musica" multiple class="default">
                        <option value="rock">Rock</option>
                        <option value="pop">Pop</option>
                        <option value="salsa">Salsa</option>
                       </select>
                    </td>
                </tr>

                <tr>
                    <td class="columna">
                            Comentarios:
                    </td>
                    <td>
                       <textarea name="comentarios"  cols="30" rows="2" class="default" placeholder="Escribir un texto"></textarea>
                    </td>
                </tr>

                <tr style="text-align: center;">
                    <td>
                        <input type="reset" value="Limpiar" class="default">
                    </td>
                    <td>
                        <input type="submit" value="Enviar" class="default">
                    </td>
                </tr>

            </table>
        </form>

        <script src="recursos/funciones.js"></script>
    </body>
</html>
~~~

estilos.css
~~~css
*, .default{
  line-height: 1.6em;
  font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
  color: #669;
}

#enfasisColumna{
  margin: 45px;
  width: 480px;
  text-align: left;
  border-collapse: collapse;
}

#enfasisColumna caption{
  font-size: 20px;
}

#enfasisColumna th{
  font-size: 14px;
  font-weight: normal;
  padding: 12px 15px;
  color: #038;
}

#enfasisColumna td{
  padding: 10px 15px;
  color: #669;
  border-top: 1px solid #e8edff;
}

.columna{
  background-color: #d0dafd;
  border-right: solid transparent;
  border-left: solid transparent;
}

#enfasisColumna tr:hover td{
  color: #339;
  background-color: #eff2ff;
}
~~~

funciones.js
~~~javaScript
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
~~~

Servlet.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    //tomando los valores que fueron metidos por el usuario
    String usuario = request.getParameter("usuario");
    String password = request.getParameter("password");
    String tecnologias[] = request.getParameterValues("tecnologia");
    String genero = request.getParameter("genero");
    String ocupacion = request.getParameter("ocupacion");
    String musica[] = request.getParameterValues("musica");
    String comentario = request.getParameter("comentarios");

    out.print("");

    out.print("<html>");
    out.print("<head>");
    out.print("<title>Resultado Servlet</title>");
    out.print("</head>");

    out.print("<body>");
    out.print("<h1>Parametro procesados por el Servlet</h1>");
    out.print("<table border='1'>");

    out.print("<tr>");
    out.print("<td>Usuario</td>");
    out.print("<td>");
    out.print(usuario);
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Password</td>");
    out.print("<td>");
    out.print(password);
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Tecnologias</td>");
    out.print("<td>");
    for (String tecnologia : tecnologias) {
      out.print(tecnologia);
      out.print(" / ");
    }
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Género</td>");
    out.print("<td>");
    out.print(genero);
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Ocupacion</td>");
    out.print("<td>");
    switch (Integer.parseInt(ocupacion)) {
      case 1:
        out.print("Profesor");
        break;
      
      case 2:
        out.print("Ingeniero");
        break;
      
      case 3:
        out.print("Jubilado");
        break;

      case 4:
        out.print("Otro");
        break;
    
      default:
        out.print("Dato no valido, revisar codigo");
        break;
    }
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Musica Favorita</td>");
    out.print("<td>");

    if (musica != null) {
      for (String musicaSola : musica) {
        out.print(musicaSola);
        out.print(" / ");
      }
    } else{
      out.print("musica favorita no proporcionada");
    }
    
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Comentarios</td>");
    out.print("<td>");
    if (comentario!=null) {
      out.print(comentario);
    }else{
      out.print("no se ha dejado un comentario");
    }
    
    out.print("</td>");
    out.print("</tr>");
  
  
    out.print("</table>");
    out.print("</body>");
    out.print("</html>");
  }
}
~~~

### 207, 208.-
los cabeceros de peticion permiten obtener datos de la peticion http y existen metodos de la clase HttpServletRequest que podemos aplicarles, en la clase se pueden ver los diferentes metodos que existen pero solo siendo explicados (207)

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo Cabeceros</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo Cabeceros</h1>
        <!--los links hacen una peticion al servidor de tipo get -->
        <a href="/ManejoCabeceros2/SerletHeaders">Link al ServletHeaders</a>
    </body>
</html>

~~~

Servlet.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SerletHeaders")
public class Servlet extends HttpServlet{
    
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String metodoHttp = request.getMethod();

    out.print("<html>");
    out.print("<head>");
    out.print("<title>Headers http</title>");
    out.print("</head>");

    out.print("<body>");
    out.print("<h1>Headers http</h1>");

    out.print("Metodo http: " + metodoHttp);

    out.print("<br>");
    String uri = request.getRequestURI();
    out.print("Uri solicitada: " + uri);

    //imprimir todos los cabeceros
    out.print("<br>");
    out.print("<br>");
    out.print("<h2>Todos los cabeceros</h2>");
    Enumeration cabeceros = request.getHeaderNames();
    while (cabeceros.hasMoreElements()) {
      String nombreCabecero =(String) cabeceros.nextElement();
      out.print("<b>" + nombreCabecero + "</b>");
      out.print(request.getHeader(nombreCabecero));
      out.print("<br>");
    }

    out.print("</body>");
    out.print("</html>");
    out.close();
  }
}
~~~

### 209, 210.-
en esta clase (209) podemos ver como el servidor puede responder a el elemento que lo llama, haciendo que la pagina haga lo que tenga que hacer con el estado del servidor 

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Codigos de Estado</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Codigos de estado</h1>
        <fieldset>
            <legend>Formulario de Autorizacion</legend>
            <form name="form1" action="/ManejoCodigosEstado/Servlet" method="post">
                Usuario: <input type="text" name="usuarioVal">
                <br>
                Password: <input type="password" name="password">
                <br>
                <input type="submit" value="Enviar">
            </form>
        </fieldset>
    </body>
</html>

~~~

Servlets.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
      //simulando los valores correctos
      String usuarioOk = "Juan";
      String passwordOk = "123";

      String usuario = request.getParameter("usuarioVal");
      String password = request.getParameter("password");

      PrintWriter out = response.getWriter();

      if (usuarioOk.equals(usuario) && passwordOk.equals(password)) {
        
        out.print("<h1>Datos correctos</h1>");
        out.print("Usuario: " + usuario);
        out.print("<br>Password: " + password);
      }else{
        //si no es correcto el usuario y la contraseña el servidor le informara
        //que las credenciales no son cotrrectas
        response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        System.out.println(usuario);
        System.out.println(password);
      }
    }
}

~~~

### 211, 212.-
CABECEROS DE RESPUESTA CON SERVLETS
los cabeceros de respuesta son muy utiles, ya que estos son capaces de generar archivos de excel, pdfs, video, etc, por ende tenemos que aprender este tipo de respuestas estos son tipos MIME

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo Cabeceros de Respuesta</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo Cabeceros de Respuesta</h1>

        <a href="/CabewcerosRespuesta/GenereacionExcelServlet">Link al Servlet que genera un excel</a>
        <br>
        <a href="/CabewcerosRespuesta/HoraServlet">Link al Servlet que actualiza la hora cada segundo</a>
    </body>
</html>
~~~

HoraServlet.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      response.setContentType("text/html;charset=UTF-8");
      //con esto indicamos que se va a refrescar esto cada segundo
      response.setHeader("refresh", "1");
      Date fecha = new Date();
      SimpleDateFormat fomateador= new SimpleDateFormat("'Hola actualizada' HH:mm:ss");
      String horaConFormato = fomateador.format(fecha);
      PrintWriter out = response.getWriter();
      out.print("Hora actualizada: " + horaConFormato);
      out.close();
    }
}
~~~

GeneracionExcelServlet.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GenereacionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      //aqui se le pone con que tipo de archivo s ele va a responder
      response.setContentType("application/vnd.ms-excel");
      //con esto le damos a entender que cuando pulsemos el link este 
      //va a descargar el archivo excel
      response.setHeader("Content-Disposition", "arratchment/filename=excelEjemplo.xls");
      //pasa uso más profesional de excel poi.apache org

      //hacer que no guarde informacion previa, que no se guarde cache en el navegador
      response.setHeader("Pragma", "no-cache");
      response.setHeader("Chache-Control", "no-store");
      //hacer que expire inmediatamante
      response.setDateHeader("Expires", -1);

      //desplegamos la informacion al cliente
      PrintWriter out = response.getWriter();
      //los \t son tabuladroes
      //en una celda ponemos el valor = "Valores"
      out.println("\tValores");
      //en otra celda ponemos el valor = "1"
      out.println("\t6");
      out.println("\t12");
      //para tener un poco más de 3explicacion ver la clase 212 ya que ahi se 
      //explica muy bien como se "veria" en excel
      out.println("Total\t=SUMA(B2:B3)");
      out.close();
    }
}

~~~
### 213, 214.-
MANEJO DE COOKIES

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Manejo de cookies</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Manejo cookies</h1>
        <a href="/ManejoCookies/CookiesServlet">Link al servlet de manejo de cookies</a>
    </body>
</html>
~~~

CookiesServlets
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      //supoonemois que el usuario visita por primera vez nuestro sitio
      boolean nuevoUsuario = true;

      //obtenemos el arreglo de cookies
      //obtenemos todas las cookies que tenemos del lado del cliente
      Cookie[] cookies = request.getCookies();

      //buscamos si ya existe una cookie creada con anterioridad
      //llamada visitanteRecurrente

      if (cookies != null) {
        for (Cookie c : cookies) {
          if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
            //si ya existe la cookie es un usuario recurrente
            nuevoUsuario = false;
            break;
          }
        }
      }
      String mensaje = null;
      if (nuevoUsuario) {
        Cookie visitanteRecurrente = new Cookie("visitanteRecurrente", "si");
        response.addCookie(visitanteRecurrente);
        mensaje = "Gracias por visitar nuestro sitio por primera vez";
      }else{
        mensaje = "Gracias por visitar nuevamente nnuetsro sitio";
      }

      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();

      out.print("Mensaje: " + mensaje);
      out.close();
    }
}
~~~


### 215.-
EJECICIO CONTADOR CON COOKIES

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Cookie contador</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Cookie contador</h1>
        <a href="/CookiesContador/CookieContadorServlet">Link a cookie contador</a>
    </body>
</html>
~~~

CookieContadorServlet.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieContadorServlet")
public class CookieContadorServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      //suponemos que el usuario visita por primera vez nuestro sitio
      int contadorCookie = 0;

      //Obtenemos el arreglo de cookies
      Cookie[] cookies = request.getCookies();

      //buscamos si ya existe una cookie ccreada con anterioridad
      //llamada cookie contador
      
      if (cookies != null) {
        for (Cookie cookie : cookies) {
          if (cookie.getName().equals("contador")) {
            //este usuario ya es recurrente porque tiene una cookie
            contadorCookie = Integer.parseInt(cookie.getValue());
            break;
          }
        }
      }
      //incrementamos en uno el contador
      contadorCookie ++;
      //agregamos la respuesta al navegador
      Cookie c = new Cookie("contador",  Integer.toString(contadorCookie));
      //la cookie se almacenara en el cliente por una hora
      c.setMaxAge(3600);
      response.addCookie(c);

      //mandamos el mensaje al navegador
      response.setContentType("text/html;charset-UTF=8");
      PrintWriter out = response.getWriter();
      out.print("contador de visitas de cada cliente: " + contadorCookie);
      out.close();
    }
}

~~~

### 216, 217.-
HTTP SESSION, sesiones http 
index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo de Sesiones</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo de Sesiones</h1>
        <hr>
        <a href="/EjemploHttpSession/SesionesServlet">Link que maneja sesiones</a>
    </body>
</html>
~~~

SesionesServlet.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      response.setContentType("text/html;charset=UTF-8");

      //con esto pedimos la sesion del que pide el servlet, si esta no se encuentra 
      //este mismo codigo va a crear una sesion sin necesidad de verificar nada 
      //de otra manera 
      HttpSession sesion = request.getSession();

      String titulo = null;

      //pedir el atributo contadorVisitas a la sesion 
      Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
      //si es nulo es la priemra vez que accedemos a la aplicacion 
      if (contadorVisitas == null) {
        contadorVisitas = 1;
        titulo = "Bienvenido por primera vez";
      }else{
        contadorVisitas++;
        titulo = "Bienvenido nuevamente";

      }

      //agregamos el valor a la sesion 
      //si no existe crea este valor, si ya existe solo lo reemplaza
      sesion.setAttribute("contadorVisitas", contadorVisitas);

      //mandamos la respuesta al cliente
      PrintWriter out = response.getWriter();
      out.print(titulo);
      out.print("<br>");
      out.print("no. accesos al recurso: " + contadorVisitas);
      out.print("<br>");
      out.print("ID de la sesion: " + sesion.getId());
    }
}
~~~

la sesion dura abierta 30 minutos por default, si no hacemos más peticiones esta se borra, se almacena en el archivo web.xml en la carpeta WEB-INF  

### 218.-
Ejercicio: Carrito de Compras con HTTPSessions

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Carrito Compras</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo Carrito Compras</h1>
        <form action="/EjemploCarritoCompras/CarritoServlet" method="post" name="form1">
            Articulo a agregar: <input type="text" name="articulo" id="">
            <br>
            <input type="submit" value="Enviar">
            
        </form>
    </body>
</html>
~~~

CarritoServlet.java
~~~java
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServelt extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;charset=UTF-8");

    // creamos o recuepramos el objeto http sesion
    HttpSession sesion = request.getSession();

    // recuperamos la lista de articulos agregados anteriormente
    // si existe
    List<String> articulos = (List<String>) sesion.getAttribute("articulos");

    // verificamos si la lista de articulos existe
    if (articulos == null) {
      // inicialiazamos la lista
      articulos = new ArrayList<>();
      sesion.setAttribute("articulos", articulos);
    }

    // procesamos el articulo nuevo
    String articuloNuevo = request.getParameter("articulo");

    // verifiacmos is el articulo nuevo que llega no es null y si no tiene al valor
    // vacio
    if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
      articulos.add(articuloNuevo);
      sesion.setAttribute("articulos", articulos);
    }

    try (// imprimir la lista de articulos
        PrintWriter out = response.getWriter()) {
      out.print("Lista de Articulos");
      out.print("<br>");

      for (String articulo : articulos) {
        out.print("<li>" + articulo + "</li>");
      }
      // agregamos un link para regresar al inicio
      out.print("<br>");
      out.print("<<a href='/EjemploCarritoCompras'> Regresar al inicio</a>>");
    }
  }
}
~~~

### 219, 220.-
EN LA LECCION 220 HICIMOS UN EJERCICIO CON NUESTRO PRIMERO JSP

en el JSP usamos codigo html pero le incrustamos codigo java, mientras que en el servlet usa codigo java y tenemos que agregarle codigo html internamente con el out.print("<html>")

un jsp es un componente del lado del servidor, no es un html comun 

es una forma de usar codigo html de una manera más facil

~~~jsp
<%-- 
Agregando comentarios en un JSP
    Document   : index
    Created on : 30 may. 2024, 15:26:51
    Author     : USER
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>Hola mundo jsp</h1>
        <ul>
            <%--los <% %> son scriblets, aqui se le puede poner codigo java
            --%>
            <li> <% out.print("Hola mundo con Scriplets"); %> </li>
            <li> ${"Hola mudnoc on expression languahje (EL)"}</li>
            <li> <%= "Esto es igual a poner 'out.print()'" %> </li>
            <li> <c:out value="Hola mundo con JSTL" /></li>

        </ul>
    </body>
</html>

~~~

### 221, 222.-
Elementos de un JSP

los JSP no procesan logica de negocio ni calculos muy complejos, solo despliegan informacion hacia el cliente 


podamos llamar a los jsp desde el index
index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo expresiones JSPs</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo expresiones JSPs</h1>
        <br>
        <a href="expresiones.jsp">Link al JSP de Expresiones</a>
        <br>
        <h4>Formulario HTML</h4>
        <!--no es recomendable llamar directamente a los 
        jsp si no que esto tiene que llamar a un servlet y este servlet 
        decidira a que JSP llamar-->
        <form name="forma1" action="procesaFormulario.jsp">
            Usuario: <input type="text" name="usuario">
            <br>
            Password: <input type="password" name="password">
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
~~~

expresiones.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Con expresiones</title>
    </head>
    <body>
        <h1>JSP Con expresiones</h1>
        Concatenacion:  <%="saludos" + " " + "JSP" %>
        <br>
        <%--Tambien es posible hacer operaciones dentro de las esxpresiones --%>
        Operacion Matematico <%= 2 * 3 / 2 %>
        <br>
        <%--Tambien es posible hacer uso de el id de las sesiones --%>
        Session id: <%= session.getId() %>
        <br>
        <br>
        <a><a href="index.html">Regresar al inicio</a>
    </body>
</html>
~~~

procesaFormulario.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultado de Procesar el Formulario</h1>
        <br>
        <!-- tenemos acceso libre a el request ya que al ser un jsp tiene 
        acceso a los "parametros" como un servlet -->
        Usuario: <%= request.getParameter("usuario")%>
        <br>
        Password: <%= request.getParameter("password")%>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>

~~~

### 223.-
EJERCICIO: SCRIPTLETS CON JSPs

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Hello World!</h1>
        <br>
        <br>
        <a href="scriptlets.jsp">Ejemplos de Scriptlets</a>
        <br>
        <br>
        <form action="fondoColor.jsp">
            Proporciona el color de fondo (ej. red, blue, yellow, white, etc)
            <input type="text" name="colorFondo">
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
~~~

scriptlets.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>Jsp con Scriptlets</h1>
        <br>
        <%-- Scriblet para enviar informacion al navegador --%>
        <%
            out.print("saludos desde un scriplet");
        %>
        
        <%-- Scriblet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("nombre de la aplicacion: " + nombreAplicacion);
        %>
        
        <br>
        
        <%-- Esto no esta bien echo pero se muestra para que se sepas que es posible hacerlo
        pero no es una buena practica--%>
        
        <%-- Scriblet con codigo condicionado --%>
        <%
            if(session != null && session.isNew()){
        %>
        la sesion Si es nueva
        <%
            }else if(session != null){
        %>
        la sesion No es nueva
        <%
            }
        %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
~~~

fondoColor.jsp
~~~jsp
<!DOCTYPE html>
<% 
    String fondo = request.getParameter("colorFondo");
    if(fondo == null || fondo.trim().equals("")){
    fondo = "ehite";
    }

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP cambio de color</title>
    </head>
    <body bgcolor = "<%=fondo%>">
        <h1>JSP cambio de color</h1>
        <br>
        Color de fondo apliado: <%=fondo%>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>

~~~

### 224.-
DECLARACIONES CON JSPs

si esto fuera un simple scriptlet este no es posuble usar el private, ni se pueden usar metodos 

index.jsp
~~~jsp
<%--Agregamos una declaracion de JSP --%>

<%!
//declaramos una variable con su metodo get
private String usuario = "Alberto";

public String getUsuario(){
return this.usuario;
}

//declaramos un contador de visitas
private int contadorVisitas = 1;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones con JSPs</title>
    </head>
    <body>
        <h1>Uso de declaraciones con JSPs</h1>
        Valor de usuario por medio del atributo: <%= this.usuario%>
        <br>
        Valor usuario por medio del metodo: <%=this.getUsuario()%>
        <br>
        <%--y se le puede sumar  --%>
        Contador de visitas: <%= this.contadorVisitas++%>
    </body>
</html>

~~~

### 225.-
DOCUMENTOS CON JSPS (jspx)
al usar un documento jsp se hace con la redaccion x

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo de documentos JSP</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo de documentos JSP</h1>
        <br><!-- comment -->
        <a href="documentoJSP.jspx">Link al JSPx</a>
    </body>
</html>

~~~

documentoJSP.jspx
~~~jspx
<?xml version="1.0" encoding="UTF-8"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">

    <jsp:directive.page contentType="text/html" pageEncoding="UTF-8"/>
    
    <!--Uso de declaraciones -->
    <jsp:declaration>
        private int contadorVisitas = 1;


    </jsp:declaration>
    
    <html>
        <body>
            <h1>ejemplo de un documento JSPx</h1>
            <!--ejemplo de  salida de texto-->
            <jsp:text>Saludos de sde un documento JSPx</jsp:text>
            <br/>
            <jsp:expression> 2 * 3</jsp:expression>
            <br/>
            <!--ejemplo de scriptlet-->
            <jsp:scriptlet>
                String nombreAplicacion = request.getContextPath();
            </jsp:scriptlet>
            Nombre de la aplicacion: <jsp:expression>nombreAplicacion</jsp:expression>
            <br/>
            <jsp:expression>this.contadorVisitas++</jsp:expression>
        </body>
    </html>

</jsp:root>
~~~

### 226, 227, 228.-
DIRECTIVAS CON JSPs

las directivas nos permiten controlar el comportamiento de un jsp

EXCEL JSPs CON DIRECTIVAS

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Generacion de Reporte Excel</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Generacion de Reporte Excel</h1>
        <br>
        <a href="reporteExcel.jsp">Link al reporte de Excel</a>
    </body>
</html>
~~~

reporteExcel.jsp
~~~jsp
<%-- quitamos el meta y el page porque este archivo 
no va a regresar texto en html--%>

<%-- Indicamos el JSP que va a ser el encargado de manegar las excepciones o los errores --%>
<%--lo que queremos hacer es que JSP sea privado por ende lo guardaremos en WEB-INF
ya que estaa carpeta no es accesaible para el navegador--%>
<%@page errorPage="/WEB-INF/manejoErrores.jsp"%>


<%-- importando las clases que vamos a necesitar--%>
<%@page import="utilerias.Conversiones, java.util.Date" %>

<%-- diciendo en que formato vamos a contestar --%>
<%@page contentType="application/vnd.ms-excel" %>

<%
    String nombreArchivo = "reporte.xls";
    //con esto al header le decimos que tipo de dato va a ser
    //y le decimos que descrague el archivo con su respectivo nombre
    //cambiamso esta linea de tecto: response.setHeader("Content-Disposition", "attachment;filename=" + nombreArchivo);
    //que nos decia que se descargaria el archivo y la cambiamos por esta para que muestre la excepcion
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <%-- ahora llenamos el archivo xml --%>
        <h1>Reporte de Excel</h1>
        <br>
        <table>
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            
            <tr>
                <td>1.- Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis basica de Java</td>
                <%-- ahora le damos un valor erroneo para ver como los JSP pueden 
                hacerce cargo de los errores --%>
                <td><%= Conversiones.format("500") %></td>
            </tr>
            
            <tr>
                <td>2.- Programacion con Java</td>
                <td>Poedremos en practica conceptos de la programacion orientada a objetos</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>

~~~

manejoErrores.jsp
~~~jsp
<%-- Indicamos que esta pagina va aser la encargada de procesar los errores
si no ponemos esta linea no tendremos acceso al objeto exeption --%>
<%@page isErrorPage="true"%>

<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de Errores</title>
    </head>
    <body>
        <h1>Manejo de Errores </h1>
        <br/>
        <%-- Con esto solo podemos ver el mensaje general--%>
        Ocurrio una excepcion: <%=exception.getMessage()%>
        <br/>
        <textarea cols="30" rows="5">
                <%-- Con esto imprimimos toda la pila de excepciones--%>
                <% exception.printStackTrace(new PrintWriter(out));%>
        </textarea>
    </body>
</html>
~~~

### 229, 230.-
INCLUSION ESTATICA CON JSPs 

con esto hacemos que archivos sean integrados al servlet que se tiene al final, en este ejemplo tenemos una lista que se carga con Jsps que ya teniamos echos y un html, al cargarse se vuelven parte del codigo del JSP original y lo despliega todo, como añadir pedazos de codigo que ya teniamos echos solo llamandolos 

index.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclision Estatica</title>
    </head>
    <body>
        <h1>Ejemplo Inclision Estatica</h1>
        <br>
        <ul>
            <%-- con esto ya le ponemos que va a ser estatica incluyendolo de 
            esta manera --%>
            <li><%@include file="paginas/noticias1.html"%></li>
            <li><%@include file="paginas/noticias2.jsp"%> </li>
        </ul>
    </body>
</html>

~~~

noticias1.html
~~~html
<!-- no necesitamos agregar los tags de inicio de html -->
<h4>Universidad Java</h4>
<a href="http://universidadjava.com" target="_blank">click para más detalles</a>
~~~

noticias2.jsp
~~~jsp
<!-- no necesitamos agregar los tags de inicio de html -->
<h4>Global Mentoring</h4>
<a href="http://www.globalmentoring.com.mx" target="_blank">click para más detalles</a>
~~~

### 231.-
INCLUSION DINAMICA CON JSPs

conb esto hacemos que se junten los jsps de manera dinamica y no solo cuando se empieza a ejecutar, tambien los parametros se afectan ya que si uno tiene un body de otro color este puede aplastar incluso a quien lo esta llamando 

y al correrlo se llama al servlet de cada uno de los jsp y no los une los jsps y luego los compila en un solo servlet  

index.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclusion Dinamica</title>
    </head>
    <body>
        <h1>Ejemplo Inclusion Dinamica</h1>
        <br>
        <jsp:include page = "paginas/recursoPublico.jsp"></jsp:include>
        <br>
        <jsp:include page ="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow"></jsp:param>
        </jsp:include>
        
    </body>
</html>

~~~

recursoPublico.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br>
        Inclusion de Contenido dinamico desde un JSP publico
        <br>
        Nombre de la aplicacion: <%= request.getContextPath() %>
    </body>
</html>
~~~

recordemos que para hecer un recurso privado es necesario guardar el jsp en la carpeta WEB-INF

recursoPrivado.jsp
~~~jsp
<% 
    String colorFondo = request.getParameter("colorFondo");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor = '<%=colorFondo%>'>
        <h1>Hello World!</h1>
    </body>
</html>
~~~

### 232, 233.-
MANEJO DE VAJABEANS CON JSPs

index.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo JavaBeans</title>
    </head>
    <body>
        <h1>Ejemplo JavaBeans</h1>
        <a href="setterJSP.jsp">Modificar valores de JavaBean de Rectangulo</a>
        <br>
        <a href="getterJSP.jsp">Leer Valores del JavaBean de Rectangulo</a>
        <br>
        <br>
    </body>
</html>

~~~

Rectangulo.java
~~~java
//los java beans son clases de java echas beans 
//tiene varios requerimientos minimos que se veran ahora
package beans;

public class Rectangulo {
    //debe tener propiedades privadas
    private int base;
    private int altura;

    //debe teenr un constructor vacio siempre, pero como 
    //no estamos agregando una sobrecarga al constructor entonces 
    //se agrega el constructor vacio por dedault

    //se necesitan metodos seteres y geters para cada una de las propiedades
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //hasta aqui ya se considera un java bean

    public int getArea(){
      return this.base * this.altura;
    }

}
~~~

setterJSP.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica a un JavaBean</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBean</h1>
        <%-- creamos un objeto con nombre rectangulo de tipo Rectangulo con alcance de sesion 
        si el alcance fuera de request, el javaBean solo existe mientras se haga la peticion--%>
        
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"></jsp:useBean>
        Modificamos los atributos:
        <br>
        <br>
        <%
            int baseValor = 5;
            int alturaValor = 10;
        %>
        <%-- y cambiamos los valores de ese objeto con el setProperty apuntando al objeto --%>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>"></jsp:setProperty>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"></jsp:setProperty>
        
        <br>
        Nuevo valor base (fijo): <%=baseValor%>
        <br>
        Nuevo valor altura (fijo): <%=alturaValor%>
        
        <br>
        <br>
        
        Nuevo valor base (javaBean): <jsp:getProperty name="rectangulo" property="base"></jsp:getProperty>
        <br>
        Nuevo valor altura (javaBean): <jsp:getProperty name="rectangulo" property="altura"></jsp:getProperty>
        
        <br>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>
        
    </body>
</html>
~~~

getterJSP.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del JavaBean</title>
    </head>
    <body>
        <h1>JSP que lee los valores del JavaBean</h1>
        <%-- aqui obtenemos el bean llamado rectangulo, si no lo encuentra lo crea por el 
        tambien dependeiendo de el alcance de este es importante, porque puede haber un bean 
        que se llame rectangulo pero con scope de sesion, y otro tambien llamado rectangulo pero con 
        otro alcance --%>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"></jsp:useBean>
        <br>
        Valor base : <jsp:getProperty name="rectangulo" property="base"></jsp:getProperty>
        <br>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura"></jsp:getProperty>
        <br>
        <%--Esta parte es importanyte porque dentro del bean realmnente no se tiene 
        una propiedad que se llame area, pero si tenemos un metodo que se llama getArea
        por ende el javaBean lo puede procesar de esta manera usando el metodo get,
        siendo asi que podemos usarlo--%>
        Valor area: <jsp:getProperty name="rectangulo" property="area"></jsp:getProperty>
        <br>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>
~~~

### 234, 235.-
MANEJO DE EL (EXPRESSION LANGUAJE) CON JSP

index.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Expression Language</title>
    </head>
    <body>
        <h1>Ejemplo de Expression Language</h1>
        <br>
        <%-- le pasamos un parametro al jsp --%>
        <a href="variablesImplicitas.jsp?usuario=juan">Objetos Implicitos con Expression language</a>
    </body>
</html>

~~~

variablesImplicitas.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Variables Implicitas</title>
    </head>
    <body>
        <h1>EL y Variables Implicitas</h1>
        <ul>
            <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del Cliente: ${header["User-Agent"]}</li>
            <li>Id Sesion: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro: ${param.usuario}</li>
        </ul>
        <br>
        <br>
        <a href="index.jsp">volver al inicio</a>
    </body>
</html>
~~~

### 236, 237.-
MANEJO DE JSTL(JAVASERVER ÁGES STANDARD TAF LIBRARY) EN JSPs

index.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Expression Language</title>
    </head>
    <body>
        <h1>Ejemplo de Expression Language</h1>
        <br>
        <%-- le pasamos un parametro al jsp --%>
        <a href="variablesImplicitas.jsp?usuario=juan">Objetos Implicitos con Expression language</a>
    </body>
</html>
~~~

variablesImplicitas.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Variables Implicitas</title>
    </head>
    <body>
        <h1>EL y Variables Implicitas</h1>
        <ul>
            <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del Cliente: ${header["User-Agent"]}</li>
            <li>Id Sesion: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro: ${param.usuario}</li>
        </ul>
        <br>
        <br>
        <a href="index.jsp">volver al inicio</a>
    </body>
</html>
~~~

### 238, 239.-
PATRON DISEÑO MVC-EJEMPLO1

index.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>EJEMPLO MVC</h1>
        <br>
        <!-- usamos el pageContext, para no necesariamente poner el nombre
        de la aplicacion -->
        <a href="${pageContext.request.contextPath}/ServletControlador">
            Link al servlet controlador que despliega las variables
        </a>
    </body>
</html>
~~~

Rectangulo.java
~~~java
package modelo;

public class Rectangulo {
    private int base;
    private int altura;
    
    //creamos un constructor vacio porque asi lo necesita 
    //para que sea un javaBean
    public Rectangulo(){}
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea(){
        return  this.base * this.altura;
    }
}

~~~

ServletControlador.java
~~~java
package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      //1.procesamos los parametros

      //2.creamos los javaBeans
      Rectangulo rec = new Rectangulo(3,6);

      //3.agregamos el javabean a algun alcance
      //es la variable "mensaje" con el valor de "saludos desde el servlet"
      request.setAttribute("mensaje", "saludos desde el servlet");

      //obtenemos la sesion 
      HttpSession sesion = request.getSession();
      sesion.setAttribute("rectangulo", rec);

      //aqui ya tenemos compartido en el scope de sesion la variable rectangulo 

      //4.redireccionar a la vista seleccionada

      //obtenemos la vista a la cual vamos a redireccionar 
      RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");

      //propagamos el request y response al dispatcher
      rd.forward(request, response);
    }
}

~~~

desplegarVariables.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de variables</title>
    </head>
    <body>
        <h1>Despliegue de variables</h1>
        <!-- la variable mensaje esta puesta en el request que 
        manda el servlet, lo busca en todos los alcances y lo muestra -->
        Variable en el alcance request: ${mensaje}
        <br>
        <br>
        Variable en alcance sesion:
        <br>
        Rectangulo:
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
    </body>
</html>
~~~

### 240.-
PATRON DISEÑO MVC-EJEMPLO2

index.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>EJEMPLO MVC</h1>
        <br>
        <div style="color: red;">${mensaje}</div>
        <br>
        
        <a href="${pageContext.request.contextPath}/ServletControlador">
        Link al servlet controlador SIN parametros
        </a>
        
        <br>
        <br>
        
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables">
        Link al servlet controlador para agregar las variables
        </a>
        
        <br>
        <br>
        
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
        Link al servlet controlador para listar variables
        </a>
        
    </body>
</html>
~~~

Rectangulo.java
~~~java
package modelo;

public class Rectangulo {
    private int base;
    private int altura;
    
    //creamos un constructor vacio porque asi lo necesita 
    //para que sea un javaBean
    public Rectangulo(){}
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea(){
        return  this.base * this.altura;
    }
}

~~~

ServletControlador.java
~~~java
package controlador;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      //1.procesamos los parametros
      String accion = request.getParameter("accion");

      //2.creamos los javaBeans
      Rectangulo recRequest = new Rectangulo(1,2);
      Rectangulo recSesion = new Rectangulo(3,4);
      Rectangulo recAplicacion = new Rectangulo(5,6);

      //3.agregamos el javabean a algun alcance
      
      //revisamos la accion proporcionada
        if ("agregaVariables".equals(accion)) {
            //alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            
            //Alcance sesion
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            
            //Alcande applicacion
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplication", recAplicacion);
            
            //Agregamos un mensaje
            request.setAttribute("mensaje", "las variables fueron agregadas");
            
            //4.redireeccionamos al jsp de index
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } 
        else if ("listarVariables".equals(accion)) {
            
            //4.redireccionamos al jsp que despliega las variables 
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }
        else{
            //4.Redireccionamos a la pagina de inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }
}
~~~

alcanceVariables.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance Variables</title>
    </head>
    <body>
        <h1>Alcance Variables</h1>
        <br>
        Variable request:
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br>
        <br>
        Variable Sesion:
        Base: ${rectanguloSesion.base}
        Altura: ${rectanguloSesion.altura}
        Area: ${rectanguloSesion.area}
        <br>
        <br>
        Variable Aplicacion:
        Base: ${rectanguloAplication.base}
        Altura: ${rectanguloAplication.altura}
        Area: ${rectanguloAplication.area}<br>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
        
    </body>
</html>
~~~

### 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 261, 262, 263, 264.-
index.jsp
~~~jsp
<!--Ponemos esto en la pagina de inicio para que luego luego 
abra el servlet controlador-->
<meta http-equiv="refresh" content="0;url=${pageContext.request.contextPath}/ServletControlador">
~~~

ServlerControlador.java
~~~java
package web;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import datos.ClienteDaoJDBC;
import dominio.Cliente;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
  // el servlet controlador lo que va a hacer es recuperar el listado de clientes
  // compartir esta informacion hacie clientes.jsp

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
          switch (accion) {
            case "editar":
              this.editarCliente(request, response);
              break;
            case "eliminar":
            this.eliminarCliente(request,response);
              break;
            default:
              this.accionDefault(request, response);
              break;
          }
        }else{
          this.accionDefault(request, response);
        }
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // agarramos la accion que quieren que hagamos
    String accion = request.getParameter("accion");
    if (accion != null) {
      switch (accion) {
        case "insertar":
          this.insertarCliente(request, response);
          break;
        case "modificar":
          this.modificarCliente(request, response);
          break;
        default:
          this.accionDefault(request, response);
          break;
      }
    }else{
      this.accionDefault(request, response);
    }
  }

  private void accionDefault(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // tomamos a traves de clientesDaoJDBC toda la lista de cliente que se
    // encuentra en la base de datos
    List<Cliente> clientes = new ClienteDaoJDBC().listar();
    System.out.println("clientes = " + clientes);

    HttpSession sesion = request.getSession();
    sesion.setAttribute("clientes", clientes);
    sesion.setAttribute("totalClientes", clientes.size());
    sesion.setAttribute("saldoTotal", this.calcularSaldoTotal(clientes));
    
    //vamos a quitar el dispacher porque el url sigue haciendo la accion de añadir
    //request.getRequestDispatcher("clientes.jsp").forward(request, response);


    //siempre se necesita un jsp publico para iniciar una pagina 
    response.sendRedirect("clientes.jsp");
  }

  private double calcularSaldoTotal(List<Cliente> clientes) {
    double saldoTotal = 0;
    for (Cliente cliente : clientes) {
      saldoTotal += cliente.getSaldo();
    }
    return saldoTotal;
  }

  private void insertarCliente(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    //recuperamos los valores del formulario proporcionado
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String email = request.getParameter("email");
    String telefono = request.getParameter("telefono");
    double saldo = 0;
    String saldoString = request.getParameter("saldo");
    if (saldoString!= null && !"".equals(saldoString)) {
      saldo = Double.parseDouble(saldoString);
    }

    //creamos el objeto cliente
    Cliente nuevoCliente = new Cliente(nombre, apellido, email, telefono, saldo);

    //insertamos el nuevo objeto en la base de datos
    int registrosModificados = new ClienteDaoJDBC().insertar(nuevoCliente);
    System.out.println("Registros modificados: " + registrosModificados);

    //Redirigiomos hacia la accion por defaul
    this.accionDefault(request, response);
  }

  private void editarCliente(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    //recuepamos el idCliente
    int idCliente = Integer.parseInt(request.getParameter("idCliente"));
    Cliente cliente = new ClienteDaoJDBC().encontrar(new Cliente(idCliente));
    request.setAttribute("cliente", cliente);
    //este es el jsp que se desplegara y se le pondran los datos recuperados
    String jspEditar = "/WEB-INF/paginas/cliente/editarCliente.jsp";
    request.getRequestDispatcher(jspEditar).forward(request, response);
  }

  private void modificarCliente(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    //recuperamos los valores del formulario editar Cliente
    int idCliente = Integer.parseInt(request.getParameter("idCliente"));
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String email = request.getParameter("email");
    String telefono = request.getParameter("telefono");
    double saldo = 0;
    String saldoString = request.getParameter("saldo");
    if (saldoString!= null && !"".equals(saldoString)) {
      saldo = Double.parseDouble(saldoString);
    }

    //creamos el objeto cliente
    Cliente cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);

    //Modificar el objeto en la base de datos
    int registrosModificados = new ClienteDaoJDBC().actualizar(cliente);
    System.out.println("Registros modificados: " + registrosModificados);

    //Redirigiomos hacia la accion por defaul
    this.accionDefault(request, response);
  }

  private void eliminarCliente(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    //recuperamos los valores del formulario editar Cliente
    int idCliente = Integer.parseInt(request.getParameter("idCliente"));
    

    //creamos el objeto cliente
    Cliente cliente = new Cliente(idCliente);

    //Eliminamos el objeto en la base de datos
    int registrosModificados = new ClienteDaoJDBC().eliminar(cliente);
    System.out.println("Registros modificados: " + registrosModificados);

    //Redirigiomos hacia la accion por defaul
    this.accionDefault(request, response);
  }
}

~~~

Conexion.java
~~~java
package datos;

import java.sql.*;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/control_clientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    private static BasicDataSource dataSource;

    public static DataSource getDataSource(){
      if (dataSource == null) {
        dataSource = new BasicDataSource();
        dataSource.setUrl(JDBC_URL);
        dataSource.setUsername(JDBC_USER);
        dataSource.setPassword(JDBC_PASSWORD);
        //le damos 50 hilos por los cuales conectarse 
        dataSource.setInitialSize(50);
      }
      
      return dataSource;
    }

    //para mejorar este codigo ponemos esto: OPTIMIZACION
    //ya que siempre que poniamos getDataSource se crea un data source nuevamente 
    //y solicitamos 50 conexiones por cada conexion que creamos

    public static Connection getConnection() throws SQLException{
      return getDataSource().getConnection();
    }

    public static void close(ResultSet rs){
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace(System.out);
      }
    }

    public static void close(PreparedStatement stmt){
      try {
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace(System.out);
      }
    }

    public static void close(Connection conn){
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace(System.out);
      }
    }
}
~~~

ClienteDaoJDBC.java
~~~java
package datos;

import java.sql.*;
import java.util.*;
import dominio.Cliente;

public class ClienteDaoJDBC {
  private static final String SQL_SELECT = "SELECT id_cliente, nombre, apellido, email, telefono, saldo "
      + "FROM cliente";

  private static final String SQL_SELECT_BY_ID = "SELECT id_cliente, nombre, apellido, email, telefono, saldo "
      + "FROM cliente WHERE id_cliente = ?";

  private static final String SQL_INSERT = "INSERT INTO cliente(nombre, apellido, email, telefono, saldo) "
      + "VALUES(?, ?, ?, ?, ?)";

  private static final String SQL_UPDATE = "UPDATE cliente "
      + "SET nombre=?, apellido=?, email=?, telefono=?, saldo=? WHERE id_cliente=?";

  private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente = ? ";

  public List<Cliente> listar() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Cliente cliente = null;

    List<Cliente> clientes = new ArrayList<>();
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();
      while (rs.next()) {
        int idcliente = rs.getInt("id_cliente");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");
        double saldo = rs.getDouble("saldo");

        cliente = new Cliente(idcliente, nombre, apellido, email, telefono, saldo);
        clientes.add(cliente);
      }
    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(rs);
      Conexion.close(stmt);
      Conexion.close(conn);
    }

    return clientes;

  }

  public Cliente encontrar(Cliente cliente) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
      stmt.setInt(1, cliente.getIdCliente());
      rs = stmt.executeQuery();
      rs.next(); //entrar en la linea a usar

      String nombre = rs.getString("nombre");
      String apellido = rs.getString("apellido");
      String email = rs.getString("email");
      String telefono = rs.getString("telefono");
      double saldo = rs.getDouble("saldo");

      cliente.setNombre(nombre);
      cliente.setApellido(apellido);
      cliente.setEmail(email);
      cliente.setTelefono(telefono);
      cliente.setSaldo(saldo);

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(rs);
      Conexion.close(stmt);
      Conexion.close(conn);
    }

    return cliente;
      
  }

  public int insertar(Cliente cliente) {
    Connection conn = null;
    PreparedStatement stmt = null;
    //como no vamos a sacar info de la base de datos podemso quitar 
    //el result set

    int rows=0;
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, cliente.getNombre());
      stmt.setString(2, cliente.getApellido());
      stmt.setString(3, cliente.getEmail());
      stmt.setString(4, cliente.getTelefono());
      stmt.setDouble(5, cliente.getSaldo());

      //saber cuantos registros se han modificado
      rows = stmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(stmt);
      Conexion.close(conn);
    }
    return rows;
  }

  public int actualizar(Cliente cliente){
    Connection conn = null;
    PreparedStatement stmt = null;
    //como no vamos a sacar info de la base de datos podemso quitar 
    //el result set

    int rows=0;
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, cliente.getNombre());
      stmt.setString(2, cliente.getApellido());
      stmt.setString(3, cliente.getEmail());
      stmt.setString(4, cliente.getTelefono());
      stmt.setDouble(5, cliente.getSaldo());
      stmt.setInt(6, cliente.getIdCliente());

      //saber cuantos registros se han modificado
      rows = stmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(stmt);
      Conexion.close(conn);
    }
    return rows;
  }

  public int eliminar(Cliente cliente){
    Connection conn = null;
    PreparedStatement stmt = null;
    //como no vamos a sacar info de la base de datos podemso quitar 
    //el result set

    int rows=0;
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, cliente.getIdCliente());

      //saber cuantos registros se han modificado
      rows = stmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(stmt);
      Conexion.close(conn);
    }
    return rows;
  }
}

~~~

Cliente.java
~~~java
package dominio;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Double saldo;

    public Cliente() {
    }

    //este constructor sive por si solo necesitamos borrar 
    //a alguien de la base de datos
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    //este sirve para poder crear más tipos clientes
    //porque no necesitamos el id
    public Cliente(String nombre, String apellido, String email, String telefono, Double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    //este sirve para modificar los tipos clientes 
    public Cliente(int idCliente, String nombre, String apellido, String email, String telefono, Double saldo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
~~~

clientes.jsp
~~~jsp
<!DOCTYPE html>
<html>
    <head>
        <!-- Agregando las librerias de boostrap -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Control de Clientes</title>
    </head>
    <body>
        <!-- como el boostrap va a hacer que tengamos mucho codigo en el index
        vamos a separarlo en diferentes jsps-->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"></jsp:include>
        
        <!--Botones de navegacion-->
        <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacion.jsp"></jsp:include>
        
        <!--Listado de clientes-->
        <jsp:include page="/WEB-INF/paginas/cliente/listadoClientes.jsp"></jsp:include>
        
        <!-- Pie de pagina -->
        <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"></jsp:include>
        
        <!-- Scripts que trae boostrap -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
   
        <!--Scripts que trae awesome fonts-->
        <script src="https://kit.fontawesome.com/5220ced5cc.js" crossorigin="anonymous"></script>
    </body>
</html>
~~~

botonesNavegacion.jsp
~~~jsp
<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a href="#" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#agregarClienteModal">
                    <i class="fa-solid fa-plus"></i> Agregar Cliente
                </a>
            </div>
        </div>
    </div>
</section>
~~~

cabecero.jsp
~~~jsp
<header id="main-header" class="py-2 bg-info text-white" >
    <div class="container">
        <div class="row">
            <div class="col-md-auto">
                <h1>
                    <i class="fa-solid fa-gear"></i> Control de Clientes
                </h1>
            </div>
        </div>
    </div>
</header>
~~~

listadoClientes.jsp
~~~jsp
<!-- ahora vamos a iterar la lista de clientes
que ha obtenido y nos ha pasado el servletControlador
por ende metemos la libreria de jstl-->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"></fmt:setLocale>

<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Clientes</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="table-dark">
                            <tr>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Saldo</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--Iteramos cada elemento de la lista de cliemte-->
                            <c:forEach var="cliente" items="${clientes}" varStatus="status">
                                <tr>
                                    <!--con el status hacemos que si muestre 1 2 3 y no el id
                                    de la base de datos-->
                                    <td>${status.count}</td>
                                    <td>${cliente.nombre} ${cliente.apellido}</td>
                                    <td><fmt:formatNumber value="${cliente.saldo}" type="currency"></fmt:formatNumber>  </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idCliente=${cliente.idCliente}" 
                                            class="btn btn-warning"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Editar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

            <!--Trajetas para los toltales-->
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Saldo Total</h3>
                        <h4 class="display-4">
                            <fmt:formatNumber value="${saldoTotal}" type="currency"></fmt:formatNumber>
                        </h4>
                    </div>
                </div>

                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Total Clientes</h3>
                        <h4 class="display-4">
                            <i class="fa-solid fa-users"></i>
                            ${totalClientes}
                        </h4>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!--Agregar cliente MODAL-->
<jsp:include page="/WEB-INF/paginas/cliente/agregarCliente.jsp"></jsp:include>
~~~

cabecero.jsp
~~~jsp
<header id="main-header" class="py-2 bg-info text-white" >
    <div class="container">
        <div class="row">
            <div class="col-md-auto">
                <h1>
                    <i class="fa-solid fa-gear"></i> Control de Clientes
                </h1>
            </div>
        </div>
    </div>
</header>
~~~

piePagina.jsp
~~~jsp
<footer id="pie-pagina" class="bg-warning text-white mt-5 p-5">
    <div class="container">
        <div class="row">
            <p class="text-center">
                Copyright &copy; GlobalMentoring.com.mx
            </p>
        </div>
    </div>
</footer>
~~~

agregarCliente.jsp
~~~jsp
<!--El id debe sar igual al data-bs-target que le pusimosen el botones Navegacion -->
<div class="modal fade" id="agregarClienteModal">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header bg-info text-white">
        <h5 class="modal-title fs-5">Agregar Cliente</h5>
        <button
          type="button"
          class="btn-close"
          data-bs-dismiss="modal"
          aria-label="Close"
        ></button>
      </div>
      <form
        action="${pageContext.request.contextPath}/ServletControlador?accion=insertar"
        method="post"
        class="was-validated"
      >
        <div class="modal-body">
          <div class="mb-3">
            <label for="nombre" class="form-label">Nombre</label>
            <input
              type="text"
              class="form-control"
              name="nombre"
              id="nombre"
              placeholder="Escribe tu nombre"
              required
            />
          </div>

          <div class="mb-3">
            <label for="apellido" class="form-label">Apellido</label>
            <input
              type="text"
              class="form-control"
              name="apellido"
              id="apellido"
              placeholder="Escribe tu apellido"
              required
            />
          </div>

          <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input
              type="email"
              class="form-control"
              name="email"
              id="email"
              placeholder="Escribe tu email"
              required
            />
          </div>

          <div class="mb-3">
            <label for="telefono" class="form-label">Telefono</label>
            <input
              type="tel"
              class="form-control"
              name="telefono"
              id="telefono"
              placeholder="Escribe tu telefono"
              required
            />
          </div>

          <div class="mb-3">
            <label for="saldo" class="form-label">Saldo</label>
            <input
              type="number"
              class="form-control"
              name="saldo"
              id="saldo"
              placeholder="Escribe tu saldo"
              required
              step="any"
            />
          </div>
        </div>

        <div class="modal-footer">
          <button
            type="button"
            class="btn btn-secondary"
            data-bs-dismiss="modal"
          >
            Close
          </button>
          <input type="submit" class="btn btn-primary" value="Guardar" />
        </div>
      </form>
    </div>
  </div>
</div>
~~~

botonesNavegacionEdicion.jsp
~~~jsp
<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">

            <div class="col-md-3">
                <a href="index.jsp" class="btn btn-ligth btn-block">
                    <i class="fa-solid fa-arrow-left"></i> Regresar al inicio
                </a>
            </div>

            <div class="col-md-3">
                <button type="submit" class="btn btn-success btn-block">
                    <i class="fa-solid fa-check"></i> Guardar Cliente
                </button>
            </div>

            <div class="col-md-3">
                <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminar&idCliente=${cliente.idCliente}"
                class="btn btn-danger btn-block">
                <i class="fa-solid fa-trash"></i> Eliminar Cliente
                </a>

            </div>

        </div>

    </div>
</section>
~~~

editarCliente.jsp
~~~jsp
<!DOCTYPE html>
<html>
  <head>
    <!-- Agregando las librerias de boostrap -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <title>Editar cliente </title>
  </head>
  <body>
    <!-- cabecero-->
    <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"></jsp:include>
    

    <form
      action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}"
      method="post"
      class="was-validated"
    >
      <!-- Botones de Navegacion-->
      <jsp:include
        page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"
      ></jsp:include>

      <section id="details">
        <div class="container">
          <div class="row">
            <div class="col">
              <div class="card">
                <div class="card-header">Editar Cliente</div>
                <div class="card-body">
                  <div class="mb-3">
                    <label for="nombre" class="form-label">Nombre</label>
                    <input
                      type="text"
                      class="form-control"
                      name="nombre"
                      id="nombre"
                      required
                      value="${cliente.nombre}"
                    />
                  </div>

                  <div class="mb-3">
                    <label for="apellido" class="form-label">Apellido</label>
                    <input
                      type="text"
                      class="form-control"
                      name="apellido"
                      id="apellido"
                      required
                      value="${cliente.apellido}"
                    />
                  </div>

                  <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input
                      type="email"
                      class="form-control"
                      name="email"
                      id="email"
                      required
                      value="${cliente.email}"
                    />
                  </div>

                  <div class="mb-3">
                    <label for="telefono" class="form-label">Telefono</label>
                    <input
                      type="tel"
                      class="form-control"
                      name="telefono"
                      id="telefono"
                      required
                      value="${cliente.telefono}"
                    />
                  </div>

                  <!--con el step any podemos hacer que el typoe number acepte centavos-->
                  <div class="mb-3">
                    <label for="saldo" class="form-label">Saldo</label>
                    <input
                      type="number"
                      class="form-control"
                      name="saldo"
                      id="saldo"
                      required
                      value="${cliente.saldo}"
                      step="any"
                    />
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </form>

    <!-- Pie de pagina -->
    <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"></jsp:include>

    <!-- Scripts que trae boostrap -->
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
      integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
      integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
      crossorigin="anonymous"
    ></script>

    <!--Scripts que trae awesome fonts-->
    <script
      src="https://kit.fontawesome.com/5220ced5cc.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
~~~

### 265, 266, 267.-
la configuracion  del Javaserver faces fue echa en estas clases por ende es mejor ver la clase, ya que los pomps son más complicadas

index.xhtml
~~~xhtml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
    <head>
        <title>Hola Mundo JSF</title>
    </head>
    <body>
        <h:outputLabel value="Hola Mundo desde JSF"></h:outputLabel>
    </body>
</html>
~~~


### 268, 269.-
index.xhtml
~~~xhtml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
    <head>
        <title>Hola Mundo JSF</title>
    </head>
    <body>
        <h:form>
            <table>
                <tr>
                    <td><h:outputLabel for="nombre" value="nombre">Nombre:</h:outputLabel></td>
                    <td><h:inputText id="nombre" value="#{candidato.nombre}"></h:inputText></td>
                    <td><h:message for="nombre"></h:message></td>
                </tr>
            </table>
        </h:form>
    </body>
</html>
~~~

Candidato.java
~~~java
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//le ponemos esto para que peuda ser reconocido por java servlet faces
@Named
//dandole un alcance a este managed bean
@RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
~~~

### 270, 271.-
index.xhtml
~~~xhtml
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
    <head>
        <title>Hola Mundo JSF</title>
    </head>
    <body>
        <h:form>
            <table>
                <tr>
                    <td><h:outputLabel for="nombre" value="nombre">Nombre:</h:outputLabel></td>
                    <td><h:inputText id="nombre" value="#{candidato.nombre}"></h:inputText></td>
                    <td><h:message for="nombre"></h:message></td>
                </tr>
            </table>
            
            <!-- con el boton hacemos la llamada al metod enviar que esta dentro de la 
            clase VacanteForm-->
            <h:commandButton action="#{vacanteForm.eviar}" value="Enviar"></h:commandButton>
        </h:form>
    </body>
</html>
~~~

VacanteForm.java
~~~java
package beans.backing;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import beans.model.Candidato;

@Named
@RequestScoped
public class VacanteForm {

  //hacemos la inyeccion del candidato
  @Inject
  private Candidato candidato;  

  public void setCandidato(Candidato candidato){
    this.candidato = candidato;
  }
    
  public String eviar(){
    if (this.candidato.getNombre().equals("Juan")) {
      //hacemos un redireccionamiento a 
      //exito.html pero no es necesario poner el html
      return "exito";
    }else{
      return "fallo";
    }
  }
}
~~~

ConfiguracionJSF.java
~~~java
package beans.configuracion;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

@FacesConfig(
            //activa CDI build-in beans
            version = JSF_2_3
)

@ApplicationScoped
public class ConfigurationJSF {
    
}

~~~

Candidato.java
~~~java
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//le ponemos esto para que peuda ser reconocido por java servlet faces
@Named
//dandole un alcance a este managed bean
@RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
~~~

exito.xhtml
~~~xhtml
<!-- Agergamos las librerias para que pueda usar jsf -->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"<head>
        <title>Exito</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
        <h:form>
            Gracias #{candidato.nombre} por aplicar a la vacante
            <br>
            <h:commandLink action="index">Regresar</h:commandLink>
        </h:form>
    </body>
</html>
~~~

fallo.xhtml
~~~xhtml
<!-- Agergamos las librerias para que pueda usar jsf -->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"<head>
        <title>Fallo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
        <h:form>
            Lo siento #{candidato.nombre}, no hay vacantes por el momento
            <br>
            <h:commandLink action="index">Regresar</h:commandLink>
        </h:form>
    </body>
</html>
~~~

beans.xml
~~~xml
<beans xmlns="http://xmlns.jcp.org/xml/ns/javaee"
       xmlns:xsi="http://www.w3.org/2001/XMLScheme-instance"
       xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                           http://xmlns.jcp.org/xml/ns/javaee/beans_2_0.xsd"
       bean-discovery-mode="all"
       version="2.0">
</beans>     

~~~


### 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289.-

estas secciones las voy a dejar de hacer porque pareciera ser que los JAVA SERVLET FACES (JSF) ya no son tan utilizados en estos tiempos, parece ser que para una ruta back es más utilizados los jpa y los jsp, y ya que los proyectos de jsf no me estan funcionando los voy a dejar, gracias, si necesitas saber más informacion sobre lso jsf más adelanet investiga por tu cuenta o en estas clases 

### 290, 291, 292, 293, 294.-
Introduccion de JAVA EE

### 295, 296, 297, 298, 299, 300.-
Explicacion teorica de los Enterprice Java Beans (EJE)


### 301.-
EJERCICIO HOLAMUNDO CON EJB EN JAVA EE

En este ejercicio es importante ver la clase, ya que muchas ed las cosas que se hacen en esta clase es configurar el Pom y los servidores, por lo que entiendo en este momento se hace una implementacion de nuestro EJB y esta implementacion se implementa (vaya la redundancia) dentro de nuestro EJB remoto, pero, el EJB remoto debe estar puesto en el servidor para que se pueda hacer uso de este con:

despues de hacer el proyecto donde se pone el jar que en este caso es la ruta **E:\InterfaceUser\Escritorio\JAVA\UniversidadJava\JAVAEEReal\HolaMundoEJB\target** que se obtiene al haceer clean and buil iniciamos el servidor y entramosa  sus preferencias 

despues se hace un archivo que va a ser el que llame los metodos del EJB remoto para porbar el funcionamiento de estos

despues de que ya se tiene todo el codigo Y EL SERVIDOR YA SE ENCUENTRA CORRIENDO (que sera el que tenga el EJB remoto) se le da run file al archivo que tiene la llamada a el EJB, despues la consola normal arroja:
Resultado EJB suma 5+3: 8

arriba de 

BUILD SUCCESS

y la consola de glassfich arroja:

 Ejecutando metodo suma en el servidor|#]

HolaMundoEJbImpl.java
~~~java
package beans;

import javax.ejb.Stateless;

//ponemos esto para que sea realmente un EJB
@Stateless
public class HolaMudnoEjbImpl implements HolaMundoEjbRemote{

  @Override
  public int sumar(int a, int b) {
    System.out.println("Ejecutando metodo suma en el servidor");
    return a+b;
  }
}
~~~

HolaMundoEJbRemote.java
~~~java
package beans;

import javax.ejb.Remote;

//con remote glasfish hace que se publique y el cliente pueda usarlo
@Remote
public interface HolaMundoEjbRemote {
   public int sumar(int a, int b);
}

~~~

TestHolaMundoEJB.java
~~~java
package test;

import javax.naming.*;
import beans.HolaMundoEjbRemote;

public class TestHolaMundoEJB {
    public static void main(String[] args) {
      System.out.println("iniciando llamada al EJB desde el cliente \n");
      try {
        //lo conectamos con el jndi
        Context jndi = new InitialContext();
        //lollamamos con el nombre que se nos dio para llamarlo desde el servidor que ya esta colgado
        HolaMundoEjbRemote holaMundoEJB =(HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMudnoEjbImpl!beans.HolaMundoEjbRemote");
        
        //es importante hacer que el servidor ya este arriba para que se pueda acceder al EJB
        //y ya se puedan usar sus metodos (visto en clase 301)
        int resultado = holaMundoEJB.sumar(5, 3);
        System.out.println("Resultado EJB suma 5+3: " + resultado);

        
        //hacemos un try catch porque puede generarnos un error de NamingException
      } catch (NamingException e) {
        e.printStackTrace(System.out);
      }
    }
}
~~~

### 302.-
EJERCICIO EJB DE SESION REMORO EN JAVA EE

tambien en esta clase hicimos deploy de el ejb en el servidor 

Persona.java
~~~java
package mx.com.gm.sga.domain;

import java.io.Serializable;

//implementa serializable ya que va a ser utilizada por el servidor 
public class Persona implements Serializable {
  // esto es una configuracion que pide el tipo de comunicacion
  private static final long serialVersionUID = 1L;

  private int idPersona;
  private String nombre;
  private String appellido;
  private String email;
  private String telefono;

  // agregamos un constructor vacio
  public Persona() {
  };

  public Persona(int idPersona, String nombre, String appellido, String email, String telefono) {
    this.idPersona = idPersona;
    this.nombre = nombre;
    this.appellido = appellido;
    this.email = email;
    this.telefono = telefono;
  }

  public int getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(int idPersona) {
    this.idPersona = idPersona;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAppellido() {
    return appellido;
  }

  public void setAppellido(String appellido) {
    this.appellido = appellido;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Persona{");
    sb.append("idPersona=").append(idPersona);
    sb.append(", nombre=").append(nombre);
    sb.append(", appellido=").append(appellido);
    sb.append(", email=").append(email);
    sb.append(", telefono=").append(telefono);
    sb.append('}');
    return sb.toString();
  }

}
~~~

PersonaServiceRemote.java
~~~java
package mx.com.gm.sga.servicio;

import java.util.List;

import javax.ejb.Remote;

import mx.com.gm.sga.domain.Persona;

@Remote
public interface PersonaServiceRemote {
    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontarPersonaPorEmail(Persona persona);

    public void registratPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
~~~

PersobaServiceImpl.java
~~~java
package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersobaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juan","Perez","JPerez@mail.com", "5511448866"));
        personas.add(new Persona(2,"Marta","Suarez","MSuarez@mail.com", "5511448855"));
        personas.add(new Persona(3,"Raul","Hernandez","RHernandez@mail.com", "5511448844"));

        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontarPersonaPorEmail(Persona persona) {
      return null;
    }

    @Override
    public void registratPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
~~~

ClinetePersonaService.java
~~~java
package mx.com.gm.sga.cliente;

import java.util.List;

import javax.naming.*;

import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClinetePersonaService {
  public static void main(String[] args) {
    System.out.println("iniciando llamada al EJB desde el cliente\n");
    try {
      Context jndi = new InitialContext();
      PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/SGA-JEE/PersobaServiceImpl");

      List<Persona> personas = personaService.listarPersonas();

      System.out.println("las personas que estan en la lista son:");

      for (Persona persona : personas) {
        System.out.println(persona);
      }
    } catch (NamingException e) {
      e.printStackTrace(System.out);
    }
    
  }
}
~~~

### 303.-
EJERCICIO: EJB DE SESION LOCAL EN JAVA EE

en este ejercicio hice un EJB local

index.html
~~~html
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Personas</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <a href="personas">Ir al listado de personas</a>
    </body>
</html>
~~~

listadoPersonas.jsp
~~~jsp
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Personas</title>
    </head>
    <body>
        <h1>Listado de Personas</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li>${persona.nombre} ${persona.apellido}</li>
            </c:forEach>
        </ul>
    </body>
</html>

~~~


Persona.java
~~~java
package mx.com.gm.sga.domain;

import java.io.Serializable;

//implementa serializable ya que va a ser utilizada por el servidor 
public class Persona implements Serializable {
  // esto es una configuracion que pide el tipo de comunicacion
  private static final long serialVersionUID = 1L;

  private int idPersona;
  private String nombre;
  private String appellido;
  private String email;
  private String telefono;

  // agregamos un constructor vacio
  public Persona() {
  };

  public Persona(int idPersona, String nombre, String appellido, String email, String telefono) {
    this.idPersona = idPersona;
    this.nombre = nombre;
    this.appellido = appellido;
    this.email = email;
    this.telefono = telefono;
  }

  public int getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(int idPersona) {
    this.idPersona = idPersona;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAppellido() {
    return appellido;
  }

  public void setAppellido(String appellido) {
    this.appellido = appellido;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Persona{");
    sb.append("idPersona=").append(idPersona);
    sb.append(", nombre=").append(nombre);
    sb.append(", appellido=").append(appellido);
    sb.append(", email=").append(email);
    sb.append(", telefono=").append(telefono);
    sb.append('}');
    return sb.toString();
  }

}
~~~


PersobaServiceImpl.java
~~~java
package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersobaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juan","Perez","JPerez@mail.com", "5511448866"));
        personas.add(new Persona(2,"Marta","Suarez","MSuarez@mail.com", "5511448855"));
        personas.add(new Persona(3,"Raul","Hernandez","RHernandez@mail.com", "5511448844"));

        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontarPersonaPorEmail(Persona persona) {
      return null;
    }

    @Override
    public void registratPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
~~~


PersonaService.java
~~~java
package mx.com.gm.sga.servicio;

import java.util.List;

import javax.ejb.Local;

import mx.com.gm.sga.domain.Persona;

@Local
public interface PersonaService {
    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontarPersonaPorEmail(Persona persona);

    public void registratPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
~~~


PersonaServlet.java
~~~java
package mx.com.gm.sga.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    //con esto le "inyectamos" la clase y una variable Persona Service
    @Inject
    PersonaService personaService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      List<Persona> personas = personaService.listarPersonas();
      System.out.println("Personas: " +personas);
      request.setAttribute("personas", personas);
      request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
    }
}
~~~

### 304, 305,306.-
en estas clases vemos las clases teoricas de los JPA

### 307, 308.-
en estas clases vemos como instalar la base de datos

### 309.-
EJERCICIO HOLA MUNDO CON JPA EN JAVA EE

es importante decir que en esta clase se altera el POM, se hace un archivo xml en donde se hace la configuracion para establecer contacto con la base de datos y la clase persona es una clase "especial" para que esta pueda hacer contacto con la base de datos ya que la clase es como extraer los datos de la base de datos y tambien se hace la configuracion del log4j2.xml

log4j2.xml
~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="INFO">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss} [%t] %-5level %logger{36} - %msg%n" />
        </Console>
    </Appenders>
    <Loggers>
        <Root level="debug">
            <AppenderRef ref="Console" />
        </Root>
    </Loggers>
</Configuration>
~~~

Persona.java
~~~java
package mx.com.gm.sga.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//haciendola clase identidad para que pueda
//interactuar con un api de jpa de la base de datos  
@Entity
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;

    //esta ya va a aser una clase identidad por lo que hay que ver en la base de datos
    @Id
    //definimos que esta es una llave identidad
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    //todo esto solo para la llave primaria
    private int idPersona;

    private String nombre;

    private String apellido;

    private String email;

    private String telefono;

    public Persona(){}

    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
    
}
~~~

este es el archivo que pone la configuracion de la base de datos
persistence.xml
~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
    http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd" version="2.2" >

    <persistence-unit name="PersonaPU" transaction-type="RESOURCE_LOCAL">
        <class>mx.com.gm.sga.domain.Persona</class>
        <properties>
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/test2?useSSL=false&amp;useTimezone=true&amp;serverTimezone=UTC" />
            <property name="javax.persistence.jdbc.user" value="root" />
            <property name="javax.persistence.jdbc.password" value="admin" />
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.MysqlDataSource" />
            <property name="eclipselink.logging.level.sql" value="FINE" />
            <property name="eclipselink.loggin.parameters" value="true" />
        </properties>
    </persistence-unit>
</persistence>

    

~~~

ClienteEntidadTest.java
~~~java
package test;

import javax.persistence.*;

import org.apache.logging.log4j.*;

import mx.com.gm.sga.domain.Persona;

public class ClienteEntidadTest {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
      EntityManager em = emf.createEntityManager();
      EntityTransaction tx = em.getTransaction();

      //Inicia la transaccion 
      tx.begin();
      //no se debe especificar el ID de la bas de datos
      Persona persona1 = new Persona("Maria", "Gutierrez", "gmaria@mail.com", "5577779999");
      log.debug("objeto a persistir" + persona1);
      //persistimos el objeto
      em.persist(persona1);
      //terminamos la transaccion 
      //esto lo hacemos para que si se guarden los datos 
      tx.commit();
      log.debug("objeto persistido" + persona1);
      em.close();
    }
}

~~~

### 310.-
~~~java

~~~

### 311.-
~~~java

~~~

### 312.-
~~~java

~~~

### 313.-
~~~java

~~~

### 314.-
~~~java

~~~

### 315.-
~~~java

~~~

### 316.-
~~~java

~~~

### 317.-
~~~java

~~~

### 318.-
~~~java

~~~

### 319.-
~~~java

~~~

### 320.-
~~~java

~~~

### 321.-
~~~java

~~~

### 322.-
~~~java

~~~

### 323.-
~~~java

~~~

### 324.-
~~~java

~~~

### 325.-
~~~java

~~~

### 326.-
~~~java

~~~

### 327.-
~~~java

~~~

### 328.-
~~~java

~~~

### 329.-
~~~java

~~~

### 330.-
~~~java

~~~

### 331.-
~~~java

~~~

### 332.-
~~~java

~~~

### 333.-
~~~java

~~~

### 334.-
~~~java

~~~

### 335.-
~~~java

~~~

### 336.-
~~~java

~~~

### 337.-
~~~java

~~~

### 338.-
~~~java

~~~

### 339.-
~~~java

~~~

### 340.-
~~~java

~~~

### 341.-
~~~java

~~~

### 342.-
~~~java

~~~

### 343.-
~~~java

~~~

### 344.-
~~~java

~~~

### 345.-
~~~java

~~~

### 346.-
~~~java

~~~

### 347.-
~~~java

~~~

### 348.-
~~~java

~~~

### 349.-
~~~java

~~~

### 350.-
~~~java

~~~

### 351.-
~~~java

~~~

### 352.-
~~~java

~~~

### 353.-
~~~java

~~~

### 354.-
~~~java

~~~

### 355.-
~~~java

~~~

### 356.-
~~~java

~~~

### 357.-
~~~java

~~~

### 358.-
~~~java

~~~

### 359.-
~~~java

~~~

### 360.-
~~~java

~~~

### 361.-
~~~java

~~~

### 362.-
~~~java

~~~

### 363.-
~~~java

~~~

### 364.-
~~~java

~~~

### 365.-
~~~java

~~~

### 366.-
~~~java

~~~

### 367.-
~~~java

~~~

### 368.-
~~~java

~~~

### 369.-
~~~java

~~~

### 370.-
~~~java

~~~

### 371.-
~~~java

~~~

### 372.-
~~~java

~~~

### 373.-
~~~java

~~~

### 374.-
~~~java

~~~

### 375.-
~~~java

~~~

### 376.-
~~~java

~~~

### 377.-
~~~java

~~~

### 378.-
~~~java

~~~

### 379.-
~~~java

~~~

### 380.-
~~~java

~~~

### 381.-
~~~java

~~~

### 382.-
~~~java

~~~

### 383.-
~~~java

~~~

### 384.-
~~~java

~~~

### 385.-
~~~java

~~~

### 386.-
~~~java

~~~

### 387.-
~~~java

~~~

### 388.-
~~~java

~~~

### 389.-
~~~java

~~~

### 390.-
~~~java

~~~

### 391.-
~~~java

~~~

### 392.-
~~~java

~~~

### 393.-
~~~java

~~~

### 394.-
~~~java

~~~

### 395.-
~~~java

~~~

### 396.-
~~~java

~~~

### 397.-
~~~java

~~~

### 398.-
~~~java

~~~

### 399.-
~~~java

~~~

### 400.-
~~~java

~~~

### 401.-
~~~java

~~~

### 402.-
~~~java

~~~

### 403.-
~~~java

~~~

### 404.-
~~~java

~~~

### 405.-
~~~java

~~~

### 406.-
~~~java

~~~

### 407.-
~~~java

~~~

### 408.-
~~~java

~~~

### 409.-
~~~java

~~~

### 410.-
~~~java

~~~

### 411.-
~~~java

~~~

### 412.-
~~~java

~~~

### 413.-
~~~java

~~~

### 414.-
~~~java

~~~

### 415.-
~~~java

~~~

### 416.-
~~~java

~~~

### 417.-
~~~java

~~~

### 418.-
~~~java

~~~

### 419.-
~~~java

~~~

### 420.-
~~~java

~~~

### 421.-
~~~java

~~~

### 422.-
~~~java

~~~

### 423.-
~~~java

~~~

### 424.-
~~~java

~~~

### 425.-
~~~java

~~~

### 426.-
~~~java

~~~

### 427.-
~~~java

~~~

### 428.-
~~~java

~~~

### 429.-
~~~java

~~~

### 430.-
~~~java

~~~

### 431.-
~~~java

~~~

### 432.-
~~~java

~~~

### 433.-
~~~java

~~~

### 434.-
~~~java

~~~

### 435.-
~~~java

~~~

### 436.-
~~~java

~~~

### 437.-
~~~java

~~~

### 438.-
~~~java

~~~

### 439.-
~~~java

~~~

### 440.-
~~~java

~~~

### 441.-
~~~java

~~~

### 442.-
~~~java

~~~

### 443.-
~~~java

~~~

### 444.-
~~~java

~~~

### 445.-
~~~java

~~~

### 446.-
~~~java

~~~

### 447.-
~~~java

~~~

### 448.-
~~~java

~~~

### 449.-
~~~java

~~~

### 450.-
~~~java

~~~

### 451.-
~~~java

~~~

### 452.-
~~~java

~~~

### 453.-
~~~java

~~~

### 454.-
~~~java

~~~

### 455.-
~~~java

~~~

### 456.-
~~~java

~~~

### 457.-
~~~java

~~~

### 458.-
~~~java

~~~

### 459.-
~~~java

~~~

### 460.-
~~~java

~~~

### 461.-
~~~java

~~~

### 462.-
~~~java

~~~

### 463.-
~~~java

~~~

### 464.-
~~~java

~~~

### 465.-
~~~java

~~~

### 466.-
~~~java

~~~

### 467.-
~~~java

~~~

### 468.-
~~~java

~~~

### 469.-
~~~java

~~~

### 470.-
~~~java

~~~

### 471.-
~~~java

~~~

### 472.-
~~~java

~~~

### 473.-
~~~java

~~~

### 474.-
~~~java

~~~

### 475.-
~~~java

~~~

### 476.-
~~~java

~~~

### 477.-
~~~java

~~~

### 478.-
~~~java

~~~

### 479.-
~~~java

~~~

### 480.-
~~~java

~~~

### 481.-
~~~java

~~~

### 482.-
~~~java

~~~

### 483.-
~~~java

~~~

### 484.-
~~~java

~~~

### 485.-
~~~java

~~~

### 486.-
~~~java

~~~

### 487.-
~~~java

~~~

### 488.-
~~~java

~~~

### 489.-
~~~java

~~~

### 490.-
~~~java

~~~

### 491.-
~~~java

~~~

### 492.-
~~~java

~~~

### 493.-
~~~java

~~~

### 494.-
~~~java

~~~

### 495.-
~~~java

~~~

### 496.-
~~~java

~~~

### 497.-
~~~java

~~~

### 498.-
~~~java

~~~

### 499.-
~~~java

~~~

### 500.-
~~~java

~~~

### 501.-
~~~java

~~~

### 502.-
~~~java

~~~

### 503.-
~~~java

~~~

### 504.-
~~~java

~~~

### 505.-
~~~java

~~~

### 506.-
~~~java

~~~

### 507.-
~~~java

~~~

### 508.-
~~~java

~~~

### 509.-
~~~java

~~~

### 510.-
~~~java

~~~

### 511.-
~~~java

~~~

### 512.-
~~~java

~~~

### 513.-
~~~java

~~~

### 514.-
~~~java

~~~

### 515.-
~~~java

~~~

### 516.-
~~~java

~~~

### 517.-
~~~java

~~~

### 518.-
~~~java

~~~

### 519.-
~~~java

~~~

### 520.-
~~~java

~~~

### 521.-
~~~java

~~~

### 522.-
~~~java

~~~

### 523.-
~~~java

~~~

### 524.-
~~~java

~~~

### 525.-
~~~java

~~~

### 526.-
~~~java

~~~

### 527.-
~~~java

~~~

### 528.-
~~~java

~~~

### 529.-
~~~java

~~~

### 530.-
~~~java

~~~

### 531.-
~~~java

~~~

### 532.-
~~~java

~~~

### 533.-
~~~java

~~~

### 534.-
~~~java

~~~

### 535.-
~~~java

~~~

### 536.-
~~~java

~~~

### 537.-
~~~java

~~~

### 538.-
~~~java

~~~

### 539.-
~~~java

~~~

### 540.-
~~~java

~~~

### 541.-
~~~java

~~~

### 542.-
~~~java

~~~

### 543.-
~~~java

~~~

### 544.-
~~~java

~~~

### 545.-
~~~java

~~~

### 546.-
~~~java

~~~

### 547.-
~~~java

~~~

### 548.-
~~~java

~~~

### 549.-
~~~java

~~~

### 550.-
~~~java

~~~

### 551.-
~~~java

~~~

### 552.-
~~~java

~~~