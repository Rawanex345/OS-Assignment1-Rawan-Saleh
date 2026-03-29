import java.util.Random;

public class Process implements Runnable {
    private String name;
    private int burstTime;
    private int timeQuantum;
    private int remainingTime;
    private int priority;

    // Waiting Time
    private long creationTime;
    private long totalWaitingTime;
    private long lastQueueEnterTime;

    // Constructor
    public Process(String name, int burstTime, int timeQuantum, int priority) {
        this.name = name;
        this.burstTime = burstTime;
        this.timeQuantum = timeQuantum;
        this.remainingTime = burstTime;
        this.priority = priority;

        this.creationTime = System.currentTimeMillis();
        this.totalWaitingTime = 0;
        this.lastQueueEnterTime = creationTime;
    }

    public void run() {
        int executionTime = Math.min(timeQuantum, remainingTime);


        long now = System.currentTimeMillis();
        totalWaitingTime += (now - lastQueueEnterTime);

        try {
            // Simulate execution
            Thread.sleep(executionTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        remainingTime -= executionTime;

        if (remainingTime > 0) {
            System.out.println(name + " executed for " + executionTime + "ms, remaining: " + remainingTime + "ms");
        } else {
            System.out.println(name + " completed execution!");
        }
    }

    public void runToCompletion() {
        try {

            long now = System.currentTimeMillis();
            totalWaitingTime += (now - lastQueueEnterTime);

            Thread.sleep(remainingTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        remainingTime = 0;
        System.out.println(name + " ran to completion (last process)!");
    }


    public void enterQueue() {
        lastQueueEnterTime = System.currentTimeMillis();
    }

    
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

    public long getTotalWaitingTime() {
        return totalWaitingTime;
    }
}
