package org.example.Service.impl;

import org.example.Dao.BookDao;
import org.example.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * &#064;project: SpringTransactional
 * &#064;ClassName: BookServiceImpl
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 22:38
 * &#064;Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    // @Transactional()	标记事务,这里我并没有写
    public void buyBook(Integer bookId, Integer userId) {
        // 查询图书馆价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书馆库存
        bookDao.updateStock(bookId);
        // 更新账户余额
        bookDao.updateBalance(userId, price);
    }
}
