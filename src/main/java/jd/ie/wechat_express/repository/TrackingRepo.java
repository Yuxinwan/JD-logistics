package jd.ie.wechat_express.repository;


import jd.ie.wechat_express.domain.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingRepo extends JpaRepository<Tracking, Long> {

}
