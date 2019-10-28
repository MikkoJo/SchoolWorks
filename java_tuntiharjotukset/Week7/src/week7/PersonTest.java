package week7;

public class PersonTest {

	public static void main(String[] args) {

		IPerson p1 = new Person("Matti", 34, "matti@example.com", "23051987");
		IPerson p2 = new Person("Jussi", 23, "jussi@example.com", "03121999");
		IPerson p3 = new Person();
		
		p3.setName("Tero");
		p3.setAge(22);
		p3.setEmail("tero@example.com");
		p3.setBirthDate("04102004");
		
		Address a1 = new Address("Testikuja 6 D", "00510", "Helsinki", "Koti");
		Address a2 = new Address("Kalliotie 12 F", "02630", "Espoo", "Työ");
		Address a3 = new Address();
		a3.setStreetAddress("Mäkitie 34 A1");
		a3.setZipCode("00150");
		a3.setCity("Helsinki");
		a3.setType("Koti");
		
		PhoneNumber pn1 = new PhoneNumber("358", "0501234568", "Koti");
		PhoneNumber pn2 = new PhoneNumber("372", "041234568", "Työ");
		PhoneNumber pn3 = new PhoneNumber("358", "0505681281", "Koti");
		PhoneNumber pn4 =new PhoneNumber();
		pn4.setCountryCode("372");
		pn4.setNumber("0501169814");
		pn4.setType("Koti");
		
		CodingSkill cs1 = new CodingSkill("Java", 13);
		CodingSkill cs2 = new CodingSkill("C#", 9);
		CodingSkill cs3 = new CodingSkill("Python", 10);
		CodingSkill cs4 = new CodingSkill("C++", 13);
		CodingSkill cs5 = new CodingSkill();
		
		cs5.setName("Basic");
		cs5.setLevel(15);

		IPerson p4 = new Person("Jussi", 23, "jussi@example.com", "03121999", a3, pn4, cs5);

		System.out.println(p3);
		p3.setAddress(a1);
		p3.setPhonenumber(pn1);
		p3.setPhonenumber(pn2);
		p3.setCodingSkill(cs1);
		System.out.println(p3);
		System.out.println(p4);
		
	}

}
