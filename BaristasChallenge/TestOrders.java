package BaristasChallenge;
import java.util.ArrayList;

public class TestOrders{
    public static void main(String[] args) {
        
        //****************** MENU ITEMS ********************//
        Item item1 = new Item("mocha", 2.0);
        Item item2 = new Item("latte", 2.5);
        Item item3 = new Item("drip coffee", 3.5);
        Item item4 = new Item("capuccino", 3.0);
        
        // Create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order
        Order order3 = new Order("John");
        Order order4 = new Order("Paul");
        Order order5 = new Order("George");

        
        /*
         * Add at least 2 items to each of the orders using the addItem method you wrote, for
         * example, to add item1 to order3 you would need to call the addItem method from the
         * order3 instance like so: order3.addItem(item1);
         */

         order1.addItem(item2);
         order1.addItem(item4);

         order2.addItem(item1);
         order2.addItem(item3);

         order3.addItem(item1);
         order3.addItem(item2);

         order4.addItem(item3);
         order4.addItem(item4);

         order5.addItem(item1);
         order5.addItem(item4);


        /*
        * Test the results and the display method by calling the display method on all of your 
        * orders, like so: order3.display(); 
        */

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        /*
         * Test your getStatusMessage functionality by setting some orders to ready and
         * printing the messages for each order.
         */

        // Remarks: Comment out the setReady method to initialize ready variable to false

        order1.setReady(true);
        // System.out.println(order1.getStatusMessage());

        order2.setReady(true);
        // System.out.println(order2.getStatusMessage());

        order3.setReady(true);
        // System.out.println(order3.getStatusMessage());

        order4.setReady(true);
        // System.out.println(order4.getStatusMessage());

        order5.setReady(true);
        // System.out.println(order5.getStatusMessage());

        // Implement the getOrderTotal method within the Order class
        // Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

    }
}