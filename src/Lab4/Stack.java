package Lab4;

public class Stack {
    private int top;
    private int max_size;
    private int[] array;

    public Stack(int max_size){
        this.max_size=max_size;
        this.array=new int[max_size];
        this.top=-1;
    }

    public void push(int value) {
        array[++top]=value;
    }

    public int pop(){
        return array[top--];
    }

    public int getTop(){
        return top;
    }
}
