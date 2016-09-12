
	public class Rectangle implements Sharp{
		double computeArea;
		double circumference;
		double d;
		double w;

		public Rectangle (double d, double w){
			this.d=d;
			this.w=w;
		};	
			
		public double computeArea(){
			computeArea=d*w;
			return computeArea;
		};
		public double computeCircumference(){
			circumference=2*d+2*w;
			return circumference;
		};
}
