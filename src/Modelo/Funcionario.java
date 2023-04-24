
package Modelo;

import java.io.Serializable;
import java.util.Calendar; // libre que armazena tudo sobre a data - "DATE"
import java.util.Objects;

public class Funcionario implements Serializable{
    
    private Integer codigoFuncionario;
    private String nomeFuncionario;
    private Double salarioFuncionario;
    private Calendar nascimentoFuncionario;
    private Cidade objCidade; // relacionamento com class Cidade
    
    public Funcionario(){
        
    }
    
    //--------------------------------------------------------------------------
    public Integer getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(Integer codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the salarioFuncionario
     */
    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    /**
     * @param salarioFuncionario the salarioFuncionario to set
     */
    public void setSalarioFuncionario(Double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    /**
     * @return the nascimentoFuncionario
     */
    public Calendar getNascimentoFuncionario() {
        return nascimentoFuncionario;
    }

    /**
     * @param nascimentoFuncionario the nascimentoFuncionario to set
     */
    public void setNascimentoFuncionario(Calendar nascimentoFuncionario) {
        this.nascimentoFuncionario = nascimentoFuncionario;
    }

    /**
     * @return the objCidade
     */
    public Cidade getObjCidade() {
        return objCidade;
    }

    /**
     * @param objCidade the objCidade to set
     */
    public void setObjCidade(Cidade objCidade) {
        this.objCidade = objCidade;
    }
    //--------------------------------------------------------------------------

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.codigoFuncionario);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.codigoFuncionario, other.codigoFuncionario)) {
            return false;
        }
        return true;
    }
    

    
    
    
}
