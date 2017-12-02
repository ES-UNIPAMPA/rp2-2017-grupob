/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import catalogo.gerenciadores.GFotos;
import catalogo.gerenciadores.IGerenciador;
import catalogo.midias.Foto;
import catalogo.midias.Midia;
import java.awt.event.KeyAdapter;
import java.io.IOException;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SingleSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MICHAEL MARTINS
 */
public class InterfaceFotos extends javax.swing.JFrame {
    
    DateFormat df = DateFormat.getDateInstance();
    
    private JFileChooser chooser = new JFileChooser();
    
    private int xMousePressed;
    private int yMousePressed;
    private IGerenciador gFotos = null;
    private DefaultTableModel modelTabMidias;
    
    /**
     * Creates new form Home
     */
    public InterfaceFotos() {
        initComponents();
        gFotos = new GFotos(new ArrayList<>());
        gerarImagensInterface();
        modelTabMidias = (DefaultTableModel) jTable.getModel();
        jTable.setRowSorter(new TableRowSorter(modelTabMidias));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHome = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        txtCatalogodeMidias = new javax.swing.JLabel();
        imageLinhasTransparentes = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        jPanelMenuLateral = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JPanel();
        lblCadastrar = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JPanel();
        lblConsultar = new javax.swing.JLabel();
        btnExibir = new javax.swing.JPanel();
        lblExibir = new javax.swing.JLabel();
        btnArquivo = new javax.swing.JPanel();
        lblArquivo = new javax.swing.JLabel();
        BorderVertical = new javax.swing.JPanel();
        BorderHorizontal = new javax.swing.JPanel();
        jTabConteudos = new javax.swing.JTabbedPane();
        jPCadastrar = new javax.swing.JPanel();
        txtCaminho = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JLabel();
        txtFotografo = new javax.swing.JLabel();
        txtPessoas = new javax.swing.JLabel();
        txtLocal = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        editDescricao = new javax.swing.JTextField();
        editCaminho = new javax.swing.JTextField();
        editTitulo = new javax.swing.JTextField();
        editPessoas = new javax.swing.JTextField();
        editLocal = new javax.swing.JTextField();
        editFotografo = new javax.swing.JTextField();
        editFormatHora = new javax.swing.JFormattedTextField();
        btnLimparCampos = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        InforCadastrar = new javax.swing.JPanel();
        txtInforCadastrar = new javax.swing.JLabel();
        inforCadastrar = new javax.swing.JLabel();
        editCalendarDate = new com.toedter.calendar.JDateChooser();
        jPanelConsultar = new javax.swing.JPanel();
        txtTituloPesquisa = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        editConsultar = new javax.swing.JTextField();
        btnPesquisarMidia = new javax.swing.JLabel();
        InforCadastrar1 = new javax.swing.JPanel();
        txtInforConsultar = new javax.swing.JLabel();
        inforConsultar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaConsulta = new javax.swing.JTextArea();
        jPExibir = new javax.swing.JPanel();
        InforExibir = new javax.swing.JPanel();
        txtInforExibir = new javax.swing.JLabel();
        inforExibir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnRemoverMidia = new javax.swing.JButton();
        btnAtualizarMidias = new javax.swing.JButton();
        btnOrdenarMidia1 = new javax.swing.JButton();
        jPaneConfArquivo = new javax.swing.JPanel();
        jPaneConfArquivo.setVisible(false);
        btnCarregarArquivo = new javax.swing.JLabel();
        btnSalvarArquivo = new javax.swing.JLabel();
        InforCarregar = new javax.swing.JPanel();
        txtInforCarregar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHome.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHome.setInheritsPopupMenu(true);
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTop.setBackground(new java.awt.Color(1, 87, 155));
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

        txtCatalogodeMidias.setFont(new java.awt.Font("Aardvark Cafe", 1, 36)); // NOI18N
        txtCatalogodeMidias.setForeground(new java.awt.Color(51, 51, 51));
        txtCatalogodeMidias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCatalogodeMidias.setText("Catálogo de Fotos");
        jPanelTop.add(txtCatalogodeMidias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 550, 70));
        jPanelTop.add(imageLinhasTransparentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, -1, -1));

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

        jPanelHome.add(jPanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        jPanelMenuLateral.setBackground(new java.awt.Color(1, 87, 155));
        jPanelMenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setName("Voltar"); // NOI18N
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        jPanelMenuLateral.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnCadastrar.setBackground(new java.awt.Color(33, 150, 243));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrarMousePressed(evt);
            }
        });
        btnCadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        lblCadastrar.setFont(new java.awt.Font("Aardvark Cafe", 1, 24)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(51, 51, 51));
        lblCadastrar.setText("Cadastrar");
        lblCadastrar.setName("Cadastrar"); // NOI18N
        btnCadastrar.add(lblCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanelMenuLateral.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, 50));

        btnConsultar.setBackground(new java.awt.Color(33, 150, 243));
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConsultarMousePressed(evt);
            }
        });
        btnConsultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblConsultar.setBackground(new java.awt.Color(51, 51, 51));
        lblConsultar.setFont(new java.awt.Font("Aardvark Cafe", 1, 24)); // NOI18N
        lblConsultar.setForeground(new java.awt.Color(51, 51, 51));
        lblConsultar.setText("Consultar");
        lblConsultar.setName("Consultar"); // NOI18N
        btnConsultar.add(lblConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanelMenuLateral.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 50));

        btnExibir.setBackground(new java.awt.Color(33, 150, 243));
        btnExibir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExibir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExibirMousePressed(evt);
            }
        });
        btnExibir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExibir.setBackground(new java.awt.Color(51, 51, 51));
        lblExibir.setFont(new java.awt.Font("Aardvark Cafe", 1, 24)); // NOI18N
        lblExibir.setForeground(new java.awt.Color(51, 51, 51));
        lblExibir.setText("Exibir");
        lblExibir.setName("Exibir"); // NOI18N
        btnExibir.add(lblExibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanelMenuLateral.add(btnExibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 50));

        btnArquivo.setBackground(new java.awt.Color(33, 150, 243));
        btnArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnArquivoMousePressed(evt);
            }
        });
        btnArquivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblArquivo.setBackground(new java.awt.Color(51, 51, 51));
        lblArquivo.setFont(new java.awt.Font("Aardvark Cafe", 1, 24)); // NOI18N
        lblArquivo.setForeground(new java.awt.Color(51, 51, 51));
        lblArquivo.setText("Arquivo");
        lblArquivo.setName("Editar"); // NOI18N
        btnArquivo.add(lblArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanelMenuLateral.add(btnArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 50));

        BorderVertical.setBackground(new java.awt.Color(33, 150, 243));

        javax.swing.GroupLayout BorderVerticalLayout = new javax.swing.GroupLayout(BorderVertical);
        BorderVertical.setLayout(BorderVerticalLayout);
        BorderVerticalLayout.setHorizontalGroup(
            BorderVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        BorderVerticalLayout.setVerticalGroup(
            BorderVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanelMenuLateral.add(BorderVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 500));

        jPanelHome.add(jPanelMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, 500));

        BorderHorizontal.setBackground(new java.awt.Color(33, 150, 243));

        javax.swing.GroupLayout BorderHorizontalLayout = new javax.swing.GroupLayout(BorderHorizontal);
        BorderHorizontal.setLayout(BorderHorizontalLayout);
        BorderHorizontalLayout.setHorizontalGroup(
            BorderHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        BorderHorizontalLayout.setVerticalGroup(
            BorderHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanelHome.add(BorderHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 770, 10));

        jPCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        jPCadastrar.setPreferredSize(new java.awt.Dimension(760, 490));
        jPCadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCaminho.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtCaminho.setForeground(new java.awt.Color(33, 150, 243));
        txtCaminho.setText("CAMINHO:");
        jPCadastrar.add(txtCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        txtTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(33, 150, 243));
        txtTitulo.setText("TÍTULO:");
        jPCadastrar.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        txtDescricao.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(33, 150, 243));
        txtDescricao.setText("DESCRIÇÃO:");
        jPCadastrar.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        txtFotografo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtFotografo.setForeground(new java.awt.Color(33, 150, 243));
        txtFotografo.setText("FOTÓGRAFO:");
        jPCadastrar.add(txtFotografo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtPessoas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtPessoas.setForeground(new java.awt.Color(33, 150, 243));
        txtPessoas.setText("PESSOAS:");
        jPCadastrar.add(txtPessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        txtLocal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtLocal.setForeground(new java.awt.Color(33, 150, 243));
        txtLocal.setText("LOCAL:");
        jPCadastrar.add(txtLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        txtData.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtData.setForeground(new java.awt.Color(33, 150, 243));
        txtData.setText("DATA:");
        jPCadastrar.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        txtHora.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtHora.setForeground(new java.awt.Color(33, 150, 243));
        txtHora.setText("HORA:");
        jPCadastrar.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        editDescricao.setBackground(new java.awt.Color(187, 187, 187));
        jPCadastrar.add(editDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 190, 40));

        editCaminho.setBackground(new java.awt.Color(187, 187, 187));
        jPCadastrar.add(editCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 190, 40));

        editTitulo.setBackground(new java.awt.Color(187, 187, 187));
        jPCadastrar.add(editTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 190, 40));

        editPessoas.setBackground(new java.awt.Color(187, 187, 187));
        jPCadastrar.add(editPessoas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 190, 40));

        editLocal.setBackground(new java.awt.Color(187, 187, 187));
        jPCadastrar.add(editLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 190, 40));

        editFotografo.setBackground(new java.awt.Color(187, 187, 187));
        jPCadastrar.add(editFotografo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 190, 40));

        editFormatHora.setBackground(new java.awt.Color(187, 187, 187));
        try {
            editFormatHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPCadastrar.add(editFormatHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 190, 40));

        btnLimparCampos.setBackground(new java.awt.Color(33, 150, 243));
        btnLimparCampos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimparCampos.setForeground(new java.awt.Color(51, 51, 51));
        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.setToolTipText("Clique para limpar todos os campos.");
        btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparCamposMouseClicked(evt);
            }
        });
        jPCadastrar.add(btnLimparCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 150, 40));

        btnAdd.setBackground(new java.awt.Color(33, 150, 243));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("Adicionar Foto");
        btnAdd.setToolTipText("Clique para adicionar mídia na sua coleção.");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        jPCadastrar.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 150, 40));

        InforCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        InforCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtInforCadastrar.setForeground(new java.awt.Color(33, 150, 243));

        inforCadastrar.setForeground(new java.awt.Color(33, 150, 243));
        inforCadastrar.setText("Infor: ");

        javax.swing.GroupLayout InforCadastrarLayout = new javax.swing.GroupLayout(InforCadastrar);
        InforCadastrar.setLayout(InforCadastrarLayout);
        InforCadastrarLayout.setHorizontalGroup(
            InforCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InforCadastrarLayout.createSequentialGroup()
                .addComponent(inforCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInforCadastrar)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        InforCadastrarLayout.setVerticalGroup(
            InforCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InforCadastrarLayout.createSequentialGroup()
                .addGroup(InforCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInforCadastrar)
                    .addComponent(inforCadastrar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPCadastrar.add(InforCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 330, 20));

        editCalendarDate.setBackground(new java.awt.Color(187, 187, 187));
        editCalendarDate.setForeground(new java.awt.Color(51, 51, 51));
        editCalendarDate.setToolTipText("");
        jPCadastrar.add(editCalendarDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 190, 40));

        jTabConteudos.addTab("Cadastrar", jPCadastrar);

        jPanelConsultar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelConsultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTituloPesquisa.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTituloPesquisa.setForeground(new java.awt.Color(33, 150, 243));
        txtTituloPesquisa.setText("Informe o título da mídia:");
        jPanelConsultar.add(txtTituloPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));
        jPanelConsultar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 680, 10));

        editConsultar.setBackground(new java.awt.Color(187, 187, 187));
        jPanelConsultar.add(editConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 280, 40));

        btnPesquisarMidia.setToolTipText("Consultar");
        btnPesquisarMidia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarMidia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMidiaMouseClicked(evt);
            }
        });
        jPanelConsultar.add(btnPesquisarMidia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        InforCadastrar1.setBackground(new java.awt.Color(51, 51, 51));
        InforCadastrar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtInforConsultar.setForeground(new java.awt.Color(33, 150, 243));

        inforConsultar.setForeground(new java.awt.Color(33, 150, 243));
        inforConsultar.setText("Infor: ");

        javax.swing.GroupLayout InforCadastrar1Layout = new javax.swing.GroupLayout(InforCadastrar1);
        InforCadastrar1.setLayout(InforCadastrar1Layout);
        InforCadastrar1Layout.setHorizontalGroup(
            InforCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InforCadastrar1Layout.createSequentialGroup()
                .addComponent(inforConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInforConsultar)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        InforCadastrar1Layout.setVerticalGroup(
            InforCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InforCadastrar1Layout.createSequentialGroup()
                .addGroup(InforCadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInforConsultar)
                    .addComponent(inforConsultar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelConsultar.add(InforCadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 330, 20));

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("Midia consultada");

        TextAreaConsulta.setEditable(false);
        TextAreaConsulta.setColumns(20);
        TextAreaConsulta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextAreaConsulta.setRows(5);
        jScrollPane2.setViewportView(TextAreaConsulta);

        jPanelConsultar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 390, 230));

        jTabConteudos.addTab("Consultar", jPanelConsultar);

        jPExibir.setBackground(new java.awt.Color(51, 51, 51));
        jPExibir.setPreferredSize(new java.awt.Dimension(760, 490));
        jPExibir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InforExibir.setBackground(new java.awt.Color(51, 51, 51));
        InforExibir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtInforExibir.setForeground(new java.awt.Color(33, 150, 243));

        inforExibir.setForeground(new java.awt.Color(33, 150, 243));
        inforExibir.setText("Infor: ");

        javax.swing.GroupLayout InforExibirLayout = new javax.swing.GroupLayout(InforExibir);
        InforExibir.setLayout(InforExibirLayout);
        InforExibirLayout.setHorizontalGroup(
            InforExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InforExibirLayout.createSequentialGroup()
                .addComponent(inforExibir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInforExibir)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        InforExibirLayout.setVerticalGroup(
            InforExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InforExibirLayout.createSequentialGroup()
                .addGroup(InforExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInforExibir)
                    .addComponent(inforExibir))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPExibir.add(InforExibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 330, 20));

        jTable.setBackground(new java.awt.Color(102, 102, 102));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Descricão", "Caminho", "Fotógrafo", "Pessoas", "Local", "Data", "Hora"
            }
        ));
        jTable.setGridColor(new java.awt.Color(0, 0, 0));
        jTable.setSelectionBackground(new java.awt.Color(33, 150, 243));
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        jPExibir.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 740, 340));

        btnRemoverMidia.setBackground(new java.awt.Color(33, 150, 243));
        btnRemoverMidia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRemoverMidia.setForeground(new java.awt.Color(51, 51, 51));
        btnRemoverMidia.setText("Remover Mídia");
        btnRemoverMidia.setToolTipText("Clique para remover uma mídia");
        btnRemoverMidia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverMidia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMidiaMouseClicked(evt);
            }
        });
        jPExibir.add(btnRemoverMidia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 150, 40));

        btnAtualizarMidias.setBackground(new java.awt.Color(33, 150, 243));
        btnAtualizarMidias.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtualizarMidias.setForeground(new java.awt.Color(51, 51, 51));
        btnAtualizarMidias.setText("Atualizar Mídias");
        btnAtualizarMidias.setToolTipText("Clique para ordenar.");
        btnAtualizarMidias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarMidias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtualizarMidiasMouseClicked(evt);
            }
        });
        jPExibir.add(btnAtualizarMidias, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 150, 40));

        btnOrdenarMidia1.setBackground(new java.awt.Color(33, 150, 243));
        btnOrdenarMidia1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnOrdenarMidia1.setForeground(new java.awt.Color(51, 51, 51));
        btnOrdenarMidia1.setText("Ordenar Mídias");
        btnOrdenarMidia1.setToolTipText("Clique para ordenar.");
        btnOrdenarMidia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarMidia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenarMidia1MouseClicked(evt);
            }
        });
        jPExibir.add(btnOrdenarMidia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 150, 40));

        jTabConteudos.addTab("Exibir", jPExibir);

        jPaneConfArquivo.setBackground(new java.awt.Color(51, 51, 51));
        jPaneConfArquivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCarregarArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarregarArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarregarArquivoMouseClicked(evt);
            }
        });
        jPaneConfArquivo.add(btnCarregarArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        btnSalvarArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarArquivoMouseClicked(evt);
            }
        });
        jPaneConfArquivo.add(btnSalvarArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        InforCarregar.setBackground(new java.awt.Color(51, 51, 51));
        InforCarregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtInforCarregar.setForeground(new java.awt.Color(33, 150, 243));
        txtInforCarregar.setText("Infor: ");

        javax.swing.GroupLayout InforCarregarLayout = new javax.swing.GroupLayout(InforCarregar);
        InforCarregar.setLayout(InforCarregarLayout);
        InforCarregarLayout.setHorizontalGroup(
            InforCarregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InforCarregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInforCarregar)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        InforCarregarLayout.setVerticalGroup(
            InforCarregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InforCarregarLayout.createSequentialGroup()
                .addComponent(txtInforCarregar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPaneConfArquivo.add(InforCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 330, 20));

        jTabConteudos.addTab("ConfigurarArquivo", jPaneConfArquivo);

        jPanelHome.add(jTabConteudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 760, 520));

        getContentPane().add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));
        jPanelHome.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Efeitos para Clicks e paineis"> 
    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnConsultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMousePressed
        resetColorPanel(btnCadastrar);
        resetColorLabel(lblCadastrar);
        setColorPanel(btnConsultar);
        setColorLabel(lblConsultar);
        resetColorPanel(btnExibir);
        resetColorLabel(lblExibir);
        resetColorPanel(btnArquivo);
        resetColorLabel(lblArquivo);
        
        jTabConteudos.setSelectedIndex(1);
    }//GEN-LAST:event_btnConsultarMousePressed

    private void btnCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMousePressed
        setColorPanel(btnCadastrar);
        setColorLabel(lblCadastrar);
        resetColorPanel(btnConsultar);
        resetColorLabel(lblConsultar);
        resetColorPanel(btnExibir);
        resetColorLabel(lblExibir);
        resetColorPanel(btnArquivo);
        resetColorLabel(lblArquivo);
        
        //Abrindo aba
        jTabConteudos.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnCadastrarMousePressed

    private void jPanelTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopMousePressed
        xMousePressed = evt.getX();
        yMousePressed = evt.getY();
    }//GEN-LAST:event_jPanelTopMousePressed

    private void jPanelTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMousePressed, y - yMousePressed);

    }//GEN-LAST:event_jPanelTopMouseDragged

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Gerenciamento das midias"> 
    private void btnSalvarArquivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarArquivoMouseClicked
        String path = getPathFile();
        
        if (path!= null) {
            if (gFotos.salvarArquivo(path)) {
                JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao salvar arquivo.");
            }
        }
        
    }//GEN-LAST:event_btnSalvarArquivoMouseClicked

    private void btnCarregarArquivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarregarArquivoMouseClicked
        String path = getPathFile();
        if (path!= null) {
            if (gFotos.carregarArquivo(path)) {
                JOptionPane.showMessageDialog(null, "Arquivo carregado com sucesso.");
            }
        }
    }//GEN-LAST:event_btnCarregarArquivoMouseClicked

    private void btnPesquisarMidiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMidiaMouseClicked
        if (editConsultar.getText().trim().equals("")) {
            txtInforConsultar.setText("Digite algo para pesquisar.");
        }else{
            Foto aux = (Foto) gFotos.consultar(editConsultar.getText());

            if (aux != null) {
                TextAreaConsulta.setText( aux.toString() );
                txtInforConsultar.setText("Mídia encontrada com sucesso.");
                editConsultar.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Midia null");
            }
        }
    }//GEN-LAST:event_btnPesquisarMidiaMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        if ((editCaminho.getText().trim().equals("")   || editPessoas.getText().trim().equals("") ||
            editDescricao.getText().trim().equals("")  || editCalendarDate == null ||
            editFormatHora.getText().trim().equals("") || editFotografo.getText().trim().equals("")  ||
            editLocal.getText().trim().equals("")      || editTitulo.getText().trim().equals("") )) {

            txtInforCadastrar.setText("Informe os campos corretamente.");
        }else{

            String date = df.format(editCalendarDate.getDate());

            if (gFotos.cadastrar(new Foto(editTitulo.getText(), editDescricao.getText(), editCaminho.getText(),
                editFotografo.getText(), editPessoas.getText(), editLocal.getText(),
                date, editFormatHora.getText()))){
                
                JOptionPane.showMessageDialog(null, "Mídia inserida com sucesso.");
                
            }else{
                txtInforCadastrar.setText("Falha ao cadastrar foto.");
            }
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnLimparCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparCamposMouseClicked
        limparTodosCampos();
        txtInforCadastrar.setText("Todos os campos foram limpos.");
    }//GEN-LAST:event_btnLimparCamposMouseClicked

    private void btnRemoverMidiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMidiaMouseClicked
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma mídia para remover.");
        }else{
            
            String path = modelTabMidias.getValueAt(jTable.getSelectedRow(), 2).toString();
            
            if (gFotos.remover(path)) {
                modelTabMidias.removeRow(jTable.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Midia removida com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null, "Falha ao remover mídia.");
            }
        }
    }//GEN-LAST:event_btnRemoverMidiaMouseClicked

    private void btnAtualizarMidiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMidiasMouseClicked
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione/Altere uma mídia para realizar esta operação");
        }else{
            String tituloMidiaAntiga = modelTabMidias.getValueAt(jTable.getSelectedRow(), 0).toString();
            //Recuperando midia antiga selecionada
            
            Midia midiaVelha = gFotos.consultar(tituloMidiaAntiga);
            
            //Pegando midia nova
            Midia midiaNova = new Foto(
                    modelTabMidias.getValueAt(jTable.getSelectedRow(), 0).toString(),
                    modelTabMidias.getValueAt(jTable.getSelectedRow(), 1).toString(),
                    modelTabMidias.getValueAt(jTable.getSelectedRow(), 2).toString(),
                    modelTabMidias.getValueAt(jTable.getSelectedRow(), 3).toString(),
                    modelTabMidias.getValueAt(jTable.getSelectedRow(), 4).toString(),
                    modelTabMidias.getValueAt(jTable.getSelectedRow(), 5).toString(),
                    modelTabMidias.getValueAt(jTable.getSelectedRow(), 6).toString(),
                    modelTabMidias.getValueAt(jTable.getSelectedRow(), 7).toString());
            
            if (midiaNova != null) {
                if(gFotos.editar(midiaVelha, midiaNova)){
                    JOptionPane.showMessageDialog(null, "Mídia atualizada no banco de dados com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(null, "Falha ao atualizar mídia.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Mídia null");
            }
        }
    }//GEN-LAST:event_btnAtualizarMidiasMouseClicked
    
    private void btnExibirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExibirMousePressed
        resetColorPanel(btnCadastrar);
        resetColorLabel(lblCadastrar);
        resetColorPanel(btnConsultar);
        resetColorLabel(lblConsultar);
        setColorPanel(btnExibir);
        setColorLabel(lblExibir);
        resetColorPanel(btnArquivo);
        resetColorLabel(lblArquivo);
        
        jTabConteudos.setSelectedIndex(2);
        
        modelTabMidias.setRowCount(0);
        
        for (Object midias : gFotos.exibir()) {
            Foto aux = (Foto) midias;
            Object[] dadosTable = { aux.getTitulo(),      aux.getDescricao(),  aux.getPath(),
                aux.getFotografo(), aux.getPessoas(), aux.getLocal(),
                aux.getData(),      aux.getHora()};
            modelTabMidias.addRow(dadosTable);    
        }
    }//GEN-LAST:event_btnExibirMousePressed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Efeitos Colors">
    private void btnArquivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArquivoMousePressed
        resetColorPanel(btnCadastrar);
        resetColorLabel(lblCadastrar);
        resetColorPanel(btnConsultar);
        resetColorLabel(lblConsultar);
        resetColorPanel(btnExibir);
        resetColorLabel(lblExibir);
        setColorPanel(btnArquivo);
        setColorLabel(lblArquivo);

        jTabConteudos.setSelectedIndex(3);
    }//GEN-LAST:event_btnArquivoMousePressed

    private void btnOrdenarMidia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarMidia1MouseClicked
        
    }//GEN-LAST:event_btnOrdenarMidia1MouseClicked
        
    void setColorPanel(JPanel jp){
        jp.setBackground(new java.awt.Color(51,51,51));
    }
    
    void resetColorPanel(JPanel jp){
        jp.setBackground(new java.awt.Color(33,150,243));
    }
    
    void setColorLabel(javax.swing.JLabel l){
        l.setForeground(new java.awt.Color(33,150,243));
    }
    
    void resetColorLabel(javax.swing.JLabel l){
        l.setForeground(new java.awt.Color(51,51,51));
    }// </editor-fold>
    
    public String getPathFile(){
        String path = null;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Arquivo...");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //Extensão
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de texto", "txt");
        fileChooser.setFileFilter(filter);
        
        int retrn = fileChooser.showOpenDialog(this);
        
        if (retrn == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            path = file.getPath();
        }else{
            txtInforCarregar.setText("Carregamento cancelado.");
        }
        return path;
    }
    
    public void gerarImagensInterface(){
        String pathCatalogo = System.getProperty("user.dir");
        btnPesquisarMidia.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnPesquisarMidia.png"));
        btnVoltar.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnVoltar.png"));
        btnSalvarArquivo.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnSalvar.png"));
        btnCarregarArquivo.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/btnCarregar.png"));
        imageLinhasTransparentes.setIcon(new ImageIcon(pathCatalogo + "/src/interfacegrafica/imagens/imageLinhasTransparentes.png"));
    }
    
    public void limparTodosCampos(){
        //Limpando campos
        editCaminho.setText("");
        editTitulo.setText("");
        editDescricao.setText("");
        editFotografo.setText("");
        editPessoas.setText("");
        editLocal.setText("");
        editFormatHora.setText("");
        editCalendarDate.cleanup();
        editConsultar.setText("");

        txtInforCadastrar.setText("Todos os campos foram limpos.");
    }
    
    // <editor-fold defaultstate="collapsed" desc="variaveis declaradas pela interface">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BorderHorizontal;
    private javax.swing.JPanel BorderVertical;
    private javax.swing.JPanel InforCadastrar;
    private javax.swing.JPanel InforCadastrar1;
    private javax.swing.JPanel InforCarregar;
    private javax.swing.JPanel InforExibir;
    private javax.swing.JTextArea TextAreaConsulta;
    private javax.swing.JButton btnAdd;
    private javax.swing.JPanel btnArquivo;
    private javax.swing.JButton btnAtualizarMidias;
    private javax.swing.JPanel btnCadastrar;
    private javax.swing.JLabel btnCarregarArquivo;
    private javax.swing.JPanel btnConsultar;
    private javax.swing.JPanel btnExibir;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnOrdenarMidia1;
    private javax.swing.JLabel btnPesquisarMidia;
    private javax.swing.JButton btnRemoverMidia;
    private javax.swing.JLabel btnSalvarArquivo;
    private javax.swing.JLabel btnVoltar;
    private com.toedter.calendar.JDateChooser editCalendarDate;
    private javax.swing.JTextField editCaminho;
    private javax.swing.JTextField editConsultar;
    private javax.swing.JTextField editDescricao;
    private javax.swing.JFormattedTextField editFormatHora;
    private javax.swing.JTextField editFotografo;
    private javax.swing.JTextField editLocal;
    private javax.swing.JTextField editPessoas;
    private javax.swing.JTextField editTitulo;
    private javax.swing.JLabel imageLinhasTransparentes;
    private javax.swing.JLabel inforCadastrar;
    private javax.swing.JLabel inforConsultar;
    private javax.swing.JLabel inforExibir;
    private javax.swing.JPanel jPCadastrar;
    private javax.swing.JPanel jPExibir;
    private javax.swing.JPanel jPaneConfArquivo;
    private javax.swing.JPanel jPanelConsultar;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelMenuLateral;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabConteudos;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblExibir;
    private javax.swing.JLabel txtCaminho;
    private javax.swing.JLabel txtCatalogodeMidias;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtFotografo;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtInforCadastrar;
    private javax.swing.JLabel txtInforCarregar;
    private javax.swing.JLabel txtInforConsultar;
    private javax.swing.JLabel txtInforExibir;
    private javax.swing.JLabel txtLocal;
    private javax.swing.JLabel txtPessoas;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTituloPesquisa;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
