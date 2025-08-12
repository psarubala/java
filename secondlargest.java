public class secondlargest {
    public static void main(String[] args) {
        int[] a={10,5,20,15};
        System.out.println(solve(a));
    }
    public static int solve(int[] a)
    {
        int max=0;
        int min=0;
        for (int i = 0; i < a.length; i++) {
            max=Math.max(max, a[i]);
            if (max>a[i]) {
                min=Math.max(max, a[i]);
            }
        }
        return min;
    }
}
