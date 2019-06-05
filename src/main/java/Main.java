import java.util.HashMap;
import java.util.Stack;

class Main {
    public static void main (String[] args){
        int accRigidite = 0;
        HashMap<String, String> map = new HashMap<String, String>();

        App app1 = new App(56);
        App app2 = new App(13);

        Rigidite myRigidite = new Rigidite();
        myRigidite.addApp(app1);
        myRigidite.addApp(app2);



        double all = myRigidite.getAllRigidite();

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        Stack stack1T = new Stack();
        Stack stack2T = new Stack();
        Stack stack3T = new Stack();

        for(int i = 0; i<5;i++){
            int rig1 = app1.getAppRigidite();
            int rig2 = app2.getAppRigidite();

            rig1 += 5;rig2 += 5;

            app1.set_rigidite(rig1);
            app2.set_rigidite(rig2);

            all = myRigidite.getAllRigidite();

            stack1.push(app1.getAppRigidite());
            stack2.push(app2.getAppRigidite());
            stack3.push(myRigidite.getAllRigidite());
        }

        stack1T = inverseStack(stack1);
        stack2T = inverseStack(stack2);
        stack3T = inverseStack(stack3);

        Display displayGraph = new DisplayGraph(stack1T,stack2T,stack3T);
        Display displayText = new DisplayGraph(stack1T,stack2T,stack3T);

    }

    public static Stack inverseStack(Stack stack){
        Stack stackT = new Stack();
        while(!stack.empty()){
            stackT.push(stack.pop());
        }
        return stackT;
    }
}
