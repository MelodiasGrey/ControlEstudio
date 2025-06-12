package com.mycompany.controlestudio.vista;

import com.mycompany.controlestudio.dao.personaDAO;
import com.mycompany.controlestudio.servicio.AutenticationService;
import com.mycompany.controlestudio.modelo.persona;

import java.awt.*;
import javax.swing.*;
import java.sql.SQLException;


public class LoginFrame extends javax.swing.JFrame {

    private AutenticationService autenticacionService; // Servicio de autenticación
    public static persona personaLogueada; // Persona autenticada
    
    public LoginFrame() {

        initComponents();
        autenticacionService = new AutenticationService();
        this.setLocationRelativeTo(null);
        txtUsuario.requestFocusInWindow();
        txtContrasena.addActionListener(e -> btnIngresarActionPerformed(null));
        txtUsuario.addActionListener(e -> txtContrasena.requestFocusInWindow());
        lblMensaje.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelLoginFondo = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));

        jPanel2.setBackground(new java.awt.Color(240, 238, 238));

        jPanelLoginFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLoginFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblContrasena.setForeground(new java.awt.Color(102, 102, 102));
        lblContrasena.setText("Contraseña");

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(51, 51, 255));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Iniciar Sesión");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("UEE José Domingo Rus");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Inicio de Sesión");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Sistema de Control de Estudio");

        lblMensaje.setForeground(new java.awt.Color(255, 0, 51));
        lblMensaje.setText("Bienvenido!");

        javax.swing.GroupLayout jPanelLoginFondoLayout = new javax.swing.GroupLayout(jPanelLoginFondo);
        jPanelLoginFondo.setLayout(jPanelLoginFondoLayout);
        jPanelLoginFondoLayout.setHorizontalGroup(
            jPanelLoginFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelLoginFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34))
            .addGroup(jPanelLoginFondoLayout.createSequentialGroup()
                .addGroup(jPanelLoginFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginFondoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelLoginFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContrasena)
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLoginFondoLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel5))
                            .addComponent(lblMensaje)
                            .addGroup(jPanelLoginFondoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanelLoginFondoLayout.setVerticalGroup(
            jPanelLoginFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginFondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo de la escuela grande.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(55, 55, 55)
                .addComponent(jPanelLoginFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanelLoginFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed


        try {
            String usuario = txtUsuario.getText();
            String clave = String.valueOf(txtContrasena.getPassword());

            //Verificacion de campos vacios y mensaje de error
            if (usuario.isEmpty() || clave.isEmpty()) {
                this.lblMensaje.setText("Campos vacíos.");
                this.lblMensaje.setForeground(Color.RED);
                this.lblMensaje.setVisible(true);
                this.txtContrasena.setText("");
                this.txtContrasena.requestFocus();
                return;
            }

            persona p = autenticacionService.autenticar(usuario, clave);
            if (p != null) {
                personaLogueada = p;
                this.lblMensaje.setText("Sesión iniciada correctamente");
                this.lblMensaje.setForeground(Color.green);
                this.lblMensaje.setVisible(true);
                JDialog dialog = new JDialog(this, "Bienvenido", true);
                JLabel label = new JLabel("¡Bienvenido, " + p.getPrimer_nombre() + "!", 0);
                label.setFont(new Font("Segoe UI", 1, 18));
                dialog.getContentPane().add(label);
                dialog.setSize(350, 120);
                dialog.setLocationRelativeTo(this);
                (new Timer(1500, (ex) -> dialog.dispose())).start();
                dialog.setVisible(true);

                // **Apertura de la ventana correcta según el rol**
            switch (p.getTipo_rol()) {
                case Administrador:
                    AdminHomePage adminHome = new AdminHomePage(p);
                    adminHome.setVisible(true);
                    break;
                case Profesor:
                    ProfesorHomePage profesorHome = new ProfesorHomePage(p);
                    profesorHome.setVisible(true);
                    break;
                case Estudiante:
                    EstudianteHomePage estudianteHome = new EstudianteHomePage(p);
                    estudianteHome.setVisible(true);
                    break;
            }
                this.dispose();
                
            } else {
                this.lblMensaje.setText("Usuario o contraseña incorrectos.");
                this.txtContrasena.setText("");
                this.txtContrasena.requestFocus();
                this.lblMensaje.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de sistema: " + e.getMessage(), "Error", 0);
        }
            
        // TODO add your handling code here:

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
        txtUsuario.requestFocusInWindow(); // El cursor estara ubicado en txtUsuario automaticamente.
        
        // TODO add your handling code here:
    }

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {
    txtContrasena.addActionListener(e ->btnIngresarActionPerformed(null)); // Al presionar Enter se pulsara el boton Ingresar automaticamente

    // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLoginFondo;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
