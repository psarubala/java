import java.util.Scanner;
public class an {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        int num=sc.nextInt();
        int temp=num;
        int count=0,sum=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        num=temp;
        while(num>0)
        {
            int last=num%10;
            int power=1;
            for(int i=0;i<count;i++)
            {
                power*=last;
            }
            sum+=power;
            num/=10;
        }
        if(sum==temp)
        {
            System.out.println("Amstrong");
        }
        else
        {
            System.out.println("Not Amstrong");
        }
    }
}
