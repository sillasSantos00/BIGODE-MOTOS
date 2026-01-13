package br.com.motors.store.sellers.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record RequestsellersDto(
    @NotBlank String sellersName,
    Integer quantity,
    LocalDate expirationDate
){}