/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestorsupermercadoinventario.ventanas;

import gestorsupermercadoinventario.Gestor;

/**
 *
 * @author samirabecerra
 */
public class VentanaProveedor extends javax.swing.JFrame {
    private Gestor gestor;
    /**
     * Creates new form VentanaProveedor
     */
    public VentanaProveedor(Gestor gestor) {
        
        initComponents();
        this.gestor= gestor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msj = new javax.swing.JLabel();
        agregarProd = new javax.swing.JButton();
        eliminarProd = new javax.swing.JButton();
        buscarProd = new javax.swing.JButton();
        listaProd = new javax.swing.JButton();
        mostrarPro = new javax.swing.JButton();
        modificarProd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        backToMenu = new javax.swing.JButton();
        filtrarProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msj.setFont(new java.awt.Font("Noteworthy", 0, 18)); // NOI18N
        msj.setText("Menú productos suministrados por proveedores");
        getContentPane().add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 191, -1, -1));

        agregarProd.setText(" Agregar producto a proveedor");
        agregarProd.setPreferredSize(new java.awt.Dimension(214, 23));
        agregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdActionPerformed(evt);
            }
        });
        getContentPane().add(agregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 232, 222, -1));

        eliminarProd.setText("Eliminar producto a proveedor");
        eliminarProd.setPreferredSize(new java.awt.Dimension(214, 23));
        eliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProdActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 273, 222, -1));

        buscarProd.setText("Buscar producto a proveedor");
        buscarProd.setPreferredSize(new java.awt.Dimension(214, 23));
        buscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdActionPerformed(evt);
            }
        });
        getContentPane().add(buscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 314, 222, -1));

        listaProd.setText("Lista de producto a proveedor");
        listaProd.setPreferredSize(new java.awt.Dimension(214, 23));
        listaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProdActionPerformed(evt);
            }
        });
        getContentPane().add(listaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 355, 222, -1));

        mostrarPro.setText("Mostrar productos y su stock");
        mostrarPro.setPreferredSize(new java.awt.Dimension(214, 23));
        mostrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarProActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 396, 222, -1));

        modificarProd.setText("Modificar producto a proveedor");
        modificarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProdActionPerformed(evt);
            }
        });
        getContentPane().add(modificarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 222, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, 380));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/superLogo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 375, 185));

        backToMenu.setText("Volver a Inicio");
        backToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuActionPerformed(evt);
            }
        });
        getContentPane().add(backToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 120, 30));

        filtrarProd.setText("Filtrar productos por stock");
        filtrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarProdActionPerformed(evt);
            }
        });
        getContentPane().add(filtrarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * Este método se llama cuando se hace clic en el botón "Agregar Producto a Proveedor".
    * Crea una nueva instancia de la ventana de agregar producto, la centra en la pantalla,
    * la muestra y cierra la ventana actual.
    *
    * @param evt El evento de acción que desencadena este método.
    */
    private void agregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdActionPerformed
        // TODO add your handling code here:
        VentanaAgregarProducto aProd = new VentanaAgregarProducto(this.gestor);
        aProd.setLocationRelativeTo(null);
        aProd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_agregarProdActionPerformed
    
    /**
    * Este método se llama cuando se hace clic en el botón "Eliminar Producto".
    * Crea una nueva instancia de la ventana de eliminar producto, la centra en la pantalla,
    * la muestra y cierra la ventana actual.
    *
    * @param evt El evento de acción que desencadena este método.
    */
    private void eliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProdActionPerformed
        // TODO add your handling code here:
        VentanaEliminarProducto eProd = new VentanaEliminarProducto(this.gestor); 
        eProd.setLocationRelativeTo(null);
        eProd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eliminarProdActionPerformed

    /**
    * Este método se llama cuando se hace clic en el botón "Buscar Producto".
    * Crea una nueva instancia de la ventana de búsqueda de producto, la centra en la pantalla,
    * la muestra y cierra la ventana actual.
    *
    * @param evt El evento de acción que desencadena este método.
    */
    private void buscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdActionPerformed
        // TODO add your handling code here:
        VentanaBuscarProducto bProd = new VentanaBuscarProducto(this.gestor); 
        bProd.setLocationRelativeTo(null);
        bProd.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_buscarProdActionPerformed

    /**
    * Este método se llama cuando se hace clic en el botón "Lista de Productos".
    * Crea una nueva instancia de la ventana de lista de productos, la centra en la pantalla,
    * la muestra y cierra la ventana actual.
    *
    * @param evt El evento de acción que desencadena este método.
    */
    private void listaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProdActionPerformed
        // TODO add your handling code here:
        VentanaListaProducto lProd = new VentanaListaProducto(this.gestor); 
        lProd.setLocationRelativeTo(null);
        lProd.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_listaProdActionPerformed
    
    /**
    * Este método se llama cuando se hace clic en el botón "Mostrar Producto".
    * Crea una nueva instancia de la ventana de mostrar producto, la centra en la pantalla,
    * la muestra y cierra la ventana actual.
    *
    * @param evt El evento de acción que desencadena este método.
    */
    private void mostrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarProActionPerformed
        // TODO add your handling code here:
        VentanaMostrarProducto mProd = new VentanaMostrarProducto(this.gestor); 
        mProd.setLocationRelativeTo(null);
        mProd.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_mostrarProActionPerformed
    /**
    * Este método se llama cuando se hace clic en el botón "Modificar Producto a Proveedor ".
    * Crea una nueva instancia de la ventana de modificar producto, la centra en la pantalla,
    * la muestra y cierra la ventana actual.
    *
    * @param evt El evento de acción que desencadena este método.
    */
    private void modificarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProdActionPerformed
        // TODO add your handling code here:
        VentanaModificarProducto modProd = new VentanaModificarProducto(this.gestor); 
        modProd.setLocationRelativeTo(null);
        modProd.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_modificarProdActionPerformed

    /**
    * Este método se llama cuando se hace clic en el botón "Volver a Inicio".
    * Crea una nueva instancia de la ventana de inicio, la centra en la pantalla,
    * la muestra y cierra la ventana actual.
    *
    * @param evt El evento de acción que desencadena este método.
    */
    private void backToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuActionPerformed
        // TODO add your handling code here:
        
        VentanaInicio newVinicio = new VentanaInicio(this.gestor); 
        newVinicio.setLocationRelativeTo(null);
        newVinicio.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backToMenuActionPerformed
    /**
    * Este método se llama cuando se hace clic en el botón "Filtrar Producto por Cantidad de Stock".
    * Crea una nueva instancia de la ventana de filtrar producto, la centra en la pantalla,
    * la muestra y cierra la ventana actual.
    *
    * @param evt El evento de acción que desencadena este método.
    */
    private void filtrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarProdActionPerformed
        // TODO add your handling code here:
        VentanaFiltrarProducto filtrarProd = new VentanaFiltrarProducto(this.gestor); 
        filtrarProd.setLocationRelativeTo(null);
        filtrarProd.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_filtrarProdActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gestor gestor = null;
                new VentanaProveedor(gestor).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProd;
    private javax.swing.JButton backToMenu;
    private javax.swing.JButton buscarProd;
    private javax.swing.JButton eliminarProd;
    private javax.swing.JButton filtrarProd;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton listaProd;
    private javax.swing.JLabel logo;
    private javax.swing.JButton modificarProd;
    private javax.swing.JButton mostrarPro;
    private javax.swing.JLabel msj;
    // End of variables declaration//GEN-END:variables
}
