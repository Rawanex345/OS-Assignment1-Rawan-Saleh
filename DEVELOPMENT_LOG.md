# Development Log

## Instructions
Document your development process as you work on the assignment. Add entries showing:
- What you worked on
- Problems you encountered
- How you solved them
- Time spent

**Requirements**: Minimum 5 entries showing progression over time.

---

## Example Entry Format:

### Entry 1 - [April 1, 2026, 2:30 PM]
**What I did**: Forked the repository and set up my student ID

**Details**: 
- Created GitHub account with university email
- Forked the starter repository
- Changed student ID on line 92 to my actual ID (441234567)
- Compiled and ran the program successfully

**Challenges**: Had to install JDK first because javac wasn't recognized

**Solution**: Downloaded JDK 17 from Oracle website and set PATH variable

**Time spent**: 30 minutes

---

## Your Development Log:

### Entry 1 - March 20, 2026 , 8:00 PM
**What I did** : 
 Created GitHub account and forked the starter repository
**Details**: 
- Created GitHub account using my university email 
- Forked the starter repository from https://github.com/makopt/OS-Assignment1-Starter
- Renamed repository to OS-Assignment1-Rawan-Saleh
**Challenges**: 
 I wasn't sure how to fork the repository at first
**Solution**: 
 I watched a tutorial on YouTube about how to fork repositories on GitHub
**Time spent**: 
20 minutes
---

### Entry 2 -[March 20, 2026, 9:00 PM]
**What I did**: 
 Set up my student ID in the code
**Details**: 
- Opened SchedulerSimulation.java file on GitHub
- Founded with studentID = 123456789
- Changed it to my actual student ID 
- Committed the change
**Challenges**: 
I couldn't find the file at first
**Solution**: 
I scrolled down in the repository and found the file list, then clicked on SchedulerSimulation.java
**Time spent**: 
60 minutes
---

### Entry 3 - [March 20, 2026, 11:00 PM]
**What I did**: 
 Added Feature 1 - Process Priority
**Details**: 
- Created Process.java file (it wasn't in the repository)
- Added private int priority variable to Process class
- Modified the constructor to accept priority parameter
- Added getPriority() method
- Updated addProcessToQueue to display priority
- Generated random priority between 1-5
**Challenges**: 
The Process.java file was missing from my repository
**Solution**: 
: I went to the original repository, copied the Process.java code, and created a new file in my repository with the same content, then added my modifications
**Time spent**: 
45 minutes
---

### Entry 4 -[March 20, 2026, 12:00 PM]
**What I did**: 
Added Feature 2 - Context Switch Counter
**Details**: 
- Added static int contextSwitches = 0 variable in SchedulerSimulation class
- Incremented the counter before each thread.start()
- Printed total context switches at the end of simulation
- Made sure to increment only when a process actually starts running
**Challenges**: 
I wasn't sure exactly when a context switch happens
**Solution**: 
I reviewed the Round-Robin scheduling concept and realized that each time a new process starts executing, it's a context switch. I placed the increment right before thread.start()
**Time spent**: 
40 minutes
---

### Entry 5 -[March 21, 2026, 7:00 PM]
**What I did**: 
Added Feature 3 - Waiting Time Tracking
**Details**: 
- Added waitingTime and lastExecutionTime variables to Process class
- Calculated waiting time in the run() method using System.currentTimeMillis()
- Created a list to store all processes for summary
- Added summary table at the end showing Process Name, Burst Time, and Waiting Time
- Updated 
**Challenges**: 
Calculating waiting time correctly was tricky because I needed to track when each quantum finished
**Solution**: 
 I added a variable lastExecutionTime that gets updated after each execution. When the process starts again, I calculate how much time passed since its last execution
**Time spent**: 
50 minutes
---

### Entry 6 - [Optional - Date and Time]
**What I did**: 

**Details**: 

**Challenges**: 

**Solution**: 

**Time spent**: 

---

## Summary

**Total time spent on assignment**: Approximately 6 hours]

**Most challenging part**: Third feature

**Most interesting learning**: 

**What I would do differently next time**: 
