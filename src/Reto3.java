import java.util.Scanner;
import java.util.Random;



public class Reto3 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int num;
        System.out.println("Ingrese 1 para elegir piedra, 2 para elegir papel,3 para elegir tijera ");
        num= lectura.nextInt();
        Random r = new Random();
        int valor = r.nextInt(3)+1;
        if(valor==1 && num==1){
            System.out.println("Usted escogio piedra y el resultado  fue piedra  lo que quiere decir que empato");


        }
        else if(valor==2 && num==2){
            System.out.println("Usted escogio   papel y el resultado al azar fue papel lo que quiere decir que empato");

        }
      else if (valor==3 && num==3){
        System.out.println("Usted escogio  tijera y el resultado al azar fue  tijera lo que quiere decir que empato");

      }
      else if(valor==3 && num==1){
      System.out.println("Usted escogio piedra   y el resultado al azar fue tijerra lo que quiere decir que  gano");
      }
      else if(valor==2 && num==3){
        System.out.println("Usted escogio tijera   y el resultado al azar fue papel  lo que quiere decir que  gano");
        }
        else if(valor==1 && num==2){
            System.out.println("Usted escogio papel   y el resultado al azar fue piedra  lo que quiere decir que  gano");
            }
      else if(valor==1 && num==3){
        System.out.println("Usted escogio tijera   y el resultado al azar fue piedra lo que quiere decir que no gano");
        }
        else if(valor==3 && num==2){
            System.out.println("Usted escogio papel   y el resultado al azar fue tijera  lo que quiere decir que no gano");
            }
            else if(valor==2 && num==1){
                System.out.println("Usted escogio piedra   y el resultado al azar fue papel  lo que quiere decir que no  gano");
                }
                else{
                    System.out.println("Valor no permitido");


                }

        lectura.close();
    }
}
