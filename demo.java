
import java.util.*; 
public class demo {

	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int[][] arr=new int[3][3];
	System.out.println("the enter the value of arrays:");
	for(int i=0;i<arr.length;i++)
	{ 
		for(int j=0;j<arr[i].length;j++)
		{
		arr[i][j]=in.nextInt();
	
		}
	}
	for(int i=0;i<arr.length;i++)
	{ 
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.println(arr[i][j]+"");
	
		}
	}
}
	}




