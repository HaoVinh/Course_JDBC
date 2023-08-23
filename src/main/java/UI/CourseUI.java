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
import Model.Department;
import Model.OnlineCourse;
import Model.OnsiteCourse;
import Model.SQLConnection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CourseUI extends javax.swing.JFrame {

    private DefaultTableModel model_Course = new DefaultTableModel();
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

    public CourseUI() {
        initComponents();
        listCourse();
    }
//     private void setUpDepartmentID()
//    {
//        cbbDPID.removeAllItems();
//        ArrayList<Department> dpList=dpBLL.readDepartment();
//        for(Department dp:dpList)
//        {
//            cbbDPID.addItem(String.valueOf(dp.getDepartmentID()));
//        }
//    }
    private void listCourse() {
        model_Course = new DefaultTableModel();
        
        String[] column = {"CourseID", "Title", "Credits" , "DepartmentID"};
        
        model_Course.setColumnIdentifiers(column);
        
        ArrayList<Course> courseList = coursebll.readCourse();
        System.out.println(courseList.size());
        set_TableData_Course(courseList);
        tblCourse.setModel(model_Course);
    }

    private void set_TableData_Course(ArrayList<Course> courseList) {
        for (Course course : courseList) {
            model_Course.addRow(new Object[]{course.getCourseID(), course.getTitle(), course.getCredits(), course.getDepartmentID()});
//            System.out.println(course.getTitle());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtCredits = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDPID = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        txtDel = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblCID = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();
        cbbSearch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblSearch.setText("Search");

        txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCaretUpdate(evt);
            }
        });

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "CourseID", "Title", "Credits", "DepartmentID"
            }
        ));
        tblCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("      COURSE");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Title");

        jLabel3.setText("Credits");

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        jLabel4.setText("DepartmentID");

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblCID.setText("Course ID");

        cbbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CourseID", "Title" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblCID))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addComponent(txtCID)))
                        .addGap(126, 126, 126)))
                .addGap(75, 75, 75)
                .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblSearch)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(cbbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(162, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtDPID, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCID)
                    .addComponent(txtCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDel)
                    .addComponent(txtDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblCourse.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }

        int SelectedRow = tblCourse.getSelectedRow();//lấy số dòng được chọn

        //đây là phần khởi tạo thông tin độc giả lấy dữ liệu từ các Text và combobox
        Course course = new Course();
        course.setCourseID(Integer.parseInt(txtCID.getText()));
        course.setTitle(txtTitle.getText());
        course.setCredits(Integer.parseInt(txtCredits.getText().trim()));
        course.setDepartmentID(Integer.parseInt(txtDPID.getText().trim()));
        //đây là phần thực hiện sửa dữ liệu trong database
        try{
            coursebll.updateCourse(course);
        }catch(Exception ex){
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }

        listCourse();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if (tblCourse.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(txtDel, "Hãy chọn dòng mong muốn!!!");
            return;
        }

        try{
            int SelectedRow = tblCourse.getSelectedRow();
            System.out.println(SelectedRow);
            int courseID = (Integer) model_Course.getValueAt(SelectedRow, 0);
            coursebll.deleteCourse(courseID);
        }catch(Exception ex){
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }

        listCourse();
    }//GEN-LAST:event_btnDelActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Course course = new Course();
        course.setCourseID(Integer.parseInt(txtCID.getText()));
        course.setTitle(txtTitle.getText());
        course.setCredits(Integer.parseInt(txtCredits.getText()));
        course.setDepartmentID(Integer.parseInt(txtDPID.getText()));

        try {
            if (courseDAL.insertCourse(course) > 0) {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE,null,ex);
        }
        listCourse();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCourseMouseClicked
        DefaultTableModel tbl_Course= (DefaultTableModel) tblCourse.getModel();
        int SelectedRow = tblCourse.getSelectedRow();
        txtCID.setText(String.valueOf(tbl_Course.getValueAt(SelectedRow, 0)));
        txtTitle.setText(String.valueOf(tbl_Course.getValueAt(SelectedRow, 1)));
        txtCredits.setText(String.valueOf(tbl_Course.getValueAt(SelectedRow, 2)));
        txtDPID.setText(String.valueOf(tbl_Course.getValueAt(SelectedRow, 3)));
    }//GEN-LAST:event_tblCourseMouseClicked

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
       if(txtSearch.getText().isBlank())
            tblCourse.setModel(model_Course);
        else
        {
            DefaultTableModel model_Search=new DefaultTableModel();
            String[] Column = {"Course ID", "Title", "Credits", "Department ID"};
            model_Search.setColumnIdentifiers(Column);

            if (cbbSearch.getSelectedIndex() == 0)
            {
                ArrayList<Course> courseList = coursebll.findCourseByID(Integer.parseInt(txtSearch.getText()));
                for (Course course : courseList)
                {
                    model_Search.addRow(new Object[]{course.getCourseID(),course.getTitle(),course.getCredits(),course.getDepartmentID()});

                }
                tblCourse.setModel(model_Search);
            }
            else if (cbbSearch.getSelectedIndex() == 1)
            {
               {
                ArrayList<Course> courseList = coursebll.findCourseByTitle(txtSearch.getText());
                for (Course course : courseList)
                {
                    model_Search.addRow(new Object[]{course.getCourseID(),course.getTitle(),course.getCredits(),course.getDepartmentID()});

                }
                tblCourse.setModel(model_Search);
            }
            }
            else
            {
                tblCourse.setModel(model_Course);
            }
        }
    }//GEN-LAST:event_txtSearchCaretUpdate

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCID;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDPID;
    private javax.swing.JTextField txtDel;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
