/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Rafael
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marca ford = new Marca(1, "FORD");
        Marca chevrolet = new Marca(2, "CHEVROLET");
        Marca fiat = new Marca(3, "FIAT");
        //
        Modelo onix = new Modelo(1, "ONIX", chevrolet);
        Modelo s10 = new Modelo(2, "S10", chevrolet);
        Modelo punto = new Modelo(3, "PUNTO", fiat);
        Modelo strada = new Modelo(4, "STRADA", fiat);
        Modelo fiesta = new Modelo(5, "FIESTA", ford);
        Modelo fusion = new Modelo(6, "FUSION", ford);
        //
        Veiculo veiculoOnix1 = new Veiculo("HII-1234", onix, "BRANCA");
        Veiculo veiculoOnix2 = new Veiculo("HII-1235", onix, "PRETO");
        Veiculo veiculoFusion1 = new Veiculo("HHH-1234", fusion, "PRATA");
        Veiculo veiculoFiesta1 = new Veiculo("HHH-9847", fiesta, "PRATA");
        //
        String nomeMarcaOnix1 = veiculoOnix1
                .getModeloDoVeiculo()
                .getMarcaDoModelo()
                .getNomeMarca();
        
        Marca fordFoda = new Marca(4, "FORD FODA");
        fusion.setMarcaDoModelo(fordFoda);
   
        veiculoFusion1.getModeloDoVeiculo().getMarcaDoModelo().setNomeMarca("FORD FODA 2");
        
        
        String nomeMarcaFusion1 = fiesta.getMarcaDoModelo().getNomeMarca();
        
        Vaga vaga = new Vaga("A", 1);
        
        ArrayList<Estacionamento> listaEstacionamento = new ArrayList<>();
        Estacionamento estacionamento = new Estacionamento(
                veiculoFusion1
        , "Rafael Sarreta Lucindo"
        , Calendar.getInstance()
        , vaga);
        listaEstacionamento.add(estacionamento);
        
        boolean vagaEstacionada = Estacionamento.verificaVagaReservada(listaEstacionamento
                , Calendar.getInstance()
        , new Vaga("A", 1));
        
        Estacionamento estacionamento1 = new Estacionamento();
        Estacionamento estacionamento2 = new Estacionamento();
        estacionamento1.setCODIGO_INCIAL(5);
        Estacionamento.setCODIGO_INCIAL(10);
        
    }

}
