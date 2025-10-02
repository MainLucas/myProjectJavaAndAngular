package com.example.meuProjetoJavaAngular.repository;

import com.example.meuProjetoJavaAngular.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
}
