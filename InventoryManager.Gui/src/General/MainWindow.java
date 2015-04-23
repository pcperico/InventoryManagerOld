/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import Category.ListCategories;
import Proveedor.AgregarProveedor;
import Proveedor.ListarProveedores;
import Units.ListUnits;
import User.AddUser;

import javax.swing.JFrame;

/**
 *
 * @author GlobalDev
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {        
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
        AdminMenu = new javax.swing.JMenu();
        CategoriesMenu = new javax.swing.JMenuItem();
        UnitsMenu = new javax.swing.JMenuItem();
        ProveedoresMenu = new javax.swing.JMenu();
        ProveedoresAdd = new javax.swing.JMenuItem();
        ProveedoresListar = new javax.swing.JMenuItem();
        UsersMenu = new javax.swing.JMenu();
        MenuAddUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVENTORY MANAGER");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        AdminMenu.setText("Administracion");

        CategoriesMenu.setText("Categorias");
        CategoriesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriesMenuActionPerformed(evt);
            }
        });
        AdminMenu.add(CategoriesMenu);

        UnitsMenu.setText("Unidades de Medida");
        UnitsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitsMenuActionPerformed(evt);
            }
        });
        AdminMenu.add(UnitsMenu);

        jMenuBar1.add(AdminMenu);

        ProveedoresMenu.setText("Proveeedores");

        ProveedoresAdd.setText("Agregar");
        ProveedoresAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresAddActionPerformed(evt);
            }
        });
        ProveedoresMenu.add(ProveedoresAdd);

        ProveedoresListar.setText("Listar");
        ProveedoresListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresListarActionPerformed(evt);
            }
        });
        ProveedoresMenu.add(ProveedoresListar);

        jMenuBar1.add(ProveedoresMenu);

        UsersMenu.setText("Usuarios");

        MenuAddUser.setText("Agregar");
        MenuAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddUserActionPerformed(evt);
            }
        });
        UsersMenu.add(MenuAddUser);

        jMenuBar1.add(UsersMenu);

        jMenu2.setText("Reportes");

        jMenu1.setText("Proveedores");

        jMenuItem2.setText("Proveedores Activos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu2.add(jMenu1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void ProveedoresAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresAddActionPerformed
        AgregarProveedor viewAddProv= new AgregarProveedor();
        this.add(viewAddProv); 
        viewAddProv.Centrar();
        viewAddProv.show();
    }//GEN-LAST:event_ProveedoresAddActionPerformed

    private void ProveedoresListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresListarActionPerformed
        ListarProveedores listProv=new ListarProveedores();
        this.add(listProv); 
        listProv.Centrar();
        listProv.show();
    }//GEN-LAST:event_ProveedoresListarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ReportGenerator rg = new ReportGenerator();
        rg.Generar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MenuAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddUserActionPerformed
        AddUser au= new AddUser();
        this.add(au);
        au.Centrar();
        au.show();
    }//GEN-LAST:event_MenuAddUserActionPerformed

    private void UnitsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitsMenuActionPerformed
        ListUnits lu = new ListUnits();
        this.add(lu);
        lu.Centrar();
        lu.show();                
    }//GEN-LAST:event_UnitsMenuActionPerformed

    private void CategoriesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriesMenuActionPerformed
        ListCategories lc = new ListCategories();        
        this.add(lc);
        lc.Centrar();
        lc.show();
    }//GEN-LAST:event_CategoriesMenuActionPerformed

  
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdminMenu;
    private javax.swing.JMenuItem CategoriesMenu;
    private javax.swing.JMenuItem MenuAddUser;
    private javax.swing.JMenuItem ProveedoresAdd;
    private javax.swing.JMenuItem ProveedoresListar;
    private javax.swing.JMenu ProveedoresMenu;
    private javax.swing.JMenuItem UnitsMenu;
    private javax.swing.JMenu UsersMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
