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
public class JukeboxDAO {

    private ArrayList<Artista> artistas;

    public void addArtista(Artista artista) {
        artistas.add(artista);
    }

    public JukeboxDAO() {
    }

    public JukeboxDAO(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

}
