/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurement;

import java.util.Date;

/**
 *
 * @author Hp
 */
public class Receipt {

    private Date date;
    private int receipt_no;
    private String Signature;
    private Employee Customer;

    Receipt(Employee obj) {
        this.date = new Date();
        this.receipt_no = 0;
        this.Signature = "";
        this.Customer = obj;
    }

    // Setters 
    public void setname(int receipt_no) {
        this.receipt_no = receipt_no;

    }

    public void setname(String Signature) {
        this.Signature = Signature;

    }
    public void PrintReceipt() {
        
        
        System.out.println("Date:" + date); 
        System.out.println("Receipt.no:" + receipt_no );
        System.out.println("Signature:" + Signature);
        System.out.println("Customer:" + Customer);
        Customer.Print();
        
        
    }

   
}
