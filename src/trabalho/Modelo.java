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
public class Modelo {
    private Integer codigoModelo;
    private String nomeModelo;
    private Marca marcaDoModelo;

    public Modelo(Integer codigoModelo, String nomeModelo, Marca marcaDoModelo) {
        this.codigoModelo = codigoModelo;
        this.nomeModelo = nomeModelo;
        this.marcaDoModelo = marcaDoModelo;
    }

    public Integer getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(Integer codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public Marca getMarcaDoModelo() {
        return marcaDoModelo;
    }

    public void setMarcaDoModelo(Marca marcaDoModelo) {
        this.marcaDoModelo = marcaDoModelo;
    }

    
    
    
}
