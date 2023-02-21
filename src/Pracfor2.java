import java.util.Scanner;




public class Pracfor2 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int cantm,conth;
        String cantidad;
       conth=0;
       cantm=0;
     
        
        for(int i=1;i<=10;i++)
        {
            
            System.out.println("eres hombre  o   eres mujer ");
            cantidad=lectura.nextLine();
            if(cantidad.equalsIgnoreCase("hombre")){
                conth=conth+1;


            }
           else if(cantidad.equalsIgnoreCase("mujer")){
             cantm=cantm+1;


            }
            else{
                System.out.println("Valor invalido digitado");

            }
            
           


        }
        System.out.println("Hay "+conth+" hombre y "+cantm+" numero de mujeres");

       


        
        lectura.close();
    }
}
