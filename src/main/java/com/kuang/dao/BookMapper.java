package com.kuang.dao;

import com.kuang.pojo.Books;

import java.util.List;

/**
 * @Description com.kuang.dao
 * @Version 1.0.0
 * @Date 2022/6/29 12:08
 * @Created by yzc
 */
public interface BookMapper {

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
