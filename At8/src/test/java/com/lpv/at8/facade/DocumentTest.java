/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at8.facade;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class DocumentTest {
   
    @Test
    public void testGetPendingDocumentSupervisor() {
        Document document = new Document();
        Supervisor.getInstance().addPendingDocument(document);

        assertEquals(false, document.toSign());
    }
    
    @Test
    public void testGetPendingDocumentAdministrator() {
        Document document = new Document();
        Administrator.getInstance().addPendingDocument(document);

        assertEquals(false, document.toSign());
    }
    
    @Test
    public void testGetPendingDocumentDirector() {
        Document document = new Document();
        Director.getInstance().addPendingDocument(document);

        assertEquals(false, document.toSign());
    }
    
    @Test
    public void testGetDocumentWithoutPending() {
        Document document = new Document();

        assertEquals(true, document.toSign());
    }
    
}
