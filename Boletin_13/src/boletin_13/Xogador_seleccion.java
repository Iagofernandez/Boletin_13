/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_13;

import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class Xogador_seleccion extends Plantilla {
    
    private int dorsal;
    private String demarcacion;

    public Xogador_seleccion (String nome, String apelidos, int id, int edad, int dorsal, String demarcacion){
    super(nome,apelidos,id,edad);
    this.dorsal=dorsal;
    this.demarcacion=demarcacion;
    }
    
    private void xogarPartido(){}
    private void entrenar(){}
    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxan os xogadores:"+super.getNome());
    }
    
   
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public String toString() {
        return "O xogador é:\n" + super.toString()  + "\nDorsal=" + dorsal + "\nDemarcacion=" + demarcacion;
    }
    
}

