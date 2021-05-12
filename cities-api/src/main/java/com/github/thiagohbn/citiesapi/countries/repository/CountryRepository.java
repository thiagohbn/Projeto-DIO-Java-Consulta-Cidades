package com.github.thiagohbn.citiesapi.countries.repository;

import com.github.thiagohbn.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
