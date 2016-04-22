package com.airwalker.redis.springdata;

import com.airwalker.redis.springdata.dao.OrderDao;
import org.junit.Test;

public class OrderDaoTest extends BaseTest {

	@Test
	public void orderDaoTest() {
		OrderDao orderDao = applicationContext.getBean(OrderDao.class);
		orderDao.save(order);
		System.out.println(orderDao.read("10000").getCreateDate());
		orderDao.delete("10000");
		System.out.println(orderDao.read("10000"));
	}
}
