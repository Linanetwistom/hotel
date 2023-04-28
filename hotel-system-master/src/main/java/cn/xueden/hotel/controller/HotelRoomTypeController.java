package cn.xueden.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xueden.hotel.service.HotelRoomTypeService;

@RestController
@RequestMapping("roomType")
public class HotelRoomTypeController {

    @Autowired
    private HotelRoomTypeService hotelRoomTypeService;

    public HotelRoomTypeController(HotelRoomTypeService hotelRoomTypeService){
        this.hotelRoomTypeService=hotelRoomTypeService;

    }


}
