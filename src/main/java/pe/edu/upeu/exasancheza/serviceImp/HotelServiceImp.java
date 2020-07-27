package pe.edu.upeu.exasancheza.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exasancheza.dao.HotelDao;
import pe.edu.upeu.exasancheza.entity.Hotel;
import pe.edu.upeu.exasancheza.service.HotelService;

@Service
public class HotelServiceImp implements HotelService{
	@Autowired
	private HotelDao hotelDao;
	@Override
	public List<Hotel> readAll() {
		// TODO Auto-generated method stub
		return hotelDao.readAll();
	}
	
}
