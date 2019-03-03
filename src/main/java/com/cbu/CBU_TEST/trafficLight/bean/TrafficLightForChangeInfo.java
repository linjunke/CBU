package com.cbu.CBU_TEST.trafficLight.bean;

import com.cbu.CBU_TEST.trafficLight.common.LampCommon;

/**
 * 导向红绿灯信号
 * @author ljke
 *
 */
public class TrafficLightForChangeInfo extends Lamp {

	private String lampNum;//编号
	
	private String leftChange;//左转
	
	private String rightChange;//右转
	
	private String goStraight;//直行
	
	private String trunRound;//掉头
	
	public TrafficLightForChangeInfo(String num){
		this.lampNum = num;
		super.setLampType(LampCommon.CHANGE);
	}
	
	public String getLeftChange() {
		return leftChange;
	}
	public void setLeftChange(String leftChange) {
		this.leftChange = leftChange;
	}
	public String getRightChange() {
		return rightChange;
	}
	public void setRightChange(String rightChange) {
		this.rightChange = rightChange;
	}
	public String getGoStraight() {
		return goStraight;
	}
	public void setGoStraight(String goStraight) {
		this.goStraight = goStraight;
	}
	public String getTrunRound() {
		return trunRound;
	}
	public void setTrunRound(String trunRound) {
		this.trunRound = trunRound;
	}

	public String getLampNum() {
		return lampNum;
	}

	public void setLampNum(String lampNum) {
		this.lampNum = lampNum;
	}

}
