/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.io.Serializable;

/**
 *
 * @author elyanie
 */
public class Neighbors extends Acquaintances implements Serializable {
    
    private String Race;
    private String CommonInterest;
    
    Neighbors(){
        
    }
    
    public String getRace(){
        return Race;
    }
    
    public void setRace(String race){
        this.Race = race;
    }
    
    public String getCommonInterest(){
        return CommonInterest;
    }
    
    public void setCommonInterest(String interest){
        this.CommonInterest = interest;
    }
}
