package org.sapphon.adapterexample.repository.jpa;

import org.sapphon.adapterexample.model.Apple;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppleRepository extends CrudRepository<Apple, Long> {
    Optional<Apple> findOneById(long id);
}
