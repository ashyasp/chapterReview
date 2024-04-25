package chapter9and10review;
                             //Chapter 10
public class Duck {
    private  int size;
    private static  int duckCount=0;
    //The static duckCount varibale is initializzed ONLY when the class is first loaded,NOT each time a new instance is made

    public Duck(){
        duckCount++;
    }
    //Now it will keeep incrementing each time the Duck construcor runs,becuase duckCount is static and won't be reset to 0
    public void setSize(int s){
        size=s;
    }
    public int getSize (){
        return size;
    }
    //A duck object does not keep its own copy of duckCount.
    //Because duckCount is static,Duck objects all share a single copy of it.You can think of a static variable as a
    // variable that lives in a class instead of in an object.

    //Each Duck object has its own size variable but there is only one copy of the duckCount variable-the one in the class

}
