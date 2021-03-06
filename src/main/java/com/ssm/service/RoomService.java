package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Room;

/**
 * 
 * @author Luxus_C
 * @version $Id: IRoomService.java, v 0.1 2017年10月20日 下午8:46:50 Luxus_C Exp $
 */
public interface RoomService {

    /**
     * 查询房间状态
     * @return
     */
    public List<Room> getRoomStates();

    /**
     * 减少房间数量
     * @param bookNum
     * @param type
     * @return
     */
    public int reduceRoomNum(int bookNum, String type);

    /**
     * 增加房间数量
     * @param bookNum
     * @param type
     * @return
     */
    public int addRoomNum(int bookNum, String type);

    /**
     * 根据类型查询房间价格
     * @param type
     * @return
     */
    public double getPrice(String type);
}