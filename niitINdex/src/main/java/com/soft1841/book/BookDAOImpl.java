package com.soft1841.book;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    @Override
    public List<Entity> getAllBooks ()throws SQLException {
        return Db.use().findAll("t_book");
    }

    @Override
    public int insert (Book book) throws SQLException {
        return Db.use().insert(
                Entity.create("t_book")
                .set("name",book.getName())
                .set("price",book.getPrice())
        );
    }

    @Override
    public int delete (int id) throws SQLException {
        return Db.use().del(
                Entity.create("t_book").set("id",id));
    }

    @Override
    public int update (Book book) throws SQLException {
        return Db.use().update(
                Entity.create().set("price",book.getPrice()),
                Entity.create("t_book").set("id",book.getId())
        );
    }
}
