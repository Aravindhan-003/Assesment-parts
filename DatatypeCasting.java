package sample;

public class DatatypeCasting {

	public static void main(String[] args) {
		
		float f=1123.89f;
		long l3=(long)f;
		System.out.println("Float is:"+f);
		System.out.println("Float to Long is:"+l3);
		
		
		double m=987456789;
		long l2= (long) m;
		int k= (int) l2;
		//int a=65;
		char c= (char) k;
		System.out.println("Double is:"+m);
		System.out.println("Long is:"+l2);
		System.out.println("Integer is:"+k);
		System.out.println("Int to char is:"+c);
		
		
		long i=1023765;
		byte l=(byte) i;
		System.out.println("Long is:"+i);
		System.out.println("Long to byte is:"+l);
		
	    int i1=543;
	    double d2=i1;
	    long l4= (long)d2;
	    System.out.println("Integer is:"+i1);
	    System.out.println("Int to Double is:"+d2);
	    System.out.println("Double to Long is:"+l4);
	}

}
