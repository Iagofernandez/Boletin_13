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
public class Masaxista_seleccion extends Plantilla{
    private int anosExperiencia;
    private String titulacion;

    public Masaxista_seleccion(String nome, String apelidos, int id, int edad, int anosExperiencia, String titulacion) {
        super(nome,apelidos,id,edad);
        this.anosExperiencia = anosExperiencia;
        this.titulacion = titulacion;
    }
    
    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxa o masaxista:"+super.getNome());
    }
    
    public void darMasaxes(){}

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return"O masaxistata é:\n"+ super.toString() + "\nAnosExperiencia=" + anosExperiencia + "\nTitulacion=" + titulacion;
    }
}

