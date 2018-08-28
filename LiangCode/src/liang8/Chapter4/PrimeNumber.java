package liang8.Chapter4;

/**
 *
 * @author harold
 */
public class PrimeNumber {
    public static void main (String[] args)
    {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        
        System.out.println("The first 50 prime numbers \n");
        
        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES)
        {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?
            
            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++)
            {
                if (number % divisor == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            
            // Print the prime number and increase the count
            if (isPrime)
            {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                {
                    // Print the number and advance to the new line
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }
            
            // Check if the next number is prime
            number++;
        }
    }
}
