package jd.ie.wechat_express.repository;

import jd.ie.wechat_express.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{


}
