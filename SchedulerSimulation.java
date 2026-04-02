
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;


class Colors {
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String WHITE = "\u001B[37m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
}
public class SchedulerSimulation {

    static int contextSwitches = 0;

    public static void main(String[] args) {

        int studentID = 444052889; //تغيير الرقم الجامعي

        Random random = new Random(studentID);

        int timeQuantum = 2000 + random.nextInt(4) * 1000;
        int numProcesses = 10 + random.nextInt(11);

        Queue<Thread> processQueue = new LinkedList<>();
        Map<Thread, Process> processMap = new HashMap<>();

        LinkedList<Process> allProcesses = new LinkedList<>();

        System.out.println("\nSTART\n");

        for (int i = 1; i <= numProcesses; i++) {
            int burstTime = timeQuantum/2 + random.nextInt(2 * timeQuantum + 1);
            int priority = random.nextInt(5) + 1;

            Process process = new Process("P" + i, burstTime, timeQuantum, priority);

            allProcesses.add(process);

            addProcessToQueue(process, processQueue, processMap);
        }

        while (!processQueue.isEmpty()) {

            Thread currentThread = processQueue.poll();

            contextSwitches++;  //العداد

            currentThread.start();

            try {
                currentThread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }

            Process process = processMap.get(currentThread);

            if (!process.isFinished()) {
                if (!processQueue.isEmpty()) {
                    addProcessToQueue(process, processQueue, processMap);
                } else {
                    process.runToCompletion();
                }
            }
        }

        System.out.println("Total context switches: " + contextSwitches);

        System.out.println("\nProcess\tBurst Time\tWaiting Time");
        for (Process p : allProcesses) {
            System.out.println(p.getName() + "\t" + p.getBurstTime() + "\t" + p.getWaitingTime()); //طباعه الجدول
        }
    }

    public static void addProcessToQueue(Process process, Queue<Thread> processQueue,
                                        Map<Thread, Process> processMap) {

        process.enterQueue(); 

        Thread thread = new Thread(process);
        processQueue.add(thread);
        processMap.put(thread, process);

        System.out.println(process.getName() + " (Priority: " + process.getPriority() + ") added to ready queue");
    }
}
