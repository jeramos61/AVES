/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.charlesdarwin;

/**
 *
 * @author johan
 */
public abstract class Ave {
    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;
    
    
    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    public void realziaSonido(){
        tipoSonido.makeSound();
    }
    
}
