package HaftaninSorusuKendiCozumum;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

	ArrayList<User>kullanicilar=new ArrayList<>();
	
	public List <User> register(){// bu demek ben bir List yapiyorum degerleri User klasindan gelen demek
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("Adinizi giriniz");
		String isim=scan.nextLine();
		
		User user=new User(isim,LocalDateTime.now());
		kullanicilar.add(user);
		
		
		return kullanicilar;
		
	}
	
	public void printHappyUsers(ArrayList<User>users){  //bu method 10. satirdan gelen objelerin ilk 10 saniyesinden gelen objeleri yazdiracak
		 
		for (User each: users) {  // usersin her bir elemanini al each a ata
		
			if (each.registerDate.getSecond()<10) {
				System.out.println("Sansli kullanici!"+ each.name +" Bey/Hanim");
				
			}else 
				System.out.println(each.name + " 10  saniye daha erken gelmeliydiniz. Tekrar deneyiniz!");
			
		}	
		}
		
	public  void listele(ArrayList<User>users) {
		for (User each : users) {
			System.out.println("Adi " + each.name+ ". kayit zamani "+ each.registerDate);
		}
		
		
		
	
		
		
	}
 	
	}
	
	
	
	
	
	
	


