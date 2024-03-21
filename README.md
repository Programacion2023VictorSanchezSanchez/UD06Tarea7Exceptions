# UD06Tarea7Exceptions
### Ejercicio 1
java.lang.Exception

### Ejercicio 2
NullPointerException

### Ejercicio 3
Se producirá la excepción NullPointerException porque al intentar acceder al lenght da null

### Ejercicio 4
Se producirá la excepción NumberFormatException porque no podemos convertir la cadena de String hola en un número

String aux = "hola";

try {

    int aux2 = Integer.parseInt(aux);
    
    System.out.println("El valor convertido es: " + aux2);
    
} catch (NumberFormatException e) {

    System.out.println("No se puede convertir la cadena en un número entero.");
    
}

### Ejercicio 5
a) NumberFormatException y ArithmeticException

b) Son unchecked ambas

c)

public class Main {

    public static void main(String[] args) {
    
        metodoExcepcion1();
        
        metodoExcepcion2();
        
    }

    public static void metodoExcepcion1() {
    
        try {
        
            System.out.println(3 / 0); // Genera una ArithmeticException
            
        } catch (ArithmeticException e) {
        
            System.out.println("Error: División por cero.");
            
        }
        
    }

    public static void metodoExcepcion2() {
    
        String texto = "Test";
        
        try {
        
            int divisor = Integer.parseInt(texto); // Genera una NumberFormatException
            
            System.out.println("El valor convertido es: " + divisor);
            
        } catch (NumberFormatException e) {
        
            System.out.println("Error: No se puede convertir la cadena en un número entero.");
            
        }
        
    }
    
}

d)

