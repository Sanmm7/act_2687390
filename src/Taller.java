import java.util.Scanner;



public class Taller {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
   int spent,budget,totals,op;
   op=1;
   budget=100000;
   int cont=1;
   while(op==1){
    if(cont<=3){
    System.out.println("Ingrese el gasto ");
    spent= lectura.nextInt();
    budget=budget-spent;
    System.out.println("El gasto fue "+spent+" Le queda "+budget);
    cont=cont+1;
  

}
else if(cont<3){
System.out.println("Desea registrar otro gasto,1 si 2 no ");
op= lectura.nextInt();

   }
 
        lectura.close();


}
    }
 
