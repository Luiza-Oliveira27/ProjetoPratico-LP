package br.ufpb.dcx.oliveirasilva.maria;
import java.util.List;
import java.util.ArrayList;

public class SistemaGerenciamentoHotel implements Hospedagem {
    private List<Hospede> hospedes = new ArrayList<>();

    public void cadastrarHospede(String codigo, String nome, String telefone, String cpf, String data, int quarto) throws cpfJaExisteException{
        for (Hospede h: this.hospedes){
            if (h.getCpf().equals(cpf)){
                throw new cpfJaExisteException("Erro: Já existe esse CPF cadastrado");
            }
        }
    }

    public String pesquisarHospede (String nome){
        for (Hospede h: this.hospedes){
            if (h.getNome().equals(nome)){
                return "O hospde: " + h.getNome() + " está no quarto: " + h.getQuarto();
            }
        }
        return "0";
    }

    public List<Hospede> pesquisarHistoricoHospedagem (String cpf){
        List<Hospede> historico = new ArrayList<>();
        for (Hospede h: this.hospedes){
            if (h.getCpf().equals(cpf)){
                historico.add(h);
            }
        }
        return historico;
    }

    public boolean quartoDisponivel (int quarto){
        for(Hospede h: this.hospedes){
            if(h.getQuarto() == quarto){
                return true;
            }
        }
        return false;
    }
}
