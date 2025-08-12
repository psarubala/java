import java.util.*;
public class apalindrome {
    public static void main(String[] args)
    {
        int a[]={12,121,45,68,77};
        System.out.println("Before : "+Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
           a[i]=solve(a[i]);
        }
         System.out.println(Arrays.toString(a));
       
    }
    public static int solve(int num)
    {   int res=0;
        int temp=num;
        while (num>0) {
            res=res*10+num%10;
            num/=10;
        }
        num=temp;
        if (res==num) {
            return -1;
        }
        return temp;
    }
    
}
