import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the value:");
      int n=sc.nextInt();
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if(i==0||i==n-1||j==0&&i<=n/2||j==n-1&&i>=n/2||i==n/2)
            {
            System.out.print("S ");
            }
            else{
            System.out.print("  ");
            }
        }
        System.out.print(" ");
        for (int j = 0; j < n; j++) {
        if (i == 0 ||j==0||j==4||i+j==n/2)
                    System.out.print("A");
                // Left and right sides
                else if ((j == 0 || j == n-1) && i != 0)
                    System.out.print("a");
                // Middle bar of A
                else if (i == n / 2)
                    System.out.print("A");
                else
                    System.out.print(" ");

        }
          System.out.print("  ");
          for (int j = 0; j < n; j++) {
            if(i==0||j==0||i+j==n-1&&j>=n/2||i==j&&i>=n/2)
            {
            System.out.print("R ");
            }
            else{
            System.out.print("  ");
            }
        }
        System.out.print(" ");
          for (int j = 0; j < n; j++) {
            if(j==0||i==n-1||j==n-1)
            {
            System.out.print("U ");
            }
            else{
            System.out.print("  ");
            }
        }
          System.out.print("  ");
          for (int j = 0; j < n; j++) {
            if(i==0||i==n-1||i==n/2||j==n-1||j==0)
            {
            System.out.print("B ");
            }
            else{
            System.out.print("  ");
            }
        } System.out.print(" ");
        for (int j = 0; j < n; j++) {
        if (i == 0 ||j==0||j==4||i+j==n/2)
                    System.out.print("A");
                // Left and right sides
                else if ((j == 0 || j == n-1) && i != 0)
                    System.out.print("A");
                // Middle bar of A
                else if (i == n / 2)
                    System.out.print("A");
                else
                    System.out.print(" ");

        }
        System.out.print("  ");
          for (int j = 0; j < n; j++) {
            if(i==n-1||j==0)
            {
            System.out.print("L ");
            }
            else{
            System.out.print("  ");
            }
        }
        
          System.out.print("  ");
          for (int j = 0; j < n; j++) {
        if (i == 0 && j > 0 && j < n)
                    System.out.print("A");
                // Left and right sides
                else if ((j == 0 || j == n-1) && i != 0)
                    System.out.print("A");
                // Middle bar of A
                else if (i == n / 2)
                    System.out.print("A");
                else
                    System.out.print(" ");

        }
        System.out.println("");
      }
      sc.close();
    }
}
