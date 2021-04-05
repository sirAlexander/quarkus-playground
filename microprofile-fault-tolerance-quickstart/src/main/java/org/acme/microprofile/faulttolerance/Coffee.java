package org.acme.microprofile.faulttolerance;

public class Coffee {

    public Integer id;
    public String name;
    public String countryOPfOrigin;
    public Integer price;

    public Coffee() {

    }

    public Coffee(Integer id, String name, String countryOPfOrigin, Integer price) {
        this.id = id;
        this.name = name;
        this.countryOPfOrigin = countryOPfOrigin;
        this.price = price;
    }
}
