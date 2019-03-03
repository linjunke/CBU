package com.cbu.CBU_TEST.trafficLight.bean;

import java.util.ArrayList;
import java.util.List;

import com.cbu.CBU_TEST.trafficLight.service.Observer;
import com.cbu.CBU_TEST.trafficLight.service.Observerable;

/**
 * 无导向红绿灯信号
 * @author ljke
 *
 */
public class TrafficLight implements Observerable {
	
	private List<Observer> list;
    private Lamp lamp;
    
    public TrafficLight() {
    	list = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if(!list.isEmpty())
            list.remove(o);
	}

	@Override
	public void notifyObserver() {
		 for(int i = 0; i < list.size(); i++) {
	            Observer oserver = list.get(i);
	            oserver.update(lamp);
	        }
	}
	
	public void lampChange(Lamp lamp) {
		this.lamp = lamp;
        //消息更新，通知所有观察者
        notifyObserver();
    }

}
