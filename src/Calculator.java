import java.util.*;


public class Calculator {
    



    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double op1;
        int eleccion,num1,num2,operacion;
        System.out.println("Inrese 2 numeros");
        num1= lectura.nextInt();
        num2= lectura.nextInt();
        System.out.println(" Eliga 1 para suma, 2 para resta, 3 para multiplicacion, 4 para division, 5 para potencia, 6 para raiz cuadrada");
        eleccion= lectura.nextInt();
        switch(eleccion){
        case 1:
        operacion=num1+num2;
        System.out.println(" Usted eligio suma, y el resultado es "+operacion);
        break;
        case 2:
        operacion=num1-num2;
        System.out.println(" Usted eligio resta, y el resultado es "+operacion);
        break;
        case 3:
        operacion=num1*num2;
        System.out.println(" Usted eligio multiplicacion, y el resultado es "+operacion);
        break;
        case 4:
        operacion=num1/num2;
        System.out.println(" Usted eligio divison, y el resultado es "+operacion);
        break;
        case 5:
        op1=Math.pow(num1,num2);
        System.out.println(" Usted eligio potencia, y el resultado es "+op1);
        break;
        case 6:
        op1=Math.sqrt(num1);
        double op2=Math.sqrt(num2);
        System.out.println(" Usted eligio raiz, y el resultado del primer numero "+num1+" es " +op1+" y del segundo numero "+num2+" es "+op2);
        break;       
        default:

        System.out.println(" No eligio la opcion correcta");

    
        }
        lectura.close();
    
}
}
