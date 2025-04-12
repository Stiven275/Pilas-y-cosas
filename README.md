public class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private boolean desplazado;
    private int estrato;
    private double auxilio;

    private static final double SALARIO_MINIMO = 1300000;

    public Persona(String nombre, String cedula, int edad, boolean desplazado, int estrato) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.desplazado = desplazado;
        this.estrato = estrato;
        this.auxilio = calcularAuxilio();
    }

    private double calcularAuxilio() {
        boolean esVulnerable = (estrato == 1 || estrato == 2) || desplazado;
        if (edad < 18 && esVulnerable) {
            return SALARIO_MINIMO * 0.8;
        }
        return 0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Desplazado: " + (desplazado ? "Sí" : "No"));
        System.out.println("Estrato: " + estrato);
        System.out.println("Auxilio asignado: $" + auxilio);
        System.out.println("-------------------------");
    }
}
