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
public class Vaga {

    private String fileira;
    private Integer vaga;

    public Vaga(String fileira, Integer vaga) {
        this.fileira = fileira;
        this.vaga = vaga;
    }

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public Integer getVaga() {
        return vaga;
    }

    public void setVaga(Integer vaga) {
        this.vaga = vaga;
    }

    public boolean equals(Object objeto) {
        // Verifica se o endereço de memória é o mesmo
        // Se é o mesmo retorna true
        if(objeto == this)
            return true;
        
        // Caso contrário, precisa verificar a fileira e a vaga se ambas são iguais
        if (objeto != null) {
            if (objeto instanceof Vaga) {
                return ((Vaga) objeto).getFileira().equals(getFileira()) &&
                        ((Vaga) objeto).getVaga().equals(getVaga());
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
