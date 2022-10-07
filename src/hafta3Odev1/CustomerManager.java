package hafta3Odev1;

public class CustomerManager {
	
	private Customer customer;
	private CreditManager creditManager;
	
	public CustomerManager(Customer customer, CreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Kullanıcı kaydedildi.");
	}
	
	public void delete() {
		System.out.println("Kullanıcı silindi.");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		creditManager.save();
		System.out.println("Kredi verildi.");
	}

}
