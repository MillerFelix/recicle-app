package com.usjt.recicle.app.view;

import com.usjt.recicle.app.model.Dica;
import com.usjt.recicle.app.model.Usuario;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;

public class TelaInformacoes extends javax.swing.JFrame {

    private static TelaInformacoes instanciaAtual;

    public TelaInformacoes() {
        initComponents();
        configurarImagem();
        instanciaAtual = this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        painelConteudoLogin = new javax.swing.JPanel();
        labelDicas = new javax.swing.JLabel();
        painelCabecalho = new javax.swing.JPanel();
        labelSaudacao = new javax.swing.JLabel();
        labelSair = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelAnotacoes = new javax.swing.JLabel();
        imagemResiduo = new javax.swing.JLabel();
        textoAnotacao = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAnotacoes = new javax.swing.JList<>();
        labelDica = new javax.swing.JLabel();
        labelInformacao02 = new javax.swing.JLabel();
        labelInformacao01 = new javax.swing.JLabel();
        labelTituloDica = new javax.swing.JLabel();

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

        painelCabecalho.setBackground(new java.awt.Color(153, 255, 153));
        painelCabecalho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 8, true));
        painelCabecalho.setFocusable(false);
        painelCabecalho.setMaximumSize(new java.awt.Dimension(818, 70));
        painelCabecalho.setPreferredSize(new java.awt.Dimension(818, 70));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 684, Short.MAX_VALUE)
                .addComponent(labelSair)
                .addGap(18, 18, 18))
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelSaudacao, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addComponent(labelSair))
        );

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        labelTitulo.setText("Resíduo");

        labelAnotacoes.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        labelAnotacoes.setForeground(new java.awt.Color(0, 153, 0));
        labelAnotacoes.setText("Anotações");

        imagemResiduo.setForeground(new java.awt.Color(51, 51, 51));
        imagemResiduo.setText("Imagem do Resíduo");

        textoAnotacao.setBackground(new java.awt.Color(153, 255, 153));
        textoAnotacao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoAnotacao.setForeground(new java.awt.Color(0, 153, 0));
        textoAnotacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoAnotacao.setToolTipText("Digite o nome de Usuário");
        textoAnotacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        textoAnotacao.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        textoAnotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoAnotacaoActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(0, 218, 101));
        botaoSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(0, 153, 0));
        botaoSalvar.setText("OK");
        botaoSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 4, true));
        botaoSalvar.setContentAreaFilled(false);
        botaoSalvar.setOpaque(true);

        listaAnotacoes.setBackground(new java.awt.Color(153, 255, 153));
        listaAnotacoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        listaAnotacoes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listaAnotacoes.setForeground(new java.awt.Color(0, 153, 0));
        listaAnotacoes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaAnotacoes.setRequestFocusEnabled(false);
        listaAnotacoes.setSelectionBackground(new java.awt.Color(0, 218, 101));
        listaAnotacoes.setSelectionForeground(new java.awt.Color(0, 218, 101));
        jScrollPane1.setViewportView(listaAnotacoes);

        labelDica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDica.setForeground(new java.awt.Color(51, 51, 51));
        labelDica.setText("Dica");
        labelDica.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelInformacao02.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelInformacao02.setForeground(new java.awt.Color(51, 51, 51));
        labelInformacao02.setText("Informações do Resíduo");
        labelInformacao02.setToolTipText("");
        labelInformacao02.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelInformacao01.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelInformacao01.setForeground(new java.awt.Color(51, 51, 51));
        labelInformacao01.setText("Informações do Resíduo");

        labelTituloDica.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTituloDica.setText("Titulo da Dica");

        javax.swing.GroupLayout painelConteudoLoginLayout = new javax.swing.GroupLayout(painelConteudoLogin);
        painelConteudoLogin.setLayout(painelConteudoLoginLayout);
        painelConteudoLoginLayout.setHorizontalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                                .addComponent(textoAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(labelAnotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelInformacao02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInformacao01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDicas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTituloDica, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagemResiduo)
                        .addGap(105, 105, 105))))
        );
        painelConteudoLoginLayout.setVerticalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagemResiduo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInformacao01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInformacao02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnotacoes)
                    .addComponent(labelDicas))
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelTituloDica)
                        .addGap(26, 26, 26)
                        .addComponent(labelDica, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
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

    public static void fecharInstanciaAtual() {
        if (instanciaAtual != null) {
            instanciaAtual.dispose();
            instanciaAtual = null;
        }
    }

    private void labelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSairMouseClicked
        Usuario.encerrarSessao();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        TelaResiduos.fecharInstanciaAtual();
        fecharInstanciaAtual();
    }//GEN-LAST:event_labelSairMouseClicked

    @Override
    public void dispose() {
        super.dispose();
        instanciaAtual = null;
    }

    private void textoAnotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoAnotacaoActionPerformed

    }//GEN-LAST:event_textoAnotacaoActionPerformed

    public void filtrarResiduo(String nomeResiduo, String informacao01, String informacao02, Dica dica) {
        labelTitulo.setText(nomeResiduo);
        String html = "<html><body style='width: %1spx'>%1s</body></html>";
        labelInformacao01.setText(String.format(html, labelInformacao01.getWidth(), informacao01));
        labelInformacao02.setText(String.format(html, labelInformacao02.getWidth(), informacao02));
        labelTituloDica.setText(dica.getTitulo());
        labelDica.setText(String.format(html, labelDica.getWidth(), dica.getDescricao()));
    }

    public void setCorResiduo(int r, int g, int b) {
        Color corResiduo = new Color(r, g, b);
        labelTitulo.setForeground(corResiduo);
        labelTituloDica.setForeground(corResiduo);
    }

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
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel imagemResiduo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAnotacoes;
    private javax.swing.JLabel labelDica;
    private javax.swing.JLabel labelDicas;
    private javax.swing.JLabel labelInformacao01;
    private javax.swing.JLabel labelInformacao02;
    private javax.swing.JLabel labelSair;
    private javax.swing.JLabel labelSaudacao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloDica;
    private javax.swing.JList<String> listaAnotacoes;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelConteudoLogin;
    private javax.swing.JTextField textoAnotacao;
    // End of variables declaration//GEN-END:variables
}
