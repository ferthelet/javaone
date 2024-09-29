## Controlando el accesso a la escitura de datos

En Java, los modificadores de acceso son palabras clave que definen el nivel de visibilidad de las clases, atributos y métodos, y ayudan a garantizar la seguridad y el encapsulamiento del código.

Existen cuatro tipos de modificadores de acceso en Java: public, protected, private y default (también conocido como package-private).

### Public

El modificador de acceso "public" es el más permisivo de todos. Una clase, atributo o método declarado como "public" puede ser accedido por cualquier clase en cualquier paquete. Es decir, tiene visibilidad pública y puede ser utilizado libremente.

### Default (Paquete-privado)

El modificador de acceso "default" es aquel que no especifica ningún modificador de acceso. Cuando no se especifica ningún modificador de acceso, la clase, atributo o método solo puede ser accedido por las clases que están en el mismo paquete.

### Private

El modificador de acceso "private" es el más restrictivo de todos. Una clase, atributo o método declarado como "private" solo puede ser accedido dentro de la propia clase. Es decir, tiene visibilidad restringida y no puede ser utilizado por otras clases. 

### Protected

Hablaremos de Protected más adelante en el curso, después de presentar el concepto de herencia de clases.

## Patron de nombre de paquetes

En Java, los paquetes se utilizan para agrupar clases relacionadas a una funcionalidad específica. Ayudan a organizar el código, facilitando su gestión y evitando que cientos de clases diferentes se mezclen en un solo directorio.

La organización de clases dentro de un paquete puede hacerse mediante subpaquetes o colocando las clases directamente en el paquete, dependiendo de la complejidad del proyecto. Además, es importante seguir la convención de nomenclatura de paquetes para asegurarse de que los paquetes sean fácilmente identificables.

En cuanto a la nomenclatura de paquetes, otro aspecto importante es el uso del nombre de dominio inverso de la empresa u organización como parte del nombre del paquete. Por ejemplo, si el nombre de dominio de la empresa fuera "miempresa.com" y el proyecto Java se llamara "miproyecto", el nombre del paquete de dominio inverso sería "com.miempresa.miproyecto". Dentro de este paquete principal, podemos tener varios subpaquetes para una mejor organización del código del proyecto.

Esto ayuda a garantizar que el nombre del paquete sea único y evita conflictos de nombres con otros paquetes en otros proyectos. Además, el uso del nombre de dominio inverso como parte del nombre del paquete también ayuda a identificar fácilmente al propietario del proyecto Java.

## Encapsulamiento

