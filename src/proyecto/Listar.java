package proyecto;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Listar extends javax.swing.JFrame {
       
    usuario usuario;
    DefaultTableModel tabla;
    ResultSet rs;
    Object[] data;
    
    public Listar() {
        initComponents();
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Iconos/Icono.png"));
        setIconImage(icon);
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        usuario = new usuario();
        llenarTabla();
    }
 
    public void llenarTabla(){
        rs = null;
        data = new Object[5];
        
        String[] titulos = {"Nombre", "Apellido", "Cargo", "Código", "Asistencia"};
        String[][] datos = {};
        tabla = new DefaultTableModel(datos, titulos);
        jTableLista.setModel(tabla);
        DefaultTableCellRenderer alineacionCentrada = new DefaultTableCellRenderer();
        alineacionCentrada.setHorizontalAlignment(SwingConstants.CENTER);
        
        jTableLista.getColumnModel().getColumn(0).setCellRenderer(alineacionCentrada);
        jTableLista.getColumnModel().getColumn(1).setCellRenderer(alineacionCentrada);
        jTableLista.getColumnModel().getColumn(2).setCellRenderer(alineacionCentrada);
        jTableLista.getColumnModel().getColumn(3).setCellRenderer(alineacionCentrada);
        jTableLista.getColumnModel().getColumn(4).setCellRenderer(alineacionCentrada);
        
        try {
            rs = usuario.listarUsuarios();
            
            while (rs.next()) {                
                data[0] = rs.getString("nombre");
                data[1] = rs.getString("apellido");
                data[2] = rs.getString("cargo");
                data[3] = rs.getString("codigo");
                data[4] = rs.getString("asistencia");
                
                tabla.addRow(data);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al consultar", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            if (rs != null) {
                try {
                    rs.close();
                }
                catch (SQLException e) {
                    rs = null;
                }
            }
        }
        usuario.cerrarConexion();   
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(830, 580));
        setMinimumSize(new java.awt.Dimension(830, 580));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(830, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Clinica Fe y Alegría", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Medium", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelTitulo.setMaximumSize(new java.awt.Dimension(475, 475));
        jPanelTitulo.setMinimumSize(new java.awt.Dimension(475, 475));
        jPanelTitulo.setOpaque(false);
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(475, 475));
        jPanelTitulo.setRequestFocusEnabled(false);

        jButtonSalir.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Salir.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setFocusable(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonVolver.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Volver.png"))); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.setFocusable(false);
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonImprimir.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonImprimir.setForeground(new java.awt.Color(0, 0, 0));
        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Imprimir.png"))); // NOI18N
        jButtonImprimir.setText("Imprimir");
        jButtonImprimir.setFocusable(false);
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });

        jTableLista.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cargo", "Código", "Asistencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLista.setMaximumSize(new java.awt.Dimension(800, 500));
        jTableLista.setMinimumSize(new java.awt.Dimension(800, 500));
        jTableLista.setName(""); // NOI18N
        jTableLista.setPreferredSize(new java.awt.Dimension(800, 500));
        jScrollPane1.setViewportView(jTableLista);

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                        .addComponent(jButtonImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                        .addComponent(jButtonVolver)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalir)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonImprimir))
                .addContainerGap(3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 790, 540));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        try {
            jTableLista.print();
        } catch (PrinterException e) {
        }
    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Agregar volver = new Agregar();
        this.setVisible(false);
        volver.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLista;
    // End of variables declaration//GEN-END:variables
}
