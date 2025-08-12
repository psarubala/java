import java.util.Scanner;

public class laptop {
    String name="";
    int ram=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        laptop lap1=new laptop();
        System.out.println("enter the values of laptop");
        lap1.name=scanner.nextLine();
        lap1.ram=scanner.nextInt();
        System.out.println(lap1.name);
    }
}
