package sg.edu.rp.c346.contactslist;

/**
 * Created by 16038911 on 23/7/2018.
 */

public class Contacts {
    private String name;
    private int countryCode;
    private int phoneNo;

    public Contacts(String name, int countryCode, int phoneNo) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
