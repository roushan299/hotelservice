package com.roushan.hotelservice.service;

import com.roushan.hotelservice.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel getHotelById(String hotelId);
}
