package uiltex;

@FunctionalInterface 
interface interf1{
	void disp(int a, int b);
//	void disp1();
}
public class LambdaEx  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
/*		interf1 in=new interf1() { //no obj for interface nd abstract classs

			@Override
			public void disp() { //hence we overided that abs method
				// TODO Auto-generated method stub
				System.out.println("hello");
				
			}
			
		};
		in.disp(); */
		interf1 in=(a,b)->
		{
			System.out.println("hello"+(a+b));
		};
		in.disp(3,4);
		

	}

}
