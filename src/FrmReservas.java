
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class FrmReservas extends javax.swing.JFrame {

    /**
     * Creates new form FrmReservas
     */
    public FrmReservas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtcliente_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtreserva = new javax.swing.JTable();
        txttickets = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfuncion = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtreservas_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtcliente = new javax.swing.JTable();
        txtfuncion_id = new javax.swing.JTextField();
        btnenviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservas");

        jLabel2.setBackground(new java.awt.Color(208, 217, 212));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Funcion");

        txtcliente_id.setBackground(new java.awt.Color(208, 217, 212));
        txtcliente_id.setForeground(new java.awt.Color(89, 85, 76));
        txtcliente_id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtcliente_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcliente_idActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(208, 217, 212));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cliente");

        btnnuevo.setBackground(new java.awt.Color(89, 85, 76));
        btnnuevo.setForeground(new java.awt.Color(208, 217, 212));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jtreserva.setBackground(new java.awt.Color(208, 217, 212));
        jtreserva.setForeground(new java.awt.Color(89, 85, 76));
        jtreserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtreserva.setGridColor(new java.awt.Color(89, 85, 76));
        jtreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtreservaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtreserva);

        txttickets.setBackground(new java.awt.Color(208, 217, 212));
        txttickets.setForeground(new java.awt.Color(89, 85, 76));
        txttickets.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txttickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtticketsActionPerformed(evt);
            }
        });

        btnactualizar.setBackground(new java.awt.Color(89, 85, 76));
        btnactualizar.setForeground(new java.awt.Color(208, 217, 212));
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(208, 217, 212));
        jTextField5.setForeground(new java.awt.Color(89, 85, 76));
        jTextField5.setText("Buscar...");
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jtfuncion.setBackground(new java.awt.Color(208, 217, 212));
        jtfuncion.setForeground(new java.awt.Color(89, 85, 76));
        jtfuncion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtfuncion.setGridColor(new java.awt.Color(89, 85, 76));
        jtfuncion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfuncionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtfuncion);

        jLabel4.setBackground(new java.awt.Color(208, 217, 212));
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Tickets");

        txtreservas_id.setBackground(new java.awt.Color(208, 217, 212));
        txtreservas_id.setForeground(new java.awt.Color(89, 85, 76));
        txtreservas_id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setBackground(new java.awt.Color(208, 217, 212));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Reservas");

        btneliminar.setBackground(new java.awt.Color(89, 85, 76));
        btneliminar.setForeground(new java.awt.Color(208, 217, 212));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jtcliente.setBackground(new java.awt.Color(208, 217, 212));
        jtcliente.setForeground(new java.awt.Color(89, 85, 76));
        jtcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtcliente.setGridColor(new java.awt.Color(89, 85, 76));
        jtcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtclienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtcliente);

        txtfuncion_id.setBackground(new java.awt.Color(208, 217, 212));
        txtfuncion_id.setForeground(new java.awt.Color(89, 85, 76));
        txtfuncion_id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtfuncion_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfuncion_idActionPerformed(evt);
            }
        });

        btnenviar.setBackground(new java.awt.Color(89, 85, 76));
        btnenviar.setForeground(new java.awt.Color(208, 217, 212));
        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcliente_id, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttickets, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtreservas_id, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                        .addComponent(txtfuncion_id))))
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnactualizar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addGap(18, 18, 18)
                .addComponent(btnenviar)
                .addGap(18, 18, 18)
                .addComponent(btnnuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtreservas_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfuncion_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcliente_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txttickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar)
                    .addComponent(btnenviar)
                    .addComponent(btnnuevo))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcliente_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcliente_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcliente_idActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jtreservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtreservaMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtreservaMouseClicked

    private void txtticketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtticketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtticketsActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try {
            // TODO add your handling code here:
            this.Actualizar();
        } catch (Exception ex) {
            Logger.getLogger(FrmReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jtfuncionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfuncionMouseClicked
        // TODO add your handling code here:
        this.MouseClickfuncion();
    }//GEN-LAST:event_jtfuncionMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void jtclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtclienteMouseClicked
        // TODO add your handling code here:
        this.MouseClicclientes();
    }//GEN-LAST:event_jtclienteMouseClicked

    private void txtfuncion_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfuncion_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfuncion_idActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btnenviarActionPerformed

    /**
     * @param args the command line arguments
     */
 public void nuevo() {
        try {
            ReservaBeans rb = new ReservaBeans();
            txtreservas_id.setText(""+rb.incremento());
            txtfuncion_id.setText("");
            txtcliente_id.setText("");
            txttickets.setText("");
            this.mostrar(jtfuncion, "SELECT * FROM funciones f");
            this.mostrar(jtcliente, "SELECT * FROM clientes p");
            this.mostrar(jtreserva, "SELECT reservas.reserva_id,reservas.funcion_id,funciones.fecha_hora,clientes.cliente_id,clientes.nombre,reservas.cantidad_tickets FROM reservas INNER JOIN clientes ON reservas.cliente_id = clientes.cliente_id join funciones on reservas.funcion_id=funciones.funcion_id;");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }
    


    public void enviar() {
        try {
            ReservaBeans rb = new ReservaBeans();
            rb.setReserva_id((Integer.parseInt(txtreservas_id.getText())));
            rb.setFuncion_id((Integer.parseInt(txtfuncion_id.getText())));
            rb.setCliente_id((Integer.parseInt(txtcliente_id.getText())));
            rb.setCantidad_tickets(Integer.parseInt(txttickets.getText()));
            rb.disponible();
            rb.insertar_reserva();
            
            this.mostrar(jtfuncion, "SELECT * FROM funciones f");
            this.mostrar(jtcliente, "SELECT * FROM clientes p");
            this.mostrar(jtreserva, "SELECT reservas.reserva_id,reservas.funcion_id,funciones.fecha_hora,clientes.cliente_id,clientes.nombre,reservas.cantidad_tickets FROM reservas INNER JOIN clientes ON reservas.cliente_id = clientes.cliente_id join funciones on reservas.funcion_id=funciones.funcion_id;");
            
            JOptionPane.showMessageDialog(null, "La Transaccion fue Exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en la Transaccion" + e.toString());
        }
    }
    
    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            ReservaBeans rb = new ReservaBeans();
            ResultSet rs;
            DefaultTableModel model = new DefaultTableModel();
            JT.setModel(model);
            rs = rb.consultarTabla(sql);
            ResultSetMetaData rsmd;
            rsmd = rs.getMetaData();
            int cantcolum = rsmd.getColumnCount();
            for (int i = 0; i < cantcolum; i++) {
                model.addColumn(rsmd.getColumnLabel(i+1));

            }
            while (rs.next()) {
                Object[] colum = new Object[cantcolum];
                for (int i = 0; i < cantcolum; i++) {
                    colum[i] = rs.getObject(i + 1);

                }
                model.addRow(colum);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar" + e.toString());
        }

    }
    
    private void MouseClickfuncion(){
        int fila1= jtfuncion.getSelectedRow();

        txtfuncion_id.setText(jtfuncion.getModel().getValueAt(fila1, 0).toString());

        
        
    }
    private void MouseClicclientes(){
        
        int fila2= jtcliente.getSelectedRow();
        txtcliente_id.setText(jtcliente.getModel().getValueAt(fila2, 0).toString());
        
        
    }
    
    public void Actualizar()throws Exception{
        try {
            ReservaBeans rb = new ReservaBeans();
            rb.setReserva_id((Integer.parseInt(txtreservas_id.getText())));
            rb.setFuncion_id(Integer.parseInt(txtfuncion_id.getText()));
            rb.setCliente_id(Integer.parseInt(txtcliente_id.getText()));
            rb.setCantidad_tickets(Integer.parseInt(txttickets.getText()));
            rb.actulizar_reserva();
            this.mostrar(jtfuncion, "SELECT * FROM funciones f");
            this.mostrar(jtcliente, "SELECT * FROM clientes p");
            this.mostrar(jtreserva, "SELECT reservas.reserva_id,reservas.funcion_id,funciones.fecha_hora,clientes.cliente_id,clientes.nombre,reservas.cantidad_tickets FROM reservas INNER JOIN clientes ON reservas.cliente_id = clientes.cliente_id join funciones on reservas.funcion_id=funciones.funcion_id;");
            JOptionPane.showMessageDialog(null, "La Transaccion fue Exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en la Transaccion" + e.toString());
        }
    }
    
    public void eliminar(){
        try {
            ReservaBeans rb = new ReservaBeans();
            rb.setReserva_id(Integer.parseInt(txtreservas_id.getText()));
            rb.actulizar_reserva();
            this.mostrar(jtfuncion, "SELECT * FROM funciones f");
            this.mostrar(jtcliente, "SELECT * FROM clientes p");
            this.mostrar(jtreserva, "SELECT reservas.reserva_id,reservas.funcion_id,funciones.fecha_hora,clientes.cliente_id,clientes.nombre,reservas.cantidad_tickets FROM reservas INNER JOIN clientes ON reservas.cliente_id = clientes.cliente_id join funciones on reservas.funcion_id=funciones.funcion_id;");
            JOptionPane.showMessageDialog(null, "La actualizacion fue exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " +e.toString());
        }
    }
    private void MouseClick(){
        
        int fila3= jtcliente.getSelectedRow();
        txtreservas_id.setText(jtcliente.getModel().getValueAt(fila3, 0).toString());
        txtfuncion_id.setText(jtcliente.getModel().getValueAt(fila3, 1).toString());
        txtcliente_id.setText(jtcliente.getModel().getValueAt(fila3, 2).toString());
        txttickets.setText(jtcliente.getModel().getValueAt(fila3, 3).toString());
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnenviar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable jtcliente;
    private javax.swing.JTable jtfuncion;
    private javax.swing.JTable jtreserva;
    private javax.swing.JTextField txtcliente_id;
    private javax.swing.JTextField txtfuncion_id;
    private javax.swing.JTextField txtreservas_id;
    private javax.swing.JTextField txttickets;
    // End of variables declaration//GEN-END:variables
}
