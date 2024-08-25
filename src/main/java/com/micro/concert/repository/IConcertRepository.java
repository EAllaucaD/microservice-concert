package com.micro.concert.repository;


import com.micro.concert.entities.Concert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IConcertRepository extends CrudRepository<Concert, Long> {

}
