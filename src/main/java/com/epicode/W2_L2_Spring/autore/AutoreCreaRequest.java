package com.epicode.W2_L2_Spring.autore;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AutoreCreaRequest {
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
}
