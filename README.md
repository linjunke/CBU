# CBU
运行： 
运行 /src/main/java/com/cbu/CBU_TEST/trafficLight/main/Test.java 文件中的main方法，进行模拟车辆过红绿灯的操作。

详解：
采用观察者模式开发
1、通过Car实体，代码中实例两个Car对象，设置车辆编码，车辆是否过线
2、实例化TrafficLight（红绿灯）对象，并向其注册车辆信息
3、通过TrafficLightInfo 与 TrafficLightForChangeInfo 对象可以创建无导向红绿灯的信号和有导向红绿灯的信号
4、通过trafficLight.lampChange（）方法可以设置红绿灯的信号，并通知车辆，车辆获得可以进行操作（通过控制台输出）