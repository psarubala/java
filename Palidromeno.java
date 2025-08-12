import java.util.Scanner;

public class Palidromeno {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("enter the value a");
        int number=sc.nextInt();
        int rev=0;
        int temp=number;
      for(;number>0 ;) {
        rev=rev*10+number%10;
        number=number/10;
        }
       
       System.out.println(rev);
       if (temp==rev) {
        System.out.println("it is palindrome");
       }
       else{
        System.out.println("it is not palindrome");
       }
 
         }     }

