package jd.ie.wechat_express.service;


import jd.ie.wechat_express.domain.Order;
import jd.ie.wechat_express.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    /**
     * 创建订单
     * @param order 订单信息
     * @return 创建的订单
     */
    public Order saveOrder(Order order){
        order.setStatus("pending");
        order.setTrackingNumber(generateTrackingNumber()); // 生成跟踪号
        return orderRepo.save(order);
    }


    /**
     * 获取所有订单
     * @return 订单列表
     */
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Optional<Order> getOrderById(Long orderId){
        return orderRepo.findById(orderId);
    }


    /**
     * 删除订单
     * @param orderId 订单ID
     */
    public void deleteOrder(Long orderId) {
        orderRepo.deleteById(orderId);
    }


    /**
     * 更新订单
     * @param orderId 订单ID
     * @param orderDetails 更新的订单信息
     * @return 更新后的订单
     */





    /**
     * 生成跟踪号
     * @return 跟踪号
     */

    private String generateTrackingNumber(){
        return "TRACK" + System.currentTimeMillis();
    }



}
