//Name:Ajetunmobi Adam
// Assignment


	public class Native {

	private int identityNumber;
	
	private String name;

	private int phoneNumber;
	
	private String address; 

	public void setIdentityNumber(int identityNumber){
		this.identityNumber = identityNumber;
	}

	public int getIdentityNumber() {
		return identityNumber;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setAddress(String Address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
	public static void main(String... args) {

	Native cynthia= new Native();
	
	cynthia.setIdentityNumber(84889);
	cynthia.setName("MadamCynthia");
	cynthia.setPhoneNumber(214757);
	cynthia.setAddress("Begerlagos");
	
	System.out.println(cynthia.getIdentityNumber());
	System.out.println(cynthia.getName());
	System.out.println(cynthia.getPhoneNumber());
	System.out.println(cynthia.getAddress());
	

	}


}