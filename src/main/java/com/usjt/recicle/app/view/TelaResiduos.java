package com.usjt.recicle.app.view;

import com.usjt.recicle.app.controller.CategoriaResiduoController;
import com.usjt.recicle.app.controller.DicaController;
import com.usjt.recicle.app.model.CategoriaResiduo;
import com.usjt.recicle.app.model.Dica;
import com.usjt.recicle.app.model.Usuario;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;

public class TelaResiduos extends javax.swing.JFrame {

    private static TelaResiduos instanciaAtual;
    private Usuario usuarioAtual;

    public TelaResiduos(Usuario usuario) {
        initComponents();
        configurarImagem();
        this.usuarioAtual = usuario;
        instanciaAtual = this;
        exibirSaudacao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConteudo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        painelCabecalho = new javax.swing.JPanel();
        labelSaudacao = new javax.swing.JLabel();
        labelSair = new javax.swing.JLabel();
        painelResiduos = new javax.swing.JPanel();
        botaoResiduoPapelCartao = new javax.swing.JButton();
        botaoResiduoMadeira = new javax.swing.JButton();
        botaoResiduoPilhasBaterias = new javax.swing.JButton();
        botaoResiduoPerigosos = new javax.swing.JButton();
        botaoResiduoVidro = new javax.swing.JButton();
        botaoResiduoPlastico = new javax.swing.JButton();
        botaoResiduoMetal = new javax.swing.JButton();
        botaoResiduoOrganico = new javax.swing.JButton();
        botaoResiduoEletronicos = new javax.swing.JButton();
        botaoResiduoTetraPak = new javax.swing.JButton();
        labelAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConteudo.setBackground(new java.awt.Color(204, 255, 204));
        painelConteudo.setMaximumSize(new java.awt.Dimension(850, 600));
        painelConteudo.setPreferredSize(new java.awt.Dimension(850, 600));

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 33)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        labelTitulo.setText("Resíduos");

