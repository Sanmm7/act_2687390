import java.util.Scanner;

public class ejercisio {

    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
      int age;
      System.out.println("Ingrese la edad");
      age= lectura.nextInt();
       if(age>=18){
       System.out.println("Puede ingresar");
       }
       else if(age>=0){
        System.out.println(" NO puede ingresar");
       }
       else{
        System.out.println(" Error logico");


       }




        lectura.close();
    }
}
