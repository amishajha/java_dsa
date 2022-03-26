public class StackImplementation {
    private int maxsize;
    private long[] stackarray;
    private int top;

    public StackImplementation(int s){
        maxsize=s;
        stackarray=new long[maxsize];
        top=-1;
    }

    public void push(long j){
        stackarray[++top]=j;

    }

    public long pop(){
        return stackarray[top--];

    }

    public long peek(){
        return stackarray[top];
    }

    public boolean isEmpty(){
        return (top==-1);

    }

    public boolean isfull(){
        return (top==maxsize-1);
    }
    public static void main(String[] args) {
         StackImplementation stack = new StackImplementation(11);
         stack.push(12);
         stack.push(11);
         while(!stack.isEmpty()){
             long value = stack.pop();
             System.out.println(value);

         }
    }
}
