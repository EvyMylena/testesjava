import java.math.BigDecimal;

public class soma {
	public static void main(String[] args) {
		problemDouble();
	}

	private static void problemDouble() {
		double x;
		x=0.1+0.2;
		System.out.println(x);
		float y=(float)(0.1+0.2);
		System.out.println(y);
		
		
		BigDecimal v1= new BigDecimal("0.1");
		BigDecimal v2=new BigDecimal("0.2");
		BigDecimal v3=v1.add(v2);
		System.out.println(v3);
	}

}
