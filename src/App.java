import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class App {

    private String nombre;
    private int edad;
    private  char sexo;
    private double estatura;
    private float peso;
    private boolean estadoCivil;


    //Arranca todo el programa en java
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Tipos de datos y operadores
        int resultado = 15 + 35;
        boolean sexo = true;
        String res = "Hola";
        int resultado2 = 25/3;
        double resultado3 = 25/3;
        float resultado4 = 28*21;
        int resultado5 = 21 % 9;

        //Operadores unarios - permiten cambiar el valor de una variable
        resultado++;
        resultado--;
        resultado = -resultado; //Valor negativo del resultado
        resultado = +resultado;

        //Algebra booleana
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8;
        respuesta = 12 < 5 && 4 > 1;
        respuesta = 12 < 5 || 4 > 1;

        //Operadores bit a bit
        //& es un and que aparece bit a bit
        //^ XOR
        //|

        //Estructuras de control
        if (respuesta) {
            //bloque de codigo si se cumple
        } else {
            //bloque de codigo si no se cumple
        }



    }
}
