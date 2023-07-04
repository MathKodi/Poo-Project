//MATHEUS KODI Y. RA 2503557
package com.mycompany.projetofinal;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class cadCalca extends javax.swing.JFrame {
    private static cadCalca cadCalcaUnico;
    private Calca cal;
    private cadCalca() {
        initComponents();
    }
    public static cadCalca getCadCalca(){
        if(cadCalcaUnico == null){
            cadCalcaUnico = new cadCalca();
        }
        return cadCalcaUnico;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGrupoTamanho = new javax.swing.ButtonGroup();
        btGrupoGenero = new javax.swing.ButtonGroup();
        btGrupoDesconto = new javax.swing.ButtonGroup();
        btGrupoCalcaBolsoFaca = new javax.swing.ButtonGroup();
        btGrupoCalcaBolsoTraseiro = new javax.swing.ButtonGroup();
        btGrupoCalcaBolsoLateral = new javax.swing.ButtonGroup();
        btGrupoCalcaCinto = new javax.swing.ButtonGroup();
        btGrupoCalcaElastico = new javax.swing.ButtonGroup();
        rotTituloCalca = new javax.swing.JLabel();
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
        labCalcaBolsoFaca = new javax.swing.JLabel();
        radBtBolsoFacaS = new javax.swing.JRadioButton();
        radBtBolsoFacaN = new javax.swing.JRadioButton();
        labCalcaBolsoTraseiro = new javax.swing.JLabel();
        radBtCalcaBolsoTraseiroS = new javax.swing.JRadioButton();
        radBtCalcaBolsoTraseiroN = new javax.swing.JRadioButton();
        labCalcaBolsoLateral = new javax.swing.JLabel();
        radBtCalcaBolsoLateralS = new javax.swing.JRadioButton();
        radBtCalcaBolsoLateralN = new javax.swing.JRadioButton();
        labCalcaCinto = new javax.swing.JLabel();
        radBtCalcaCintoS = new javax.swing.JRadioButton();
        radBtCalcaCintoN = new javax.swing.JRadioButton();
        labCalcaCinto1 = new javax.swing.JLabel();
        radBtCalcaElasticoS = new javax.swing.JRadioButton();
        radBtCalcaElasticoN = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotTituloCalca.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rotTituloCalca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotTituloCalca.setText("CADASTRO DE CALCA");

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

        labCalcaBolsoFaca.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCalcaBolsoFaca.setText("BOLSO FACA");

        btGrupoCalcaBolsoFaca.add(radBtBolsoFacaS);
        radBtBolsoFacaS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtBolsoFacaS.setText("SIM");

        btGrupoCalcaBolsoFaca.add(radBtBolsoFacaN);
        radBtBolsoFacaN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtBolsoFacaN.setText("NAO");
        radBtBolsoFacaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtBolsoFacaNActionPerformed(evt);
            }
        });

        labCalcaBolsoTraseiro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCalcaBolsoTraseiro.setText("BOLSO TRASEIRO");

        btGrupoCalcaBolsoTraseiro.add(radBtCalcaBolsoTraseiroS);
        radBtCalcaBolsoTraseiroS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCalcaBolsoTraseiroS.setText("SIM");

        btGrupoCalcaBolsoTraseiro.add(radBtCalcaBolsoTraseiroN);
        radBtCalcaBolsoTraseiroN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCalcaBolsoTraseiroN.setText("NAO");
        radBtCalcaBolsoTraseiroN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtCalcaBolsoTraseiroNActionPerformed(evt);
            }
        });

        labCalcaBolsoLateral.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCalcaBolsoLateral.setText("BOLSO LATERAL");

        btGrupoCalcaBolsoLateral.add(radBtCalcaBolsoLateralS);
        radBtCalcaBolsoLateralS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCalcaBolsoLateralS.setText("SIM");

        btGrupoCalcaBolsoLateral.add(radBtCalcaBolsoLateralN);
        radBtCalcaBolsoLateralN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCalcaBolsoLateralN.setText("NAO");
        radBtCalcaBolsoLateralN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtCalcaBolsoLateralNActionPerformed(evt);
            }
        });

        labCalcaCinto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCalcaCinto.setText("CINTO");

        btGrupoCalcaCinto.add(radBtCalcaCintoS);
        radBtCalcaCintoS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCalcaCintoS.setText("SIM");

        btGrupoCalcaCinto.add(radBtCalcaCintoN);
        radBtCalcaCintoN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCalcaCintoN.setText("NAO");
        radBtCalcaCintoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtCalcaCintoNActionPerformed(evt);
            }
        });

        labCalcaCinto1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCalcaCinto1.setText("ELASTICO NA CINTURA");

        btGrupoCalcaElastico.add(radBtCalcaElasticoS);
        radBtCalcaElasticoS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCalcaElasticoS.setText("SIM");

        btGrupoCalcaElastico.add(radBtCalcaElasticoN);
        radBtCalcaElasticoN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCalcaElasticoN.setText("NAO");
        radBtCalcaElasticoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtCalcaElasticoNActionPerformed(evt);
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
                                    .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btExcluir)
                                    .addComponent(labCalcaBolsoFaca)
                                    .addComponent(labCalcaBolsoTraseiro)
                                    .addComponent(labCalcaBolsoLateral)
                                    .addComponent(labCalcaCinto)
                                    .addComponent(labCalcaCinto1))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtBolsoFacaS)
                                        .addGap(18, 18, 18)
                                        .addComponent(radBtBolsoFacaN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtCalcaBolsoLateralS)
                                        .addGap(18, 18, 18)
                                        .addComponent(radBtCalcaBolsoLateralN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtCalcaBolsoTraseiroS)
                                        .addGap(18, 18, 18)
                                        .addComponent(radBtCalcaBolsoTraseiroN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtCalcaCintoS)
                                        .addGap(18, 18, 18)
                                        .addComponent(radBtCalcaCintoN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radBtCalcaElasticoS)
                                        .addGap(18, 18, 18)
                                        .addComponent(radBtCalcaElasticoN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btConsultar)
                                            .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btEditar)
                                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(rotTituloCalca))
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
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotTituloCalca)
                .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labCalcaBolsoFaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labCalcaBolsoTraseiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labCalcaBolsoLateral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labCalcaCinto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labCalcaCinto1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radBtBolsoFacaS)
                            .addComponent(radBtBolsoFacaN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radBtCalcaBolsoTraseiroS)
                            .addComponent(radBtCalcaBolsoTraseiroN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radBtCalcaBolsoLateralS)
                            .addComponent(radBtCalcaBolsoLateralN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radBtCalcaCintoS)
                            .addComponent(radBtCalcaCintoN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radBtCalcaElasticoS)
                            .addComponent(radBtCalcaElasticoN))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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
                .addGap(22, 22, 22))
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
                AdicionarCalca();
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
            ExcluirCalca();
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
            ConsultarCalca();
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
                EditarCalca();
                Limpar();
            } else {
                JOptionPane.showMessageDialog(
        null,
              "Editar a calca nao foi realizado, por favor corrigir os erros e tente novamente",
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
        RelatorioCalca.getRelatorioCalca().setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void radBtBolsoFacaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtBolsoFacaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtBolsoFacaNActionPerformed

    private void radBtCalcaBolsoTraseiroNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtCalcaBolsoTraseiroNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtCalcaBolsoTraseiroNActionPerformed

    private void radBtCalcaBolsoLateralNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtCalcaBolsoLateralNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtCalcaBolsoLateralNActionPerformed

    private void radBtCalcaCintoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtCalcaCintoNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtCalcaCintoNActionPerformed

    private void radBtCalcaElasticoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtCalcaElasticoNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtCalcaElasticoNActionPerformed
  
    public void AdicionarCalca() throws PrecoException, CodigoException{
        cal = new Calca();
        try{
           cal.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        cal.setMarca(cxMarca.getText());
        cal.setModelo(cxModelo.getText());
        cal.setCor(cxCor.getText());
        cal.setMaterial(cxMaterial.getText());
        if(radBtDescontoS.isSelected() == true){
            cal.setDesconto("s");
        } else if(radBtDescontoN.isSelected() == true){
            cal.setDesconto("n");
        }
        try{
            cal.setPreco(Double.parseDouble(cxPreco.getText()));
            if(cal.getDesconto() == true){
                cal.setPreco(cal.calcularDesconto());
            }
        }
        catch(PrecoException pe){
            pe.msg();
            cal = pe.corrigePrecoCalca(cal);
        }
        catch(NumberFormatException ne){
            PrecoException pe = new PrecoException();
            pe.msg();
            cal = pe.corrigePrecoCalca(cal);
        }
        if(radBtTamPp.isSelected()== true){
            cal.setTamanho("PP");
        } else if(radBtTamP.isSelected() == true){
            cal.setTamanho("P");
        } else if(radBtTamM.isSelected() == true){
            cal.setTamanho("M");
        } else if(radBtTamG.isSelected() == true){
            cal.setTamanho("G");
        } else if(radBtTamGg.isSelected() == true){
            cal.setTamanho("GG");
        }     
        if(radBtGeneroM.isSelected() == true){
            cal.setGenero("Masculino");
        } else if(radBtGeneroF.isSelected() == true){
            cal.setGenero("Feminino");
        } else if(radBtGeneroU.isSelected() == true){
            cal.setGenero("Unissex");
        }
        cal.setDescricao(cxDescricao.getText());
        if(radBtBolsoFacaS.isSelected() == true){
            cal.setBolsoFaca("s");
        } else if(radBtBolsoFacaN.isSelected() == true){
            cal.setBolsoFaca("n");
        }
        if(radBtCalcaBolsoTraseiroS.isSelected() == true){
            cal.setBolsoTraseiro("s");
        } else if(radBtCalcaBolsoTraseiroN.isSelected() == true){
            cal.setBolsoTraseiro("n");
        }
        if(radBtCalcaBolsoLateralS.isSelected() == true){
            cal.setBolsoLateral("s");
        } else if(radBtCalcaBolsoLateralN.isSelected() == true){
            cal.setBolsoLateral("n");
        }
        if(radBtCalcaCintoS.isSelected() == true){
            cal.setCinto("s");
        } else if(radBtCalcaCintoN.isSelected() == true){
            cal.setCinto("n");
        }
        if(radBtCalcaElasticoS.isSelected() == true){
            cal.setElasticoCintura("s");
        } else if(radBtCalcaElasticoN.isSelected() == true){
            cal.setElasticoCintura("n");
        }
        cal = BancoRoupa.getBancoRoupa().cadCalca(cal);
        if(cal != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! Calca Cadastrado com Sucesso - !",
                    "Cadastro de Roupa - Calca",
                    1
            ); 
        } else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Calca ja esta cadastrado - !",
                    "Cadastro de Roupa - Calca",
                    1
            );             
        } 
    }
    public void ExcluirCalca() throws CodigoException{
        cal = new Calca();
        try{
           cal.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        cal = BancoRoupa.getBancoRoupa().delCalca(cal);
        if(cal != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! - Calca nao encontrada - !",
                    "Excluir Calca",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "! - Calca Excluida com sucesso - !",
                    "Excluir Calca",
                    1
            );
        }
    }
    public void ConsultarCalca() throws CodigoException{
        cal = new Calca();
        try{
           cal.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        cal = BancoRoupa.getBancoRoupa().consCalca(cal);
        if(cal != null){
            cxMarca.setText(cal.getMarca());
            cxModelo.setText(cal.getModelo());
            cxCor.setText(cal.getCor());
            cxMaterial.setText(cal.getMaterial());
            cxPreco.setText(String.valueOf(cal.getPreco()));
            if(cal.getTamanho().equalsIgnoreCase("pp")){
                radBtTamPp.setSelected(true);
            } else if(cal.getTamanho().equalsIgnoreCase("p")){
                radBtTamP.setSelected(true);
            } else if(cal.getTamanho().equalsIgnoreCase("m")){
                radBtTamM.setSelected(true);
            } else if(cal.getTamanho().equalsIgnoreCase("g")){
                radBtTamG.setSelected(true);
            } else if(cal.getTamanho().equalsIgnoreCase("gg")){
                radBtTamGg.setSelected(true);
            }
            if(cal.getGenero().equalsIgnoreCase("masculino")){
                radBtGeneroM.setSelected(true);
            } else if(cal.getGenero().equalsIgnoreCase("feminino")){
                radBtGeneroF.setSelected(true);
            } else if(cal.getGenero().equalsIgnoreCase("unissex")){
                radBtGeneroU.setSelected(true);
            }
            if(cal.getDesconto() == true){
                radBtDescontoS.setSelected(true);
            } else {
                radBtDescontoN.setSelected(true);
            }
            cxDescricao.setText(cal.getDescricao());
            if(cal.getBolsoFaca() == true){
                radBtBolsoFacaS.setSelected(true);
            } else if(cal.getBolsoFaca() == false){
                radBtBolsoFacaN.setSelected(true);
            }
            if(cal.getBolsoTraseiro() == true){
                radBtCalcaBolsoTraseiroS.setSelected(true);
            } else if(cal.getBolsoTraseiro() == false){
                radBtCalcaBolsoTraseiroN.setSelected(true);
            }
            if(cal.getBolsoLateral() == true){
                radBtCalcaBolsoLateralS.setSelected(true);
            } else if(cal.getBolsoLateral() == false){
                radBtCalcaBolsoLateralN.setSelected(true);
            }
            if(cal.getCinto() == true){
                radBtCalcaCintoS.setSelected(true);
            } else if(cal.getCinto() == false){
                radBtCalcaCintoN.setSelected(true);
            }
            if(cal.getElasticoCintura() == true){
                radBtCalcaElasticoS.setSelected(true);
            } else if(cal.getElasticoCintura() == false){
                radBtCalcaElasticoN.setSelected(true);
            }
            JOptionPane.showMessageDialog(
                    null,
                    "! - Calca encontrada, confira os dados - !",
                    "Consulta Calca",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Calca nao encontrada - !",
                    "Consulta Calca",
                    1
            );
        }
    }
    public void EditarCalca() throws CodigoException, PrecoException{
        cal = new Calca();
        try{
           cal.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            cal = ce.corrigeCodigoCalca(cal);
        }
        cal = BancoRoupa.getBancoRoupa().altCalca(cal);
        if(cal != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! - Calca Alterada com Sucesso - !",
                    "Alterar Calca",
                    1
            );
        } else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Calca nao encontrada - !",
                    "Alterar Calca",
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
        btGrupoCalcaBolsoFaca.clearSelection();
        btGrupoCalcaBolsoTraseiro.clearSelection();
        btGrupoCalcaBolsoLateral.clearSelection();
        btGrupoCalcaCinto.clearSelection();
        btGrupoCalcaElastico.clearSelection();
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
        if(radBtBolsoFacaS.isSelected() == false && radBtBolsoFacaN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao na Bolso Faca - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtCalcaBolsoTraseiroS.isSelected() == false && radBtCalcaBolsoTraseiroN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao na Bolso Traseiro - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtCalcaBolsoLateralS.isSelected() == false && radBtCalcaBolsoLateralN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao na Bolso Lateral - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtCalcaCintoS.isSelected() == false && radBtCalcaCintoN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao no Cinto - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtCalcaElasticoS.isSelected() == false && radBtCalcaElasticoN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao no Elastico - !",
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
    private javax.swing.ButtonGroup btGrupoCalcaBolsoFaca;
    private javax.swing.ButtonGroup btGrupoCalcaBolsoLateral;
    private javax.swing.ButtonGroup btGrupoCalcaBolsoTraseiro;
    private javax.swing.ButtonGroup btGrupoCalcaCinto;
    private javax.swing.ButtonGroup btGrupoCalcaElastico;
    private javax.swing.ButtonGroup btGrupoDesconto;
    private javax.swing.ButtonGroup btGrupoGenero;
    private javax.swing.ButtonGroup btGrupoTamanho;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JToggleButton btRelatorio;
    private javax.swing.JTextPane cxCodigo;
    private javax.swing.JTextPane cxCor;
    private javax.swing.JTextPane cxDescricao;
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
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel labCalcaBolsoFaca;
    private javax.swing.JLabel labCalcaBolsoLateral;
    private javax.swing.JLabel labCalcaBolsoTraseiro;
    private javax.swing.JLabel labCalcaCinto;
    private javax.swing.JLabel labCalcaCinto1;
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
    private javax.swing.JRadioButton radBtBolsoFacaN;
    private javax.swing.JRadioButton radBtBolsoFacaS;
    private javax.swing.JRadioButton radBtCalcaBolsoLateralN;
    private javax.swing.JRadioButton radBtCalcaBolsoLateralS;
    private javax.swing.JRadioButton radBtCalcaBolsoTraseiroN;
    private javax.swing.JRadioButton radBtCalcaBolsoTraseiroS;
    private javax.swing.JRadioButton radBtCalcaCintoN;
    private javax.swing.JRadioButton radBtCalcaCintoS;
    private javax.swing.JRadioButton radBtCalcaElasticoN;
    private javax.swing.JRadioButton radBtCalcaElasticoS;
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
    private javax.swing.JLabel rotTituloCalca;
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
    public String getCxCalcaBolsoFaca(){
        if(radBtBolsoFacaS.isSelected() == true){
            return "s";
        } else if(radBtBolsoFacaN.isSelected() == true){
            return "n";
        }
        return null;   
    }
    public String getCxCalcaBolsoTraseiro(){
        if(radBtCalcaBolsoTraseiroS.isSelected() == true){
            return "s";
        } else if(radBtCalcaBolsoTraseiroN.isSelected() == true){
            return "n";
        }
        return null;
    }
    public String getCxCalcaBolsoLateral(){
        if(radBtCalcaBolsoLateralS.isSelected() == true){
            return "s";
        } else if(radBtCalcaBolsoLateralN.isSelected() == true){
            return "n";
        }
        return null;
    }
    public String getCxCalcaCinto(){
        if(radBtCalcaCintoS.isSelected() == true){
            return "s";
        } else if(radBtCalcaCintoN.isSelected() == true){
            return "n";
        }
        return null;
    }
    public String getCxCalcaElastico(){
        if(radBtCalcaElasticoS.isSelected() == true){
            return "s";
        } else if(radBtCalcaElasticoN.isSelected() == true){
            return "n";
        }
        return null;
    }
}