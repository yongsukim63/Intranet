/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intranet;

/**
 *
 * @author 2class-004
 */
public class AdminEdit extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public AdminEdit() {
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

        Admin = new javax.swing.JPanel();
        tfDept = new javax.swing.JTextField();
        btSexF = new javax.swing.JRadioButton();
        lbEmail = new javax.swing.JLabel();
        tfTel = new javax.swing.JTextField();
        tfEname = new javax.swing.JTextField();
        lbRank = new javax.swing.JLabel();
        tfPwd = new javax.swing.JTextField();
        btCancle = new javax.swing.JButton();
        lbDept = new javax.swing.JLabel();
        lbPwd = new javax.swing.JLabel();
        tfEmpid = new javax.swing.JTextField();
        btEdit = new javax.swing.JButton();
        tfPwdConfirm = new javax.swing.JTextField();
        lbSex = new javax.swing.JLabel();
        lbMypageHeader = new javax.swing.JLabel();
        btSexM = new javax.swing.JRadioButton();
        lbTel = new javax.swing.JLabel();
        tfRank = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lbEmpid = new javax.swing.JLabel();
        lbEname = new javax.swing.JLabel();
        lbPwdConfirm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Admin.setBackground(new java.awt.Color(255, 255, 255));

        tfDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDeptActionPerformed(evt);
            }
        });

        btSexF.setText("여성");
        btSexF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSexFActionPerformed(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbEmail.setText("이     메    일");

        tfTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelActionPerformed(evt);
            }
        });

        tfEname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnameActionPerformed(evt);
            }
        });

        lbRank.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbRank.setText("직            급");

        tfPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPwdActionPerformed(evt);
            }
        });

        btCancle.setText("취소");

        lbDept.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbDept.setText("부            서");

        lbPwd.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbPwd.setText("비  밀  번  호");

        tfEmpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmpidActionPerformed(evt);
            }
        });

        btEdit.setText("수정 완료");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        tfPwdConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPwdConfirmActionPerformed(evt);
            }
        });

        lbSex.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbSex.setText("성            별");

        lbMypageHeader.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        lbMypageHeader.setText("::: 사원 정보 수정 :::");

        btSexM.setText("남성");

        lbTel.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbTel.setText("전  화  번  호");

        tfRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRankActionPerformed(evt);
            }
        });

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        lbEmpid.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbEmpid.setText("사            번");

        lbEname.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbEname.setText("이            름");

        lbPwdConfirm.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbPwdConfirm.setText("비밀번호 확인");

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addComponent(lbMypageHeader)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRank)
                                    .addComponent(lbDept))
                                .addGap(13, 13, 13)
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDept, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addComponent(tfRank, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                                        .addComponent(btEdit))))
                            .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(AdminLayout.createSequentialGroup()
                                    .addComponent(lbPwdConfirm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfPwdConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmpid)
                                    .addComponent(lbPwd)
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(tfEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(AdminLayout.createSequentialGroup()
                                    .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbSex)
                                        .addComponent(lbTel)
                                        .addComponent(lbEname)
                                        .addComponent(lbEmail))
                                    .addGap(13, 13, 13)
                                    .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(AdminLayout.createSequentialGroup()
                                            .addComponent(btSexM)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btSexF))
                                        .addComponent(tfEname, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfTel)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancle)
                        .addGap(77, 77, 77))))
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbMypageHeader)
                .addGap(18, 18, 18)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmpid)
                    .addComponent(tfEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPwd)
                    .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPwdConfirm)
                    .addComponent(tfPwdConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEname)
                    .addComponent(tfEname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSex)
                    .addComponent(btSexM)
                    .addComponent(btSexF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTel)
                    .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDept)
                    .addComponent(tfDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRank)
                    .addComponent(tfRank, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDeptActionPerformed

    private void btSexFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSexFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSexFActionPerformed

    private void tfTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelActionPerformed

    private void tfEnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnameActionPerformed

    private void tfPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPwdActionPerformed

    private void tfEmpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmpidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmpidActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditActionPerformed

    private void tfPwdConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPwdConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPwdConfirmActionPerformed

    private void tfRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRankActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

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
            java.util.logging.Logger.getLogger(AdminEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    private javax.swing.JButton btCancle;
    private javax.swing.JButton btEdit;
    private javax.swing.JRadioButton btSexF;
    private javax.swing.JRadioButton btSexM;
    private javax.swing.JLabel lbDept;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmpid;
    private javax.swing.JLabel lbEname;
    private javax.swing.JLabel lbMypageHeader;
    private javax.swing.JLabel lbPwd;
    private javax.swing.JLabel lbPwdConfirm;
    private javax.swing.JLabel lbRank;
    private javax.swing.JLabel lbSex;
    private javax.swing.JLabel lbTel;
    private javax.swing.JTextField tfDept;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmpid;
    private javax.swing.JTextField tfEname;
    private javax.swing.JTextField tfPwd;
    private javax.swing.JTextField tfPwdConfirm;
    private javax.swing.JTextField tfRank;
    private javax.swing.JTextField tfTel;
    // End of variables declaration//GEN-END:variables
}