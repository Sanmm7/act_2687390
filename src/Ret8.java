import java.util.Scanner;
import java.util.Random;



public class Ret8 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double totald;
        int op;
        Random r = new Random();
        int valor = r.nextInt(4)+1;
       double vcompra=0;
       double precio,pagoc;
       System.out.println("Ingrese el numero de producto que desea registrar ");
       op= lectura.nextInt();

   while(op>=1){
    
    System.out.println("Ingrese el precio ");
    precio= lectura.nextDouble();
    vcompra=vcompra+precio;
     op=op-1;

}






        if(vcompra>=50000){
        if(valor==1){
             totald=vcompra*0.1;
             double totalc=vcompra-totald;
            System.out.println(" Tu compra es "+vcompra+"pero sacaste bolita roja y tienes un descuento del 10% el total de tu compra es "+totalc);
            System.out.println("Digite el precio con el que cliente paga");
            pagoc= lectura.nextDouble();
            double cambio=pagoc-totald;
            System.out.println("El cliente tiene un cambio "+cambio);
        }
        else if(valor==2){
            totald=vcompra*0.3;
            double totalc=vcompra-totald;
            System.out.println(" Tu compra es "+vcompra+" pero sacaste bolita azul y tienes un 30% de descuento y el total de tu compra es "+totalc);
            System.out.println("Digite el precio con el que cliente paga");
            pagoc= lectura.nextDouble();
            double cambio=pagoc-totald;
            System.out.println("El cliente tiene un cambio "+cambio);
                  



        }
        else if(valor==3){
            totald=vcompra*0.5;
            double totalc=vcompra-totald;
            System.out.println(" Tu compra es "+vcompra+" pero sacaste bolita amarilla y tienes un 50% de descuento y el total de tu compra es "+totalc);
            System.out.println("Digite el precio con el que cliente paga");
            pagoc= lectura.nextDouble();
            double cambio=pagoc-totald;
            System.out.println("El cliente tiene un cambio "+cambio);
                  



        }
        else if(valor==4){
            System.out.println(" Tu compra es "+vcompra+" pero sacaste bolita blanca y te llevas tu compra gratis");

                  



        }
        }
        else {

            System.out.println(" No tienes descuento el valor de tu compra es "+vcompra);
            System.out.println("Digite el precio con el que cliente paga");
            pagoc= lectura.nextDouble();
            double cambio=pagoc-vcompra;
            System.out.println("El cliente tiene un cambio "+cambio);

        }

    
     
        lectura.close();
    }
}
    
