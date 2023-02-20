package com.mansidhaka.lil.learningspring.data;

import javax.persistence.*;

@Entity
@Table(name = "GUEST")
public class Guest {

    @Id //annotations
    @GeneratedValue(strategy = GenerationType.IDENTITY) // default for generated value
    @Column(name ="GUEST_ID") //Keep it same as schema
    private long guestid;
    @Column(name ="FIRST_NAME") //Keep it same as schema
    private String firstname;
    @Column(name ="LAST_NAME") //Keep it same as schema
    private String lastname;
    @Column(name ="EMAIL_ADDRESS") //Keep it same as schema
    private String emailaddress;
    @Column(name ="ADDRESS")
    private String address;
    @Column(name ="Country")
    private String country;
   @Column(name ="STATE")
   private String state;
   @Column(name ="PHONE_NUMBER")
   private String phonenumber;

    public long getGuestid() {
        return guestid;
    }

    public void setGuestid(long guestid) {
        this.guestid = guestid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestid=" + guestid +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", emailAddress='" + emailaddress + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phonenumber + '\'' +
                '}';
    }
}
