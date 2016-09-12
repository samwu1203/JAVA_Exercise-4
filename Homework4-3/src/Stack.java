
public class Stack {
	public int[] data = new int[4];
	public int top=-1;
	
	public void push(int num) throws StackFullException{
	    if (top==3){ throw new StackFullException("the stack is full");}
		
	    top++;
	    data[top] = num;
	    System.out.println("push "+"top= "+top+"  num="+num);
	}
	
	public void pop() throws StackEmptyException{
		if (top<0){ throw new StackEmptyException("the stack is empty");}
		    
		System.out.println("pop "+"top= "+top+"  num="+data[top]);
		    top--;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack ();
		try{
		s.push(3);
		s.push(4);
		}catch(StackFullException e){
			System.out.println(e.reason);}
		try{
		s.pop();
		}catch(StackEmptyException e){
			System.out.println(e.reason);}
		try{
		s.push(6);
		s.push(5);
		s.push(10);
		s.push(16);
		s.push(23);
		}catch(StackFullException e){
			System.out.println(e.reason);}
		try{
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		}catch(StackEmptyException e){
			System.out.println(e.reason);}
		
}
}
