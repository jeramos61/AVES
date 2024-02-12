/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.charlesdarwin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author johan
 */
public class SinCanto implements TipoSonido {
     public static final Logger logger = LoggerFactory.getLogger(SinCanto.class);
    @Override
    public void makeSound() {
        logger.debug("<<silencio>>");
        System.out.println("<<silencio>>");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
