package br.ufpb.dcx.oliveirasilva.maria;
import java.lang.Exception;

public class cpfJaExisteException extends Exception{
    public cpfJaExisteException (String cpf){
        super(cpf);
    }

}
