package com.liujian.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test//月初
	public void testGetDateByInitMonth() {
		Calendar instance = Calendar.getInstance();
		instance.set(2019, 2, 11, 12, 12,28);
		Date dateByInitMonth = DateUtil.getDateByInitMonth(instance.getTime());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(dateByInitMonth));
	}
	
	@Test
	public void testGetDateByFullMonth() {
		Calendar instance = Calendar.getInstance();
		instance.set(2012, 2, 2, 22, 21, 23);
		Date date = DateUtil.getDateByFullMonth(instance.getTime());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));
	}

	/**
	 * 拼接下面根据时间范围查询订单的SQL：
		String sql = "select * from t_order where create_time>='{1}'
		 and create_time<='{2}' ";
		将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
		将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。
	 * @Title: testSQl 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testSQl() {
		
		//月初
		Date dateByInitMonth = DateUtil.getDateByInitMonth(new Date());
		
		//月末
		Date dateByFullMonth = DateUtil.getDateByFullMonth(new Date());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String sql ="select * from t_order where create_time>='{1}' and create_time<='{2}'";
		
		String replace = sql.replace("{1}", simpleDateFormat.format(dateByInitMonth)).replace("{2}", simpleDateFormat.format(dateByFullMonth));
		
		System.out.println(replace);
	}
		
}
