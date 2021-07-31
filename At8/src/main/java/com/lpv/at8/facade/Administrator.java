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
public class Administrator extends Manager {
    private static Administrator administrator = new Administrator();

    private Administrator() {};
    public static Administrator getInstance() {
        return administrator;
    }
}
