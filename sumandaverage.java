public class sumandaverage {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        double res=solve(a);
        System.out.println(res);
    }
    public static double solve(int[] a)
    {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        return sum/a.length;
    }
}
