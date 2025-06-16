package com.bibliotech.domain.loan;

import com.bibliotech.domain.book.Book;
import com.bibliotech.domain.user.User;

import java.time.LocalDate;
import java.util.UUID;

public record loanDTO(
        UUID loanId,
        User user,
        Book book,
        LocalDate loanDate,
        LocalDate dueDate,
        LocalDate returnDate,
        LoanStatus status
        ) {}
