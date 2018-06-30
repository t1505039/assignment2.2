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
public class EditState {
    
   private State state;

   public EditState(){
      state = null;
   }

   public void setState(State state){
      this.state = state;		
   }

   public State getState(){
      return state;
   }
    
    
    
    
    
    
}
