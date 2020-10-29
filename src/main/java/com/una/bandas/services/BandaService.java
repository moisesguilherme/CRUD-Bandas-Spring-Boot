package com.una.bandas.services;

import com.una.bandas.domain.Banda;
import com.una.bandas.exceptions.CategoriaNotFoundException;
import com.una.bandas.repositories.BandaRepositoryJPA;
import com.una.bandas.services.interfaces.BandaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class BandaService implements BandaServiceAPI {

    @Autowired
    private BandaRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Banda get(Long id){

        try {
            Banda banda = repositoryJPA.findById(id).get();
            return banda;
        } catch (Exception ex) {
            throw new CategoriaNotFoundException(String.format("Banda não existe com esse id: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Banda> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Banda create(Banda banda) {

        return repositoryJPA.save(banda);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Banda banda) {
        repositoryJPA.save(banda);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

}