[Revisando la Orientación a Objetos: encapsulación de Java](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Palabra clave `this`

"this", traducido al español como "esto/este/esta", se utiliza para hacer referencia a los atributos de la clase, especialmente en métodos que tienen parámetros con el mismo nombre que el atributo de la clase en la que estamos trabajando.

```js
public class Lampara{
    private boolean encendida;
    private String modelo;

    public void enciendeLaLampara(boolean encendida) {
       this.encendida= encendida;
    }
}
```

Observa que en este ejemplo, tenemos un atributo de la clase llamado `encendida`, y el método `enciendeLaLampara` que establece un nuevo valor para este atributo.

El método recibe como parámetro un booleano que tiene el mismo nombre que el atributo de la clase. Ahí es donde surge el problema. ¿Cómo sabríamos cuál es el atributo de la clase y cuál es el parámetro del método? En esta situación, usamos la palabra clave `this`.

## Lo que aprendimos

- Encapsulación: controlar el acceso a los atributos y métodos de una clase.
- Qué son los modificadores de acceso public y private.
- Métodos de lectura de atributos, que son los métodos getters.
- Métodos de modificación de los atributos, que son los métodos setters.
- El uso de la palabra clave "import" para importar clases de otros paquetes.
- El uso de la palabra clave "this".
- Buenas prácticas para dividir el código en paquetes, siguiendo la convención de dominio de la empresa al revés, por ejemplo, "com.aluracursos.screenmatch".

## Herencia

La herencia es un concepto fundamental en la programación orientada a objetos y se implementa en Java a través de la relación "es un" entre clases. Esto significa que una clase puede heredar atributos y métodos de otra clase, lo que hace que el código sea más reutilizable.

En Java, la herencia se realiza utilizando la palabra clave **extends**. La clase que se hereda se llama subclase y la clase que es heredada se llama superclase. La subclase puede acceder a todos los atributos y métodos públicos y protegidos de la superclase, además de poder sobrescribir `@Override` los métodos de la superclase para crear comportamientos específicos.

```java
public class Cuenta {

  private String titular;
  private double saldo;

  public void retirar(double valor) {
    if (valor <= 0) {
      System.out.println("El valor debe ser mayor que cero");
    } else if (saldo >= valor) {
      saldo -= valor;
      System.out.println("Retiro realizado com éxito. Saldo actual: " +saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito realizado com éxito. Saldo actual: " +saldo);
    } else {
      System.out.println("El valor debe ser mayor que cero");
    }
  }

  //getters y setters
}
```

```java
public class CuentaAhorro extends Cuenta{

  private double tasaDeIntereses;

  public void calcularIntereses() {
    double intereses= this.getSaldo() * tasaDeIntereses;
    System.out.println("Intereses actuales : " + intereses);
  }

  public void retirar(double valor) {
    double tasaDeRetiro= 0.01;
    super.retirar(valor + tasaDeRetiro);
  }

  //getters y setters
}
```

En el código anterior, la clase `Cuenta` es la superclase y la clase `CuentaAhorro` es la subclase. La clase `CuentaAhorro` hereda los atributos y métodos de la clase `Cuenta`, y agrega un nuevo atributo `tasaDeIntereses` y un nuevo método `calcularIntereses`. Aunque los atributos son heredados, como se declararon como private en la superclase, no pueden ser accedidos directamente en la subclase, por lo que se deben utilizar los métodos `getters/setters`, que son públicos.

También observe en el código anterior que la subclase sobrescribe el método retirar para descontar la tarifa de retiro, además de usar la palabra clave `super` para llamar al método de la superclase, evitando duplicar un código ya existente. Esta es la gran ventaja de la herencia: la reutilización de código con la flexibilidad para sobrescribir comportamientos.

### Herencia multiple

En Java, es importante destacar que **no** se permite la herencia múltiple. La herencia múltiple ocurre cuando una subclase hereda de dos o más superclases. Se puede simular estableciendo una jerarquia.

```java
public class Cuenta{
  //codigo de la clase omitido
}

public class CuentaCorriente extends Cuenta{
 //codigo de la clase omitido
}

public class CuentaCorrientePersonaFisica extends  CuentaCorriente {
  //codigo de la clase omitido
}
```

En el código anterior, la clase `CuentaCorrientePersonaFisica` hereda de CuentaCorriente , que a su vez hereda de la clase `Cuenta`, es decir, indirectamente la clase `CuentaCorrientePersonaFisica` heredará de `Cuenta`, ya que su superclase hereda de ella.

## Anotaciones: `Annotations`

son una forma de agregar configuraciones al código Java de manera muy sencilla. Se utilizan para proporcionar información adicional sobre el código, como el significado de una clase, un método o un atributo.

En Java, las anotaciones se definen utilizando el símbolo `@` seguido del nombre de la anotación. Por ejemplo, la anotación `@Deprecated` se utiliza para indicar que un método o clase está obsoleto y no debe utilizarse más. Otra anotación muy útil es `@`Override`, como se mostró en el último video, que indica que un método está sobrescribiendo el mismo método definido en su clase padre.

Varias especificaciones y frameworks de Java, como `Hibernate`, `Bean Validation` y `Spring`, utilizan anotaciones. Por ejemplo, en `Bean Validation`, la anotación `@NotNull` se utiliza para validar que un atributo no sea nulo.

Las anotaciones son muy útiles y comunes en aplicaciones Java, por lo que es importante que estés familiarizado con este recurso, ya que seguramente lo utilizarás mucho en tus proyectos.

Mas info en [Creando anotaciones en Java](https://www.aluracursos.com/blog/crear-anotaciones-en-java)

## Polimorfismo en Java

El polimorfismo es un concepto fundamental de la programación orientada a objetos en Java que permite que objetos de diferentes clases se comporten de manera uniforme. Esto se logra a través de la capacidad de una clase para tomar varias formas o comportarse de diferentes maneras según el contexto. En Java, el polimorfismo se implementa principalmente mediante **dos** mecanismos: el polimorfismo de clases (herencia) y el polimorfismo de interfaces.

### Polimorfismo de Clases (Herencia)

En el polimorfismo de clases, las subclases heredan comportamientos de su superclase. Cada subclase puede proporcionar su propia implementación de métodos heredados.

```java
class Animal {
    void hacerSonido() {
        System.out.println("Hace un sonido genérico");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("El gato maulla");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miMascota = new Perro();
        miMascota.hacerSonido(); // Salida: El perro ladra

        miMascota = new Gato();
        miMascota.hacerSonido(); // Salida: El gato maulla
    }
}
```

### Polimorfismo de Interfaces:

En el polimorfismo de interfaces, múltiples clases implementan la misma interfaz y proporcionan su propia implementación de los métodos definidos en la interfaz. Esto permite tratar objetos de diferentes clases de manera intercambiable. 

```java
interface Figura {
    double calcularArea();
}

class Circulo implements Figura {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo implements Figura {
    double longitud, ancho;

    Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }
}

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 3.0);

        System.out.println("Área del círculo: " + figura1.calcularArea()); // Salida: Área del círculo: 78.54
        System.out.println("Área del rectángulo: " + figura2.calcularArea()); // Salida: Área del rectángulo: 12.0
    }
}
```

En estos ejemplos, el polimorfismo permite que objetos de diferentes clases sean tratados de manera uniforme, lo que promueve la flexibilidad y la reutilización del código.

Para mas informacion [POO: ¿Qué es la programación orientada a objetos?](https://www.aluracursos.com/blog/poo-que-es-la-programacion-orientada-a-objetos)

## El modificador protected

Al usar herencia en Java, tenemos la posibilidad de utilizar el modificador de acceso `protected`, que permite que los atributos de una clase sean accesibles por otras clases del mismo paquete y también por sus subclases, independientemente del paquete en el que se encuentren.

El modificador `protected` es útil en situaciones en las que una clase necesita permitir que sus subclases accedan directamente a sus atributos, sin la necesidad de restringir el acceso solo a través de los métodos `getters` y `setters`. Por ejemplo, supongamos que tenemos las siguientes clases en un proyecto:

```java
public class Cuenta {

