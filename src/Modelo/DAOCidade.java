
package Modelo;

import java.util.List;

public class DAOCidade { // Data Acess Object 
    
    public List<Cidade> getLista(){
       return Dados.listaCidade ;
       
    }
    public boolean salvar(Cidade obj){ // salva na lista cidade
        if(obj.getCodigoCidade() == null){
            Integer codigo = Dados.listaCidade.size() +1;
            obj.setCodigoCidade(codigo);
            Dados.listaCidade.add(obj);
        }
        return true;
    }
    
    public boolean remover(Cidade obj){ // remove obj da lista
        Dados.listaCidade.remove(obj);
        return true;
    }
    
    
}
