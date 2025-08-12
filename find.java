import java.util.Scanner;

public class find {
     void evenorodd(int num)
    { 
        if (num%2==0) {
            System.out.println(num+"i is a even number");
  
        } else {
            System.out.println(num +"i is ood number");
            
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("get the input");
        int i =scanner.nextInt();
        find app=new find();
        app.evenorodd(i);
    }
}
