import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.DoubleToLongFunction;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hola mundo!");

        //variables primitivas

        int outInt;
        outInt = 400;

        double pi = 3.1416;

        boolean bool = true;
        char unCaracter = 'A';
        String multiplesCaracteres ="ABCD";
        Integer myInt = 5;
        Double myDouble=5.99;

        // Character  

        String mystring = myInt.toString();
        System.out.println(mystring.length());

        // cadenas-string

        String cadenas = "buenos dias";

        char letra = cadenas.charAt(1);
        int a = cadenas.indexOf("bue");
        int b = cadenas.indexOf("dia");

        System.out.println(cadenas.toLowerCase());
        System.out.println(cadenas.toUpperCase());

        // concat()


        // equals()

        String x = "hola";
        String y = "hola";
        System.out.println(x.equals(y));

        // arrays
        int[] myArray;
        myArray = new int[5];
        // myArray = new int[5][5];

        int[] myArray2 = { 3, 5, 5, 7 };
        
        ArrayList<Integer> myArray3 = new ArrayList<Integer>();

        myArray3.add(10);
        // myArray3.re
        // condicionalesy operadores

        if(myArray3.size() == 2 || myArray3.size()==1){
            System.out.println(myArray3.size()+"--");
        } else {
            System.out.println("null");
        }

        // HelloWorld helloApp = new HelloWorld();
        // System.out.println(helloApp.hola());
        System.out.println(HelloWorld.hola());






    }
}