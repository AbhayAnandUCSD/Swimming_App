/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author my
 */
public class registerform extends javax.swing.JFrame {

    /**
     *Creates new form registerform
     */
    public registerform() {
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

        MinimixeWindow = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MinimixeWindow1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regpass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        regcpass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        regclass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        regcategory = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        mailid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mainstroke = new javax.swing.JTextField();
        reg = new javax.swing.JButton();
        regcancel = new javax.swing.JButton();
        sptype = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MinimixeWindow.setBackground(new java.awt.Color(255, 255, 255));
        MinimixeWindow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 8));
        MinimixeWindow.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("REGISTER ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout MinimixeWindowLayout = new javax.swing.GroupLayout(MinimixeWindow);
        MinimixeWindow.setLayout(MinimixeWindowLayout);
        MinimixeWindowLayout.setHorizontalGroup(
            MinimixeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MinimixeWindowLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(338, 338, 338))
        );
        MinimixeWindowLayout.setVerticalGroup(
            MinimixeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinimixeWindowLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MinimixeWindow1.setBackground(new java.awt.Color(255, 255, 255));
        MinimixeWindow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 8));
        MinimixeWindow1.setName(""); // NOI18N

        jLabel1.setText("  FirstName");

        jLabel2.setText("  LastName");

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });

        jLabel4.setText("  Username");

        regusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regusernameActionPerformed(evt);
            }
        });

        jLabel6.setText("  Password");

        regpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpassActionPerformed(evt);
            }
        });

        jLabel7.setText("  Retype Pass");

        jLabel9.setText("  Class/Section");

        regclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclassActionPerformed(evt);
            }
        });

        jLabel8.setText("  Category");

        jLabel10.setText("  Email ID");

        mailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailidActionPerformed(evt);
            }
        });

        jLabel12.setText("  Main Stroke");

        mainstroke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainstrokeActionPerformed(evt);
            }
        });

        reg.setText("  Register");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        regcancel.setText("Cancel");
        regcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regcancelMouseClicked(evt);
            }
        });
        regcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcancelActionPerformed(evt);
            }
        });

        sptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Coach", "Student" }));
        sptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sptypeActionPerformed(evt);
            }
        });

        jLabel13.setText("  Type");

        javax.swing.GroupLayout MinimixeWindow1Layout = new javax.swing.GroupLayout(MinimixeWindow1);
        MinimixeWindow1.setLayout(MinimixeWindow1Layout);
        MinimixeWindow1Layout.setHorizontalGroup(
            MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinimixeWindow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MinimixeWindow1Layout.createSequentialGroup()
                        .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MinimixeWindow1Layout.createSequentialGroup()
                                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(214, 214, 214)
                                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(regusername, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(regpass, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(regcpass, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(regclass, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(regcategory, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(mailid)
                                            .addComponent(mainstroke)))
                                    .addComponent(regcancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sptype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MinimixeWindow1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183)
                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 327, Short.MAX_VALUE))
                    .addGroup(MinimixeWindow1Layout.createSequentialGroup()
                        .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        MinimixeWindow1Layout.setVerticalGroup(
            MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinimixeWindow1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(regusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(regcpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(regclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(regcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainstroke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(MinimixeWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg)
                    .addComponent(regcancel))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MinimixeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MinimixeWindow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinimixeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MinimixeWindow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void regcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regcancelActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
        
        
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");

try (java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "root","root")) {
System.out.println("connected");
                
                
                String Firstname = firstname.getText();
                String Lastname = lastname.getText();
                String RegUsername = regusername.getText();
                String Regpass = regpass.getText();
                String Regcpass = regcpass.getText();
                
                String Regcategory = regcategory.getText();
                String Mailid = mailid.getText();
                String Mainstroke = mainstroke.getText();
                String type = sptype.getSelectedItem().toString();
                String Class_section = regclass.getText();
                        if(!Regcpass.equals(Regpass)){
                        JOptionPane.showMessageDialog(this,"Password mismatch..Please enter the same password!!");
                         regpass.setText("");
                         regcpass.setText("");
                       }
                Statement stm;
                stm = con.createStatement();
                System.out.println(regusername);
                String sql1;
                sql1 = "INSERT into login values (?,?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql1);
                
                     
                stmt.setString(1,RegUsername);
                stmt.setString(2,Regpass);
                 stmt.setString(3,Firstname);
                  stmt.setString(4,Lastname);
              
                    stmt.setString(5,Regcategory);
                     stmt.setString(6,Mailid);
                      stmt.setString(7,Mainstroke);
                      stmt.setString(8,Class_section);
                      stmt.setString(9,type);
                     
                    stmt.executeUpdate();
                     JOptionPane.showMessageDialog(null, "Successfully Registered");
                     
                    
                       dispose();
                    homepage hpage = new homepage();
                    hpage.show();
                               
                
                
                con.close();
                
            }
        
        }catch(ClassNotFoundException | SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_regActionPerformed

    private void regusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regusernameActionPerformed

    private void mailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailidActionPerformed

    private void mainstrokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainstrokeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainstrokeActionPerformed

    private void regpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regpassActionPerformed

    private void regclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regclassActionPerformed

    private void sptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sptypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sptypeActionPerformed

    private void regcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regcancelMouseClicked
        // TODO add your handling code here:
        
         dispose();
                    homepage hp = new homepage();
                    hp.show();
    }//GEN-LAST:event_regcancelMouseClicked

    /**
     * @param args the command line a{rguments
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registerform().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MinimixeWindow;
    private javax.swing.JPanel MinimixeWindow1;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField mailid;
    private javax.swing.JTextField mainstroke;
    private javax.swing.JButton reg;
    private javax.swing.JButton regcancel;
    private javax.swing.JTextField regcategory;
    private javax.swing.JTextField regclass;
    private javax.swing.JPasswordField regcpass;
    private javax.swing.JPasswordField regpass;
    private javax.swing.JTextField regusername;
    private javax.swing.JComboBox<String> sptype;
    // End of variables declaration//GEN-END:variables
}
