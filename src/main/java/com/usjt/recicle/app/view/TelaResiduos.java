package com.usjt.recicle.app.view;

import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;

public class TelaResiduos extends javax.swing.JFrame {

    public TelaResiduos() {
        initComponents();
        configurarImagem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        botaoResiduoPapelCartao3 = new javax.swing.JButton();
        botaoResiduoPapelCartao6 = new javax.swing.JButton();
        botaoResiduoPapelCartao9 = new javax.swing.JButton();
        painelConteudoLogin = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        comboResiduos = new javax.swing.JComboBox<>();
        painelScroll = new javax.swing.JScrollPane();
        painelResiduos = new javax.swing.JPanel();
        botaoResiduoVidro = new javax.swing.JButton();
        botaoResiduoPapelCartao = new javax.swing.JButton();
        botaoResiduoPlastico = new javax.swing.JButton();
        botaoResiduoMetal = new javax.swing.JButton();
        botaoResiduoOrganico = new javax.swing.JButton();
        botaoResiduoEletronicos = new javax.swing.JButton();
        botaoResiduoPilhasBaterias = new javax.swing.JButton();
        botaoResiduoTetraPak = new javax.swing.JButton();
        botaoResiduoPerigosos = new javax.swing.JButton();
        botaoResiduoMadeira = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelSaudacao = new javax.swing.JLabel();
        labelSair = new javax.swing.JLabel();
        labelAgenda = new javax.swing.JLabel();

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

        botaoResiduoPapelCartao3.setBackground(new java.awt.Color(186, 16, 16));
        botaoResiduoPapelCartao3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoPapelCartao3.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoPapelCartao3.setText("Plástico");
        botaoResiduoPapelCartao3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        botaoResiduoPapelCartao3.setContentAreaFilled(false);
        botaoResiduoPapelCartao3.setFocusPainted(false);
        botaoResiduoPapelCartao3.setFocusable(false);
        botaoResiduoPapelCartao3.setOpaque(true);
        botaoResiduoPapelCartao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoPapelCartao3ActionPerformed(evt);
            }
        });

        botaoResiduoPapelCartao6.setBackground(new java.awt.Color(186, 16, 16));
        botaoResiduoPapelCartao6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoPapelCartao6.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoPapelCartao6.setText("Plástico");
        botaoResiduoPapelCartao6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        botaoResiduoPapelCartao6.setContentAreaFilled(false);
        botaoResiduoPapelCartao6.setFocusPainted(false);
        botaoResiduoPapelCartao6.setFocusable(false);
        botaoResiduoPapelCartao6.setOpaque(true);
        botaoResiduoPapelCartao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoPapelCartao6ActionPerformed(evt);
            }
        });

        botaoResiduoPapelCartao9.setBackground(new java.awt.Color(186, 16, 16));
        botaoResiduoPapelCartao9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoPapelCartao9.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoPapelCartao9.setText("Plástico");
        botaoResiduoPapelCartao9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        botaoResiduoPapelCartao9.setContentAreaFilled(false);
        botaoResiduoPapelCartao9.setFocusPainted(false);
        botaoResiduoPapelCartao9.setFocusable(false);
        botaoResiduoPapelCartao9.setOpaque(true);
        botaoResiduoPapelCartao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoPapelCartao9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConteudoLogin.setBackground(new java.awt.Color(204, 255, 204));
        painelConteudoLogin.setMaximumSize(new java.awt.Dimension(818, 600));
        painelConteudoLogin.setPreferredSize(new java.awt.Dimension(818, 600));

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 33)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        labelTitulo.setText("Resíduos");

        comboResiduos.setBackground(new java.awt.Color(153, 255, 153));
        comboResiduos.setForeground(new java.awt.Color(0, 153, 0));
        comboResiduos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboResiduos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        comboResiduos.setFocusable(false);
        comboResiduos.setLightWeightPopupEnabled(false);
        comboResiduos.setRequestFocusEnabled(false);
        comboResiduos.setVerifyInputWhenFocusTarget(false);

        painelScroll.setBackground(new java.awt.Color(153, 255, 153));
        painelScroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 8, true));
        painelScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        painelScroll.setFocusable(false);
        painelScroll.setPreferredSize(new java.awt.Dimension(600, 700));
        painelScroll.setRequestFocusEnabled(false);
        painelScroll.setVerifyInputWhenFocusTarget(false);
        painelScroll.setWheelScrollingEnabled(false);

        painelResiduos.setBackground(new java.awt.Color(153, 255, 153));

        botaoResiduoVidro.setBackground(new java.awt.Color(0, 219, 24));
        botaoResiduoVidro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoVidro.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoVidro.setText("Vidro");
        botaoResiduoVidro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 149, 28), 4));
        botaoResiduoVidro.setContentAreaFilled(false);
        botaoResiduoVidro.setFocusPainted(false);
        botaoResiduoVidro.setFocusable(false);
        botaoResiduoVidro.setOpaque(true);
        botaoResiduoVidro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoVidroActionPerformed(evt);
            }
        });

        botaoResiduoPapelCartao.setBackground(new java.awt.Color(0, 46, 218));
        botaoResiduoPapelCartao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoPapelCartao.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoPapelCartao.setText("Papel e Cartão");
        botaoResiduoPapelCartao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 4));
        botaoResiduoPapelCartao.setContentAreaFilled(false);
        botaoResiduoPapelCartao.setFocusPainted(false);
        botaoResiduoPapelCartao.setFocusable(false);
        botaoResiduoPapelCartao.setOpaque(true);
        botaoResiduoPapelCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoPapelCartaoActionPerformed(evt);
            }
        });

        botaoResiduoPlastico.setBackground(new java.awt.Color(186, 16, 16));
        botaoResiduoPlastico.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoPlastico.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoPlastico.setText("Plástico");
        botaoResiduoPlastico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 4));
        botaoResiduoPlastico.setContentAreaFilled(false);
        botaoResiduoPlastico.setFocusPainted(false);
        botaoResiduoPlastico.setFocusable(false);
        botaoResiduoPlastico.setOpaque(true);
        botaoResiduoPlastico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoPlasticoActionPerformed(evt);
            }
        });

        botaoResiduoMetal.setBackground(new java.awt.Color(186, 237, 13));
        botaoResiduoMetal.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoMetal.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoMetal.setText("Metal");
        botaoResiduoMetal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 4));
        botaoResiduoMetal.setContentAreaFilled(false);
        botaoResiduoMetal.setFocusPainted(false);
        botaoResiduoMetal.setFocusable(false);
        botaoResiduoMetal.setOpaque(true);
        botaoResiduoMetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoMetalActionPerformed(evt);
            }
        });

        botaoResiduoOrganico.setBackground(new java.awt.Color(118, 81, 32));
        botaoResiduoOrganico.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoOrganico.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoOrganico.setText("Orgânico");
        botaoResiduoOrganico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(48, 45, 20), 4));
        botaoResiduoOrganico.setContentAreaFilled(false);
        botaoResiduoOrganico.setFocusPainted(false);
        botaoResiduoOrganico.setFocusable(false);
        botaoResiduoOrganico.setOpaque(true);
        botaoResiduoOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoOrganicoActionPerformed(evt);
            }
        });

        botaoResiduoEletronicos.setBackground(new java.awt.Color(234, 83, 18));
        botaoResiduoEletronicos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoEletronicos.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoEletronicos.setText("Eletrônicos (e-lixo)");
        botaoResiduoEletronicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 71, 2), 4));
        botaoResiduoEletronicos.setContentAreaFilled(false);
        botaoResiduoEletronicos.setFocusPainted(false);
        botaoResiduoEletronicos.setFocusable(false);
        botaoResiduoEletronicos.setOpaque(true);
        botaoResiduoEletronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoEletronicosActionPerformed(evt);
            }
        });

        botaoResiduoPilhasBaterias.setBackground(new java.awt.Color(102, 102, 102));
        botaoResiduoPilhasBaterias.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoPilhasBaterias.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoPilhasBaterias.setText("Pilhas e Baterias");
        botaoResiduoPilhasBaterias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4));
        botaoResiduoPilhasBaterias.setContentAreaFilled(false);
        botaoResiduoPilhasBaterias.setFocusPainted(false);
        botaoResiduoPilhasBaterias.setFocusable(false);
        botaoResiduoPilhasBaterias.setOpaque(true);
        botaoResiduoPilhasBaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoPilhasBateriasActionPerformed(evt);
            }
        });

        botaoResiduoTetraPak.setBackground(new java.awt.Color(68, 134, 184));
        botaoResiduoTetraPak.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoTetraPak.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoTetraPak.setText("Tetra Pak (embalagens cartonadas)");
        botaoResiduoTetraPak.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 83, 205), 4));
        botaoResiduoTetraPak.setContentAreaFilled(false);
        botaoResiduoTetraPak.setFocusPainted(false);
        botaoResiduoTetraPak.setFocusable(false);
        botaoResiduoTetraPak.setOpaque(true);
        botaoResiduoTetraPak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoTetraPakActionPerformed(evt);
            }
        });

        botaoResiduoPerigosos.setBackground(new java.awt.Color(30, 29, 29));
        botaoResiduoPerigosos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoPerigosos.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoPerigosos.setText("Perigosos");
        botaoResiduoPerigosos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        botaoResiduoPerigosos.setContentAreaFilled(false);
        botaoResiduoPerigosos.setFocusPainted(false);
        botaoResiduoPerigosos.setFocusable(false);
        botaoResiduoPerigosos.setOpaque(true);
        botaoResiduoPerigosos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoPerigososActionPerformed(evt);
            }
        });

        botaoResiduoMadeira.setBackground(new java.awt.Color(35, 30, 9));
        botaoResiduoMadeira.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoResiduoMadeira.setForeground(new java.awt.Color(255, 255, 255));
        botaoResiduoMadeira.setText("Madeira");
        botaoResiduoMadeira.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 18, 0), 4));
        botaoResiduoMadeira.setContentAreaFilled(false);
        botaoResiduoMadeira.setFocusPainted(false);
        botaoResiduoMadeira.setFocusable(false);
        botaoResiduoMadeira.setOpaque(true);
        botaoResiduoMadeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResiduoMadeiraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelResiduosLayout = new javax.swing.GroupLayout(painelResiduos);
        painelResiduos.setLayout(painelResiduosLayout);
        painelResiduosLayout.setHorizontalGroup(
            painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelResiduosLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoPerigosos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoResiduoMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoPilhasBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoResiduoTetraPak, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoOrganico, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoResiduoEletronicos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoResiduoMetal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoPapelCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoResiduoVidro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        painelResiduosLayout.setVerticalGroup(
            painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResiduosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoPapelCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoVidro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoMetal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoOrganico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoEletronicos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoPilhasBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoTetraPak, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoPerigosos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(338, Short.MAX_VALUE))
        );

        painelScroll.setViewportView(painelResiduos);

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

        labelAgenda.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelAgenda.setForeground(new java.awt.Color(0, 153, 0));
        labelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-agenda.png"))); // NOI18N
        labelAgenda.setText("Agende aqui, os dias de reciclar!");
        labelAgenda.setMaximumSize(new java.awt.Dimension(17, 17));
        labelAgenda.setMinimumSize(new java.awt.Dimension(17, 17));
        labelAgenda.setPreferredSize(new java.awt.Dimension(17, 17));
        labelAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAgendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaudacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(labelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(labelSair)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelSaudacao, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addComponent(labelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelSair))
        );

        javax.swing.GroupLayout painelConteudoLoginLayout = new javax.swing.GroupLayout(painelConteudoLogin);
        painelConteudoLogin.setLayout(painelConteudoLoginLayout);
        painelConteudoLoginLayout.setHorizontalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(painelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(labelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(comboResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        painelConteudoLoginLayout.setVerticalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void labelAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAgendaMouseClicked
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                // Windows
                Runtime.getRuntime().exec("cmd /c start outlookcal:");
            } else if (os.contains("mac")) {
                // macOS
                Runtime.getRuntime().exec("open -a Calendar");
            } else {
                System.out.println("Sistema operacional não suportado.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_labelAgendaMouseClicked

    private void labelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSairMouseClicked
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_labelSairMouseClicked

    private void botaoResiduoPapelCartao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoPapelCartao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoPapelCartao3ActionPerformed

    private void botaoResiduoPapelCartao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoPapelCartao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoPapelCartao6ActionPerformed

    private void botaoResiduoPapelCartao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoPapelCartao9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoPapelCartao9ActionPerformed

    private void botaoResiduoMadeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoMadeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoMadeiraActionPerformed

    private void botaoResiduoPerigososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoPerigososActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoPerigososActionPerformed

    private void botaoResiduoTetraPakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoTetraPakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoTetraPakActionPerformed

    private void botaoResiduoPilhasBateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoPilhasBateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoPilhasBateriasActionPerformed

    private void botaoResiduoEletronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoEletronicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoEletronicosActionPerformed

    private void botaoResiduoOrganicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoOrganicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoOrganicoActionPerformed

    private void botaoResiduoMetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoMetalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoMetalActionPerformed

    private void botaoResiduoPlasticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoPlasticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoPlasticoActionPerformed

    private void botaoResiduoPapelCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoPapelCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResiduoPapelCartaoActionPerformed

    private void botaoResiduoVidroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResiduoVidroActionPerformed
        TelaResiduos telaResiduos = new TelaResiduos();
        telaResiduos.setVisible(true);
    }//GEN-LAST:event_botaoResiduoVidroActionPerformed

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
                new TelaResiduos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoResiduoEletronicos;
    private javax.swing.JButton botaoResiduoMadeira;
    private javax.swing.JButton botaoResiduoMetal;
    private javax.swing.JButton botaoResiduoOrganico;
    private javax.swing.JButton botaoResiduoPapelCartao;
    private javax.swing.JButton botaoResiduoPapelCartao3;
    private javax.swing.JButton botaoResiduoPapelCartao6;
    private javax.swing.JButton botaoResiduoPapelCartao9;
    private javax.swing.JButton botaoResiduoPerigosos;
    private javax.swing.JButton botaoResiduoPilhasBaterias;
    private javax.swing.JButton botaoResiduoPlastico;
    private javax.swing.JButton botaoResiduoTetraPak;
    private javax.swing.JButton botaoResiduoVidro;
    private javax.swing.JComboBox<String> comboResiduos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAgenda;
    private javax.swing.JLabel labelSair;
    private javax.swing.JLabel labelSaudacao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelConteudoLogin;
    private javax.swing.JPanel painelResiduos;
    private javax.swing.JScrollPane painelScroll;
    // End of variables declaration//GEN-END:variables
}
