public class reverse {

    public static void main(String[] args) {
        int a=1234;
        int b=rev(a);
        System.out.println(b);
    }
    public static int rev(int a)
    { int res=0;
        while (a>0) {
            res=res*10+a%10;
            a=a/10;
        }
        return res;
    }
}
