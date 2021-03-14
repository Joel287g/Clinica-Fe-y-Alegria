package proyecto;

import java.awt.Image;
import java.awt.Toolkit;

public class Agregar extends javax.swing.JFrame {
       
    usuario usuario;
    
    public Agregar() {
        initComponents();
        
        jButtonGuardar.setEnabled(false);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Iconos/Icono.png"));
        setIconImage(icon);
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        usuario = new usuario();
    }
    
    //Método limpiar casillas
    public void limpiarCasillas(){
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jComboBoxCargo.setSelectedItem("Odontología");
        jTextFieldCodigo.setText("");
        jComboBoxAsistencia.setSelectedItem("Presente");
    }
    
    //Método verificar botón guardar
    public void habilitarBoton(){
        if (!jTextFieldNombre.getText().isEmpty() && !jTextFieldApellido.getText().isEmpty() && !jTextFieldCodigo.getText().isEmpty() && !jComboBoxCargo.getSelectedItem().equals("Seleccionar cargo") && !jComboBoxAsistencia.getSelectedItem().equals("Seleccionar asistencia")) {
            jButtonGuardar.setEnabled(true);
        }
        else {
            jButtonGuardar.setEnabled(false);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jLabelAsistencia = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jComboBoxAsistencia = new javax.swing.JComboBox<>();
        jButtonSalir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
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

        jLabelAsistencia.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelAsistencia.setText("Asistencia:");

        jLabelCodigo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelCodigo.setText("Codigo:");

        jTextFieldNombre.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
        });

        jTextFieldApellido.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jTextFieldApellido.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyReleased(evt);
            }
        });

        jTextFieldCodigo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyReleased(evt);
            }
        });

        jComboBoxCargo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jComboBoxCargo.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar cargo", "Odontología", "Pediatría", "Ginecología" }));

        jComboBoxAsistencia.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jComboBoxAsistencia.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar asistencia", "Presente", "No presente" }));

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

        jButtonGuardar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setFocusable(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Modificar.png"))); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.setFocusable(false);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
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

        jButtonListar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonListar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Listar.png"))); // NOI18N
        jButtonListar.setText("Listar");
        jButtonListar.setFocusable(false);
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Eliminar.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setFocusable(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bastón.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCargo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAsistencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTituloLayout.createSequentialGroup()
                        .addComponent(jButtonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTituloLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButtonListar)
                        .addGap(38, 38, 38)
                        .addComponent(jButtonConsultar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(25, 25, 25))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogo)
                        .addGap(47, 47, 47))
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAsistencia)
                            .addComponent(jComboBoxAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigo))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListar)
                    .addComponent(jButtonConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Modificar ida = new Modificar();
        ida.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Eliminar ida = new Eliminar();
        ida.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        Consultar ida = new Consultar();
        this.setVisible(false);
        ida.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        Listar ida = new Listar();
        ida.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        usuario.setNombre(jTextFieldNombre.getText());
        usuario.setApellido(jTextFieldApellido.getText());
        switch(jComboBoxCargo.getSelectedItem().toString()){
            case "Odontología":
                usuario.setCargo("Odontología");
                break;
            case "Pediatría":
                usuario.setCargo("Pediatría");
                break;
            case "Ginecología":
                usuario.setCargo("Ginecología");
                break;
        }
        usuario.setCodigo(jTextFieldCodigo.getText());
        switch(jComboBoxAsistencia.getSelectedItem().toString()){
            case "Presente":
                usuario.setAsistencia("Presente");
                break;
            case "No presente":
                usuario.setAsistencia("No presente");
                break;
        }
        
        int resultado = usuario.agregarUsuario();
        
        if (resultado > 0) {
            limpiarCasillas();
            jTextFieldNombre.requestFocus();
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldApellidoKeyReleased

    private void jTextFieldCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_jTextFieldCodigoKeyReleased

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonSalir;
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

    public javax.swing.JButton getjButtonGuardar() {
        return jButtonGuardar;
    }

    public void setjButtonGuardar(javax.swing.JButton jButtonGuardar) {
        this.jButtonGuardar = jButtonGuardar;
    }

    public javax.swing.JButton getjButtonListar() {
        return jButtonListar;
    }

    public void setjButtonListar(javax.swing.JButton jButtonListar) {
        this.jButtonListar = jButtonListar;
    }

    public javax.swing.JButton getjButtonModificar() {
        return jButtonModificar;
    }

    public void setjButtonModificar(javax.swing.JButton jButtonModificar) {
        this.jButtonModificar = jButtonModificar;
    }

    public javax.swing.JButton getjButtonSalir() {
        return jButtonSalir;
    }

    public void setjButtonSalir(javax.swing.JButton jButtonSalir) {
        this.jButtonSalir = jButtonSalir;
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
