

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;



public class employeeAdd extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args){
        
    }
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
private txt_emp lbl_date;
    /**
     * Creates new form Staff_details
     */
    public employeeAdd() {
        initComponents();
        Object db;
		conn=((Object) db).java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        currentDate();
        
        Object Emp;
		txt_emp.setText(String.valueOf(Emp.empId));
    }
   
    public final void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        lbl_date.setText((month+1)+"/"+day+"/"+year);
        
        //Time
      
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        txt_emp lbl_time;
		lbl_time.setText(hour+":"+(minute)+":"+second);
        
       
    }
                     
    private void initComponents() {

    JMenuBar jMenuBar2 = new javax.swing.JMenuBar();
    JMenu jMenu1 = new javax.swing.JMenu();
    JMenu jMenu2 = new javax.swing.JMenu();
    JPanel jPanel3 = new javax.swing.JPanel();
    JLabel jLabel7 = new javax.swing.JLabel();
    JTextField txt_tel = new javax.swing.JTextField();
    JTextField txt_email = new javax.swing.JTextField();
    JLabel jLabel6 = new javax.swing.JLabel();
    JLabel jLabel11 = new javax.swing.JLabel();
    JRadioButton r_male = new javax.swing.JRadioButton();
    JRadioButton r_female = new javax.swing.JRadioButton();
    JTextField txt_dob = new javax.swing.JTextField();
    JLabel jLabel3 = new javax.swing.JLabel();
    JTextField txt_surname = new javax.swing.JTextField();
    JLabel jLabel2 = new javax.swing.JLabel();
    JLabel jLabel1 = new javax.swing.JLabel();
    JTextField txt_firstname = new javax.swing.JTextField();
    JTextField txt_id = new javax.swing.JTextField();
    JLabel jLabel5 = new javax.swing.JLabel();
    JDesktopPane jDesktopPane1 = new javax.swing.JDesktopPane();
    JLabel img = new javax.swing.JLabel();
    JLabel jLabel8 = new javax.swing.JLabel();
    JLabel jLabel14 = new javax.swing.JLabel();
    JLabel jLabel15 = new javax.swing.JLabel();
    JLabel jLabel16 = new javax.swing.JLabel();
    JTextField txt_pc = new javax.swing.JTextField();
    JTextField txt_apt = new javax.swing.JTextField();
    JTextField txt_add2 = new javax.swing.JTextField();
    JTextField txt_address = new javax.swing.JTextField();
    JLabel jLabel9 = new javax.swing.JLabel();
    JTextField txt_dep = new javax.swing.JTextField();
    JTextField txt_desig = new javax.swing.JTextField();
    JLabel jLabel13 = new javax.swing.JLabel();
    JLabel jLabel17 = new javax.swing.JLabel();
    JTextField txt_status = new javax.swing.JTextField();
    JTextField txt_doj = new javax.swing.JTextField();
    JLabel jLabel12 = new javax.swing.JLabel();
    JLabel jLabel18 = new javax.swing.JLabel();
    JTextField txt_salary = new javax.swing.JTextField();
    JButton cmd_save = new javax.swing.JButton();
    JButton jButton1 = new javax.swing.JButton();
    JTextField txt_job = new javax.swing.JTextField();
    JLabel jLabel20 = new javax.swing.JLabel();
    JLabel txt_emp = new javax.swing.JLabel();
    JLabel jLabel10 = new javax.swing.JLabel();
    JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
    JMenu File = new javax.swing.JMenu();
    JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
    JMenu lbl_date = new javax.swing.JMenu();
    JMenu lbl_time = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N

        jLabel7.setText("Contact :");

        jLabel6.setText("Email :");

        jLabel11.setText("Gender:");

        r_male.setText("Male");
        r_male.addActionListener((java.awt.event.ActionEvent evt) -> {
            r_maleActionPerformed(evt);
    });

        r_female.setText("Female");
        r_female.addActionListener((java.awt.event.ActionEvent evt) -> {
            r_femaleActionPerformed(evt);
    });

        jLabel3.setText("Date of Birth :");

        jLabel2.setText("Surname :");

        jLabel1.setText("First name :");

        txt_firstname.addActionListener((java.awt.event.ActionEvent evt) -> {
            txt_firstnameActionPerformed(evt);
    });

        txt_id.setEditable(false);

        jLabel5.setText("Employee id :");

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setText("Address Line 1 :");

        jLabel14.setText("Address Line 2 :");

        jLabel15.setText("Apt./House No :");

        jLabel16.setText("Post Code :");

        txt_apt.addActionListener((java.awt.event.ActionEvent evt) -> {
            txt_aptActionPerformed(evt);
    });

        jLabel9.setText("Department :");

        jLabel13.setText("Designation :");

        jLabel17.setText("Status :");

        jLabel12.setText("Basic Salary :");

        jLabel18.setText("Date Hired :");

        txt_salary.addActionListener((java.awt.event.ActionEvent evt) -> {
            txt_salaryActionPerformed(evt);
    });

        cmd_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Save-icon.png"))); // NOI18N
        cmd_save.setText("Add Record");
        cmd_save.addActionListener((java.awt.event.ActionEvent evt) -> {
            cmd_saveActionPerformed(evt);
    });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/erase-128.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton1ActionPerformed(evt);
    });

        txt_job.addActionListener((java.awt.event.ActionEvent evt) -> {
            txt_jobActionPerformed(evt);
    });

        jLabel20.setText("Job Title :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_tel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(r_male)
                                        .addGap(4, 4, 4)
                                        .addComponent(r_female))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_surname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_firstname)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_doj)
                                    .addComponent(txt_salary)
                                    .addComponent(txt_status)
                                    .addComponent(txt_dep)
                                    .addComponent(txt_desig, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_pc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_add2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_desig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txt_doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(r_male)
                            .addComponent(r_female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(141, 141, 141))
        );

        txt_emp.setText("emp");

        jLabel10.setText("Logged in As :");

        File.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/attach.png")));
        jMenuItem1.setText("Attach Image");
        jMenuItem1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMenuItem1ActionPerformed(evt);
    });
        File.add(jMenuItem1);

        jMenuBar1.add(File);

        lbl_date.setText("Date");
        jMenuBar1.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_emp))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txt_emp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
    String filename = f.getAbsolutePath();
        ImageIcon imageIcon = null;
        img.setIcon(imageIcon);
      try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            byte[] person_image = bos.toByteArray();
        }

        catch(IOException e){
            JOptionPane.showMessageDialog(null,e);

        }
       
    }                                          

    private void txt_jobActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_tel.setText("");
        txt_dob.setText("");
        txt_email.setText("");
        txt_address.setText("");
        txt_dep.setText("");
        txt_status.setText("");
        txt_salary.setText("");
        txt_add2.setText("");
        txt_pc.setText("");
        txt_desig.setText("");
        txt_job.setText("");
        txt_apt.setText("");
        txt_doj.setText("");
        img.setIcon(null);
    }                                        

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){

            try {
                String sql ="insert into Staff_information " 
                        + "(first_name,surname,Dob,Email,"
                        + "Telephone,Address,Department,"
                        + "Image,Salary,Gender,Address2,"
                        + "Post_code, Designation,Status,job_title,Apartment,Date_hired) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_firstname.getText());
                pst.setString(2,txt_surname.getText());
                pst.setString(3,txt_dob.getText());
                pst.setString(4,txt_email.getText());
                pst.setString(5,txt_tel.getText());
                pst.setString(6,txt_address.getText());
                pst.setString(7,txt_dep.getText());
                byte[] person_image = null;
                pst.setBytes(8,person_image);

                pst.setString(9,txt_salary.getText());
                String gender = null;
                pst.setString(10,gender); 
                pst.setString(11,txt_add2.getText());
                pst.setString(12,txt_pc.getText());
                pst.setString(13,txt_desig.getText());
                pst.setString(14,txt_status.getText());
                pst.setString(15,txt_job.getText());
                pst.setString(16,txt_apt.getText());
                pst.setString(17,txt_doj.getText());
                
               
                

                pst.execute();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");

            }
            catch (HeadlessException | SQLException e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
         try {

                String sq ="select * from Staff_information where (id) NOT IN (select emp_id from Users)";
                pst=conn.prepareStatement(sq);
                rs=pst.executeQuery();

                while(rs.next()){

                    String add1 =rs.getString("id");
                    String add2 =rs.getString("first_name");
                    String add3 =rs.getString("Dob");
                    String result =add3.replace("/" ,"");
                    String add4 =rs.getString("Department");

                    String sql ="insert into Users (division,username,password,emp_id) values ('"+add4+"','"+add2+"','"+result+"','"+add1+"') ";
                    pst=conn.prepareStatement(sql);

                    pst.execute();
                    JOptionPane.showMessageDialog(null,"User account has been created successfully: " +" Username:  "+add2+ " Password:  "+result);
                }

            }catch (HeadlessException | SQLException e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
        
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                 catch(SQLException e){
                   JOptionPane.showMessageDialog(null,e);
                }
                
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            String value0 = timeString;
            String value1 = dateString;
            String val = txt_emp.getText().toString();
                try{

                String reg= "insert into Audit (emp_id, date, status) values ('"+val+"','"+value0+" / "+value1+"','Added Record')";
                pst=conn.prepareStatement(reg);
                pst.execute();

                  }
            catch (SQLException e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
             finally {

                try{
                    rs.close();
                    pst.close();

                }  
                
                catch(SQLException e){
                   JOptionPane.showMessageDialog(null,e);
                }
            }
         }
        }
    }                                        

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void txt_aptActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {                                              
    }                                             

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {                                         
    String gender = "Female";
        r_female.setSelected(true);
        r_male.setSelected(false);
        
    }                                        

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {                                       
    String gender = "Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
    }

    private static class txt_emp {

        private static void setText(String toString) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private static Object getText() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public txt_emp() {
        }
    }
}
