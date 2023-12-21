/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class Customer {
    
    private String name;
    public Customer(String name, int measurement) {
        this.name = name;
        setSize (measurement);
    }
    
    private String size;
    private Clothing [] items;

    public void addItems (Clothing [] someItems) {
        items = someItems;
        }
    
    public Clothing [] getItems() {
        return items;
    }
    
    public double getTotalClothingCost() {
        
        double total = 0.00;

        for (Clothing item : items) {
//            if (c1.getSize().equals(item.getSize())) {
            total = total + item.getPrice();
//            if (total > 15) {
//                break;
//            }
//            }
        }

        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurement) {
                switch(measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }
}
