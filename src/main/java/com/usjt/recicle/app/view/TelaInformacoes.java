package com.usjt.recicle.app.view;

import com.usjt.recicle.app.controller.AnotacaoController;
import com.usjt.recicle.app.controller.ResiduoController;
import com.usjt.recicle.app.model.Anotacao;
import com.usjt.recicle.app.model.Dica;
import com.usjt.recicle.app.model.Residuo;
import com.usjt.recicle.app.model.Usuario;
import java.awt.Color;
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
    private List<Anotacao> anotacoes = new ArrayList<>();

    ;

    public TelaInformacoes(long id, Long idUsuario) {
        this.id = id;
        this.usuarioAtual = idUsuario;
        initComponents();
        instanciaAtual = this;
        preencherListaAnotacoes(id);
        preencherListaResiduos(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        painelConteudo = new javax.swing.JPanel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        listaResiduos = new javax.swing.JList<>();
        labelExemplosResiduos = new javax.swing.JLabel();

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

        painelConteudo.setBackground(new java.awt.Color(204, 255, 204));
        painelConteudo.setDoubleBuffered(false);
        painelConteudo.setMaximumSize(new java.awt.Dimension(850, 600));
        painelConteudo.setMinimumSize(new java.awt.Dimension(850, 600));
        painelConteudo.setPreferredSize(new java.awt.Dimension(850, 600));
        painelConteudo.setRequestFocusEnabled(false);
        painelConteudo.setVerifyInputWhenFocusTarget(false);

        labelDicas.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        labelDicas.setForeground(new java.awt.Color(0, 153, 0));
        labelDicas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        labelVoltar.setToolTipText("Voltar");
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
        labelAnotacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAnotacoes.setText("Anotações");
        labelAnotacoes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        labelImagemResiduo.setForeground(new java.awt.Color(51, 51, 51));
        labelImagemResiduo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagemResiduo.setText("Imagem do Resíduo");
        labelImagemResiduo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelImagemResiduo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelImagemResiduo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        textoAnotacao.setBackground(new java.awt.Color(153, 255, 153));
        textoAnotacao.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoAnotacao.setForeground(new java.awt.Color(0, 153, 0));
        textoAnotacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoAnotacao.setToolTipText("Escreva sua anotação");
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
        listaAnotacoes.setToolTipText("Selecione para editar ou excluir");
        listaAnotacoes.setFocusable(false);
        listaAnotacoes.setRequestFocusEnabled(false);
        listaAnotacoes.setSelectionBackground(new java.awt.Color(204, 255, 204));
        listaAnotacoes.setSelectionForeground(new java.awt.Color(204, 255, 204));
        listaAnotacoes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAnotacoesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaAnotacoes);
        listaAnotacoes.getAccessibleContext().setAccessibleDescription("");

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
        labelInformacao01.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelInformacao01.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        labelTituloDica.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTituloDica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloDica.setText("Titulo da Dica");
        labelTituloDica.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        labelTituloDica.setVerifyInputWhenFocusTarget(false);

        listaResiduos.setBackground(new java.awt.Color(204, 255, 204));
        listaResiduos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 218, 101), 4, true));
        listaResiduos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        listaResiduos.setForeground(new java.awt.Color(0, 153, 0));
        listaResiduos.setAutoscrolls(false);
        listaResiduos.setFocusable(false);
        listaResiduos.setRequestFocusEnabled(false);
        listaResiduos.setSelectionBackground(new java.awt.Color(204, 255, 204));
        listaResiduos.setSelectionForeground(new java.awt.Color(204, 255, 204));
        listaResiduos.setVerifyInputWhenFocusTarget(false);
        listaResiduos.setVisibleRowCount(6);
        jScrollPane2.setViewportView(listaResiduos);

        labelExemplosResiduos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelExemplosResiduos.setForeground(new java.awt.Color(0, 153, 0));
        labelExemplosResiduos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelExemplosResiduos.setText("Exemplos de Resídos:");
        labelExemplosResiduos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelExemplosResiduos.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout painelConteudoLayout = new javax.swing.GroupLayout(painelConteudo);
        painelConteudo.setLayout(painelConteudoLayout);
        painelConteudoLayout.setHorizontalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInformacao01, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelInformacao02, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnotacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelConteudoLayout.createSequentialGroup()
                        .addComponent(textoAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelDicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTituloDica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelImagemResiduo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(labelExemplosResiduos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelConteudoLayout.setVerticalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addComponent(painelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConteudoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTitulo)
                        .addGap(20, 20, 20)
                        .addComponent(labelInformacao01, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelInformacao02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAnotacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(painelConteudoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labelImagemResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(labelExemplosResiduos)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(labelDicas)
                        .addGap(12, 12, 12)
                        .addComponent(labelTituloDica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 66, Short.MAX_VALUE))))
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
                textoAnotacao.setText("");
                preencherListaAnotacoes(id);
            } else {
                JOptionPane.showMessageDialog(this, "O campo para anotação deve ser preenchido...", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void listaAnotacoesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAnotacoesValueChanged
        if (!evt.getValueIsAdjusting()) {
            Anotacao anotacaoSelecionada = selecionarAnotacao();
            if (anotacaoSelecionada != null) {
                mostrarOpcaoEditarExcluir(anotacaoSelecionada);
            }
        }
    }//GEN-LAST:event_listaAnotacoesValueChanged

    private void editarAnotacao(Anotacao anotacao) {
        String novaDescricao = JOptionPane.showInputDialog(null, "Digite a nova descrição:", anotacao.getDescricao());
        if (novaDescricao != null && !novaDescricao.trim().isEmpty()) {
            AnotacaoController anotacaoController = new AnotacaoController();
            anotacao.setDescricao(novaDescricao);
            anotacaoController.editar(anotacao);
            preencherListaAnotacoes(id);
        }
    }

    private void excluirAnotacao(Anotacao anotacao) {
        Object[] options = {"Sim", "Não"};
        int confirm = JOptionPane.showOptionDialog(null,
                "Tem certeza que deseja excluir esta anotação?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (confirm == JOptionPane.YES_OPTION) {
            AnotacaoController anotacaoController = new AnotacaoController();
            anotacaoController.excluir(anotacao);
            preencherListaAnotacoes(id); 
        }
    }

    private Anotacao selecionarAnotacao() {
        int selectedIndex = listaAnotacoes.getSelectedIndex();
        if (selectedIndex != -1 && anotacoes != null && !anotacoes.isEmpty()) {
            return anotacoes.get(selectedIndex);
        }
        return null;
    }

    private void mostrarOpcaoEditarExcluir(Anotacao anotacao) {
        String[] options = {"Editar", "Excluir"};
        int opcao = JOptionPane.showOptionDialog(null,
                "Deseja editar ou excluir a anotação?",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (opcao == 0) {
            editarAnotacao(anotacao);
        } else if (opcao == 1) {
            excluirAnotacao(anotacao);
        }
    }

    private List<Anotacao> buscarAnotacoesCategoriaResiduo(Long id, Long idUsuario) {
        AnotacaoController anotacaoController = new AnotacaoController();
        return anotacaoController.buscarAnotacoesCategoriaResiduo(id, idUsuario);
    }

    private List<Residuo> buscarResiduosCategoria(Long id) {
        ResiduoController residuoController = new ResiduoController();
        return residuoController.buscarResiduosPorCategoriaId(id);
    }

    public void preencherListaAnotacoes(Long id) {
        anotacoes = buscarAnotacoesCategoriaResiduo(id, usuarioAtual);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Anotacao anotacao : anotacoes) {
            listModel.addElement(anotacao.getDescricao());
        }
        listaAnotacoes.setModel(listModel);
    }

    public void preencherListaResiduos(Long id) {
        List<Residuo> residuos = buscarResiduosCategoria(id);

        List<String> nomesResiduos = new ArrayList<>();
        for (Residuo residuo : residuos) {
            nomesResiduos.add(residuo.getNome());
        }

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String nome : nomesResiduos) {
            listModel.addElement(nome);
        }
        listaResiduos.setModel(listModel);
    }

    public void filtrarResiduo(String nomeResiduo, String informacao01, String informacao02, Dica dica, String caminhoImagem, List<Residuo> residuos) {
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
        listaResiduos.setForeground(corResiduo);
        listaAnotacoes.setForeground(corResiduo);
        textoAnotacao.setForeground(corResiduo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAnotacoes;
    private javax.swing.JLabel labelDica;
    private javax.swing.JLabel labelDicas;
    private javax.swing.JLabel labelExemplosResiduos;
    private javax.swing.JLabel labelImagemResiduo;
    private javax.swing.JLabel labelInformacao01;
    private javax.swing.JLabel labelInformacao02;
    private javax.swing.JLabel labelSair;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloDica;
    private javax.swing.JLabel labelVoltar;
    private javax.swing.JList<String> listaResiduos;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelConteudo;
    private javax.swing.JTextField textoAnotacao;
    // End of variables declaration//GEN-END:variables
}
