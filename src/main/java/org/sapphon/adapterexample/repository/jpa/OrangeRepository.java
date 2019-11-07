package org.sapphon.adapterexample.repository.jpa;

import org.sapphon.adapterexample.model.Orange;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrangeRepository extends CrudRepository<Orange, Long> {
    Optional<Orange> findOneById(long id);
}
