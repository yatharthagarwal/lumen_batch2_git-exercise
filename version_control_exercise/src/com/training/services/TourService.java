package com.training.services;

import com.training.model.Tour;

public class TourService {

	public int addTour(Tour tour) {
		
		int statusCode = 0;
		if(tour != null) {
			statusCode = 1;
		}
		return statusCode;
	}
	
	public int updateTour(Tour tour) {
		return 1;
	}
}
