public class maxsubarray {
    public static void main(String[] args) {
        int [] a={-2,1,-3,4,-1,2,1,-5,4};
        int res=maxarray(a);
        System.out.println(res);
    }
    public static int maxarray(int[] a)
    {
        int n=a.length;
        int sum=0;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        { 
            sum=sum+a[i];
            maximum=Math.max(maximum, sum);
            sum=(sum<0)?0:sum;
        }
        return maximum;
    }
    
    
    }
    



