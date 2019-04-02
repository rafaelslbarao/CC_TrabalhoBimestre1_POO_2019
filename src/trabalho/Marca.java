/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author Rafael
 */
public class Marca {
    
    private Integer codigoMarca;
    private String nomeMarca;

    public Marca(Integer codigoMarca, String nomeMarca) {
        this.codigoMarca = codigoMarca;
        this.nomeMarca = nomeMarca;
    }
    
    public Integer getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(Integer codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    
    
    
    
}
