package com.ufa.mall;

import com.ufa.mall.dao.TrackingDao;
import com.ufa.mall.entity.Tracking;
import com.ufa.mall.mapper.TrackingMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MallApplicationTests {

	@Autowired
	private TrackingMapper trackingMapper;

	@Test
	public void testTracking(){
		Tracking tracking = trackingMapper.queryById(173);
		System.out.println("------------"+tracking.getDescription());
	}


}
