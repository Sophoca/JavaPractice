package Lab4;

public class StackTest {
    public static void main(String[] args) {
        // top initializes '-1'
        Stack stack=new Stack(10);
        stack.push(1);                  // a[0]=1, top=0
        stack.push(2);                  // a[1]=2, top=1
        System.out.println(stack.pop());      // top=0
        stack.push(3);                  // a[1]=3, top=1
        System.out.println(stack.pop());      // top=0
        System.out.println(stack.pop());      // top=-1
        stack.push(4);                  // a[0]=4, top=0
        //System.out.println(stack.pop());
    } // end of main()
}// end of StackTest
