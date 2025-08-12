public class gcd {
    public static void main(String[] args) {
        int a=16;
        int b=24;
        int c=gcd(a, b);
        System.out.println(c+":gcd values");
    }
    public static int gcd(int a,int b)
    {
        int gcd=1;
        int min=(a<b)?a:b;
        for (int i = 1; i < min; i++) {
            if (a%i==0&&b%i==0) {
                gcd=i;
            }
        }
        return gcd;
    }
}
