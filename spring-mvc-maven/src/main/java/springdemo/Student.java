package springdemo;

import java.util.LinkedHashMap;

public class Student {

    private String firstName, lastName, country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;

    private String[] operatingSystems;

    public Student() {

        countryOptions = new LinkedHashMap<>();

        countryOptions.put("TR", "Turkey");
        countryOptions.put("HUN", "Hungary");
        countryOptions.put("POL", "Poland");
        countryOptions.put("BR", "Brazil");
        countryOptions.put("USA", "United States of America");

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
