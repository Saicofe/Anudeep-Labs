package lab1;
import java.util.Scanner;

class Invoice {
    //data members
    String invoiceId;
    double invoicePrice;
    String vendorName;
    String invoiceName;
    String location;
//default constructer
    public Invoice() {
    }
    // to add another one invoice.creating an another method to take input from user.

    public void addInvoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter invoiceId: ");
        this.invoiceId = input.next();
        System.out.print("Enter invoicePrice: ");
        this.invoicePrice = input.nextDouble();
        System.out.print("Enter vendorName: ");
        this.vendorName = input.next();
        System.out.print("Enter invoiceName: ");
        this.invoiceName = input.next();
        System.out.print("Enter location: ");
        this.location = input.next();
    }
//for displaying
    public void displayInvoice() {
        System.out.println("Invoice ID: " + this.invoiceId);
        System.out.println("Invoice Price: " + this.invoicePrice);
        System.out.println("Vendor Name: " + this.vendorName);
        System.out.println("Invoice Name: " + this.invoiceName);
        System.out.println("Location: " + this.location);
    }

    public static void main(String[] args) {
        //taking no of invoices from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of invoices (n): ");
        int n = input.nextInt();
     //creating an array
        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            invoices[i] = new Invoice();
            System.out.println("Enter details for Invoice " + (i + 1) + ":");
            invoices[i].addInvoice();
        }

        System.out.println("All Invoices:");
        for (int i = 0; i < n; i++) {
            System.out.println("Invoice " + (i + 1) + ":");
            invoices[i].displayInvoice();
        }
    }
}
