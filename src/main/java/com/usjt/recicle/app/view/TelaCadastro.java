package com.usjt.recicle.app.view;

import com.usjt.recicle.app.controller.UsuarioController;
import java.net.URL;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        configurarImagem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConteudoLogin = new javax.swing.JPanel();
        painelFormularios = new javax.swing.JPanel();
        textoNomeUsuario = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();
        LabelNomeUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        textoEmail = new javax.swing.JTextField();
        LabelEmail = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConteudoLogin.setBackground(new java.awt.Color(204, 255, 204));

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

        botaoSalvar.setBackground(new java.awt.Color(0, 153, 0));
        botaoSalvar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(204, 255, 204));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 184, 35), 4));
        botaoSalvar.setContentAreaFilled(false);
        botaoSalvar.setFocusPainted(false);
        botaoSalvar.setFocusable(false);
        botaoSalvar.setOpaque(true);
        botaoSalvar.setPreferredSize(new java.awt.Dimension(115, 34));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo-recicle.png"))); // NOI18N

        textoSenha.setBackground(new java.awt.Color(153, 255, 153));
        textoSenha.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoSenha.setForeground(new java.awt.Color(0, 153, 0));
        textoSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoSenha.setToolTipText("Digite a Senha");
        textoSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        textoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSenhaActionPerformed(evt);
            }
        });

        LabelNomeUsuario.setForeground(new java.awt.Color(0, 153, 0));
        LabelNomeUsuario.setText("Nome:");

        labelSenha.setForeground(new java.awt.Color(0, 153, 0));
        labelSenha.setText("Senha:");

        textoEmail.setBackground(new java.awt.Color(153, 255, 153));
        textoEmail.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoEmail.setForeground(new java.awt.Color(0, 153, 0));
        textoEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoEmail.setToolTipText("Digite o nome de Usuário");
        textoEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        textoEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        textoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEmailActionPerformed(evt);
            }
        });

        LabelEmail.setForeground(new java.awt.Color(0, 153, 0));
        LabelEmail.setText("Email:");

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
                            .addComponent(LabelNomeUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
        );
        painelFormulariosLayout.setVerticalGroup(
            painelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormulariosLayout.createSequentialGroup()
                .addComponent(labelImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        labelTitulo.setText("Cadastre-se");

        javax.swing.GroupLayout painelConteudoLoginLayout = new javax.swing.GroupLayout(painelConteudoLogin);
        painelConteudoLogin.setLayout(painelConteudoLoginLayout);
        painelConteudoLoginLayout.setHorizontalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                        .addComponent(painelFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(280, 280, 280))))
        );
        painelConteudoLoginLayout.setVerticalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = textoNomeUsuario.getText();
        String email = textoEmail.getText();
        char[] senhaCharArray = textoSenha.getPassword();
        String senha = new String(senhaCharArray);

        Arrays.fill(senhaCharArray, '0');

        try {
            UsuarioController usuarioController = new UsuarioController();
            boolean sucesso = usuarioController.cadastrarUsuario(nome, email, senha);
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void textoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEmailActionPerformed

    }//GEN-LAST:event_textoEmailActionPerformed

    private void textoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSenhaActionPerformed

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
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelNomeUsuario;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelConteudoLogin;
    private javax.swing.JPanel painelFormularios;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoNomeUsuario;
    private javax.swing.JPasswordField textoSenha;
    // End of variables declaration//GEN-END:variables
}
