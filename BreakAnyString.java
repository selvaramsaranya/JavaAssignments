package Assignment1;

public class BreakAnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		String [] arr = {"Java","JavaScript","Selenium","Python","Mukesh"} ;
		
		for (int i = 0 ;i <arr.length;i++)
			
		{
				
			if (arr[i] == "Selenium") {
		     
		        break;
		}
			System.out.println(arr[i]);		
		}
	}

}
