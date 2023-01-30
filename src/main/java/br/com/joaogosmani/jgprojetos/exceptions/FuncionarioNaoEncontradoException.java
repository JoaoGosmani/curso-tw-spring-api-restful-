package br.com.joaogosmani.jgprojetos.exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class FuncionarioNaoEncontradoException extends EntityNotFoundException {

    public FuncionarioNaoEncontradoException(Long id) {
        super(String.format("Funcionário com o ID %s não encontrado", id));
    }
    
}
