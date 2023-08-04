package org.example.controller;

import org.example.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * &#064;project: SpringTransactional
 * &#064;ClassName: BookController
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 22:35
 * &#064;Description:
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void buyBook(Integer bookId, Integer userId){
        bookService.buyBook(bookId, userId);
    }

}