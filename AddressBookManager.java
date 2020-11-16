package day16Assignment;
import java.util.*;

public class AddressBookManager {
	static ArrayList<AddressBook>addressBook=new ArrayList<AddressBook>();

    public static void main (String [] args){
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
        	System.out.println("\n***********MENU*****************");
        	System.out.println("\n1.Add new person in Address Book\n2.Edit/Update Information\n3.Delete a record\n4.Sort Address Book by last name\n5.Display Entries in Address Book\n6.Quit");
        	System.out.println("Enter your choice :-[1-6]");
        	choice=sc.nextInt();
        	switch(choice) {
        	case 1: addPerson(sc);
        			break;
        	case 2: updatePerson(sc);
        		    break;
        	case 3: deletePerson(sc);
        			break;
        	case 4: sortByLastName();
        			break;
        	case 5: displayEntriesInAddressBook();
        			break;
        	case 6:System.exit(0);
        	default:System.out.println("Invalid Input!");
        	}
        }while(choice != 6 );
   }

    public static  void addPerson(Scanner sc) {
    	System.out.println("\nEnter first name :- ");
		sc.nextLine();
		String firstName=sc.nextLine();
		System.out.println("Enter last name :- ");
		String lastName=sc.nextLine();
		System.out.println("Enter address :- ");
		String address=sc.nextLine();
		System.out.println("Enter city :- ");
		String city=sc.nextLine();
		System.out.println("Enter state :- ");
		String state=sc.nextLine();
		System.out.println("Enter zip code :- ");
		String zipCode=sc.nextLine();
		System.out.println("Enter contact number :- ");
		String phoneNumber=sc.nextLine();
		AddressBook person=new AddressBook(firstName,lastName,address,city,state,zipCode,phoneNumber);
		addressBook.add(person);
		System.out.println(person);
    }

    public static void deletePerson(Scanner sc) {
    	sc.nextLine();
    	System.out.println("\nEnter name of person whose record is to be deleted:-");
    	String name=sc.nextLine();
    	int flag=0;
 	   	AddressBook personToRemove=null;
 	   	for (AddressBook person1 : addressBook) {
 	   		if (person1.getFirstName().equals(name)) {
 	   			personToRemove=person1;
 	   			flag=1;
 	   		}
 	   	}
 	   if (flag == 0) {
			System.out.println("This name does not exist!");
		}
 		addressBook.remove(personToRemove);

    }

    public static void sortByLastName() {
    	  Collections.sort(addressBook, (o1,o2) ->  o1.getLastName().compareTo(o2.getLastName()));
    	  System.out.println(" Address Book Sort by Last Name  :-");
       addressBook.forEach( System.out::println);
    }

    public static void displayEntriesInAddressBook() {
    	System.out.println("\nEntries in Address Book are:-\n");
    	for (AddressBook person_ : addressBook) {
    		System.out.println(person_);
    	    }
    }
    public static void updatePerson(Scanner sc) {
    	sc.nextLine();
    	System.out.println("\nEnter name of person whose details is to be updated:-");
    	String personName=sc.nextLine();
    	AddressBook personToUpdate=null;
    	int flag=0;
    	for (AddressBook person : addressBook) {
 	   		if (person.getFirstName().equals(personName)) {
 	   			personToUpdate=person;
 	   			flag=1;
 	   		}
    	}
 	 	if (flag == 0) {
 	   		System.out.println("This name does not exist!");	
 	   	}
 	 	else {
		System.out.println("Enter address :- ");
     	String address=sc.nextLine();
		personToUpdate.setAddress(address);
		System.out.println("Enter city :- ");
		String city=sc.nextLine();
		personToUpdate.setCity(city);
		System.out.println("Enter state :- ");
		String state=sc.nextLine();
		personToUpdate.setState(state);
		System.out.println("Enter zip code :- ");
		String zipCode=sc.nextLine();
		personToUpdate.setZipCode(zipCode);
		System.out.println("Enter contact number :- ");
		String phoneNumber=sc.nextLine();
		personToUpdate.setPhoneNumber(phoneNumber);
 	 	}
    }
}
