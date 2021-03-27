package Helloworld;

public class statmethod {
	
	//constructor
	int a,b,c,d;
	
	
	public void Display(int u,int k)     //default: accesseble withing the package i.e Helloworld

	{
		c=u+k;
		System.out.println(c);
	}
	//only one load it gets load
	//even this is a part of class memory
	static void dis() {
		
	
		System.out.println("from static block");
	}
	
	
	
	
	public static void main(String[] args) {
		statmethod s1=new statmethod();  
		
		
		
		
	}	
	
         
	}


