package Market;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketRunner extends MarketDepo {
	static ArrayList<String> urunler=new ArrayList();
	static ArrayList<Integer> fiyat=new ArrayList();
	static ArrayList<Integer> kilo=new ArrayList();
	static Scanner scan=new Scanner(System.in);
	public static String Kullanici;
	
	public static void main(String[] args) {
		boolean dogrumu=false;
		while(dogrumu==false) {
			System.out.println("Hosgeldiniz kullanici ID girin: ");
			String Id= scan.next();
			System.out.println("Hosgeldiniz kullanici sifre girin: ");
			String sifre= scan.next();
			
			if (Id.equalsIgnoreCase(Kullanici)&&sifre.equalsIgnoreCase(sifre)) {
				dogrumu=true;
				System.out.println("Urun eklemek istersen E ya basiniz");
				String islem=scan.next();
				
			}
		}
		
			
			
		
		
		
		
		

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}