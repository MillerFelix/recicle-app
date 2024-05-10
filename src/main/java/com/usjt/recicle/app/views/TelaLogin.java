package com.usjt.recicle.app.views;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConteudoLogin = new javax.swing.JPanel();
        painelFormularios = new javax.swing.JPanel();
        textoNomeUsuario = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();
        LabelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConteudoLogin.setBackground(new java.awt.Color(60, 243, 139));

        painelFormularios.setBackground(new java.awt.Color(204, 255, 204));
        painelFormularios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 8, true));
        painelFormularios.setPreferredSize(new java.awt.Dimension(480, 450));

        textoNomeUsuario.setBackground(new java.awt.Color(153, 255, 153));
        textoNomeUsuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoNomeUsuario.setForeground(new java.awt.Color(0, 153, 0));
        textoNomeUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoNomeUsuario.setToolTipText("Digite o nome de Usuário");
        textoNomeUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        textoNomeUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        textoNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeUsuarioActionPerformed(evt);
            }
        });

        botaoEntrar.setBackground(new java.awt.Color(0, 153, 0));
        botaoEntrar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(204, 255, 204));
        botaoEntrar.setText("Entrar");
        botaoEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 184, 35), 4));
        botaoEntrar.setContentAreaFilled(false);
        botaoEntrar.setFocusPainted(false);
        botaoEntrar.setFocusable(false);
        botaoEntrar.setOpaque(true);

        botaoCadastrar.setBackground(new java.awt.Color(0, 153, 0));
        botaoCadastrar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(204, 255, 204));
        botaoCadastrar.setText("Cadastre-se");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 184, 35), 4));
        botaoCadastrar.setContentAreaFilled(false);
        botaoCadastrar.setFocusPainted(false);
        botaoCadastrar.setFocusable(false);
        botaoCadastrar.setOpaque(true);
        botaoCadastrar.setPreferredSize(new java.awt.Dimension(115, 34));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-recicle.png"))); // NOI18N

        textoSenha.setBackground(new java.awt.Color(153, 255, 153));
        textoSenha.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoSenha.setForeground(new java.awt.Color(0, 153, 0));
        textoSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoSenha.setToolTipText("Digite a Senha");
        textoSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));

        LabelUsuario.setForeground(new java.awt.Color(0, 153, 0));
        LabelUsuario.setText("Usuário:");

        labelSenha.setForeground(new java.awt.Color(0, 153, 0));
        labelSenha.setText("Senha:");

        javax.swing.GroupLayout painelFormulariosLayout = new javax.swing.GroupLayout(painelFormularios);
        painelFormularios.setLayout(painelFormulariosLayout);
        painelFormulariosLayout.setHorizontalGroup(
            painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormulariosLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                        .addComponent(labelImagem)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                        .addGroup(painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoNomeUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                        .addGroup(painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(165, 165, 165))))
        );
        painelFormulariosLayout.setVerticalGroup(
            painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                .addComponent(labelImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        labelTitulo.setText("Recicle");

        javax.swing.GroupLayout painelConteudoLoginLayout = new javax.swing.GroupLayout(painelConteudoLogin);
        painelConteudoLogin.setLayout(painelConteudoLoginLayout);
        painelConteudoLoginLayout.setHorizontalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                        .addComponent(painelFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))))
        );
        painelConteudoLoginLayout.setVerticalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeUsuarioActionPerformed

    }//GEN-LAST:event_textoNomeUsuarioActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

    }//GEN-LAST:event_botaoCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelConteudoLogin;
    private javax.swing.JPanel painelFormularios;
    private javax.swing.JTextField textoNomeUsuario;
    private javax.swing.JPasswordField textoSenha;
    // End of variables declaration//GEN-END:variables
}
