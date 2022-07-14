class sample{
	private int a;
//  public void Setvalue(int x) {
//		a=x;
//	}
    sample(int x){
    	a=x;
    }
    sample(){
    	a=15;
    }
	public int Getvalue() {
		return (a);
	}
}



public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s= new sample(60);
		sample s1= new sample();
//	    s.Setvalue(10);
		System.out.println(s.Getvalue());
		System.out.println(s1.Getvalue());

	}

}
