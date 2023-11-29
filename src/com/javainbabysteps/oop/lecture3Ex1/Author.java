package com.javainbabysteps.oop.lecture3Ex1;
public class Author {
    private String firstName;
    private String familyName;
    private int nationalId;

    public Author() {
    }

    public Author(String firstName, String familyName, int nationalId) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", nationalId=" + nationalId +
                '}';
    }
}
