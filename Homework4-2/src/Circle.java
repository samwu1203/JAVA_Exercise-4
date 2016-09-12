
public class Circle implements Sharp{
double computeArea;
double circumference;
double r;

public Circle (double r){
	this.r=r;
};

public double computeArea(){
	computeArea=r*r*Math.PI;
	return computeArea;
};
public double computeCircumference(){
	circumference=2*r*Math.PI;
	return circumference;
};
	
	
	
}
