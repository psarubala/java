public class isprime {
    public static void main(String[] args) {
        boolean isprime=true;
        int num=8;
        if (num<=1) {
            isprime=false;
        }
        else
        {
            for(int i=2;i<num;i++)
            {
              if (num%i==0) {
                isprime=false;
              }
            }
        }
        if (isprime) {
            System.out.println("it is prime"+num);
        }
        else
        {
            System.out.println("it is not a prime");
        }
    }
}
