/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.jukebox;

import java.util.TreeSet;

/**
 *
 * @author Aluno
 */
public class Artista {
    private String artista;
    private TreeSet<Musica> musicas;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public TreeSet<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(TreeSet<Musica> musicas) {
        this.musicas = musicas;
    }
    
    
}
