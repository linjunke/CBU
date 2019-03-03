package com.cbu.CBU_TEST.trafficLight.service;

import com.cbu.CBU_TEST.trafficLight.bean.Lamp;

//被观察者接口
public interface Observer {

	//动作
	public void update(Lamp lamp);
	
}
