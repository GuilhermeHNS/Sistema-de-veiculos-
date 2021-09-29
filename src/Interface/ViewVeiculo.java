/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Classes.Veiculos;
import Controller.ControllerVeiculo;
import Models.VeiculoDAO;
import java.io.Console;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
public class ViewVeiculo extends javax.swing.JFrame {
    private ControllerVeiculo ctrlVl;
    String placa;
    String modelo;
    String cor;
    int ano;
    String marca;
    String error;
    VeiculoDAO ControllerVeiculo;
    
    public ViewVeiculo() {
        initComponents();
        ctrlVl = new ControllerVeiculo();
        recebeMarca.disable();
        recebeModelo.disable();
        recebeCor.disable();
        recebeAno.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTxt1 = new javax.swing.JTextField();
        campoTxt2 = new javax.swing.JTextField();
        campoTxt3 = new javax.swing.JTextField();
        campoTxt4 = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoTxt5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtExclusao = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtFiltroAno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        txtFiltroMarca = new javax.swing.JTextField();
        btnListarMarca = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        txtFiltroPlaca = new javax.swing.JTextField();
        btnListarPlaca = new javax.swing.JButton();
        recebeMarca = new javax.swing.JTextField();
        recebeModelo = new javax.swing.JTextField();
        recebeCor = new javax.swing.JTextField();
        recebeAno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placa:");

        jLabel2.setText("Modelo:");

        jLabel3.setText("Cor:");

        jLabel4.setText("Ano:");

        campoTxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTxt4ActionPerformed(evt);
            }
        });

        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel5.setText("Marca");

        jLabel6.setText("Exclusão");

        jLabel7.setText("Placa:");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor", "Ano"
            }
        ));
        tblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLista);

        btnListar.setText("Listar Todos os veiculos");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtFiltroAno.setText("Filtrar por ano");
        txtFiltroAno.setToolTipText("");
        txtFiltroAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroAnoFocusLost(evt);
            }
        });
        txtFiltroAno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroAnoMouseClicked(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtFiltroMarca.setText("Filtrar por marca");
        txtFiltroMarca.setToolTipText("");
        txtFiltroMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroMarcaFocusLost(evt);
            }
        });
        txtFiltroMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroMarcaMouseClicked(evt);
            }
        });

        btnListarMarca.setText("Buscar");
        btnListarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarMarcaActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtFiltroPlaca.setText("Filtrar por iniciais da placa");
        txtFiltroPlaca.setToolTipText("");
        txtFiltroPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroPlacaFocusLost(evt);
            }
        });
        txtFiltroPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroPlacaMouseClicked(evt);
            }
        });

        btnListarPlaca.setText("Buscar");
        btnListarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPlacaActionPerformed(evt);
            }
        });

        recebeModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebeModeloActionPerformed(evt);
            }
        });

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Cadastro");

        jLabel9.setText("Exibição");

        jLabel10.setText("Alteração de Dados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoTxt5)
                                .addComponent(campoTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(campoTxt2)
                                .addComponent(campoTxt3)
                                .addComponent(campoTxt4)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(txtExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(55, 55, 55)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(recebeMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recebeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recebeCor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recebeAno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFiltroAno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnListarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnListarPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFiltroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFiltroPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEnviar)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(txtExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addComponent(btnExcluir))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator5)
                            .addComponent(txtFiltroPlaca)
                            .addComponent(txtFiltroAno)
                            .addComponent(txtFiltroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnListarMarca)
                            .addComponent(btnListarPlaca))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recebeMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recebeModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recebeCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recebeAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean alterou = false;

        if(recebeMarca.getText().isEmpty() || recebeModelo.getText().isEmpty() || recebeCor.getText().isEmpty() || recebeAno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira todas as informações");
        }
        else{
            marca = recebeMarca.getText();
            modelo = recebeModelo.getText();
            cor = recebeCor.getText();
            ano = Integer.parseInt(recebeAno.getText());
            try{
                alterou = ctrlVl.alterarDados(placa,marca, modelo, cor, ano);
            } catch (SQLException ex) {
                Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(alterou){
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            }
            else if(alterou == false){
                JOptionPane.showMessageDialog(null, "Falha");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void recebeModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebeModeloActionPerformed

    }//GEN-LAST:event_recebeModeloActionPerformed

    private void btnListarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPlacaActionPerformed
        ArrayList<Veiculos> listaVeiculos = new ArrayList();
        placa = txtFiltroPlaca.getText();

        try{
            listaVeiculos = ctrlVl.listarPorPlaca(placa);
            DefaultTableModel dados = (DefaultTableModel) tblLista.getModel();
            dados.setNumRows(0);

            for(Veiculos vl: listaVeiculos){
                dados.addRow(new Object [] {vl.getPlaca(), vl.getMarca(), vl.getModelo(), vl.getCor(), vl.getAno()});
            }
        }catch (SQLException ex) {
            Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarPlacaActionPerformed

    private void txtFiltroPlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroPlacaMouseClicked
        txtFiltroPlaca.setText("");
    }//GEN-LAST:event_txtFiltroPlacaMouseClicked

    private void txtFiltroPlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroPlacaFocusLost
        
    }//GEN-LAST:event_txtFiltroPlacaFocusLost

    private void btnListarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarMarcaActionPerformed
        ArrayList<Veiculos> listaVeiculos = new ArrayList();
        marca = txtFiltroMarca.getText();

        try{
            listaVeiculos = ctrlVl.listarPorMarca(marca);
            DefaultTableModel dados = (DefaultTableModel) tblLista.getModel();
            dados.setNumRows(0);

            for(Veiculos vl: listaVeiculos){
                dados.addRow(new Object[]{vl.getPlaca(), vl.getMarca(), vl.getModelo(), vl.getCor(), vl.getAno()});
            }
        }catch (SQLException ex) {
            Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnListarMarcaActionPerformed

    private void txtFiltroMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroMarcaMouseClicked
        txtFiltroMarca.setText("");
    }//GEN-LAST:event_txtFiltroMarcaMouseClicked

    private void txtFiltroMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroMarcaFocusLost
        
    }//GEN-LAST:event_txtFiltroMarcaFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Veiculos> listaVeiculos = new ArrayList();
        ano = Integer.parseInt(txtFiltroAno.getText());

        try{
            listaVeiculos = ctrlVl.listarPorAno(ano);
            DefaultTableModel dados = (DefaultTableModel) tblLista.getModel();
            dados.setNumRows(0);

            for(Veiculos vl: listaVeiculos){
                dados.addRow(new Object[]{vl.getPlaca(), vl.getMarca(), vl.getModelo(), vl.getCor(), vl.getAno()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFiltroAnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroAnoMouseClicked
        txtFiltroAno.setText("");
    }//GEN-LAST:event_txtFiltroAnoMouseClicked

    private void txtFiltroAnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroAnoFocusLost
        
    }//GEN-LAST:event_txtFiltroAnoFocusLost

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        ArrayList<Veiculos> ListaVeiculos;

        try{
            ListaVeiculos = ctrlVl.listar();
            DefaultTableModel dados = (DefaultTableModel) tblLista.getModel();
            dados.setNumRows(0);

            for(Veiculos vl: ListaVeiculos){
                dados.addRow(new Object[]{vl.getPlaca(), vl.getMarca(), vl.getModelo(), vl.getCor(), vl.getAno()});
            }

        } catch (SQLException ex) {
            Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void tblListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMouseClicked
        int campoSelecionado = tblLista.getSelectedRow();

        placa = tblLista.getValueAt(campoSelecionado, 0).toString();
        String marcaLista = tblLista.getValueAt(campoSelecionado, 1).toString();
        String modeloLista = tblLista.getValueAt(campoSelecionado, 2).toString();
        String corLista = tblLista.getValueAt(campoSelecionado, 3).toString();
        String anoLista = tblLista.getValueAt(campoSelecionado, 4).toString();

        recebeMarca.enable();
        recebeModelo.enable();
        recebeCor.enable();
        recebeAno.enable();

        recebeMarca.setText(marcaLista);
        recebeModelo.setText(modeloLista);
        recebeCor.setText(corLista);
        recebeAno.setText(anoLista);
    }//GEN-LAST:event_tblListaMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        boolean excluiu = false;

        if(txtExclusao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira todas as informações");
        }
        else{
            placa = this.txtExclusao.getText();

            try{
                excluiu = ctrlVl.excluiuVeiculo(placa);
            } catch (SQLException ex) {
                Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }

            if(excluiu){
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Essa placa não está cadastrada!");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        boolean inseriu = false;

        if(campoTxt1.getText().isEmpty() || campoTxt2.getText().isEmpty() || campoTxt3.getText().isEmpty() || campoTxt4.getText().isEmpty() || campoTxt5.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira todas as informações");
        }else{
            placa = this.campoTxt1.getText();
            modelo = this.campoTxt2.getText();
            cor = this.campoTxt3.getText();
            ano = Integer.parseInt(this.campoTxt4.getText());
            marca = this.campoTxt5.getText();

            try{
                inseriu = ctrlVl.insereVeiculo(placa, modelo, cor, ano, marca);
            } catch (SQLException ex) {
                Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ViewVeiculo.class.getName()).log(Level.SEVERE, null, ex);
            }

            if(inseriu){
                campoTxt1.setText("");
                campoTxt2.setText("");
                campoTxt3.setText("");
                campoTxt4.setText("");
                campoTxt5.setText("");
                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
            }
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void campoTxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTxt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTxt4ActionPerformed


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
            java.util.logging.Logger.getLogger(ViewVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnListarMarca;
    private javax.swing.JButton btnListarPlaca;
    private javax.swing.JTextField campoTxt1;
    private javax.swing.JTextField campoTxt2;
    private javax.swing.JTextField campoTxt3;
    private javax.swing.JTextField campoTxt4;
    private javax.swing.JTextField campoTxt5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField recebeAno;
    private javax.swing.JTextField recebeCor;
    private javax.swing.JTextField recebeMarca;
    private javax.swing.JTextField recebeModelo;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtExclusao;
    private javax.swing.JTextField txtFiltroAno;
    private javax.swing.JTextField txtFiltroMarca;
    private javax.swing.JTextField txtFiltroPlaca;
    // End of variables declaration//GEN-END:variables
}
