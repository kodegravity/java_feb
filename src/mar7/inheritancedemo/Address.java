package mar7.inheritancedemo;

public class Address {
    int streetNumber;
    String streetName;
    String city;
    String postCode;
    String province;
    String Country;

    public Address(int streetNumber, String streetName, String city, String postCode, String province, String country) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.postCode = postCode;
        this.province = province;
        Country = country;
    }
}
