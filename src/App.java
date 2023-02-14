import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int numberone,numbertwo;
        System.out.println("Ingrese un numero");
        numberone= lectura.nextInt();
        System.out.println("Ingrese otro numero");
        numbertwo= lectura.nextInt();
        System.out.println("El numero que ingresastes es "+numberone);
        System.out.println("El otro numero  que ingresastes es "+numbertwo);
        int suma=numberone+numbertwo;
        System.out.println("La suma es "+suma);
        String name;
        lectura.nextLine();//limpieza de buffer
        System.out.println("ingrese tu nombre  ");
        name= lectura.nextLine();
        System.out.println("el nombre ingresado fue "+name);




     




        lectura.close();
    }
}
