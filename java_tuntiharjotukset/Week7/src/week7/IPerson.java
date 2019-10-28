package week7;

public interface IPerson {

	String getName();

	void setName(String name);

	int getAge();

	void setAge(int age);

	String getEmail();

	void setEmail(String email);

	String getBirthDate();

	void setBirthDate(String birthDate);

	void setAddress(Address address);

	void setPhonenumber(PhoneNumber phonenumber);

	CodingSkill[] getCodingSkills();

	CodingSkill getCodingSkill(String name);

	void setCodingSkill(CodingSkill coding);

	void setCodingSkills(CodingSkill[] coding);

	void updateCodingSkill(String name, int grade);

	void removeCodingSkill(String name);

	String toString();

}