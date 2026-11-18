package br.ufpb.dcx.oliveirasilva.maria;
import java.util.List;

public interface Hospedagem {
    public void cadastrarHospede(String codigo, String nome, String telefone, String cpf, String data, int quarto) throws cpfJaExisteException;
    List <Hospede> pesquisarHospede (String nome);
    List <Hospede> pesquisarHistoricoHospedagem (String cpf);
    boolean quartoDisponivel (int quarto);
}
