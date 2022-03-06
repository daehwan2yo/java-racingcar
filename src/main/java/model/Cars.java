package model;

import java.util.List;

public interface Cars {
	void save(Car car);
	
	int size();
	
	List<Car> getAll();
}
