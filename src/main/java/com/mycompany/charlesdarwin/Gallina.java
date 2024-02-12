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
public class Gallina extends Ave{

 public static final Logger logger = LoggerFactory.getLogger(Gallina.class);
 
 public Gallina(){
     logger.debug("instanciando Gallina");
     this.setTipoSonido(new Grasnido());
     this.setTipoVuelo(new VueloConAlas());
 }
    
}
