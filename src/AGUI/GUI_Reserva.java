/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AGUI;

import AGUI.GUI_Parqueaderos;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author David
 */
public class GUI_Reserva extends javax.swing.JFrame {
    
    String Nombre = GUI_Parqueaderos.Nombre;
    String CallePrincipal = GUI_Parqueaderos.CallePrincipal;
    String CalleSecundaria = GUI_Parqueaderos.CalleSecundaria;
    String Sector = GUI_Parqueaderos.Sector;
    String PlazasDisponibles = GUI_Parqueaderos.PlazasDisponibles;
    String Tarifa = GUI_Parqueaderos.Tarifa;
    int Plaza = -1;
    public static String PlazaSeleccionada;
    public static String Fecha1;
    public static String HoraLlegada;
    public static String HoraSalida;
        
        
    public GUI_Reserva() {
        initComponents();
        this.jTextFieldNombreP.setText(Nombre); 
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxP10 = new javax.swing.JCheckBox();
        jCheckBoxP20 = new javax.swing.JCheckBox();
        jCheckBoxP2 = new javax.swing.JCheckBox();
        jCheckBoxP3 = new javax.swing.JCheckBox();
        jCheckBoxP4 = new javax.swing.JCheckBox();
        jCheckBoxP5 = new javax.swing.JCheckBox();
        jCheckBoxP6 = new javax.swing.JCheckBox();
        jCheckBoxP7 = new javax.swing.JCheckBox();
        jCheckBoxP8 = new javax.swing.JCheckBox();
        jCheckBoxP9 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBoxP1 = new javax.swing.JCheckBox();
        jCheckBoxP11 = new javax.swing.JCheckBox();
        jCheckBoxP12 = new javax.swing.JCheckBox();
        jCheckBoxP13 = new javax.swing.JCheckBox();
        jCheckBoxP14 = new javax.swing.JCheckBox();
        jCheckBoxP15 = new javax.swing.JCheckBox();
        jCheckBoxP16 = new javax.swing.JCheckBox();
        jCheckBoxP17 = new javax.swing.JCheckBox();
        jCheckBoxP18 = new javax.swing.JCheckBox();
        jCheckBoxP19 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCargarDatos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldPlaza = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinnerHoraLlegada = new javax.swing.JSpinner(sm);
        Date date2 = new Date();
        SpinnerDateModel sm2 = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinnerHoraSalida = new javax.swing.JSpinner(sm2);
        jLabel11 = new javax.swing.JLabel();
        jTextFieldTarifa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldVehiculo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNombreP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBoxP10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP10MouseClicked(evt);
            }
        });
        jCheckBoxP10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxP10ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jCheckBoxP20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP20MouseClicked(evt);
            }
        });
        jCheckBoxP20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxP20ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxP20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 60, -1));

        jCheckBoxP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP2MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jCheckBoxP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP3MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jCheckBoxP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP4MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jCheckBoxP5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP5MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jCheckBoxP6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP6MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jCheckBoxP7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP7MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jCheckBoxP8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP8MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jCheckBoxP9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP9MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jCheckBox11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox11MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jCheckBoxP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP1MouseClicked(evt);
            }
        });
        jCheckBoxP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxP1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jCheckBoxP11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP11MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jCheckBoxP12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP12MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jCheckBoxP13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP13MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jCheckBoxP14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP14MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jCheckBoxP15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP15MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jCheckBoxP16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP16MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 60, -1));

        jCheckBoxP17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP17MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 60, -1));

        jCheckBoxP18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP18MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 60, -1));

        jCheckBoxP19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/vacio.png"))); // NOI18N
        jCheckBoxP19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxP19MouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBoxP19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 60, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 620, 260));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("GESTION DE ESTACIONAMIENTO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 280, 30));

        jButtonCargarDatos.setText("Cargar Datos");
        jButtonCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel2.setText("Fecha");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setText("Hora llegada:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setText("Hora salida:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel5.setText("Plaza:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel6.setText("Estado");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel7.setText("Placa");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jTextFieldPlaca.setEditable(false);
        jPanel3.add(jTextFieldPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 130, -1));

        jTextFieldFecha.setEditable(false);
        jPanel3.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, -1));

        jTextFieldPlaza.setEditable(false);
        jPanel3.add(jTextFieldPlaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, -1));

        jTextFieldEstado.setEditable(false);
        jPanel3.add(jTextFieldEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 130, -1));

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinnerHoraLlegada, "HH:mm");
        jSpinnerHoraLlegada.setEditor(de);
        jSpinnerHoraLlegada.setEnabled(false);
        jPanel3.add(jSpinnerHoraLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(jSpinnerHoraSalida, "HH:mm");
        jSpinnerHoraSalida.setEditor(de2);
        jSpinnerHoraSalida.setEnabled(false);
        jPanel3.add(jSpinnerHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel11.setText("Tarifa:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jTextFieldTarifa.setEditable(false);
        jPanel3.add(jTextFieldTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 50, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 380, 480));

        jLabel8.setText("Usuario");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jTextFieldUsuario.setEditable(false);
        jPanel2.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 220, -1));

        jLabel9.setText("Vehiculo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jTextFieldVehiculo.setEditable(false);
        jPanel2.add(jTextFieldVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 220, -1));

        jLabel10.setText("Parqueadero: ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextFieldNombreP.setEditable(false);
        jTextFieldNombreP.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPanel2.add(jTextFieldNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 310, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1110, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarDatosActionPerformed
        this.jSpinnerHoraLlegada.setEnabled(true);
        this.jSpinnerHoraSalida.setEnabled(true);
        
        Date Fecha = new Date();
        Fecha1 = String.valueOf(new SimpleDateFormat("dd-MM-yyyy").format(Fecha));
        this.jTextFieldFecha.setText(Fecha1);
        this.jTextFieldPlaza.setText(String.valueOf(Plaza));
        this.jTextFieldEstado.setText("Libre");
        this.jTextFieldTarifa.setText(Tarifa); 
        HoraLlegada = this.jSpinnerHoraLlegada.getValue().toString();
        System.out.println(HoraLlegada);
        String Fecha2 = String.valueOf(new SimpleDateFormat("hh-mm").format(Fecha));
        //HoraLlegada = new SimpleDateFormat("hh-mm").format(Fecha);
        System.out.println(Fecha2);
        /*HoraLlegada = String.valueOf(new SimpleDateFormat("hh-mm").format(Fecha));
        System.out.println(HoraLlegada);*/
        
    }//GEN-LAST:event_jButtonCargarDatosActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jCheckBoxP10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP10MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP10.setIcon(imagen1);
        Plaza = 10;
        
    }//GEN-LAST:event_jCheckBoxP10MouseClicked

    private void jCheckBoxP20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP20MouseClicked
       ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP20.setIcon(imagen1);
        Plaza = 20;
    }//GEN-LAST:event_jCheckBoxP20MouseClicked

    private void jCheckBoxP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP2MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP2.setIcon(imagen1);
        Plaza = 2;
    }//GEN-LAST:event_jCheckBoxP2MouseClicked

    private void jCheckBoxP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP3MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP3.setIcon(imagen1);
        Plaza = 3;
    }//GEN-LAST:event_jCheckBoxP3MouseClicked

    private void jCheckBoxP4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP4MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP4.setIcon(imagen1);
        Plaza = 4;
    }//GEN-LAST:event_jCheckBoxP4MouseClicked

    private void jCheckBoxP5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP5MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP5.setIcon(imagen1);
        Plaza = 5;
    }//GEN-LAST:event_jCheckBoxP5MouseClicked

    private void jCheckBoxP6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP6MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP6.setIcon(imagen1);
        Plaza = 6;
    }//GEN-LAST:event_jCheckBoxP6MouseClicked

    private void jCheckBoxP7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP7MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP7.setIcon(imagen1);
        Plaza = 7;
    }//GEN-LAST:event_jCheckBoxP7MouseClicked

    private void jCheckBoxP8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP8MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP8.setIcon(imagen1);
        Plaza = 8;
    }//GEN-LAST:event_jCheckBoxP8MouseClicked

    private void jCheckBoxP9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP9MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP9.setIcon(imagen1);
        Plaza = 9;
    }//GEN-LAST:event_jCheckBoxP9MouseClicked

    private void jCheckBox11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox11MouseClicked

    }//GEN-LAST:event_jCheckBox11MouseClicked

    private void jCheckBoxP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP1MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP1.setIcon(imagen1);
        Plaza = 1;
    }//GEN-LAST:event_jCheckBoxP1MouseClicked

    private void jCheckBoxP11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP11MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP11.setIcon(imagen1);
        Plaza = 11;
    }//GEN-LAST:event_jCheckBoxP11MouseClicked

    private void jCheckBoxP12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP12MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP12.setIcon(imagen1);
        Plaza = 12;
    }//GEN-LAST:event_jCheckBoxP12MouseClicked

    private void jCheckBoxP13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP13MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP13.setIcon(imagen1);
        Plaza = 13;
    }//GEN-LAST:event_jCheckBoxP13MouseClicked

    private void jCheckBoxP14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP14MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP14.setIcon(imagen1);
        Plaza = 14;
    }//GEN-LAST:event_jCheckBoxP14MouseClicked

    private void jCheckBoxP15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP15MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP15.setIcon(imagen1);
        Plaza = 15;
    }//GEN-LAST:event_jCheckBoxP15MouseClicked

    private void jCheckBoxP16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP16MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP16.setIcon(imagen1);
        Plaza = 16;
    }//GEN-LAST:event_jCheckBoxP16MouseClicked

    private void jCheckBoxP17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP17MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP17.setIcon(imagen1);
        Plaza = 17;
    }//GEN-LAST:event_jCheckBoxP17MouseClicked

    private void jCheckBoxP18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP18MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP18.setIcon(imagen1);
        Plaza = 18;
    }//GEN-LAST:event_jCheckBoxP18MouseClicked

    private void jCheckBoxP19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxP19MouseClicked
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/IMAGENES/carro1.png"));
        this.jCheckBoxP19.setIcon(imagen1);
        Plaza = 19;
    }//GEN-LAST:event_jCheckBoxP19MouseClicked

    private void jCheckBoxP20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxP20ActionPerformed
        
    }//GEN-LAST:event_jCheckBoxP20ActionPerformed

    private void jCheckBoxP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxP1ActionPerformed

    private void jCheckBoxP10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxP10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxP10ActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        GUI_FichaParqueo FichaParqueo = new GUI_FichaParqueo();
        dispose();
        FichaParqueo.setVisible(true);
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCargarDatos;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBoxP1;
    private javax.swing.JCheckBox jCheckBoxP10;
    private javax.swing.JCheckBox jCheckBoxP11;
    private javax.swing.JCheckBox jCheckBoxP12;
    private javax.swing.JCheckBox jCheckBoxP13;
    private javax.swing.JCheckBox jCheckBoxP14;
    private javax.swing.JCheckBox jCheckBoxP15;
    private javax.swing.JCheckBox jCheckBoxP16;
    private javax.swing.JCheckBox jCheckBoxP17;
    private javax.swing.JCheckBox jCheckBoxP18;
    private javax.swing.JCheckBox jCheckBoxP19;
    private javax.swing.JCheckBox jCheckBoxP2;
    private javax.swing.JCheckBox jCheckBoxP20;
    private javax.swing.JCheckBox jCheckBoxP3;
    private javax.swing.JCheckBox jCheckBoxP4;
    private javax.swing.JCheckBox jCheckBoxP5;
    private javax.swing.JCheckBox jCheckBoxP6;
    private javax.swing.JCheckBox jCheckBoxP7;
    private javax.swing.JCheckBox jCheckBoxP8;
    private javax.swing.JCheckBox jCheckBoxP9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinnerHoraLlegada;
    private javax.swing.JSpinner jSpinnerHoraSalida;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombreP;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldPlaza;
    private javax.swing.JTextField jTextFieldTarifa;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldVehiculo;
    // End of variables declaration//GEN-END:variables
}
