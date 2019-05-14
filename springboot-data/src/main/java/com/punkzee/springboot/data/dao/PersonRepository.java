package com.punkzee.springboot.data.dao;

import com.punkzee.springboot.data.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource(path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByAddress(String address);

    Person findByNameAndAddress(String name, String address);

//    @Query("select p from Person p where p.name = :name and p.address = :address")
//    Person withNameAndAddressQuery(@Param("name") String name, @Param("address") String address);

//    Person withNameAndAddressNamedQuery(String name, String address);
}
