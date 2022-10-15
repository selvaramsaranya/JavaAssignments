package Assignment1;

public class PrintPrimeNum {

	public static void main(String[] args) {
	
		   
	     	   
	      //printing primer numbers till the limit ( 1 to 1000)
		
	      System.out.println("Printing prime number from 1 to " + 1000);
	      
	      for(int number = 2; number<=1000; number++){
	          //print prime numbers only
	          if(isPrime(number)){
	              System.out.println(number);
	          }
	      }

	    }

	    /*
	     * Prime number is not divisible by any number other than 1 and itself
	     * @return true if number is prime
	     */
	    public static boolean isPrime(int number){
	        for(int i=2; i<number; i++){
	           if(number%i == 0){
	               return false; //number is divisible so its not prime
	           }
	        }
	        return true; //number is prime now

	
		
		

	}

}
