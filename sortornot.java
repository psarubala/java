public class sortornot {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        solve(a);

    }
    public static void solve(int[] a)
    { 
        int ch=a[0];
        int ascending=0;
        int descending=0;
        for (int i = 1; i < a.length; i++) {
            if (a[i]>ch) {
                ascending++;
                ch=a[i];
                
            }
        }
         for (int i = 1; i < a.length; i++) {
            if (a[i]<ch) {
                descending++;
                ch=a[i];
            }
        }
        if(ascending==a.length-1)
        {
            System.out.println("asced");
        }
        else if (descending==a.length-1)
        {
            System.out.println("dese");
        }
        else
        {
            System.out.println("not sort");
        }
}
}