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
public class Context {
    
    private StateStatus status;
    
    public Context(){
        status = null;
    }
    
    public void setStatus(StateStatus status){
        this.status = status;
    }
    
    public StateStatus getStatus(){
        return status;
    }
    
}
