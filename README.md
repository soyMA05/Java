# Java
Java desde Cero



# Bucles
- Postfijo: x++ o x--  (Primero utiliza y luego incrementa)
- Prefijo: ++x o --x (Primero incrementa y luego utilza)
- For: inicia y termina segun los saltos. 
- While:  evalua la condicion antes del bucle.
- Do While: se ejecuta al menos una vez y luego evalua la condicion.

# Concepto y creación de Métodos
Un método es una acción o comportamiento de los objetos.

```java
//declaración del metodo

// modificador de acceso | valor de retorno | nombre del metodo (argumentos){}
public void nombreMetodo(){
  //operaciones
}
```
## Métodos: Parámetros y Argumentos
* **Párametro**: Es una declaración de variable u objeto.
* **Argumento**: Es un valor que se envía.

```java
//declaración del método
public void nombreMetodo(Int a, String b){//USO DE PARAMETROS
  //operaciones
}

//invocación del método
n = Integer.ParseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
objeto.método(n, 1,"Hola");//USO DE ARGUMENTOS
```

## Métodos: Retorno de valores
* **return** permite devolver un valor a la seccion del código que invoca al método o función.
* Cualquier método que esté declarado como **void**, no devolverá ningún valor.
```java
public String nombreMetodo(String b){//USO DE PARAMETROS
  String respuesta = "hola" + b
  return respuesta
}

public int nombreMetodo(int a){//USO DE PARAMETROS
  int respuesta = a
  return respuesta
}
```
## Método Constructor y sobrebrecarga
Un constructor es un método especial de un clase que se invoca siempre que se crea un objeto de esa clase.

***NOTA***: Cuando se crea un objeto ocurre 3 cosas:
1. Se asigna memoria para el objeto (nombre de la instancia del objeto).
2. Se inicializan los atributos de ese objeto.
3. Se invoca al constructor de la clase que puede ser entre uno o varios.
```java
Persona p1 = new Persona(valoresConstructor);

//Crear constructor
public Persona(atributos que se deseen inicilizar){
}
//Sobrecarga metodo constructor
public Persona(atributos a inicilizar diferentes al primero){
}
//el mismo caso aplica para los otros tipo de metodos
``` 

## Modificadores de Acceso
Son palabras claves que nos permiten cambiar el nivel de visibilidad o privilegios de acceso a los componentes de un objeto (atributos y metodos).
```java
public class Persona{

  //#NIVEL DE PAQUETE
  int atributo0 //modificador de acceso por defecto que NO se deja acceder por clases que se encuentran en paquetes diferentes pero SI por clases del mismo paquete.
  
  //#NIVEL INTERPAQUETES (paquetes del mismo proyecto)
  public int atributo1 //modificado de acceso publico que SI se deja acceder desde clases que se encuentran en paquetes diferentes.
  
  //# NIVEL DE CLASE
  private int atributo2 //modificador de acceso privado que SOLO se puede acceder por metodos de la misma clase
}
```
# Encapsulamiento y metodos accesores(Getters and Setters)
El **encapsulamiento** es ocultar datos (atributos) para que no cualquiera lo pueda modificar, sino que puedan ser modificados por metodos de la misma clase, para lo cual se usan los métodos **Setters para establecer y Getters para obtener atributos encapsulados**.

Si los atributos están con private no se podrá acceder desde el main a esos valores directamente, por lo tanto debemos usar los metodos Setters para establecer un valor a ese atributo y Getter para obtener el valor del atributo.


# Indice Repositorio Java
### Carpeta POO
* **Operaciones**: proyecto con 3 clases. Operaciones, clase con metodos sin parametros ni argumentos. OperacionesParamArgum, tiene parametros y argumentos. Operaciones_conReturn tiene metodos con return.
* **PooPersona**:  Contiene la creacion de metodos constructores, sobrecarga de constructores y metodos de metodos de accion de clase.
