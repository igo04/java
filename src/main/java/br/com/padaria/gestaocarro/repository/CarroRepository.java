package br.com.padaria.gestaocarro.repository;

import br.com.padaria.gestaocarro.domain.model.Massa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository("massaRepository")
public interface CarroRepository extends JpaRepository<Carro, UUID> {

    @Modifying
    @Transactional
    @Query(value = "update Massa c set c.preco = :preco where c.massaId = :id")
    void updateByPreco(UUID id, float preco);

    static Massa findByPreco(float preco) {
        return null;
    }
}
