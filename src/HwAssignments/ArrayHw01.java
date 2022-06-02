package HwAssignments;

public class ArrayHw01 {

	public static void main(String[] args) {

		
//Create an array of cars and store 6 elements into it. 
//Using 2 different loops print all values from the array.	
		
String[] cars= {"Honda", "Toyota", "BMW", "Ford", "Mercedes", "Audi"};
for(int i=0; i<cars.length; i++) {
	System.out.println(cars[i]+" ");
}
System.out.println("-------------------------");		


String[] cars1= {"Honda", "Toyota", "BMW", "Ford", "Mercedes", "Audi"};		
for(String type:cars1)	{
	System.out.println(type);
}	
		
System.out.println("-------------------------");		
//Create an array of animals and store 5 elements into it. 
//Using 2 different loops print all elements from the array.	
		
String[] animals= {"Dog", "Cat", "Horse", "Cheetah", "Tiger"};
for(int j=0; j<animals.length; j++) {
	System.out.println(animals[j]+" ");
}
		
System.out.println("-------------------------");	
		
String[] animals1= {"Dog", "Cat", "Horse", "Cheetah", "Tiger"};
for(String type:animals1) {
	System.out.println(type);
}
		
System.out.println("---------------------------");		
//Create an array to store double values and 
//then print all elements using 2 different loops		
		  
double[] values= {10.99, 11.99, 12.99};
for(double numbers:values) {
	System.out.println(numbers);
}

System.out.println("-----------------------------");

double[] values1={10.99, 11.99, 12.99};
for(double k=0; k<values1.length; k++) {
//System.out.println(values1[k]+" ");
}

System.out.println("----------------------------");
//1. Create an array on integers and 
//calculate the sum of all elements in an array

int[] num1= new int[4];

num1[0]=5;
num1[1]=10;
num1[2]=15;
num1[3]=20;

System.out.println(num1[0]+num1[1]+num1[2]+num1[3]);

System.out.println("-------------------------------");
// enhanced for loop ^

int[] numbers= {1, 2, 3, 4};		
int sum=0;

for(int i=0; i<numbers.length; i++) {
	sum+=numbers[i];
}
		System.out.println(sum);
	
	System.out.println("------------------");	
	//same enhanced^	
		sum=0;
		
		for(int n:numbers) {
			sum+=n;
		}
	
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
