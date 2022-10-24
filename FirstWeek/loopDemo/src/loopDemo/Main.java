package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
        System.out.println("Döngü Bitti");

        //bu döngüde 10'dan küçük olan sayılar yazılacaktır
	    for(int i=1;i<10;i++) {
	    	System.out.println(i);
	    	
	    }
	    System.out.println("Döngü Bitti");
  
	    //bu döngüde tek sayılar yazılacaktır
	    for(int i=1;i<10;i+=2) {
	    	System.out.println(i);
	    }
	    System.out.println("Döngü Bitti");
	        
	    //bu döngüde çift sayılar yazılacaktır 
	    for(int i=2;i<10;i+=2) {
	    	System.out.println(i);
	    } 
	    System.out.println("Döngü Bitti");
	}
} 