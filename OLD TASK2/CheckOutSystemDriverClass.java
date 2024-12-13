import java.util.Scanner;
import java.util.ArrayList;

    class Product{
        String products;
        double unitPrice;
        int quantity;
        double productPrice;


    
        public Product(String products, int quantity, double unitPrice, double productPrice){
            this.products = products;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
            this.productPrice = unitPrice * quantity;



        }
        public void printProductCart(){
                System.out.printf("\t%s\t\t%d\t\t%.2f\t\t%.2f\n", products, quantity, unitPrice, productPrice);      




            
        }
        public double getProductPrice(){
            return productPrice;

        }



    
        
    }    
    public class CheckOutSystemDriverClass{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            ArrayList<Product> productCart = new ArrayList<>();


            
           
            System.out.println("Enter the name of Customer: ");
            String customerName = input.nextLine();
            System.out.print("Collected successfully\n\n");
           




            System.out.println("Enter the Cashier's name: ");
            String cashierName = input.nextLine();
            System.out.print("Collected successfully\n\n");




            System.out.println("Enter the number of product you would like to buy: ");
            int numberOfProducts = input.nextInt();
            input.nextLine();
            System.out.print("Collected successfully\n\n");




            for (int count = 0; count < numberOfProducts; count ++){
                System.out.println("Enter the name of product: " + (count + 1));
                String products = input.nextLine();
                System.out.print("Collected successfully\n\n");



                System.out.println("Enter the quantity of: " + products);
                int quantity = input.nextInt();
                input.nextLine();
                System.out.print("Collected successfully\n\n");



                System.out.println("Enter the unit price of: " + products);
                Double unitPrice = input.nextDouble();
                input.nextLine();
                System.out.print("Collected successfully\n\n");




                double productPrice = unitPrice * quantity;
                

                productCart.add(new Product(products, quantity, unitPrice, productPrice));
            
                
            }
            System.out.println("Here is your Product Cart");
            
           
            for (Product product : productCart){   
                      product.printProductCart();


            

             }
            double subTotalPrice = 0.0;
            for (Object product: productCart){
                Product value = (Product) product;
                subTotalPrice += value.getProductPrice();


            }
            System.out.printf("sub total price is % .2f:%n", subTotalPrice);


            double discountPrice = calculateDiscount(subTotalPrice);
            System.out.printf("discount is % .2f:%n", discountPrice);


            double vat = calculateValuedAddedTax(subTotalPrice);
            System.out.printf("VAT is % .2f:%n", vat);


            double billPrice = calculateBillTotal(subTotalPrice, vat, discountPrice);
            System.out.printf("Bill total is % .2f:%n", billPrice);
            System.out.println();

            
            System.out.println("Here is your Payment Invoice");
            System.out.println("\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION:\t312, HERBERT MACAULY WAY, SABO YABA, LAGOS.\nTEL:\t\t03293828343\nDATE:\t\t7th December, 2024\nTIME:\t\t8:45 am\nCASHIER'S NAME:\t" + cashierName + "\nCUSTOMER'S NAME:" + customerName);



            for (int i = 0; i < 80; i ++){
                System.out.print("=" + "");

                
            }
            System.out.println();


            System.out.println("\n\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
            for (int i = 0; i < 80; i ++){
                System.out.print("-" + "");

               
            }
            System.out.println();
            for (Product product : productCart){     
                product.printProductCart();
           }
            System.out.println();
            for (int i = 0; i < 80; i ++){
                System.out.print("-" + "");
            

            }
            System.out.println();


            System.out.printf("\t\t\t\tSub Total:\t\t%.2f%n\t\t\t\tDiscount:\t\t%.2f%n\t\t\t\tVAT @ 0.075:\t\t%.2f%n", subTotalPrice, discountPrice, vat);

            
            for (int i = 0; i < 80; i ++){
                System.out.print("=" + "");


            }
            System.out.println();
            

            System.out.printf("\t\t\t\tBill Total:\t\t%.2f%n", billPrice);


            for (int i = 0; i < 80; i ++){
                System.out.print("=" + "");


            }
            System.out.println();

            
            System.out.printf("\t\t\tTHIS IS NOT A RECEIPT, KINDLY PAY %.2f%n", billPrice);
    
            for (int i = 0; i < 80; i ++){
                System.out.print("=" + "");


            }
            System.out.println();

        
            while (true){

                System.out.printf("Pay the bill amount %.2f%n ", billPrice);
                double amount = input.nextDouble();


                if (amount >= billPrice){
                        double balance = amount - billPrice; 

                   
                        System.out.println("Transaction successful!\n");
                        

                        System.out.println("Here is your Receipt");
                        System.out.println("SEMICOLON STORES\nMAIN BRANCH\nLOCATION:\t312, HERBERT MACAULY WAY, SABO YABA, LAGOS.\nTEL:\t\t03293828343\nDATE:\t\t7th December, 2024\nTIME:\t\t8:45 am\nCASHIER'S NAME:\t" + cashierName + "\nCUSTOMER'S NAME:" + customerName);


                        for (int i = 0; i < 80; i ++){
                            System.out.print("=" + "");

                
                        }
                        System.out.println();


                        System.out.println("\n\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
                        for (int i = 0; i < 80; i ++){
                            System.out.print("-" + "");

               
                        }
                        System.out.println();
                        for (Product product : productCart){
                            product.printProductCart();


                        }
                        System.out.println();
                        for (int i = 0; i < 80; i ++){
                            System.out.print("-" + "");


                       }
                       System.out.println();


                       System.out.printf("\t\t\t\tSub Total:\t\t%.2f%n\t\t\t\tDiscount:\t\t%.2f%n\t\t\t\tVAT @ 0.075:\t\t%.2f%n", subTotalPrice, discountPrice, vat);

            
                       for (int i = 0; i < 80; i ++){
                            System.out.print("=" + "");


                      }
                      System.out.println();


                      System.out.printf("\t\t\t\tBill Total:\t\t%.2f%n\t\t\t\tAmount Paid:\t\t%.2f%n\t\t\t\tBalance:\t\t%.2f%n", billPrice, amount, balance);


                        for (int i = 0; i < 80; i ++){
                            System.out.print("=" + "");

                
                        }
                        System.out.println();


                        System.out.println("\t\tTHANK YOU FOR YOUR PATRONAGE");


                        for (int i = 0; i < 80; i ++){
                            System.out.print("=" + "");

                
                        }
                        System.out.println();


                      break;
                              
                }
                else{
                    System.out.printf("Incomplete payment. Your bill is %.2f\n", billPrice);
                   

                }
             

                    
             }
        
            

            }
            public static double calculateDiscount(double subTotalPrice){
                double percentageDiscount = 0.08;
                double discount = percentageDiscount * (subTotalPrice);
                return discount;  
                    

            }
            public static double calculateValuedAddedTax(double subTotalPrice){
                double percentageValuedAddedTax = 0.075;
                double valuedAddedTax = percentageValuedAddedTax * subTotalPrice;
                return valuedAddedTax;

             
            }
            public static double calculateBillTotal(double subTotalPrice, double vat, double discountPrice){
                double billTotal = subTotalPrice + vat - discountPrice;
                return billTotal;


            }
    
    }
            

           
        
        
    
         

    
