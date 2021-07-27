public class PrimeCountUpdated {
    public static void main(String[] args) {
    	//int primeCount=0;
        primeCount(10,30);
        /*primeCount(11,29);
        primeCount(20,22);
        primeCount(1,1);
        primeCount(5,5);
        primeCount(6,10);
        primeCount(-10,6);*/
     }
    static int primeCount(int start, int end)
    {
        int flag=0;
        for(int number = start; number<=end; number++){
            //print prime numbers only
            if(isPrime(number)){
                System.out.println(number);
                flag=flag+1;
            }
        }
        return flag;
     }
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false; 
            }
        }
        
        return true; //number is prime now
    }
}
