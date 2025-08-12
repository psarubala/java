import java.util.Arrays;

public class trappinwater {
    public static void main(String[] args) {
        int[]a={0,1,0,2,1,0,1,3,2,1,2,1 };
        System.out.println(waterlevel(a));

    }
    public static int waterlevel(int[] a)
    {
         int n=a.length;
         int [] left=new int[n];
         int [] right=new int[n];
         left[0]=a[0];
         right[n-1]=a[n-1];
         int max=0;
          for (int i=1;i<n;i++) {
            left[i]=Math.max(left[i-1], a[i]);
         }
         System.out.println(Arrays.toString(left));
         for (int i=n-2;i>=0;i--) {
            right[i]=Math.max(right[i+1], a[i]);
         }
         System.out.println(Arrays.toString(right));
         for (int i = 0; i <n; i++) {
          max+=Math.min(left[i],right[i])-a[i];
         }
        return max;
    }
}
