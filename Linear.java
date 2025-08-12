
public class Linear {
	public static void Main(String[] args)
	{
	int[] num= {12,564,2,42,21};
	int target=2;
	int ans=hello(num,target);
	System.out.println("linear"+ans);
	}
    
    static int hello(int[] arr, int target)
        { 
            if(arr.length==0)
            {
                return -1;
            }
            for(int i=0;i<=arr.length;i++)
            {
                int element=arr[i];
                if(element==target)
                {
                    return i;
                }
            }
            return 0;
        }

		}

        