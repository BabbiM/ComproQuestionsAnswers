
public class PrimeCounter {
public static void main(String []args)
{
	
	        primeCount(10,30);
	       /* primeCount(11,29);
	        primeCount(20,22);
	        primeCount(1,1);
	        primeCount(5,5);
	        primeCount(6,10);
	        primeCount(-10,6);*/
}
	
	    static int primeCount(int start, int end)
	    {
	        int flag=0;
	        for(int number = start; number<=end; number++)
	        {
	            int i=2;
	            do
	            {
	        	
	            if(number%i==0)
	            	{
	            		flag=1;
	            		System.out.println(number + " is not prime");
	            	}
	            else
	            {
	            	i++;
	            	break;
	            	
	            }
	            
	            }while(flag==0 && i<number);
	        	
	             
	        }
	       return flag;    
	              
	     }
	        
	     
}









/* public static boolean isPrime(int number){
for(int i=2; i<number; i++){
    if(number%i == 0){
        return false; 
    }
}
return true; //number is prime now
}*/


