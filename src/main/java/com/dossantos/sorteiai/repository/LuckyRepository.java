package com.dossantos.sorteiai.repository;

import com.dossantos.sorteiai.model.LuckyModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LuckyRepository extends JpaRepository<LuckyModel, Integer> {
    List<LuckyModel> findAllByEmail(String email);
}
