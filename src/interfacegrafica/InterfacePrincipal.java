/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author MICHAEL MARTINS
 */
public final class InterfacePrincipal extends javax.swing.JFrame {
    private InterfaceFotos interfaceFotos;
    private InterfaceMusicas interfaceMusicas;
    private InterfaceFilmes interfaceFilmes;
    private InterfacePodcasts interfacePodcasts;
    private int xMousePressed;
    private int yMousePressed;
    /**
     * Creates new form Home
     */
    public InterfacePrincipal() {
        initComponents();
        interfaceFotos = new InterfaceFotos();
        interfaceMusicas = new InterfaceMusicas();
        interfaceFilmes = new InterfaceFilmes();
        interfacePodcasts =  new InterfacePodcasts();
        gerarImagensInterface();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHome = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        txtCatalogodeMidias = new javax.swing.JLabel();
        imageLinhasTransparentes = new javax.swing.JLabel();
        btnMinimized = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        jPanelMenus = new javax.swing.JPanel();
        btnFotos = new javax.swing.JLabel();
        btnMusicas = new javax.swing.JLabel();
        btnFilmes = new javax.swing.JLabel();
        btnEbook = new javax.swing.JLabel();
        btnJogos = new javax.swing.JLabel();
        btnPodcast = new javax.swing.JLabel();
        btnPartiturasMusicais = new javax.swing.JLabel();
        btnAudioLivro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHome.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTop.setBackground(new java.awt.Color(33, 150, 243));
        jPanelTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelTopMouseDragged(evt);
            }
        });
        jPanelTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelTopMousePressed(evt);
            }
        });
        jPanelTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCatalogodeMidias.setFont(new java.awt.Font("Aardvark Cafe", 1, 70)); // NOI18N
        txtCatalogodeMidias.setForeground(new java.awt.Color(51, 51, 51));
        txtCatalogodeMidias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtCatalogodeMidias.setText("Catálogo de Mídias");
        jPanelTop.add(txtCatalogodeMidias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 660, 80));
        jPanelTop.add(imageLinhasTransparentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, -1, -1));

        btnMinimized.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnMinimized.setForeground(new java.awt.Color(51, 51, 51));
        btnMinimized.setText("-");
        btnMinimized.setAlignmentX(0.5F);
        btnMinimized.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimized.setName("Minimizar"); // NOI18N
        btnMinimized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizedMouseClicked(evt);
            }
        });
        jPanelTop.add(btnMinimized, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 30));

        btnExit.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnExit.setForeground(new java.awt.Color(51, 51, 51));
        btnExit.setText("x");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setName("Minimizar"); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanelTop.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, 30));

        jPanelHome.add(jPanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 130));

        jPanelMenus.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFotos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFotos.setName("Gerenciador de Fotos"); // NOI18N
        btnFotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFotosMouseClicked(evt);
            }
        });
        jPanelMenus.add(btnFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 131, 130));

        btnMusicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusicas.setName("Gerenciador de Musicas"); // NOI18N
        btnMusicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMusicasMouseClicked(evt);
            }
        });
        jPanelMenus.add(btnMusicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 131, 130));

        btnFilmes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFilmes.setName("Gerenciador de Filmes"); // NOI18N
        btnFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFilmesMouseClicked(evt);
            }
        });
        jPanelMenus.add(btnFilmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 131, 130));

        btnEbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEbook.setName("Gerenciador de Ebook"); // NOI18N
        btnEbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEbookMouseClicked(evt);
            }
        });
        jPanelMenus.add(btnEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 131, 130));

        btnJogos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJogos.setName("Gerenciador de Jogos"); // NOI18N
        btnJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJogosMouseClicked(evt);
            }
        });
        jPanelMenus.add(btnJogos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 131, 130));

        btnPodcast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPodcast.setName("Gerenciador de Podcast"); // NOI18N
        btnPodcast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPodcastMouseClicked(evt);
            }
        });
        jPanelMenus.add(btnPodcast, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 131, 130));

        btnPartiturasMusicais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPartiturasMusicais.setName("Gerenciador de Partituras Musicais"); // NOI18N
        btnPartiturasMusicais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPartiturasMusicaisMouseClicked(evt);
            }
        });
        jPanelMenus.add(btnPartiturasMusicais, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 131, 130));

        btnAudioLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAudioLivro.setName("Gerenciador de AudioLivro"); // NOI18N
        btnAudioLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAudioLivroMouseClicked(evt);
            }
        });
        jPanelMenus.add(btnAudioLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 131, 130));

        jPanelHome.add(jPanelMenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 440));

        getContentPane().add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));
        jPanelHome.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Eventos de Clicks"> 
    private void btnFotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotosMouseClicked
        interfaceFotos.setVisible(true);
    }//GEN-LAST:event_btnFotosMouseClicked

    private void btnMusicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusicasMouseClicked
       interfaceMusicas.setVisible(true);
    }//GEN-LAST:event_btnMusicasMouseClicked

    private void btnFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilmesMouseClicked
        interfaceFilmes.setVisible(true);
    }//GEN-LAST:event_btnFilmesMouseClicked

    private void btnEbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEbookMouseClicked

    }//GEN-LAST:event_btnEbookMouseClicked

    private void btnJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogosMouseClicked

    }//GEN-LAST:event_btnJogosMouseClicked

    private void btnPodcastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPodcastMouseClicked

    }//GEN-LAST:event_btnPodcastMouseClicked

    private void btnPartiturasMusicaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPartiturasMusicaisMouseClicked

    }//GEN-LAST:event_btnPartiturasMusicaisMouseClicked

    private void btnAudioLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAudioLivroMouseClicked

    }//GEN-LAST:event_btnAudioLivroMouseClicked

    private void btnMinimizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizedMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizedMouseClicked

    private void jPanelTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMousePressed, y - yMousePressed);
    }//GEN-LAST:event_jPanelTopMouseDragged

    private void jPanelTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopMousePressed
        xMousePressed = evt.getX();
        yMousePressed = evt.getY();
    }//GEN-LAST:event_jPanelTopMousePressed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked
    //</editor-fold>
    
    public void gerarImagensInterface(){
        String pathCatalogo = System.getProperty("user.dir");
        
        btnAudioLivro.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnAudioLivro.png"));
        btnEbook.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnEbook.png"));
        btnFilmes.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnFilmes.png"));
        btnFotos.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnFotos.png"));
        btnJogos.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnJogos.png"));
        btnMusicas.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnMusicas.png"));
        btnPartiturasMusicais.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnPartiturasMusicais.png"));
        btnPodcast.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnPodcast.png"));
        imageLinhasTransparentes.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/imageLinhasTransparentes.png"));
    }
    
    // <editor-fold defaultstate="collapsed" desc="método main">
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="variaveis declaradas pela interface">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAudioLivro;
    private javax.swing.JLabel btnEbook;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnFilmes;
    private javax.swing.JLabel btnFotos;
    private javax.swing.JLabel btnJogos;
    private javax.swing.JLabel btnMinimized;
    private javax.swing.JLabel btnMusicas;
    private javax.swing.JLabel btnPartiturasMusicais;
    private javax.swing.JLabel btnPodcast;
    private javax.swing.JLabel imageLinhasTransparentes;
    public javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelMenus;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JLabel txtCatalogodeMidias;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
