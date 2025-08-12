public class perfect {
    public static void main(String[] args) {
        if (perf(28)) {
            System.out.println("it is same values");
        }
        else
        System.out.println("it is not same value");
    }
    public static boolean perf(int num)
    {    int sum=0;
        for (int i =1; i <num; i++) {
            if (num!=0&&num%i==0) {
               sum=sum+i; 
            }
        }
        return sum==num;
    }
}
