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

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).