/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at8.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor.marcelino
 */
public class HeadDepartment extends Department{
    private String Hall;
    private List<Department> childDepartments;

    public HeadDepartment(String Hall, String name) {
        super(name);
        this.Hall = Hall;
        this.childDepartments = new ArrayList<Department>();
    }

    @Override
    public String getDepartamentName() {
        String out = "";
        out = "Deprtamento chefe: " + this.getName()+ "\n";
        for (Department deps : childDepartments) {
            out += deps.getDepartamentName();
        }
        return out;
    }
    
    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
