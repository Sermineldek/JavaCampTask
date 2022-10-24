package youtubeDemo;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer();
		customer.setName("Şermin");
		customer.setId(1);
		customer.setCity("İzmir");
		
		CustomerManager customerManager = new CustomerManager(new Company(),new MilitaryCreditManager());
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.setTaxNumber("12345678");
		company.setName("Apple");
		company.setId(100);
		
		CustomerManager customerManager2 = new CustomerManager(new Person(),new TeacherCreditManager());
		
		Person person = new Person();
		person.setName("Şermin");
		person.setId(5);
		person.setCity("Bostanlı");
		
		
	}
}
