/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.jukebox;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class JukeboxController {
    
        private ArrayList<Artista> artistas;
        
        public JukeboxController(){
            artistas = new ArrayList<>();
        }
        public void addArtista(Artista artista){
            artistas.add(artista);
        }
    
}