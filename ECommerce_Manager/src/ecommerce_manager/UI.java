package ecommerce_manager;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otbox
 */
public class UI {
    public int alterar(){
        int opc;
        opc = JOptionPane.showConfirmDialog(null, "Confirma Alteração", "Alterando...", 0);
        return opc;
    }
    
    public void alterado(){JOptionPane.showMessageDialog(null, "Alterado com Sucesso","Alterar",JOptionPane.INFORMATION_MESSAGE);}
    
    public int excluir(){
        int opc;
        opc = JOptionPane.showConfirmDialog(null, "Confirma Exclusão", "Excluindo...", 0);
        return opc;
    }
    
    public void cancelado(){JOptionPane.showMessageDialog(null, "Operação cancelada","Cancelado",JOptionPane.INFORMATION_MESSAGE);}
    
    
    public void excluido(){JOptionPane.showMessageDialog(null, "Deletado com Sucesso","Excluir",JOptionPane.INFORMATION_MESSAGE);}
    
    public void sucesso(){}
    
    public void erroD(String a){JOptionPane.showMessageDialog(null,"Insira um valor para a excluir por "+ a,"Pesquisar",JOptionPane.INFORMATION_MESSAGE);}
    
    public void erroAT(){JOptionPane.showMessageDialog(null,"Insira um valor para a alterar por ID","Pesquisar",JOptionPane.INFORMATION_MESSAGE);};
    
    public void ErroV(){JOptionPane.showMessageDialog(null,"Insira um valor para a pesquisa por ID","Pesquisar",JOptionPane.INFORMATION_MESSAGE);}
    
    public void incluido() {JOptionPane.showMessageDialog(null, "Criado com sucesso","Inclusão",JOptionPane.INFORMATION_MESSAGE);} 
    
    public void Erro(String e){JOptionPane.showMessageDialog(null,"Erro, Talvez não exista no banco" + e,"SQLErro",JOptionPane.ERROR_MESSAGE);}
    
    public void TextErro(String e){JOptionPane.showMessageDialog(null,"Erro, " + e,"Erro",JOptionPane.ERROR_MESSAGE);}
    
    
             
}
