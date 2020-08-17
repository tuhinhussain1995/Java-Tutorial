package udemySection06;

// Static method : (Does this method use instance methods or variables) ==> NO
// Instance method: (Does this method use instance methods or variables) ==> YES

public class Main {

    public static void main(String[] args) {
		//Main.display_StaticVariable();
		//Main.display_InstanceVariable();

		display_StaticAndInstanceMethod();
    }

    private static void display_StaticVariable(){
		StaticVariable rex = new StaticVariable("Rex");
		StaticVariable fluffy = new StaticVariable("Buck");
		rex.printName();
		fluffy.printName();

		InstanceVariable aaa = new InstanceVariable("Rex");
		InstanceVariable bbb = new InstanceVariable("Buck");
		aaa.printName();
		bbb.printName();
	}

	private static void display_InstanceVariable(){
		System.out.println("StaticVariable age: " + StaticVariable.age);
		StaticVariable.age = 10;
		System.out.println("StaticVariable age: " + StaticVariable.age);

		InstanceVariable obj1 = new InstanceVariable("No Name");
		obj1.age = 60;
		System.out.println("InstanceVariable obj1 age: " + obj1.age);

		InstanceVariable obj2 = new InstanceVariable("Null");
		System.out.println("InstanceVariable obj2 age: " + obj2.age);
	}

	private static void display_StaticAndInstanceMethod(){
    	StaticAndInstanceMethod.setUni_name("MEDIU");
    	StaticAndInstanceMethod.setLocation("Desa Petaling, Kuala Lumpur");

    	StaticAndInstanceMethod student1 = new StaticAndInstanceMethod("CS", "Tuhin", 1111);
    	student1.display();

    	StaticAndInstanceMethod student2 = new StaticAndInstanceMethod("IT", "Abu Bakar", 2222);
    	student2.display();
	}
}

// Static:
		// Static refers to no need to create object, Just call it using class name
		// The memory allocation is fixed for static variables or methods.
		// static methods can access only static variable or methods (same or other class)
		// static methods can't use this keyword. It use class name.
//Instance or Non-Static:
		// to call any non-static methods, we must need to create a new object of this class.
		// The memory allocation is not fixed for non-static variables or methods.
		// non-static method can access static and non-static both variables and methods (same or other class)