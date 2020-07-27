package pe.edu.upeu.exasancheza.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upeu.exasancheza.dao.HotelDao;
import pe.edu.upeu.exasancheza.entity.Hotel;

public class HotelDaoImp implements HotelDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Hotel> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM cliente", 
		BeanPropertyRowMapper.newInstance(Hotel.class));
	}
	
}
