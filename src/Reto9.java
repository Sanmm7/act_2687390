import java.util.Scanner;
import java.util.Random;



public class Reto9 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int num,op;
        double incre=0;
        double vglobal=23000045;
        System.out.println("Cuantas veces desea jugar ");
        op= lectura.nextInt();
        int impre=op;
        System.out.println("Cuantas deseas apostar ");
        incre= lectura.nextDouble();
        double vapostado=incre;
        while(op>=1){
            System.out.println("Ingrese 1 para elegir cara o 2 para elegir sello ");
            num= lectura.nextInt();
            Random r = new Random();
            int valor = r.nextInt(2)+1;
            if(valor==1 && num==1){
                System.out.println("Usted escogio de  cara y el resultado  fue cara  lo que quiere decir que gano");
                 vglobal=vglobal-incre;
                 incre=incre*2;
                
              
            }
            else if(valor==2 && num==2){
                System.out.println("Usted escogio   sello y el resultado al azar fue sello lo que quiere decir que gano");
                 vglobal=vglobal-incre;
                 incre=incre*2;
         
              }
          else if (num==1){
            System.out.println("Usted escogio  cara y el resultado al azar fue  sello lo que quiere decir que no gano");
             vglobal=vglobal+incre;
             incre=incre-vapostado;
             
          }
          else if(num==2){
          System.out.println("Usted escogio sello   y el resultado al azar fue  cara lo que quiere decir que no gano");
           vglobal=vglobal+incre;
           incre=incre-vapostado;
          }
          else{
            System.out.println("valor no permitido");
    
          }
        
             op=op-1;
        
        }
        System.out.println("Usted jugo las veces de "+impre+" y acumulo esta cantidad de dinero " +incre);

        
        
       

      

        lectura.close();
    }
}
