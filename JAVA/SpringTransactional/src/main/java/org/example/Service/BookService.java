package org.example.Service;

/**
 * &#064;project: SpringTransactional
 * &#064;ClassName: BookService
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 22:38
 * &#064;Description:
 */
public interface BookService {
    void buyBook(Integer bookId, Integer userId);
}