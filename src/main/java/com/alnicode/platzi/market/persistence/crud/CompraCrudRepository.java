package com.alnicode.platzi.market.persistence.crud;

import com.alnicode.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    List<Compra> findByIdCliente(String idCliente);
}
