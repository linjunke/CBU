package com.cbu.CBU_TEST.trafficLight.service;


//观察者接口
public interface Observerable {
	
	//添加被观察者
	public void registerObserver(Observer o);
	
	//移除被观察者
    public void removeObserver(Observer o)	;
    
    //通知被观察者
    public void notifyObserver();
	
}
