Shayan Chowdhury
APCS2 pd2
HW12 -- __+3R|\/|1|\|4|_  1|_|_|\|3$$__
2018-03-01

Q0: Multiple class definitions in one Java file is (although usually discouraged) helpful to organize helper classes for one "main" 
public class for the file.
Q1: The command line arguments are processed in the main method of the public class Demo by checking if the argument(s) (2 at most) 
given in the command line are plausible int vales. If not, then an exception is caught and the nxn (default at 8) grid is made with 
a delay time of timeDelay (default at 500ms).
Q2: If no command line arguments are given, then the default nxn (default at 8) grid is made with a delay time of timeDelay (default 
at 500ms). 
Q3: The recursive call is used in the go method to continue moving to a random position within the sideLengths of the grid until the 
base case is met.
Q4: I expect to see something along the lines of an nxn grid with a timer of sorts laid out across it.
Q5: According to the base case, I expect it to last around timeDelay * n(n - 1) milliseconds.
Q6: ANSI stands for the American National Standards Institute, an organization that sets quality and safety standards for technology 
and has also established the ANSI character set that's linked to codes.
Q7: My prediction wasn't terribly far off, but using ANSI escape codes in printing out the grid definitely caught me off guard.  
Q8: This could be used to depict a step by step chronological Knight's path to see the optimal route for the Knight's Route problem. 

My algorithm for a Knight's Tour hasn't changed much since yesterday's explanation: essentially, test every single possible move for 
each knight; if the move is legal, then rinse and repeat, otherwise backtrack. 