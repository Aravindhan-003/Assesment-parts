package sample;

public class Calculate {
public int add(int a, int b) {
	int d=a+b;
	return d;
}
public int Area_of_circle(int r) {
	int c= (int)3.14*r*r;
	return c;
}
public int Area_of_Rectangle(int l,int b) {
	int rec=l*b;
	return rec;
}
public int Area_of_square(int b) {
	int squ= b*b;
	return squ;
}

	public static void main(String[] args) {
		Calculate cal=new Calculate();
		int z=cal.add(12,6);
        System.out.println("Addition of two number is:"+z);
		System.out.println("Area of circle is:"+cal.Area_of_circle(z));
		System.out.println("Area of Rectangle is:"+cal.Area_of_Rectangle(6,5));
		System.out.println("Area of square is:"+cal.Area_of_square(z));
	}

}
