/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce_manager;

import static ecommerce_manager.ConexaoMYSQL.con;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author otbox
 */
public class Vendas extends javax.swing.JFrame {

    /**
     * Creates new form Vendas
     */
    public Vendas() {
        initComponents();
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setSize(new java.awt.Dimension(572, 377));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }
        }
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextField6KeyTyped(evt);
        }
    });

    jPanel5.setBackground(new java.awt.Color(255, 153, 153));

    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel9.setText("Pesquisar no Banco");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel9)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9)
            .addContainerGap())
    );

    javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
    jFrame1.getContentPane().setLayout(jFrame1Layout);
    jFrame1Layout.setHorizontalGroup(
        jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jFrame1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jTextField6)
            .addGap(18, 18, 18)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
        .addGroup(jFrame1Layout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    jFrame1Layout.setVerticalGroup(
        jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jFrame1Layout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setForeground(java.awt.Color.white);
    setLocation(new java.awt.Point(200, 200));
    setName("Vendas"); // NOI18N
    setResizable(false);

    jPanel3.setBackground(new java.awt.Color(102, 255, 255));

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setText("IDCliente ");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel4.setText("IDProduto");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setText("Quantidade");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel7.setText("Desconto");

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel10.setText("Tipo de Venda");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(jLabel5)
                .addComponent(jLabel7)
                .addComponent(jLabel10))
            .addContainerGap(33, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel10)
            .addContainerGap(19, Short.MAX_VALUE))
    );

    jPanel1.setBackground(new java.awt.Color(0, 0, 0));

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Qnt", "Produto", "Desconto", "Preço"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            true, false, true, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            jTable2PropertyChange(evt);
        }
    });
    jScrollPane2.setViewportView(jTable2);

    jButton4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
    jButton4.setText("FINALIZAR");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("TOTAL:");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("0.00");

    jButton5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
    jButton5.setText("ADICIONAR ITEM");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

    jButton6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
    jButton6.setText("REMOVER ITEM");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton6ActionPerformed(evt);
        }
    });

    jButton7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
    jButton7.setText("CANCELAR");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel8))
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jButton7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap())
    );

    jPanel2.setBackground(new java.awt.Color(255, 102, 102));

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setText("VENDAS");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(jLabel2)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(0, 7, Short.MAX_VALUE)
            .addComponent(jLabel2))
    );

    jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jTextField2.setToolTipText("");

    jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton1.setText("...");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton2.setText("...");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Crédito", "Débito", "Pix" }));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton2))
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

        UI UI = new UI();
        private void Pesquisar () {
            String sql;
            String oque;
            if (Tabelao.equals("cliente")){oque = "Nome";}else{oque = "Descricao";}
        try{
                String Cliente =jTextField6.getText();
                ConexaoMYSQL.ConectarMYSQL();
                sql = "select * from "+ Tabelao +" WHERE "+ oque +" LIKE '%" + Cliente + "%'";
                System.out.println(sql);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql); 
                
                //rs.next();
                DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                if (Tabelao.equals("cliente")){
                String ID,CPF,Nome,Endereco,Cep,Telefone,Cidade,Estado; 
                    while(rs.next()){
                        ID = rs.getString("IDCliente");
                        Nome = rs.getString("Nome");
                        CPF = rs.getString("CPF");
                        Telefone = rs.getString("Telefone");
                        Cep =rs.getString("CEP");
                        Estado = rs.getString("Estado");
                        Endereco = rs.getString("Endereco");
                        Cidade =rs.getString("Cidade");
                        String[] row = {ID,CPF,Nome,Endereco,Cep,Telefone,Cidade,Estado};
                        model.addRow(row);
                    }
                }else{
                     String ID,Descricao,Preco,Qnt,CodCategoria; 
                    while(rs.next()){
                        ID = rs.getString("IDProduto");
                        Descricao = rs.getString("Descricao");
                        Preco = rs.getString("Preco");
                        Qnt = rs.getString("Qnt");
                        CodCategoria = rs.getString("CodCategoria");
                        String[] row = {ID,Preco,Descricao,Qnt,CodCategoria};
                        model.addRow(row);
                    }    
                }
                jTable1.removeAll();
        }catch(SQLException e){
            UI.Erro(e.toString());
        }
    }
        
    String Tabelao;    
    
    private void Table(String tabela){
        Tabelao = tabela;
         UI UI = new UI();
            jTable1.removeAll();
            String sql;
        try{
            ConexaoMYSQL.ConectarMYSQL();
            sql = "select * from "+tabela; 
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql); 
            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
            int cols=rsmd.getColumnCount();
            String[] colName= new String[cols];
            for(int i=0;i<cols;i++)
                colName[i]=rsmd.getColumnName(i+1);
            model.setColumnIdentifiers(colName);

            //Adicionar dados a Tabela
            if(tabela.equals("cliente")){
                String ID,CPF,Nome,Endereco,Cep,Telefone,Cidade,Estado; 
                while(rs.next()){
                    ID = rs.getString("IDCliente");
                    Nome = rs.getString("Nome");
                    CPF = rs.getString("CPF");
                    Telefone = rs.getString("Telefone");
                    Cep =rs.getString("CEP");
                    Estado = rs.getString("Estado");
                    Endereco = rs.getString("Endereco");
                    Cidade =rs.getString("Cidade");
                    String[] row = {ID,CPF,Nome,Endereco,Cep,Telefone,Cidade,Estado};
                    model.addRow(row);
                }
            }else{
                 String ID,Descricao,Preco,Qnt,CodCategoria; 
                while(rs.next()){
                    ID = rs.getString("IDProduto");
                    Descricao = rs.getString("Descricao");
                    Preco = rs.getString("Preco");
                    Qnt = rs.getString("Qnt");
                    CodCategoria = rs.getString("CodCategoria");
                    String[] row = {ID,Preco,Descricao,Qnt,CodCategoria};
                    model.addRow(row);
                }    
            }
        }catch(SQLException e){
            UI.Erro(e.toString());
        }
    }
    private int Vquantidade (String produto){
        try{
            ConexaoMYSQL.ConectarMYSQL();
            String sql = "select Qnt from produtos where Descricao = '"+produto+"'"; 
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql); 
            rs.next();
            return rs.getInt("Qnt");
        }catch(SQLException e){UI.Erro(e.toString());}
        return 0;
    }
    private int Atualizar(){
        try{
            Double total = 0.0;
            Double TTPreco = 0.0;
            for(int i = 0; i < jTable2.getRowCount(); i++){  
                int Qnt = Integer.parseInt((String)jTable2.getValueAt(i, 0));
                Double Preco = Double.parseDouble((String)jTable2.getValueAt(i, 3));
                Double Desconto = Double.parseDouble((String)jTable2.getValueAt(i, 2));
                Double TPreco = Preco * Qnt - Desconto;    
                TTPreco = TPreco;
                total = TTPreco + total;
        }
            jLabel8.setText(String.valueOf(total));
        }catch(Exception e){System.out.println(e);}
        return 0; 
    }
    
    private void AddtoTable(String Descricao, int Qnt, Double desconto, int IDProduto){
        int VQnt = Vquantidade(Descricao);
        if (Qnt <= VQnt){  
            String Qnt1 = String.valueOf(Qnt);
            String desconto1 = String.valueOf(desconto);
            String preco1 = Produtos(IDProduto,2);
            DefaultTableModel model1=(DefaultTableModel) jTable2.getModel();
            String[] row = {Qnt1,Descricao,desconto1,preco1};
            model1.addRow(row);
            Atualizar();
            }else {
                UI.TextErro("Quantidade maior do que o estoque Quantidade Máxima = "+ VQnt);
            }
    }
    
    private String Produtos(int IDProduto, int opc){
        String Return = "Erro";
            try{
                String sql;
                ConexaoMYSQL.ConectarMYSQL();
                if (opc == 1){
                    sql = "select Descricao from Produtos where IDProduto = "+ IDProduto; 
                }else{
                    sql = "select preco from Produtos where IDProduto = "+ IDProduto; 
                }
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql); 
                rs.next();
                if (opc == 1){
                Return = rs.getString("Descricao");
                }else{Return = String.valueOf(rs.getDouble("preco"));}
             return Return;
            }catch(SQLException e){UI.Erro(e.toString());}
        return Return;
    }
    
    private int SearchProduto(String descricao){
        int Return = 0;
            try{
                String sql;
                ConexaoMYSQL.ConectarMYSQL();                    
                sql = "select IDProduto from Produtos where descricao = '"+ descricao +"'"; 
                System.out.println(sql);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql); 
                rs.next();
                Return = rs.getInt("IDProduto");
                System.out.println("RETUEN = "+ Return);
             return Return;
            }catch(SQLException e){UI.Erro(e.toString());}
        return Return;
    }
    
    public int IDVendedor = 2;
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.out.println(IDVendedor);
        DateFormat data = new SimpleDateFormat("yyyy-MM-dd");
        Date data1 = new Date();
        data.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        String dataf = data.format(data1);
        try{
        int NProdutos;
        int IDCliente = Integer.parseInt(jTextField2.getText());
        int IDProduto = Integer.parseInt(jTextField3.getText());
        double total = Double.parseDouble(jLabel8.getText());
        DefaultTableModel model1=(DefaultTableModel) jTable2.getModel();
        NProdutos = model1.getRowCount();
    
        String sql = "INSERT INTO `vendas`( `IDCliente`, `Totalpreco`, `DataCompra`) "
                    + "VALUES ('"+IDCliente +"','"+total+"','"+dataf+"')";
        ConexaoMYSQL.ConectarMYSQL();
        
        Statement stm = con.prepareStatement(sql);
            stm.execute(sql);
        sql = "Select IDVenda from vendas where IDCliente = " + IDCliente + " ORDER by IDVenda DESC";
        Statement stm1 = con.createStatement();
        ResultSet rs = stm1.executeQuery(sql); 
        rs.next();
        String TipoVenda = (String) jComboBox1.getSelectedItem();
        
        String IDVenda = rs.getString("IDVenda");
 
        for (int i = 0; i < NProdutos; i++){
            int IDProduto1 = SearchProduto((String) jTable2.getValueAt(i, 1));
            int Qnt = Integer.parseInt((String)jTable2.getValueAt(i, 0));
            System.out.println(Qnt);
            Double Preco = Double.parseDouble((String)jTable2.getValueAt(i, 3));
            Double Desconto = Double.parseDouble((String)jTable2.getValueAt(i, 2));
            sql = "INSERT INTO `detalhesvenda`(`IDVenda`, `IDVendedor`, `IDProduto`, `Preco`, `Qnt`, `Tipovenda`, `desconto`) "
                    + "VALUES ('"+IDVenda+"','"+IDVendedor+"','"+IDProduto1+"','"+Preco+"','"+Qnt+"','"+ TipoVenda +"',"+Desconto+")";
            System.out.println(sql);
            stm = con.prepareStatement(sql);
            stm.execute(sql);
        }      
        
        }catch (SQLException e){
           UI.Erro(e.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void limpar(){
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jFrame1.show();
        Table("cliente");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Pesquisar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jFrame1.show();
        Table("produtos");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        Pesquisar();
    }//GEN-LAST:event_jTextField6KeyTyped
    
   
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int Qnt = 1;
        if (jTextField3.getText().equals("") ){
            UI.Erro(" ou Insira valores no Campo de Texto");
        }else{
            if (jTextField4.getText().equals("")){Qnt = 1;}
            else {
                Qnt = Integer.parseInt(jTextField4.getText());
            }
            
            int IDCliente, IDProduto = Integer.parseInt(jTextField3.getText());
            double  desconto = 0;
            try {desconto = Double.parseDouble(jTextField5.getText());} catch (Exception e){}
            String Descricao = Produtos(IDProduto,1);
            AddtoTable(Descricao, Qnt, desconto, IDProduto);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model1=(DefaultTableModel) jTable2.getModel();
        int l;
        l = jTable2.getSelectedRow();
        model1.removeRow(l);
        Atualizar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int l;
        String ID;
        l = jTable1.getSelectedRow();
        ID = (String) jTable1.getValueAt(l, 0);
        if(Tabelao.equals("cliente")){
        jTextField2.setText(ID);
        }else{jTextField3.setText(ID);}
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model1=(DefaultTableModel) jTable2.getModel();
        model1.setRowCount(0);
        Atualizar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable2PropertyChange
        try{
        int l = jTable2.getSelectedRow();
        String Descricao = (String) jTable2.getValueAt(l,1);
        int Qnt = Integer.parseInt((String) jTable2.getValueAt(l,0));
        int VQnt = Vquantidade(Descricao);
        if (Qnt <= VQnt){  
        Atualizar();
        }else{
            UI.TextErro("Quantidade maior do que o estoque Quantidade Máxima = "+ VQnt);
            jTable2.setValueAt(VQnt, l, 0);
        }
        }catch(Exception e){}
    }//GEN-LAST:event_jTable2PropertyChange

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
