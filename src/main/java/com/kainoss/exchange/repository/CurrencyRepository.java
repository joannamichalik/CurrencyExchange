package com.kainoss.exchange.repository;

import com.kainoss.exchange.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    Optional<Currency> findById(Long id);


}
