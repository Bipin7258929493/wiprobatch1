import java.util.Scanner; 
public class oddeven{

 public static void main(String []args){

     int n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number");
     n=sc.nextInt();
     if(   (n%2!=0)  && (n>20 && n<30))
     {

      System.out.println("Tom");
     }
     else if( (n%2==0)  && (n>20 && n<30) )
     {
     System.out.println("Jerry");
     }
     else
{
     System.out.println("No range found");
}

 }
 
 
}