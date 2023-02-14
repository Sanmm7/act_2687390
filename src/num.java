import java.util.Scanner;



public class num {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int numberone,numbertwo;
        System.out.println("Ingrese un numero");
        numberone= lectura.nextInt();
        System.out.println("Ingrese un segundo numero");
        numbertwo= lectura.nextInt();
        if(numberone>numbertwo){
        int suma=numberone+numbertwo;
        System.out.println("Es suma ya que el primer numero digitado "+numberone+" es mayor el segundo "+numbertwo+" y el resultado es "+suma);
        }
        else{

            int resta=numberone-numbertwo;
            System.out.println("Es resta ya que numero el primer numero digitado "+numberone+" es menor que el segundo "+numbertwo+" y el resultado es "+resta);

        }
        lectura.close();

}
}