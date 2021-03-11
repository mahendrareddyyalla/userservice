package com.example.demo.fiegnclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.BookingDetailsDto;



@FeignClient(name="http://BOOKING-SERVICE/booking") //http://localhost:8084/booking/book/yalla
public interface FiegnClient {

	@GetMapping("/book/{username}")
	public ResponseEntity<?> getbookingbyusername(@PathVariable String username);
		
	/*
	 * @PostMapping("/book") public ResponseEntity<?> registeruser( @RequestBody
	 * BookingDetailsDto bookingDetailsDto);
	 */
}
