package cn.xueden.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import cn.xueden.hotel.domain.HotelRoomType;

public interface HotelRoomTypeRepository extends JpaRepository<HotelRoomType,Long>,JpaSpecificationExecutor<HotelRoomType>{
}
