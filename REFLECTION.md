# Reflection Questions

## Instructions
Answer the following questions about your learning experience. Each answer should be **at least 5-7 sentences** and show your understanding.

---

## Question 1: What did you learn about multithreading?

**Your Answer:**
 I learned how multithreading works in Java using the Runnable interface. I understood that multiple threads can run concurrently and share CPU time. I learned about thread states like new, runnable, running, and terminated. I also learned how to use Thread.start() to begin execution and Thread.join() to wait for a thread to finish. The Round-Robin scheduling algorithm showed me how time quantums ensure fair CPU distribution. I also learned about context switching and how it affects performance but there is a lot of problems i faced.
---

## Question 2: What was the most challenging part of this assignment?

**Your Answer:**
The most challenging part was implementing the waiting time calculation. I had to carefully track when each process was created, when it started executing, and when it finished each quantum. Understanding where to place the timestamps was difficult because the run() method is called multiple times. Another challenge was making sure all three features worked together without breaking the existing code. 

## Question 3: How did you overcome the challenges you faced?

**Your Answer:**
I overcame these challenges by breaking the problem into small, manageable parts. I started by understanding the existing code thoroughly by reading it and running it multiple times. For the waiting time, I added temporary print statements to see when each process started and finished. This helped me debug and understand where to place the timestamp calculations. I also used online resources and consulted the lecture slides about multithreading. I tested each feature separately before combining them to make sure each one worked correctly.
---

## Question 4: How can you apply multithreading concepts in real-world applications?

**Your Answer:**
Multithreading is used in many real-world applications. For example, in web browsers, multiple threads handle different tabs so if one tab crashes, others remain functional. Another example is in online gaming, where one thread handles player input, another handles graphics rendering, and another handles network communication. Round-Robin scheduling ensures fairness in CPU allocation, which is important in operating systems to prevent any single application from freezing the system. In e-commerce websites,

## Additional Reflections (Optional)

### What would you like to learn more about?

[Any topics related to threading, concurrency, or operating systems that you're curious about?]

---

### How confident do you feel about multithreading concepts now?

[Rate yourself and explain: Beginner / Intermediate / Confident]

[Explain your rating - what do you understand well? What needs more practice?]

---

### Feedback on the assignment

[Any comments about the assignment? Was it helpful? Too easy/hard? Suggestions for improvement?]
