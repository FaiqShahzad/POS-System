/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.system;

/**
 *
 * @author Faiq Shahzad
 */
public class Item {

    int barcode;
    String name;
    float price;
    int quantity;
    String company;

    public Item(int barCode, String name, float price, int quanity, String company) {
        this.barcode = barCode;
        this.name = name;
        this.price = price;
        this.quantity = quanity;
        this.company = company;
    }

    public int getBarCode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCompany() {
        return company;
    }

    public void setBarCode(int barCode) {
        this.barcode = barCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void printItemDetails() {
        System.out.println("Barcode: " + barcode + " Item Name: " + name + " Item Price: " + price + " Quantity: " + quantity + " Company: " + company);
    }
}
