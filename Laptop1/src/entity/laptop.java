/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public abstract class laptop {
    private int ID;
    private String CompanyName;
    private int size;

    public laptop() {
    }

    public laptop(int ID, String CompanyName, int size) {
        this.ID = ID;
        this.CompanyName = CompanyName;
        this.size = size;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void working(){
        System.out.println( CompanyName + "Laptop is working");
            }

  
    
    
}
