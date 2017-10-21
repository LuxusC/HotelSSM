package com.ssm.pojo;

/**
 * 
 * @author Luxus_C
 * @version $Id: Room.java, v 0.1 2017年10月20日 下午8:47:25 Luxus_C Exp $
 */
public class Room {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.type
     *
     * @mbggenerated
     */
    private String  type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.left_num
     *
     * @mbggenerated
     */
    private Integer leftNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.price
     *
     * @mbggenerated
     */
    private Double  price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.id
     *
     * @return the value of room.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.id
     *
     * @param id the value for room.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.type
     *
     * @return the value of room.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.type
     *
     * @param type the value for room.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.left_num
     *
     * @return the value of room.left_num
     *
     * @mbggenerated
     */
    public Integer getLeftNum() {
        return leftNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.left_num
     *
     * @param leftNum the value for room.left_num
     *
     * @mbggenerated
     */
    public void setLeftNum(Integer leftNum) {
        this.leftNum = leftNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.price
     *
     * @return the value of room.price
     *
     * @mbggenerated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.price
     *
     * @param price the value for room.price
     *
     * @mbggenerated
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}