//MATHEUS KODI Y. RA 2503557
package com.mycompany.projetofinal;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class cadBlusaFrio extends javax.swing.JFrame {
    private static cadBlusaFrio cadBlusaFrioUnico;
    private BlusaFrio blu;
    private cadBlusaFrio() {
        initComponents();
    }
    public static cadBlusaFrio getCadBlusaFrio(){
        if(cadBlusaFrioUnico == null){
            cadBlusaFrioUnico = new cadBlusaFrio();
        }
        return cadBlusaFrioUnico;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGrupoTamanho = new javax.swing.ButtonGroup();
        btGrupoGenero = new javax.swing.ButtonGroup();
        btGrupoDesconto = new javax.swing.ButtonGroup();
        btGrupoCapuz = new javax.swing.ButtonGroup();
        btGrupoZiper = new javax.swing.ButtonGroup();
        rotTituloBlusaFrio = new javax.swing.JLabel();
        labMarca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cxMarca = new javax.swing.JTextPane();
        labModelo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cxModelo = new javax.swing.JTextPane();
        labCor = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cxCor = new javax.swing.JTextPane();
        labTamanho = new javax.swing.JLabel();
        radBtTamPp = new javax.swing.JRadioButton();
        radBtTamP = new javax.swing.JRadioButton();
        radBtTamM = new javax.swing.JRadioButton();
        radBtTamG = new javax.swing.JRadioButton();
        radBtTamGg = new javax.swing.JRadioButton();
        labMaterial = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cxMaterial = new javax.swing.JTextPane();
        labPreco = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        cxPreco = new javax.swing.JTextPane();
        labDescricao = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        cxDescricao = new javax.swing.JTextPane();
        labGenero = new javax.swing.JLabel();
        radBtGeneroM = new javax.swing.JRadioButton();
        radBtGeneroF = new javax.swing.JRadioButton();
        radBtGeneroU = new javax.swing.JRadioButton();
        labDesconto = new javax.swing.JLabel();
        radBtDescontoS = new javax.swing.JRadioButton();
        radBtDescontoN = new javax.swing.JRadioButton();
        btAdicionar = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();
        btConsultar = new javax.swing.JToggleButton();
        btEditar = new javax.swing.JToggleButton();
        btLimpar = new javax.swing.JToggleButton();
        labCodigo = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        cxCodigo = new javax.swing.JTextPane();
        btRelatorio = new javax.swing.JToggleButton();
        labBlusaForro = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        cxForro = new javax.swing.JTextPane();
        labBlusaCapuz = new javax.swing.JLabel();
        radBtCapuzS = new javax.swing.JRadioButton();
        radBtCapuzN = new javax.swing.JRadioButton();
        labBlusaZiper = new javax.swing.JLabel();
        radBtZiperS = new javax.swing.JRadioButton();
        radBtZiperN = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotTituloBlusaFrio.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rotTituloBlusaFrio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotTituloBlusaFrio.setText("CADASTRO DE BLUSA DE FRIO");

        labMarca.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labMarca.setText("MARCA");

        jScrollPane1.setViewportView(cxMarca);

        labModelo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labModelo.setText("MODELO");

        jScrollPane2.setViewportView(cxModelo);

        labCor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCor.setText("COR");

        jScrollPane3.setViewportView(cxCor);

        labTamanho.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labTamanho.setText("TAMANHO");

        btGrupoTamanho.add(radBtTamPp);
        radBtTamPp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtTamPp.setText("PP");

        btGrupoTamanho.add(radBtTamP);
        radBtTamP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtTamP.setText("P");

        btGrupoTamanho.add(radBtTamM);
        radBtTamM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtTamM.setText("M");

        btGrupoTamanho.add(radBtTamG);
        radBtTamG.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtTamG.setText("G");

        btGrupoTamanho.add(radBtTamGg);
        radBtTamGg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtTamGg.setText("GG");

        labMaterial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labMaterial.setText("MATERIAL");

        jScrollPane4.setViewportView(cxMaterial);

        labPreco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labPreco.setText("PRECO");

        jScrollPane5.setViewportView(cxPreco);

        labDescricao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labDescricao.setText("DESCRICAO DO PRODUTO");

        jScrollPane6.setViewportView(cxDescricao);

        labGenero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labGenero.setText("GENERO");

        btGrupoGenero.add(radBtGeneroM);
        radBtGeneroM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtGeneroM.setText("MASCULINO");

        btGrupoGenero.add(radBtGeneroF);
        radBtGeneroF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtGeneroF.setText("FEMININO");
        radBtGeneroF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtGeneroFActionPerformed(evt);
            }
        });

        btGrupoGenero.add(radBtGeneroU);
        radBtGeneroU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtGeneroU.setText("UNISSEX");

        labDesconto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labDesconto.setText("DESCONTO");

        btGrupoDesconto.add(radBtDescontoS);
        radBtDescontoS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtDescontoS.setText("SIM");

        btGrupoDesconto.add(radBtDescontoN);
        radBtDescontoN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtDescontoN.setText("NAO");
        radBtDescontoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtDescontoNActionPerformed(evt);
            }
        });

        btAdicionar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btAdicionar.setText("ADICIONAR");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btExcluir.setText("EXCLUIR PELO CODIGO");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConsultar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btConsultar.setText("CONSULTAR PELO CODIGO");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btEditar.setText("EDITAR PELO CODIGO");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        labCodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCodigo.setText("CODIGO");

        jScrollPane8.setViewportView(cxCodigo);

        btRelatorio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btRelatorio.setText("RELATORIO");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        labBlusaForro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labBlusaForro.setText("FORRO");

        jScrollPane7.setViewportView(cxForro);

        labBlusaCapuz.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labBlusaCapuz.setText("CAPUZ");

        btGrupoCapuz.add(radBtCapuzS);
        radBtCapuzS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCapuzS.setText("SIM");

        btGrupoCapuz.add(radBtCapuzN);
        radBtCapuzN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCapuzN.setText("NAO");
        radBtCapuzN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtCapuzNActionPerformed(evt);
            }
        });

        labBlusaZiper.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labBlusaZiper.setText("ZIPER");

        btGrupoZiper.add(radBtZiperS);
        radBtZiperS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtZiperS.setText("SIM");

        btGrupoZiper.add(radBtZiperN);
        radBtZiperN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtZiperN.setText("NAO");
        radBtZiperN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtZiperNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labDescricao)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labBlusaForro)
                                    .addComponent(labBlusaCapuz)
                                    .addComponent(labBlusaZiper))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtCapuzS)
                                        .addGap(18, 18, 18)
                                        .addComponent(radBtCapuzN))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtZiperS)
                                        .addGap(18, 18, 18)
                                        .addComponent(radBtZiperN))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btExcluir))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btConsultar)
                                    .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btEditar)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labCor)
                            .addComponent(labMaterial)
                            .addComponent(labMarca)
                            .addComponent(labCodigo)
                            .addComponent(labModelo))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labDesconto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radBtDescontoS)
                                .addGap(18, 18, 18)
                                .addComponent(radBtDescontoN))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labPreco)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labTamanho, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labGenero)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radBtGeneroM)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radBtGeneroF))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radBtTamPp)
                                                .addGap(18, 18, 18)
                                                .addComponent(radBtTamP)
                                                .addGap(18, 18, 18)
                                                .addComponent(radBtTamM)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radBtTamG)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radBtGeneroU)
                                            .addComponent(radBtTamGg)))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(rotTituloBlusaFrio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(rotTituloBlusaFrio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labCodigo)
                                .addComponent(labPreco)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labMarca)
                                .addGap(18, 18, 18)
                                .addComponent(labModelo)
                                .addGap(20, 20, 20)
                                .addComponent(labCor))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labTamanho)
                                            .addComponent(radBtTamPp)
                                            .addComponent(radBtTamP)
                                            .addComponent(radBtTamM)
                                            .addComponent(radBtTamG)
                                            .addComponent(radBtTamGg))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labGenero)
                                            .addComponent(radBtGeneroM)
                                            .addComponent(radBtGeneroF)
                                            .addComponent(radBtGeneroU))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(labDesconto)
                                                .addComponent(radBtDescontoS))
                                            .addComponent(radBtDescontoN))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labMaterial))
                        .addGap(18, 18, 18)
                        .addComponent(labDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labBlusaForro))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radBtCapuzS)
                        .addComponent(labBlusaCapuz))
                    .addComponent(radBtCapuzN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labBlusaZiper)
                    .addComponent(radBtZiperS)
                    .addComponent(radBtZiperN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radBtGeneroFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtGeneroFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtGeneroFActionPerformed

    private void radBtDescontoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtDescontoNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtDescontoNActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        try {
            if(Verificar() == 0){
                AdicionarBlusaFrio();
                Limpar();
            } else {
                JOptionPane.showMessageDialog(
        null,
              "Cadastro nao foi realizado, por favor corrigir os erros e tente novamente",
               "CADASTRO NAO REALIZADO",
           JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (PrecoException pe) {
            pe.msg();
        } catch (CodigoException ce) {
            ce.msg();
        } catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > NO CODIGO E PRECO APENAS NUMEROS <- ERRO",
           "EXCEPTION NUMBER FORMAT",
       JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            ExcluirBlusaFrio();
            Limpar();
        } catch (CodigoException ce) {
            ce.msg();
        } catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > CODIGO DEVE CONTER APENAS NUMEROS <- ERRO",
           "EXCEPTION NUMBER FORMAT",
       JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        try {
            ConsultarBlusaFrio();
        } catch (CodigoException ce) {
            ce.msg();
        } catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > CODIGO DEVE CONTER APENAS NUMEROS <- ERRO",
           "EXCEPTION NUMBER FORMAT",
       JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        try {
            if(Verificar() == 0){
                EditarBlusaFrio();
                Limpar();
            } else {
                JOptionPane.showMessageDialog(
        null,
              "Editar a Blusa de Frio nao foi realizado, por favor corrigir os erros e tente novamente",
               "EDITAR NAO REALIZADO",
           JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (CodigoException ce) {
            ce.msg();
        } catch (PrecoException pe) {
            pe.msg();
        } catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(
    null,
          "ERRO - > CODIGO E O PRECO DEVE CONTER APENAS NUMEROS <- ERRO",
           "EXCEPTION NUMBER FORMAT",
       JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        RelatorioBlusaFrio.getRelatorioBlusaFrio().setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void radBtCapuzNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtCapuzNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtCapuzNActionPerformed

    private void radBtZiperNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtZiperNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtZiperNActionPerformed
  
    public void AdicionarBlusaFrio() throws PrecoException, CodigoException{
        blu = new BlusaFrio();
        try{
           blu.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        blu.setMarca(cxMarca.getText());
        blu.setModelo(cxModelo.getText());
        blu.setCor(cxCor.getText());
        blu.setMaterial(cxMaterial.getText());
        if(radBtDescontoS.isSelected() == true){
            blu.setDesconto("s");
        } else if(radBtDescontoN.isSelected() == true){
            blu.setDesconto("n");
        }
        try{
            blu.setPreco(Double.parseDouble(cxPreco.getText()));
            if(blu.getDesconto() == true){
                blu.setPreco(blu.calcularDesconto());
            }
        }
        catch(PrecoException pe){
            pe.msg();
            blu = pe.corrigePrecoBlusaFrio(blu);
        }
        catch(NumberFormatException ne){
            PrecoException pe = new PrecoException();
            pe.msg();
            blu = pe.corrigePrecoBlusaFrio(blu);
        }
        if(radBtTamPp.isSelected()== true){
            blu.setTamanho("PP");
        } else if(radBtTamP.isSelected() == true){
            blu.setTamanho("P");
        } else if(radBtTamM.isSelected() == true){
            blu.setTamanho("M");
        } else if(radBtTamG.isSelected() == true){
            blu.setTamanho("G");
        } else if(radBtTamGg.isSelected() == true){
            blu.setTamanho("GG");
        }     
        if(radBtGeneroM.isSelected() == true){
            blu.setGenero("Masculino");
        } else if(radBtGeneroF.isSelected() == true){
            blu.setGenero("Feminino");
        } else if(radBtGeneroU.isSelected() == true){
            blu.setGenero("Unissex");
        }
        blu.setDescricao(cxDescricao.getText());
        blu.setForro(cxForro.getText());
        if(radBtCapuzS.isSelected() == true){
            blu.setCapuz("s");
        } else if(radBtCapuzN.isSelected()){
            blu.setCapuz("n");
        }
        if(radBtZiperS.isSelected() == true){
            blu.setZiper("s");
        } else if(radBtZiperN.isSelected()){
            blu.setZiper("n");
        }
        blu = BancoRoupa.getBancoRoupa().cadBlusaFrio(blu);
        if(blu != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! Blusa de Frio Cadastrado com Sucesso - !",
                    "Cadastro de Roupa - Blusa",
                    1
            ); 
        } else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Blusa de Frio ja esta cadastrado - !",
                    "Cadastro de Roupa - Blusa",
                    1
            );             
        } 
    }
    public void ExcluirBlusaFrio() throws CodigoException{
        blu = new BlusaFrio();
        try{
           blu.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        blu = BancoRoupa.getBancoRoupa().delBlusaFrio(blu);
        if(blu != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! - Blusa nao encontrada - !",
                    "Excluir Blusa",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "! - Blusa Excluida com sucesso - !",
                    "Excluir Blusa",
                    1
            );
        }
    }
    public void ConsultarBlusaFrio() throws CodigoException{
        blu = new BlusaFrio();
        try{
           blu.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        blu = BancoRoupa.getBancoRoupa().consBlusaFrio(blu);
        if(blu != null){
            cxMarca.setText(blu.getMarca());
            cxModelo.setText(blu.getModelo());
            cxCor.setText(blu.getCor());
            cxMaterial.setText(blu.getMaterial());
            cxPreco.setText(String.valueOf(blu.getPreco()));
            if(blu.getTamanho().equalsIgnoreCase("pp")){
                radBtTamPp.setSelected(true);
            } else if(blu.getTamanho().equalsIgnoreCase("p")){
                radBtTamP.setSelected(true);
            } else if(blu.getTamanho().equalsIgnoreCase("m")){
                radBtTamM.setSelected(true);
            } else if(blu.getTamanho().equalsIgnoreCase("g")){
                radBtTamG.setSelected(true);
            } else if(blu.getTamanho().equalsIgnoreCase("gg")){
                radBtTamGg.setSelected(true);
            }
            if(blu.getGenero().equalsIgnoreCase("masculino")){
                radBtGeneroM.setSelected(true);
            } else if(blu.getGenero().equalsIgnoreCase("feminino")){
                radBtGeneroF.setSelected(true);
            } else if(blu.getGenero().equalsIgnoreCase("unissex")){
                radBtGeneroU.setSelected(true);
            }
            if(blu.getDesconto() == true){
                radBtDescontoS.setSelected(true);
            } else {
                radBtDescontoN.setSelected(true);
            }
            cxDescricao.setText(blu.getDescricao());
            if(blu.getCapuz() == true){
                radBtCapuzS.setSelected(true);
            } else if(blu.getCapuz() == false){
                radBtCapuzN.setSelected(true);
            }
            if(blu.getZiper() == true){
                radBtZiperS.setSelected(true);
            } else if(blu.getZiper() == false){
                radBtZiperN.setSelected(true);
            }
            cxForro.setText(blu.getForro());
            JOptionPane.showMessageDialog(
                    null,
                    "! - Blusa de Frio encontrada, confira os dados - !",
                    "Consulta Blusa",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Blusa de Frio nao encontrada - !",
                    "Consulta Blusa de Frio",
                    1
            );
        }
    }
    public void EditarBlusaFrio() throws CodigoException, PrecoException{
        blu = new BlusaFrio();
        try{
           blu.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            blu = ce.corrigeCodigoBlusaFrio(blu);
        }
        blu = BancoRoupa.getBancoRoupa().altBlusaFrio(blu);
        if(blu != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! - Blusa de Frio Alterada com Sucesso - !",
                    "Alterar Blusa",
                    1
            );
        } else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Blusa de Frio nao encontrada - !",
                    "Alterar Blusa",
                    1
            );
        }
        
    }
    public void Limpar(){
        cxCodigo.setText("");
        cxMarca.setText("");
        cxModelo.setText("");
        cxCor.setText("");
        cxMaterial.setText("");
        cxDescricao.setText("");
        cxPreco.setText("");
        btGrupoDesconto.clearSelection();
        btGrupoGenero.clearSelection();
        btGrupoTamanho.clearSelection();
        cxForro.setText("");
        btGrupoZiper.clearSelection();
        btGrupoCapuz.clearSelection();
    }
    public int Verificar(){
        if(cxCodigo.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto do codigo - !",
                    "Verificacao",
                    1
            );
            return 1;
        }
        if(cxMarca.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto da Marca - !",
                    "Verificacao",
                    1
            );
            return 1;
        }
        if(cxModelo.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto do Modelo - !",
                    "Verificacao",
                    1
            );
            return 1;
        }
        if(cxCor.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto da Cor - !",
                    "Verificacao",
                    1
            );
            return 1;
        }
        if(cxMaterial.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto do Material - !",
                    "Verificacao",
                    1
            );
            return 1;
        }
        if(cxPreco.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto do Preco - !",
                    "Verificacao",
                    1
            );
            return 1;
        }
        if(cxDescricao.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto da Descricao - !",
                    "Verificacao",
                    1
            );
            return 1;
        }
        if(radBtTamPp.isSelected() == false && radBtTamP.isSelected() == false && radBtTamM.isSelected() == false && radBtTamG.isSelected() == false && radBtTamGg.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar um Tamanho - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtGeneroM.isSelected() == false && radBtGeneroF.isSelected() == false && radBtGeneroU.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar um Genero - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtDescontoS.isSelected() == false && radBtDescontoN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao no Desconto - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtCapuzS.isSelected() == false && radBtCapuzN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao no Capuz - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtZiperS.isSelected() == false && radBtZiperN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao no Ziper - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(cxForro.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto do Forro - !",
                    "Verificacao",
                    1
            );
            return 1;
        }
        return 0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAdicionar;
    private javax.swing.JToggleButton btConsultar;
    private javax.swing.JToggleButton btEditar;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.ButtonGroup btGrupoCapuz;
    private javax.swing.ButtonGroup btGrupoDesconto;
    private javax.swing.ButtonGroup btGrupoGenero;
    private javax.swing.ButtonGroup btGrupoTamanho;
    private javax.swing.ButtonGroup btGrupoZiper;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JToggleButton btRelatorio;
    private javax.swing.JTextPane cxCodigo;
    private javax.swing.JTextPane cxCor;
    private javax.swing.JTextPane cxDescricao;
    private javax.swing.JTextPane cxForro;
    private javax.swing.JTextPane cxMarca;
    private javax.swing.JTextPane cxMaterial;
    private javax.swing.JTextPane cxModelo;
    private javax.swing.JTextPane cxPreco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel labBlusaCapuz;
    private javax.swing.JLabel labBlusaForro;
    private javax.swing.JLabel labBlusaZiper;
    private javax.swing.JLabel labCodigo;
    private javax.swing.JLabel labCor;
    private javax.swing.JLabel labDesconto;
    private javax.swing.JLabel labDescricao;
    private javax.swing.JLabel labGenero;
    private javax.swing.JLabel labMarca;
    private javax.swing.JLabel labMaterial;
    private javax.swing.JLabel labModelo;
    private javax.swing.JLabel labPreco;
    private javax.swing.JLabel labTamanho;
    private javax.swing.JRadioButton radBtCapuzN;
    private javax.swing.JRadioButton radBtCapuzS;
    private javax.swing.JRadioButton radBtDescontoN;
    private javax.swing.JRadioButton radBtDescontoS;
    private javax.swing.JRadioButton radBtGeneroF;
    private javax.swing.JRadioButton radBtGeneroM;
    private javax.swing.JRadioButton radBtGeneroU;
    private javax.swing.JRadioButton radBtTamG;
    private javax.swing.JRadioButton radBtTamGg;
    private javax.swing.JRadioButton radBtTamM;
    private javax.swing.JRadioButton radBtTamP;
    private javax.swing.JRadioButton radBtTamPp;
    private javax.swing.JRadioButton radBtZiperN;
    private javax.swing.JRadioButton radBtZiperS;
    private javax.swing.JLabel rotTituloBlusaFrio;
    // End of variables declaration//GEN-END:variables
    public String getCxMarca(){
        return cxMarca.getText();
    }
    public String getCxModelo(){
        return cxModelo.getText();
    }
    public String getCxCor(){
        return cxCor.getText();
    }
    public String getCxMaterial(){
        return cxMaterial.getText();
    }
    public String getCxDescricao(){
        return cxDescricao.getText();
    }
    public double getCxPreco(){
        return Double.parseDouble(cxPreco.getText());
    }
    public String getCxTamanho(){
        if(radBtTamPp.isSelected()== true){
            return "PP";
        } else if(radBtTamP.isSelected() == true){
            return "P";
        } else if(radBtTamM.isSelected() == true){
            return "M";
        } else if(radBtTamG.isSelected() == true){
            return "G";
        } else if(radBtTamGg.isSelected() == true){
            return "GG";
        }
        return null;
    }
    public String getCxGenero(){
        if(radBtGeneroM.isSelected() == true){
            return "Masculino";
        } else if(radBtGeneroF.isSelected() == true){
            return "Feminino";
        } else if(radBtGeneroU.isSelected() == true){
            return "Unissex";
        }
        return null;
    }
    public String getCxDesconto(){
        if(radBtDescontoS.isSelected() == true){
            return "s";
        } else if(radBtDescontoN.isSelected() == true){
            return "n";
        }
        return null;
    }
    public String getCxCapuz(){
        if(radBtCapuzS.isSelected() == true){
            return "s";
        } else if(radBtCapuzN.isSelected() == true){
            return "n";
        }
        return null;   
    }
    public String getCxZiper(){
        if(radBtZiperS.isSelected() == true){
            return "s";
        } else if(radBtZiperN.isSelected() == true){
            return "n";
        }
        return null;   
    }
    public String getCxForro(){
        return cxForro.getText();
    }
}