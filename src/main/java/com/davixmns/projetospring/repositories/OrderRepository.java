package com.davixmns.projetospring.repositories;

import com.davixmns.projetospring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
