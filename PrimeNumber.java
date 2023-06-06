public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29; // the number to test
        boolean isPrime = false; //for nonprime
        for (int i = 2; i <= num / 2;
            ++i) {
        
            if (num % i == 0) {
                isPrime = true; //for prime number
                break;
            }
        }

        if(!isPrime) {
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
        }
    }
    
}
