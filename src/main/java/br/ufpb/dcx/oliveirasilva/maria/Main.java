package br.ufpb.dcx.oliveirasilva.maria;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SistemaGerenciamentoHotel sistema = new SistemaGerenciamentoHotel();

        List<Hospede> historico = sistema.pesquisarHistoricoHospedagem ("111");
        for (Hospede h : historico) {
            System.out.println("Data da hospedagem: " + h.getData());
        }
    }
}
