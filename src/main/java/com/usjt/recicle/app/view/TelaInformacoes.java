package com.usjt.recicle.app.view;

import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;

public class TelaInformacoes extends javax.swing.JFrame {

    public TelaInformacoes() {
        initComponents();
        configurarImagem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        painelConteudoLogin = new javax.swing.JPanel();
        labelDicas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelSaudacao = new javax.swing.JLabel();
        labelSair = new javax.swing.JLabel();
        labelTitulo1 = new javax.swing.JLabel();
        labelAnotacoes1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaAnotacoes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDicas = new javax.swing.JList<>();
        imagemResiduo = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConteudoLogin.setBackground(new java.awt.Color(204, 255, 204));
        painelConteudoLogin.setMaximumSize(new java.awt.Dimension(818, 600));
        painelConteudoLogin.setPreferredSize(new java.awt.Dimension(818, 600));

        labelDicas.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        labelDicas.setForeground(new java.awt.Color(0, 153, 0));
        labelDicas.setText("Dicas");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 8, true));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(818, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(818, 70));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        labelSaudacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelSaudacao.setForeground(new java.awt.Color(0, 153, 0));
        labelSaudacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-reciclagem.png"))); // NOI18N
        labelSaudacao.setText("Olá");

        labelSair.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        labelSair.setForeground(new java.awt.Color(0, 153, 0));
        labelSair.setText("Sair");
        labelSair.setFocusable(false);
        labelSair.setRequestFocusEnabled(false);
        labelSair.setVerifyInputWhenFocusTarget(false);
        labelSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaudacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 684, Short.MAX_VALUE)
                .addComponent(labelSair)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelSaudacao, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addComponent(labelSair))
        );

        labelTitulo1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(0, 153, 0));
        labelTitulo1.setText("Resíduo");

        labelAnotacoes1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        labelAnotacoes1.setForeground(new java.awt.Color(0, 153, 0));
        labelAnotacoes1.setText("Anotações");

        tabelaAnotacoes.setAutoCreateRowSorter(true);
        tabelaAnotacoes.setBackground(new java.awt.Color(153, 255, 153));
        tabelaAnotacoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 6, true));
        tabelaAnotacoes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabelaAnotacoes.setForeground(new java.awt.Color(0, 153, 0));
        tabelaAnotacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        tabelaAnotacoes.setToolTipText("Escreva suas anotações");
        tabelaAnotacoes.setFocusable(false);
        tabelaAnotacoes.setGridColor(new java.awt.Color(0, 218, 101));
        tabelaAnotacoes.setOpaque(false);
        tabelaAnotacoes.setRequestFocusEnabled(false);
        tabelaAnotacoes.setRowHeight(25);
        tabelaAnotacoes.setSelectionBackground(new java.awt.Color(153, 255, 153));
        tabelaAnotacoes.setSelectionForeground(new java.awt.Color(0, 153, 0));
        tabelaAnotacoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaAnotacoes.getTableHeader().setResizingAllowed(false);
        tabelaAnotacoes.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabelaAnotacoes);

        listaDicas.setBackground(new java.awt.Color(153, 255, 153));
        listaDicas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 6, true));
        listaDicas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listaDicas.setForeground(new java.awt.Color(0, 153, 0));
        listaDicas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dica1", "Dica 2", "Dica 3", "Dica 4", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaDicas);

        imagemResiduo.setText("Imagem do Resíduo");

        javax.swing.GroupLayout painelConteudoLoginLayout = new javax.swing.GroupLayout(painelConteudoLogin);
        painelConteudoLogin.setLayout(painelConteudoLoginLayout);
        painelConteudoLoginLayout.setHorizontalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAnotacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDicas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addComponent(labelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagemResiduo)
                        .addGap(97, 97, 97))))
        );
        painelConteudoLoginLayout.setVerticalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagemResiduo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnotacoes1)
                    .addComponent(labelDicas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSairMouseClicked
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_labelSairMouseClicked

    private void configurarImagem() {
        URL imgURL = getClass().getResource("/imagens/icone-reciclagem.png");
        if (imgURL != null) {
            labelSaudacao.setIcon(new ImageIcon(imgURL));
        } else {
            System.err.println("Não foi possível encontrar o arquivo de imagem.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInformacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagemResiduo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAnotacoes1;
    private javax.swing.JLabel labelDicas;
    private javax.swing.JLabel labelSair;
    private javax.swing.JLabel labelSaudacao;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JList<String> listaDicas;
    private javax.swing.JPanel painelConteudoLogin;
    private javax.swing.JTable tabelaAnotacoes;
    // End of variables declaration//GEN-END:variables
}
