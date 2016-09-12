@SuppressWarnings("serial")
public class StackEmptyException extends Exception {
    public String reason;
	public StackEmptyException(String reason){
    	this.reason = reason;
}
}