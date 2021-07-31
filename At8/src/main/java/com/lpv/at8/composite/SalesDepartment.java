/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at8.composite;

/**
 *
 * @author vitor.marcelino
 */
public class SalesDepartment extends Department {
    private String Hall;

    public SalesDepartment(String Hall, String name) {
        super(name);
        this.Hall = Hall;
    }

    public String getHall() {
        return Hall;
    }

    public void setHall(String Hall) {
        this.Hall = Hall;
    }
    
    @Override
    public String getDepartamentName() {
        return "Departamento de vendas: " + this.getName()+ " - sala: " + this.Hall + "\n";
    }
}
