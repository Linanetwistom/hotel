package cn.xueden.hotel.domain;

import cn.xueden.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="hotel_room_type")
@org.hibernate.annotations.Table(appliesTo = "hotel_room_type",comment = "房间类型信息表")
public class HotelRoomType extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;


    @Column(name="name",nullable = false)
    private String name;

    @Column(name="type_sort",nullable = false)
    private Integer typeSort;



}
