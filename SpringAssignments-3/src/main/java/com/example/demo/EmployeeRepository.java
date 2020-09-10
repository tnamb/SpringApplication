package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {}

/*
 * This interface extends Spring Data JPA’s JpaRepository, specifying the domain
 * type as Employee and the id type as Long. This interface, though empty on the
 * surface, packs a punch given it supports:
 * 
 * Creating new instances
 * 
 * Updating existing ones
 * 
 * Deleting
 * 
 * Finding (one, all, by simple or complex properties)
 */

