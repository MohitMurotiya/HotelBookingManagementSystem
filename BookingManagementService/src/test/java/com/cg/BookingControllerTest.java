package com.cg;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cg.dao.BookingRepository;
import com.cg.model.Booking;
import com.cg.util.BookingController;

@RunWith(SpringRunner.class)
public class BookingControllerTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks
	BookingController controller;
	
	@Mock
	BookingRepository repository;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void getAllBookings() throws Exception{
	}
}
