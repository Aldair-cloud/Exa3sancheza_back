package pe.edu.upeu.exasancheza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.exasancheza.entity.Hotel;
import pe.edu.upeu.exasancheza.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	private HotelService hotelservice;
	@GetMapping("/")
	public List<Hotel> readAll(){
		return hotelservice.readAll();
	}
}	
