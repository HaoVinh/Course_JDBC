/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BLL.CourseInstructorBLL;
import DAL.CourseInstructorDAL;
import Model.CourseInstructor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VU
 */
public class CourseInstructorUI extends javax.swing.JFrame {

    /**
     * Creates new form CourseInstructor
     */
    private DefaultTableModel table = new DefaultTableModel();
    CourseInstructorDAL ciDAL = new CourseInstructorDAL();
    CourseInstructorBLL ciBLL = new CourseInstructorBLL();

    public CourseInstructorUI() {
        initComponents();
        courseInstructor();

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCourseIns = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        courseId_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        personId_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        del_txt = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        search_txt = new javax.swing.JTextField();
        cbb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("CourseInstructor");
        jLabel1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CourseID");

        courseId_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseId_txtActionPerformed(evt);
            }
        });

        jLabel3.setText("PersonID");

        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        del_txt.setText("Delete");
        del_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_txtActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        search_txt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                search_txtCaretUpdate(evt);
            }
        });

        cbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CourseID", "PersonID" }));
        cbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course ID", "Person ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCourseInsLayout = new javax.swing.GroupLayout(panelCourseIns);
        panelCourseIns.setLayout(panelCourseInsLayout);
        panelCourseInsLayout.setHorizontalGroup(
            panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCourseInsLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(courseId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(personId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCourseInsLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCourseInsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCourseInsLayout.createSequentialGroup()
                        .addGroup(panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCourseInsLayout.createSequentialGroup()
                                .addGroup(panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(add_btn)
                                    .addComponent(searchbtn))
                                .addGap(75, 75, 75)
                                .addGroup(panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCourseInsLayout.createSequentialGroup()
                                        .addComponent(del_txt)
                                        .addGap(96, 96, 96)
                                        .addComponent(jButton3))
                                    .addGroup(panelCourseInsLayout.createSequentialGroup()
                                        .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(158, 158, 158))))
        );
        panelCourseInsLayout.setVerticalGroup(
            panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCourseInsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(courseId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(personId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn)
                    .addComponent(del_txt)
                    .addComponent(jButton3))
                .addGap(40, 40, 40)
                .addGroup(panelCourseInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCourseIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCourseIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseId_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseId_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseId_txtActionPerformed

    private void cbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbActionPerformed
    private void courseInstructor() {
        table = new DefaultTableModel();

        String[] column = {"CourseID", "PersonID"};

        table.setColumnIdentifiers(column);

        ArrayList<CourseInstructor> ciList = ciDAL.readCourseInstructor();
        set_TableData_CourseInstructor(ciList);
        jTable1.setModel(table);
    }

    private void set_TableData_CourseInstructor(ArrayList<CourseInstructor> ciList) {
        for (CourseInstructor olcourse : ciList) {
            table.addRow(new Object[]{olcourse.getCourseID(), olcourse.getPersonID()});
//            System.out.println(course.getTitle());
        }
    }
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        CourseInstructor courseInstructor = new CourseInstructor();
        courseInstructor.setCourseID(Integer.parseInt(courseId_txt.getText()));
        CourseInstructorDAL ciDAL = new CourseInstructorDAL();
        courseInstructor.setPersonID(Integer.parseInt(personId_txt.getText()));

        try {
            if (ciDAL.insertCourseInstructor(courseInstructor) > 0) {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseInstructorUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        courseInstructor();

    }//GEN-LAST:event_add_btnActionPerformed

    private void del_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_txtActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(del_txt, "Hãy chọn dòng mong muốn!!!");
            return;
        }

        try {
            int SelectedRow = jTable1.getSelectedRow();
            System.out.println(SelectedRow);
            int courseID = (Integer) table.getValueAt(SelectedRow, 0);
            ciBLL.deleteCourseInstructor(courseID);
        } catch (Exception ex) {
            Logger.getLogger(CourseInstructorUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        courseInstructor();
    }//GEN-LAST:event_del_txtActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tbl_OLCourse = (DefaultTableModel) jTable1.getModel();
        int SelectedRow = jTable1.getSelectedRow();
        courseId_txt.setText(String.valueOf(tbl_OLCourse.getValueAt(SelectedRow, 0)));
        personId_txt.setText(String.valueOf(tbl_OLCourse.getValueAt(SelectedRow, 1)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }

        int SelectedRow = jTable1.getSelectedRow();//lấy số dòng được chọn

        //đây là phần khởi tạo thông tin độc giả lấy dữ liệu từ các Text và combobox
        CourseInstructor courseInstructor = new CourseInstructor();
        courseInstructor.setCourseID(Integer.parseInt(courseId_txt.getText()));
        courseInstructor.setPersonID(Integer.parseInt(personId_txt.getText()));
        //đây là phần thực hiện sửa dữ liệu trong database
        try {
            ciBLL.updateCourseInstructor(courseInstructor);
        } catch (Exception ex) {
            Logger.getLogger(CourseInstructorUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        courseInstructor();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void search_txtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_search_txtCaretUpdate
         if (search_txt.getText().isBlank())
            jTable1.setModel(table);
        else {
            DefaultTableModel model_OLSearch = new DefaultTableModel();
            String[] Column = {"Course ID", "URL"};
            model_OLSearch.setColumnIdentifiers(Column);

            if (cbb.getSelectedIndex() == 0) {
                ArrayList<CourseInstructor> olcourseList = ciBLL.findCIByCourseID(Integer.parseInt(search_txt.getText()));
                for (CourseInstructor olcourse : olcourseList) {
                    model_OLSearch.addRow(new Object[]{olcourse.getCourseID(), olcourse.getPersonID()});

                }
                jTable1.setModel(model_OLSearch);
            } else if (cbb.getSelectedIndex() == 1) {
                {
                    ArrayList<CourseInstructor> olcourseList = ciBLL.findCIByPersonID(Integer.parseInt(search_txt.getText()));
                    for (CourseInstructor olcourse : olcourseList) {
                        model_OLSearch.addRow(new Object[]{olcourse.getCourseID(), olcourse.getPersonID()});

                    }
                    jTable1.setModel(model_OLSearch);
                }
            } else {
                jTable1.setModel(table);
            }
        }
    }//GEN-LAST:event_search_txtCaretUpdate

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
            java.util.logging.Logger.getLogger(CourseInstructorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseInstructorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseInstructorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseInstructorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseInstructorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JComboBox<String> cbb;
    private javax.swing.JTextField courseId_txt;
    private javax.swing.JButton del_txt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelCourseIns;
    private javax.swing.JTextField personId_txt;
    private javax.swing.JTextField search_txt;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}
