/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.villabeef.view;

//Janela modelo para desenvolvimento das interfaces

import com.villabeef.model.service.ManterFuncionario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


public class CadastroFuncionario extends javax.swing.JDialog {
    
    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;
    
    
    /**
     * Creates new form Funcionarios1
     */
    public CadastroFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }
    
    private int mouseX, mouseY;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        nomeIcone = new javax.swing.JLabel();
        fecharButton = new javax.swing.JPanel();
        fecharTxt = new javax.swing.JLabel();
        identificacao = new javax.swing.JLabel();
        identificacaoCampo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        nome = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        funcao = new javax.swing.JLabel();
        funcaoCampo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        salario = new javax.swing.JLabel();
        salarioCampo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        contaBancaria = new javax.swing.JLabel();
        contaBancariaCampo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        cadastrarButton = new javax.swing.JPanel();
        cadastrarTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(536, 525));
        setMinimumSize(new java.awt.Dimension(536, 525));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(245, 222, 179));
        background.setMaximumSize(new java.awt.Dimension(536, 525));
        background.setMinimumSize(new java.awt.Dimension(536, 525));
        background.setPreferredSize(new java.awt.Dimension(536, 525));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(76, 21, 32));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VILLAsmall.png"))); // NOI18N
        nomeIcone.setText("jLabel2");
        header.add(nomeIcone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 5, 100, -1));

        fecharButton.setBackground(header.getBackground());

        fecharTxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fecharTxt.setForeground(background.getBackground());
        fecharTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecharTxt.setText("X");
        fecharTxt.setMaximumSize(new java.awt.Dimension(40, 40));
        fecharTxt.setMinimumSize(new java.awt.Dimension(40, 40));
        fecharTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        fecharTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fecharTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fecharTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fecharButtonLayout = new javax.swing.GroupLayout(fecharButton);
        fecharButton.setLayout(fecharButtonLayout);
        fecharButtonLayout.setHorizontalGroup(
            fecharButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fecharButtonLayout.createSequentialGroup()
                .addComponent(fecharTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fecharButtonLayout.setVerticalGroup(
            fecharButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fecharButtonLayout.createSequentialGroup()
                .addComponent(fecharTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        header.add(fecharButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        identificacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        identificacao.setForeground(header.getBackground());
        identificacao.setText("CPF");
        background.add(identificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        identificacaoCampo.setBackground(background.getBackground());
        identificacaoCampo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        identificacaoCampo.setForeground(java.awt.Color.gray);
        identificacaoCampo.setText("Insira os credenciais");
        identificacaoCampo.setToolTipText("");
        identificacaoCampo.setBorder(null);
        identificacaoCampo.setDisabledTextColor(java.awt.Color.gray);
        identificacaoCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                identificacaoCampoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                identificacaoCampoFocusLost(evt);
            }
        });
        identificacaoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacaoCampoActionPerformed(evt);
            }
        });
        background.add(identificacaoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 320, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 320, 10));

        nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nome.setForeground(header.getBackground());
        nome.setText("NOME");
        background.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        nomeCampo.setBackground(background.getBackground());
        nomeCampo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeCampo.setForeground(java.awt.Color.gray);
        nomeCampo.setText("Insira os credenciais");
        nomeCampo.setToolTipText("");
        nomeCampo.setBorder(null);
        nomeCampo.setDisabledTextColor(java.awt.Color.gray);
        nomeCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeCampoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeCampoFocusLost(evt);
            }
        });
        background.add(nomeCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 320, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 320, 10));

        funcao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        funcao.setForeground(header.getBackground());
        funcao.setText("FUNÇÃO");
        background.add(funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        funcaoCampo.setBackground(background.getBackground());
        funcaoCampo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        funcaoCampo.setForeground(java.awt.Color.gray);
        funcaoCampo.setText("Insira os credenciais");
        funcaoCampo.setToolTipText("");
        funcaoCampo.setBorder(null);
        funcaoCampo.setDisabledTextColor(java.awt.Color.gray);
        funcaoCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                funcaoCampoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                funcaoCampoFocusLost(evt);
            }
        });
        background.add(funcaoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 320, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 320, 10));

        salario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        salario.setForeground(header.getBackground());
        salario.setText("SALÁRIO");
        background.add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        salarioCampo.setBackground(background.getBackground());
        salarioCampo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salarioCampo.setForeground(java.awt.Color.gray);
        salarioCampo.setText("Insira os credenciais");
        salarioCampo.setToolTipText("");
        salarioCampo.setBorder(null);
        salarioCampo.setDisabledTextColor(java.awt.Color.gray);
        salarioCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salarioCampoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                salarioCampoFocusLost(evt);
            }
        });
        background.add(salarioCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 320, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 320, 10));

        contaBancaria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contaBancaria.setForeground(header.getBackground());
        contaBancaria.setText("CONTA BANCÁRIA");
        background.add(contaBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        contaBancariaCampo.setBackground(background.getBackground());
        contaBancariaCampo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contaBancariaCampo.setForeground(java.awt.Color.gray);
        contaBancariaCampo.setText("Insira os credenciais");
        contaBancariaCampo.setToolTipText("");
        contaBancariaCampo.setBorder(null);
        contaBancariaCampo.setDisabledTextColor(java.awt.Color.gray);
        contaBancariaCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contaBancariaCampoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contaBancariaCampoFocusLost(evt);
            }
        });
        background.add(contaBancariaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 320, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 320, 10));

        cadastrarButton.setBackground(header.getBackground());

        cadastrarTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cadastrarTxt.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrarTxt.setText("CADASTRAR");
        cadastrarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cadastrarButtonLayout = new javax.swing.GroupLayout(cadastrarButton);
        cadastrarButton.setLayout(cadastrarButtonLayout);
        cadastrarButtonLayout.setHorizontalGroup(
            cadastrarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        cadastrarButtonLayout.setVerticalGroup(
            cadastrarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(cadastrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharTxtMouseClicked
        doClose(RET_CANCEL);
    }//GEN-LAST:event_fecharTxtMouseClicked

    private void fecharTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharTxtMouseEntered
        fecharButton.setBackground(background.getBackground());
        fecharTxt.setForeground(header.getBackground());
    }//GEN-LAST:event_fecharTxtMouseEntered

    private void fecharTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharTxtMouseExited
        fecharButton.setBackground(header.getBackground());
        fecharTxt.setForeground(background.getBackground());
    }//GEN-LAST:event_fecharTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void identificacaoCampoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_identificacaoCampoFocusGained
        if(identificacaoCampo.getText().equals("Insira os credenciais")) {
            identificacaoCampo.setText("");
            identificacaoCampo.setForeground(Color.black);
        }
    }//GEN-LAST:event_identificacaoCampoFocusGained

    private void identificacaoCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_identificacaoCampoFocusLost
        if(identificacaoCampo.getText().isBlank()) {
            identificacaoCampo.setText("Insira os credenciais");
            identificacaoCampo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_identificacaoCampoFocusLost

    private void nomeCampoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeCampoFocusGained
        if(nomeCampo.getText().equals("Insira os credenciais")) {
            nomeCampo.setText("");
            nomeCampo.setForeground(Color.black);
        }
    }//GEN-LAST:event_nomeCampoFocusGained

    private void nomeCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeCampoFocusLost
        if(nomeCampo.getText().isBlank()) {
            nomeCampo.setText("Insira os credenciais");
            nomeCampo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nomeCampoFocusLost

    private void funcaoCampoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_funcaoCampoFocusGained
        if(funcaoCampo.getText().equals("Insira os credenciais")) {
            funcaoCampo.setText("");
            funcaoCampo.setForeground(Color.black);
        }
    }//GEN-LAST:event_funcaoCampoFocusGained

    private void funcaoCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_funcaoCampoFocusLost
        if(funcaoCampo.getText().isBlank()) {
            funcaoCampo.setText("Insira os credenciais");
            funcaoCampo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_funcaoCampoFocusLost

    private void salarioCampoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salarioCampoFocusGained
        if(salarioCampo.getText().equals("Insira os credenciais")) {
            salarioCampo.setText("");
            salarioCampo.setForeground(Color.black);
        }
    }//GEN-LAST:event_salarioCampoFocusGained

    private void salarioCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salarioCampoFocusLost
        if(salarioCampo.getText().isBlank()) {
            salarioCampo.setText("Insira os credenciais");
            salarioCampo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_salarioCampoFocusLost

    private void contaBancariaCampoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contaBancariaCampoFocusGained
        if(contaBancariaCampo.getText().equals("Insira os credenciais")) {
            contaBancariaCampo.setText("");
            contaBancariaCampo.setForeground(Color.black);
        }
    }//GEN-LAST:event_contaBancariaCampoFocusGained

    private void contaBancariaCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contaBancariaCampoFocusLost
        if(contaBancariaCampo.getText().isBlank()) {
            contaBancariaCampo.setText("Insira os credenciais");
            contaBancariaCampo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_contaBancariaCampoFocusLost

    private void cadastrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarTxtMouseClicked
        doClose(RET_OK);
    }//GEN-LAST:event_cadastrarTxtMouseClicked

    private void identificacaoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacaoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacaoCampoActionPerformed

    private void cadastrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarTxtMouseEntered
        cadastrarButton.setBackground(new Color(119, 34, 51));
    }//GEN-LAST:event_cadastrarTxtMouseEntered

    private void cadastrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarTxtMouseExited
        cadastrarButton.setBackground(header.getBackground());
    }//GEN-LAST:event_cadastrarTxtMouseExited
    
    
    private void doClose(int retStatus) {
        try {
            if (retStatus == RET_OK) {
                String nome = nomeCampo.getText();
                String cpf = identificacaoCampo.getText();
                String conta = contaBancariaCampo.getText();
                double salario = Double.valueOf(salarioCampo.getText().replace(',', '.'));
                String funcao = funcaoCampo.getText();
                
                ManterFuncionario.adicionar(nome, salario, conta, funcao, cpf);
            }
            returnStatus = retStatus;
            setVisible(false);
            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro inesperado.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Falha na conexão com o banco de dados.", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroFuncionario dialog = new CadastroFuncionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cadastrarButton;
    private javax.swing.JLabel cadastrarTxt;
    private javax.swing.JLabel contaBancaria;
    private javax.swing.JTextField contaBancariaCampo;
    private javax.swing.JPanel fecharButton;
    private javax.swing.JLabel fecharTxt;
    private javax.swing.JLabel funcao;
    private javax.swing.JTextField funcaoCampo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel identificacao;
    private javax.swing.JTextField identificacaoCampo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeIcone;
    private javax.swing.JLabel salario;
    private javax.swing.JTextField salarioCampo;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
