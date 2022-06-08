package HwAssignments;

public class dog {


	String name;
	int age;
	String color;

	
	void size() {
		System.out.println("This is a big dog");
	}
	void work() {
		System.out.println("He is a lot of work to take care of");
	}
	
	void walks() {
		System.out.println("This dog like walks");
	}
	
	
	public static void main(String[] args) {
	
	
	dog husky = new dog();
	husky.name="bruno";
	husky.age=4;
	husky.color="white";
	System.out.println(husky.name);
	husky.size();
	husky.work();
	husky.walks();

	System.out.println("-------------------");

	dog bulldog = new dog();
	bulldog.name="pit";
	bulldog.age=4;
	bulldog.color="black";
	System.out.println(bulldog.name);
	bulldog.size();
	bulldog.work();
	bulldog.walks();

	System.out.println("-------------------");

	dog labrador = new dog();
	labrador.name="zues";
	labrador.age=4;
	labrador.color="grey";
	System.out.println(labrador.name);
	labrador.size();
	labrador.work();
	labrador.walks();
	
	
	
	
	
	
	
	}
	
}
