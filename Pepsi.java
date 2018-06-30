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
public class Pepsi implements SoftDrink{
    private static Pepsi pep=new Pepsi();
     private int ammount;
    private float cost;
    private String name;
     private float profit;
     private int sold;
    private Pepsi()
    {
        ammount=0;
        cost=10;
        name="Pepsi";
        sold=0;
        profit=0;
        
    }
    public static Pepsi getPepsi()
    {
        return pep;
    }
    @Override
    public float getCost() {
        
       return cost;
    }

    @Override
    public void setCost(float cost) {
        
        this.cost=cost;
      }

    @Override
    public void add(int a) {
      
        
        ammount+=a;
         if(ammount<0) ammount=0;
        
        
    }

    @Override
    public void sub(int a) {
       sold++;
       profit+=cost;
        ammount-=a;
        
        
    }

    @Override
    public int num_of_drink() {
        
       return ammount; 
        
        
        
    }

    @Override
    public String getName() {
       
    return name;

    }

     @Override
    public void reset() {
        profit=0;
        sold=0;
    
    }

    @Override
    public int getsold() {
       
     return sold;
    }

    @Override
    public float getprofit() {
        
    return profit;
    }
    
}
