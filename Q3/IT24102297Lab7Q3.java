import java.util.Scanner;

	public class IT24102297Lab7Q3{
	public static void main(String args[]){

	Scanner object=new Scanner(System.in);

	int i;	
	for(i=1; i<=5; i++){
	System.out.println("Customer " +i);
	System.out.print("Enter total bill amount: ");
	double bill=object.nextDouble();
	System.out.print("Enter mode of payment(C for cash, 0 for other): ");
	char modeOfPayment= object.next().charAt(0);

	if(modeOfPayment== 'C' || modeOfPayment== 'c'){

	double discount= bill * 0.05;
	System.out.println("Discount is: " + discount);
	

	double total= bill - discount;
	System.out.println("Amount to be paid: " + total);
	
	System.out.println();
	
	}else if(modeOfPayment=='0'){
	System.out.println("No discount applicable");
	System.out.println("Amount to be paid: "+ bill);
	System.out.println();
	
	}else{
	System.out.println("Payment Mode is Not Valid");
	System.out.println();
	}
	
		}
	}
}