        painelCabecalho.setBackground(new java.awt.Color(153, 255, 153));
        painelCabecalho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 8, true));
        painelCabecalho.setFocusable(false);
        painelCabecalho.setMaximumSize(new java.awt.Dimension(850, 60));
        painelCabecalho.setPreferredSize(new java.awt.Dimension(850, 60));
        painelCabecalho.setRequestFocusEnabled(false);
        painelCabecalho.setVerifyInputWhenFocusTarget(false);

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

        javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
        painelCabecalho.setLayout(painelCabecalhoLayout);
        painelCabecalhoLayout.setHorizontalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaudacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 728, Short.MAX_VALUE)
                .addComponent(labelSair)
                .addContainerGap())
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelSaudacao, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        painelResiduos.setBackground(new java.awt.Color(153, 255, 153));
        painelResiduos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 8, true));
        painelResiduos.setForeground(new java.awt.Color(0, 153, 0));
        painelResiduos.setRequestFocusEnabled(false);

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

        javax.swing.GroupLayout painelResiduosLayout = new javax.swing.GroupLayout(painelResiduos);
        painelResiduos.setLayout(painelResiduosLayout);
        painelResiduosLayout.setHorizontalGroup(
            painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResiduosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(botaoResiduoMetal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoOrganico, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoResiduoEletronicos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoPilhasBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoResiduoTetraPak, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoPapelCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoResiduoVidro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelResiduosLayout.createSequentialGroup()
                        .addComponent(botaoResiduoPerigosos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoResiduoMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        painelResiduosLayout.setVerticalGroup(
            painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResiduosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoPapelCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoVidro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoMetal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoOrganico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoEletronicos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoPilhasBaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoTetraPak, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(painelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResiduoMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoResiduoPerigosos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        labelAgenda.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelAgenda.setForeground(new java.awt.Color(0, 153, 0));
        labelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-agenda.png"))); // NOI18N
        labelAgenda.setText("Clique aqui, para agendar os dias de reciclar!");
        labelAgenda.setMaximumSize(new java.awt.Dimension(17, 17));
        labelAgenda.setMinimumSize(new java.awt.Dimension(17, 17));
        labelAgenda.setPreferredSize(new java.awt.Dimension(17, 17));
        labelAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAgendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelConteudoLayout = new javax.swing.GroupLayout(painelConteudo);
        painelConteudo.setLayout(painelConteudoLayout);
        painelConteudoLayout.setHorizontalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(painelResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(328, 328, 328))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        painelConteudoLayout.setVerticalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(painelResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelAgendaMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                // Windows
                Runtime.getRuntime().exec("cmd /c start outlookcal:");
            } else if (os.contains("mac")) {
                // macOS
                Runtime.getRuntime().exec("open -a Calendar");
            } else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
                // Linux
                Runtime.getRuntime().exec("xdg-open calendar:");
            } else {
                System.out.println("Sistema operacional não suportado.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void exibirSaudacao() {
        if (usuarioAtual != null) {
            String nomeUsuario = usuarioAtual.getNome();
            String saudacao = "Olá, " + nomeUsuario + "!";
            labelSaudacao.setText(saudacao);
        }
    }

    public static void fecharInstanciaAtual() {
        if (instanciaAtual != null) {
            instanciaAtual.dispose();
            instanciaAtual = null;
        }
    }

    private void labelSairMouseClicked(java.awt.event.MouseEvent evt) {
        Usuario.encerrarSessao();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        fecharInstanciaAtual();
    }

    @Override
    public void dispose() {
        super.dispose();
        instanciaAtual = null;
    }

    private void botaoResiduoMadeiraActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 10;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-madeira.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(35, 30, 9);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoPerigososActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 9;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-perigosos.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(30, 29, 29);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoTetraPakActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 8;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-tetrapak.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(68, 134, 184);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoPilhasBateriasActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 7;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-baterias.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(102, 102, 102);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoEletronicosActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 6;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-eletronicos.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(234, 83, 18);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoOrganicoActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 5;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-organico.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(118, 81, 32);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoMetalActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 4;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-metal.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(186, 237, 13);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoPlasticoActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 3;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-plastico.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(186, 16, 16);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoVidroActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 2;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-vidro.png";
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(0, 219, 24);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void botaoResiduoPapelCartaoActionPerformed(java.awt.event.ActionEvent evt) {
        long id = 1;
        CategoriaResiduoController controllerCategoriaResiduo = new CategoriaResiduoController();
        DicaController dicaController = new DicaController();

        CategoriaResiduo categoriaResiduo = controllerCategoriaResiduo.buscarResiduosPorId(id);
        Dica dica = dicaController.buscarDicasCategoriaResiduo(id);

        if (categoriaResiduo != null) {
            TelaInformacoes telaInformacoes = new TelaInformacoes(id, usuarioAtual.getId());

            String caminhoImagem = "/imagens/imagem-papel.png"; 
            telaInformacoes.filtrarResiduo(categoriaResiduo.getNome(), categoriaResiduo.getInformacao01(), categoriaResiduo.getInformacao02(), dica, caminhoImagem);
            telaInformacoes.setCorResiduo(0, 46, 218);

            telaInformacoes.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Categoria de resíduo não encontrada.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void configurarImagem() {
        URL imgURL = getClass().getResource("/imagens/icone-reciclagem.png");
        if (imgURL != null) {
            labelSaudacao.setIcon(new ImageIcon(imgURL));
        } else {
            System.err.println("Não foi possível encontrar o arquivo de imagem.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoResiduoEletronicos;
    private javax.swing.JButton botaoResiduoMadeira;
    private javax.swing.JButton botaoResiduoMetal;
    private javax.swing.JButton botaoResiduoOrganico;
    private javax.swing.JButton botaoResiduoPapelCartao;
    private javax.swing.JButton botaoResiduoPerigosos;
    private javax.swing.JButton botaoResiduoPilhasBaterias;
    private javax.swing.JButton botaoResiduoPlastico;
    private javax.swing.JButton botaoResiduoTetraPak;
    private javax.swing.JButton botaoResiduoVidro;
    private javax.swing.JLabel labelAgenda;
    private javax.swing.JLabel labelSair;
    private javax.swing.JLabel labelSaudacao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelConteudo;
    private javax.swing.JPanel painelResiduos;
    // End of variables declaration//GEN-END:variables
}
