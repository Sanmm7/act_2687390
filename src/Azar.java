import java.util.Scanner;
import java.util.Random;



public class Azar {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int num;
        System.out.println("Ingrese 1 para elegir cara o 2 para elegir sello ");
        num= lectura.nextInt();
        Random r = new Random();
        int valor = r.nextInt(2)+1;
        if(valor==1 && num==1){
            System.out.println("Usted escogio de  cara y el resultado  fue cara  lo que quiere decir que gano");


        }
        else if(valor==2 && num==2){
            System.out.println("Usted escogio   sello y el resultado al azar fue sello lo que quiere decir que gano");

        }
      else if (num==1){
        System.out.println("Usted escogio  cara y el resultado al azar fue  sello lo que quiere decir que no gano");

      }
      else if(num==2){
      System.out.println("Usted escogio sello   y el resultado al azar fue  cara lo que quiere decir que no gano");
      }
      else{
        System.out.println("valor no permitido");

      }

      

        lectura.close();
    }
}

