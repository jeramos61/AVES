/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.charlesdarwin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
/**
 *
 * @author johan
 */
public class lab5TestCase {
    public static final Logger logger = LoggerFactory.getLogger(lab5TestCase.class);
    public void CanaroTestCase(){
        Canario canario= new Canario();
        Assert.assertNotNull(canario);
        
        logger.debug("Canario realiza vuelo");
        System.out.println("Canario realiza vuelo");    
        canario.realizaVuelo();
        logger.debug("canario realiza sonido");
        System.out.println("canario realiza sonido");
        canario.realizaSonido();
        System.out.println("canario cambiando sonido ave");
        canario.setTipoSonido(new Grasnido());
        System.out.println("Canario realzia sonido");
        canario.realizaSonido();
        
    }
}
