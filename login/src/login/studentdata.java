/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;


        

/**
 *
 * @author my
 */
public class studentdata extends javax.swing.JFrame {

    /*private JTable jTable1;
    private JScrollPane jScrollPane1;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JLabel datevar;
    private JLabel homeworkoutvar;
    private JLabel classsecvar;
    private JLabel stuvar;
    private JTextField tstuname;
    private JTextField thomework;
    //private JLabel jLabel5;
    private JDateChooser tdate;
    private JScrollPane jScrollPane2;
    private JTable jTable2;
    private JTextField tclass;
    private JPanel jPanel4;
    private JButton treset;
    private JButton homeworkout;
    private JButton viewprogressbar;
    private JButton tedit;
    private JButton texitvar;
    private JPanel jPanel5;
    private JLabel jLabel1;
*/

    /**
     * Creates new form studentdata
     */
    
    int q,i,id,deleteItem;
        ResultSet rs = null;
        PreparedStatement pst = null;
        
    public studentdata() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void viewData()
    {
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        
        try{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");

try (java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "root","root")) {
System.out.println("connected");
                
                Statement stm;
                stm = con.createStatement();
            String sql2 = "select * from studentworkout";
                
                rs = stm.executeQuery(sql2);
                ResultSetMetaData stData = rs.getMetaData();
                 q = stData.getColumnCount();
                DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
                RecordTable.setRowCount(0);
                
                while(rs.next()){
                    Vector columnData = new Vector();
                    for(i=1;i<=q;i++)
                    {
                  columnData.add(rs.getString("STUDENTNAME"));
                  columnData.add(rs.getString("DATE"));
                  columnData.add(rs.getString("TIMINGS"));
                  columnData.add(rs.getString("CLASS_SECTION"));
                    }
                    RecordTable.addRow(columnData);
                    
            }
        
        }
        }
        catch(Exception ex)
        {
        
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        datevar = new javax.swing.JLabel();
        homeworkoutvar = new javax.swing.JLabel();
        classsecvar = new javax.swing.JLabel();
        stuvar = new javax.swing.JLabel();
        tstuname = new javax.swing.JTextField();
        thomework = new javax.swing.JTextField();
        tdate = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tclass = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        treset = new javax.swing.JButton();
        homeworkout = new javax.swing.JButton();
        viewprogressbar = new javax.swing.JButton();
        texitvar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 8));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 8));

        datevar.setText("  Date");

        homeworkoutvar.setText(" TIMINGS");

        classsecvar.setText("  Class/Section");

        stuvar.setText("  Student Name");

        tstuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tstunameActionPerformed(evt);
            }
        });

        thomework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thomeworkActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENTNAME", "DATE", "TIMINGS", "CLASS_SECTION"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTable2CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        tclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(datevar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(classsecvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stuvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(homeworkoutvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tstuname)
                                .addComponent(tdate, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(thomework))
                            .addComponent(tclass, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stuvar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tstuname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datevar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tdate, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thomework, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeworkoutvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classsecvar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tclass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 8));

        treset.setText("Reset");
        treset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresetActionPerformed(evt);
            }
        });

        homeworkout.setText("Add student Details");
        homeworkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeworkoutActionPerformed(evt);
            }
        });

        viewprogressbar.setText("Vew Progress Bar");
        viewprogressbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewprogressbarActionPerformed(evt);
            }
        });

        texitvar.setText("Exit");
        texitvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texitvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeworkout)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(treset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewprogressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(texitvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(viewprogressbar)
                .addGap(47, 47, 47)
                .addComponent(homeworkout)
                .addGap(41, 41, 41)
                .addComponent(treset)
                .addGap(36, 36, 36)
                .addComponent(texitvar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 8));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("                           Student Details");

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 860, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tclassActionPerformed

    private void tstunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tstunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tstunameActionPerformed

    private void thomeworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thomeworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thomeworkActionPerformed

    private void viewprogressbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewprogressbarActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        try{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");

try (java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "root","root")) {
System.out.println("connected");
                
                Statement stm;
                stm = con.createStatement();
                String sql1 = "select * from studentworkout";
                ResultSet rs = stm.executeQuery(sql1);
                
                while(rs.next()){
                    String USERNAME=rs.getString("STUDENTNAME");
                    String CATEGORY=rs.getString("DATE");
                    String EMAILID=rs.getString("TIMINGS");
                    String MAINSTROKE=rs.getString("CLASS_SECTION");
                    
                    model.addRow(new Object[]{USERNAME,CATEGORY,EMAILID,MAINSTROKE});
                }
                con.close();
            }
        
        }
        catch(Exception ex)
        {
        
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_viewprogressbarActionPerformed
    private JFrame frame;
    private void texitvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texitvarActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Details",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    
    }//GEN-LAST:event_texitvarActionPerformed

    private void tresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresetActionPerformed
        // TODO add your handling code here:
        tstuname.setText("");
        //tdate.setDate(1\1\1900);
        thomework.setText("");
        tclass.setText("");
        
        
    }//GEN-LAST:event_tresetActionPerformed

    private void homeworkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeworkoutActionPerformed
        // TODO add your handling code here:
        
        
        
        
        try{
     
            Class.forName("org.apache.derby.jdbc.ClientDriver");

try (java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb", "root","root")) {
System.out.println("connected");
                String TStudentname = tstuname.getText();
                Date TDate = (Date) tdate.getDate();
                SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String DDate = oDateFormat.format(TDate);
                
                String THomeworkout = thomework.getText();
                String TClass = tclass.getText();
                Statement stm;
                stm = con.createStatement();
                String sql1;
                sql1 = "INSERT into studentworkout values (?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql1);
                
                     
                stmt.setString(1,TStudentname);
                stmt.setString(2,DDate);
                 stmt.setString(3,THomeworkout);
                  stmt.setString(4,TClass);
              
         
                     
                    stmt.executeUpdate();
                     JOptionPane.showMessageDialog(null, "Successfully Updated");
                     
                    
                       tstuname.setText("");
                        //tdate.setDate(1\1\1900);
                        thomework.setText("");
                        tclass.setText("");
                               
                
                
                con.close();
                viewData();
                
            }
        
        }catch(ClassNotFoundException | SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_homeworkoutActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
               int SelectedRows = jTable2.getSelectedRow();
                        tstuname.setText(RecordTable.getValueAt(SelectedRows,1).toString());
                        //tdate.setDate(RecordTable.getValueAt(SelectedRows,1).toString());
                        thomework.setText(RecordTable.getValueAt(SelectedRows,1).toString());
                        tclass.setText(RecordTable.getValueAt(SelectedRows,1).toString());
               
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
         dispose();
                    teacherdashboard tdb = new teacherdashboard();
                    tdb.show();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2KeyPressed

    private void jTable2CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable2CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2CaretPositionChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

             
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())

              {
                if ("Nimbus".equals(info.getName()))
               {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                      break;             
               }
        }
}catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new studentdata().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classsecvar;
    private javax.swing.JLabel datevar;
    private javax.swing.JButton homeworkout;
    private javax.swing.JLabel homeworkoutvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel stuvar;
    private javax.swing.JTextField tclass;
    private com.toedter.calendar.JDateChooser tdate;
    private javax.swing.JButton texitvar;
    private javax.swing.JTextField thomework;
    private javax.swing.JButton treset;
    private javax.swing.JTextField tstuname;
    private javax.swing.JButton viewprogressbar;
    // End of variables declaration//GEN-END:variables

}