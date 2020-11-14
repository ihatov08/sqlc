// Code generated by sqlc. DO NOT EDIT.

package com.example.booktest.postgresql

import java.sql.Connection
import java.sql.SQLException
import java.sql.Statement
import java.sql.Types
import java.time.OffsetDateTime

interface Queries {
  @Throws(SQLException::class)
  fun booksByTags(dollar1: List<String>): List<BooksByTagsRow>
  
  @Throws(SQLException::class)
  fun booksByTitleYear(title: String, year: Int): List<Book>
  
  @Throws(SQLException::class)
  fun createAuthor(name: String): Author?
  
  @Throws(SQLException::class)
  fun createBook(
      authorId: Int,
      isbn: String,
      bookType: BookType,
      title: String,
      year: Int,
      available: OffsetDateTime,
      tags: List<String>): Book?
  
  @Throws(SQLException::class)
  fun deleteBook(bookId: Int)
  
  @Throws(SQLException::class)
  fun getAuthor(authorId: Int): Author?
  
  @Throws(SQLException::class)
  fun getBook(bookId: Int): Book?
  
  @Throws(SQLException::class)
  fun updateBook(
      title: String,
      tags: List<String>,
      bookId: Int)
  
  @Throws(SQLException::class)
  fun updateBookISBN(
      title: String,
      tags: List<String>,
      isbn: String,
      bookId: Int)
  
}

