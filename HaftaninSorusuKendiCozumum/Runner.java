package HaftaninSorusuKendiCozumum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

	

	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String islem;
		Registration userReg=new Registration();
	    
		
		
		ArrayList<User>register=null;
	    boolean cikis=false;
	    while (!cikis) {
			System.out.println("Lutfen yapmak istediginiz islemi seciniz : \n1-Kisi ekleme\n2-Kisi listeleme\n3-Sansli kisiyi bulma\n4-cikis");
		islem=scan.next();
	
	  switch (islem) {
	case "1":
		register =( ArrayList<User>)userReg.register();
		break;
	case "2":
		userReg.listele(register);
		
		break;
	case "3":
		userReg.printHappyUsers(register);
		break;
	case "4":
		cikis=true;
		break;

	default:
		System.out.println("Hatali veri girisi");
		break;
	}
	    
	    }
	    
	    
	    
		
		
		
		
	}

}
