package testthreads;

public class CountTask implements Runnable
{
    private long countUntil;
    
    public CountTask(long countUntil)
    {
        this.countUntil = countUntil;
    }
    
    @Override
    public void run() 
    {
       long sum = 0;
       
       for(int i=0 ; i<countUntil ; i++)
           sum += i;
       
       System.out.println("sum: "+sum); 
    }
    
}
