package com.example;

import lombok.Getter;
import lombok.Setter;

public class Cliente {

    @Getter @Setter
    private String Nome;

    @Getter @Setter
    private String Cpf;

    @Getter @Setter
    private String Endereco;
}
