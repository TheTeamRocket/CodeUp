/*
This is the general function to check for prime.
There will be further prime functions for more specific programs.
This will work in any case like a black-box implementation.
For faster, less general implementations, see other prime functions.

To use, call as follows:

  isPrime(<number or variable to be checked type casted into 'long'>);
  
and it will return 'true' or 'false'
*/

class Prime1
{
  	public static boolean isPrime(long n) 
    {
        if((n%2==0&&n!=2)||(n%3==0&&n!=3))
        {
            return false;
        }
        else
        {
            for (int i=6;i*i<=n+1; i+=6)
            {
                if ((n%(i+1)==0)&&(n%(i+1)==0))
                    return false;
            }
            return true;
        }
    }
}
