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

    private JukeboxDAO dao = new JukeboxDAO();
    
    public boolean salvarArtista(Artista artista){
        dao.inserir(artista);
        return true;
    }
public boolean salvar(){
        dao.atualizar();
        return true;
    }
    public JukeboxController() {

    }

    public ArrayList<Artista> getArtistas() {
        return dao.getArtistas();
    }


}
