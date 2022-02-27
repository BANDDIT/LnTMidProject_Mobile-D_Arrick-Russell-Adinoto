package Kendaraan;

public class Mobil extends Kendaraan{
	
	public String brand;
	public String name;
	public String license_plate;
	public String type_mobil;
	public int gas_cap;
	public int wheel;
	public int top_speed;
	public int entertainment_system;
	/*
	public void print() {
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("License Plate: "+license_plate);
		System.out.println("Type: "+type_mobil);
		System.out.println("Gas Capacity: "+gas_cap);
		System.out.println("Top Speed: "+top_speed);
		System.out.println("Wheel(s): "+wheel);
		System.out.println("Entertainment System: "+entertainment_system);
	}
	*/
	
	public Mobil(String name_kendaraan,String type_kendaraan,String brand,String name, String license_plate,String type_mobil, int gas_cap,int wheel,int top_speed,int entertainment_system) {
		this.name_kendaraan=name_kendaraan;
		this.brand=brand;
		this.name=name;
		this.license_plate=license_plate;
		this.type_mobil=type_mobil;
		this.gas_cap=gas_cap;
		this.wheel=wheel;
		this.top_speed=top_speed;
		this.entertainment_system=entertainment_system;
	}
	public void print() {
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("License Plate: "+license_plate);
		System.out.println("Type: "+type_mobil);
		System.out.println("Gas Capacity: "+gas_cap);
		System.out.println("Top Speed: "+top_speed);
		System.out.println("Wheel(s): "+wheel);
		System.out.println("Entertainment System: "+entertainment_system);
	
	}	
}