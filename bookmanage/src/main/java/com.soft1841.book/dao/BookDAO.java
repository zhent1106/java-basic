package com.soft1841.book.dao;

import cn.hutool.db.Entity;
import com.soft1841.book.entity.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * 图书DAO
 */
public interface BookDAO {

    /**
     * 新增图书，返回自增主键
     *
     * @param book
     * @return
     * @throws SQLException
     */
    Long insertBook(Book book) throws SQLException;

    /**
     * 根据id删除图书
     *
     * @param id
     * @return
     */
    int deleteBookById(long id) throws SQLException;

    /**
     * 更新图书信息
     *
     * @param book
     * @return
     */
    int updateBook(Book book) throws SQLException;


    /**
     * 查询所有图书
     *
     * @return
     */
    List<Entity> selectAllBooks() throws SQLException;


    /**
     * 根据id查询图书信息
     *
     * @param id
     * @return
     */
    Entity getBookById(long id) throws SQLException;

    /**
     * 根据书名关键词模糊查询图书
     * @param keywords
     * @return
     * @throws SQLException
     */
    List<Entity> selectBooksLike(String keywords) throws SQLException;

    /**
     * 根据图书类别查询图书
     * @param typeId
     * @return
     * @throws SQLException
     */
    List<Entity> selectBooksByTypeId(long typeId) throws SQLException;

    /**
     * 根据图书类别统计图书数量
     * @param typeId
     * @return
     * @throws SQLException
     */
    int countByType(long typeId) throws SQLException;
}




