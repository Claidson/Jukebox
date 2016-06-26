/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.jukebox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
/**
 *
 * @author Aluno
 */
public class TelaUsuario extends javax.swing.JFrame {
    DefaultListModel modelo = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    
    public static MP3Musica player = new MP3Musica();
    public static int indice;
    ArrayList<Artista> listar;
    public static ArrayList<File> musicas;
    boolean m;
    

    /**
     * Creates new form Tela
     */
    public TelaUsuario() {
       
        this.setContentPane(new FundoBg());
        getContentPane().setBackground(Color.black);
        initComponents();
       
        indice = 0;
        musicas = new ArrayList<>();
        m=false;
        centralizarComponente();
        /*Artista novo = new Artista();
        novo.setArtista("Teste");
        ArrayList<Musica> novoMusicas = new ArrayList<>();
        Musica novaMusica = new Musica();
        novaMusica.setPath ("C:\\Users\\Aluno\\Documents\\NetBeansProjects\\Jukebox\\src\\main\\resources\\teste.mp3");
        novaMusica.setMusica("Teste");
        novoMusicas.add(novaMusica);
        novo.setMusicas(novoMusicas);
        jukebox.addArtista(novo);
        
        
        Artista novo2 = new Artista();
        novo2.setArtista("Teste2");
        ArrayList<Musica> novoMusicas2 = new ArrayList<>();
        Musica novaMusica2 = new Musica();
        novaMusica2.setPath("C:\\Users\\Aluno\\Documents\\NetBeansProjects\\Jukebox\\src\\main\\resources\\01 - Hells Bells.mp3");
        novaMusica2.setMusica ("01 - Hells Bells");
        novoMusicas2.add(novaMusica2);
        novo2.setMusicas(novoMusicas2);
        jukebox.addArtista(novo2);*/
        
        mostrarArtistas();
    }
  public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListListaArtistas = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonTocar = new javax.swing.JButton();
        jButtonConfig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListTocarMusicas = new javax.swing.JList();
        jButtonVoltar = new javax.swing.JButton();

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListListaArtistas.setModel(modelo);
        jScrollPane1.setViewportView(jListListaArtistas);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-media-seek-backward-icon (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-media-seek-forward-icon (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonTocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-media-playback-start-icon (1).png"))); // NOI18N
        jButtonTocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTocarActionPerformed(evt);
            }
        });

        jButtonConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings-icon.png"))); // NOI18N
        jButtonConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Musica");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proxima");

        jListTocarMusicas.setModel(modelo);
        jScrollPane3.setViewportView(jListTocarMusicas);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clock-Back-icon.png"))); // NOI18N
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(71, 71, 71))))
                    .addComponent(jScrollPane1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButtonTocar))
                        .addGap(46, 46, 46))
                    .addComponent(jButtonConfig, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVoltar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVoltar)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonConfig))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigActionPerformed
        new TelaGerenciador().setVisible(true);       
    }//GEN-LAST:event_jButtonConfigActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int select = jListListaArtistas.getSelectedIndex();
        if (select!=0){
            jListListaArtistas.setSelectedIndex(select-1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JukeboxController jukebox = new JukeboxController();
        int select = jListListaArtistas.getSelectedIndex();
        if (select!=jukebox.getArtistas().size()-1){
            jListListaArtistas.setSelectedIndex(select+1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonTocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTocarActionPerformed
        // TODO add your handling code here:
        if (!m){
        Artista select = (Artista) jListListaArtistas.getSelectedValue();
        ((DefaultListModel)(jListListaArtistas.getModel())).clear();
                
                for (Musica musica:select.getMusicas()){
                ((DefaultListModel)(jListListaArtistas.getModel()))
               .addElement(musica);                
                m=true;
                
                }
            
        
        jListListaArtistas.setSelectedIndex(0);
        
        }else{
            Musica select = (Musica) jListListaArtistas.getSelectedValue();
            File musica=new File(select.getPath());
            musicas.add(musica);
            mostrarMusicas();
           
               if (!player.isAlive()) {
                    
                    player.tocar(musica);
                    player.start();
                }
            
        }
        
    }//GEN-LAST:event_jButtonTocarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        mostrarArtistas();
        mostrarMusicas();
    }//GEN-LAST:event_jButtonVoltarActionPerformed
    private void mostrarArtistas(){
        JukeboxController jukebox = new JukeboxController();
        ((DefaultListModel)(jListListaArtistas.getModel())).clear();
        listar = jukebox.getArtistas();
        for (Artista artista:listar){
                ((DefaultListModel)(jListListaArtistas.getModel()))
               .addElement(artista);
            }
        jListListaArtistas.setSelectedIndex(0);
        m=false;
    }
    
   public void mostrarMusicas(){
       ((DefaultListModel)(jListTocarMusicas.getModel())).clear();
        
        for (File musica:musicas){
                ((DefaultListModel)(jListTocarMusicas.getModel()))
               .addElement(musica);
            }
   }
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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonConfig;
    private javax.swing.JButton jButtonTocar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList2;
    private javax.swing.JList jListListaArtistas;
    private javax.swing.JList jListTocarMusicas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

   
}
