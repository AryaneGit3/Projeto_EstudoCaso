
package Modelo;

import java.util.List;

public class DAOFuncionario {
    
        
    public List<Funcionario> getLista(){
       return Dados.listaFuncionario ;
       
    }
    public boolean salvar(Funcionario obj){ // salva na lista cidade
        if(obj.getCodigoFuncionario() == null){
            Integer codigo = Dados.listaFuncionario.size() +1;
            obj.setCodigoFuncionario(codigo);
            Dados.listaFuncionario.add(obj);
        }
        return true;
    }
    
    public boolean remover(Funcionario obj){ // remove obj da lista
        Dados.listaFuncionario.remove(obj);
        return true;
    }
    
    
}
    

