import java.util.*;
public class primesum {
    public static void main(String[] args)
    {
        int a[]={10,2,8,7,4,11};
        System.out.println("Before : "+Arrays.toString(a));
        int res=0;
       
             res=solve(a);

        System.out.println("sum of prime : "+res);
    }
    public static int solve(int a[])
    {   int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2==1||a[i]==2)
            {
                sum+=a[i];
            }
        }
        return sum;
    }
    
}
