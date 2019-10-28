package week7;

import java.util.ArrayList;
import java.util.Arrays;

public class Person implements IPerson {
	
	private String name;
	private int age;
	private String email;
	private String birthDate;
	private ArrayList<Address> address;
	private ArrayList<PhoneNumber> phonenumber;
	private ArrayList<CodingSkill> coding;
	
	public Person() {
		this.address = new ArrayList<Address>();
		this.phonenumber = new ArrayList<PhoneNumber>();
		this.coding = new ArrayList<CodingSkill>();
	}

	public Person(String name, int age, String email, String birthDate) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.birthDate = birthDate;
		this.address = new ArrayList<Address>();
		this.phonenumber = new ArrayList<PhoneNumber>();
		this.coding = new ArrayList<CodingSkill>();
	}

	public Person(String name, int age, String email, String birthDate,
			Address addr, PhoneNumber phone, CodingSkill code) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.birthDate = birthDate;
		this.address = new ArrayList<Address>();
		this.phonenumber = new ArrayList<PhoneNumber>();
		this.coding = new ArrayList<CodingSkill>();
		this.address.add(addr);
		this.phonenumber.add(phone);
		this.coding.add(code);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		if(birthDate.matches("\\d{8}")) {
			this.birthDate = birthDate;
		}
	}

//	public Address getAddress() {
//		return address.;
//	}

	public void setAddress(Address address) {
		this.address.add(address);
	}

//	public PhoneNumber getPhonenumber() {
//		return phonenumber;
//	}

	public void setPhonenumber(PhoneNumber phonenumber) {
		this.phonenumber.add(phonenumber);
	}

	public CodingSkill[] getCodingSkills() {
		return (CodingSkill[])coding.toArray();
	}

	public CodingSkill getCodingSkill(String name) {
		for(CodingSkill cs: coding) {
			if(cs.getName() == name) {
				return cs;
			}
		}
		return new CodingSkill();
	}
	public void setCodingSkill(CodingSkill coding) {
		this.coding.add(coding);
	}
	
	public void setCodingSkills(CodingSkill[] coding) {
		this.coding.addAll(Arrays.asList(coding));
	}

	public void updateCodingSkill(String name, int grade) {
		for(CodingSkill cs: coding) {
			if(cs.getName() == name) {
				cs.setLevel(grade);
			}
		}
	}

	public void removeCodingSkill(String name) {
		for(CodingSkill cs: coding) {
			if(cs.getName() == name) {
				coding.remove(cs);
			}
		}
	}

	@Override
	public String toString() {
		return name + "\n" + age + "\n" + birthDate + "\n" + email + (phonenumber != null ? "\n" + phonenumber : "") + 
			   (address != null ? "\n" + address : "") + 
			   (coding != null ? "\n" + coding : "") ; 
	}
	
}
