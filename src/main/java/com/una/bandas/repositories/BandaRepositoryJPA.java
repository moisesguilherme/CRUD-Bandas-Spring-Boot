package com.una.bandas.repositories;

import com.una.bandas.domain.Banda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BandaRepositoryJPA extends JpaRepository<Banda, Long> {


}
