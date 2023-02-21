import java.util.Scanner;




public class Pracfor2 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int  cantidad,cantm,conth;
       conth=0;
       cantm=0;
     
        
        for(int i=1;i<=10;i++)
        {
            
            System.out.println("Digita 1 si eres hombre  o 2 si eres mujer 2");
            cantidad=lectura.nextInt();
            if(cantidad==1){
                conth=conth+1;


            }
           else if(cantidad==2){
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
