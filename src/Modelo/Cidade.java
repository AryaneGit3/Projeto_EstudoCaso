
package Modelo;

import java.io.Serializable;
import java.util.Objects;

 // Serializable: possibilita a restauração do estado do ojeto;
// cada entidade possui uma classe, get, set, equals, hasCode e construtor vazio;

public class Cidade implements Serializable {  
    
       
    private Integer codigoCidade;
    private String nomeCidade, ufCidade;
    
    public Cidade(){ // padrão javabeans
    }
    
    //--------------------------------------------------------------------------

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.codigoCidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.codigoCidade, other.codigoCidade)) {
            return false;
        }
        return true;
    }

    public Integer getCodigoCidade() {
        return codigoCidade;
    }

    //--------------------------------------------------------------------------
    
    public void setCodigoCidade(Integer codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
 String getUfCidade() {
        return ufCidade;
    }

    public void setUfCidade(String ufCidade) {
        this.ufCidade = ufCidade;
    }

    //--------------------------------------------------------------------------
    
    
    
    
}
