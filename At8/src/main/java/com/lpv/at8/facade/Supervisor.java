/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at8.facade;

/**
 *
 * @author vitor.marcelino
 */
public class Supervisor extends Manager{
    private static Supervisor supervisor = new Supervisor();

    private Supervisor() {};
    public static Supervisor getInstance() {
        return supervisor;
    }
}
