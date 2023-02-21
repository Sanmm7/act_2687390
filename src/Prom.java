import java.util.Scanner;



public class Prom {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        String user,password;
        System.out.println("Digite su usuario");
        user= lectura.nextLine();
        System.out.println("Digite su contraseña");
        password= lectura.nextLine();
        String anObject;
        if(user.equals(anObject= "carlos")&&password.equals(anObject= "123456")){
            System.out.println("BIENVENIDO");



        }
        else if(user.equals(anObject= "carlos")&&password.equals(anObject!=123456)){
            System.out.println("Parece que olivdaste tus credneciales de acceso");



        }
        else if(user.equals(anObject != "carlos")&&password.equals(anObject = "123456")){
            System.out.println("Algo pasa con tus datos de acceso");



        }
        else if(user.equals(anObject != "carlos")&&password.equals(anObject != "123456")){
            System.out.println("acceso denengado");



        }



        double not1,not2,not3,asistencia;
        System.out.println("Digite 3 notas");
        not1= lectura.nextDouble();
        not2= lectura.nextDouble();
        not3= lectura.nextDouble();
      double promedio=(not1+not2+not3)/3;
      System.out.println("Digite la asistencia del estudiante");
      asistencia= lectura.nextInt();
      if(promedio>=3.5 && asistencia>=70 && promedio<=5.0 && promedio>=0){
        System.out.println("El promedio del estudiante fue "+promedio+" Y la asistencia fue "+asistencia+" lo que quiere decir que aprueba");
      }
    else if(promedio>=0 && asistencia>=0  && promedio<=5.0 && promedio>=0){

        System.out.println("El promedio del estudiante fue "+promedio+" Y la asistencia fue "+asistencia+" lo que quiere decir NO que aprueba");


    }
    else if( promedio<=50 && promedio<=0){

        System.out.println("Error logico,vuelva a digitar");

   

      }
      else if(promedio>=50){

        System.out.println("El intervalo de notas es de 0.0 a 5.0, no exceda el limite");


      }
        lectura.close();


}
 }
