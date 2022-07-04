package com.kuang.service;

import com.kuang.pojo.Books;

import java.util.List;

/**
 * @Description com.kuang.service
 * @Version 1.0.0
 * @Date 2022/6/29 13:33
 * @Created by yzc
 */
public interface BookService {

    //增加一个Book
    int addBook(Books books);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}
