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
public class SportsFriends extends Acquaintances implements Serializable {
    
    private String PlaceToGo;
    private String TypeOfActivities;
    private String Date;
    
    SportsFriends(){
        
    }
    
    public String getPlaceToGo(){
        return PlaceToGo;
    }
    
    public void setPlaceToGo(String place){
        this.PlaceToGo = place;
    }
    
    public String getTypeOfActivities(){
        return TypeOfActivities;
    }
    
    public void setTypeOfActivities(String activities){
        this.TypeOfActivities = activities;
    }
    
    public String getDate(){
        return Date;
    }
    
    public void setDate(String date){
        this.Date = date;
    }
    
}
