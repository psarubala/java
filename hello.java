import java.util.Scanner;
class hello
{
    public static void main(String args[])
    { 
       
       Scanner scanner=new Scanner(System.in);
       int size=scanner.nextInt();
       int[] num=new int[size];
       int middle=num.length/2;
       System.out.println("enter the array value");
       for(int i=0;i<=num.length-1;i++)
       {
        num[i]=scanner.nextInt();
       }
       for(int i=0;i<=num.length-1;i++)
       {
        if (i==middle) 
        {
        System.out.println("the middle number of array"+num[i]);
       }
    }
} 
} 