import java.util.Scanner;
import java.util.Random;



public class Ret7 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double vcompra,totald;
        System.out.println("Ingrese el valor de la compra ");
        vcompra= lectura.nextDouble();
        Random r = new Random();
        int valor = r.nextInt(4)+1;
        if(vcompra>=50000){
        if(valor==1){
             totald=vcompra*10/100;
            System.out.println(" Sacaste bolita roja y tienes un descuento del 10% el total de tu compra es "+totald);
        }
        else if(valor==2){
            totald=vcompra*30/100;
            System.out.println(" Sacaste bolita azul y tienes un 30% de descuento y el total de tu compra es "+totald);

                  



        }
        else if(valor==3){
            totald=vcompra*50/100;
            System.out.println(" Sacaste bolita amarilla y tienes un 50% de descuento y el total de tu compra es "+totald);

                  



        }
        else if(valor==4){
            System.out.println(" Sacaste bolita blanca y te llevas tu compra gratis");

                  



        }
        }
        else{

            System.out.println(" No tienes descuento el valor de tu compra es "+vcompra);


        }

      

        lectura.close();
    }
}
