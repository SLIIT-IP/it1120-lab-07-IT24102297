import java.util.Scanner;

	public class IT24102297Lab7Q1A{
	public static void main(String args[]){

	Scanner object = new Scanner(System.in);
	System.out.println("Enter marks for four subjects:");

	System.out.print("Enter Subject Mark 1: ");
	int mark_1 = object.nextInt();
	System.out.print("Enter Subject Mark 2: ");
	int mark_2 = object.nextInt();
	System.out.print("Enter Subject Mark 3: ");
	int mark_3 = object.nextInt();
	System.out.print("Enter Subject Mark 4: ");
	int mark_4 = object.nextInt();
	System.out.println();

	double average= (mark_1 +mark_2+mark_3+mark_4) / 4;
	System.out.println("Average is : "+average);
	

	if(average<=100 && average>=75){
		System.out.print("Overall Grade is: Distinction");
	}else if(average<=74 && average>=50){
		System.out.print("Overall Grade is: Credit");
	}else{
	System.out.print("Overall Grade is: Fail");
	}

	}
}