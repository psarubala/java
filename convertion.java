import java.util.Arrays;

public class convertion {

    public static void main(String[] args) {
        char[] a={'A','B','c','a','f'};
        convertUtoL(a);
        System.out.println(Arrays.toString(a));
    }
    public static void convertUtoL(char[] num)
    {
        for (int i = 0; i < num.length; i++) {
            if (num[i]>='a'&&num[i]<='z') {
                 num[i]=(char)(num[i]-32);
            }
            else if (num[i]>='A'&&num[i]<='Z') {
                num[i]=(char)(num[i]+32);
            }
        }
    }

}