package com.cbu.CBU_TEST.trafficLight.bean;

import com.cbu.CBU_TEST.trafficLight.common.LampCommon;

public class TrafficLightInfo extends Lamp {
	
	private String lampNum;//编号
	
	public TrafficLightInfo(String num){
		this.lampNum = num;
		super.setLampType(LampCommon.NOT_CHANGE);
	}
	
	private String lampColor;//灯颜色
	
	public String getLampColor() {
		return lampColor;
	}

	public void setLampColor(String lampColor) {
		this.lampColor = lampColor;
	}
	public String getLampNum() {
		return lampNum;
	}

	public void setLampNum(String lampNum) {
		this.lampNum = lampNum;
	}
}
