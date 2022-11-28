/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 22282115
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        PlanoDeSaudeDAO.getListaPlanosDeSaude();
        EspecialidadeDAO.getListaEspecialidades();
        MedicoDAO.getListaMedicos();
        initPanels();   
    }

    // Atributos da classe
    JButton ultimoButton;
    JPanel ultimoPanel;
    PanelPlanosDeSaude panelPlanosDeSaude;
    PanelEspecialidade panelEspecialidade;
    PanelMedico panelMedico;

    // Constantes da classe
    private final int POSICAO_X = 30;
    private final int POSICAO_Y = 170;
    private final int LARGURA = 890;
    private final int ALTURA = 390;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento de Consultas");
        setBackground(new java.awt.Color(242, 242, 241));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        tituloLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 153, 255));
        tituloLabel.setText("Sistema de Agendamento de Consultas");
        jPanel2.add(tituloLabel);
        tituloLabel.setBounds(90, 10, 660, 70);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agendar.png"))); // NOI18N
        jPanel2.add(iconLabel);
        iconLabel.setBounds(10, 10, 70, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 90);

        buttonSair.setBackground(new java.awt.Color(254, 255, 255));
        buttonSair.setForeground(new java.awt.Color(255, 51, 51));
        buttonSair.setText("Sair");
        buttonSair.setBorder(null);
        buttonSair.setFocusable(false);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(840, 100, 90, 40);

        buttonHome.setBackground(new java.awt.Color(228, 228, 228));
        buttonHome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/home.png"))); // NOI18N
        buttonHome.setBorder(null);
        buttonHome.setFocusable(false);
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(40, 100, 50, 40);

        buttonAgenda.setBackground(new java.awt.Color(254, 255, 255));
        buttonAgenda.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.setBorder(null);
        buttonAgenda.setFocusable(false);
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(160, 100, 110, 40);

        buttonPacientes.setBackground(new java.awt.Color(254, 255, 255));
        buttonPacientes.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        buttonPacientes.setText("Pacientes");
        buttonPacientes.setToolTipText("");
        buttonPacientes.setBorder(null);
        buttonPacientes.setFocusable(false);
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(280, 100, 110, 40);

        buttonMedicos.setBackground(new java.awt.Color(254, 255, 255));
        buttonMedicos.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        buttonMedicos.setText("Médicos");
        buttonMedicos.setBorder(null);
        buttonMedicos.setFocusable(false);
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(400, 100, 110, 40);

        buttonEspecialidades.setBackground(new java.awt.Color(254, 255, 255));
        buttonEspecialidades.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.setBorder(null);
        buttonEspecialidades.setFocusable(false);
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(520, 100, 110, 40);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(254, 255, 255));
        buttonPlanosDeSaude.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        buttonPlanosDeSaude.setText("Planos de Saúde");
        buttonPlanosDeSaude.setBorder(null);
        buttonPlanosDeSaude.setFocusable(false);
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(640, 100, 110, 40);

        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HOME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        panelHome.setFocusCycleRoot(true);
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(40, 50, 640, 64);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(40, 100, 330, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Dados para contato:");
        panelHome.add(jLabel3);
        jLabel3.setBounds(40, 230, 180, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Telefone: (11)98877-5183");
        panelHome.add(jLabel4);
        jLabel4.setBounds(40, 280, 240, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("E-mail: eduardorpimentaa@gmail.com");
        panelHome.add(jLabel5);
        jLabel5.setBounds(40, 260, 240, 20);

        getContentPane().add(panelHome);
        panelHome.setBounds(30, 170, 890, 390);

        setBounds(0, 0, 955, 618);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        mudarCor(buttonAgenda);
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        mudarCor(buttonPacientes);
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        mudarCor(buttonMedicos);
        mudarPanel(panelMedico);
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        mudarPanel(panelEspecialidade);
        mudarCor(buttonEspecialidades);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed
        mudarPanel(panelPlanosDeSaude);
        mudarCor(buttonPlanosDeSaude);
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        mudarPanel(panelHome);
        mudarCor(buttonHome);
    }//GEN-LAST:event_buttonHomeActionPerformed

    public void mudarCor(JButton button) {
        button.setBackground(new Color(228, 228, 228));

        if (this.ultimoButton == null) {
            this.ultimoButton = buttonHome;
            this.ultimoButton.setBackground(new Color(255, 255, 255));
        } else if (this.ultimoButton == button) {

        } else {
            this.ultimoButton.setBackground(new Color(255, 255, 255));
        }
        this.ultimoButton = button;
    }

    public void mudarPanel(JPanel panel) {
        if (this.ultimoPanel == null) {
            this.ultimoPanel = panelHome;
            this.ultimoPanel.setVisible(false);
            panel.setVisible(true);
        } else if (this.ultimoPanel == panel) {

        } else {
            this.ultimoPanel.setVisible(false);
            panel.setVisible(true);
        }
        this.ultimoPanel = panel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        panelPlanosDeSaude = new PanelPlanosDeSaude();
        panelPlanosDeSaude.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        panelPlanosDeSaude.setVisible(false);
        getContentPane().add(panelPlanosDeSaude);
        
        panelEspecialidade = new PanelEspecialidade();
        panelEspecialidade.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        panelEspecialidade.setVisible(false);
        getContentPane().add(panelEspecialidade);
        
        panelMedico = new PanelMedico();
        panelMedico.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        panelMedico.setVisible(false);
        getContentPane().add(panelMedico);
       
        
    }

}
