package com.footballstandings.DTO;



public class CountryDTO {
    private String country_id;
    private String country_name;

    private String country_logo;

    // Getters and setters
    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_logo() {
        return country_logo;
    }

    public void setCountry_logo(String country_logo) {
        this.country_logo = country_logo;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id='" + country_id + '\'' +
                ", country_name='" + country_name + '\'' +
                '}';
    }
}
