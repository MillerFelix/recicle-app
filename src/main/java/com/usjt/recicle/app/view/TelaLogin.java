package com.usjt.recicle.app.view;

import com.usjt.recicle.app.controller.UsuarioController;
import com.usjt.recicle.app.model.Usuario;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        configurarImagem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConteudoLogin = new javax.swing.JPanel();
        painelFormularios = new javax.swing.JPanel();
        textoEmail = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();
        LabelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConteudoLogin.setBackground(new java.awt.Color(204, 255, 204));
        painelConteudoLogin.setMaximumSize(new java.awt.Dimension(850, 600));
        painelConteudoLogin.setPreferredSize(new java.awt.Dimension(850, 600));

        painelFormularios.setBackground(new java.awt.Color(204, 255, 204));
        painelFormularios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 8, true));
        painelFormularios.setPreferredSize(new java.awt.Dimension(480, 450));

        textoEmail.setBackground(new java.awt.Color(153, 255, 153));
        textoEmail.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoEmail.setForeground(new java.awt.Color(0, 153, 0));
        textoEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoEmail.setToolTipText("Digite seu email cadastrado");
        textoEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        textoEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        textoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailActionPerformed(evt);
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
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-recicle.png"))); // NOI18N

        textoSenha.setBackground(new java.awt.Color(153, 255, 153));
        textoSenha.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoSenha.setForeground(new java.awt.Color(0, 153, 0));
        textoSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoSenha.setToolTipText("Digite a senha");
        textoSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));

        LabelEmail.setForeground(new java.awt.Color(0, 153, 0));
        LabelEmail.setText("Email:");

        labelSenha.setForeground(new java.awt.Color(0, 153, 0));
        labelSenha.setText("Senha:");

        botaoCadastrar.setBackground(new java.awt.Color(204, 255, 204));
        botaoCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 153, 0));
        botaoCadastrar.setText("Não tem cadastro? Cadastre-se aqui!");
        botaoCadastrar.setBorder(null);
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

        javax.swing.GroupLayout painelFormulariosLayout = new javax.swing.GroupLayout(painelFormularios);
        painelFormularios.setLayout(painelFormulariosLayout);
        painelFormulariosLayout.setHorizontalGroup(
            painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                        .addComponent(labelImagem)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                        .addGroup(painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
            .addGroup(painelFormulariosLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelFormulariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelFormulariosLayout.setVerticalGroup(
            painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                .addComponent(labelImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 33)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        labelTitulo.setText("Recicle");

        javax.swing.GroupLayout painelConteudoLoginLayout = new javax.swing.GroupLayout(painelConteudoLogin);
        painelConteudoLogin.setLayout(painelConteudoLoginLayout);
        painelConteudoLoginLayout.setHorizontalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                        .addComponent(painelFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(346, 346, 346))))
        );
        painelConteudoLoginLayout.setVerticalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmailActionPerformed

    }//GEN-LAST:event_textoEmailActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        String email = textoEmail.getText();
        String senha = new String(textoSenha.getPassword());
        
        if (validarCredenciais(email, senha)) {
            Usuario usuarioAtual = Usuario.getUsuarioAtual();
            TelaResiduos telaResiduos = new TelaResiduos(usuarioAtual);
            telaResiduos.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Credenciais erradas, verifique email e senha...", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoEntrarActionPerformed

    public boolean validarCredenciais(String email, String senha) {
        UsuarioController usuarioController = new UsuarioController();
        return usuarioController.validarCredenciais(email, senha);
    }

    private void configurarImagem() {
        URL imgURL = getClass().getResource("/imagens/logo-recicle.png");
        if (imgURL != null) {
            labelImagem.setIcon(new ImageIcon(imgURL));
        } else {
            System.err.println("Não foi possível encontrar o arquivo de imagem.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelConteudoLogin;
    private javax.swing.JPanel painelFormularios;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JPasswordField textoSenha;
    // End of variables declaration//GEN-END:variables
}
