package seminar4.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testBookServiceWithMockRepository() {
        // Создаем мок UserRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Создаем объект UserService, передавая мок UserRepository
        BookService bookService = new BookService(bookRepository);

        // Задаем ожидаемый результат
        String bookId = "1";
        String expectedBookTitle = "Fathers and children"; // Предположим, что у пользователя с ID 1 такое имя
        String expectedBookAuthor = "Turgenev"; // Предположим, что у пользователя с ID 1 такое имя

        // Устанавливаем ожидание вызова метода findById с bookId и возвращаем ожидаемый объект Book
        when(bookRepository.findById(bookId)).thenReturn(new Book(bookId, expectedBookTitle,expectedBookAuthor));

        // Вызываем метод getUserUsernameById и проверяем, что результат соответствует ожиданиям
        String bookTitle = bookService.findBookById(bookId).getTitle();
        assertEquals(expectedBookTitle, bookTitle);

        String bookAuthor = bookService.findBookById(bookId).getAuthor();
        assertEquals(expectedBookAuthor, bookAuthor);



        // Проверяем, что метод getUserById был вызван ровно один раз с правильными аргументами
        verify(bookRepository, times(2)).findById(bookId);
    }

}
