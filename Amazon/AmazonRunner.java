package Amazon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class AmazonRunner extends AmazonDepo {

	 static String MusteriEmail="m";
	 static String MusteriSifre="1";
	 static String TesterEmail="t";
	 static String TesterSifre="1";
	 static String DevEmail="d";
	 static String DevSifre="1";
	 static Scanner scan = new Scanner(System.in);
	 static AmazonDepo depo=new AmazonRunner(); 

	 static  List<String> urunler=new ArrayList<>(Arrays.asList("Nutella", "tadelle", "Patlican"));
	  static List<String> fiyatlar=new ArrayList<>(Arrays.asList("10","11","12"));      
		
		public static void main(String[] args) {
			
			String email = "";
			String sifre = "";
			boolean bln = false;
			
			while (!bln) {
				System.out.println("welcome to amazon ");
				System.out.println("enter your email");
				 email=scan.next();
				System.out.println("enter your password");
				 sifre=scan.next();
				 if (email.equals(MusteriEmail) && sifre.equals(MusteriSifre) ){
					 bln=true;
					 Musteri();
					
				} else if (email.equals(DevEmail)&&sifre.equals(DevSifre)){
					bln=true;
					Developer();
					} else if (email.equals(TesterEmail)&&sifre.equals(TesterSifre)){
					bln=true;
					Tester();

				} else {
					bln=false;
					System.out.println("yanlis email veya sifre girdiniz");
				}}
		}
		
		private static void Tester() {
			System.out.println("hosgeldin tester ===\nhersey testerlar icin kardo");
			System.out.println("ne yapmak istersin\n1-add \n2-seturun \n3-delete \n4-list \n5-setfiyat");
			int islem=scan.nextInt();
			switch (islem) {
			case 1:
				System.out.println("ekleme mi yapacan hadi urun ekle");
				depo.ekle(urunler);			
				break;
	case 2:
		System.out.println("urun degistirme ekranina hosgeldiniz");
		depo.degistir(urunler);
				break;
	case 3:
		System.out.println("case 3");
		System.out.println("silme ekranina hosgeldiniz");
		depo.silme(urunler);
		break;
	case 4:
		System.out.println("case 4");
		System.out.println("listeleme ekranina hosgeldiniz");
		depo.listeleme(urunler,fiyatlar);
		break;
	case 5:
		System.out.println("fiyat degistirme ekranina hosgeldiniz");
		depo.fiyatDegistir(urunler);	
				break;
			default:
				System.out.println("lutfen 1-5 arasi rakam gir");
				break;
			}
			
			
		}

		private static void Developer() {
			System.out.println("hosgeldin Developer");		
			System.out.println("yapim asamasindayiz henuz");
		}
		private static void Musteri() {
			System.out.println("hosgeldin Musteri");
			System.out.println("yapim asamasindayiz henuz");
		}
}
