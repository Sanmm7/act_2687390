import java.util.Random;

public class Retocraps {
  public static void main(String[] args) {
    Random rand = new Random();
    System.out.println("Vamos a jugar, preparate.... " );

    int dado1 = rand.nextInt(6) + 1;
    int dado2 = rand.nextInt(6) + 1; 
    int total = dado1 + dado2; 

    System.out.println("Lanzamiento: " + dado1 + " + " + dado2 + " = " + total);

    if (total == 2 || total == 12) {
      System.out.println("Ganaste. Los dados suman " + total);
    } else if (total == 3 || total == 11) {
      System.out.println("¡Ganaste! Los dados suman " + total);
    } else if (total == 7) {
      System.out.println("¡Ganaste! Los dados suman " + total);
    } else if (dado1 == 1 && dado2 == 1) {
      System.out.println("¡Ganaste! Los dados suman " + total);
    } else {
      System.out.println("Perdiste. Los dados suman " + total);
    }
  }
}
