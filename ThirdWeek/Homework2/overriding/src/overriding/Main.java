package overriding;

public class Main {

	public static void main(String[] args) {
	   BaseKrediManager[] krediManager = new BaseKrediManager[]{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
	   
   
	for(BaseKrediManager krediManager1 : krediManager) {
    	System.out.println(krediManager1.hesapla(1000));
	}
 }
}