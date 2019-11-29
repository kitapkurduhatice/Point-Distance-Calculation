
public class Point {
	int x;
	int y;
	
	void setX(int newX) {

			this.x = newX;
	}

	double getX() {
		return x;

	}

	void setY(int newY) {
			this.y = newY;
	}

	double getY() {
		return y;

	}

	Point()
	{
		this(0,0);
	}
	Point(int x,int y)
	{
		setX(x);
		setY(y);
	}
	
	double distance() {
		return Math.sqrt( (x-0) * (x-0) + (y-0) * (y-0) );
	}
	double distance(int x1,int y1)
	{
		return Math.sqrt( (x-x1) * (x-x1) + (y-y1) * (y-y1) );
	}
	double distance(Point p)
	{
		return Math.sqrt( (x-p.getX()) * (x-p.getX()) + (y-p.getY()) * (y-p.getY()) );
	}

}
