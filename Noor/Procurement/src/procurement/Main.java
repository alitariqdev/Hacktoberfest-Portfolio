/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurement;

import java.util.*;
import java.util.List;

/**
 *
 * @author Hp
 */
public class Main {

    boolean isValidateEmployeeName(String EmployeeName) {

        boolean flag = true;

        if (EmployeeName.length() <= 30) {
            for (int i = 0; i < EmployeeName.length(); i++) {
                if (!((EmployeeName.charAt(i) >= 'a' && EmployeeName.charAt(i) <= 'z')
                        || (EmployeeName.charAt(i) >= 'A' && EmployeeName.charAt(i) <= 'Z')
                        || (EmployeeName.charAt(i) == ' '))) {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    static boolean isValidatecell_no(String cell_no) {
        for (int i = 0; i <= 11; i++) {

        }
        boolean flag = false;
        if (cell_no.charAt(0) == '0' && cell_no.charAt(1) == '3') {
            if ((cell_no.charAt(2) >= '0' || cell_no.charAt(2) <= '9') && (cell_no.charAt(3) >= '0' || cell_no.charAt(3) <= '9')) {
                if ((cell_no.charAt(4) >= '0' || cell_no.charAt(4) <= '9') && ((cell_no.charAt(5) >= '0' || cell_no.charAt(5) <= '9') || (cell_no.charAt(6) >= '0' || cell_no.charAt(6) <= '9'))) {
                    if ((cell_no.charAt(7) >= '0' || cell_no.charAt(7) <= '9') && ((cell_no.charAt(8) >= '0' || cell_no.charAt(8) <= '9') || (cell_no.charAt(9) >= '0' || cell_no.charAt(9) <= '9'))) {
                        {
                            if (cell_no.charAt(10) >= '0' || cell_no.charAt(10) <= '9') {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    // Objects Of Accesssories
    // Category 1 is For eatables
    Accessories A1 = new Accessories("Coffee", 10, 1);
    Accessories A2 = new Accessories("Tea", 10, 1);
    Accessories A3 = new Accessories("Sandwich", 10, 1);
    Accessories A4 = new Accessories("Biscuit", 10, 1);
    Accessories A5 = new Accessories("Nimko", 10, 1);
    Accessories A6 = new Accessories("Juice", 10, 1);
    Accessories A7 = new Accessories("Chips", 10, 1);
    // Category 2 is For Electronics
    Accessories A8 = new Accessories("Laptop", 10, 2);
    Accessories A9 = new Accessories("DataCable", 10, 2);
    Accessories A10 = new Accessories("USB", 10, 2);
    Accessories A11 = new Accessories("Adaptor", 10, 2);
    Accessories A12 = new Accessories("Projector", 10, 2);
    Accessories A13 = new Accessories("Charger", 10, 2);
    Accessories A14 = new Accessories("FlashDrive", 10, 2);
    // Category 3 is For Stationary
    Accessories A15 = new Accessories("Pen", 10, 3);
    Accessories A16 = new Accessories("Marker", 10, 3);
    Accessories A17 = new Accessories("Notebook", 10, 3);
    Accessories A18 = new Accessories("StickyNotes", 10, 3);
    Accessories A19 = new Accessories("Stamp", 10, 3);
    Accessories A20 = new Accessories("Glue", 10, 3);

    Employee E1 = new Employee("Ali", " n@gmail.com", " 2838293");
    List<Employee> ListofEmployees = new ArrayList<Employee>(10);
//    ListofEmployees.add(E1);
}
