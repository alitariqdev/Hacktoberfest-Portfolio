//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.ListIterator;
//import java.util.Scanner;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// *
// * @author Ehsaan
// */
//public class Task1a {
//
//    static ArrayList<Product> list = new ArrayList<>();
//    static ListIterator iterator = list.listIterator();
//
//    public static void goToFirst() {
//        while (iterator.hasPrevious()) {
//            iterator.previous();
//        }
//    }
//
//    public static boolean addProduct(Product product) {
//        while (iterator.hasNext()) {
//            iterator.next();
//        }
//
//        if (searchProduct(product) == false) {
//            iterator.add(product);
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean deleteProduct(Product product) {
//        goToFirst();
//        while (iterator.hasNext()) {
//            Product getProduct = (Product) iterator.next();
//            if (getProduct.getCategory().equals(product.getCategory()) && getProduct.getProductName().equals(product.getProductName())) {
//                iterator.remove();
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void updateProduct(Product product, Product upProduct) {
//        goToFirst();
//        while(iterator.hasNext())
//        {
//            Product getProduct = (Product) iterator.next();
//            if(getProduct.getCategory().equals(product.getCategory()) && getProduct.getProductName().equals(product.getProductName()))
//            {
//                upProduct.setProductId(getProduct.getProductId());
//                iterator.set(upProduct);
//                break;
//            }
//        }
//    }
//
//    public static boolean searchProduct(Product product) {
//        goToFirst();
//        while (iterator.hasNext()) {
//            Product search = (Product) iterator.next();
//            if (search.getCategory().equals(product.getCategory()) && search.getProductName().equals(product.getProductName())) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void viewProducts() {
//        goToFirst();
//        String products = String.format("%-20s%-30s%-30s\n", "Product ID", "Product Name", "Product Catogory");
//        for (int i = 0; i < 70; i++) {
//            products = products + "-";
//        }
//        products = products + "\n\n";
//        while (iterator.hasNext()) {
//            Product product = (Product) iterator.next();
//            products = products + String.format("%-20s%-30s%-30s\n", product.getProductId(), product.getProductName(), product.getCategory());
//        }
//        products = products + "\n";
//        for (int i = 0; i < 70; i++) {
//            products = products + "-";
//        }
//        products = products + "\n";
//        System.out.print(products);
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        String select = "";
//        String name = "";
//        String catogory = "";
//        int id = 0;
//        Scanner input = new Scanner(System.in);
//
//        while (!select.equals("0")) {
//            String menu = String.format("%50s%30s   %30s   %30s  %30s%24s%25s", "Main Menu\n", "1.   Add Product\n", "2.   Delete Product\n", "3.   Update Product\n", "4.   View Products\n", "0.   Exit\n\n", "Your Option: ");
//
//            System.out.print(menu);
//            select = input.next();
//            switch (select) {
//                case "1":
//
//                    input = new Scanner(System.in);
//                    System.out.print("Enter the Name of the Product:- ");
//                    name = input.nextLine();
//                    System.out.print("Enter the Catogory of the Product:- ");
//                    catogory = input.nextLine();
//                    id = ++id;
//                    Product product = new Product(catogory, name, id);
//                    if (addProduct(product) == true) {
//                        System.out.println("Product has Been Added Successfully");
//                    } else {
//                        System.out.println("Product is already Added");
//                    }
//
//                    break;
//
//                case "2":
//                    input = new Scanner(System.in);
//                    System.out.print("Enter the Name of the Product:- ");
//                    name = input.nextLine();
//                    System.out.print("Enter the Catogory of the Product:- ");
//                    catogory = input.nextLine();
//                    product = new Product(catogory, name);
//                    if (deleteProduct(product) == true) {
//                        System.out.println("Product has been removed Successfully ");
//                    } else {
//                        System.out.println("Product not found");
//                    }
//
//                    break;
//                case "3":
//                    input = new Scanner(System.in);
//                    System.out.print("Enter the Name of the Product to be updated:- ");
//                    name = input.nextLine();
//                    System.out.print("Enter the Catogory of the Product to be updated:- ");
//                    catogory = input.nextLine();
//                    product = new Product(catogory, name);
//                    if (searchProduct(product) == true) {
//                        System.out.print("Enter the Name of the Product you you desire:- ");
//                        name = input.nextLine();
//                        System.out.print("Enter the Catogory of the Product you desire:- ");
//                        catogory = input.nextLine();
//                        Product upProduct = new Product(catogory, name);
//                        updateProduct(product, upProduct);
//                        System.out.print("Product has been Updated Successfully");
//                    }
//
//                    break;
//                case "4":
//                    viewProducts();
//                    break;
//                case "0":
//                    break;
//                default:
//                     System.out.print("Invalid Input!!!");
//                    break;
//            }
//        }
//    }
//
//}
//
//class Product {
//
//    private int productId;
//    private String category;
//    private String productName;
//
//    public Product(String category, String productName, int productId) {
//        this.category = category;
//        this.productName = productName;
//        this.productId = productId;
//    }
//
//    public Product(String category, String productName) {
//        this.category = category;
//        this.productName = productName;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public int getProductId() {
//        return this.productId;
//    }
//
//    public String getCategory() {
//        return this.category;
//    }
//
//    public String getProductName() {
//        return this.productName;
//    }
//}
