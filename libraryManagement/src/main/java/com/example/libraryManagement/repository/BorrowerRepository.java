package com.example.libraryManagement.repository;

import com.example.libraryManagement.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {

}
