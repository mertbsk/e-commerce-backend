package mertbsk.springbootecommerce.dao;

import mertbsk.springbootecommerce.entities.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {

	Page<Order> findByCustomerEmail(@Param("email") String email, Pageable pageable);
	Page<Order> findByCustomerEmailOrderByDateCreatedDesc(@Param("email")String email, Pageable pageable);
}