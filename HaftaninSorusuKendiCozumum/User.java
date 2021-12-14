package HaftaninSorusuKendiCozumum;
import java.time.LocalDateTime;



public class User {   // asagidakiler bu klasin fieldleridir. yani sen bunlari urettiginde istediginde kullanabilirsin demek
	                  //kaliphane de objenin ozelliklerini olusturuyorum
	//eger ozelliklerini olusturdugum bir objem varsa constucktor u da olmali

	
	    String name;     //instance var yaptim. istedigim zaman oraya buraya cagirabilirim
	    LocalDateTime registerDate;  // bu classta default bir construcktor var
		
	    
	    public User() {  // parametreli olusturdugumda bunun hukmunu zaten yok eder
	    	
	    }
	    
	    public User(String name, LocalDateTime registerDate) {
			super();
			this.name = name;// ozellikler yukardan gelsin istiyorum
			this.registerDate = registerDate;  //burada parametreli yapmak istedigim icin bir construcktor cagirdim
			// sag tus source -- construcktor aus fileds diyorum pratik hemen geliyor
			
			
			
			
			
		}
	    
	
	
	
	
	
	
}
