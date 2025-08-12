public class sunrise {
    public static void main(String[] args) {
        int[] a={7,4,8,2,9};
        System.out.println("see the sunrise in the:"+solve1(a)+" building");

    }
    public static int solve1(int[]a) {
        int max=0;
        int n=a.length;
        int count=0;
        for (int i = 0; i <n; i++) {
            max=Math.max(max, a[i]);
            if (max<=a[i]) {
                count++;
                System.out.println(a[i]+" ");
            }
        }
        return count;
    }
}
