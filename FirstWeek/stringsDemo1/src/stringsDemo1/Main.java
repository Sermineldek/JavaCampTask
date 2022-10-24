package stringsDemo1;

public class Main {

	public static void main(String[] args) {
		String mesaj ="   Bugün hava çok güzel.  "; 
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '-');  //replace:değiştirme
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		//substring: ..'den itibaren kes
		
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
        //split:Bir metni belli bir karakter veya karakterler dizisini dikkate alarak parçalar
		
		}
	    System.out.println(mesaj.toLowerCase()); 
	    System.out.println(mesaj.toUpperCase());
	    System.out.println(mesaj.trim());
	}
}
    /*toLowerCase: Metin içerisindeki bütün harfleri küçültme
      toUpperCase: Metin içerisindeki bütün harfleri büyütme
      trim: bir metnin başında ve/veya sonunda yer alan boşlukları silme.*/
