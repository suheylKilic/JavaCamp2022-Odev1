package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For Loop (Döngü) 
		System.out.println("1'den 10'a kadar sayılar:");
		for (int i =1; i<=10; i++) {
			System.out.println(i);
			
		}
		System.out.println("Döngü Bitti.");
		
		// tek sayılar için
		System.out.println("Tek Sayılar:");
		for (int i =1; i<=10; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("Tek Sayılar Bitti.");
		
		//Çift sayılar için 
		System.out.println("Çift Sayılar:");
		for (int i =2; i<=10; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("Çift Sayılar Bitti.");
		
		System.out.println("For Döngüsü Bitti.");
		
		//While Loop
		int i=1;
		
		System.out.println("1'den 10'a kadar sayılar:");
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Döngü Bitti.");
		
		System.out.println("Tek sayılar:");
		
		int j=1;
		while (j<=10) {
			System.out.println(j);
			j+=2;
		}
		System.out.println("Tek Sayılar Bitti.");
		
		System.out.println("Çift sayılar:");
		
		int z=2;
		while (z<=10) {
			System.out.println(z);
			z+=2;
		}
		System.out.println("Çift Sayılar Bitti.");
		System.out.println("While Döngüsü Bitti.");
		
		//Do-While Loop (While dan farkı ilk önce işlemi gerçekleştiriyor. Fakat koşul sağlanmıyorsa döngü devam etmiyor.)
		
		int x=1;
		do {
			System.out.println(x);
			x++;
		}while(x<=10);
		System.out.println("Do-While Döngüsü Bitti.");
	}

}
