package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Room;

/**
 * 
 * @author Luxus_C
 * @version $Id: RoomMapper.java, v 0.1 2017年10月20日 下午8:47:44 Luxus_C Exp $
 */
public interface RoomMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     * @param record
     * @return
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     * @param record
     * @return
     */
    int insertSelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     * @param id
     * @return
     */
    Room selectByPrimaryKey(Integer id);

    /**
     * 查询所有room
     * @return 返回room列表
     */
    List<Room> selectAll();

    /**
     * 根据类型查询房间价格
     * @param type
     * @return
     */
    double selectByType(String type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     * @param record
     * @return
     */
    int updateByPrimaryKey(Room record);

    /**
     * 减少房间数量
     * @param bookNum
     * @param type
     * @return
     */
    int reduceByPrimaryKey(int bookNum, String type);

    /**
     * 增加房间数量
     * @param bookNum
     * @param type
     * @return
     */
    int addByPrimaryKey(int bookNum, String type);
}