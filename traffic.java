import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        
    Scanner scanner=new Scanner(System.in);
    String color= scanner.nextLine();
    if(color.equals("red"))
    {
        System.out.println("stop");
    }
    else if (color.equals("yellow"))
     {
        System.out.println("get ready");
    
    }
    else if (color.equals("green")) {
        System.out.println("go");
        
    }
    }
}
