package Ejercicio7;

public class Persona {
    private String dni;
    private int edad;
    private String nombre;

    public Persona(String dni, int edad, String nombre) throws IllegalArgumentException {
        setDni(dni);
        setEdad(edad);
        setNombre(nombre);
    }

    public void setDni(String dni) throws IllegalArgumentException {
        if (!esDniValido(dni)) {
            throw new IllegalArgumentException("El DNI proporcionado no es válido.");
        }
        this.dni = dni;
    }

    public void setEdad(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        String[] partesNombre = nombre.split(" ");
        if (partesNombre.length < 3) {
            throw new IllegalArgumentException("El nombre debe tener al menos tres palabras (nombre y dos apellidos).");
        }
        this.nombre = nombre;
    }

    // Método para verificar si un DNI es válido
    private boolean esDniValido(String dni) {
        boolean esValido = true;
        if (dni.length() != 9) {
            esValido = false; // El DNI debe tener longitud 9 (8 dígitos y una letra)
        }

        String numeros = dni.substring(0, 8);
        String letra = dni.substring(8);

        // Comprobamos que la parte numérica sea un número válido
        try {
            int num = Integer.parseInt(numeros);
        } catch (NumberFormatException e) {
            esValido = false; // Si la conversión a entero falla, el DNI no es válido
        }

        // Comprobamos que la letra sea correcta
        String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num = Integer.parseInt(numeros) % 23;
        char letraCalculada = letrasValidas.charAt(num);

        esValido = letra.equalsIgnoreCase(String.valueOf(letraCalculada));

        return esValido;
    }

    // Getters para acceder a las propiedades
    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
