package com.capgemini.escuelitadecarlos.interfac;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.escuelitadecarlos.model.Choripan;

public interface ChoriRepository extends CrudRepository <Choripan, Long> {

}
