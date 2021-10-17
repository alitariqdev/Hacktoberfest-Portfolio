/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author Ehsaan
 */
public class Task2 {

    static Set set = new HashSet();
    static Iterator iterator = set.iterator();

    public static boolean validateName(String name) {
        boolean flag = false;
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) == ' ')) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;

    }

    public static Set saveData(String s) {
        set.add(s);
        return set;
    }

    public static void view() {
        iterator = set.iterator();
        int count = 0;
        System.out.println("---- Elements of Set ----");
        while (iterator.hasNext()) {
            System.out.println((count+1)+".  "+iterator.next());
        }
        System.out.println("---- Elements of Set ----");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String select = "";
        while (!select.equals("0")) {
            input = new Scanner(System.in);
            String menu = String.format("%50s%s%s%s%s", "Main Menu\n", "1.   Add String\n", "2.   View String\n", "0.   Exit\n\n", "Your Option: ");
            System.out.print(menu);
            select = input.next();
            switch (select) {
                case "1":
                    input = new Scanner(System.in);
                    System.out.print("Enter Name: ");
                    String string = input.nextLine();
                    if (validateName(string) == true) {
                        saveData(string);
                        System.out.println("Name Saved in Set, Successfully");
                    } else {
                        System.out.println("Invalid String");
                    }
                    break;
                case "2":

                    System.out.println("Entered");
                    view();
                    break;
                case "0":
                    break;
                default:
                    System.out.print("invalid ");
                    break;
            }
        }

    }

}
