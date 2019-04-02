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
public class Estacionamento {

    private static int CODIGO_INCIAL = 0;

    public static int getCODIGO_INCIAL() {
        return CODIGO_INCIAL;
    }

    public static void setCODIGO_INCIAL(int CODIGO_INCIAL) {
        Estacionamento.CODIGO_INCIAL = CODIGO_INCIAL;
    }

    private Veiculo carro;
    private String nomeMotorista;
    private Calendar dataEstacionamento;
    private Vaga vagaEstacionada;

    public Estacionamento() {
    }

    public Estacionamento(Veiculo carro, String nomeMotorista, Calendar dataEstacionamento, Vaga vagaEstacionada) {
        this.carro = carro;
        this.nomeMotorista = nomeMotorista;
        this.dataEstacionamento = dataEstacionamento;
        this.vagaEstacionada = vagaEstacionada;
    }

    public Veiculo getCarro() {
        return carro;
    }

    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public Calendar getDataEstacionamento() {
        return dataEstacionamento;
    }

    public void setDataEstacionamento(Calendar dataEstacionamento) {
        this.dataEstacionamento = dataEstacionamento;
    }

    public Vaga getVagaEstacionada() {
        return vagaEstacionada;
    }

    public void setVagaEstacionada(Vaga vagaEstacionada) {
        this.vagaEstacionada = vagaEstacionada;
    }

    public static boolean verificaVagaReservada(
            ArrayList<Estacionamento> listaEstacionamento,
            Calendar dataVerificacao,
            Vaga vaga) {
        for (Estacionamento estacionamentoVerificacao : listaEstacionamento) {

            String dataEstacionamento = "12/05/2019 12:55:48";
            String dataParametro = "12/05/2019";

            if (dataEstacionamento.substring(0, 10).equals(dataParametro.substring(0, 10))) {
                if (estacionamentoVerificacao.getVagaEstacionada().equals(vaga)) {
                    return true;
                }
            }
            if (verificaMesmaData(
                    estacionamentoVerificacao.getDataEstacionamento(),
                    dataVerificacao)) {
// Foi substituido pela sobrescrita do método equals da classe Vaga
//                if(estacionamentoVerificacao
//                        .getVagaEstacionada()
//                        .getFileira().equals(vagaEstacionada.getFileira())
//                        && 
//                        estacionamentoVerificacao
//                        .getVagaEstacionada()
//                        .getVaga().equals(vagaEstacionada.getVaga())
//                        )
//                    return true;

                if (estacionamentoVerificacao.getVagaEstacionada().equals(vaga)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int qtdVagaReservadaNaData(
            ArrayList<Estacionamento> listaEstacionamento,
            Calendar dataVerificacao) {
        int contador = 0;
        for (Estacionamento estacionamentoVerificacao : listaEstacionamento) {
            if (verificaMesmaData(
                    estacionamentoVerificacao.getDataEstacionamento(),
                    dataVerificacao)) {
                contador++;
            }
        }
        return contador;
    }

    public static Vaga verificaVagaReservaPeloCarroNaData(
            ArrayList<Estacionamento> listaEstacionamento,
            Calendar dataVerificacao,
            Veiculo veiculoParametro) {
        for (Estacionamento estacionamentoVerificacao : listaEstacionamento) {
            if (verificaMesmaData(
                    estacionamentoVerificacao.getDataEstacionamento(),
                    dataVerificacao)) {
                if(estacionamentoVerificacao
                        .getCarro()
                        .getPlaca().equals(veiculoParametro.getPlaca()))
                    return estacionamentoVerificacao.getVagaEstacionada();
            }
        }
        return null;
    }

    private static boolean verificaMesmaData(Calendar data1, Calendar data2) {
        int diaMesEstacionamento = data1
                .get(Calendar.DAY_OF_MONTH);
        int mesEstacionamento = data1
                .get(Calendar.MONTH);
        int anoEstacionamento = data1
                .get(Calendar.YEAR);

        int diaMesParametro = data2
                .get(Calendar.DAY_OF_MONTH);
        int mesParametro = data2
                .get(Calendar.MONTH);
        int anoParametro = data2
                .get(Calendar.YEAR);

        if (diaMesEstacionamento == diaMesParametro
                && mesEstacionamento == mesParametro
                && anoEstacionamento == anoParametro) {
            return true;
        } else {
            return false;
        }

    }

}
