class HelloWorld {

    // FUNCIONES
    //tipo de funcion :public private
    //return String, int , void
    //name;}
    //parametros con su tipo de variable
    
    public static String hola() {
        return "Hola Mundo!!";
    }

    // sobrecarga de métodos -> hola() y hola(String)

    public static String hola(String nombre) {
        return "Hola" + nombre + '!';
    }

    public static String hola(String nombre, String apellido) {
        return "Hola" + nombre +" "+ apellido + '!';
    }
}
