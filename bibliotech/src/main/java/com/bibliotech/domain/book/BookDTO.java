package com.bibliotech.domain.book;

import java.util.UUID;

public record BookDTO(
        Long BookId,
    String title,
    String author,
    String coverImage,
    String ISBN,
    Genre category,
    Integer quantityInStock
) {}
