package day16Assignment;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zipCode;
    String phoneNumber;

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zipCode,
			String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

    @Override
	public String toString() {
		return "FirstName=" + firstName + ", LastName=" + lastName + ", Address=" + address + ", city="
				+ city + ", State=" + state + ", ZipCode=" + zipCode + ", PhoneNumber=" + phoneNumber;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
    }

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
