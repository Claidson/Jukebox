package br.edu.ifsc.jukebox;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.SwingUtilities;
import javazoom.jl.player.Player;

/**
	 * ====================================================================
	 * CLASS INTERNA MP3 MUSICA QUE EXTENDE DE THREAD PARA TRABALHAR
	 * PERFEITAMENTE NA APLICAÇÂO SEM TRAVAMENTO NA EXECUÇÃO
	 * ====================================================================
	 */

public class MP3Musica extends Thread {

    // OBJETO PARA O ARQUIVO MP3 A SER TOCADO
    private File mp3;

    // OBJETO PLAYER DA BIBLIOTECA JLAYER QUE TOCA O ARQUIVO MP3
    private Player player;

    /**
     * CONSTRUTOR RECEBE O OBJETO FILE REFERECIANDO O ARQUIVO MP3 A SER TOCADO E
     * ATRIBUI AO ATRIBUTO DA CLASS
     *
     * @param mp3
     */
    public void tocar(File mp3) {
        this.mp3 = mp3;
    }

    /**
     * ===============================================================
     * ======================================METODO RUN QUE TOCA O MP3
     * ===============================================================
     */
    public void run() {
        try {
            FileInputStream fis = new FileInputStream(mp3);
            BufferedInputStream bis = new BufferedInputStream(fis);

            this.player = new Player(bis);
            System.out.println("Tocando Musica!");

            this.player.play();
            TelaUsuario.musicas.remove(mp3);
            
                File proxima =TelaUsuario.musicas.get(0);
                if (proxima!=null){
                    MP3Musica novoPlayer = new MP3Musica();
                    novoPlayer.tocar(proxima);
                    novoPlayer.start();
                   
                }
            
                   

        } catch (Exception e) {
            System.out.println("Problema ao tocar Musica" + mp3);
            e.printStackTrace();
        }
    }
}
