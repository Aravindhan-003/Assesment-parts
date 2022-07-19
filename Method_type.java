package sample;
public class Method_type {
	public int Rectangle(int l,int b) {
		int res=l*b;
		return res;
	}
	public static void main(String args[]) {
		Method_type reg=new Method_type();
		int k=reg.Rectangle(5,7);
		System.out.println("Area of the Rectangle is:"+k);
	}

}
