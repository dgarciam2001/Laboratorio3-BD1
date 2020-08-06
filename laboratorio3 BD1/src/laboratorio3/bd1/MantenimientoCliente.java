/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3.bd1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Garcia
 */
public class MantenimientoCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoCliente
     */
    public MantenimientoCliente() {
        initComponents();
        buscarCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdVendedor = new javax.swing.JTextField();
        cboBuscar = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setVisible(true);

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jLabel2.setText("Id ");

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        jLabel3.setText("Nombre");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("idVendedor");

        jLabel6.setText("Telefono");

        jLabel4.setText("Correo");

        jLabel5.setText("Direccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70)
                        .addComponent(txtNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(txtId))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(txtIdVendedor))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(36, 36, 36)
                                .addComponent(btnModificar)
                                .addGap(27, 27, 27)
                                .addComponent(Eliminar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion)
                            .addComponent(txtCorreo))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(Eliminar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
        if (txtId.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty()
            || txtCorreo.getText().trim().isEmpty() || txtDireccion.getText().trim().isEmpty()
            || txtTelefono.getText().trim().isEmpty() || txtIdVendedor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS","WARNING",JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafeteria", "root", "Rochi1523");
                PreparedStatement pst = cn.prepareStatement("insert into clientes values(?,?,?,?,?,?)");

                pst.setString(1, txtId.getText().trim());
                pst.setString(2, txtNombre.getText().trim());
                pst.setString(3, txtCorreo.getText().trim());
                pst.setString(4, txtDireccion.getText().trim());
                pst.setString(5, txtTelefono.getText().trim());
                pst.setString(6, txtIdVendedor.getText().trim());
                
                pst.executeUpdate();

                txtId.setText("");
                txtNombre.setText("");
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                txtIdVendedor.setText("");
               
                JOptionPane.showMessageDialog(this, "Registro exitoso.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción" || txtId.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty()
            || txtCorreo.getText().trim().isEmpty() || txtDireccion.getText().trim().isEmpty()
            || txtIdVendedor.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS","WARNING",JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String ID = cboBuscar.getSelectedItem().toString();

                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafeteria", "root", "Rochi1523");
                PreparedStatement pst = cn.prepareStatement("update clientes set IdCliente = ?, NombreCliente=?, CorreoCliente=?, DireccionCliente=?, TelefonoCliente=?, Idvendedor=?, where IdCliente = " + ID);

                pst.setString(1, txtId.getText().trim());
                pst.setString(2, txtNombre.getText().trim());
                pst.setString(3, txtCorreo.getText().trim());
                pst.setString(4, txtDireccion.getText().trim());
                pst.setString(5, txtTelefono.getText().trim());
                pst.setString(6, txtIdVendedor.getText().trim());
                
                pst.executeUpdate();

                txtId.setText("");
                txtNombre.setText("");
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                txtIdVendedor.setText("");
                
                JOptionPane.showMessageDialog(this, "Modificación exitosa.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error en modificación.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        // TODO add your handling code here:
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUN MAESTRO A ELIMINAR");
        } else {

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafeteria", "root", "Rochi1523");
                PreparedStatement pst = cn.prepareStatement("delete from clientes where IdCliente = ?");

                pst.setString(1, cboBuscar.getSelectedItem().toString());
                pst.executeUpdate();

                txtId.setText("");
                txtNombre.setText("");
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                txtIdVendedor.setText("");
                

                JOptionPane.showMessageDialog(this, "Registro eliminado.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Registro no eeliminado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_EliminarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUN MAESTRO DE BUSQUEDA");
        } else {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafeteria", "root", "Rochi1523");
            PreparedStatement pst = cn.prepareStatement("select * from clientes where IdCliente = ?");
            pst.setString(1, cboBuscar.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtId.setText(rs.getString("IdCliente"));
                txtNombre.setText(rs.getString("NombreCliente"));
                txtCorreo.setText(rs.getString("CorreoCliente"));
                txtDireccion.setText(rs.getString("DireccionCliente"));
                txtTelefono.setText(rs.getString("TelefonoCliente"));
                txtIdVendedor.setText(rs.getString("Idvendedor"));
                
                JOptionPane.showMessageDialog(this, "Se encontró el registro.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Registro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Registro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
         }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed


    public void buscarCliente(){
            try{
          
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cafeteria", "root", "Rochi1523");
        PreparedStatement pst = cn.prepareStatement("select IdCliente from clientes");
            ResultSet rs = pst.executeQuery();

            cboBuscar.addItem("Seleccione una opción");
            while (rs.next()) {
                cboBuscar.addItem(rs.getString("IdCliente"));
            }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdVendedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
