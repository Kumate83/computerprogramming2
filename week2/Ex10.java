package comproweek2;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the invoice number: ");
        String invoice = input.next();
        System.out.print("Please enter date: ");
        String date = input.next();
        System.out.print("Please enter due date: ");
        String due = input.next();
        System.out.print("Please enter the customer name: ");
        String customer = input.next();

        // item1 //
        System.out.println("");
        System.out.print("Please enter the name of item1: ");
        String item1 = input.next();
        System.out.print("Please enter the quantity of item 1: ");
        int item1q = input.nextInt();
        System.out.print("Please enter the unit price of item 1: ");
        float price1 = input.nextFloat();
        float total1 = price1 * item1q;

        System.out.println("");
        System.out.print("Please enter the name of item2: ");
        String item2 = input.next();
        System.out.print("Please enter the quantity of item 2: ");
        int item2q = input.nextInt();
        System.out.print("Please enter the unit price of item 2: ");
        float price2 = input.nextFloat();
        float total2 = price2 * item2q;

        System.out.println("");
        System.out.print("Please enter the name of item3: ");
        String item3 = input.next();
        System.out.print("Please enter the quantity of item 3: ");
        int item3q = input.nextInt();
        System.out.print("Please enter the unit price of item 3: ");
        float price3 = input.nextFloat();
        float total3 = price3 * item3q;

        System.out.format("\nInvoice No.: %S", invoice);
        System.out.format("\t \t \t \tDate: %S", date);
        System.out.format("\nCustomer: %s", customer);
        System.out.format("\t \t \t      Due Date: %S", due);
        System.out.println("\n\n# | Item Name \t |\tUnit Price | \t Quantity  |Total Price");
        System.out.println("----------------------------------------------------------------");
        System.out.format("1 | %s \t | \t   %.2f| \t \t %d | \t%.2f", item1, price1, item1q, total1);
        System.out.format("\n2 | %s \t | \t    %.2f| \t \t%d | \t%.2f", item2, price2, item2q, total2);
        System.out.format("\n3 | %s \t | \t     %.2f| \t \t %d | \t %.2f", item3, price3, item3q, total3);
        System.out.println("\n----------------------------------------------------------------");

        float amount = total1 + total2 + total3;
        float vat = (float) (amount * 7 / 100);
        float amountDue = amount + vat;
        System.out.format(" \t \t \t \t \tTotal Amount :  %.2f", amount);
        System.out.format("\n \t \t \t \t \t \t Vat :   %.2f", vat);
        System.out.format("\n \t \t \t \t \t Amount Due  :  %.2f", amountDue);
        System.out.println("\n----------------------------------------------------------------");
        System.out.println("");
    }

}
