package HwAssignments;

public class dogs {
	String breed;
	String name;
	String color;
	
	void bark(){
		  System.out.println(" can bark");
		}
		void run(){
		  System.out.println(" can run");
		}
		void play(){
		  System.out.println(" can play");
		}


public static void main(String[] args) {

dogs Husky = new dogs();
Husky.breed="Husky";
Husky.name="bruno";
Husky.color="white";

dogs Bulldog = new dogs();
Bulldog.breed="Bulldog";
Bulldog.name="zues";
Bulldog.color="black";  

dogs Labrador = new dogs();
Labrador.breed="Labrador";
Labrador.name="rocky";
Labrador.color="tan";

  System.out.println(Husky.breed);
  
  
	}

}