package com.usjt.recicle.app.view;

import com.usjt.recicle.app.controller.AnotacaoController;
import com.usjt.recicle.app.model.Anotacao;
import com.usjt.recicle.app.model.Dica;
import com.usjt.recicle.app.model.Usuario;
import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class TelaInformacoes extends javax.swing.JFrame {

    private static TelaInformacoes instanciaAtual;
    private Long id;
    private Long usuarioAtual;
    private JList<String> listaAnotacoes;

    public TelaInformacoes(long id, Long idUsuario) {
        this.id = id;
        this.usuarioAtual = idUsuario;
        initComponents();
        configurarImagem();
        instanciaAtual = this;
        preencherListaAnotacoes(id);
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
        labelSair = new javax.swing.JLabel();
        labelVoltar = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelAnotacoes = new javax.swing.JLabel();
        labelImagemResiduo = new javax.swing.JLabel();
        textoAnotacao = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAnotacoes = new javax.swing.JList<>();
        labelDica = new javax.swing.JLabel();
        labelInformacao02 = new javax.swing.JLabel();
        labelInformacao01 = new javax.swing.JLabel();
        labelTituloDica = new javax.swing.JLabel();
        labelListaResiduos = new javax.swing.JLabel();

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
        painelConteudoLogin.setDoubleBuffered(false);
        painelConteudoLogin.setMaximumSize(new java.awt.Dimension(850, 600));
        painelConteudoLogin.setMinimumSize(new java.awt.Dimension(850, 600));
        painelConteudoLogin.setPreferredSize(new java.awt.Dimension(850, 600));
        painelConteudoLogin.setRequestFocusEnabled(false);
        painelConteudoLogin.setVerifyInputWhenFocusTarget(false);

        labelDicas.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        labelDicas.setForeground(new java.awt.Color(0, 153, 0));
        labelDicas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDicas.setText("Dicas");
        labelDicas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        painelCabecalho.setBackground(new java.awt.Color(153, 255, 153));
        painelCabecalho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 8, true));
        painelCabecalho.setDoubleBuffered(false);
        painelCabecalho.setFocusable(false);
        painelCabecalho.setMaximumSize(new java.awt.Dimension(850, 60));
        painelCabecalho.setMinimumSize(new java.awt.Dimension(850, 60));
        painelCabecalho.setPreferredSize(new java.awt.Dimension(850, 60));
        painelCabecalho.setRequestFocusEnabled(false);
        painelCabecalho.setVerifyInputWhenFocusTarget(false);

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

        labelVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-voltar.png"))); // NOI18N
        labelVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
        painelCabecalho.setLayout(painelCabecalhoLayout);
        painelCabecalhoLayout.setHorizontalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 769, Short.MAX_VALUE)
                .addComponent(labelSair)
                .addContainerGap())
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSair, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        labelTitulo.setText("Resíduo");
        labelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelAnotacoes.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        labelAnotacoes.setForeground(new java.awt.Color(0, 153, 0));
        labelAnotacoes.setText("Anotações");
        labelAnotacoes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        labelImagemResiduo.setForeground(new java.awt.Color(51, 51, 51));
        labelImagemResiduo.setText("Imagem do Resíduo");

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
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        listaAnotacoes.setBackground(new java.awt.Color(153, 255, 153));
        listaAnotacoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        listaAnotacoes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listaAnotacoes.setForeground(new java.awt.Color(0, 153, 0));
        listaAnotacoes.setFocusable(false);
        listaAnotacoes.setRequestFocusEnabled(false);
        listaAnotacoes.setSelectionBackground(new java.awt.Color(0, 218, 101));
        listaAnotacoes.setSelectionForeground(new java.awt.Color(0, 218, 101));
        listaAnotacoes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAnotacoesValueChanged(evt);
            }
        });
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
        labelInformacao01.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelInformacao01.setText("Informações do Resíduo");
        labelInformacao01.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        labelTituloDica.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTituloDica.setText("Titulo da Dica");
        labelTituloDica.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labelTituloDica.setVerifyInputWhenFocusTarget(false);

        labelListaResiduos.setForeground(new java.awt.Color(51, 51, 51));
        labelListaResiduos.setText("Lista de Residuos");

        javax.swing.GroupLayout painelConteudoLoginLayout = new javax.swing.GroupLayout(painelConteudoLogin);
        painelConteudoLogin.setLayout(painelConteudoLoginLayout);
        painelConteudoLoginLayout.setHorizontalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelConteudoLoginLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDica, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelConteudoLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                                        .addGap(182, 182, 182)
                                        .addComponent(labelAnotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                                        .addComponent(textoAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelInformacao01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelInformacao02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85)))
                        .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                                .addComponent(labelImagemResiduo)
                                .addGap(242, 242, 242))
                            .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                                    .addComponent(labelListaResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40))
                                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelTituloDica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(10, 10, 10))
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelConteudoLoginLayout.setVerticalGroup(
            painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTitulo)
                .addGap(12, 12, 12)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInformacao01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelImagemResiduo))
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConteudoLoginLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelInformacao02, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(labelListaResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDicas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAnotacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTituloDica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConteudoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDica, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConteudoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void labelVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVoltarMouseClicked
        fecharInstanciaAtual();
    }//GEN-LAST:event_labelVoltarMouseClicked

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String anotacao = textoAnotacao.getText();
        Long idCategoriaResiduo = id;
        Long idUsuario = usuarioAtual;
        try {
            AnotacaoController anotacaoController = new AnotacaoController();
            boolean sucesso = anotacaoController.salvar(anotacao, idCategoriaResiduo, idUsuario);
            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Anotação salva com Sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                fecharInstanciaAtual();
            } else {
                JOptionPane.showMessageDialog(this, "O campo para anotação deve ser preenchido...", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void listaAnotacoesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAnotacoesValueChanged

    }//GEN-LAST:event_listaAnotacoesValueChanged

    private List<Anotacao> buscarAnotacoesCategoriaResiduo(Long id, Long idUsuario) {
        AnotacaoController anotacaoController = new AnotacaoController();
        return anotacaoController.buscarAnotacoesCategoriaResiduo(id, idUsuario);
    }

    public void preencherListaAnotacoes(Long id) {
        List<Anotacao> anotacoes = buscarAnotacoesCategoriaResiduo(id, usuarioAtual);

        List<String> descricoes = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            descricoes.add(anotacao.getDescricao());
        }

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String descricao : descricoes) {
            listModel.addElement(descricao);
        }
        listaAnotacoes.setModel(listModel);
    }

    public void filtrarResiduo(String nomeResiduo, String informacao01, String informacao02, Dica dica, String caminhoImagem) {
        labelTitulo.setText(nomeResiduo);

        String htmlTemplate = "<html><body style='width: %1spx'>%2s</body></html>";

        String formattedInformacao01 = formatTextForHtml(informacao01, 70);
        String formattedInformacao02 = formatTextForHtml(informacao02, 70);
        String formattedDicaDescricao = formatTextForHtml(dica.getDescricao(), 60);

        labelInformacao01.setText(String.format(htmlTemplate, labelInformacao01.getWidth(), formattedInformacao01));
        labelInformacao02.setText(String.format(htmlTemplate, labelInformacao02.getWidth(), formattedInformacao02));
        labelTituloDica.setText(dica.getTitulo());
        labelDica.setText(String.format(htmlTemplate, labelDica.getWidth(), formattedDicaDescricao));

        java.net.URL imgURL = getClass().getResource(caminhoImagem);
        if (imgURL != null) {
            System.out.println("Carregando imagem de: " + imgURL);
            ImageIcon imagemResiduo = new ImageIcon(imgURL);
            labelImagemResiduo.setIcon(imagemResiduo);
            labelImagemResiduo.setText("");
        } else {
            System.err.println("Erro ao carregar a imagem: " + caminhoImagem);
        }
    }

    private String formatTextForHtml(String text, int lineLength) {
        StringBuilder formattedText = new StringBuilder();
        String[] words = text.split(" ");
        int currentLineLength = 0;

        for (String word : words) {
            if (currentLineLength + word.length() > lineLength) {
                formattedText.append("<br>");
                currentLineLength = 0;
            }
            formattedText.append(word).append(" ");
            currentLineLength += word.length() + 1;
        }

        return formattedText.toString().trim();
    }

    public void setCorResiduo(int r, int g, int b) {
        Color corResiduo = new Color(r, g, b);
        labelTitulo.setForeground(corResiduo);
        labelTituloDica.setForeground(corResiduo);
    }

    private void configurarImagem() {
        URL imgURL = getClass().getResource("/imagens/icone-reciclagem.png");
        if (imgURL != null) {
            labelImagemResiduo.setIcon(new ImageIcon(imgURL));
        } else {
            System.err.println("Não foi possível encontrar o arquivo de imagem.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAnotacoes;
    private javax.swing.JLabel labelDica;
    private javax.swing.JLabel labelDicas;
    private javax.swing.JLabel labelImagemResiduo;
    private javax.swing.JLabel labelInformacao01;
    private javax.swing.JLabel labelInformacao02;
    private javax.swing.JLabel labelListaResiduos;
    private javax.swing.JLabel labelSair;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloDica;
    private javax.swing.JLabel labelVoltar;
    private DefaultListModel<Anotacao> listaAnotacoesModel;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelConteudoLogin;
    private javax.swing.JTextField textoAnotacao;
    // End of variables declaration//GEN-END:variables
}
