/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurement;

import java.util.*;

/**
 *
 * @author Hp
 */
public class Employee {

    private String name;
    private String email;
    private String cell_no;
    private List<Accessories> ItemsBought;

    // Constructor 
    Employee(String name, String email, String cell_no) {
        this.name = name;
        this.email = email;
        this.cell_no = cell_no;   
    }

    // Setters 
    public void setname(String name) {
        this.name = name;

    }

    public void setemail(String email) {

        this.email = email;
    }

    public void setcell_no(String cell_no) {

        this.cell_no = cell_no;
    }

    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public String getcell_no() {
        return cell_no;
    }

    public void Print() {

        System.out.println("Name:" + name);
        System.out.println("Email:" + email);
        System.out.println("Cell-no:" + cell_no);

    }

    public void InsertItem(Accessories obj) {

        ItemsBought.add(obj);

    }
    

}
