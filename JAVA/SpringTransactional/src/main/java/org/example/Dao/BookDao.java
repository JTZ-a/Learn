package org.example.Dao;

/**
 * &#064;project: SpringTransactional
 * &#064;ClassName: BookDao
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 22:36
 * &#064;Description:
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}