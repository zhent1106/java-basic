package com.soft1841.week3;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * BookDAO接口的实现类，使用hutool的封装工具，来实现CRUD操作
 * @author moqi
 */
public class BookDAOImpl implements BookDAO {

    @Override
    public int insert(Book book) throws SQLException {
        return Db.use().insert(
                Entity.create("t_book1")   //注意表名不要写错
                        .set("name", book.getName())  //给必填字段传值
                        .set("price", book.getPrice())
                        .set("cover",book.getCover())
                        .set("author",book.getAuthor())
        );
    }

    @Override
    public int delete(int id) throws SQLException {
        return Db.use().del(
                Entity.create("t_book1").set("id", id) //删除的where条件，此处根据id删除
        );
    }

    @Override
    public int update(Book book) throws SQLException {
        return Db.use().update(
                Entity.create().set("price", book.getPrice()), //修改的数据
                Entity.create("t_book1").set("id", book.getId()) //where条件
        );
    }

    @Override
    public List<Entity> getAllBooks() throws SQLException {
        return Db.use().findAll("t_book1"); //查询t_book表所有数据
    }

    @Override
    public Entity get(int id) throws SQLException {
        return Db.use().findAll(Entity.create("t_book1").set("id", id)).get(0);
    }
}

