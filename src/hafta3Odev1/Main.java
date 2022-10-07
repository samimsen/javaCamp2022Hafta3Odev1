package hafta3Odev1;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * int sayi1 = 10; int sayi2 = 20; sayi1 = sayi2; sayi2 = 100;
		 * 
		 * System.out.println(sayi1);
		 * 
		 * int[] sayilar1 = {1,2,3}; int[] sayilar2 = {10, 20, 30}; sayilar1 = sayilar2;
		 * sayilar2[0] = 1000;
		 * 
		 * System.out.println(sayilar1[0]);
		 */
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("İstanbul");
		
		CustomerManager customerManager = new CustomerManager(customer,new TeacherCreditManager());
		customerManager.save();
		customerManager.delete();
		customerManager.giveCredit();
		
		Company company = new Company();
		company.setId(100);
		company.setCompanyName("Arçelik");
		company.setTaxNumber("1234");
		
		Person person = new Person();
		person.setNationalIdentity("12312312312");
		
		CustomerManager customerManager2 = new CustomerManager(new Company(),new MilitaryCreditManager());
		customerManager2.save();
		customerManager2.giveCredit();

	}

}
