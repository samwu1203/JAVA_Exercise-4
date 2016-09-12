@SuppressWarnings("serial")
public class StackFullException extends Exception {
	public String reason;
    public StackFullException(String reason){
	this.reason=reason;
}
}