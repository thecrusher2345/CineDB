
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class FrmFunciones extends javax.swing.JFrame {

    /**
     * Creates new form FrmFunciones
     */
    public FrmFunciones() {
        initComponents();
        this.mostrar(jtpelicula, "SELECT * FROM peliculas p");
        this.mostrar(jtsalas, "SELECT * FROM salas s");
        this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnenviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpelicula = new javax.swing.JTable();
        txtfuncionid = new javax.swing.JTextField();
        txtpeliculaid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtsalas = new javax.swing.JTable();
        txtsalaid = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtfunciones = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funciones");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnenviar.setBackground(new java.awt.Color(89, 85, 76));
        btnenviar.setForeground(new java.awt.Color(208, 217, 212));
        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 406, -1, -1));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("FuncionID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 9, -1, -1));

        btnnuevo.setBackground(new java.awt.Color(89, 85, 76));
        btnnuevo.setForeground(new java.awt.Color(208, 217, 212));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 406, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("SalaID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 89, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PeliculaID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 49, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Fecha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 129, -1, -1));

        jtpelicula.setBackground(new java.awt.Color(208, 217, 212));
        jtpelicula.setForeground(new java.awt.Color(89, 85, 76));
        jtpelicula.setModel(new javax.swing.table.DefaultTableModel(
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
        jtpelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtpeliculaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtpelicula);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, 431, 82));

        txtfuncionid.setBackground(new java.awt.Color(208, 217, 212));
        txtfuncionid.setForeground(new java.awt.Color(89, 85, 76));
        getContentPane().add(txtfuncionid, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 6, 255, -1));

        txtpeliculaid.setBackground(new java.awt.Color(208, 217, 212));
        txtpeliculaid.setForeground(new java.awt.Color(89, 85, 76));
        getContentPane().add(txtpeliculaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 46, 257, -1));

        jtsalas.setBackground(new java.awt.Color(208, 217, 212));
        jtsalas.setForeground(new java.awt.Color(89, 85, 76));
        jtsalas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtsalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtsalasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtsalas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 306, 431, 82));

        txtsalaid.setBackground(new java.awt.Color(208, 217, 212));
        txtsalaid.setForeground(new java.awt.Color(89, 85, 76));
        getContentPane().add(txtsalaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 86, 257, -1));

        txtfecha.setBackground(new java.awt.Color(208, 217, 212));
        txtfecha.setForeground(new java.awt.Color(89, 85, 76));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 126, 257, -1));

        jTextField5.setBackground(new java.awt.Color(208, 217, 212));
        jTextField5.setForeground(new java.awt.Color(89, 85, 76));
        jTextField5.setText("Buscar...");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 166, 327, -1));

        btnactualizar.setBackground(new java.awt.Color(89, 85, 76));
        btnactualizar.setForeground(new java.awt.Color(208, 217, 212));
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 406, -1, -1));

        jtfunciones.setBackground(new java.awt.Color(208, 217, 212));
        jtfunciones.setForeground(new java.awt.Color(89, 85, 76));
        jtfunciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtfunciones);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 6, 402, 423));

        btneliminar.setBackground(new java.awt.Color(89, 85, 76));
        btneliminar.setForeground(new java.awt.Color(208, 217, 212));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 406, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
this.enviar();
    }//GEN-LAST:event_btnenviarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
this.nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jtpeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtpeliculaMouseClicked
this.MouseClickpeliculas();
    }//GEN-LAST:event_jtpeliculaMouseClicked

    private void jtsalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtsalasMouseClicked
this.MouseClicksalas();
    }//GEN-LAST:event_jtsalasMouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try {
            this.Actualizar();
        } catch (Exception ex) {
            Logger.getLogger(FrmFunciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        this.eliminar();
    }//GEN-LAST:event_btneliminarActionPerformed

public void nuevo() {
        try {
            FuncionesBeans fb = new FuncionesBeans();
            LocalDateTime horactual = LocalDateTime.now();
            DateTimeFormatter formated = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String horactualformat = horactual.format(formated);
            txtfuncionid.setText(""+fb.incremento());
            txtpeliculaid.setText("");
            txtsalaid.setText("");
            txtfecha.setText(horactualformat);
            this.mostrar(jtpelicula, "SELECT * FROM peliculas p");
            this.mostrar(jtsalas, "SELECT * FROM salas s");
            this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }
    


    public void enviar() {
        try {
            FuncionesBeans fb = new FuncionesBeans();
            fb.setFuncion_id((Integer.parseInt(txtfuncionid.getText())));
            fb.setPelicula_id((Integer.parseInt(txtpeliculaid.getText())));
            fb.setSala_id((Integer.parseInt(txtsalaid.getText())));
            fb.setFecha_hora(txtfecha.getText());
            fb.insertar_funcion();
            fb.insertar_capacidad();
            this.mostrar(jtpelicula, "SELECT * FROM peliculas p");
            this.mostrar(jtsalas, "SELECT * FROM salas s");
            this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
            JOptionPane.showMessageDialog(null, "La Transaccion fue Exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en la Transaccion Enviar" + e.toString());
        }
    }
    
    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            SalaBeans sl = new SalaBeans();
            ResultSet rs;
            DefaultTableModel model = new DefaultTableModel();
            JT.setModel(model);
            rs = sl.consultarTabla(sql);
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
    
    private void MouseClickpeliculas(){
        int fila1= jtpelicula.getSelectedRow();
        txtpeliculaid.setText(jtpelicula.getModel().getValueAt(fila1, 0).toString());
        
        
    }
    private void MouseClicksalas(){
        
        int fila2= jtsalas.getSelectedRow();
        txtsalaid.setText(jtsalas.getModel().getValueAt(fila2, 0).toString());
        
        
    }
    
    public void Actualizar()throws Exception{
        try {
            FuncionesBeans fb = new FuncionesBeans();
            fb.setFuncion_id((Integer.parseInt(txtfuncionid.getText())));
            fb.setPelicula_id(Integer.parseInt(txtpeliculaid.getText()));
            fb.setSala_id(Integer.parseInt(txtsalaid.getText()));
            fb.setSala_id(Integer.parseInt(txtfecha.getText()));
            fb.actulizar_funcion();
            
            this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
            JOptionPane.showMessageDialog(null, "La Transaccion fue Exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en la Transaccion" + e.toString());
        }
    }
    
    public void eliminar(){
        try {
            FuncionesBeans fb = new FuncionesBeans();
            fb.setFuncion_id(Integer.parseInt(txtfuncionid.getText()));
            fb.actulizar_funcion();
            this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
  JOptionPane.showMessageDialog(null, "La actualizacion fue exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " +e.toString());
        }
    }
    
    public void limite_asientos(String sql){
        try {
            FuncionesBeans sl = new FuncionesBeans();
            ResultSet rs;
            rs=sl.consultar_asiento(sql);
            String id = rs.getString(0);
            String capacidad= rs.getString(1);
            if (id == txtsalaid.getText()) {
                
            }
            
            
        } catch (Exception e) {
        }
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
    private javax.swing.JTable jtfunciones;
    private javax.swing.JTable jtpelicula;
    private javax.swing.JTable jtsalas;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtfuncionid;
    private javax.swing.JTextField txtpeliculaid;
    private javax.swing.JTextField txtsalaid;
    // End of variables declaration//GEN-END:variables
}
