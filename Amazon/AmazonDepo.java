package Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AmazonDepo {
	 static Scanner scan = new Scanner(System.in);
	 static String yeniStr="";
	 static  List<String> urunler=new ArrayList<>(Arrays.asList("Nutella", "tadelle", "Patlican"));
	 
	 List<String> yeniurunler=new ArrayList<>();
	static List<String> fiyatlar=new ArrayList<>(Arrays.asList("10","11","12"));      
	
	protected static void ekle(List<String> urunler2) {
		System.out.println("urunlere eklemek icin urun gir");
		System.out.println("yeterli urune ulasinca 'q' giriniz)");
		String islem="";
		while (!islem.equalsIgnoreCase("q")) {
			System.out.println("urun gir");
			islem=scan.next();
			urunler.add(islem);
		}
		urunler.remove(urunler.size()-1);// en son q girmisti  q yu silmem lazim
		System.out.println("liste olarak : "+ urunler);

	}
	
	protected static void degistir(List<String> urunler) {
		System.out.println("degistirmek istedigin urun/urunleri indexini sec " +urunler);
		int degistirilecek=scan.nextInt();
		System.out.println("yerine hangi urunu yazalim");
		String yeni= scan.next();
		urunler.set(degistirilecek, yeni);
		System.out.println("degistirdikten sonra liste olarak : "+ urunler);
		urunler=urunler;
		listeleme(urunler,fiyatlar);

	}
	protected static void silme(List<String> urunler) {
		System.out.println("silmek istedigin urun/urunleri indexini sec " +urunler);
		int silinecek=scan.nextInt();
		urunler.remove(silinecek);
		System.out.println("sildikten sonra liste olarak : "+ urunler);
		urunler=urunler;
		listeleme(urunler,fiyatlar);
		
	
			
		}
	protected static void listeleme(List<String> urunler,List<String> fiyatlar ) {
		System.out.println("amazondaki urunlerimiz ve fiyatlari :  " +urunler+ " "+ fiyatlar);
				
		}
	protected static void fiyatDegistir(List<String> urunler) {
		System.out.println("fiyatini degistirmek istedigin urun/urunlerin indexini sec "
	+urunler+ " " + fiyatlar);
		int degistirilecek=scan.nextInt();
		System.out.println(degistirilecek + " siradaki urune fiyat ne  yazalim");
		String yenifiyat= scan.next();
		fiyatlar.set(degistirilecek, yenifiyat);
		System.out.println("degistirdikten sonra liste olarak : "+ urunler +" " + fiyatlar);
		fiyatlar=fiyatlar;
		listeleme(urunler,fiyatlar);

	}
}
