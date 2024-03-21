package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        try {
            // Ejemplo de creación de un objeto Persona
            Persona persona = new Persona("12345678Z", 30, "Juan Pérez Gómez");
            System.out.println("Persona creada correctamente:");
            System.out.println("DNI: " + persona.getDni());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Nombre: " + persona.getNombre());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear la persona: " + e.getMessage());
        }
    }
}
