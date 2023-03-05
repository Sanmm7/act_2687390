import java.util.Random;
import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("Bienvenido al juego de piedra, papel o tijera. ¿Listo para jugar?");

        while (true) {
            System.out.print("Ingrese su opción (piedra, papel o tijera): ");
            String opcionUsuario = scanner.nextLine().toLowerCase();

            if (opcionUsuario.equals("salir")) {
                System.out.println("Hasta la próxima!");
                break;
            }

            if (!opcionUsuario.equals("piedra") && !opcionUsuario.equals("papel") && !opcionUsuario.equals("tijera")) {
                System.out.println("Opción inválida. Por favor ingrese piedra, papel o tijera.");
                continue;
            }

            int opcionMaquina = random.nextInt(3);
            String opcionMaquinaStr = opciones[opcionMaquina];

            System.out.println("La máquina eligió " + opcionMaquinaStr);

            if (opcionUsuario.equals(opcionMaquinaStr)) {
                System.out.println("Empate!");
            } else if ((opcionUsuario.equals("piedra") && opcionMaquinaStr.equals("tijera")) ||
                       (opcionUsuario.equals("papel") && opcionMaquinaStr.equals("piedra")) ||
                       (opcionUsuario.equals("tijera") && opcionMaquinaStr.equals("papel"))) {
                System.out.println("Ganaste!");
            } else {
                System.out.println("Perdiste!");
            }
        }

        scanner.close();
    }

}
