package lab1;
public class Product {
        private int prdid;
        private String prddescription;
        private String batchcode;
        private double price;
        private double profit;
    
        public void addProduct(int prdid, String prddescription, String batchcode, double price) {
            this.prdid = prdid;
            this.prddescription = prddescription;
            this.batchcode = batchcode;
            this.price = price;
            displayProduct();
        }
    
        public double calculateProfit() {
            if (price >= 10000 && price <= 100000) {
                return 0.10 * price;
            } else if (price > 100000 && price <= 500000) {
                return 0.15 * price;
            } else if (price > 500000) {
                return 0.20 * price;
            }
            return 0.0;  
        }
    
        public void displayProduct() {
            System.out.println("Product ID: " + prdid);
            System.out.println("Product Description: " + prddescription);
            System.out.println("Batch Code: " + batchcode);
            System.out.println("Price: " + price);
            double calculatedProfit = calculateProfit();
            System.out.println("Profit: " + calculatedProfit);
        }
    
        public static void main(String[] args) {
            Product product = new Product();
            product.addProduct(1, "something", "172b", 75000.0);
        }
    }
