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

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.
## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).