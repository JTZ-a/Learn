package org.example.controller;

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * &#064;project: SpringTransactional
 * &#064;ClassName: BookControllerTest
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 22:39
 * &#064;Description:
 */
class BookControllerTest {
    private AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Main.class);
    @Test
    void buyBook() {
        BookController bean = annotationConfigApplicationContext.getBean( BookController.class);
        bean.buyBook(1,1);
    }
}