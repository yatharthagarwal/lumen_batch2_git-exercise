package com.training.services;

import com.training.model.Tour;

public class TourService {

	public int addTour(Tour tour) {
		
		int status = 0;
		if(tour != null) {
			status = 1;
		}
		return status;
	}
}
