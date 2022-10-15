
package Assignment1;

public class BreakAnyCondition {

	public static void main(String[] args) {

		
		int [] arr = {12,34,66,85,900} ;
		
		for (int i = 0 ;i <arr.length;i++)
			
		{
				
			if (arr[i] == 85) {
		     
		        break;
		}
			System.out.println(arr[i]);		
		}
	}

}
