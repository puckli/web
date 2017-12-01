package com.puck.web.jdk.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 批量生成sql
 */
public class GenBatchSQL {
	public static void main(String[] args) {
		createLikeByMonth();
	}
	
	public static void createLike(){
		String sql1 = "create table pick_order_";
		String sql2 = "00 like pick_order;";
		
		for(int i = 0; i < 100; i++){
			System.out.println(sql1 + (i<10 ? "0" + i : i) + sql2);
		}
	}
	
	public static void alterTable(){
		String sql1 = "ALTER TABLE `sms_history_";
		String sql2 = "CHANGE COLUMN `content` `content` VARCHAR(1000) NULL DEFAULT NULL COMMENT '内容'";
		for(int i = 0; i < 100; i++){
			System.out.println(sql1 + (i<10 ? "0" + i : i) + sql2);
		}
	}
	
	public static void createLikeByMonth(){
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		start.set(2016, 9, 1);
		end.set(2017, 12, 1);
		String sql1 = "create table pick_order_";
		String sql2 = " like pick_order;";
		DateFormat fo = new SimpleDateFormat("yyyyMM");
		while(start.before(end)){
			System.out.println(sql1 + fo.format(start.getTime()) + sql2);
			start.add(Calendar.MONTH, 1);
		}
	}
}
