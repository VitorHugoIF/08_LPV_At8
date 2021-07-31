/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at8.composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class HeadDepartmentTest {
    
    @Test
    public void testGetDepartamentsName() {
        Department salesDepartment = new SalesDepartment("sala 101", "Vendas");
        Department financialDepartment = new FinancialDepartment("sala 201", "Fincaças");
        HeadDepartment headDepartment = new HeadDepartment("sala 301", "Gerencia de departamentos");
        
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
                
        assertEquals("Deprtamento chefe: Gerencia de departamentos\n" +
                "Departamento de vendas: Vendas - sala: sala 101\n" +
                "Departamento de finanças: Fincaças - sala: sala 201\n", 
                headDepartment.getDepartamentName());

    }
}
