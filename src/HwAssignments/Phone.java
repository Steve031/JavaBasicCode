package HwAssignments;

public class Phone {

	

//Create a Class “Phone”. Create 3 Objects of it: 
//iPhone, Pixel, Samsung with specific  attributes and behaviors.	
		

//attributes	
String name;
double weight;
String color;
int battary;

//behavior
void quality() {
	System.out.println("good quality");
}
void apps() {
	System.out.println("phone works good");
}		
	
		
public static void main(String[] args) {
	
		
Phone iphone = new Phone();	
iphone.name="IPhone";		
iphone.weight=4.9;		
iphone.color="black";		
iphone.battary=99;
System.out.println(iphone.name);
iphone.quality();
iphone.apps();

System.out.println("-------------------");

Phone pixel = new Phone();
pixel.name="pixel";		
pixel.weight=5.1;		
pixel.color="white";		
pixel.battary=80;
System.out.println(pixel.name);	
pixel.quality();
pixel.apps();		
	
System.out.println("--------------------");


Phone samsung = new Phone();
samsung.name="samsung";		
samsung.weight=5.5;		
samsung.color="blue";		
samsung.battary=90;
System.out.println(samsung.name);	
samsung.quality();
samsung.apps();				
		
		
		
		
		
		
		
		
		
		
		
		
		

	}	

}
