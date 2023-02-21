import java.util.Scanner;




public class Pracfor {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int precio,cantidad,cont,subtotal,acum,total,deter;
        cont=0;
        acum=0;
        for(int i=1;i<=5;i++)
        {
            System.out.println("Digite el precio del producto");
            precio=lectura.nextInt();
            System.out.println("Digite la cantidad del producto");
            cantidad=lectura.nextInt();
            cont=cont+1;
            subtotal=precio*cantidad;
            acum=acum+subtotal;
            System.out.println("El valor a pagar hasta el momento es "+acum);


        }
        System.out.println("Digite el precio con el que paga");
        total=lectura.nextInt();

        int cambio=total-acum;
        System.out.println("Usted deberia darle al cliente  "+cambio);
        System.out.println("Cuenta con telefonia movil exito 1-si,2-no");
        deter=lectura.nextInt();
        if(deter==1){
            System.out.println("Usted obtuvo con su compra "+cont+" minutos adicionales por su compra");



        }
        else if(deter==2){
            System.out.println("No pierdas mas minutos, adquiere tu telefonia movil exito");



        }


        
        lectura.close();
    }
}
