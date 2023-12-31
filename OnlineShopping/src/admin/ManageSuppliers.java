/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import static admin.AdminDashboard.jLabel33;
import static admin.AdminDashboard.jLabel34;
import static admin.AdminDashboard.jLabel42;
import static admin.AdminDashboard.jPanel20;
import static admin.AdminDashboard.jPanel21;
import dao.Statistics;
import dao.SupplierDao;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import user.Login;

/**
 *
 * @author nguye
 */
public class ManageSuppliers extends javax.swing.JFrame {

    /**
     * Creates new form ManageSuppliers
     */
    SupplierDao supplier = new SupplierDao();
    Color textPrimaryColor = new Color(102, 120, 138);
    Color primaryColor = new Color(42, 58, 73);
    int xx, xy;
    DefaultTableModel model;
    int rowIndex;
    Statistics statistics = new Statistics();
    public ManageSuppliers() {
        initComponents();
        supplierTable();
        setLocation(450,180);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSupID = new javax.swing.JTextField();
        jUserName = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jPhone = new javax.swing.JTextField();
        jAdd1 = new javax.swing.JTextField();
        jAdd2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(97, 130, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSupID.setEditable(false);
        jSupID.setBackground(new java.awt.Color(204, 204, 204));
        jSupID.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jSupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSupIDActionPerformed(evt);
            }
        });
        jPanel1.add(jSupID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 330, 30));

        jUserName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jPanel1.add(jUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 330, 30));

        jEmail.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jPanel1.add(jEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 330, 30));

        jPass.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jPanel1.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 330, 30));

        jPhone.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jPanel1.add(jPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 330, 30));

        jAdd1.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdd1ActionPerformed(evt);
            }
        });
        jPanel1.add(jAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 330, 30));

        jAdd2.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jPanel1.add(jAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 330, 30));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address Line 1 (State & Area)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address Line 2 (Country)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 330, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("x");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        jLabel11.setText("jLabel10");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 30, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        jLabel12.setText("jLabel10");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 30, -1));

        btnUpdate.setBackground(new java.awt.Color(102, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 150, 40));

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 150, 40));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("___________________________________________________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 790, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Username", "Email", "Password", "Phone", "Address Line 1", "Address Line 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 750, 270));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 330, 30));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Search");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MANAGE SUPPLIERS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void supplierTable() {
        supplier.getSupplierValue(jTable1, "");
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }

    private void jSupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSupIDActionPerformed

    private void jAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAdd1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        AdminDashboard.jPanel20.setBackground(primaryColor);
        AdminDashboard.jPanel21.setBackground(primaryColor);
        AdminDashboard.jLabel33.setForeground(textPrimaryColor);
        AdminDashboard.jLabel34.setVisible(true);
        AdminDashboard.jLabel42.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        jPass.setEchoChar((char) 0);
        jLabel11.setVisible(false);
        jLabel12.setVisible(true);

    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here
        jPass.setEchoChar('*');
        jLabel12.setVisible(false);
        jLabel11.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        jSupID.setText(model.getValueAt(rowIndex, 0).toString());
        jUserName.setText(model.getValueAt(rowIndex, 1).toString());
        jEmail.setText(model.getValueAt(rowIndex, 2).toString());
        jPass.setText(model.getValueAt(rowIndex, 3).toString());
        jPhone.setText(model.getValueAt(rowIndex, 4).toString());
        jAdd1.setText(model.getValueAt(rowIndex, 5).toString());
        jAdd2.setText(model.getValueAt(rowIndex, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (isEmpty()) {
            if (!check()) {
                int id = Integer.parseInt(jSupID.getText());
                String username = jUserName.getText();
                String email = jEmail.getText();
                String password = String.valueOf(jPass.getPassword());
                String phone = jPhone.getText();
                String address1 = jAdd1.getText();
                String address2 = jAdd2.getText();
                supplier.update(id, username, email, password, phone, address1, address2);
                jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "Username", "Email", "Password", "Phone", "Address Line 1", "Address Line 2"}));
                supplier.getSupplierValue(jTable1, "");
                clear();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         if (jSupID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a supplier", "Warning", 2);
        }
         else{
             int id = Integer.valueOf(jSupID.getText());
             supplier.delete(id);
             jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "Username", "Email", "Password", "Phone", "Address Line 1", "Address Line 2"}));
                supplier.getSupplierValue(jTable1, "");
                clear();
         }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "Username", "Email", "Password", "Phone", "Address Line 1", "Address Line 2"}));
                supplier.getSupplierValue(jTable1,jTextField7.getText());
    }//GEN-LAST:event_jTextField7KeyReleased

    private boolean check() {
        String newUsername = jUserName.getText();
        String newEmail = jEmail.getText();
        String newPhone = jPhone.getText();
        String oldUsername = model.getValueAt(rowIndex, 1).toString();
        String oldEmail = model.getValueAt(rowIndex, 2).toString();
        String oldPhone = model.getValueAt(rowIndex, 4).toString();
        if (newUsername.equals(oldUsername) && newEmail.equals(oldEmail) && newPhone.equals(oldPhone)) {
            return false;
        } else {
            if (!newUsername.equals(oldUsername)) {
                boolean x = supplier.isUsernameExist(newUsername);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This username already exists", "Warning", 2);
                }
                return x;
            }
            if (!newEmail.equals(oldEmail)) {
                boolean x = supplier.isEmailExist(newEmail);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This email already exists", "Warning", 2);
                }
                return x;
            }
            if (!newPhone.equals(oldPhone)) {
                boolean x = supplier.isPhoneExist(newPhone);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This phone already exists", "Warning", 2);
                }
                return x;
            }
        }
        return false;
    }

    private void clear() {
        jSupID.setText(String.valueOf(supplier.getMaxRow()));
        jUserName.setText("");
        jEmail.setText("");
        jPhone.setText("");
        jAdd1.setText("");
        jAdd2.setText("");
        jTextField7.setText("");
        jPass.setText("");
        jTable1.clearSelection();
        statistics.admin();
    }

    public boolean isEmpty() {
        if (jSupID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a supplier", "Warning", 2);
            return false;
        }
        if (jUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required", "Warning", 2);
             return false;
        }
        if (jEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email address is required", "Warning", 2);
            return false;
        }
        if (!jEmail.getText().matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid email address", "Warning", 2);
            return false;
        }
        if (String.valueOf(jPass.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", 2);
            return false;
        }
        if (jPhone.getText().length() > 15) {
            JOptionPane.showMessageDialog(this, "Phone number is to long", "Warning", 2);
            return false;
        }
        if (jPhone.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "Phone number is to short", "Warning", 2);
            return false;
        }
        if (jAdd1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address line 1 is required", "Warning", 2);
            return false;
        }
        if (jAdd2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address line 2 is required", "Warning", 2);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField jAdd1;
    private javax.swing.JTextField jAdd2;
    private javax.swing.JTextField jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jPhone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSupID;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jUserName;
    // End of variables declaration//GEN-END:variables
}
