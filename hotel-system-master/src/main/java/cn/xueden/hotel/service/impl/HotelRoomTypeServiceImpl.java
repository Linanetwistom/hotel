package cn.xueden.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xueden.hotel.repository.HotelRoomTypeRepository;
import cn.xueden.hotel.service.HotelRoomTypeService;


@Service
@Transactional(readOnly=true)
public class HotelRoomTypeServiceImpl implements HotelRoomTypeService {
     
    @Autowired
    private HotelRoomTypeRepository hotelRoomTypeRepository;



    
}
