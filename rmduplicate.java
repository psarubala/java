public class rmduplicate {
    public static void main(String[] args)
    {
        int[] a={1,1,2,2,3};
        rmduplicate1(a);
    }
    public static void rmduplicate1(int[] a)
    {
        int i=0;
        for (int j = 1; j < a.length; j++) {
            if (a[i]!=a[j]) {
                i++;
                a[i]=a[j];
            }
        }
        System.out.println("unique"+(i+1));
        System.out.println("after the remove");
        for (int k=0;k<=i;k++) {
            System.out.println(a[k]);
        }
    }
}
