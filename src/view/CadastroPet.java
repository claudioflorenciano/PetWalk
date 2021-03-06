/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CtrlCliente;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import model.Animal;
import util.Valida;

/**
 *
 * @author MrMojoBr
 */
public class CadastroPet extends javax.swing.JFrame {
    
    
    private int idCliente;
    CtrlCliente ctrlCliente = new CtrlCliente();
    /**
     * Creates new form CadastroPet
     */
    public CadastroPet() {
        initComponents();
        
        URL iconURL = getClass().getResource("icon/petIcon.png");

        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 14)));
    }
    
    public CadastroPet(int idCliente) {
        initComponents();
        this.idCliente = idCliente;
        
        URL iconURL = getClass().getResource("icon/petIcon.png");

        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.PLAIN, 14)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNomePet = new javax.swing.JLabel();
        jLabelPortePet = new javax.swing.JLabel();
        jLabelSexoPet = new javax.swing.JLabel();
        jLabelIdadePet = new javax.swing.JLabel();
        jLabelObsPet = new javax.swing.JLabel();
        jLabelRacaPet = new javax.swing.JLabel();
        jTextFieldNomeCadPet = new javax.swing.JTextField();
        jTextFieldPorteCadPet = new javax.swing.JTextField();
        jTextFieldRacaCadPet = new javax.swing.JTextField();
        jComboBoxSexoPet = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObsCadPet = new javax.swing.JTextArea();
        jButtonCadastraPet = new javax.swing.JButton();
        jLabelDataCadPet = new javax.swing.JLabel();
        jTextFieldDataCadPet = new javax.swing.JFormattedTextField();
        jTextFieldIdadeCadPet = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PetWalk");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Cadastro de Pet");

        jLabelNomePet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNomePet.setText("Nome: ");

        jLabelPortePet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPortePet.setText("Porte:");

        jLabelSexoPet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelSexoPet.setText("Sexo:");

        jLabelIdadePet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIdadePet.setText("Idade:");

        jLabelObsPet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelObsPet.setText("Observa????es:");

        jLabelRacaPet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelRacaPet.setText("Ra??a:");

        jTextFieldNomeCadPet.setText("Nome Pet");

        jTextFieldPorteCadPet.setText("Porte");

        jTextFieldRacaCadPet.setText("Ra??a");

        jComboBoxSexoPet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Femea" }));

        jTextAreaObsCadPet.setColumns(20);
        jTextAreaObsCadPet.setRows(5);
        jTextAreaObsCadPet.setText("Observa????es sobre o pet.");
        jScrollPane1.setViewportView(jTextAreaObsCadPet);

        jButtonCadastraPet.setText("Cadastrar");
        jButtonCadastraPet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastraPetMouseClicked(evt);
            }
        });

        jLabelDataCadPet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDataCadPet.setText("Data Nascimento:");

        try {
            jTextFieldDataCadPet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldDataCadPet.setText("00/00/0000");

        try {
            jTextFieldIdadeCadPet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldIdadeCadPet.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomePet)
                                    .addComponent(jLabelPortePet)
                                    .addComponent(jLabelRacaPet)
                                    .addComponent(jLabelSexoPet)
                                    .addComponent(jLabelIdadePet))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldRacaCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPorteCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldNomeCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxSexoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldDataCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldIdadeCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCadastraPet))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelObsPet)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDataCadPet))
                                .addGap(0, 145, Short.MAX_VALUE)))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePet)
                    .addComponent(jTextFieldNomeCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPortePet)
                    .addComponent(jTextFieldPorteCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexoPet)
                    .addComponent(jComboBoxSexoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRacaPet)
                            .addComponent(jTextFieldRacaCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdadePet)
                            .addComponent(jTextFieldIdadeCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButtonCadastraPet)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataCadPet)
                    .addComponent(jTextFieldDataCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelObsPet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastraPetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastraPetMouseClicked
        // TODO add your handling code here:
        // cadastrar pet
        Animal animal = new Animal();
        String erros = "";
        
        //cliente.setNome(jTextFieldCadClienteNome.getText());
        animal.setNome(jTextFieldNomeCadPet.getText());
        animal.setPorte(jTextFieldPorteCadPet.getText());
        animal.setSexo(jComboBoxSexoPet.getSelectedItem().toString());
        animal.setRaca(jTextFieldRacaCadPet.getText());
        animal.setIdade(Integer.parseInt(jTextFieldIdadeCadPet.getText()));
        
        //String formataData = jTextFieldDataCadPet.getText().replaceAll("/", "-");
        String formataData = jTextFieldDataCadPet.getText();
        
        ImageIcon iconErroTemp = new ImageIcon(getClass().getResource("icon/error.png"));
        ImageIcon iconErro = new ImageIcon(iconErroTemp.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH));
    
        ImageIcon iconCheckTemp = new ImageIcon(getClass().getResource("icon/check.png"));
        ImageIcon iconCheck = new ImageIcon(iconCheckTemp.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH));
 
        
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(formataData, formatter);
            
            
            
            animal.setData_nascimento(data.toString());
        }catch(DateTimeParseException e){
            animal.setData_nascimento("");
        }

        

        animal.setObservacao(jTextAreaObsCadPet.getText());
        
        
        Valida valida = new Valida();
        erros = valida.validaPet(animal);
        if(!erros.equals("")){
             JOptionPane.showMessageDialog(this, erros, "Aviso!",  JOptionPane.WIDTH, iconErro);
        }else{
            if(ctrlCliente.cadastroAnimal(animal, idCliente)){
                JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso!", "Cadastrado!",  JOptionPane.WIDTH, iconCheck);
                this.dispose();

            }else{
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar!", "Aviso!",  JOptionPane.WIDTH, iconErro);
            }
        }
    }//GEN-LAST:event_jButtonCadastraPetMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastraPet;
    private javax.swing.JComboBox<String> jComboBoxSexoPet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDataCadPet;
    private javax.swing.JLabel jLabelIdadePet;
    private javax.swing.JLabel jLabelNomePet;
    private javax.swing.JLabel jLabelObsPet;
    private javax.swing.JLabel jLabelPortePet;
    private javax.swing.JLabel jLabelRacaPet;
    private javax.swing.JLabel jLabelSexoPet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObsCadPet;
    private javax.swing.JFormattedTextField jTextFieldDataCadPet;
    private javax.swing.JFormattedTextField jTextFieldIdadeCadPet;
    private javax.swing.JTextField jTextFieldNomeCadPet;
    private javax.swing.JTextField jTextFieldPorteCadPet;
    private javax.swing.JTextField jTextFieldRacaCadPet;
    // End of variables declaration//GEN-END:variables
}
