import java.util.Scanner;

public class addition{
   
 static String sum()
    {
      Scanner scanner=new Scanner(System.in);
      String apple_price=scanner.nextLine();
String count=scanner.nextLine();
       String a=apple_price+count;
       return a;
      
    }
    void sub( int apple_price,
    int count)
    {
       System.out.println(apple_price-count);
    }
    void mul( int apple_price,
    int count)
    {
       System.out.println(apple_price*count);
    }
    void div( int apple_price,
    int count)
    {
       System.out.println(apple_price/count);
    }
   
    public static void main(String[] args) {  
      addition mob1=new addition();
      System.out.println("the arithematic values are return");
      String a=sum();
      System.out.println(a);
        mob1.sub(20,5);
        mob1.mul(20,5);
        mob1.div(20,5);
        
    }
}
