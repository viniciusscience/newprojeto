package br.com.triersistemas.solar.domain;

import br.com.triersistemas.solar.helper.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Farmaceutico extends PessoaFisica {

    private String promocaoDia;

    public Farmaceutico(String nome, String aniver, String documento) {
        this.promocaoDia = StringUtils.getRandomMedicine();
    }

    public Farmaceutico(final String nome, final LocalDate aniver, final String cpf) {
        super(nome, aniver, cpf);
        this.promocaoDia = StringUtils.getRandomMedicine();
    }

    public Farmaceutico(){

    }

    public String getPromocaoDia() {
        return promocaoDia;
    }
}
