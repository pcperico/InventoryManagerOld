/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Category;

import Data.Configuration.StringsKeysHelper;
import Data.Dao.Interfaces.ICategoryRepository;
import Dtos.CategoryDto;
import General.JInternalFrameCenter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author GlobalDev
 */
public class ListCategories extends JInternalFrameCenter {

    ICategoryRepository _categoryRepository;
    DefaultTableModel dtm;
    int categorySelectedId=0;
    /**
     * Creates new form ListCategories
     */
    public ListCategories() {
        initComponents();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(StringsKeysHelper.applicationContextFile);
        _categoryRepository = (ICategoryRepository)ctx.getBean(StringsKeysHelper.CategoryRepository);
        dtm = new DefaultTableModel();
        dtm.addColumn("Category");
        dtm.addColumn("Total de Productos");  
        dtm.addColumn("");
    }
    
    private void fillTableUnits(List<CategoryDto> categories,DefaultTableModel model)    
    {        
        model.setRowCount(0);
        this.tbl_categories.setModel(model);             
        this.tbl_categories.getColumnModel().getColumn(2).setMinWidth(0);
        this.tbl_categories.getColumnModel().getColumn(2).setMaxWidth(0);
        Object [] fila = new Object[3];
        for(CategoryDto c:categories)
        {
           fila[0] = c.getDescription();
           fila[1] = c.getTotalProducts(); 
           fila[2] = c.getId();
           model.addRow(fila);
        }    
        this.lb_counter.setText("Total de Categorias: "+String.valueOf(categories.size()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_categories = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_list = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        lb_counter = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Modulo Categorias");

        Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tbl_categories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_categoriesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_categories);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setText("Buscar:");

        btn_search.setText("Buscar");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_list.setText("Listar");
        btn_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listActionPerformed(evt);
            }
        });

        btn_add.setText("Agregar");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_edit.setText("Modificar");
        btn_edit.setEnabled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        lb_counter.setText("Total de Categorias: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_list, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit)
                        .addGap(31, 31, 31)
                        .addComponent(lb_counter)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_list)
                    .addComponent(btn_add)
                    .addComponent(btn_edit)
                    .addComponent(lb_counter))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listActionPerformed
        try
        {
            this.fillTableUnits(_categoryRepository.ListAll(), dtm);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Error al listar categorias, favor contacte con el administrador del sistema");
        }
    }//GEN-LAST:event_btn_listActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        AddEditCategories aec= new AddEditCategories();
        this.getParent().add(aec);
        this.dispose();
        aec.Centrar();
        aec.show();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
       AddEditCategories aec = new AddEditCategories(categorySelectedId);
       this.getParent().add(aec);
       aec.Centrar();
       this.dispose();
       aec.show();
    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_categoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_categoriesMouseClicked
         categorySelectedId =(int) this.tbl_categories.getValueAt(this.tbl_categories.getSelectedRow(),2);        
        if(categorySelectedId>0)
            this.btn_edit.setEnabled(true);
        else
            this.btn_edit.setEnabled(false);
    }//GEN-LAST:event_tbl_categoriesMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try
        {
            this.fillTableUnits(_categoryRepository.FilterByDescription(this.txt_search.getText().trim()), dtm);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Error al listar categorias, favor contacte con el administrador del sistema");
        }        
    }//GEN-LAST:event_btn_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_list;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_counter;
    private javax.swing.JTable tbl_categories;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
