public class evenandodd {
     public static void main(String[] args) {
        int[] a={4,5,6};
        int res=solve(a);
        System.out.println("even:"+res);
        System.out.println("odd:"+solve1(a));
    }
    public static int solve(int[] a)
    {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                  count++;
            }
        }
        return count;
    }
    public static int solve1(int[] a)
    {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==1) {
                  count++;
            }
        }
        return count;
    }
}
