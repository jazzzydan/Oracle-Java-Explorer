/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        final double tax = 0.2;
//        double total = 0.0;
        int measurement = 3;
        
        System.out.println("Welcome to Duke Choice Shop!");
        
        Customer c1 = new Customer("Pinky", 3);
//        c1.setName("Pinky");
//        c1.setSize("S");
        System.out.println("Customer is " + c1.getName() +", " + c1.getSize());     
        
        System.out.println("Minimum price is " + Clothing.MIN_PRICE);
        
        Clothing item1 = new Clothing("Blue Jacket", 20.90, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.50, "S");
        
        Clothing [] items = {item1, item2, new Clothing("Green Scarf", 5.00, "S"), new Clothing("Blue T-Shirt", 10.50, "S")};
        
//        item1.setDescription("Blue Jacket");
//        item1.setPrice((Double) 20.90);
                
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice((Double) 10.50);
//        item2.setSize("S");
        
//        items[2].setDescription("Green Scarf");
//        items[2].setPrice((Double) 5.00);
//        items[2].setSize("S");
        
//        items[3].setDescription("Blue T-Shirt");
//        items[3].setPrice((Double) 10.50);
//        items[3].setSize("S");
        
        // System.out.println("Item 1: " + item1.description + ", " + item1.price + ", " + item1.size);
        // System.out.println("Item 2: " + item2.description + ", " + item2.price + ", " + item2.size);
              
        // total = (item1.price + 2 * item2.price) * (1+tax);
        
        c1.setSize(measurement);
        
        c1.addItems(items);
        
        for (Clothing item : items) {
            System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());

        }
        
        int average = 0;
        int count = 0;
        
        for (Clothing item : c1.getItems()){
            if (item.getSize().equals("L")){
            count ++;
            average += item.getPrice(); // same as average = average + item.getPrice()
            }
        }
        
        try {
            average = (average == 0) ? 0 : average / count;
            // average = average / count;
            System.out.println("\nAverage price for " + count + " items is: " + average);
        } catch (ArithmeticException e) {
            
            System.out.println("\nNot posiible to divide by 0");
        }
        
        System.out.println("\nTotal: " + c1.getTotalClothingCost());
    }

//        alternative solution including array items numbers in print:

//        for (int idx = 0; idx < items.length; idx++) {
//            Clothing item = items[idx];
//            total = total + item.price * (1 + tax);
//            System.out.println("Item " + idx + ": " + item.description + ", " + item.price + ", " + item.size);
//        }

}
    

