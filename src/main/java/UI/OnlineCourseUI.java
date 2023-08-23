/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import BLL.CourseBLL;
import BLL.OnlineCourseBLL;
import BLL.OnsiteCourseBLL;
import DAL.CourseDAL;
import DAL.OnlineCourseDAL;
import DAL.OnsiteCourseDAL;
import Model.Course;
import Model.OnlineCourse;
import Model.OnsiteCourse;
import Model.SQLConnection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class OnlineCourseUI extends javax.swing.JFrame {

    private DefaultTableModel model_Course = new DefaultTableModel();
    private DefaultTableModel model_OLCourse = new DefaultTableModel();
    private final CourseBLL coursebll = new CourseBLL();
    private final OnlineCourseBLL olcoursebll = new OnlineCourseBLL();
    private final OnsiteCourseBLL oscoursebll = new OnsiteCourseBLL();

    private final Connection connection = SQLConnection.getConnection();

    private final Course course = new Course();
    private final OnlineCourse olcourse = new OnlineCourse();
    private final OnsiteCourse oscourse = new OnsiteCourse();

    private final CourseDAL courseDAL = new CourseDAL();
    private final OnlineCourseDAL olcourseDAL = new OnlineCourseDAL();
    private final OnsiteCourseDAL oscourseDAL = new OnsiteCourseDAL();
    public OnlineCourseUI() {
        initComponents();
        onlineCourse();
    }

   private void onlineCourse() {
        model_OLCourse = new DefaultTableModel();
        
        String[] column = {"CourseID", "URL"};
        
        model_OLCourse.setColumnIdentifiers(column);
        
        ArrayList<OnlineCourse> olcourseList = olcoursebll.readOnlineCourse();
        System.out.println(olcourseList.size());
        set_TableData_OLCourse(olcourseList);
        tblOLCourse.setModel(model_OLCourse);
    }
   private void set_TableData_OLCourse(ArrayList<OnlineCourse> olcourseList) {
        for (OnlineCourse olcourse : olcourseList) {
            model_OLCourse.addRow(new Object[]{olcourse.getCourseID(), olcourse.getURL()});
//            System.out.println(course.getTitle());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtOCID = new javax.swing.JTextField();
        lblOCID = new javax.swing.JLabel();
        lblURL = new javax.swing.JLabel();
        txtURL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOLCourse = new javax.swing.JTable();
        btnUpdateOLC = new javax.swing.JButton();
        cbbSearchOLC = new javax.swing.JComboBox<>();
        btnDelOLC = new javax.swing.JButton();
        btnAddOLC = new javax.swing.JButton();
        lblSearchOLC = new javax.swing.JLabel();
        txtSearchOLC = new javax.swing.JTextField();
        txtDelOC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ONLINE COURSE");

        lblOCID.setText("Course ID");

        lblURL.setText("URL");

        txtURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtURLActionPerformed(evt);
            }
        });

        tblOLCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course ID", "URL"
            }
        ));
        tblOLCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOLCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOLCourse);

        btnUpdateOLC.setText("Update");
        btnUpdateOLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOLCActionPerformed(evt);
            }
        });

        cbbSearchOLC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course ID", "URL" }));

        btnDelOLC.setText("Delete");
        btnDelOLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelOLCActionPerformed(evt);
            }
        });

        btnAddOLC.setText("Add");
        btnAddOLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOLCActionPerformed(evt);
            }
        });

        lblSearchOLC.setText("Search");

        txtSearchOLC.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchOLCCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSearchOLC)
                                .addGap(35, 35, 35)
                                .addComponent(txtSearchOLC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbSearchOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnDelOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtDelOC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblOCID)
                                .addGap(35, 35, 35)
                                .addComponent(txtOCID, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(lblURL)))
                        .addGap(18, 18, 18)
                        .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOCID)
                            .addComponent(lblURL)
                            .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbSearchOLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSearchOLC)
                                .addComponent(txtSearchOLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddOLC)
                            .addComponent(btnDelOLC)
                            .addComponent(btnUpdateOLC)
                            .addComponent(txtDelOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtURLActionPerformed

    private void btnAddOLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOLCActionPerformed
         OnlineCourse olcourse = new OnlineCourse();
        olcourse.setCourseID(Integer.parseInt(txtOCID.getText()));
        olcourse.setURL(txtURL.getText());

        try {
            if (olcourseDAL.insertOnlineCourse(olcourse) > 0) {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }
        onlineCourse();
    }//GEN-LAST:event_btnAddOLCActionPerformed

    private void btnDelOLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelOLCActionPerformed
          if (tblOLCourse.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(txtDelOC, "Hãy chọn dòng mong muốn!!!");
            return;
        }

        try{
            int SelectedRow = tblOLCourse.getSelectedRow();
            System.out.println(SelectedRow);
            int courseID = (Integer) model_OLCourse.getValueAt(SelectedRow, 0);
            olcoursebll.deleteOnlineCourse(courseID);
        }catch(Exception ex){
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }

        onlineCourse();
    }//GEN-LAST:event_btnDelOLCActionPerformed

    private void tblOLCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOLCourseMouseClicked
       DefaultTableModel tbl_OLCourse= (DefaultTableModel) tblOLCourse.getModel();
        int SelectedRow = tblOLCourse.getSelectedRow();
        txtOCID.setText(String.valueOf(tblOLCourse.getValueAt(SelectedRow, 0)));
        txtURL.setText(String.valueOf(tbl_OLCourse.getValueAt(SelectedRow, 1)));
    }//GEN-LAST:event_tblOLCourseMouseClicked

    private void btnUpdateOLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOLCActionPerformed
     if (tblOLCourse.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }

        int SelectedRow = tblOLCourse.getSelectedRow();//lấy số dòng được chọn

        //đây là phần khởi tạo thông tin độc giả lấy dữ liệu từ các Text và combobox
        OnlineCourse olcourse = new OnlineCourse();
        olcourse.setCourseID(Integer.parseInt(txtOCID.getText()));
        olcourse.setURL(txtURL.getText());
        //đây là phần thực hiện sửa dữ liệu trong database
        try{
            olcoursebll.updateOnlineCourse(olcourse);
        }catch(Exception ex){
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }


       onlineCourse();
    }//GEN-LAST:event_btnUpdateOLCActionPerformed

    private void txtSearchOLCCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchOLCCaretUpdate
        if(txtSearchOLC.getText().isBlank())
            tblOLCourse.setModel(model_OLCourse);
        else
        {
            DefaultTableModel model_OLSearch=new DefaultTableModel();
            String[] Column = {"Course ID", "URL"};
            model_OLSearch.setColumnIdentifiers(Column);

            if (cbbSearchOLC.getSelectedIndex() == 0)
            {
                ArrayList<OnlineCourse> olcourseList = olcoursebll.findOLCourseByID(Integer.parseInt(txtSearchOLC.getText()));
                for (OnlineCourse olcourse : olcourseList)
                {
                    model_OLSearch.addRow(new Object[]{olcourse.getCourseID(),olcourse.getURL()});

                }
                tblOLCourse.setModel(model_OLSearch);
            }
            else if (cbbSearchOLC.getSelectedIndex() == 1)
            {
               {
                ArrayList<OnlineCourse> olcourseList = olcoursebll.findOLCourseByURL(txtSearchOLC.getText());
                for (OnlineCourse olcourse : olcourseList)
                {
                   model_OLSearch.addRow(new Object[]{olcourse.getCourseID(),olcourse.getURL()});

                }
            tblOLCourse.setModel(model_OLSearch);
            }
            }
            else
            {
                tblOLCourse.setModel(model_Course);
            }
        }
    }//GEN-LAST:event_txtSearchOLCCaretUpdate

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
            java.util.logging.Logger.getLogger(OnlineCourseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnlineCourseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnlineCourseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnlineCourseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnlineCourseUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOLC;
    private javax.swing.JButton btnDelOLC;
    private javax.swing.JButton btnUpdateOLC;
    private javax.swing.JComboBox<String> cbbSearchOLC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOCID;
    private javax.swing.JLabel lblSearchOLC;
    private javax.swing.JLabel lblURL;
    private javax.swing.JTable tblOLCourse;
    private javax.swing.JTextField txtDelOC;
    private javax.swing.JTextField txtOCID;
    private javax.swing.JTextField txtSearchOLC;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
