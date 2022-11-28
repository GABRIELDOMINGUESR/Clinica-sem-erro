
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelPlanosDeSaude extends javax.swing.JPanel {

    int linha;

    public PanelPlanosDeSaude() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanePlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de Saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        setPreferredSize(new java.awt.Dimension(890, 390));
        setLayout(null);

        tablePlanosDeSaude.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePlanosDeSaude.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        scrollPanePlanosDeSaude.setViewportView(tablePlanosDeSaude);

        add(scrollPanePlanosDeSaude);
        scrollPanePlanosDeSaude.setBounds(10, 30, 870, 290);

        buttonEditar.setBackground(new java.awt.Color(255, 255, 254));
        buttonEditar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit.png"))); // NOI18N
        buttonEditar.setToolTipText("editar plano de saúde selecionado ");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(780, 330, 40, 40);

        buttonAdicionar.setBackground(new java.awt.Color(255, 255, 254));
        buttonAdicionar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        buttonAdicionar.setToolTipText("adicionar plano de saúde");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(830, 330, 40, 40);

        buttonExcluir.setBackground(new java.awt.Color(255, 255, 254));
        buttonExcluir.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete.png"))); // NOI18N
        buttonExcluir.setToolTipText("deletar plano de saúde selecionado");
        buttonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(730, 330, 40, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        
       linha = tablePlanosDeSaude.getSelectedRow();
       if(linha != -1){
            editar();
        } else {
                JOptionPane.showMessageDialog(
                this, 
                "Por favor, selecione um plano de saúde para alterar.",
                "Planos de Saúde",
                JOptionPane.WARNING_MESSAGE);
                }      
       
        criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        DialogPlanosDeSaude dialogPlanosDeSaude = new DialogPlanosDeSaude(null, true, TipoOperacao.ADICIONAR, null);
        dialogPlanosDeSaude.setVisible(true);

        criarTabelaPlanosDeSaude();

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        //obtemos o índice da linha selecionada na tabela
        linha = tablePlanosDeSaude.getSelectedRow();

        //verificamos se a linha é diferente de -1
        //-1 significa que o usuario n selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que você deseja excluir!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void editar(){
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        DialogPlanosDeSaude dialogPlanosDeSaude = new DialogPlanosDeSaude(null, true, TipoOperacao.ALTERAR, planoDeSaude);
        dialogPlanosDeSaude.setVisible(true);
        criarTabelaPlanosDeSaude();
    }
    
    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão do plano de saúde selecionado?",
                "Plano de Saúde",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
                       
        if(resposta == 0){
            PlanoDeSaudeDAO.excluir(getCodigo());
            criarTabelaPlanosDeSaude();
        }        
            
    }
    
    private Integer getCodigo(){
            String codigoStr = tablePlanosDeSaude.getValueAt(linha, 0).toString();
            return Integer.valueOf(codigoStr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane scrollPanePlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());

        // Desativar
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(400);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(367);

        //impedir movimentação da coluna
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        //impedir edição das linhas
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);

    }

}
