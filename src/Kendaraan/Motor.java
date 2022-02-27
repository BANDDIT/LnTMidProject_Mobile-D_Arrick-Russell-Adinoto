package Kendaraan;

public class Motor extends Kendaraan{

	public String brand;
	public String name;
	public String license_plate;
	public String type_motor;
	public int gas_cap;
	public int wheel;
	public int top_speed;
	public int jumlah_helm;

	
	public Motor(String name_kendaraan,String type_kendaraan,String brand,String name, String license_plate,String type_motor,int gas_cap,int wheel,int top_speed,int jumlah_helm) {
		this.name_kendaraan=name_kendaraan;
		this.brand=brand;
		this.name=name;
		this.license_plate=license_plate;
		this.type_motor=type_motor;
		this.gas_cap=gas_cap;
		this.wheel=wheel;
		this.top_speed=top_speed;
		this.jumlah_helm=jumlah_helm;
	}
	
	
	
	public void print() {
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("License Plate: "+license_plate);
		System.out.println("Type: "+type_motor);
		System.out.println("Gas Capacity: "+gas_cap);
		System.out.println("Top Speed: "+top_speed);
		System.out.println("Wheel(s): "+wheel);
		System.out.println("Helm: "+jumlah_helm);
	}

	
}
