package com.cbu.CBU_TEST.trafficLight.main;

import com.cbu.CBU_TEST.trafficLight.bean.Car;
import com.cbu.CBU_TEST.trafficLight.bean.TrafficLight;
import com.cbu.CBU_TEST.trafficLight.bean.TrafficLightForChangeInfo;
import com.cbu.CBU_TEST.trafficLight.bean.TrafficLightInfo;
import com.cbu.CBU_TEST.trafficLight.common.LampCommon;

public class Test {
	
	public static void main(String[] args) {
		//001，已经过线
		Car car1 = new Car();
		car1.setCarNum("001");
		car1.setIsPassLine(true);
		
		//002，未过线
		Car car2 = new Car();
		car2.setCarNum("002");
		car2.setIsPassLine(false);
		
		//红绿灯
		TrafficLight trafficLight = new TrafficLight();
		trafficLight.registerObserver(car1);
		trafficLight.registerObserver(car2);
		
		System.out.println("*********************无导向红绿灯L001***********************");
		//无导向红绿灯
		TrafficLightInfo trafficLightInfo = new TrafficLightInfo("L001");
		trafficLightInfo.setLampColor(LampCommon.YELLOW);//信号灯颜色颜色
		
		//设置红绿灯状态
		trafficLight.lampChange(trafficLightInfo);
		
		System.out.println("*******************有导向红绿灯L002*************************");
		//向红绿灯
		TrafficLightForChangeInfo trafficLightForChangeInfo = new TrafficLightForChangeInfo("L002");
		trafficLightForChangeInfo.setLeftChange(LampCommon.GREEN);
		trafficLightForChangeInfo.setRightChange(LampCommon.RED);
		trafficLightForChangeInfo.setGoStraight(LampCommon.GREEN);
		trafficLightForChangeInfo.setTrunRound(LampCommon.YELLOW);
		
		//设置红绿灯状态
		trafficLight.lampChange(trafficLightForChangeInfo);
		
	}

}
