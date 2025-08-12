import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
          factorial =factorial*i;
        }
        System.out.println("the numberfact values:"+factorial);
        
        
    }
    
}
