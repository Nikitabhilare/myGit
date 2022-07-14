package excep;

public class ExcepEx {
	int a=10;
	int b=0;
	int c[]=new int[5];
	int excep() {
		try {
			return a/b;
		}
		catch(ArithmeticException ae) {
			return 1;
		}
		finally {
			System.out.println("after exception");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcepEx e=new ExcepEx();
		System.out.println(e.excep());

	}

}
