
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class FrmReservas2 extends javax.swing.JPanel {

    /**
     * Creates new form FrmReservas2
     */
    public FrmReservas2() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jLabel4 = new javax.swing.JLabel();
        txtreservas_id = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        txtfuncion_id = new javax.swing.JTextField();
        btnenviar = new javax.swing.JButton();
        txtcliente_id = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        txttickets = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfuncion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtcliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtreserva = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jLabel4.setText("Tickets");

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txtfuncion_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfuncion_idActionPerformed(evt);
            }
        });

        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        txtcliente_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcliente_idActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        txttickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtticketsActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jTextField5.setText("jTextField5");

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
        jtfuncion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfuncionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtfuncion);

        jLabel1.setText("Reservas");

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
        jtcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtclienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtcliente);

        jLabel2.setText("Funcion");

        jLabel3.setText("Cliente");

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
        jtreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtreservaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtreserva);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtfuncion_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfuncion_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfuncion_idActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btnenviarActionPerformed

    private void txtcliente_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcliente_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcliente_idActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

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

    private void jtfuncionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfuncionMouseClicked
        // TODO add your handling code here:
        this.MouseClickfuncion();
    }//GEN-LAST:event_jtfuncionMouseClicked

    private void jtclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtclienteMouseClicked
        // TODO add your handling code here:
        this.MouseClicclientes();
    }//GEN-LAST:event_jtclienteMouseClicked

    private void jtreservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtreservaMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtreservaMouseClicked
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
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