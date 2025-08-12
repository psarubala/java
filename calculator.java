import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
       boolean flag=true;
        Scanner sc =new Scanner(System.in);
        int c=10;
        int d=20;
    do
    { 
        System.out.println("enter the value");
        int choice =sc.nextInt();
        if (choice==5) {
            flag=false;
        }
        else
        {
            switch(choice) 
            {
                case 1:{System.out.println(add(c, d));
                    break;}
                case 2:{System.out.println(sub(c,d));
                    break;}
                case 3:{System.out.println(mul(c,d));
                    break;}
                case 4:{System.out.println(div(c,d));
                    break; }           
                default:{
                System.out.println("exit");
                    break;}
            }
        }
     
    }while(flag);
    
    }
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
     public static int sub(int a,int b)
    {
        int c=a-b;
        return c;
    }
     public static int mul(int a,int b)
    {
        int c=a*b;
        return c;
    }
     public static int div(int a,int b)
    {
        int c=a/b;
        return c;
    }
}