  private String titular;
  private double saldo;

  public void retirar(double valor) {
    //codigo omitido
    }

  public void depositar(double valor) {
//codigo omitido
     }

  //getters y setters
}
```

```java
public class CuentaAhorro extends Cuenta{

  private double tasaDeIntereses;

  public void calcularIntereses() {
    double intereses= this.getSaldo() * tasaDeIntereses;
    System.out.println("Intereses actuales : " + intereses);
  }

  //getters y setters
}
```

En el código anterior, observe que en el método `calcularIntereses` de la clase `CuentaAhorro`, el atributo saldo no se accede directamente, ya que se declaró como private en la clase `Cuenta`, por lo que su acceso debe realizarse mediante el método `getSaldo()`.

Podemos declarar el atributo saldo como `protected` para evitar esta situación y permitir el acceso directo a él desde las clases que heredan de la clase Cuenta:

```java
public class Cuenta {

  private String titular;
  protected double saldo;

  public void retirar(double valor) {
    //codigo omitido
    }

  public void depositar(double valor) {
//codigo omitido
     }

  //getters y setters
}
```

```java
public class CuentaAhorro extends Cuenta{

  private double tasaDeIntereses;

  public void calcularIntereses() {
    double intereses= this.saldo() * tasaDeIntereses;
    System.out.println("Intereses actuales : " + intereses);
  }

  //getters y setters
}
```

Observe que ahora el atributo saldo se accede directamente desde la clase CuentaAhorro.

## Lo que has aprendido hasta el momento

- El problema de tener código duplicado en varias clases y cómo utilizar la herencia como solución.
- La palabra clave extends, que se utiliza para indicar que una clase hereda de otra.
- Cómo sobrescribir un método heredado, con la opción de usar la anotación @Override.
- Cómo aplicar el concepto de polimorfismo en el código para evitar duplicación de métodos.

## Entendiendo las interfaces

En Java, las interfaces son una forma de definir un contrato que las clases deben seguir, especificando qué métodos deben ser implementados por las clases que las utilicen. Las interfaces permiten que diferentes clases se puedan tratar de manera estandarizada mediante el polimorfismo, lo que hace que el código sea fácil de extender con nuevos comportamientos.

```java
public interface Tributable {

    double getValorImpuesto();

}
```

En el ejemplo de código anterior, estamos definiendo una interfaz llamada `Tributable` que contiene un único método llamado `getValorImpuesto()` que devuelve un valor de tipo `double`. Cualquier clase que quiera ser tributable en el proyecto puede implementar esta interfaz.

Para implementar una interfaz, se utiliza la palabra clave `implements` después de la definición de la clase. La clase que implementa la interfaz debe proporcionar implementaciones para todos los métodos definidos en la interfaz.

```java
public class Producto implements Tributable{

    private String nombre;
    private double valor;

    @Override
    public double getValorImpuesto() {
        return this.valor * 0.1;
    }

    //getters y setters
}
```

En el ejemplo anterior, estamos creando una clase llamada `Producto` que implementa la interfaz `Tributable`. Esta clase proporciona una implementación del método `getValorImpuesto()` que está definido en la interfaz `Tributable`. La implementación calcula el impuesto como el 10% del valor del producto.

También podríamos tener una clase de servicio, como se muestra a continuación:

```java
public class Servicio implements Tributable {

