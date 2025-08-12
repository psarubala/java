import java.util.Arrays;

public class minmax {
    public static void main(String[] args) {
          int a[]={10,-8,41,-7,52,9};
        System.out.println("Before : "+Arrays.toString(a));
        int res=0;
        int res1=0;
        res=solve(a);
        res1=solve1(a); 

        System.out.println(res);
        System.out.println(res1);
    }
    public static int solve(int[] num)
    {
        int min=0,max=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max) {
         max=num[i];
    }
        }
    
    return max;
    }
    public static int solve1(int[] num)
    {
        int min=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]< min) {
         min=num[i];
    }
        }
    
    return min;
    }
}
