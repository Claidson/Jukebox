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
public class Artista {
    private String artista;
    private ArrayList<Musica> musicas = new ArrayList<>();

    public Artista() {
    }
    
    public void addMusica(Musica mp3){
        musicas.add(mp3);
    }
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
    @Override
    public String toString(){
        return artista;
    }
    
}
