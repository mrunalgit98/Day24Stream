package com.stream;



import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static ArrayList<AddressSystem> list = new ArrayList<AddressSystem>();

    public void AddContactsDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name  ");
        String firstName = sc.nextLine();
        System.out.println("Enter the Last Name  ");
        String lastName = sc.nextLine();
        System.out.println("Enter the City ");
        String city = sc.nextLine();
        System.out.println("Enter the Zip Code ");
        String zip = sc.nextLine();
        System.out.println("Enter the Phone Number ");
        String phoneNumber = sc.nextLine();

        AddressSystem details = new AddressSystem(firstName, lastName,  city, zip, phoneNumber);
        list.add(details);
        details.display();
    }



    private void checkDuplicate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name to check duplicate");
        String name1=sc.nextLine();
        Stream<AddressSystem> check=list.stream()  //optional oftype boolean duplicate
                .filter(i->i.getFirstName()
                        .equals(name1));
        check.forEach(str-> System.out.println("duplicate present"));

    }
    public void searchByCity() {
        List<AddressSystem> collect = list.stream()
                .filter(p -> p.getCity()
                .equalsIgnoreCase(p.getCity()))
                .collect(Collectors.toList());
        for (AddressSystem contact : collect) {
            System.out.println("Search result:  Firstname - " + contact.getFirstName() +"lastname " + contact.getLastName()+" city " + contact.getCity()+"phone number" +contact.getPhoneNumber());
        }
    }
    public void contactsCount() {
        System.out.println("Enter Name of City to get count of Contacts across city ");
        Scanner scan=new Scanner(System.in);
        String nameCityState = scan.next();
        var wrapper = new Object() {int count=0;};
        list.stream().filter(contactList -> contactList.getCity().equals(nameCityState));
        wrapper.count++;
        System.out.println("Number of contact persons in "+nameCityState+" is : "+wrapper.count);
    }



    public static void main(String[] args) {

        Main book1=new Main();
        Main book2=new Main();

        System.out.println("Welcome to address Book");

        book1.AddContactsDetails();
        book2.AddContactsDetails();

        //book1.checkDuplicate();
       // book1.searchByCity();
//    book1.getPersonNameByCity();
        book1.contactsCount();
    }


}