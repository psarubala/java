public class prime {
    public static void main(String[] args) {
        int num=8;
        if (Prime(num)) {
            System.out.println("it is prime number");
        }
        else
        System.out.println("not a prime");
    }
    public static boolean Prime(int num)
    {
        if (num<=0) {
            return false;
        }
        else{
            for (int i = 2; i <num; i++) {
                if(num%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
