package interfaces;

public class CustomerManager {
  
	private ICustomerDal customerDal; 
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
		
	
	public void Add() {
	//İş kodları bu kısıma yazılır
	 customerDal.Add();
}
}
