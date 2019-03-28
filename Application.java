
public class Application {
	public static void main(String[] args) {
		problemString();
		
	}

	private static void problemString() {
		int MAX=100000;
		long t0sb=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<MAX;i++) {
			sb.append(i);
		}
		long t1sb=System.currentTimeMillis();
		long tStringBuilder=(t1sb-t0sb);
		System.out.println("Tempo concat StringBuilder (ms): "+tStringBuilder);
		
		
		long t0=System.currentTimeMillis();
		String s="";
		for (int i=0;i<MAX;i++) {
			s+=i;
		}
		long t1=System.currentTimeMillis();
		long tString=(t1-t0);
		System.out.println("Tempo concat String (ms): "+tString);
	}

}
