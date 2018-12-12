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
 public class Adestrador_seleccion extends Plantilla {
     private String idFederacion;

    public Adestrador_seleccion(String nome, String apelidos, int id, int edad, String idFederacion) {
        super(nome,apelidos,id,edad);
        this.idFederacion = idFederacion;
    }
    
    private void dirixirPartido(){}
    private void dirixirAdestramento(){}
    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxa o entrenador:"+super.getNome());
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "O adestrador é:\n"+ super.toString() +  "\nIdFederacion=" + idFederacion;
    }

}
