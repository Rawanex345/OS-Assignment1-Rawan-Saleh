import java.util.Random;

public class Process implements Runnable {
    private String name;
    private int burstTime;
    private int timeQuantum;
    private int remainingTime;
    private int priority;  
    private long lastExecutionTime;
// Feature 1: Priority field
    private long creationTime;
private long totalWaitingTime;
    
    // Constructor
    public Process(String name, int burstTime, int timeQuantum, int priority) {
        this.name = name;
        this.burstTime = burstTime;
        this.timeQuantum = timeQuantum;
        this.remainingTime = burstTime;
        this.priority = priority;
         this.creationTime = System.currentTimeMillis(); 
    this.totalWaitingTime = 0; 
        this.lastExecutionTime = creationTime;
    }
    
    public void run() {
        int executionTime = Math.min(timeQuantum, remainingTime);
        long now = System.currentTimeMillis();
totalWaitingTime += (now - lastExecutionTime);
        try {
            // Simulate execution
            Thread.sleep(executionTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        remainingTime -= executionTime;
        
        if (remainingTime > 0) {
            // Still has time left, will be re-queued
            System.out.println(name + " executed for " + executionTime + "ms, remaining: " + remainingTime + "ms");
        } else {
            // Process finished
            System.out.println(name + " completed execution!");
        } lastExecutionTime = System.currentTimeMillis();
    }
   
    public void runToCompletion() {
        try {
            Thread.sleep(remainingTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        remainingTime = 0;
        System.out.println(name + " ran to completion (last process)!");
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getBurstTime() {
        return burstTime;
    }
    
    public int getRemainingTime() {
        return remainingTime;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public boolean isFinished() {
        return remainingTime <= 0;
    }
    public long getCreationTime() {
    return creationTime;
}

public void addWaitingTime(long time) {
    this.totalWaitingTime += time;
}

public long getTotalWaitingTime() {
    return totalWaitingTime;
}
}
