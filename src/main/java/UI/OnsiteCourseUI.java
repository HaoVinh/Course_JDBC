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
import java.sql.Timestamp;
public class OnsiteCourseUI extends javax.swing.JFrame {

    private DefaultTableModel model_osCourse = new DefaultTableModel();
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
    public OnsiteCourseUI() {
        initComponents();
        onsiteCourse();
    }

  private void onsiteCourse() {
        model_osCourse = new DefaultTableModel();
        
        String[] column = {"CourseID", "Location", "Days" , "Time"};
        
        model_osCourse.setColumnIdentifiers(column);
        
        ArrayList<OnsiteCourse> oscourseList = oscoursebll.readOnsiteCourse();
        System.out.println(oscourseList.size());
        set_TableData_OSCourse(oscourseList);
        tblOSCourse.setModel(model_osCourse);
    }

    private void set_TableData_OSCourse(ArrayList<OnsiteCourse> oscourseList) {
        for (OnsiteCourse oscourse : oscourseList) {
            model_osCourse.addRow(new Object[]{oscourse.getCourseID(), oscourse.getLocation(), oscourse.getDays(), oscourse.getTime()});
//            System.out.println(course.getTitle());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOLC = new javax.swing.JLabel();
        lblOSCID = new javax.swing.JLabel();
        lblOSCDays = new javax.swing.JLabel();
        lblOSCTime = new javax.swing.JLabel();
        lblOSCLocation = new javax.swing.JLabel();
        txtOSCID = new javax.swing.JTextField();
        txtOSCDays = new javax.swing.JTextField();
        txtOSCLocation = new javax.swing.JTextField();
        txtOSCTime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOSCourse = new javax.swing.JTable();
        btnAddOSC = new javax.swing.JButton();
        btnUpdateOSC = new javax.swing.JButton();
        btnDelOSC = new javax.swing.JButton();
        txtDelOSC = new javax.swing.JTextField();
        lblSearchOSC = new javax.swing.JLabel();
        txtSearchOSC = new javax.swing.JTextField();
        cbbSearchOSC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOLC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOLC.setText("ONSITE COURSE");

        lblOSCID.setText("Course ID");

        lblOSCDays.setText("Days");

        lblOSCTime.setText("Time");

        lblOSCLocation.setText("Location");

        txtOSCTime.setToolTipText("");

        tblOSCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course ID", "Location", "Days", "Time"
            }
        ));
        tblOSCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOSCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOSCourse);

        btnAddOSC.setText("Add");
        btnAddOSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOSCActionPerformed(evt);
            }
        });

        btnUpdateOSC.setText("Update");
        btnUpdateOSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOSCActionPerformed(evt);
            }
        });

        btnDelOSC.setText("Delete");
        btnDelOSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelOSCActionPerformed(evt);
            }
        });

        lblSearchOSC.setText("Search");

        txtSearchOSC.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchOSCCaretUpdate(evt);
            }
        });

        cbbSearchOSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course ID", "Location" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOSCID)
                    .addComponent(lblOSCDays))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOSCID)
                            .addComponent(txtOSCDays, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOSCTime)
                                .addGap(27, 27, 27)
                                .addComponent(txtOSCTime, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOSCLocation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOSCLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAddOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnUpdateOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnDelOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(txtDelOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(lblOLC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cbbSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblOLC)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOSCID)
                    .addComponent(lblOSCLocation)
                    .addComponent(txtOSCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOSCLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOSCDays)
                    .addComponent(txtOSCDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOSCTime)
                    .addComponent(txtOSCTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddOSC)
                    .addComponent(btnUpdateOSC)
                    .addComponent(btnDelOSC)
                    .addComponent(txtDelOSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchOSC)
                    .addComponent(txtSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblOSCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOSCourseMouseClicked
       DefaultTableModel tbl_osCourse= (DefaultTableModel) tblOSCourse.getModel();
        int SelectedRow = tblOSCourse.getSelectedRow();
        txtOSCID.setText(String.valueOf(tbl_osCourse.getValueAt(SelectedRow, 0)));
        txtOSCLocation.setText(String.valueOf(tbl_osCourse.getValueAt(SelectedRow, 1)));
        txtOSCDays.setText(String.valueOf(tbl_osCourse.getValueAt(SelectedRow, 2)));
        txtOSCTime.setText(String.valueOf(tbl_osCourse.getValueAt(SelectedRow, 3)));
    }//GEN-LAST:event_tblOSCourseMouseClicked

    private void btnAddOSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOSCActionPerformed
       OnsiteCourse oscourse = new OnsiteCourse();
        oscourse.setCourseID(Integer.parseInt(txtOSCID.getText()));
        oscourse.setLocation(txtOSCLocation.getText());
        oscourse.setDays(txtOSCDays.getText());
        oscourse.setTime(Time.valueOf(txtOSCTime.getText()));

        try {
            if (oscourseDAL.insertOnsiteCourse(oscourse) > 0) {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }
       onsiteCourse();
    }//GEN-LAST:event_btnAddOSCActionPerformed

    private void btnUpdateOSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOSCActionPerformed
         if (tblOSCourse.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }

        int SelectedRow = tblOSCourse.getSelectedRow();//lấy số dòng được chọn

        //đây là phần khởi tạo thông tin độc giả lấy dữ liệu từ các Text và combobox
        OnsiteCourse oscourse = new OnsiteCourse();
        oscourse.setCourseID(Integer.parseInt(txtOSCID.getText()));
        oscourse.setLocation(txtOSCLocation.getText());
        oscourse.setDays(txtOSCDays.getText());
        oscourse.setTime(Time.valueOf(txtOSCTime.getText()));
        //đây là phần thực hiện sửa dữ liệu trong database
        try{
            oscoursebll.updateOnsiteCourse(oscourse);
        }catch(Exception ex){
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }

       onsiteCourse();
    }//GEN-LAST:event_btnUpdateOSCActionPerformed

    private void btnDelOSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelOSCActionPerformed
         if (tblOSCourse.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(txtDelOSC, "Hãy chọn dòng mong muốn!!!");
            return;
        }

        try{
            int SelectedRow = tblOSCourse.getSelectedRow();
            System.out.println(SelectedRow);
            int courseID = (Integer) model_osCourse.getValueAt(SelectedRow, 0);
            oscoursebll.deleteOnsiteCourse(courseID);
        }catch(Exception ex){
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }

        onsiteCourse();
    }//GEN-LAST:event_btnDelOSCActionPerformed

    private void txtSearchOSCCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchOSCCaretUpdate
        if(txtSearchOSC.getText().isBlank())
            tblOSCourse.setModel(model_osCourse);
        else
        {
            DefaultTableModel model_OSSearch=new DefaultTableModel();
            String[] Column = {"Course ID", "Location", "Days", "Time"};
            model_OSSearch.setColumnIdentifiers(Column);

            if (cbbSearchOSC.getSelectedIndex() == 0)
            {
                ArrayList<OnsiteCourse> oscourseList = oscoursebll.findOnsiteCourseByID(Integer.parseInt(txtSearchOSC.getText()));
                for (OnsiteCourse oscourse : oscourseList)
                {
                    model_OSSearch.addRow(new Object[]{oscourse.getCourseID(),oscourse.getLocation(),oscourse.getDays(),oscourse.getTime()});

                }
                tblOSCourse.setModel(model_OSSearch);
            }
            else if (cbbSearchOSC.getSelectedIndex() == 1)
            {
                ArrayList<OnsiteCourse> oscourseList = oscoursebll.findOnsiteCourseByLocation(txtSearchOSC.getText());
                for (OnsiteCourse oscourse : oscourseList)
                {
                    model_OSSearch.addRow(new Object[]{oscourse.getCourseID(),oscourse.getLocation(),oscourse.getDays(),oscourse.getTime()});

                }
                tblOSCourse.setModel(model_OSSearch);
            }
            else
            {
                tblOSCourse.setModel(model_osCourse);
            }
        }
    }//GEN-LAST:event_txtSearchOSCCaretUpdate

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
            java.util.logging.Logger.getLogger(OnsiteCourseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnsiteCourseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnsiteCourseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnsiteCourseUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnsiteCourseUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOSC;
    private javax.swing.JButton btnDelOSC;
    private javax.swing.JButton btnUpdateOSC;
    private javax.swing.JComboBox<String> cbbSearchOSC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOLC;
    private javax.swing.JLabel lblOSCDays;
    private javax.swing.JLabel lblOSCID;
    private javax.swing.JLabel lblOSCLocation;
    private javax.swing.JLabel lblOSCTime;
    private javax.swing.JLabel lblSearchOSC;
    private javax.swing.JTable tblOSCourse;
    private javax.swing.JTextField txtDelOSC;
    private javax.swing.JTextField txtOSCDays;
    private javax.swing.JTextField txtOSCID;
    private javax.swing.JTextField txtOSCLocation;
    private javax.swing.JTextField txtOSCTime;
    private javax.swing.JTextField txtSearchOSC;
    // End of variables declaration//GEN-END:variables
}
