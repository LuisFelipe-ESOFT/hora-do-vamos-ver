package com.kamp.milagre.repositories;

import com.kamp.milagre.models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilagreRepository extends JpaRepository<MilagreModel, Long> {
}
