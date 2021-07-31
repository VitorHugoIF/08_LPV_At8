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
public class FinancialDepartment extends Department{
    
    private String Hall;

    public FinancialDepartment(String Hall, String name) {
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
        return "Departamento de finanças: " + this.getName()+ " - sala: " + this.Hall + "\n";
    }
}
