/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import BLL.CourseBLL;
import BLL.PersonBLL;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import BLL.StudentGradeBLL;
import BLL.CourseBLL;
import DAL.StudentGradeDAL;
import Model.Course;
import Model.Person;
import Model.StudentGrade;
import Model.SQLConnection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentGradeUI extends javax.swing.JFrame {

   private DefaultTableModel model_Grade = new DefaultTableModel();
    private final StudentGradeBLL sgbll = new StudentGradeBLL();
    private final Connection connection = SQLConnection.getConnection();
    private final StudentGrade sg = new StudentGrade();
    private final PersonBLL personBLL=new PersonBLL();
    private final CourseBLL courseBLL=new CourseBLL();

    public StudentGradeUI() {
        initComponents();
        listGrade();
        setUpStudentID();
        setUpCourseID();
    }

private void listGrade() {
        model_Grade = new DefaultTableModel();
        
        String[] column = { "EnrollmentID","CourseID", "Student ID" , "Grade"};
        
        model_Grade.setColumnIdentifiers(column);
        
        ArrayList<StudentGrade> gradeList = sgbll.readGrade();
        System.out.println(gradeList.size());
        set_TableData_Grade(gradeList);
        tblGrade.setModel(model_Grade);
    }

    private void set_TableData_Grade(ArrayList<StudentGrade> gradeList) {
        for (StudentGrade sg : gradeList) {
            model_Grade.addRow(new Object[]{sg.getEnrollmentID(),sg.getCourseID(),sg.getStudentID(),sg.getGrade()});
//            System.out.println(course.getTitle());
        }
    }
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelStdGrade = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchStudent = new javax.swing.JTextField();
        cbbSearchStudent = new javax.swing.JComboBox<>();
        btnUpdateStudent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrade = new javax.swing.JTable();
        lblEnrollmentID = new javax.swing.JLabel();
        lblSID = new javax.swing.JLabel();
        lblSearchStudent = new javax.swing.JLabel();
        lblSCID = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        txtEID = new javax.swing.JTextField();
        txtGrade = new javax.swing.JTextField();
        txtDelStudent = new javax.swing.JTextField();
        btnAddStudent = new javax.swing.JButton();
        btnDelStudent = new javax.swing.JButton();
        cmbSCID = new javax.swing.JComboBox<>();
        cmbSID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("STUDENT GRADE");

        txtSearchStudent.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchStudentCaretUpdate(evt);
            }
        });

        cbbSearchStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enrollment ID", "Student ID" }));

        btnUpdateStudent.setText("Update");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        tblGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enrollment ID", "Course ID", "Student ID", "Grade"
            }
        ));
        tblGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGradeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGrade);

        lblEnrollmentID.setText("EnrollmentID");

        lblSID.setText("Student ID");

        lblSearchStudent.setText("Search");

        lblSCID.setText("Course ID");

        lblGrade.setText("Grade");

        txtEID.setEnabled(false);

        btnAddStudent.setText("Add");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnDelStudent.setText("Delete");
        btnDelStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelStudentActionPerformed(evt);
            }
        });

        cmbSCID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelStdGradeLayout = new javax.swing.GroupLayout(panelStdGrade);
        panelStdGrade.setLayout(panelStdGradeLayout);
        panelStdGradeLayout.setHorizontalGroup(
            panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStdGradeLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnrollmentID)
                    .addComponent(lblSID)
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblSearchStudent)))
                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel1)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStdGradeLayout.createSequentialGroup()
                                .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addComponent(cbbSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                                        .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(btnDelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                                        .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(128, 128, 128)
                                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblGrade)
                                            .addComponent(lblSCID))))
                                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(cmbSCID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStdGradeLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                        .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbSID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(427, 427, 427)))
                        .addGap(27, 27, 27)
                        .addComponent(txtDelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStdGradeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelStdGradeLayout.setVerticalGroup(
            panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStdGradeLayout.createSequentialGroup()
                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnrollmentID)
                            .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbSCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblSCID)))))
                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSID)
                            .addComponent(cmbSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGrade)
                            .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearchStudent)
                            .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelStudent)
                            .addComponent(btnUpdateStudent)
                            .addComponent(btnAddStudent))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelStdGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelStdGrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGradeMouseClicked
       DefaultTableModel tbl_Grade= (DefaultTableModel) tblGrade.getModel();
        int SelectedRow = tblGrade.getSelectedRow();
        txtEID.setText(String.valueOf(tbl_Grade.getValueAt(SelectedRow, 0)));
        cmbSCID.setSelectedItem(String.valueOf(tbl_Grade.getValueAt(SelectedRow, 1)));
        cmbSID.setSelectedItem(String.valueOf(tbl_Grade.getValueAt(SelectedRow, 2)));
        txtGrade.setText(String.valueOf(tbl_Grade.getValueAt(SelectedRow, 3)));
    }//GEN-LAST:event_tblGradeMouseClicked

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        StudentGrade sg = new StudentGrade();
        sg.setCourseID(Integer.parseInt(cmbSCID.getSelectedItem().toString()));
        sg.setStudentID(Integer.parseInt(cmbSID.getSelectedItem().toString()));
        sg.setGrade(Float.parseFloat(txtGrade.getText()));
        try {
            if (sgbll.insertGrade(sg) > 0) {
                JOptionPane.showMessageDialog(this, "Thêm điểm mới thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm điểm mới thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }
       listGrade();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
         if (tblGrade.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }


        StudentGrade sg = new StudentGrade();
        sg.setEnrollmentID(Integer.parseInt(txtEID.getText()));
        sg.setCourseID(Integer.parseInt(cmbSCID.getSelectedItem().toString()));
        sg.setStudentID(Integer.parseInt(cmbSID.getSelectedItem().toString()));
        sg.setGrade(Float.parseFloat(txtGrade.getText()));
        try{
            if(sgbll.updateGrade(sg)> 0){
                JOptionPane.showMessageDialog(this, "Sửa thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Sửa thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            sgbll.updateGrade(sg);
        }catch(Exception ex){
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }

        listGrade();
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    private void btnDelStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelStudentActionPerformed
         if (tblGrade.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(txtDelStudent, "Hãy chọn dòng mong muốn!!!");
            return;
        }

        try{
            int SelectedRow = tblGrade.getSelectedRow();
            System.out.println(SelectedRow);
            int enrollmentID = (Integer) model_Grade.getValueAt(SelectedRow, 0);
            if(sgbll.deleteCourse(enrollmentID) > 0){
                JOptionPane.showMessageDialog(this, "Xóa thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Xóa thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            sgbll.deleteCourse(enrollmentID);
        }catch(Exception ex){
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }

        listGrade();
    }//GEN-LAST:event_btnDelStudentActionPerformed

    private void txtSearchStudentCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchStudentCaretUpdate
          if(txtSearchStudent.getText().isBlank())
            tblGrade.setModel(model_Grade);
        else
        {
            DefaultTableModel model_SearchGrade=new DefaultTableModel();
             String[] column = { "EnrollmentID","CourseID", "Student ID" , "Grade"};
             model_SearchGrade.setColumnIdentifiers(column);

            if (cbbSearchStudent.getSelectedIndex() == 0)
            {
                ArrayList<StudentGrade> gradeList = sgbll.findGradeByID(Integer.parseInt(txtSearchStudent.getText()));
              for (StudentGrade sg : gradeList) {
                 model_SearchGrade.addRow(new Object[]{sg.getEnrollmentID(),sg.getCourseID(),sg.getStudentID(),sg.getGrade()});
                tblGrade.setModel(model_SearchGrade);
            }
            }
            else if (cbbSearchStudent.getSelectedIndex() == 1)
            {
               {
                  ArrayList<StudentGrade> gradeList = sgbll.findGradeBySID(Integer.parseInt(txtSearchStudent.getText()));
                for (StudentGrade sg : gradeList) {
                 model_SearchGrade.addRow(new Object[]{sg.getEnrollmentID(),sg.getCourseID(),sg.getStudentID(),sg.getGrade()});
                tblGrade.setModel(model_SearchGrade);
            }
                 tblGrade.setModel(model_SearchGrade);
            }
            }
            else
            {
                tblGrade.setModel(model_Grade);
            }
        }
    }//GEN-LAST:event_txtSearchStudentCaretUpdate

    
    private void setUpStudentID()
    {
        cmbSID.removeAllItems();
        ArrayList<Person> personList=personBLL.readPerson();
        for(Person person:personList)
        {
            cmbSID.addItem(String.valueOf(person.getPersonID()));
        }
    }
    
    private void setUpCourseID()
    {
        cmbSCID.removeAllItems();
        ArrayList<Course> courseList=courseBLL.readCourse();
        for(Course course:courseList)
        {
            cmbSCID.addItem(String.valueOf(course.getCourseID()));
        }
    }
//          private void setUpTitle()
//    {
//        cbbTitle.removeAllItems();
//        ArrayList<Course> courseList=courseBLL.readCourse();
//        for(Course course:courseList)
//        {
//            cbbTitle.addItem(String.valueOf(course.getTitle()));
//        }
//    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(StudentGradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGradeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDelStudent;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JComboBox<String> cbbSearchStudent;
    private javax.swing.JComboBox<String> cmbSCID;
    private javax.swing.JComboBox<String> cmbSID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnrollmentID;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblSCID;
    private javax.swing.JLabel lblSID;
    private javax.swing.JLabel lblSearchStudent;
    private javax.swing.JPanel panelStdGrade;
    private javax.swing.JTable tblGrade;
    private javax.swing.JTextField txtDelStudent;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtSearchStudent;
    // End of variables declaration//GEN-END:variables
}
