class grandparent{
	int g1=60;
	
	void print(){
		System.out.println("value of grandparent is: " +g1);
	}
}



class parent extends grandparent{
	int p1=20;
	
	void show(){
		System.out.println("val of parent is: " +p1);
	}
}


class child extends parent{
	int c1=30;
	
	void display() {
		System.out.println("val of child is: " +c1);
	}
}



public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		parent p=new parent();
		child c=new child();
		c.show();
		c.display();
		c.print();

	}

}
