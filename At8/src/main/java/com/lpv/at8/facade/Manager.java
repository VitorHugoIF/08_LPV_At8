/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at8.facade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor.marcelino
 */
public abstract class Manager {
     private List<Document> documents = new ArrayList<Document>();

    public void addPendingDocument(Document document) {
        this.documents.add(document);
    }

    public boolean checkPendingDocument(Document document) {
        return documents.contains(document);
    }
}
