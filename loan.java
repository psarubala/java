import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int salary=scanner.nextInt();
        int age=scanner.nextInt();
        if (salary>20000|| age<25) {
            System.out.println("eligible for loan");
            int loan = scanner.nextInt();
            if (loan<50000) 
            {
                System.out.println("loan available");
                
            }
            else
            {
                System.out.println("not loan");
            }

        }
    }

    
}
