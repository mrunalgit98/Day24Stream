package com.stream;

public class AddressSystem {
    private String firstName = " ";
    private String lastName = " ";

    private String city = " ";
    private String zipcode = "";
    private String phoneNumber = " ";

    public AddressSystem(String firstName, String lastName,  String city,  String zipcode,
                         String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public  void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




    public String getZip() {
        return zipcode;
    }

    public void setZip(String zip) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNo) {
        this.phoneNumber = phoneNo;
    }



    public void display() {
        System.out.println(" ");
        System.out.println("First Name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("City Name = " + city);
        System.out.println("Zip Code = " + zipcode);
        System.out.println("Phone Number = " + phoneNumber);
    }


}