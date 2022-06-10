package app.repository;

import app.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HaircutRepo extends JpaRepository<Haircut, Long> {}