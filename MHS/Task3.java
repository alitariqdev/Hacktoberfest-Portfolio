///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//import java.util.LinkedList;
//import java.util.ListIterator;
//import java.util.Scanner;
//
///**
// *
// * @author Ahsan
// */
//public class Task3 {
//
//    public static LinkedList<Integer> list1 = new LinkedList<>();
//    public static LinkedList<Integer> list2 = new LinkedList<>();
//
//    public static LinkedList<Integer> saveEven(int number) {
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 2; i <= number; i++) {
//            if (i % 2 == 0) {
//
//                list.addLast(i);
//            }
//        }
//        return list;
//    }
//
//    public static int printEven(int number) {
//        for (int num : list1) {
//            if (num == number) {
//                return num;
//            }
//        }
//        return 0;
//    }
//
//    public static LinkedList<Integer> displayEven() {
//        LinkedList<Integer> listEven = new LinkedList<>();
//        ListIterator<Integer> iterator = list1.listIterator();
//        System.out.println("\n\n");
//        while (iterator.hasNext()) {
//            int number = iterator.next();
//            listEven.add(number * 2);
//            System.out.println("Even number is: " + number);
//            System.out.println("Multiplied Even number is: " + number * 2);
//        }
//        System.out.println("\n\n");
//        return listEven;
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here        
//        Scanner input = new Scanner(System.in);
//        String select = "";
//        while (!select.equals("0")) {
//            System.out.print("1.   Enter Number to make list of even Numbers\n2.   Enter Number to Search from List1\n0.   Exit\n\nSelect: ");
//            select = input.next();
//            switch (select) {
//                case "1":
//                    boolean flag = false;
//
//                    try {
//                        while (flag == false) {
//                            input = new Scanner(System.in);
//                            System.out.print("Enter the Number greater than 2: ");
//                            int number = input.nextInt();
//                            if (number > 2) {
//                                list1 = saveEven(number);
//                                list2 = displayEven();
//                                flag = true;
//                            }
//
//                        }
//                    } catch (Exception ex) {
//                        System.out.print("Invalid input, Your Input Must be a number");
//
//                    }
//
//                    break;
//                case "2":
//                    input = new Scanner(System.in);
//                    try {
//                        System.out.print("Enter the Number to Search from list 1: ");
//                        int number = input.nextInt();
//                        number = printEven(number);
//                        if (number == 0) {
//                            System.out.println("Your Number not is Found");
//                        } else {
//                            System.out.println("Your Number is Found");
//                        }
//                        System.out.println("Number is : " + number+"\n\n");
//
//                    } catch (Exception ex) {
//                        System.out.print("Invalid input, Your Input Must be a number");
//                    }
//                    break;
//
//                case "0":
//                    break;
//                default:
//                    System.out.println("Invalid Input!!!");
//                    break;
//            }
//        }
//    }
//}
