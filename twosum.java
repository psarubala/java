import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int target=9;
        int [] res=solve(a, target);
        System.out.println(Arrays.toString(res));

    }
    public static int[] solve(int[] a,int target)
    {
       
       for (int i = 0; i < a.length; i++) {
        int sum=0;
        for (int j = i+1; j < a.length; j++) {
         sum=a[i]+a[j];
         if (sum==target) {
            return new int[] {i,j};
            
         }
            
        }
        
       }
       return new int[]{};
    }
}
