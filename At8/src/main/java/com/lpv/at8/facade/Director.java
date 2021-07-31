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
public class Director extends Manager {
    private static Director director = new Director();

    private Director() {};
    public static Director getInstance() {
        return director;
    }
}
