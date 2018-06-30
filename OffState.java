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
public class OffState implements State{
    String def;

    @Override
    public void action(EditState estate, String act) {
      
       
        
        def=act;
        estate.setState(this);
    
    }

    @Override
    public void result() {
      
      System.out.println(def);

    }

    
    
}
