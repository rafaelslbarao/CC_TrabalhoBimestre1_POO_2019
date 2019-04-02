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
public class Veiculo {
    
    private String placa;
    private Modelo modeloDoVeiculo;
    private String cor;

    public Veiculo(String placa, Modelo modeloDoVeiculo, String cor) {
        this.placa = placa;
        this.modeloDoVeiculo = modeloDoVeiculo;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }

    public void setModeloDoVeiculo(Modelo modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
    
}
