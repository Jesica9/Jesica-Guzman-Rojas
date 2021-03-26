/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uptlax.PracticaSerializacion;

import java.util.ArrayList;

/**
 *
 * @author Jesica Guzmán
 */
public class Persona {
    //Variables de clase
    private String _id;
    private int index;
    private String guid;
    private boolean isActive;
    private String balance;
    private String picture;
    private int age;
    private String eyeColor;
    private Name name;
    private String company;
    private String email;
    private String phone;
    private String address;
    private String about;
    private String registered;
    private String latitude;
    private String longitude;
    private String[] tags;
    private ArrayList<Friend> friends;
    private String greeting;
    private String favoriteFruit;
    
    //Constructor vacio
    public Persona(){
          this._id = "";
        this.index = 0;
        this.guid = "";
        this.isActive = false;
        this.balance = "";
        this.picture = "";
        this.age = 0;
        this.eyeColor = "";
        this.name = new Name();
        this.company = "";
        this.email = "";
        this.phone = "";
        this.address = "";
        this.about = "";
        this.registered = "";
        this.latitude = "";
        this.longitude = "";
        this.tags = new String[1];
        this.friends = new ArrayList<Friend>(); 
        this.greeting = "";
        this.favoriteFruit = "";
    }

    public String getId() {
        return _id;
    }

    public int getIndex() {
        return index;
    }

    public String getGuid() {
        return guid;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public String getBalance() {
        return balance;
    }

    public String getPicture() {
        return picture;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Name getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getAbout() {
        return about;
    }

    public String getRegistered() {
        return registered;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String[] getTags() {
        return tags;
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getFavoriteFruit() {
        return favoriteFruit;
    }
    
}
