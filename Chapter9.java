package chapter9and10review;

public class Chapter9 {
    public void doStuff(){
        boolean b=true;
        go(4);
    }
    //Code from another class calls doStuff() and do Stuff() goes into a stack frame at the top of the stack
    //The boolean variable named 'b' goes on the doStuff() stack frame
    //doStuff() calls go() and go() is pushed on top of the stack.Variables 'x' and 'z' are in the go() stack frame
    public void go(int x){
        int z = x+24;
        crazy();
    }
    //go() calls crazy(),crazy() is now on the top of the stack,with variable 'c' in the frame
    public void crazy(){
        char c ='a';
    }
    //crazy() completes,and its stack frame is popped off the stack.Execution goes back to the go() method,and picks up
    // at the line following the call to crazy().
public class StackRef{
        public void foof(){
            barf();
        }
        //barf() declares and creates a new Ducl reference variable 'd' (since its declared inside the method),it's a local
        //variable and goes inside the stack
        public void barf(){
           // Duck d = new Duck(24);
        }
        //no matter where the object reference variable is declared (inside a method vs as an instance variable of a
        //class) the object always always always goes on the heap
    }



}


