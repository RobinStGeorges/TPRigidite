import java.util.Stack;

public class DisplayText extends Display {
    Stack stack1T;
    Stack stack2T;
    Stack stack3T;

    public DisplayText(Stack stack1T, Stack stack2T, Stack stack3T) {
        super();
    this.stack1T=stack1T;
    this.stack2T=stack2T;
    this.stack3T=stack3T;

    }

    void Display(){
        while(!stack1T.empty()){
            System.out.println(" (1) : "+stack1T.pop()+" (2) : "+stack2T.pop()+" (All) : "+stack3T.pop()+" ");
        }
    }

}
