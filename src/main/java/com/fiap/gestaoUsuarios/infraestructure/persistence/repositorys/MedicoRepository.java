package com.fiap.gestaoUsuarios.infraestructure.persistence.repositorys;


import com.fiap.gestaoUsuarios.infraestructure.persistence.entities.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<MedicoEntity, String> {
}
