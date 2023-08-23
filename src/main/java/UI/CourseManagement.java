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
import BLL.DepartmentBLL;
import BLL.PersonBLL;
import BLL.StudentGradeBLL;
import DAL.StudentGradeDAL;
import DAL.CourseDAL;
import DAL.OnlineCourseDAL;
import DAL.OnsiteCourseDAL;
import Model.Course;
import Model.Person;
import Model.StudentGrade;
import Model.Department;
import Model.OnlineCourse;
import Model.OnsiteCourse;
import Model.SQLConnection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CourseManagement extends javax.swing.JFrame {

    private DefaultTableModel model_osCourse = new DefaultTableModel();
    private DefaultTableModel model_OLCourse = new DefaultTableModel();
    private DefaultTableModel model_Course = new DefaultTableModel();
    private DefaultTableModel model_Grade = new DefaultTableModel();

    private final CourseBLL coursebll = new CourseBLL();
    private final OnlineCourseBLL olcoursebll = new OnlineCourseBLL();
    private final OnsiteCourseBLL oscoursebll = new OnsiteCourseBLL();
    private final DepartmentBLL dpBLL = new DepartmentBLL();
    private final StudentGradeBLL sgbll = new StudentGradeBLL();
    private final PersonBLL personBLL = new PersonBLL();

    private final Connection connection = SQLConnection.getConnection();

    private final Course course = new Course();
    private final OnlineCourse olcourse = new OnlineCourse();
    private final OnsiteCourse oscourse = new OnsiteCourse();
    private final StudentGrade sg = new StudentGrade();
    private final Person person = new Person();

    private final CourseDAL courseDAL = new CourseDAL();
    private final OnlineCourseDAL olcourseDAL = new OnlineCourseDAL();
    private final OnsiteCourseDAL oscourseDAL = new OnsiteCourseDAL();

    public CourseManagement() {
        initComponents();
        setUpCourseID();
        onlineCourse();
        onsiteCourse();
        listGrade();
        setUpStudentID();
    }

    private void listGrade() {
        model_Grade = new DefaultTableModel();

        String[] column = {"EnrollmentID", "CourseID","Course Name", "Student ID", "Grade"};

        model_Grade.setColumnIdentifiers(column);

        ArrayList<StudentGrade> gradeList = sgbll.readGrade();
        System.out.println(gradeList.size());
        set_TableData_Grade(gradeList);
        tblGrade.setModel(model_Grade);
    }

    private void set_TableData_Grade(ArrayList<StudentGrade> gradeList) {
        for (StudentGrade sg : gradeList) {
            model_Grade.addRow(new Object[]{sg.getEnrollmentID(), sg.getCourseID(),getCourseName(sg.getCourseID()), sg.getStudentID(), sg.getGrade()});
//            System.out.println(course.getTitle());
        }
    }

    private void onsiteCourse() {
        model_osCourse = new DefaultTableModel();

        String[] column = {"CourseID", "Location", "Days", "Time"};

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
//    private void set_TableData_Course(ArrayList<Course> courseList) {
//        for (Course course : courseList) {
//            model_Course.addRow(new Object[]{course.getCourseID(), course.getTitle(), course.getCredits(), course.getDepartmentID()});
////            System.out.println(course.getTitle());
//        }
//    }

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

        panelCourseMNM = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblOCID = new javax.swing.JLabel();
        lblURL = new javax.swing.JLabel();
        txtURL = new javax.swing.JTextField();
        btnUpdateOLC = new javax.swing.JButton();
        cbbSearchOLC = new javax.swing.JComboBox<>();
        btnDelOLC = new javax.swing.JButton();
        btnAddOLC = new javax.swing.JButton();
        lblSearchOLC = new javax.swing.JLabel();
        txtSearchOLC = new javax.swing.JTextField();
        txtDelOC = new javax.swing.JTextField();
        cbbOCID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOLCourse = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOSCourse = new javax.swing.JTable();
        lblOLC = new javax.swing.JLabel();
        btnAddOSC = new javax.swing.JButton();
        btnUpdateOSC = new javax.swing.JButton();
        btnDelOSC = new javax.swing.JButton();
        lblOSCTime = new javax.swing.JLabel();
        txtDelOSC = new javax.swing.JTextField();
        lblOSCLocation = new javax.swing.JLabel();
        lblSearchOSC = new javax.swing.JLabel();
        txtSearchOSC = new javax.swing.JTextField();
        txtOSCDays = new javax.swing.JTextField();
        cbbSearchOSC = new javax.swing.JComboBox<>();
        txtOSCLocation = new javax.swing.JTextField();
        txtOSCTime = new javax.swing.JTextField();
        lblOSCID = new javax.swing.JLabel();
        lblOSCDays = new javax.swing.JLabel();
        cbbOSCID = new javax.swing.JComboBox<>();
        panelStdGrade = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSearchStudent = new javax.swing.JTextField();
        cbbSearchStudent = new javax.swing.JComboBox<>();
        btnUpdateStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
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
        jLabel2 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ONLINE COURSE");

        lblOCID.setText("Course ID");

        lblURL.setText("URL");

        txtURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtURLActionPerformed(evt);
            }
        });

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

        cbbOCID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnAddOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnDelOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtDelOC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnUpdateOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblOCID)
                                .addGap(70, 70, 70)
                                .addComponent(cbbOCID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblURL)))
                        .addGap(18, 18, 18)
                        .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lblSearchOLC)
                        .addGap(34, 34, 34)
                        .addComponent(txtSearchOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(cbbSearchOLC, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOCID)
                            .addComponent(lblURL)
                            .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbOCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddOLC)
                            .addComponent(btnDelOLC)
                            .addComponent(btnUpdateOLC)
                            .addComponent(txtDelOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchOLC)
                    .addComponent(txtSearchOLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbSearchOLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("OnlineCourse", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

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
        jScrollPane3.setViewportView(tblOSCourse);

        lblOLC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOLC.setText("ONSITE COURSE");

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

        lblOSCTime.setText("Time");

        lblOSCLocation.setText("Location");

        lblSearchOSC.setText("Search");

        txtSearchOSC.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchOSCCaretUpdate(evt);
            }
        });

        cbbSearchOSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course ID", "Location" }));

        txtOSCTime.setToolTipText("");

        lblOSCID.setText("Course ID");

        lblOSCDays.setText("Days");

        cbbOSCID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblOSCID)
                        .addGap(41, 41, 41)
                        .addComponent(cbbOSCID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOSCDays))
                .addContainerGap(702, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtOSCDays, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblOSCTime)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtOSCTime, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblOSCLocation)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOSCLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(222, 222, 222))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAddOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(btnUpdateOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnDelOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(txtDelOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(179, 179, 179)
                                    .addComponent(lblOLC))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(lblSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(cbbSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(172, 172, 172)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOSCID)
                    .addComponent(cbbOSCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(lblOSCDays)
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(lblOLC)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOSCLocation)
                        .addComponent(txtOSCLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOSCDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOSCTime)
                        .addComponent(txtOSCTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddOSC)
                        .addComponent(btnUpdateOSC)
                        .addComponent(btnDelOSC)
                        .addComponent(txtDelOSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSearchOSC)
                        .addComponent(txtSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbSearchOSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)))
        );

        jTabbedPane1.addTab("OnsiteCourse", jPanel4);

        panelStdGrade.setBackground(new java.awt.Color(204, 204, 255));
        panelStdGrade.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("STUDENT GRADE");

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
        jScrollPane2.setViewportView(tblGrade);

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
        cmbSCID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSCIDActionPerformed(evt);
            }
        });

        cmbSID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Course Name:");

        txtCourseName.setEnabled(false);

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
                                .addComponent(jLabel3)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStdGradeLayout.createSequentialGroup()
                                .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addComponent(cbbSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 264, Short.MAX_VALUE))
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGrade)
                                    .addComponent(lblSCID)
                                    .addComponent(jLabel2)))
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnDelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbSCID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtCourseName)))
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(txtDelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(261, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStdGradeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
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
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblSCID)))))
                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSID)
                            .addComponent(cmbSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2))
                            .addGroup(panelStdGradeLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGrade)
                            .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearchStudent)
                            .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelStdGradeLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(panelStdGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelStudent)
                            .addComponent(btnUpdateStudent)
                            .addComponent(btnAddStudent))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("StudentGrade", panelStdGrade);

        javax.swing.GroupLayout panelCourseMNMLayout = new javax.swing.GroupLayout(panelCourseMNM);
        panelCourseMNM.setLayout(panelCourseMNMLayout);
        panelCourseMNMLayout.setHorizontalGroup(
            panelCourseMNMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelCourseMNMLayout.setVerticalGroup(
            panelCourseMNMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCourseMNM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCourseMNM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelStudentActionPerformed
        if (tblGrade.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(txtDelStudent, "Hãy chọn dòng mong muốn!!!");
            return;
        }

        try {
            int SelectedRow = tblGrade.getSelectedRow();
            System.out.println(SelectedRow);
            int enrollmentID = (Integer) model_Grade.getValueAt(SelectedRow, 0);
            if (sgbll.deleteCourse(enrollmentID) > 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            sgbll.deleteCourse(enrollmentID);
        } catch (Exception ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        listGrade();
    }//GEN-LAST:event_btnDelStudentActionPerformed

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
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        listGrade();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void tblGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGradeMouseClicked
        DefaultTableModel tbl_Grade = (DefaultTableModel) tblGrade.getModel();
        int SelectedRow = tblGrade.getSelectedRow();
        txtEID.setText(String.valueOf(tbl_Grade.getValueAt(SelectedRow, 0)));
        cmbSCID.setSelectedItem(String.valueOf(tbl_Grade.getValueAt(SelectedRow, 1)));
        cmbSID.setSelectedItem(String.valueOf(tbl_Grade.getValueAt(SelectedRow, 3)));
        txtGrade.setText(String.valueOf(tbl_Grade.getValueAt(SelectedRow, 4)));
    }//GEN-LAST:event_tblGradeMouseClicked

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        if (tblGrade.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }

        StudentGrade sg = new StudentGrade();
        sg.setCourseID(Integer.parseInt(cmbSCID.getSelectedItem().toString()));
        sg.setStudentID(Integer.parseInt(cmbSID.getSelectedItem().toString()));
        sg.setGrade(Float.parseFloat(txtGrade.getText()));
        sg.setEnrollmentID(Integer.parseInt(txtEID.getText()));
        try {
            if (sgbll.updateGrade(sg) > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        listGrade();
    }//GEN-LAST:event_btnUpdateStudentActionPerformed

    private void txtSearchStudentCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchStudentCaretUpdate
        if (txtSearchStudent.getText().isBlank())
            tblGrade.setModel(model_Grade);
        else {
            DefaultTableModel model_SearchGrade = new DefaultTableModel();
            String[] column = {"EnrollmentID", "CourseID","Course Name" , "Student ID", "Grade"};
            model_SearchGrade.setColumnIdentifiers(column);

            if (cbbSearchStudent.getSelectedIndex() == 0) {
                ArrayList<StudentGrade> gradeList = sgbll.findGradeByID(Integer.parseInt(txtSearchStudent.getText()));
                for (StudentGrade sg : gradeList) {
                    model_SearchGrade.addRow(new Object[]{sg.getEnrollmentID(), sg.getCourseID(),getCourseName(sg.getCourseID()), sg.getStudentID(), sg.getGrade()});
                    tblGrade.setModel(model_SearchGrade);
                }
            } else if (cbbSearchStudent.getSelectedIndex() == 1) {
                {
                    ArrayList<StudentGrade> gradeList = sgbll.findGradeBySID(Integer.parseInt(txtSearchStudent.getText()));
                    for (StudentGrade sg : gradeList) {
                        model_SearchGrade.addRow(new Object[]{sg.getEnrollmentID(), sg.getCourseID(), getCourseName(sg.getCourseID()), sg.getStudentID(), sg.getGrade()});
                        tblGrade.setModel(model_SearchGrade);
                    }
                    tblGrade.setModel(model_SearchGrade);
                }
            } else {
                tblGrade.setModel(model_Grade);
            }
        }
    }//GEN-LAST:event_txtSearchStudentCaretUpdate

    private void txtSearchOSCCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchOSCCaretUpdate
        if (txtSearchOSC.getText().isBlank())
            tblOSCourse.setModel(model_osCourse);
        else {
            DefaultTableModel model_OSSearch = new DefaultTableModel();
            String[] Column = {"Course ID", "Location", "Days", "Time"};
            model_OSSearch.setColumnIdentifiers(Column);

            if (cbbSearchOSC.getSelectedIndex() == 0) {
                ArrayList<OnsiteCourse> oscourseList = oscoursebll.findOnsiteCourseByID(Integer.parseInt(txtSearchOSC.getText()));
                for (OnsiteCourse oscourse : oscourseList) {
                    model_OSSearch.addRow(new Object[]{oscourse.getCourseID(), oscourse.getLocation(), oscourse.getDays(), oscourse.getTime()});

                }
                tblOSCourse.setModel(model_OSSearch);
            } else if (cbbSearchOSC.getSelectedIndex() == 1) {
                ArrayList<OnsiteCourse> oscourseList = oscoursebll.findOnsiteCourseByLocation(txtSearchOSC.getText());
                for (OnsiteCourse oscourse : oscourseList) {
                    model_OSSearch.addRow(new Object[]{oscourse.getCourseID(), oscourse.getLocation(), oscourse.getDays(), oscourse.getTime()});

                }
                tblOSCourse.setModel(model_OSSearch);
            } else {
                tblOSCourse.setModel(model_osCourse);
            }
        }
    }//GEN-LAST:event_txtSearchOSCCaretUpdate

    private void btnDelOSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelOSCActionPerformed
        if (tblOSCourse.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(txtDelOSC, "Hãy chọn dòng mong muốn!!!");
            return;
        }

        try {
            int SelectedRow = tblOSCourse.getSelectedRow();
            System.out.println(SelectedRow);
            int courseID = (Integer) model_osCourse.getValueAt(SelectedRow, 0);
            if (oscoursebll.deleteOnsiteCourse(courseID) > 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            oscoursebll.deleteOnsiteCourse(courseID);
        } catch (Exception ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        onsiteCourse();
    }//GEN-LAST:event_btnDelOSCActionPerformed

    private void btnUpdateOSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOSCActionPerformed
        if (tblOSCourse.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }

        int SelectedRow = tblOSCourse.getSelectedRow();//lấy số dòng được chọn

        //đây là phần khởi tạo thông tin độc giả lấy dữ liệu từ các Text và combobox
        OnsiteCourse oscourse = new OnsiteCourse();
        oscourse.setCourseID(Integer.parseInt(cbbOSCID.getSelectedItem().toString()));
        oscourse.setLocation(txtOSCLocation.getText());
        oscourse.setDays(txtOSCDays.getText());
        oscourse.setTime(Time.valueOf(txtOSCTime.getText()));
        //đây là phần thực hiện sửa dữ liệu trong database
        try {
            if (oscoursebll.updateOnsiteCourse(oscourse) > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            oscoursebll.updateOnsiteCourse(oscourse);
        } catch (Exception ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        onsiteCourse();
    }//GEN-LAST:event_btnUpdateOSCActionPerformed

    private void btnAddOSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOSCActionPerformed
        OnsiteCourse oscourse = new OnsiteCourse();
        oscourse.setCourseID(Integer.parseInt(cbbOSCID.getSelectedItem().toString()));
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
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        onsiteCourse();
    }//GEN-LAST:event_btnAddOSCActionPerformed

    private void tblOSCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOSCourseMouseClicked
        DefaultTableModel tbl_osCourse = (DefaultTableModel) tblOSCourse.getModel();
        int SelectedRow = tblOSCourse.getSelectedRow();
        cbbOSCID.setSelectedItem(String.valueOf(tbl_osCourse.getValueAt(SelectedRow, 0)));
        txtOSCLocation.setText(String.valueOf(tbl_osCourse.getValueAt(SelectedRow, 1)));
        txtOSCDays.setText(String.valueOf(tbl_osCourse.getValueAt(SelectedRow, 2)));
        txtOSCTime.setText(String.valueOf(tbl_osCourse.getValueAt(SelectedRow, 3)));
    }//GEN-LAST:event_tblOSCourseMouseClicked

    private void tblOLCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOLCourseMouseClicked
        DefaultTableModel tbl_OLCourse = (DefaultTableModel) tblOLCourse.getModel();
        int SelectedRow = tblOLCourse.getSelectedRow();
        cbbOCID.setSelectedItem(String.valueOf(tblOLCourse.getValueAt(SelectedRow, 0)));
        txtURL.setText(String.valueOf(tbl_OLCourse.getValueAt(SelectedRow, 1)));
    }//GEN-LAST:event_tblOLCourseMouseClicked

    private void txtSearchOLCCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchOLCCaretUpdate
        if (txtSearchOLC.getText().isBlank())
            tblOLCourse.setModel(model_OLCourse);
        else {
            DefaultTableModel model_OLSearch = new DefaultTableModel();
            String[] Column = {"Course ID", "URL"};
            model_OLSearch.setColumnIdentifiers(Column);

            if (cbbSearchOLC.getSelectedIndex() == 0) {
                ArrayList<OnlineCourse> olcourseList = olcoursebll.findOLCourseByID(Integer.parseInt(txtSearchOLC.getText()));
                for (OnlineCourse olcourse : olcourseList) {
                    model_OLSearch.addRow(new Object[]{olcourse.getCourseID(), olcourse.getURL()});

                }
                tblOLCourse.setModel(model_OLSearch);
            } else if (cbbSearchOLC.getSelectedIndex() == 1) {
                {
                    ArrayList<OnlineCourse> olcourseList = olcoursebll.findOLCourseByURL(txtSearchOLC.getText());
                    for (OnlineCourse olcourse : olcourseList) {
                        model_OLSearch.addRow(new Object[]{olcourse.getCourseID(), olcourse.getURL()});

                    }
                    tblOLCourse.setModel(model_OLSearch);
                }
            } else {
                tblOLCourse.setModel(model_Course);
            }
        }
    }//GEN-LAST:event_txtSearchOLCCaretUpdate

    private void btnAddOLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOLCActionPerformed
        OnlineCourse olcourse = new OnlineCourse();
        olcourse.setCourseID(Integer.parseInt(cbbOCID.getSelectedItem().toString()));
        olcourse.setURL(txtURL.getText());

        try {
            if (olcoursebll.insertOnlineCourse(olcourse) > 0) {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm khóa mới thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        onlineCourse();
    }//GEN-LAST:event_btnAddOLCActionPerformed

    private void btnDelOLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelOLCActionPerformed

        if (tblOLCourse.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(txtDelOC, "Hãy chọn dòng mong muốn!!!");
            return;
        }

        try {
            int SelectedRow = tblOLCourse.getSelectedRow();
            int courseID = (Integer) model_OLCourse.getValueAt(SelectedRow, 0);
            if (olcoursebll.deleteOnlineCourse(courseID) > 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            System.out.println(SelectedRow);
            olcoursebll.deleteOnlineCourse(courseID);

        } catch (Exception ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        onlineCourse();
    }//GEN-LAST:event_btnDelOLCActionPerformed

    private void btnUpdateOLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOLCActionPerformed
        if (tblOLCourse.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }

        int SelectedRow = tblOLCourse.getSelectedRow();//lấy số dòng được chọn

        //đây là phần khởi tạo thông tin độc giả lấy dữ liệu từ các Text và combobox
        OnlineCourse olcourse = new OnlineCourse();
        olcourse.setCourseID(Integer.parseInt(cbbOCID.getSelectedItem().toString()));
        olcourse.setURL(txtURL.getText());
        //đây là phần thực hiện sửa dữ liệu trong database
        try {
            olcoursebll.updateOnlineCourse(olcourse);
            if (olcoursebll.updateOnlineCourse(olcourse) > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thành công", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(CourseUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        onlineCourse();
    }//GEN-LAST:event_btnUpdateOLCActionPerformed

    private void txtURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtURLActionPerformed

    private void cmbSCIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSCIDActionPerformed
            
        if (cmbSCID.getSelectedItem() != null)
        {
            txtCourseName.setText(getCourseName(Integer.parseInt(cmbSCID.getSelectedItem().toString())));
        }
    }//GEN-LAST:event_cmbSCIDActionPerformed

    private String getCourseName(int courseID) {
        
        ArrayList<Course> courseList = coursebll.findCourseByID(courseID);
        return courseList.get(0).getTitle();
    }

    private void setUpCourseID() {
        cbbOCID.removeAllItems();
        cbbOSCID.removeAllItems();
        cmbSCID.removeAllItems();
        ArrayList<Course> courseList = coursebll.readCourse();
        for (Course course : courseList) {
            cbbOCID.addItem(String.valueOf(course.getCourseID()));
            cbbOSCID.addItem(String.valueOf(course.getCourseID()));
            cmbSCID.addItem(String.valueOf(course.getCourseID()));
        }
    }

    private void setUpStudentID() {
        cmbSID.removeAllItems();
        ArrayList<Person> personList = personBLL.readPerson();
        for (Person person : personList) {
            cmbSID.addItem(String.valueOf(person.getPersonID()));
        }
    }

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
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOLC;
    private javax.swing.JButton btnAddOSC;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDelOLC;
    private javax.swing.JButton btnDelOSC;
    private javax.swing.JButton btnDelStudent;
    private javax.swing.JButton btnUpdateOLC;
    private javax.swing.JButton btnUpdateOSC;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JComboBox<String> cbbOCID;
    private javax.swing.JComboBox<String> cbbOSCID;
    private javax.swing.JComboBox<String> cbbSearchOLC;
    private javax.swing.JComboBox<String> cbbSearchOSC;
    private javax.swing.JComboBox<String> cbbSearchStudent;
    private javax.swing.JComboBox<String> cmbSCID;
    private javax.swing.JComboBox<String> cmbSID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEnrollmentID;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblOCID;
    private javax.swing.JLabel lblOLC;
    private javax.swing.JLabel lblOSCDays;
    private javax.swing.JLabel lblOSCID;
    private javax.swing.JLabel lblOSCLocation;
    private javax.swing.JLabel lblOSCTime;
    private javax.swing.JLabel lblSCID;
    private javax.swing.JLabel lblSID;
    private javax.swing.JLabel lblSearchOLC;
    private javax.swing.JLabel lblSearchOSC;
    private javax.swing.JLabel lblSearchStudent;
    private javax.swing.JLabel lblURL;
    private javax.swing.JPanel panelCourseMNM;
    private javax.swing.JPanel panelStdGrade;
    private javax.swing.JTable tblGrade;
    private javax.swing.JTable tblOLCourse;
    private javax.swing.JTable tblOSCourse;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtDelOC;
    private javax.swing.JTextField txtDelOSC;
    private javax.swing.JTextField txtDelStudent;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtOSCDays;
    private javax.swing.JTextField txtOSCLocation;
    private javax.swing.JTextField txtOSCTime;
    private javax.swing.JTextField txtSearchOLC;
    private javax.swing.JTextField txtSearchOSC;
    private javax.swing.JTextField txtSearchStudent;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
