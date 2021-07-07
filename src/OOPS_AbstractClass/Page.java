package OOPS_AbstractClass;

public abstract class Page {
	
	public Page() {
		System.out.println("Page class const....");
	}
	
	//can not create the object of abs.. class
	//can I create the const... of abs.. class? Yes
	//it will be called when you create the object of child class...
	
	//abs... clas can have abstract(no method body) and non abstract methods(with body):
	//0 to 100% abstraction
	//0% abstraction: yes
	//partial abstraction: yes
	//100% abstraction: yes
	
	public abstract void title();
	public abstract void header();
	
	public void timeOut() {
		System.out.println("time out is 10 secs");
	}
	
	public static void logo() {
		System.out.println("page logo");
	}
}
	