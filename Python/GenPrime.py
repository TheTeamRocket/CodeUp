def GenPrime(N)
  p=[2,3]+filter(lambda x:((x+1)%6==0)or((x-1)%6==0),range(2,N/2+1))
    for i in p:
        p=filter(lambda x:(x%i!=0)or(x==i),p)
        if(p[-1]<i**2):
            break
