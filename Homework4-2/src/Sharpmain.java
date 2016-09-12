public class Sharpmain{
 public static void main(String[] args) {
		Circle c = new Circle (3.5);
		Rectangle t = new Rectangle (5.2, 6.3);
		System.out.println("Area= "+c.computeArea()+"  Perimeter= "+c.computeCircumference());
		System.out.println("Area= "+t.computeArea()+"  Perimeter= "+t.computeCircumference());
	}
}
