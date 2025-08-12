public class greaterv {
    public static void main(String[] args) {
        int a=001 ;
        System.out.println(great(a));
    }
    static int max=0;
    static int great(int num)
    {
        while (num!=0) {
            int res=num%10;
            if(max<res)
            {
                max=res;
            }
            num=num/10;
        }
        return max;
    }
}
