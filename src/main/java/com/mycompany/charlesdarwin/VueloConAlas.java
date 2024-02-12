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
public class VueloConAlas implements TipoVuelo{
        public static final Logger logger = LoggerFactory.getLogger(VueloConAlas.class);
    @Override
    public void vuelo() {
        logger.debug("esta volando, aleteando");
        System.out.println("esta volando, aletaenado");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
