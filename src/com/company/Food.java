package com.company;

public class Food {
    private String Name ;
    private int Price;
    private int quantity;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailabilitystok() {
        return Availabilitystok;
    }

    public void setAvailabilitystok(int availabilitystok) {
        Availabilitystok = availabilitystok;
    }

    private int Availabilitystok;
}
