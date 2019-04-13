
public class Test {

	public static void main(String[] args) {
		int arr[]= {1,2,4,7,8,6,1};
		for (int i = 0; i < arr[].length-1; i++)
		{
		    for (int j = i+1; j < arr.length; j++)
		    {
		        if( (arr[i].equals(arr[j])) && (i != j) )
		        {
		            System.out.println(arr[i]);
		        }
		    }
		}
	}

}
