/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labraham
 */
public class Main extends javax.swing.JFrame {

    static public DefaultTableModel modelo;
    Controlador co;
    static public int total;
    static public int cxf;
    static public ArrayList<JLabel> filosofosStatus = new ArrayList<JLabel>();
    static public ArrayList<JLabel> tenedor = new ArrayList<JLabel>();
    static public ArrayList<JLabel> comidas = new ArrayList<JLabel>();
    static public ArrayList<JLabel> filosofos = new ArrayList<JLabel>();
    static public ImageIcon pensandoImg = new ImageIcon("src/Pictures/pensando.png");
    static public ImageIcon saciadoImg = new ImageIcon("src/Pictures/saciado.png");
    static public ImageIcon hambreImg = new ImageIcon("src/Pictures/hambre.png");
    static public ImageIcon comiendoImg = new ImageIcon("src/Pictures/comiendo.png");
    static public ImageIcon tenedorr = new ImageIcon("src/Pictures/tenedor.png");
    static public ImageIcon comida = new ImageIcon("src/Pictures/comida.png");
    static public ImageIcon uno = new ImageIcon("src/Pictures/1.png");
    static public ImageIcon dos = new ImageIcon("src/Pictures/2.png");
    static public ImageIcon tres = new ImageIcon("src/Pictures/3.png");
    static public ImageIcon cuatro = new ImageIcon("src/Pictures/4.png");
    static public ImageIcon cinco = new ImageIcon("src/Pictures/5.png");
    static public ImageIcon seis = new ImageIcon("src/Pictures/6.png");
    static public ImageIcon siete = new ImageIcon("src/Pictures/7.png");
    static public ImageIcon ocho = new ImageIcon("src/Pictures/8.png");
    static public ImageIcon nueve = new ImageIcon("src/Pictures/9.png");
    static public ImageIcon diez = new ImageIcon("src/Pictures/10.png");
    int n;
    static public int numRand;

    /**
     * Creates new form Main
     */
    public Main() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nFilosofos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();
        n9 = new javax.swing.JLabel();
        n10 = new javax.swing.JLabel();
        f8 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        f6 = new javax.swing.JLabel();
        f7 = new javax.swing.JLabel();
        f10 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f9 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        tenedor1 = new javax.swing.JLabel();
        tenedor5 = new javax.swing.JLabel();
        tenedor7 = new javax.swing.JLabel();
        tenedor9 = new javax.swing.JLabel();
        tenedor2 = new javax.swing.JLabel();
        tenedor4 = new javax.swing.JLabel();
        tenedor6 = new javax.swing.JLabel();
        tenedor8 = new javax.swing.JLabel();
        tenedor10 = new javax.swing.JLabel();
        tenedor3 = new javax.swing.JLabel();
        comida1 = new javax.swing.JLabel();
        comida2 = new javax.swing.JLabel();
        comida3 = new javax.swing.JLabel();
        comida4 = new javax.swing.JLabel();
        comida5 = new javax.swing.JLabel();
        comida6 = new javax.swing.JLabel();
        comida7 = new javax.swing.JLabel();
        comida8 = new javax.swing.JLabel();
        comida9 = new javax.swing.JLabel();
        comida10 = new javax.swing.JLabel();
        mesa = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        progress = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 153, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Estado", "Comida numero"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 308, 144));

