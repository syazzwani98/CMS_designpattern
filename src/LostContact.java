/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author elyanie
 */
public class LostContact implements StateStatus {
    
    public String relationStatus(Context context){
        return"Lost contact with acquaintances";
    }
//    
//    public String toString(){
//        return "";
//    }
    
}
