//MATHEUS KODI Y. RA 2503557
package com.mycompany.projetofinal;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class cadCamiseta extends javax.swing.JFrame {
    private static cadCamiseta cadCamisetaUnico;
    private Camiseta cam;
    private cadCamiseta() {
        initComponents();
    }
    public static cadCamiseta getCadCamiseta(){
        if(cadCamisetaUnico == null){
            cadCamisetaUnico = new cadCamiseta();
        }
        return cadCamisetaUnico;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGrupoTamanho = new javax.swing.ButtonGroup();
        btGrupoGenero = new javax.swing.ButtonGroup();
        btGrupoDesconto = new javax.swing.ButtonGroup();
        btGrupoCamisetaEstampa = new javax.swing.ButtonGroup();
        btGrupoCamisetaGola = new javax.swing.ButtonGroup();
        btGrupoCamisetaCorte = new javax.swing.ButtonGroup();
        rotTituloCamiseta = new javax.swing.JLabel();
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
        labCamManga = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        cxCamisetaManga = new javax.swing.JTextPane();
        labCamEstampa = new javax.swing.JLabel();
        radBtCamEstampaS = new javax.swing.JRadioButton();
        radBtCamEstampaN = new javax.swing.JRadioButton();
        labCamGola = new javax.swing.JLabel();
        radBtCamGolaRed = new javax.swing.JRadioButton();
        radBtCamGolaV = new javax.swing.JRadioButton();
        radBtCamGolaU = new javax.swing.JRadioButton();
        labCamCorte = new javax.swing.JLabel();
        radBtCamCorteTrad = new javax.swing.JRadioButton();
        radBtCamCorteSki = new javax.swing.JRadioButton();
        radBtCamCorteBaby = new javax.swing.JRadioButton();
        btAdicionar = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();
        btConsultar = new javax.swing.JToggleButton();
        btEditar = new javax.swing.JToggleButton();
        btLimpar = new javax.swing.JToggleButton();
        labCodigo = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        cxCodigo = new javax.swing.JTextPane();
        btRelatorio = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotTituloCamiseta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rotTituloCamiseta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotTituloCamiseta.setText("CADASTRO DE CAMISETA");

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

        labCamManga.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCamManga.setText("TIPO DE MANGA");

        jScrollPane7.setViewportView(cxCamisetaManga);

        labCamEstampa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCamEstampa.setText("ESTAMPA");

        btGrupoCamisetaEstampa.add(radBtCamEstampaS);
        radBtCamEstampaS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCamEstampaS.setText("SIM");

        btGrupoCamisetaEstampa.add(radBtCamEstampaN);
        radBtCamEstampaN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCamEstampaN.setText("NAO");

        labCamGola.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCamGola.setText("GOLA");

        btGrupoCamisetaGola.add(radBtCamGolaRed);
        radBtCamGolaRed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCamGolaRed.setText("REDONDA");

        btGrupoCamisetaGola.add(radBtCamGolaV);
        radBtCamGolaV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCamGolaV.setText("\"V\"");

        btGrupoCamisetaGola.add(radBtCamGolaU);
        radBtCamGolaU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCamGolaU.setText("\"U\"");

        labCamCorte.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labCamCorte.setText("CORTE");

        btGrupoCamisetaCorte.add(radBtCamCorteTrad);
        radBtCamCorteTrad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCamCorteTrad.setText("TRADICIONAL");

        btGrupoCamisetaCorte.add(radBtCamCorteSki);
        radBtCamCorteSki.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCamCorteSki.setText("SKINNY");

        btGrupoCamisetaCorte.add(radBtCamCorteBaby);
        radBtCamCorteBaby.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radBtCamCorteBaby.setText("BABY LOOK");

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btExcluir))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btConsultar)
                                            .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labCamManga)
                                            .addComponent(labCamCorte)
                                            .addComponent(labCamGola)
                                            .addComponent(labCamEstampa))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radBtCamGolaRed)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radBtCamGolaV)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radBtCamGolaU))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radBtCamEstampaS)
                                                .addGap(18, 18, 18)
                                                .addComponent(radBtCamEstampaN))
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radBtCamCorteTrad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radBtCamCorteSki)
                                                .addGap(18, 18, 18)
                                                .addComponent(radBtCamCorteBaby)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btEditar)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(rotTituloCamiseta))
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
                .addComponent(rotTituloCamiseta)
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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCamManga)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labCamEstampa)
                        .addGap(18, 18, 18)
                        .addComponent(labCamGola)
                        .addGap(18, 18, 18)
                        .addComponent(labCamCorte))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radBtCamEstampaS)
                            .addComponent(radBtCamEstampaN))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radBtCamGolaRed)
                            .addComponent(radBtCamGolaV)
                            .addComponent(radBtCamGolaU))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radBtCamCorteTrad)
                            .addComponent(radBtCamCorteSki)
                            .addComponent(radBtCamCorteBaby))))
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
                .addContainerGap(58, Short.MAX_VALUE))
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
                AdicionarCamiseta();
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
            ExcluirCamiseta();
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
            ConsultarCamiseta();
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
                EditarCamiseta();
                Limpar();
            } else {
                JOptionPane.showMessageDialog(
        null,
              "Editar a camiseta nao foi realizado, por favor corrigir os erros e tente novamente",
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
        RelatorioCamiseta.getRelatorioCamiseta().setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed
  
    public void AdicionarCamiseta() throws PrecoException, CodigoException{
        cam = new Camiseta();
        try{
           cam.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        cam.setMarca(cxMarca.getText());
        cam.setModelo(cxModelo.getText());
        cam.setCor(cxCor.getText());
        cam.setMaterial(cxMaterial.getText());
        if(radBtDescontoS.isSelected() == true){
            cam.setDesconto("s");
        } else if(radBtDescontoN.isSelected() == true){
            cam.setDesconto("n");
        }
        try{
            cam.setPreco(Double.parseDouble(cxPreco.getText()));
            if(cam.getDesconto() == true){
                cam.setPreco(cam.calcularDesconto());
            }
        }
        catch(PrecoException pe){
            pe.msg();
            cam = pe.corrigePrecoCamiseta(cam);
        }
        catch(NumberFormatException ne){
            PrecoException pe = new PrecoException();
            pe.msg();
            cam = pe.corrigePrecoCamiseta(cam);
        }
        if(radBtTamPp.isSelected()== true){
            cam.setTamanho("PP");
        } else if(radBtTamP.isSelected() == true){
            cam.setTamanho("P");
        } else if(radBtTamM.isSelected() == true){
            cam.setTamanho("M");
        } else if(radBtTamG.isSelected() == true){
            cam.setTamanho("G");
        } else if(radBtTamGg.isSelected() == true){
            cam.setTamanho("GG");
        }     
        if(radBtGeneroM.isSelected() == true){
            cam.setGenero("Masculino");
        } else if(radBtGeneroF.isSelected() == true){
            cam.setGenero("Feminino");
        } else if(radBtGeneroU.isSelected() == true){
            cam.setGenero("Unissex");
        }
        cam.setDescricao(cxDescricao.getText());
        cam.setTipoManga(cxCamisetaManga.getText());
        if(radBtCamEstampaS.isSelected() == true){
            cam.setEstampada("s");
        } else if(radBtCamEstampaN.isSelected() == true){
            cam.setEstampada("n");
        }
        if(radBtCamGolaRed.isSelected() == true){
            cam.setGola("Redonda");
        } else if(radBtCamGolaV.isSelected() == true){
            cam.setGola("'V'");
        } else if(radBtCamGolaU.isSelected() == true){
            cam.setGola("'U'");
        }
        if(radBtCamCorteTrad.isSelected() == true){
            cam.setCorte("Tradicional");
        } else if(radBtCamCorteSki.isSelected() == true){
            cam.setCorte("Skinny");
        } else if(radBtCamCorteBaby.isSelected() == true){
            cam.setCorte("Baby look");
        }
        cam = BancoRoupa.getBancoRoupa().cadCamiseta(cam);
        if(cam != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! Camiseta Cadastrado com Sucesso - !",
                    "Cadastro de Roupa - Camiseta",
                    1
            ); 
        } else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Camiseta ja esta cadastrado - !",
                    "Cadastro de Roupa - Camiseta",
                    1
            );             
        } 
    }
    public void ExcluirCamiseta() throws CodigoException{
        cam = new Camiseta();
        try{
           cam.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        cam = BancoRoupa.getBancoRoupa().delCamiseta(cam);
        if(cam != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! - Camiseta nao encontrada - !",
                    "Excluir Camiseta",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "! - Camiseta Excluida com sucesso - !",
                    "Excluir Camiseta",
                    1
            );
        }
    }
    public void ConsultarCamiseta() throws CodigoException{
        cam = new Camiseta();
        try{
           cam.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        cam = BancoRoupa.getBancoRoupa().consCamiseta(cam);
        if(cam != null){
            cxMarca.setText(cam.getMarca());
            cxModelo.setText(cam.getModelo());
            cxCor.setText(cam.getCor());
            cxMaterial.setText(cam.getMaterial());
            cxPreco.setText(String.valueOf(cam.getPreco()));
            if(cam.getTamanho().equalsIgnoreCase("pp")){
                radBtTamPp.setSelected(true);
            } else if(cam.getTamanho().equalsIgnoreCase("p")){
                radBtTamP.setSelected(true);
            } else if(cam.getTamanho().equalsIgnoreCase("m")){
                radBtTamM.setSelected(true);
            } else if(cam.getTamanho().equalsIgnoreCase("g")){
                radBtTamG.setSelected(true);
            } else if(cam.getTamanho().equalsIgnoreCase("gg")){
                radBtTamGg.setSelected(true);
            }
            if(cam.getGenero().equalsIgnoreCase("masculino")){
                radBtGeneroM.setSelected(true);
            } else if(cam.getGenero().equalsIgnoreCase("feminino")){
                radBtGeneroF.setSelected(true);
            } else if(cam.getGenero().equalsIgnoreCase("unissex")){
                radBtGeneroU.setSelected(true);
            }
            if(cam.getDesconto() == true){
                radBtDescontoS.setSelected(true);
            } else {
                radBtDescontoN.setSelected(true);
            }
            cxDescricao.setText(cam.getDescricao());
            cxCamisetaManga.setText(cam.getTipoManga());
            if(cam.getEstampada() == true){
                radBtCamEstampaS.setSelected(true);
            } else{
                radBtCamEstampaN.setSelected(true);
            }
            if(cam.getGola().equalsIgnoreCase("redonda")){
                radBtCamGolaRed.setSelected(true);
            }  else if(cam.getGola().equalsIgnoreCase("'v'")){
                radBtCamGolaV.setSelected(true);
            } else if(cam.getGola().equalsIgnoreCase("'u'")){
                radBtCamGolaU.setSelected(true);
            }
            if(cam.getCorte().equalsIgnoreCase("tradicional")){
                radBtCamCorteTrad.setSelected(true);
            } else if(cam.getCorte().equalsIgnoreCase("skinny")){
                radBtCamCorteSki.setSelected(true);
            } else if(cam.getCorte().equalsIgnoreCase("baby look")){
                radBtCamCorteBaby.setSelected(true);
            }
            JOptionPane.showMessageDialog(
                    null,
                    "! - Camiseta encontrada, confira os dados - !",
                    "Consulta Camiseta",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Camiseta nao encontrada - !",
                    "Consulta Camiseta",
                    1
            );
        }
    }
    public void EditarCamiseta() throws CodigoException, PrecoException{
        cam = new Camiseta();
        try{
           cam.setCodigo(Integer.parseInt(cxCodigo.getText())); 
        }
        catch(CodigoException ce){
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        catch(NumberFormatException ne){
            CodigoException ce = new CodigoException();
            ce.msg();
            cam = ce.corrigeCodigoCamiseta(cam);
        }
        cam = BancoRoupa.getBancoRoupa().altCamiseta(cam);
        if(cam != null){
            JOptionPane.showMessageDialog(
                    null,
                    "! - Camiseta Alterada com Sucesso - !",
                    "Alterar Camiseta",
                    1
            );
        } else{
            JOptionPane.showMessageDialog(
                    null,
                    "! - Camiseta nao encontrada - !",
                    "Alterar Camiseta",
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
        cxCamisetaManga.setText("");
        btGrupoCamisetaGola.clearSelection();
        btGrupoCamisetaCorte.clearSelection();
        btGrupoCamisetaEstampa.clearSelection();
        btGrupoDesconto.clearSelection();
        btGrupoGenero.clearSelection();
        btGrupoTamanho.clearSelection();
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
        if(cxCamisetaManga.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(
                    null,
                    " ERRO ! - necessario preencher a caixa de texto do Tipo de Manga - !",
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
        if(radBtCamEstampaS.isSelected() == false && radBtCamEstampaN.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma opcao na Estampa - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtCamGolaRed.isSelected() == false && radBtCamGolaU.isSelected() == false && radBtCamGolaV.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar uma Gola - !",
                    "Verificacao",
                1
            );
            return 1;
        }
        if(radBtCamCorteTrad.isSelected() == false && radBtCamCorteSki.isSelected() == false && radBtCamCorteBaby.isSelected() == false){
            JOptionPane.showMessageDialog(
             null,
                   " ERRO ! - necessario selecionar um Corte - !",
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
    private javax.swing.ButtonGroup btGrupoCamisetaCorte;
    private javax.swing.ButtonGroup btGrupoCamisetaEstampa;
    private javax.swing.ButtonGroup btGrupoCamisetaGola;
    private javax.swing.ButtonGroup btGrupoDesconto;
    private javax.swing.ButtonGroup btGrupoGenero;
    private javax.swing.ButtonGroup btGrupoTamanho;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JToggleButton btRelatorio;
    private javax.swing.JTextPane cxCamisetaManga;
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
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel labCamCorte;
    private javax.swing.JLabel labCamEstampa;
    private javax.swing.JLabel labCamGola;
    private javax.swing.JLabel labCamManga;
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
    private javax.swing.JRadioButton radBtCamCorteBaby;
    private javax.swing.JRadioButton radBtCamCorteSki;
    private javax.swing.JRadioButton radBtCamCorteTrad;
    private javax.swing.JRadioButton radBtCamEstampaN;
    private javax.swing.JRadioButton radBtCamEstampaS;
    private javax.swing.JRadioButton radBtCamGolaRed;
    private javax.swing.JRadioButton radBtCamGolaU;
    private javax.swing.JRadioButton radBtCamGolaV;
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
    private javax.swing.JLabel rotTituloCamiseta;
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
    public String getCxCamisetaManga(){
        return cxCamisetaManga.getText();
    }
    public String getCxCamisetaEstampada(){
        if(radBtCamEstampaS.isSelected() == true){
            return "s";
        } else if(radBtCamEstampaN.isSelected() == true){
            return "n";
        }
        return null;
    }
    public String getCxCamisetaGola(){
        if(radBtCamGolaRed.isSelected() == true){
            return "Redonda";
        } else if(radBtCamGolaV.isSelected() == true){
            return "'V'";
        } else if(radBtCamGolaU.isSelected() == true){
            return "'U'";
        }
        return null;
    }
    public String getCxCamisetaCorte(){
        if(radBtCamCorteTrad.isSelected() == true){
            return "Tradicional";
        } else if(radBtCamCorteSki.isSelected() == true){
            return "Skinny";
        } else if(radBtCamCorteBaby.isSelected() == true){
            return "Baby Look";
        }
        return null;
    } 
}