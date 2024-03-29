package com.soft1841.book.dao;

import cn.hutool.db.Entity;
import com.soft1841.book.entity.Type;

import java.sql.SQLException;
import java.util.List;

/**
 * 图书类别DAO接口
 */
public interface TypeDAO {

    /**
     * 新增图书类别, 返回自增主键(Long)
     * @param type
     * @return
     */
    Long insertType(Type type) throws SQLException;

    /**
     * 根据id删除类别
     * @param id
     * @return
     */
    int deleteTypeById(long id) throws SQLException;

    /**
     * 查询所有类别
     * @return
     */
    List<Entity> selectAllTypes() throws SQLException;

    /**
     * 根据id查询类别信息
     * @param id
     * @return
     */
    Entity getTypeById(int id) throws SQLException;
}

