package com.github.thiagohbn.citiesapi.states.repository;

import com.github.thiagohbn.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository <State, Long> {

}
