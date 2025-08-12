public class RangePrime {
    public static void main(String[] args) {
        int start=5;
        int end=15;
        int sum=0;
        for (int i = start; i <end; i++) {
            if (i!=0||i!=1) {
                if (Rprime(i)) {
                    sum=sum+i;
                }
            }
        }
        System.out.println("total prime value:"+sum);
    }
    public static boolean Rprime(int num)
    { 
       for (int i = 2; i < num; i++) {
         if (num%i==0) {
            return false;
         }
       }
        return true;
    }
   
}
