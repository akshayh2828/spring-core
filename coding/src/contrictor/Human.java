package contrictor;

public class Human 
{
	String firstName; 
	String middleName;
	String lastName;
	int noOfLegs; int noOfHands; 
	int age; 
	public Human(String firstName, String middleName, String lastName, int noOfLegs, int noOfHands, int age)
	{ 
	this.firstName = firstName;
	this.middleName = middleName; 
	this.lastName = lastName; 
	this.noOfLegs = noOfLegs; 
	this.noOfHands = noOfHands;
	this.age = age; 
	}
	public Human(String firstName, String middleName, String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName; 
		this.lastName = lastName; 
		
	}
	public Human(int noOfLegs, int noOfHands, int age)
	{
		this.noOfLegs = noOfLegs; 
		this.noOfHands = noOfHands;
		this.age = age; 

		
	}
	
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public int getNoOfHands() {
		return noOfHands;
	}
	public void setNoOfHands(int noOfHands) {
		this.noOfHands = noOfHands;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", noOfLegs="
				+ noOfLegs + ", noOfHands=" + noOfHands + ", age=" + age + "]";
	}
	


}
