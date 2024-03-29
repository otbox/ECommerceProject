/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ecommerce_manager;

import static ecommerce_manager.ConexaoMYSQL.con;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author otbox
 */
public class Produtos extends javax.swing.JFrame {

    /**
     * Creates new form Produtos
     */
    public Produtos() {
        initComponents();
        Categoria();
        jButton3.setVisible(false);
        jButton7.setVisible(false);
        jTextField5.setVisible(false);
        Fornecedores();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Adicionar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Descrição");

        jLabel3.setText("Preço");

        jLabel4.setText("Quantidade");

        jLabel5.setText("Categoria");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Adicionar.setText("Adicionar");
        Adicionar.setEnabled(false);
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        jButton4.setText("Alterar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Excluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Adicionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Categoria");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Remover");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setText("Fornecedor");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(76, 76, 76)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(6, 6, 6)
                                .addComponent(jButton2)
                                .addGap(6, 6, 6)
                                .addComponent(Adicionar)
                                .addGap(6, 6, 6)
                                .addComponent(jButton4)
                                .addGap(6, 6, 6)
                                .addComponent(jButton5))
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton7))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(Adicionar)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    UI UI = new UI();
    private void Incluir(){
        String a2 = jTextField2.getText() , a3 = jTextField3.getText() , a4 = jTextField4.getText();
        int Cat = cat(); 
        int Forn = forn();
        try {
           ConexaoMYSQL.ConectarMYSQL();
           String sql;
           sql = "INSERT INTO `Produtos`( `Descricao`"
                   + ", `Preco`, `Qnt`, `CodCategoria`, `IDFornecedores`) "
                   + "VALUES ('"+a2+"','"
                   + a3+"','"+a4+"','"+Cat+"','"+Forn+"')";
           System.out.println(sql);
           Statement stm = con.prepareStatement(sql);
           stm.execute(sql); 
           UI.incluido();
            
        }
        catch(SQLException ex){
            UI.Erro(ex.toString());
        }        
    }
    
    private void Categoria(){
    jComboBox1.removeAllItems();
    String sql;
        try{
            ConexaoMYSQL.ConectarMYSQL();
            sql = "Select Categoria from categorias";
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql); 
            ResultSet rs = stm.executeQuery(sql); 
            while(rs.next()){
            jComboBox1.addItem(rs.getString("Categoria"));
            }
        } catch(SQLException e){      
            UI.Erro(e.toString());
        }
    
    } 
    
    private void Fornecedores(){
    jComboBox2.removeAllItems();
    String sql;
        try{
            ConexaoMYSQL.ConectarMYSQL();
            sql = "Select FEmpresa from fornecedores";
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql); 
            ResultSet rs = stm.executeQuery(sql); 
            while(rs.next()){
            jComboBox2.addItem(rs.getString("FEmpresa"));
            }
        } catch(SQLException e){      
            UI.Erro(e.toString());
        }
    
    } 
    
    private int forn() {
        String sql;
        int ID =0;
        try{
            ConexaoMYSQL.ConectarMYSQL();
            sql = "Select IDFornecedores from fornecedores where FEmpresa = '"+ jComboBox2.getSelectedItem().toString()+"'";
            System.out.println(sql);
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql); 
            ResultSet rs = stm.executeQuery(sql); 
            rs.next();
            ID = rs.getInt("IDFornecedores");
            return ID;
        } catch(SQLException e){      
            UI.Erro(e.toString());
            return ID;
        }
    }
    
     private String fornr(int a) {
        String sql;
        String categoria = "";
        try{
            ConexaoMYSQL.ConectarMYSQL();
            sql = "Select FEmpresa from fornecedores where IDFornecedores = "+ a +"";
            System.out.println(sql);
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql); 
            ResultSet rs = stm.executeQuery(sql); 
            rs.next();
            categoria = rs.getString("FEmpresa");
            return categoria;
        } catch(SQLException e){      
            UI.Erro(e.toString());
            return categoria;
        }
    }
    
    private int cat() {
        String sql;
        int ID =0;
        try{
            ConexaoMYSQL.ConectarMYSQL();
            sql = "Select IDCategoria from categorias where Categoria = '"+ jComboBox1.getSelectedItem().toString()+"'";
            System.out.println(sql);
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql); 
            ResultSet rs = stm.executeQuery(sql); 
            rs.next();
            ID = rs.getInt("IDCategoria");
            return ID;
        } catch(SQLException e){      
            UI.Erro(e.toString());
            return ID;
        }
    }
    
     private String catr(int a) {
        String sql;
        String categoria = "";
        try{
            ConexaoMYSQL.ConectarMYSQL();
            sql = "Select Categoria from categorias where IDCategoria = "+ a +"";
            System.out.println(sql);
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql); 
            ResultSet rs = stm.executeQuery(sql); 
            rs.next();
            categoria = rs.getString("Categoria");
            return categoria;
        } catch(SQLException e){      
            UI.Erro(e.toString());
            return categoria;
        }
    }
    private void alterar(){
        String ID = jTextField1.getText();
        String a2 = jTextField2.getText() , a3 = jTextField3.getText() , a4 = jTextField4.getText();
        int Cat = cat();
        int Forn = forn();
        String sql;
        int opc;
        try{
            if(ID.equals("")){
             UI.erroAT();
            }else{
                opc = UI.alterar();
                if (opc == 0){
                    ConexaoMYSQL.ConectarMYSQL();
                    sql = "UPDATE `Produtos` SET `Descricao`='"+ a2 +"',"
                            + "`Preco`='"+ a3 +"',`Qnt`='"+ a4 +"',`CodCategoria`='"+ Cat +"'," 
                            + "`Preco`='"+Forn+"'"
                            +" WHERE IDProduto = " + ID;
                    System.out.println(sql);
                    Statement stm = con.prepareStatement(sql);
                    stm.execute(sql); 
                    UI.alterado();                
                    Limpar();
                }else {
                    UI.cancelado();
                }
            }
        }
        catch(SQLException e){      
            UI.Erro(e.toString());
        }
    }
    
    private void Excluir(){
        String sql;   
        String ID = jTextField1.getText();
        int opc;
        try{
            if(ID.equals("")){
             UI.erroD("ID");
            }else{
                opc = UI.excluir();
                if (opc == 0){
                    ConexaoMYSQL.ConectarMYSQL();
                    sql = "DELETE FROM Produtos WHERE IDProduto =" + ID;
                    Statement stm = con.prepareStatement(sql);
                    stm.execute(sql); 
                    Limpar();
                    UI.excluido();
                }else {

                    UI.cancelado();
                }
            }
        }
        catch(SQLException e){
            UI.Erro(e.toString());

        }
    }
    
    public void Limpar(){
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    }
    
    boolean alter = true;
    private void alternar(){
        Limpar();
        if(alter){
        Adicionar.setEnabled(true);
        jTextField1.setEnabled(false);
        alter = false;}
        else{
        Adicionar.setEnabled(false);
        jTextField1.setEnabled(true);
        alter = true;
        }
    }
    
    
    boolean alter2 = true;
    private void alternar2(){
        jTextField5.setText("");
        if(alter2){
        jButton3.setVisible(alter2);
        jButton7.setVisible(alter2);
        jTextField5.setVisible(alter2);
        alter2 = false;}
        else{
        jButton3.setVisible(alter2);
        jButton7.setVisible(alter2);
        jTextField5.setVisible(alter2);
        alter2 = true;
        }
    }
    private void Pesquisar () {
            String sql;
        try{
            if(jTextField1.getText().equals("")){
                UI.ErroV();}
            else{
                String ID =jTextField1.getText();
                ConexaoMYSQL.ConectarMYSQL();
                sql = "select * from Produtos where IDProduto = " + ID; 
                System.out.println(sql);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql); 
                rs.next();
                jTextField1.setText(rs.getString("IDProduto"));
                jTextField2.setText(rs.getString("Descricao"));
                jTextField3.setText(rs.getString("Preco"));
                jTextField4.setText(rs.getString("Qnt"));
                String cat = catr(rs.getInt("CodCategoria"));
                String forn = fornr(rs.getInt("IDFornecedores"));
                jComboBox1.setSelectedItem(cat);
                jComboBox2.setSelectedItem(forn);
            }
        }catch(SQLException e){
            UI.Erro(e.toString());
            
        }
    }
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Excluir();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Pesquisar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int Cat = cat() ;        
        try {
            if (!jTextField5.getText().equals("")){
                ConexaoMYSQL.ConectarMYSQL();
                String sql;
                sql = "INSERT INTO `categorias`( `Categoria`)"
                        + "VALUES ('"+jTextField5.getText()+"')";
                System.out.println(sql);
                Statement stm = con.prepareStatement(sql);
                stm.execute(sql); 
                Categoria();
                UI.incluido();
            } else{
                UI.TextErro("Insira um nome para a categoria");
            }
        }
        catch(SQLException ex){
            UI.Erro(ex.toString());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String sql;   
        int opc;
        try{
            if(jTextField5.getText().equals("")){
             UI.erroD("Nome da Categoria");
            }else{
                String Categoria = jTextField5.getText();
                opc = UI.excluir();
                if (opc == 0){
                    ConexaoMYSQL.ConectarMYSQL();
                    sql = "DELETE FROM categorias WHERE Categoria ='" + Categoria+"'";
                    Statement stm = con.prepareStatement(sql);
                    stm.execute(sql); 
                    Limpar();
                    Categoria();
                    UI.excluido();
                }else {
                    UI.cancelado();
                }
            }
        }
        catch(SQLException e){
            UI.Erro(e.toString());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        alternar2();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        alternar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        // TODO add your handling code here:
        Incluir();
    }//GEN-LAST:event_AdicionarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
