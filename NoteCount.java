package currencypackage;

import java.util.Arrays;

public class NoteCount {
	public void counting(int[] currency, int amount) {
		int notes[]=new int[currency.length];
		int sumofnotes=0;
		for (int i = 0; i <currency.length; i++) {
			notes[i]=amount/currency[i];
			 sumofnotes= sumofnotes+notes[i];
			amount=amount%currency[i]; 
			
		}
		System.out.println(Arrays.toString(notes ));
		for (int i = 0; i < currency.length; i++) {
			if(notes[i]!=0)
			System.out.println(currency[i] + "X" + notes[i]);
			
		}
		System.out.println("total number of notes are"+ sumofnotes);
		
	}


}
