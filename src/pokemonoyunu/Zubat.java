/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

/**
 *
 * @author Mustafa
 */
public class Zubat extends pokemon {
    int hasarPuani;
 boolean kullanildiMi;
    
     public Zubat(){
        
    }
     public Zubat( String pokemonName,String Tip,int hasarPuani){
         super(pokemonName,Tip);
     
     }
     @Override
     public int hasarPuaniGoster(){
          // System.out.println("zubat hasar puani "+hasarPuani);
         return this.hasarPuani ;
       
     }
    
    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    public int getHasarPuani() {
        return hasarPuani;
    }
    
}
