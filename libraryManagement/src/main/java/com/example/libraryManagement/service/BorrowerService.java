package com.example.libraryManagement.service;

import com.example.libraryManagement.model.Book;
import com.example.libraryManagement.model.Borrower;
import com.example.libraryManagement.repository.BookRepository;
import com.example.libraryManagement.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerService {

        @Autowired
        private BorrowerRepository borrowerRepository;

        @Autowired
        private BookRepository bookRepository;

        public Borrower addBorrower(Borrower borrower) {
            return borrowerRepository.save(borrower);
        }

        public List<Borrower> getAllBorrowers() {
            return borrowerRepository.findAll();
        }

        public Borrower getBorrowerById(Long id) {
            return borrowerRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Borrower not found"));
        }

        public Borrower updateBorrower(Long id, Borrower updatedBorrower) {
            Borrower borrower = getBorrowerById(id);
            borrower.setName(updatedBorrower.getName());
            borrower.setEmail(updatedBorrower.getEmail());
            return borrowerRepository.save(borrower);
        }

        public void deleteBorrower(Long id) {
            borrowerRepository.deleteById(id);
        }

        public String borrowBook(Long borrowerId, Long bookId) {
            Borrower borrower = getBorrowerById(borrowerId);
            Book book = bookRepository.findById(bookId)
                    .orElseThrow(() -> new RuntimeException("Book not found"));

            if (!book.getIsAvailable()) {
                throw new RuntimeException("Book is not available");
            }

            book.setIsAvailable(false);
            borrower.getBorrowedBooks().add(book);
            bookRepository.save(book);
            borrowerRepository.save(borrower);

            return "Book borrowed successfully";
        }

        public String returnBook(Long borrowerId, Long bookId) {
            Borrower borrower = getBorrowerById(borrowerId);
            Book book = bookRepository.findById(bookId)
                    .orElseThrow(() -> new RuntimeException("Book not found"));

            if (!borrower.getBorrowedBooks().contains(book)) {
                throw new RuntimeException("Book not borrowed by this borrower");
            }

            book.setIsAvailable(true);
            borrower.getBorrowedBooks().remove(book);
            bookRepository.save(book);
            borrowerRepository.save(borrower);

            return "Book returned successfully";
        }
    }

