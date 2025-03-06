package com.luanpimenta.mymovie.exceptions;

public class ConvertYearException extends RuntimeException {
    private String mensagem;

    public ConvertYearException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}