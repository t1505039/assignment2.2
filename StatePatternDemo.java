package mainpackage;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanvir
 */
public class StatePatternDemo {
    
    static void checker(SoftDrink sdrink,EditState estate)
    {
        float coin=0;
        float tk=0;
        OffState offstate;
        OnState onstate;
         Scanner sc = new Scanner(System.in);
        if(sdrink.num_of_drink()<=0)
         {
            offstate=new OffState();
            offstate.action(estate,"Insufficient "+sdrink.getName()+"  !!");
             
         }
         else
         {
             tk=sdrink.getCost();
           
            while(true){
            
             
                    
            
            System.out.println("Please give "+tk+"tk (0 for exit):"); 
            coin=sc.nextFloat();
            if(coin==0)
            {
                 offstate=new OffState();
                 offstate.action(estate,"Please take the money "+(sdrink.getCost()-tk) +"tk");
                  break;
            }
            else if(tk<coin)
            {
                onstate=new OnState();
                onstate.action(estate,"Please take the excess tk "+(coin-tk)+" and "+sdrink.getName());
                sdrink.sub(1);
              break;
            }
            else if(tk==coin)
            {
              onstate=new OnState(); 
              onstate.action(estate,"Please Take the "+ sdrink.getName());
              sdrink.sub(1);
              break;   
            }
            
            
            tk=tk-coin;
             }
         }
           
        
        
    }
    static void details(SoftDrink sdrink)
    {
         System.out.println(sdrink.getName()+" cost:"+sdrink.getCost()+" tk  ammount:"+sdrink.num_of_drink()+"  sold drinks: "+sdrink.getsold()+" profit :"+sdrink.getprofit());
                 
    }
    public static void main(String []args)
    {
        
        int a,coin=0;
         SoftDrink sdrink=null;
         String pass="1234";
         Scanner sc = new Scanner(System.in);
          EditState estate = new EditState();
         while(true){
      
       System.out.println("1.Access as a Admin:");
       System.out.println("Enter 2 for Coke");
       System.out.println("Enter 3 for Dew");
       System.out.println("Enter 4 for Pepsi");
       
        
       a=sc.nextInt();
       if(a>4||a<1) 
       {
           continue;
       }
       
       if(a==1)
       {
           int p,i=0;
           
           String pas=sc.next();
            
           if(pas.trim().compareTo(pass)==0)
           {
               
            while(true){
           System.out.println("-1 for reset 3 for details 4 for update");
           
               p=sc.nextInt();
              
                   if(p==3)
                   {
                       
                        sdrink=Coke.getCoke();
                        details(sdrink);
                              sdrink=Pepsi.getPepsi();
                              details(sdrink);
                       sdrink=Dew.getDew();
                       details(sdrink);

                       
                       
                       
                   }
                   else if(p==4){
                        System.out.println("0 for coke 1 for pepsi 2 for dew:");
           
                   p=sc.nextInt();
              
                   if(p==0)
                   {
                       sdrink=Coke.getCoke();
                   }
                   else if(p==1)
                   {
                       
                       sdrink=Pepsi.getPepsi();
                       
                   }
                   else if(p==2)
                   {
                       
                       sdrink=Dew.getDew();
                       
                   }
                   else continue;
                       
                   System.out.println("Cost:");
               p=sc.nextInt();
                   if(p<=0)continue;
                   sdrink.setCost(p);
                   System.out.println("Add:");
               p=sc.nextInt();
                   sdrink.add(p);
                   }
                   else if(p==-1)
                   {
                       System.out.println("0 for coke 1 for pepsi 2 for dew:");
           
                   p=sc.nextInt();
              
                   if(p==0)
                   {
                       sdrink=Coke.getCoke();
                   }
                   else if(p==1)
                   {
                       
                       sdrink=Pepsi.getPepsi();
                       
                   }
                   else if(p==2)
                   {
                       
                       sdrink=Dew.getDew();
                       
                   }
                   else continue;
                   sdrink.reset();
                       
                   }
                   else break;
            }
           }
         
       }
       
       else if(a==2)
       {
        
        
          checker( Coke.getCoke(),estate);
          estate.getState().result();
           
       }
       else if(a==3)
       {
           
           
        checker( Dew.getDew(),estate);
        estate.getState().result(); 
           
           
           
       }
       else if(a==4)
       {
           
        checker( Pepsi.getPepsi(),estate);
        
         estate.getState().result();  
           
       }
       
      
   }
        
    }
    
}
