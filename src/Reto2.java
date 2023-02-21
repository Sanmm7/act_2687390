import java.util.*;


public class Reto2 {
    



    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double peso;
        int  meses;
        System.out.println("Digite cuantos meses tienen le bebe");
        meses= lectura.nextInt();
        System.out.println("Digite cuanto pesa el menor ");
        peso= lectura.nextDouble();
        double vacuna=(peso+10)/(meses*10)*8;
        System.out.println("La dosis para aplicarle al menor es "+vacuna);




        
        lectura.close();
    
}
}
