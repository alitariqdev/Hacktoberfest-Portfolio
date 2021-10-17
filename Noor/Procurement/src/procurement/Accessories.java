/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurement;

/**
 *
 * @author Hp
 */
public class Accessories { 

    private String name_of_item;
    private int count_of_item;
    private int category_of_item;

    // 3 categories
    // 1 For Eatables, 2 For Electronics, 3 for Stationary
    Accessories(String name_of_item, int count_of_item, int category_of_item) {
        this.name_of_item = name_of_item;
        this.count_of_item = count_of_item;
        this.category_of_item = category_of_item;
    }    

    // Setters 
    public void setname_of_item(String name_of_item) {
        this.name_of_item = name_of_item;

    }

    public void setcount_of_item(int count_of_item) {
        if (category_of_item >= 10) {
            this.count_of_item = count_of_item;
        } else {
            System.out.println("Invalid Input");

        }
    }

    public void setcategory_of_item(int category_of_item) {
        if (category_of_item >= 1 && category_of_item <= 3) {
            this.category_of_item = category_of_item;
        } else {

            System.out.println("Invalid Input");
        }
    }

    public String getname_of_item() {
        return name_of_item;
    }

    public int getcount_of_item() {
        return count_of_item;
    }

    public int getcategory_of_item() {
        return category_of_item;
    }
    
    public void Print() {
       
       System.out.println("Name Of Item:" + name_of_item);
       System.out.println("Count Of Item:" + count_of_item);
       System.out.println("Category Of Item:" + category_of_item);
       
   }

}
