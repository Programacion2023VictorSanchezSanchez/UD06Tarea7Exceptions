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

d) Un bloque try-catch para cada uno

### Ejercicio 6
Introducimos estos bloques try-catch

try {

            posicion = Integer.parseInt(cadena);
            
            if (posicion < 0 || posicion > valores.length) {
            
                throw new IndexOutOfBoundsException("La posición ingresada está fuera de los límites del array.");
                
            }
            
        } catch (NumberFormatException e) {
        
            System.out.println("Error: La posición debe ser un número entero.");
            
            return;
            
        } catch (IndexOutOfBoundsException e) {
        
            System.out.println("Error: La posición debe estar dentro del rango del array.");
            
            return;
        }



![Screenshot_20240321_165613](https://github.com/Programacion2023VictorSanchezSanchez/UD06Tarea7Exceptions/assets/147086408/01b8b5c4-2f62-40d3-b473-b47873cbd0b5)



