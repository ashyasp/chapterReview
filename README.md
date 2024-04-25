Chapter 9 Review: Constructors and garbage collection
* In Java,programmers care about two types of memory: the one where objects live(the heap), and the one where method invocations and local variables live (the stack).
* When a JVM starts up,it gets a chunk of memory from the underlying OS, and uses it to run your java program.
* We know all objects live on the garbage collectible heap,but where variables live depend on what kind of variable it is.
* By kind not type,ie primitive or object reference.There are two kinds of variables whose lives we care about:instance and local variables.
* Local Variables are also known as stack variables,which is a clue to where they belong.
* The stack is where method invocations and local variables live.Ex: go(),doStuff(),main().
* The Heap also known as "Garbage Collectible Heap" is where ALL objects live.Ex: Duck object,Button object,etc.
* Instance variables are declared inside a class but not inside a method.They represent the "fields" that each individual object has (which can be filled with different values for each instance of the class). Instance variables live inside the object they belong to. Ex: public class Duck { int size;}
* Local Variables are declared inside a method,including method parameters.They're temporary,and live only as long as the method is on stack(in other words,as long as the method has not reached the closing brace). Ex: public void foo (int x){ int <ins> i </ins> = x+3; boolean <ins> b</ins>=true;} (the parameter x and the variable i and b are all <ins> local </ins> variables)
* Methods are stacked: when you call a method,the method lands on the top of a call stack.That new thing that's actually pushed onto the stack is the stack frame,and it holds the state of the method including which line of code is executing and the values of all local variables.
* The method at the top of the stack is always the currently running method for that stack.A method stays on the stack until thr method hits it closing curly brace(which means the method is done). 
* The method on top of the stack is always the currently executing method.
* Remember, a non-primitive variable holds a reference to an object, not the object itself.
* You already know object live -on the heap,it does not matter where they are declared or created.
* if the local variable is a reference to an object,only the variable(the reference/remote) goes on the stack.
* Object reference variables work just like primitive variables -- if the reference is declared as a local variable it goes on the stack.
* The superclass parts of an object have to be fully formed before the subclass parts can be constructed
* The call to super() must be first statement in each constructor.
* When you set a reference to null,you're deprogramming the remote control.In other words,you've got a remote control,but no TV at the other end.


Chapter 10: Numbers and Statics
* Math methods do not need a new keyword
* The keyword static lets a method run without any instance of the class.A static method means "behavior not dependent on an instance variable,so no instance/object is required.Just the class".
* A method marked private means that only code from within the class can invoke the method.
* This does not mean a class with one or more static methods should never be instantiated.in fact every class you put a main() method in is a class with a static method.
* You're free to combine static and non-static methods in a class,although even a single non-static method means there must be some way to make an instance of the class.
* Static methods run without knowing about any particular instance of the static methods class.And there might not even be any instances of that class.Since a static method is called using the class (Math.random()) as opposed to an instance reference (t2.play()), a static method cannot refer to any instance variables of the class.The static method does not know which instance's variable value to use.
* What do nonstatic methods do? They usually use instance variable state to affect the behavior of the method.
* Statics cant see instance variables state
* Static variables give you a value shared by all instances of a class,in other words,one value per class instead od one value per instance.
* Static variables  are initialized when a class is loaded.A class is loaded because the JVM decides it's time to load it.Typically, because someone is trying to make a new instance of the class
* Static variables in a class are initialized before any object of that class can be created
* Static variables in a class are initialized before any static method of the class runs
* A static initializer is a block of code that runs when a class is loaded,before any other code can use the class,so it's a great place to initialize a static variable
* You can use the final keyword to modify non-static variables too,including instance variables,local variables, and even method parameters.
* A final method means you cannot override the method
* A final class means you cannot extend the class (i.e. you cannot make a subclass)
* A final variable means you cannot change its value
* Assigning a value to a final instance variable must be either at the time of declaration or in its constructor
* To make a constant in java mark a variable as static and final
* A final static variable must be assigned a value either at the time it is declared or in a static initializer(static { DOG_CODE=420})
* A static method can access a static variable
* A static variables is a variable shared by all members of a given class.
* Sometimes you want to treat a primitive like an object.You cannot put a primitive directly into a collection like arraylist or hashmap
* There is a wrapper class for every prim type,and since the wrapper classes are in the java lang package,you do not need to import them
* you can recognize wrapper classes because each one is named after the prim type it wraps but with the first letter capitalized to follow the class naming convention
* int primitive =Integer object: int i =288; Integer iWrap=new Integer(i);
* unwrapping a value: int unWrapped=iWrap.intValue();
* If a method takes a wrapper type,you can pass a reference to a wrapper or a prim type of the matching type,and of course the reverse is true.
* A big issue with static imports is that it is not hard to create naming conflicts. How will you adn the compiler know which add() method to use?
* 
* 
