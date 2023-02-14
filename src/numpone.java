import java.util.Scanner;

public class numpone {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un numero");
        number= lectura.nextInt();
        if(number==0){
            System.out.println("Numero neutro");



        }
        else if(number>=1){

            System.out.println("Numero positivo");

        }
        else{
            System.out.println("Numero negativo");


        }

        lectura.close();
    }
}
