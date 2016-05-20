/*
coming soon
*/
class Prime_n_generate
{
    public static long[] gen_n_prime(int n)
    {
        int x=0;
        long arr[]=new long[n];
        if(n>=1)
        {
            arr[0]=2;
            x++;
        }
        if(n>=2)
        {
            arr[1]=3;
            x++;
        }
        for(long i=6;x<n;i+=6)
        {
            if(isPrime2(i-1,arr,x))
            {
                arr[x++]=i-1;
            }
            if(isPrime2(i+1,arr,x)&&x<n)
            {
                arr[x++]=i+1;
            }
        }
        for(int i=0;i<x;i++)
        {
            System.out.println(arr[i]);
        }
        return arr;
    }
    public static boolean isPrime2(long a,long arr[],int x)
    {
        for(int i=0;i<x&&arr[i]<a;i++)
        {
            if(a%arr[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}
