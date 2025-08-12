import java.util.Scanner;
public class palidrome {
    public static void main(String[] args) 
    { 
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the palidrome");
        String str=scanner.nextLine();
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev))
         {
            System.out.println(str+":this palidrome:"+rev);
        }
         else {
            System.out.println(str+":this is not palidrome:"+rev);
            
        }
scanner.close();
    }
}