public class Arms1 {
    public static void main(String[] args) {
        int a=153;
        int b=arm(a);
        if (b==a) {
            System.out.println("it is armstrong");
        }
         else
        System.out.println("not a armstrong");
    }
      static  int count=0;static int sum=0;
    static int arm(int num)
    { 
         int temp=num;
        while(num>0) {
            num=num/10;
            count++;
        }
        System.out.println("count"+count);
        num=temp;
        System.out.println(num);
        while (num>0) {
            int res=num%10;
            int power=1;
            for(int i=1;i<=count;i++ ) {
                power=power*res;

            }
            sum=sum+power;
            num=num/10;
            System.out.println("enter"+num);
            System.out.println(sum);
        }
        return sum;
    }
        
}
