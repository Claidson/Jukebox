/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.jukebox;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Aluno
 */
public class TelaGerenciador extends javax.swing.JFrame {

    Artista novoArtista;
    Musica mp3;
    JukeboxController controle;

    public void preencheComboBoxArtista() {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jCBArtistas.getModel();
        comboModel.removeAllElements();
        List<Artista> artistas = controle.getArtistas();
        if (artistas.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nada localizado :-(\n", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
        } //else {
        for (int i = 0; i < artistas.size(); i++) {
            Artista artista = artistas.get(i);
            comboModel.addElement(artista);
            //}
        }
    }

    public void copiar(File fonte, File destino) {
        try {
            FileChannel in = new FileInputStream(fonte).getChannel();
            FileChannel out = new FileOutputStream(destino).getChannel();
            out.transferFrom(in, 0, in.size());
            in.close();
            out.close();
        } catch (IOException ex) {
            System.out.println("Erro na copia");
        }
    }

    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    public TelaGerenciador() {
        initComponents();
        controle = new JukeboxController();
        mp3 = new Musica();

        preencheComboBoxArtista();
        centralizarComponente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabMusicas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBNovoArtista = new javax.swing.JButton();
        jBSelecionaMp3 = new javax.swing.JButton();
        jCBArtistas = new javax.swing.JComboBox();
        jBCadastrarMp3 = new javax.swing.JButton();
        jLabelTitMp3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabMusicas.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setText("Artista");

        jLabel4.setText("Música");

        jBNovoArtista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rock-2-icon (1).png"))); // NOI18N
        jBNovoArtista.setText("Novo");
        jBNovoArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoArtistaActionPerformed(evt);
            }
        });

        jBSelecionaMp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rock-Guitar-icon (1).png"))); // NOI18N
        jBSelecionaMp3.setText("Selecionar");
        jBSelecionaMp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionaMp3ActionPerformed(evt);
            }
        });

        jBCadastrarMp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rock-andRoll-icon (1).png"))); // NOI18N
        jBCadastrarMp3.setText("Cadastrar");
        jBCadastrarMp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarMp3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBSelecionaMp3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTitMp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBCadastrarMp3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNovoArtista)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBNovoArtista)
                    .addComponent(jCBArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jBSelecionaMp3)
                    .addComponent(jLabelTitMp3))
                .addGap(37, 37, 37)
                .addComponent(jBCadastrarMp3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabMusicas.addTab("Adicionar", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jTabMusicas.addTab("Musicas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoArtistaActionPerformed
        novoArtista = new Artista();
        novoArtista.setArtista(JOptionPane.showInputDialog("Nome do artista:"));
        controle.salvarArtista(novoArtista);
        preencheComboBoxArtista();
        jBNovoArtista.setVisible(true);

    }//GEN-LAST:event_jBNovoArtistaActionPerformed

    private void jBSelecionaMp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionaMp3ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileFilter extensao = new FileNameExtensionFilter("Arquivo mp3", "mp3");
        fileChooser.addChoosableFileFilter(extensao);
        int retorno = fileChooser.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            File copia = new File("" + file.getName());
            copiar(file, copia);
            mp3.setPath(copia.getAbsolutePath());
            mp3.setMusica(file.getName());
            jLabelTitMp3.setText(mp3.getMusica());
            System.out.println("mp3 " + mp3.toString());
            JOptionPane.showMessageDialog(this, "Arquivo mp3 importado para pasta do projeto\n", "Importação", JOptionPane.INFORMATION_MESSAGE);

        } else {
            // dialogo cancelado
        }
    }//GEN-LAST:event_jBSelecionaMp3ActionPerformed

    private void jBCadastrarMp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarMp3ActionPerformed
        novoArtista = (Artista) jCBArtistas.getSelectedItem();
        novoArtista.addMusica(mp3);
        System.out.println("caminho " + mp3.getPath());
        System.out.println("titulo " + mp3.getMusica());

        System.out.println("Artista " + novoArtista.getArtista().toString());
        controle.salvar();
        JOptionPane.showMessageDialog(this, "Musica Salva\nLet's Rock !", "Salvo", JOptionPane.INFORMATION_MESSAGE);
        preencheComboBoxArtista();
    }//GEN-LAST:event_jBCadastrarMp3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarMp3;
    private javax.swing.JButton jBNovoArtista;
    private javax.swing.JButton jBSelecionaMp3;
    private javax.swing.JComboBox jCBArtistas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTitMp3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabMusicas;
    // End of variables declaration//GEN-END:variables
}
