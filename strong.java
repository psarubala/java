public class strong {
    public static void main(String[] args) {
        int num=145;
        if (digit(num)==num) {
            System.out.println("it is strong number");
        }
        else
           System.out.println("it is not a strong number");
    }
    public static int digit(int num)
    { int a=0,res=0;
        while (num>0) {
            res=num%10;
             a=a+fact(res);
            num=num/10;
        }
        return a;
    }
     
    public static int fact(int b)
    { int fact=1;
        for (int i = 1; i <=b; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
