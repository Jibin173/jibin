package Helloworld;

public class clasob {
	//data types
	//qualities of human being
	String sex;
	String color;
	double height;
	String name;
	
	public clasob(String string,String string2,double h,String string3) {
		sex=string;
		color=string2;
		height=h;
		name=string3;
		
		
		System.out.println("Hello people my name is"+" "+string3+" "+"I am a"+" "+string+" "+"my height is"+" "+h+" "+"my color is"+" "+string2);
	}
	
	public void walk() {
	System.out.println(name+" "+"walks");	
	}
	
	public void eat() {
		System.out.println(name+"eat");
	}
	public void grow() {
		System.out.println(name+"grow");
	}
	
	public void job() {
		System.out.println(name+"go for work");
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		clasob human1=new clasob("male","black",5.4,"Jibin");
		human1.walk();
		

	}

}
