
package br.edu.ifsc.jukebox;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Claidson
 */
public class JukeboxDAO {

    private ArrayList<Artista> artistas;


    public JukeboxDAO() {
        carregarTodos();
    }

    public void inserir(Artista artista) {
        artistas.add(artista);
        salvarTodos();
    }

    private void salvarTodos() {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(new JukeboxList(artistas));
            FileWriter writer = new FileWriter("Jukebox.json");
            writer.write(json);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro no salvar objeto em Jukebox.Json");
        }
    }

    private void carregarTodos() {
        try {
            //Converte String JSON para objeto Java
            Gson gson = new Gson();
            JukeboxList listaJson = gson.fromJson(new FileReader("Jukebox.json"), JukeboxList.class);
            artistas = listaJson.getArtistas();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Pau ao ler JSon");
        }
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
