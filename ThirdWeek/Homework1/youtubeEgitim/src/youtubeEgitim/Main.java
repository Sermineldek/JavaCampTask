package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		
		System.out.println(sayi1);
		
		int[] sayi3 = {1,2,3};
		int[] sayi4 = {10,20,30};
		sayi3 = sayi4;
		sayi4[0] = 100;
		
		System.out.println(sayi3[0]);
		
	}

}
