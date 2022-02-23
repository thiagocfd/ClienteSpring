package io.github.thiagocfd.clientes.repositories;

import io.github.thiagocfd.clientes.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
