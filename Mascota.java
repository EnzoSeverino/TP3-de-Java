public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    public void mostrarInfo(){
        System.out.println("Informacion de mascota:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad);
    }
    public void cumplirAnios(){
        edad++;
        System.out.println("Año cumplido.");
    }
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Pemo","Gato",3);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    }
}