        jLabel2.setText("Tabla de estados:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 330, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pensando.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/hambre.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 60));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 60, 60));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/comiendo.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 60, 60));

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/saciado.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 60));

        jLabel7.setText("Pensando");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel8.setText("Esperando");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel9.setText("Comiendo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel10.setText("Satisfecho");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jPanel9.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 100));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("N° de filosofos");

        nFilosofos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "8", "10" }));

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(nFilosofos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(nFilosofos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/fondo3.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 210));

        jPanel13.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 750, 200));

        jPanel14.setBackground(new java.awt.Color(255, 255, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 153, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Leider Pineda Simanca");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Abraham Lugo Ramirez");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Filosofos comensales");
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Facultad de Ingenieria de sistemas y computacion");
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/uninorte.png"))); // NOI18N
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 340));

        jPanel14.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 320, 340));

        jPanel10.setBackground(new java.awt.Color(0, 153, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 20, 20));
        jPanel10.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 20, 20));
        jPanel10.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 10, 20));
        jPanel10.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 20, 20));
        jPanel10.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 20, 20));
        jPanel10.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 10, 10));
        jPanel10.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 10, 10));
        jPanel10.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 20, 20));
        jPanel10.add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 20, 20));
        jPanel10.add(n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 20, 20));
        jPanel10.add(f8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 60, 60));
        jPanel10.add(f3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 60, 60));
        jPanel10.add(f4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 60, 60));
        jPanel10.add(f5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 60, 60));
        jPanel10.add(f6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 60, 60));
        jPanel10.add(f7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 60, 60));
        jPanel10.add(f10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 60, 60));
        jPanel10.add(f2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -10, 60, 60));
        jPanel10.add(f9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 60, 60));
        jPanel10.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));

        tenedor1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tenedor1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(tenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 40, 40));
        jPanel10.add(tenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 40, 30));
        jPanel10.add(tenedor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 30, 40));
        jPanel10.add(tenedor9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 40));
        jPanel10.add(tenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 30, 40));
        jPanel10.add(tenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 40, 40));
        jPanel10.add(tenedor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 50, 50));
        jPanel10.add(tenedor8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 30, 40));
        jPanel10.add(tenedor10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 40, 30));
        jPanel10.add(tenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 30, 40));
        jPanel10.add(comida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 40, 40));
        jPanel10.add(comida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 40, 40));
        jPanel10.add(comida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 40, 40));
        jPanel10.add(comida4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 40, 40));
        jPanel10.add(comida5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 40, 40));
        jPanel10.add(comida6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 40, 40));
        jPanel10.add(comida7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 40, 40));
        jPanel10.add(comida8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 40, 40));
        jPanel10.add(comida9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 40, 40));
        jPanel10.add(comida10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 40, 40));

        mesa.setBackground(new java.awt.Color(204, 204, 204));
        mesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/mesa.png"))); // NOI18N
        jPanel10.add(mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 340));

        jPanel14.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 350, 340));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/fondo3.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 390));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 750, 390));

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        progress.setForeground(new java.awt.Color(51, 204, 255));
        progress.setOpaque(true);
        progress.setPreferredSize(new java.awt.Dimension(140, 17));
        progress.setStringPainted(true);
        jPanel15.add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 20));

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 750, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/fondo.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 730));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Se inabilita el botton para evitar errores por el usuario
        jButton1.setEnabled(false);
        try {
            //Se crean los hilos
            n = Integer.parseInt(nFilosofos.getSelectedItem().toString());
            Controlador c = new Controlador(n);
            filosofo f[] = new filosofo[n];
            //numero random menor que 10
            numRand = (int) (Math.random() * 10 + 1);
            cxf = 5 * n * numRand;
            
            tabla(n);
            Filosofos(n);
            for (int cont = 0; cont < n; cont++) {
                filosofos.get(cont).setText((cont + 1) + "");
                filosofosStatus.get(cont).setIcon(pensandoImg);
                tenedor(cont, n);
                comidas.get(cont).setIcon(comida);
                f[cont] = new filosofo(cont, c, numRand);
                f[cont].start();
            }

        } catch (Exception e) {
            System.out.println("");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void tabla(int n) {
        modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        Object[] object = new Object[3];
        modelo.addColumn("ID");
        modelo.addColumn("Estado");
        modelo.addColumn("Por comer");
        for (int i = 0; i < n; i++) {
            object[0] = i + 1;
            object[1] = "Pensando";
            object[2] = numRand;
            modelo.addRow(object);

        }

    }

    public void Filosofos(int n) {
        //Asina cad filosofo a un jLbel en especifico
        switch (n) {
            case 5:
                filosofosStatus.add(f1);
                filosofosStatus.add(f3);
                filosofosStatus.add(f5);
                filosofosStatus.add(f7);
                filosofosStatus.add(f9);
                tenedor.add(tenedor1);
                tenedor.add(tenedor3);
                tenedor.add(tenedor5);
                tenedor.add(tenedor7);
                tenedor.add(tenedor9);

                comidas.add(comida1);
                comidas.add(comida3);
                comidas.add(comida5);
                comidas.add(comida7);
                comidas.add(comida9);

                filosofos.add(n1);
                filosofos.add(n3);
                filosofos.add(n5);
                filosofos.add(n7);
                filosofos.add(n9);

                break;
            case 8:
                filosofosStatus.add(f1);
                filosofosStatus.add(f2);
                filosofosStatus.add(f3);

                filosofosStatus.add(f5);
                filosofosStatus.add(f6);
                filosofosStatus.add(f7);
                filosofosStatus.add(f8);
                filosofosStatus.add(f9);

                tenedor.add(tenedor1);
                tenedor.add(tenedor2);
                tenedor.add(tenedor3);
                tenedor.add(tenedor5);
                tenedor.add(tenedor6);
                tenedor.add(tenedor7);
                tenedor.add(tenedor8);
                tenedor.add(tenedor9);

                comidas.add(comida1);
                comidas.add(comida2);
                comidas.add(comida3);
                comidas.add(comida5);
                comidas.add(comida6);
                comidas.add(comida7);
                comidas.add(comida8);
                comidas.add(comida9);

                filosofos.add(n1);
                filosofos.add(n2);
                filosofos.add(n3);
                filosofos.add(n5);
                filosofos.add(n6);
                filosofos.add(n7);
                filosofos.add(n8);
                filosofos.add(n9);

                break;
            case 10:
                filosofosStatus.add(f1);
                filosofosStatus.add(f2);
                filosofosStatus.add(f3);
                filosofosStatus.add(f4);
                filosofosStatus.add(f5);
                filosofosStatus.add(f6);
                filosofosStatus.add(f7);
                filosofosStatus.add(f8);
                filosofosStatus.add(f9);
                filosofosStatus.add(f10);

                tenedor.add(tenedor1);
                tenedor.add(tenedor2);
                tenedor.add(tenedor3);
                tenedor.add(tenedor4);
                tenedor.add(tenedor5);
                tenedor.add(tenedor6);
                tenedor.add(tenedor7);
                tenedor.add(tenedor8);
                tenedor.add(tenedor9);
                tenedor.add(tenedor10);

                comidas.add(comida1);
                comidas.add(comida2);
                comidas.add(comida3);
                comidas.add(comida4);
                comidas.add(comida5);
                comidas.add(comida6);
                comidas.add(comida7);
                comidas.add(comida8);
                comidas.add(comida9);
                comidas.add(comida10);

                filosofos.add(n1);
                filosofos.add(n2);
                filosofos.add(n3);
                filosofos.add(n4);
                filosofos.add(n5);
                filosofos.add(n6);
                filosofos.add(n7);
                filosofos.add(n8);
                filosofos.add(n9);
                filosofos.add(n10);
                break;

            default:
                System.out.println("Ninguno de los anteriores");
        }

    }

    public static void tenedor(int id, int numF) {

        switch (numF) {

            case 5:

                //   ---------------------------------------------------------
                switch (id) {
                    case 0:
                        tenedor.get(0).setIcon(uno);
                        break;
                    case 1:
                        tenedor.get(1).setIcon(tres);
                        break;
                    case 2:
                        tenedor.get(2).setIcon(cinco);
                        break;
                    case 3:
                        tenedor.get(3).setIcon(siete);
                        break;
                    case 4:
                        tenedor.get(4).setIcon(nueve);
                        break;
                    default:
                        System.out.println("Ninguno de los anteriores");
                }

                //-------------------------------------------------------    
                break;
            case 8:

                switch (id) {
                    case 0:
                        tenedor.get(0).setIcon(uno);
                        break;
                    case 1:
                        tenedor.get(1).setIcon(dos);
                        break;
                    case 2:
                        tenedor.get(2).setIcon(tres);
                        break;
                    case 3:
                        tenedor.get(3).setIcon(cinco);
                        break;
                    case 4:
                        tenedor.get(4).setIcon(seis);
                        break;
                    case 5:
                        tenedor.get(5).setIcon(siete);
                        break;
                    case 6:
                        tenedor.get(6).setIcon(ocho);
                        break;
                    case 7:
                        tenedor.get(7).setIcon(nueve);

                        break;

                    default:
                        System.out.println("Ninguno de los anteriores");
                }

                break;
            case 10:

                switch (id) {
                    case 0:
                        tenedor.get(0).setIcon(uno);
                        break;
                    case 1:
                        tenedor.get(1).setIcon(dos);
                        break;
                    case 2:
                        tenedor.get(2).setIcon(tres);
                        break;
                    case 3:
                        tenedor.get(3).setIcon(cuatro);
                        break;
                    case 4:
                        tenedor.get(4).setIcon(cinco);
                        break;
                    case 5:
                        tenedor.get(5).setIcon(seis);
                        break;
                    case 6:
                        tenedor.get(6).setIcon(siete);
                        break;
                    case 7:
                        tenedor.get(7).setIcon(ocho);

                        break;
                    case 8:
                        tenedor.get(8).setIcon(nueve);

                        break;
                    case 9:
                        tenedor.get(9).setIcon(diez);

                        break;

                    default:
                        System.out.println("Ninguno de los anteriores");
                }

                break;

            default:
                System.out.println("Ninguno de los anteriores");
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comida1;
    private javax.swing.JLabel comida10;
    private javax.swing.JLabel comida2;
    private javax.swing.JLabel comida3;
    private javax.swing.JLabel comida4;
    private javax.swing.JLabel comida5;
    private javax.swing.JLabel comida6;
    private javax.swing.JLabel comida7;
    private javax.swing.JLabel comida8;
    private javax.swing.JLabel comida9;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f10;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel f5;
    private javax.swing.JLabel f6;
    private javax.swing.JLabel f7;
    private javax.swing.JLabel f8;
    private javax.swing.JLabel f9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesa;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n10;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n8;
    private javax.swing.JLabel n9;
    private javax.swing.JComboBox<String> nFilosofos;
    public static javax.swing.JProgressBar progress;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel tenedor1;
    private javax.swing.JLabel tenedor10;
    private javax.swing.JLabel tenedor2;
    private javax.swing.JLabel tenedor3;
    private javax.swing.JLabel tenedor4;
    private javax.swing.JLabel tenedor5;
    private javax.swing.JLabel tenedor6;
    private javax.swing.JLabel tenedor7;
    private javax.swing.JLabel tenedor8;
    private javax.swing.JLabel tenedor9;
    // End of variables declaration//GEN-END:variables
}
