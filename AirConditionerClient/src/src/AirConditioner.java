package src;

import java.io.IOException;
import java.net.UnknownHostException;

import src.Interpreter;
import src.NetworkConnector;
import src.Registeration;

//import com.sun.java.swing.plaf.windows.resources.windows;

public class AirConditioner {
	private final String ip = "localhost";
	private final int portNumber = 5080;
	private final String deviceName = "Air Conditioner";
	private int id;
	private final String deviceNumber = "1111";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public static AirConditioner getAC() {
		return AC;
	}
	public static void setAC(AirConditioner aC) {
		AC = aC;
	}
	public String getIp() {
		return ip;
	}
	public int getPortNumber() {
		return portNumber;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public String getDeviceNumber() {
		return deviceNumber;
	}
	private boolean status = true;
	private static AirConditioner AC;

public static void main(String[] args){
	Registeration r = new Registeration();
	System.out.println(r.register());
	NetworkConnector n = new NetworkConnector();

	}
}
