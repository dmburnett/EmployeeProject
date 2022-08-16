

import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class login extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    /**
     * Creates new form Login_jframe
     */

    
    public login() {
        initComponents();
        conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        currentDate();
       
    }
    

    public final void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        txt_date.setText((month+1)+"/"+day+"/"+year);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        lbl_time.setText(hour+":"+(minute)+":"+second);
    }
                              
    private void initComponents() {

    JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
    JMenu jMenu1 = new javax.swing.JMenu();
    JRadioButtonMenuItem jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
    JPopupMenu jPopupMenu1 = new javax.swing.JPopupMenu();
    JPanel jPanel2 = new javax.swing.JPanel();
    JButton cmd_Login = new javax.swing.JButton();
    JLabel jLabel1 = new javax.swing.JLabel();
    JLabel jLabel2 = new javax.swing.JLabel();
    JLabel jLabel6 = new javax.swing.JLabel();
    JTextField txt_username = new javax.swing.JTextField();
    JPasswordField txt_password = new javax.swing.JPasswordField();
    JComboBox txt_combo = new javax.swing.JComboBox();
    JLabel jLabel3 = new javax.swing.JLabel();
    JLabel jLabel4 = new javax.swing.JLabel();
    JPanel jPanel3 = new javax.swing.JPanel();
    JLabel jLabel5 = new javax.swing.JLabel();
    JLabel jLabel7 = new javax.swing.JLabel();
    JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
    JMenu jMenu2 = new javax.swing.JMenu();
    JMenuItem jMenuItem2 = new javax.swing.JMenuItem();
    JMenu jMenu3 = new javax.swing.JMenu();
    JMenu txt_date = new javax.swing.JMenu();
    JMenu lbl_time = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        cmd_Login.setBackground(new java.awt.Color(0, 153, 204));
        cmd_Login.setText("Login");
        cmd_Login.addActionListener((java.awt.event.ActionEvent evt) -> {
            cmd_LoginActionPerformed(evt);
    });
        cmd_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmd_LoginKeyPressed(evt);
            }
        });
        jPanel2.add(cmd_Login);
        cmd_Login.setBounds(160, 470, 70, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 360, 70, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 400, 70, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Please enter your username and password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 320, 241, 14);
        jPanel2.add(txt_username);
        txt_username.setBounds(100, 350, 132, 30);

        txt_password.addActionListener((java.awt.event.ActionEvent evt) -> {
            txt_passwordActionPerformed(evt);
    });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel2.add(txt_password);
        txt_password.setBounds(100, 390, 132, 30);

        txt_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Sales" }));
        txt_combo.addActionListener((java.awt.event.ActionEvent evt) -> {
            txt_comboActionPerformed(evt);
    });
        jPanel2.add(txt_combo);
        txt_combo.setBounds(100, 430, 130, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Position:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 440, 100, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/image-4.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 100, 790, 410);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel5.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel5.setText("EMPLOYEE MANAGEMENT SYSTEM USING JAVA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("By: ITSOURCECODE.COM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(631, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 790, 103);

        jMenu2.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Exit.png"))); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMenuItem2ActionPerformed(evt);
    });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);

        txt_date.setText("Date");
        jMenuBar1.add(txt_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void cmd_LoginActionPerformed(java.awt.event.ActionEvent evt) {                                          

        if (txt_username.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Username Field is empty");
    } else if (txt_password.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Password Field is empty");
    }else {
        
        
        String sql = "select id,username,password,division from Users Where (username =? and password =? and division =?)";
                
        try{
           int count =0;
         
           pst=conn.prepareStatement(sql);
           
           
           pst.setString(1, (String) txt_username.getText());
           pst.setString(2, (String) txt_password.getText());
           pst.setString(3, txt_combo.getSelectedItem().toString());
           
         
           
           rs=pst.executeQuery();
           
            
           {
           }
           while(rs.next()){
               int id = rs.getInt(1);
               Emp.empId = id;
               count =count+1;
           }
          String access=(txt_combo.getSelectedItem().toString());
            
          
           
           if("Admin".equals(access)) {
           
               if(count==1){
                   JOptionPane.showMessageDialog(null,"Sucess" );
                   MainMenu j = new MainMenu();
                   j.setVisible(true);
                   this.dispose();
                   
                   
                    Date currentDate = GregorianCalendar.getInstance().getTime();
                  DateFormat df = DateFormat.getDateInstance();
                  String dateString = df.format(currentDate);

                  Date d = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                  String timeString = sdf.format(d);

                  String value0 = timeString;
                  String values = dateString;
                   
                   
                   int value = (int) Emp.empId;
                   String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                   pst=conn.prepareStatement(reg);
                   pst.execute();
                   this.dispose();
                   
           
           }
               
           
           
           else if(count>1){
                   JOptionPane.showMessageDialog(null,"Duplicate Username or Password Access denied");
                   }
           else{
               JOptionPane.showMessageDialog(null,"Username and Password is not correct");
           }   
          }
               else if("Sales".equals(access)){
                   
                   if(count ==1){
                   JOptionPane.showMessageDialog(null,"Sucess");
                   MainMenu j = new MainMenu();
                   j.setVisible (true); 
                   
                  Date currentDate = GregorianCalendar.getInstance().getTime();
                  DateFormat df = DateFormat.getDateInstance();
                  String dateString = df.format(currentDate);

                  Date d = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                  String timeString = sdf.format(d);

                  String value0 = timeString;
                  String values = dateString;
                   
                   
                   int value = (int) Emp.empId;
                   String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                   pst=conn.prepareStatement(reg);
                   pst.execute();
                   this.dispose();
                   }
                else{
               JOptionPane.showMessageDialog(null,"Username and Password is not correct"); 
           }     
               }
        } catch(HeadlessException | SQLException e)

        {
             JOptionPane.showMessageDialog(null, e);

        }
        finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(SQLException e){
                
            }
        }
    
    }
    }                                         

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0); 
    }                                          

    private void cmd_LoginKeyPressed(java.awt.event.KeyEvent evt) {                                     
        
        
        
        
        
        
    }                                    

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {                                        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
          String sql = "select id,username,password,division from Users Where (username =? and password =? and division =?)";
                
                //"select * from Employeeinfo where username=? and password=? and division=? and id=?";
        try{
           int count =0;
         
           pst=conn.prepareStatement(sql);
           
           
           pst.setString(1, (String) txt_username.getText());
           pst.setString(2, (String) txt_password.getText());
           pst.setString(3, txt_combo.getSelectedItem().toString());
           
           rs=pst.executeQuery();
           
            
           {
           }
           while(rs.next()){
               int id = rs.getInt(1);
               Emp.empId = id;
               count =count+1;
           }
           String access=(txt_combo.getSelectedItem().toString());
             
           
           
           if("Admin".equals(access)) {
           
               if(count==1){
                   JOptionPane.showMessageDialog(null,"Success" );
                   MainMenu j = new MainMenu();
                   j.setVisible(true);
                   this.dispose();
                   
                   Date currentDate = GregorianCalendar.getInstance().getTime();
                  DateFormat df = DateFormat.getDateInstance();
                  String dateString = df.format(currentDate);

                  Date d = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                  String timeString = sdf.format(d);

                  String value0 = timeString;
                  String values = dateString;
                   
                   
                   int value = (int) Emp.empId;
                   String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                   pst=conn.prepareStatement(reg);
                   pst.execute();
                   this.dispose();
           
           }
               
           
           
           else if(count>1){
                   JOptionPane.showMessageDialog(null,"Duplicate Username or Password Access denied");
                   }
           
        
           else{
               JOptionPane.showMessageDialog(null,"Username and Password is not correct");
               
               
               
           }
               
           }
               else if("Sales".equals(access)){
                   
                   if(count ==1){
                   JOptionPane.showMessageDialog(null,"Success");
                   MainMenu j = new MainMenu();
                   j.setVisible (true); 
                   
                   
                   Date currentDate = GregorianCalendar.getInstance().getTime();
                  DateFormat df = DateFormat.getDateInstance();
                  String dateString = df.format(currentDate);

                  Date d = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                  String timeString = sdf.format(d);

                  String value0 = timeString;
                  String values = dateString;
                   
                   
                   int value = (int) Emp.empId;
                   String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                   pst=conn.prepareStatement(reg);
                   pst.execute();
                   this.dispose();
                   }
                   
         
                else{
               JOptionPane.showMessageDialog(null,"Username and Password is not correct");
               
           }    
                   
                   
               }
               
           
        } catch(HeadlessException | SQLException e)

        {
             JOptionPane.showMessageDialog(null, e);

        }
        finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(SQLException e){
                
            }
        }
            
            
            
            
        }
        
        
        
        
    }                                       

    private void txt_comboActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }
}