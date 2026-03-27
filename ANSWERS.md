# Assignment Questions

## Instructions
Answer all 4 questions with detailed explanations. Each answer should be **3-5 sentences minimum** and demonstrate your understanding of the concepts.

---

## Question 1: Thread vs Process

**Question**: Explain the difference between a **thread** and a **process**. Why did we use threads in this assignment instead of creating separate processes?

**Your Answer:**
A process is an independent program that runs in its own memory space, while a thread is a lightweight unit of execution that runs within a process and shares its memory space. In this assignment, we used threads instead of processes because threads are more efficient for concurrent execution within the same program. Threads share memory, which makes communication faster and simpler, while processes require inter-process communication mechanisms. Creating threads has less overhead than creating separate processes. In my SchedulerSimulation.java code, each Process object implements Runnable and is wrapped in a Thread, allowing multiple processes to run concurrently within the same Java program. This is more efficient than creating separate processes for each simulated process.

---

## Question 2: Ready Queue Behavior

**Question**: In Round-Robin scheduling, what happens when a process doesn't finish within its time quantum? Explain using an example from your program output.

**Your Answer:**

[it is paused and moved to the end of the ready queue to give other processes a chance to run. For example, in my simulation output, I saw P1 executed for 2000ms (the time quantum) and since it still had remaining time, it was re-queued. The program printed "P1 yields CPU for context switch" and then added P1 back to the queue. This re-queueing behavior is important for fairness because it ensures that no single process can monopolize the CPU. It allows all processes to make progress equally and prevents starvation where a process never gets CPU time.

**Explanation of example:**
 P1 executed for the full time quantum of 2000ms but still had remaining time. Since there were other processes in the queue, P1 was re-queued at the end. This behavior ensures fairness because every process gets an equal chance to use the CPU. If P1 was allowed to continue without interruption, other processes like P2 and P3 would have to wait longer, which is unfair.
---

## Question 3: Thread States

**Question**: A thread can be in different states: **New**, **Runnable**, **Running**, **Waiting**, **Terminated**. Walk through these states for one process (P1) from your simulation.

**Your Answer:**

[Write your answer here. For each state, explain when P1 enters that state during the simulation. Use your understanding of the code to trace through the lifecycle.]
- **New**: When the thread is created but not started. In my code, this happens when I call `new Thread(process)` in the addProcessToQueue method.
- **Runnable**: When I call `thread.start()`, the thread becomes ready to run and enters the runnable state.
- **Running**: When the CPU starts executing the run() method. This is when the process actually runs for its time quantum.
- **Waiting**: When the process calls `Thread.sleep(runTime)` during execution, it enters the waiting state.
- **Terminated**: When the run() method completes and remainingTime reaches 0, the thread enters the terminated state and is removed from execution.


## Question 4: Real-World Applications

**Question**: Give **TWO** real-world examples where Round-Robin scheduling with threads would be useful. Explain why this scheduling algorithm works well for those scenarios.

**Your Answer:**

### Example 1:  Web Server
In a web server handling multiple client requests simultaneously, Round-Robin scheduling ensures each request gets fair CPU time. If one request is heavy and takes longer to process, it doesn't block other requests. Each request gets a time quantum, and if it doesn't finish, it goes to the back of the queue. This keeps the server responsive for all users, preventing any single user from slowing down the entire system.

### Example 2: Operating System Scheduler
**Description**:  Modern operating systems use Round-Robin scheduling for user-level threads. When multiple applications are running (like a browser, media player, and word processor), the OS gives each application a time slice of CPU time. This prevents any single application from freezing the system. If one application uses too much CPU, it gets re-queued and others get their turn, ensuring a smooth user experience.
---

## Summary

**Key concepts I understood through these questions:**
1. I learned that threads are lightweight units that share memory within a process, making them more efficient for concurrent tasks
2.  understood that context switching occurs when the CPU switches from executing one thread to another
3. 

**Concepts I need to study more:**
1. 
2. 
