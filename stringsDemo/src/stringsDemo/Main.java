package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		//length
		System.out.println("Eleman Sayısı : " + mesaj.length());
		//charAt (belli bir indeksdeki karakteri bulma)
		System.out.println("5. eleman : " + mesaj.charAt(4));
		//concat (mesaja yazı ekleme) 
		System.out.println(mesaj.concat(" Yaşasın!"));
		//startsWith
		System.out.println(mesaj.startsWith("B"));
		//endsWith
		System.out.println(mesaj.endsWith("."));
		
		//getChars (bir yazının içinden bazı karakterleri almak için)
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		//indexOf
		System.out.println(mesaj.indexOf('a'));
		//lastIndexOf
		System.out.println(mesaj.lastIndexOf('a'));

		//replace
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		//substring
		System.out.println(mesaj.substring(2, 5));

		// split
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		// toLowerCase
		System.out.println(mesaj.toLowerCase());
		// toUpperCase
		System.out.println(mesaj.toUpperCase());
		// trim (başındaki ve sonundaki boşlukları silmek için
		System.out.println(mesaj.trim());

	}

}
