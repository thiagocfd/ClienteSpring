package io.github.thiagocfd.clientes.repositories;

import io.github.thiagocfd.clientes.models.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