    private String descripcion;
    private double valor;
    private double cuotaJubilacion;

    @Override
    public double getValorImpuesto() {
        return this.valor * this.cuotaJubilacion / 100;
    }

    //getters y setters
}
```

En el ejemplo anterior, estamos creando una clase llamada `Servicio` que también implementa la interfaz `Tributable`. Esta clase proporciona una implementación del método `getValorImpuesto()` que calcula el impuesto como el valor multiplicado por la cuota de `Jubilacion` dividido por 100.

### Uso de interfaces

Las interfaces se pueden utilizar para definir comportamientos que se pueden aplicar a diferentes clases, lo que hace que el código sea más modular y fácil de mantener. Por ejemplo, supongamos que tenemos un sistema de ventas que necesita calcular el impuesto de diferentes tipos de productos. Podemos crear la interfaz `Tributable` para definir el comportamiento de cálculo de impuestos y luego crear varias clases diferentes que implementen esta interfaz para calcular el impuesto de diferentes productos.

```java
public class CalculadoraImpuestos {

    private double totalImpuesto = 0;

    public void calcularImpuesto(Tributable item) {
        this.totalImpuesto += item.getValorImpuesto();
    }

    public double getTotalImpuesto() {
      return this.totalImpuesto;
    }

}
```

En este ejemplo, estamos creando una clase llamada `CalculadoraImpuesto` que tiene un atributo privado llamado `totalImpuesto` para almacenar el valor total de los impuestos. El método `calcularImpuesto` recibe un parámetro de tipo `Tributable`. Al declarar una variable con el tipo de una interfaz, como se hace en este método, podemos asignarle cualquier objeto que implemente esa interfaz, ya sea un objeto de tipo `Servicio` o `Producto`. En ambos casos, la `CalculadoraImpuesto` llamará al método implementado en la clase específica. Esto es muy útil cuando queremos tratar varios objetos de clases diferentes de manera similar, lo que facilita el mantenimiento y la extensión del código. Este es otro ejemplo de la aplicación del polimorfismo en Java, pero ahora con el uso de interfaces.

## Ejercicio de herencia e interfaz

Tu amigo Andrés está trabajando en una aplicación Java para una tienda y necesita implementar una nueva funcionalidad de tributación de impuestos. Hasta ahora, la aplicación tenía las siguientes clases:

```java

public class Item{

    private String nombre;
    private double precio;

    // métodos getters y setters omitidos

}
```

```java

public class Producto extends Item{

    private double peso;

    // métodos getters y setters omitidos

}
```

```java

public class Servicio extends Item{

    private int cantidadHoras;

    // otros métodos de la clase Servicio

}
```

```java

public class Regalo extends Item{

    private String justificacion;

    // métodos getters y setters omitidos

}
```

Y para implementar la nueva funcionalidad, Andrés creó una interfaz llamada `Tributable` con el siguiente código:

```java

public interface Tributable{

    double calculaImpuesto();

}
```

Y también creó una clase para calcular el total de impuestos:

```java

public class CalculadoraImpuesto {

    private double totalImpuesto = 0;

    public void calculaImpuesto(Tributable tributable) {
        totalImpuesto += tributable.calculaImpuesto();
    }

}
```

Y para que los Productos y Servicios de la tienda sean grabados, modificó el código de estas respectivas clases para que implementen la interfaz `Tributable`:

```java

public class Producto extends Item implements Tributable {

    private double peso;

    public double calculaImpuesto() {
        //producto tiene 10% de impuesto:
        return getPrecio() * 0.1;
    }

    // métodos getters y setters omitidos

}
```

```java

public class Servicio extends Item implements Tributable {

    private int cantidadHoras;

    public double calculaImpuesto() {
        //servicio tiene 12% de impuesto:
        return getPrecio() * 0.12;
    }

    // otros métodos de la clase Servicio

}
```

- La interfaz Imponible debe implementarse solo en las clases que sean tributables, independientemente del uso de la herencia.
- Gracias al polimorfismo, objetos de diferentes clases pueden tratarse de manera uniforme, lo que simplifica el código y evita duplicaciones.

## Lo que has aprendido

- Que en Java, una clase puede heredar de solo una clase.
- El concepto de interfaces en Java.
- Que en una interfaz, todos los métodos son públicos, por lo que no es necesario usar la palabra reservada "public" en sus declaraciones.
- Que también es posible aplicar el polimorfismo mediante el uso de interfaces, de manera similar a lo que se demostró con la herencia en lecciones anteriores.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).