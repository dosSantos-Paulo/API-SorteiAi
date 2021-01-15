package com.dossantos.sorteiai.repository;

import com.dossantos.sorteiai.model.LuckyModel;
import org.springframework.data.repository.CrudRepository;

public interface LuckyRepository extends CrudRepository<LuckyModel, String> {
}
