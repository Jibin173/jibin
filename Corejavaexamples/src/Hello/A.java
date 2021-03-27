package Hello;


class B{                 
	private int a;           
	public void set(int b){   
		
		a=b;
		System.out.println("value of a has been initialised");
		
		  }
	public void get(){
	System.out.println("value of a is"+a);
		}

	}
class A{
	public static void main(String args[]) {
		int b=10;
		B a1=new B();  
		a1.set(b);
		a1.get();
	}
	
	}	