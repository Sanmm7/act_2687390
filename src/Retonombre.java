import java.util.Scanner;

public class Retonombre {
  public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    System.out.print("Ingrese su nombre: ");
    String nombre = lectura.next();
    System.out.print("Ingrese su apellido: ");
    String apellido = lectura.next();
    int longNombre = nombre.length();
    int longApellido = apellido.length();
    String nombreMayus = nombre.toUpperCase();
    String apellidoMinus = apellido.toLowerCase();
    String nombreCompleto = nombre + " " + apellido;
    String nombreCorto = nombre.substring(0, 2);
    String nombreApellido = nombreCorto + apellido;
    System.out.println("La longitud del nombre es: " + longNombre);
    System.out.println("La longitud del apellido es: " + longApellido);
    System.out.println("El nombre en mayúsculas es: " + nombreMayus);
    System.out.println("El apellido en minúsculas es: " + apellidoMinus);
    System.out.println("El nombre completo es: " + nombreCompleto);
    System.out.println("Las dos primeras letras del nombre más el apellido son: " + nombreApellido);
    lectura.close();
  }
}
