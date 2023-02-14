
import java.util.Scanner;


public class Reto1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double grades;
        System.out.println("Ingrese los grados en Fahreint");
        grades= lectura.nextDouble();
        double centigrados=(grades-32*5/9);
        System.out.println("Los grados en centigrados es "+centigrados);

        lectura.close();
    }
}
