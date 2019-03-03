package com.cbu.CBU_TEST.trafficLight.bean;

import com.cbu.CBU_TEST.trafficLight.common.LampCommon;
import com.cbu.CBU_TEST.trafficLight.service.Observer;

public class Car implements Observer {
	
	private String carNum;//车辆编号
	
	private Boolean isPassLine;//是否过线
	
	private Lamp lamp = new Lamp();

	@Override
	public void update(Lamp lamp) {
		this.lamp = lamp;
		action();
	}
	
	//动作
	public void action(){
		StringBuffer message = new StringBuffer();
		String lampType = this.lamp.getLampType();//类型
		
		//有导向红绿灯
		if(LampCommon.CHANGE.equals(lampType)){
			TrafficLightForChangeInfo trafficLightInfo = new TrafficLightForChangeInfo("");
			if(this.lamp instanceof TrafficLightForChangeInfo ){
				trafficLightInfo = (TrafficLightForChangeInfo) this.lamp;
			}
			//直行
			if(trafficLightInfo.getGoStraight().equals(LampCommon.RED)){
				message.append("直行红灯！禁止直行;");
			}else if(trafficLightInfo.getGoStraight().equals(LampCommon.GREEN)){
				message.append("直行绿灯！可以直行;");
			}else if(trafficLightInfo.getGoStraight().equals(LampCommon.YELLOW) && this.isPassLine){
				message.append("直行黄灯！已过线，可以直行;");
			}else if(trafficLightInfo.getGoStraight().equals(LampCommon.YELLOW) && !this.isPassLine){
				message.append("直行黄灯！未过线，禁止直行;");
			}
			//左转
			if(trafficLightInfo.getLeftChange().equals(LampCommon.RED)){
				message.append("左转红灯！禁止左转;");
			}else if(trafficLightInfo.getLeftChange().equals(LampCommon.GREEN)){
				message.append("左转绿灯！可以左转;");
			}else if(trafficLightInfo.getLeftChange().equals(LampCommon.YELLOW) && this.isPassLine){
				message.append("左转黄灯！已过线，可以左转;");
			}else if(trafficLightInfo.getLeftChange().equals(LampCommon.YELLOW) && !this.isPassLine){
				message.append("左转黄灯！未过线，禁止左转;");
			}
			//右转
			if(trafficLightInfo.getRightChange().equals(LampCommon.RED)){
				message.append("右转红灯！禁止右转;");
			}else if(trafficLightInfo.getRightChange().equals(LampCommon.GREEN)){
				message.append("右转绿灯！可以右转;");
			}else if(trafficLightInfo.getRightChange().equals(LampCommon.YELLOW) && this.isPassLine){
				message.append("右转黄灯！已过线，可以右转;");
			}else if(trafficLightInfo.getRightChange().equals(LampCommon.YELLOW) && !this.isPassLine){
				message.append("右转黄灯！未过线，禁止右转;");
			}
			//掉头
			if(trafficLightInfo.getTrunRound().equals(LampCommon.RED)){
				message.append("掉头红灯！禁止掉头;");
			}else if(trafficLightInfo.getTrunRound().equals(LampCommon.GREEN)){
				message.append("掉头绿灯！可以掉头;");
			}else if(trafficLightInfo.getTrunRound().equals(LampCommon.YELLOW) && this.isPassLine){
				message.append("掉头黄灯！已过线，可以掉头;");
			}else if(trafficLightInfo.getTrunRound().equals(LampCommon.YELLOW) && !this.isPassLine){
				message.append("掉头黄灯！未过线，禁止掉头;");
			}
		}else if(LampCommon.NOT_CHANGE.equals(lampType)){//无导向红绿灯
			TrafficLightInfo trafficLightInfo = new TrafficLightInfo("");
			if(this.lamp instanceof TrafficLightInfo ){
				trafficLightInfo = (TrafficLightInfo) this.lamp;
			}
			
			if(trafficLightInfo.getLampColor().equals(LampCommon.RED)){
				message.append("红灯！禁止直行，可以右转;");
			}else if(trafficLightInfo.getLampColor().equals(LampCommon.GREEN)){
				message.append("绿灯！可以通行;");
			}else if(trafficLightInfo.getLampColor().equals(LampCommon.YELLOW) && this.isPassLine){
				message.append("黄灯！已过线，可以通行;");
			}else if(trafficLightInfo.getLampColor().equals(LampCommon.YELLOW) && !this.isPassLine){
				message.append("黄灯！未过线，禁止通行;");
			}
		}
		System.out.println(this.getCarNum() +":"+ message.toString());
	}
	

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public Boolean getIsPassLine() {
		return isPassLine;
	}

	public void setIsPassLine(Boolean isPassLine) {
		this.isPassLine = isPassLine;
	}

}
