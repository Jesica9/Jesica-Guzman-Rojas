/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica13;

/**
 *
 * @author Jesica Guzmán
 */
public class Usuario {
    //Variables de clase
    private String _id;
    private boolean isActive;
    private String balance;
    private String picture;
    private int age;
    private String eyeColor;
    private String name;
    private String gender;
    private String company;
    private String email;
    private String phone;
    private String address;
    private String about;
    private String registered;
    private String latitude;
    private String longitude;
    
    //Constructor vacio
    public Usuario(){
        this._id="";
        this.isActive=false;
        this.balance="";
        this.picture="";
        this.age=0;
        this.eyeColor="";
        this.name="";
        this.gender="";
        this.company="";    
        this.email="";
        this.phone="";
        this.address="";
        this.about="";
        this.registered="";
        this.latitude="";
        this.longitude="";
    }
    //getters

    public String getId() {
        return _id;
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

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
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
    
}
