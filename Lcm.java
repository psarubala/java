public class Lcm {
    public static void main(String[] args) {
        int a=4;
        int b=6;
        int c=Lcm(a, b);
        System.out.println(c+":lcm values");
    }
    public static int gcd(int a,int b)
    {
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int Lcm(int a,int b)
    {
        return (a*b)/gcd(a, b);
    }
}
