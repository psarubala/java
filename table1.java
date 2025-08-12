import java.util.Scanner;

public class table1 {
    static int i=1,num,res=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        num=sc.nextInt();
        table2(num);
    }
    static int table2(int num)
    {
        if (i<=20) {
             res=i*num;
            System.out.println(i+"*"+num+"="+res);
            i++;
            table2(num);
        }
        return res;
    }
}
