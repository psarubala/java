// using recursion of fibonacci;
public class fibonacci {
    static int series;
    static int n1=0,n2=1,n3;
    public static void main(String[] args) {
         series=7;
         fibo(series);
    }
    public static int fibo(int s)
    {
        if (s>=1) {
            System.out.println(n3);
            n1=n2;
            n2=n3;
            n3=n1+n2;
            s--;
            fibo(s);
            
        }
        return n3;
    }
}
