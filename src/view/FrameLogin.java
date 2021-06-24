/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CtrlCliente;
import controller.CtrlPasseador;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import model.Cliente;
import model.Passeador;
import util.Valida;

/**
 *
 * @author MrMojoBr
 */
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogin
     */
    public FrameLogin() {
        initComponents();
        
        URL iconURL = getClass().getResource("icon/petIcon.png");

        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 14)));
        
    }
    
    ImageIcon iconErroTemp = new ImageIcon(getClass().getResource("icon/error.png"));
    ImageIcon iconErro = new ImageIcon(iconErroTemp.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH));
    
    ImageIcon iconCheckTemp = new ImageIcon(getClass().getResource("icon/check.png"));
    ImageIcon iconCheck = new ImageIcon(iconCheckTemp.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH));
    
    public void trocaTabbedPane(int ind){
        try{
            jTabbedLoginClientePro.setSelectedIndex(ind);
        }catch(Exception e){
            
        }
        
    }
    
    private Cliente cliente;
    private Passeador passeador;
    CtrlCliente ctrlCliente = new CtrlCliente();
    CtrlPasseador ctrlPasseador = new CtrlPasseador();
    
    public Passeador getPasseador(){
        return passeador;
    }
    
    public Cliente getCliente(){
        return cliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogin = new javax.swing.JLabel();
        jButtonCadastraLogin = new javax.swing.JButton();
        jTabbedLoginClientePro = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelMailLoginCliente = new javax.swing.JLabel();
        jLabelSenhaLoginCliente = new javax.swing.JLabel();
        jTextFieldMailLoginCliente = new javax.swing.JTextField();
        jPasswordFieldSenhaLoginCliente = new javax.swing.JPasswordField();
        jButtonLogarLoginCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelMailLoginPro = new javax.swing.JLabel();
        jLabelSenhaLoginPro = new javax.swing.JLabel();
        jPasswordFieldSenhaLoginPro = new javax.swing.JPasswordField();
        jTextFieldMailLoginPro = new javax.swing.JTextField();
        jButtonLogarLoginPro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetWalk");
        setLocation(new java.awt.Point(500, 300));
        setMaximumSize(new java.awt.Dimension(430, 301));
        setResizable(false);

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogin.setText("Login");

        jButtonCadastraLogin.setText("Cadastrar-se");
        jButtonCadastraLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraLoginActionPerformed(evt);
            }
        });

        jTabbedLoginClientePro.setAutoscrolls(true);
        jTabbedLoginClientePro.setMaximumSize(new java.awt.Dimension(381, 134));

        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(376, 106));

        jLabelMailLoginCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMailLoginCliente.setText("E-Mail:");

        jLabelSenhaLoginCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelSenhaLoginCliente.setText("Senha:");

        jTextFieldMailLoginCliente.setText("E-Mail");
        jTextFieldMailLoginCliente.setMaximumSize(new java.awt.Dimension(35, 20));

        jPasswordFieldSenhaLoginCliente.setText("jPasswordField1");

        jButtonLogarLoginCliente.setText("Logar");
        jButtonLogarLoginCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarLoginClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMailLoginCliente)
                            .addComponent(jLabelSenhaLoginCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldSenhaLoginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMailLoginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jButtonLogarLoginCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2)))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMailLoginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMailLoginCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldSenhaLoginCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSenhaLoginCliente))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLogarLoginCliente)
                        .addGap(27, 27, 27))))
        );

        jTabbedLoginClientePro.addTab("Cliente", jPanel1);

        jPanel2.setAutoscrolls(true);
        jPanel2.setMaximumSize(new java.awt.Dimension(376, 106));

        jLabelMailLoginPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMailLoginPro.setText("E-Mail:");

        jLabelSenhaLoginPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelSenhaLoginPro.setText("Senha:");

        jPasswordFieldSenhaLoginPro.setText("jPasswordField1");
        jPasswordFieldSenhaLoginPro.setMaximumSize(new java.awt.Dimension(112, 20));

        jTextFieldMailLoginPro.setText("E-Mail");
        jTextFieldMailLoginPro.setMaximumSize(new java.awt.Dimension(35, 20));

        jButtonLogarLoginPro.setText("Logar");
        jButtonLogarLoginPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogarLoginProMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Passeador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMailLoginPro)
                            .addComponent(jLabelSenhaLoginPro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldSenhaLoginPro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMailLoginPro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jButtonLogarLoginPro)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMailLoginPro)
                            .addComponent(jTextFieldMailLoginPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldSenhaLoginPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSenhaLoginPro))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLogarLoginPro)
                        .addGap(24, 24, 24))))
        );

        jTabbedLoginClientePro.addTab("Profissional", jPanel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 9)); // NOI18N
        jLabel3.setText("V. - 1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 37, Short.MAX_VALUE)
                .addComponent(jTabbedLoginClientePro, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastraLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTabbedLoginClientePro, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastraLogin)
                .addGap(24, 24, 24)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastraLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastraLoginActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        FrameCadastro fCad = new FrameCadastro();
        
        fCad.trocaTabbedPane(jTabbedLoginClientePro.getSelectedIndex());
        
        fCad.setVisible(true);
    }//GEN-LAST:event_jButtonCadastraLoginActionPerformed

    private void jButtonLogarLoginClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarLoginClienteActionPerformed
        // TODO add your handling code here:
        String erros;
        
        String mail = jTextFieldMailLoginCliente.getText();
        String senha = String.valueOf(jPasswordFieldSenhaLoginCliente.getPassword());
        
        Valida valida = new Valida();
        
        erros = valida.validaLogin(mail, senha);
        
        if(!erros.equals("")){
             JOptionPane.showMessageDialog(this, erros, "Aviso!", JOptionPane.WIDTH, iconErro);
        }else{
            if(ctrlCliente.pesquisaId(mail, senha) != 0){
                cliente = ctrlCliente.pesquisaCliente(ctrlCliente.pesquisaId(mail, senha));
                
                FrameCliente fCliente = new FrameCliente(cliente);
                
                fCliente.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Cliente inexistente!", "Aviso!", JOptionPane.WIDTH, iconErro);
            }
        }
    }//GEN-LAST:event_jButtonLogarLoginClienteActionPerformed

    private void jButtonLogarLoginProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogarLoginProMouseClicked
        // TODO add your handling code here:
        //login passeador
        String erros;
        
        String mail = jTextFieldMailLoginPro.getText();
        String senha = String.valueOf(jPasswordFieldSenhaLoginPro.getPassword());
        
        Valida valida = new Valida();
        
        erros = valida.validaLogin(mail, senha);
        
        if(!erros.equals("")){
             JOptionPane.showMessageDialog(this, erros, "Aviso!", JOptionPane.WIDTH, iconErro);
        }else{
            if(ctrlPasseador.pesquisaId(mail, senha) != 0){
                passeador = ctrlPasseador.pesquisaPasseador(ctrlPasseador.pesquisaId(mail, senha));
                
                FrameProfissional fPro = new FrameProfissional(passeador);
                
                fPro.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Passeador inexistente!", "Aviso!", JOptionPane.WIDTH, iconErro);
            }
        }
    }//GEN-LAST:event_jButtonLogarLoginProMouseClicked

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastraLogin;
    private javax.swing.JButton jButtonLogarLoginCliente;
    private javax.swing.JButton jButtonLogarLoginPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMailLoginCliente;
    private javax.swing.JLabel jLabelMailLoginPro;
    private javax.swing.JLabel jLabelSenhaLoginCliente;
    private javax.swing.JLabel jLabelSenhaLoginPro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldSenhaLoginCliente;
    private javax.swing.JPasswordField jPasswordFieldSenhaLoginPro;
    private javax.swing.JTabbedPane jTabbedLoginClientePro;
    private javax.swing.JTextField jTextFieldMailLoginCliente;
    private javax.swing.JTextField jTextFieldMailLoginPro;
    // End of variables declaration//GEN-END:variables
}
