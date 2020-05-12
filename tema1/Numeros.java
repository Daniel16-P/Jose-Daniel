
import java.util.Scanner;
public class Numeros{
  public static void main(String[]args){
    Scanner leer = new Scanner(System.in); 

    int Superior = 0;

   System.out.println("Digite Limite Superior");
   
   Superior = leer.nextInt();

   for (int i=0;i<Superior;i++){
     
     if(i%2==0){
       System.out.println(i);
     }
     
   }
   
   int Num=0,i=0;
   System.out.println("Ciclo White");
   System.out.println("Digite Numero");
   Num = leer.nextInt();
   while(i<Num){
     i++;
     if(i%2!=0){
       System.out.println(i);
     }
   }



   


   }
}
  