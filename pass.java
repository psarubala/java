import java.util.Scanner;
class pass
{
    public static void main(String[] args) 
    {
     Scanner scanner = new Scanner(System.in);
     int score= scanner.nextInt();
     if( score<50)
     {
        System.out.println("you need toimprove");
     }
     else if (score>=50  && score<=70)
      {
        System.out.println("good job");
        
     }
     else if (score>70)
      {
        System.out.println("excellent");
        
     }
     
     else
        {
            System.out.println("no gift");
        }
    
     
    }
}