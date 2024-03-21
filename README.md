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
