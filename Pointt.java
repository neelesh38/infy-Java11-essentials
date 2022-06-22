class Point {
	
	private double x;
	private double y;
	
	public Point()
	{
		
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Method to obtain distance of a point w.r.t origin
	public double distance(){
	    //code here
		double d;
		d=x*x+y*y;
		return Math.sqrt(d);
	}
	
	//Method to obtain distance of a point w.r.t another point
	public double distance(Point p1, Point p2){
	    //code here
		double p3;
		double p4;
		p3=(p2.x-p1.x);
		p4=(p2.y-p1.y);
		
		return Math.sqrt(p3*p3+p4*p4);
	}

}


public class Pointt {
	public static void main(String[] args) {
	    //code here
		Point p1 =new Point(2,3);
		double k = p1.distance();
		Point p2 = new Point(5,6);
		Point p3 = new Point();
		double m = p3.distance(p1,p2);
		
		System.out.println("The distance of p1 from p2 is : "+m);
		System.out.print("The distance of p1 from the origin is "+k);
	}

}
