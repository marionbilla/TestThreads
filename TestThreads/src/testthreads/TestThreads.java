package testthreads;

import java.util.ArrayList;

public class TestThreads
{

    public static void main(String[] args)
    {
        ArrayList<Thread> threads = new ArrayList<Thread>();
        int threadCount = 0;
        
        
        for(int i=0 ; i<500 ; i++)
        {
            CountTask task = new CountTask(10000000+i);
            Thread worker = new Thread(task);
            worker.start();
            threads.add(worker);
        }
        
        do
        {
            threadCount = 0;
            
            for(Thread thread:threads)
            {
                if(thread.isAlive())
                    threadCount++;
            }
            
            System.out.println("Threads alive: "+threadCount);
            
        }while(threadCount > 0);
    }
}


