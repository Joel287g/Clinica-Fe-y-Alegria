package proyecto;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Eliminar extends javax.swing.JFrame {
       
    usuario usuario;
    
    public Eliminar() {
        initComponents();

        jButtonConsultar.setEnabled(false);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Iconos/Icono.png"));
        setIconImage(icon);
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        usuario = new usuario();
    }
    
    //Método limpiar casillas
    public void limpiarCasillas(){
        getjTextFieldNombre().setText("");
        getjTextFieldApellido().setText("");
        getjComboBoxCargo().setSelectedItem("Odontología");
        getjTextFieldCodigo().setText("");
        getjComboBoxAsistencia().setSelectedItem("Presente");
    }
    
    //Método verificar botón guardar
    public void habilitarBoton(){
        if (!jTextFieldCodigo.getText().isEmpty()) {
            jButtonConsultar.setEnabled(true);
        }
        else {
            jButtonConsultar.setEnabled(false);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelAsistencia = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jButtonSalir = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jComboBoxAsistencia = new javax.swing.JComboBox<>();
        jLabelLogo = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(570, 515));
        setMinimumSize(new java.awt.Dimension(570, 515));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(570, 515));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Clinica Fe y Alegría", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Franklin Gothic Medium", 1, 36), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelTitulo.setMaximumSize(new java.awt.Dimension(475, 475));
        jPanelTitulo.setMinimumSize(new java.awt.Dimension(475, 475));
        jPanelTitulo.setOpaque(false);
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(475, 475));
        jPanelTitulo.setRequestFocusEnabled(false);

        jLabelNombre.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelApellido.setText("Apellido:");

        jLabelCargo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelCargo.setText("Cargo:");

        jLabelCodigo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelCodigo.setText("Codigo:");

        jLabelAsistencia.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelAsistencia.setText("Asistencia:");

        jTextFieldNombre.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.setEnabled(false);

        jTextFieldApellido.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jTextFieldApellido.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldApellido.setEnabled(false);

        jTextFieldCodigo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyReleased(evt);
            }
        });

        jComboBoxCargo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jComboBoxCargo.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Odontología", "Pediatría", "Ginecología" }));
        jComboBoxCargo.setEnabled(false);

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

        jButtonConsultar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Consultar.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setFocusable(false);
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jComboBoxAsistencia.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jComboBoxAsistencia.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presente", "No presente" }));
        jComboBoxAsistencia.setEnabled(false);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bastón.png"))); // NOI18N

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

        jButtonEliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Eliminar.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.setFocusable(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelApellido)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabelNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabelCargo)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addComponent(jLabelAsistencia)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabelCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButtonConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir)
                .addGap(25, 25, 25))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabelNombre))
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabelApellido))
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabelCargo))
                            .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigo)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAsistencia)
                            .addComponent(jComboBoxAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelLogo))
                .addGap(47, 47, 47)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonEliminar))
                .addGap(70, 70, 70)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonVolver))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
                
        usuario.setCodigo(jTextFieldCodigo.getText());
        ResultSet rs = usuario.consultarUsuario();
        
        try {
            if (rs.next()) {
                jTextFieldNombre.setEnabled(true);
                jTextFieldApellido.setEnabled(true);
                jComboBoxCargo.setEnabled(true);
                jComboBoxAsistencia.setEnabled(true);
                jButtonEliminar.setEnabled(true);
                
                jTextFieldNombre.setText(rs.getString("nombre"));
                jTextFieldApellido.setText(rs.getString("apellido"));
                switch(rs.getString("cargo")){
                    case "Odontología":
                        jComboBoxCargo.setSelectedItem("Odontología");
                        break;
                    case "Pediatría":
                        jComboBoxCargo.setSelectedItem("Pediatría");
                        break;
                    case "Ginecología":
                        jComboBoxCargo.setSelectedItem("Ginecología");
                        break;  
                }
                jTextFieldCodigo.setText(rs.getString("codigo"));
                switch(rs.getString("asistencia")){
                    case "Presente":
                        jComboBoxAsistencia.setSelectedItem("Presente");
                        break;
                    case "No presente":
                        jComboBoxAsistencia.setSelectedItem("No presente");
                        break;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontraron registros", "Error al consultar", JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Agregar volver = new Agregar();
        this.setVisible(false);
        volver.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        usuario.setCargo(jTextFieldCodigo.getText());
        int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar este registro?", "Eliminar usuario", JOptionPane.YES_NO_OPTION);
        
        if (opcion == 0) {
            usuario.eliminarUsuario();
        }
        limpiarCasillas();
        
        jTextFieldNombre.setEnabled(false);
        jTextFieldApellido.setEditable(false);
        jComboBoxCargo.setEnabled(false);
        jComboBoxAsistencia.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        
        jTextFieldCodigo.requestFocus();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldCodigoKeyReleased

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxAsistencia;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelAsistencia;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    //Métodos Getter y Setter
    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public javax.swing.JButton getjButtonConsultar() {
        return jButtonConsultar;
    }

    public void setjButtonConsultar(javax.swing.JButton jButtonConsultar) {
        this.jButtonConsultar = jButtonConsultar;
    }

    public javax.swing.JButton getjButtonEliminar() {
        return jButtonEliminar;
    }

    public void setjButtonEliminar(javax.swing.JButton jButtonEliminar) {
        this.jButtonEliminar = jButtonEliminar;
    }

    public javax.swing.JButton getjButtonSalir() {
        return jButtonSalir;
    }

    public void setjButtonSalir(javax.swing.JButton jButtonSalir) {
        this.jButtonSalir = jButtonSalir;
    }

    public javax.swing.JButton getjButtonVolver() {
        return jButtonVolver;
    }

    public void setjButtonVolver(javax.swing.JButton jButtonVolver) {
        this.jButtonVolver = jButtonVolver;
    }

    public javax.swing.JComboBox<String> getjComboBoxAsistencia() {
        return jComboBoxAsistencia;
    }

    public void setjComboBoxAsistencia(javax.swing.JComboBox<String> jComboBoxAsistencia) {
        this.jComboBoxAsistencia = jComboBoxAsistencia;
    }

    public javax.swing.JComboBox<String> getjComboBoxCargo() {
        return jComboBoxCargo;
    }

    public void setjComboBoxCargo(javax.swing.JComboBox<String> jComboBoxCargo) {
        this.jComboBoxCargo = jComboBoxCargo;
    }
    
    public javax.swing.JLabel getjLabelApellido() {
        return jLabelApellido;
    }

    public void setjLabelApellido(javax.swing.JLabel jLabelApellido) {
        this.jLabelApellido = jLabelApellido;
    }

    public javax.swing.JLabel getjLabelAsistencia() {
        return jLabelAsistencia;
    }

    public void setjLabelAsistencia(javax.swing.JLabel jLabelAsistencia) {
        this.jLabelAsistencia = jLabelAsistencia;
    }

    public javax.swing.JLabel getjLabelCargo() {
        return jLabelCargo;
    }

    public void setjLabelCargo(javax.swing.JLabel jLabelCargo) {
        this.jLabelCargo = jLabelCargo;
    }

    public javax.swing.JLabel getjLabelCodigo() {
        return jLabelCodigo;
    }

    public void setjLabelCodigo(javax.swing.JLabel jLabelCodigo) {
        this.jLabelCodigo = jLabelCodigo;
    }

    public javax.swing.JLabel getjLabelFondo() {
        return jLabelFondo;
    }

    public void setjLabelFondo(javax.swing.JLabel jLabelFondo) {
        this.jLabelFondo = jLabelFondo;
    }

    public javax.swing.JLabel getjLabelLogo() {
        return jLabelLogo;
    }

    public void setjLabelLogo(javax.swing.JLabel jLabelLogo) {
        this.jLabelLogo = jLabelLogo;
    }

    public javax.swing.JLabel getjLabelNombre() {
        return jLabelNombre;
    }

    public void setjLabelNombre(javax.swing.JLabel jLabelNombre) {
        this.jLabelNombre = jLabelNombre;
    }

    public javax.swing.JPanel getjPanelTitulo() {
        return jPanelTitulo;
    }

    public void setjPanelTitulo(javax.swing.JPanel jPanelTitulo) {
        this.jPanelTitulo = jPanelTitulo;
    }

    public javax.swing.JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }

    public void setjTextFieldApellido(javax.swing.JTextField jTextFieldApellido) {
        this.jTextFieldApellido = jTextFieldApellido;
    }

    public javax.swing.JTextField getjTextFieldCodigo() {
        return jTextFieldCodigo;
    }

    public void setjTextFieldCodigo(javax.swing.JTextField jTextFieldCodigo) {
        this.jTextFieldCodigo = jTextFieldCodigo;
    }

    public javax.swing.JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public void setjTextFieldNombre(javax.swing.JTextField jTextFieldNombre) {
        this.jTextFieldNombre = jTextFieldNombre;
    }
}

