import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int num=sc.nextInt();
        for ( int i=0;i<num;i++) {
            for (int j = 0; j <num; j++) {
               /*  if (i==0||i==num-1) {
                    System.out.print("* ");
                }*/
                 if ((i==1||i==num-2)&&(j<=1||j>=num-2)) {
                   System.out.print("* "); 
                }
    }
}
    }
}