/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author tanvir
 */
public interface SoftDrink {
    
    
    float getCost();
    void setCost(float cost);
    void add(int a);
    void sub(int a);
    int num_of_drink();
    String getName();
    void reset();
    int getsold();
    float getprofit();
    
}
