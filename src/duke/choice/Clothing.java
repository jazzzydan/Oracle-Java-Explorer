/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class Clothing implements Comparable <Clothing> {
    
    private String description;
    private Double price;
    private String size = "M";
    
    public static final double MIN_PRICE = 10.00;
    public static final double TAX_RATE = 0.20;

    public Clothing(String description, Double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }
   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(Double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
        return getDescription() + ", " + getPrice() + ", " + getSize();
    }
    
    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
}
