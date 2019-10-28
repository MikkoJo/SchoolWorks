package week8;

public class Henkilo implements Comparable<Henkilo> {

	@Override
	public int compareTo(Henkilo o) {
		int result = this.lastName.compareTo(o.lastName);
		if(result == 0) {
			return this.firstName.compareTo(o.firstName);
		}
		return result;
	}

	private String firstName;
	private String lastName;
	private String sSecurityNo;
	private int age;
	
	public Henkilo(String firstName, String lastName, String sSecurityNo, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sSecurityNo = sSecurityNo;
		this.age = age;
	}

	@Override
	public String toString() {
		return  firstName + " " + lastName + ", sSecurityNo: " + 
				sSecurityNo + ", age: " + age + "\n";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEtunimi() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getsSecurityNo() {
		return sSecurityNo;
	}

	public void setsSecurityNo(String sSecurityNo) {
		this.sSecurityNo = sSecurityNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode() + sSecurityNo.hashCode();
	}

	@Override
	public boolean equals(Object verrattava) {
		if((verrattava instanceof Henkilo) &&
			firstName.equals(((Henkilo)verrattava).getFirstName()) &&
			lastName.equals(((Henkilo)verrattava).getLastName()) &&
			sSecurityNo.equals(((Henkilo)verrattava).getsSecurityNo()))
			return true;
		else
			return false;

	}
	

	
}
