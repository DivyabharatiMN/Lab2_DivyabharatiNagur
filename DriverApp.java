package currencypackage;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of currency notes in your country");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		
		System.out.println("please enter the "+ size+ "currency denominations, in any oredr");
		for (int i = 0; i < currency.length; i++) {
			currency[i]=sc.nextInt();
			
			
		}
System.out.println("before sorting" +Arrays.toString(currency));
MergeSort ms=new MergeSort();
ms.sort(currency,0,size-1);
System.out.println("After sorting" +Arrays.toString(currency));

System.out.println("please enter the total amount");
int amount=sc.nextInt();

NoteCount nc=new NoteCount();
nc.counting(currency,amount);





	}


	}


