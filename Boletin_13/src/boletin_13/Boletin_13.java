/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_13;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Plantilla obx=new Plantilla("Paco","Fernandez", 5, 22);
        Xogador_seleccion obx1=new Xogador_seleccion("Cristiano","ronaldo",3,35, 9,"delantero");
        Adestrador_seleccion obx2=new Adestrador_seleccion("Rafa","Benitez",32,54,"356472y64h");
        Masaxista_seleccion obx3=new Masaxista_seleccion ("Alonso","Pedrafita",42,30,12,"tecnico en torsion de espalda");
         obx.concentrarse();
         obx.viaxar();
    }
    
}
