public class Two 
{   
    public static BigInteger fib(int n) 
    { 
        BigInteger fib0,fib1,fib2;
        fib0=BigInteger.ZERO;
        fib1=BigInteger.ZERO;
        fib2=BigInteger.ONE;
        for(int i = 0; i <= n; i++)
        {
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib0.add(fib1);
        }
        return fib0; 
    } 
}    
