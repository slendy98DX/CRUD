package co.develhope.CRUD.repositories;

import co.develhope.CRUD.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,String> {
}
