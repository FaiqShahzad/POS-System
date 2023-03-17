/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.system;

import java.util.*;

/**
 *
 * @author Faiq Shahzad
 */
public class Transaction {

    LinkedList<Item> orderItems;

    public Transaction() {
        orderItems = new LinkedList<Item>();
    }

    public LinkedList<Item> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(LinkedList<Item> orderItems) {
        this.orderItems = orderItems;
    }

    public void addItem(Item item) {
        orderItems.add(item);
    }

    public void removeItem(int barcode) {
        for (Item i : orderItems) {
            if (i.getBarCode() == barcode) {
                orderItems.remove(i);
            }
        }
    }

    public float calculateTotal() {

        float total = 0.f;

        for (Item i : orderItems) {
            total += i.getPrice() * i.getQuantity();
        }

        return total;
    }

    public float calculateTotalWithGST() {

        float total = 0.f;

        for (Item i : orderItems) {
            total += i.getPrice() * i.getQuantity();
        }

        total *= 1.16;

        return total;
    }

    public int calculateTotalItems() {

        int items = 0;

        for (Item i : orderItems) {
            items += i.getQuantity();
        }

        return items;
    }

    public Item searchItem(int barcode) {
        for (Item i : orderItems) {
            if (i.getBarCode() == barcode) {
                return i;
            }
        }

        return null;
    }

    public void performTransaction() {

    }

    public void printOrder() {
        System.out.printf("--Order Details--\n");

        for (Item i : orderItems) {
            i.printItemDetails();
        }

        System.out.printf("Total Price: %f\n", calculateTotal());
    }
}
