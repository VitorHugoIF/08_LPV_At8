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
public class DocumentFacade {
     public static boolean checkDocumentForSignature(Document document) {
        if (Supervisor.getInstance().checkPendingDocument(document)) {
            return false;
        }
        if (Administrator.getInstance().checkPendingDocument(document)) {
            return false;
        }
        if (Director.getInstance().checkPendingDocument(document)) {
            return false;
        }
        return true;
    }
}
