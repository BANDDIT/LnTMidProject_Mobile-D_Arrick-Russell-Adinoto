import java.util.*;
import Kendaraan.*;
import Extra.*;

public class Main {
	public static void main(String[] args) {
		Vector <Turunan> vec_kend=new Vector<>();
		Vector <Mobil> vec_mob= new Vector<>();
		Vector <Motor> vec_mot= new Vector<>();
		int pilihan=0,a=5;
		while(pilihan!=3) {
			System.out.println("-----------------------");
			System.out.println("|1.Input|2.View|3.Exit|");
			System.out.println("-----------------------");
			System.out.println("");
			System.out.print("Input: ");
			Scanner inputan =new Scanner(System.in);
			pilihan=inputan.nextInt();
			inputan.nextLine();
			
			String namaKendaraan;
			String Satu,Dua,Tiga,Tujuh;
			int Empat,Lima,Enam,Delapan;
			if(pilihan==1) {
				//INPUT JENIS KENDARAN
				System.out.print("Input type[Car | Motorcycle]: ");
				namaKendaraan=inputan.nextLine();

				if(namaKendaraan.equals("Car")) {
					
					//INPUT BRAND
					System.out.print("Input brand[>=5]: ");
					Satu=inputan.nextLine();
					while(Satu.length()<5) {
						System.out.print("Input brand[>=5]: ");
						Satu=inputan.nextLine();
					}
					
					//INPUT NAMA
					System.out.print("Input name[>=5]: ");
					Dua=inputan.nextLine();		
					while(Dua.length()<5) {
						System.out.print("Input name[>=5]: ");
						Dua=inputan.nextLine();						
					}
					
					//INPUT LICENSE
					int check,pos,count,akhir;
					check=1;
					pos=0;
					count=0;
					akhir=0;
					//akhir;
					System.out.print("Input license: ");
					Tiga=inputan.nextLine();
					for(int i=1;i<Tiga.length();i++){
						if(Tiga.charAt(i)!=' '&&Tiga.charAt(i-1)==' ') {
							pos=pos+1;
						}
					}
					if(pos!=2)check=0;
					if(Tiga.charAt(0)<'A'||Tiga.charAt(0)>'Z'||Tiga.charAt(1)!=' ')check=0;
					count=0;
					for(int i=Tiga.length()-1;i>=0;i--) {
						if(Tiga.charAt(i)==' ') {
							akhir=i-1;
							break;
						}
						else if(Tiga.charAt(i)<='Z'&&Tiga.charAt(i)>='A')count++;
						else {
							check=0;
							break;
						}
					}
					if(count>3||count<1)check=0;
					
					count=0;
					for(int i=2;i<=akhir;i++) {
						if(Tiga.charAt(i)>='0'&&Tiga.charAt(i)<='9') {
							count++;
						}
						else {
							check=0;
							break;
						}
					}
					if(count<1||count>4)check=0;
					while(check==0){//RECHECK
						check=1;
						pos=0;
						count=0;
						akhir=0;
						System.out.print("Input license: ");
						Tiga=inputan.nextLine();
						for(int i=1;i<Tiga.length();i++){
							if(Tiga.charAt(i)!=' '&&Tiga.charAt(i-1)==' ') {
								pos=pos+1;
							}
						}
						if(pos!=2)check=0;
						if(Tiga.charAt(0)<'A'||Tiga.charAt(0)>'Z'||Tiga.charAt(1)!=' ')check=0;
						count=0;
						for(int i=Tiga.length()-1;i>=0;i--) {
							if(Tiga.charAt(i)==' ') {
								akhir=i-1;
								break;
							}
							else if(Tiga.charAt(i)<='Z'&&Tiga.charAt(i)>='A')count++;
							else {
								check=0;
								break;
							}
						}
						if(count>3||count<1)check=0;
						
						count=0;
						for(int i=2;i<=akhir;i++) {
							if(Tiga.charAt(i)>='0'&&Tiga.charAt(i)<='9') {
								count++;
							}
							else {
								check=0;
								break;
							}
						}
						if(count<1||count>4)check=0;
					}
 
					//INPUT TOP SPEED
					System.out.print("Input top speed[100 <= topSpeed <= 250]: ");
					Empat=inputan.nextInt();
					inputan.nextLine();
					while(Empat<100||Empat>250) {
						System.out.print("Input top speed[100 <= topSpeed <= 250]: ");
						Empat=inputan.nextInt();
						inputan.nextLine();
					}

					//INPUT GAS CAPACITY
					System.out.print("Input gas capacity[30 <= gasCap <=60]: ");
					Lima=inputan.nextInt();
					inputan.nextLine();
					while(Lima<30||Lima>60) {
						System.out.print("Input gas capacity[30 <= gasCap <=60]: ");
						Lima=inputan.nextInt();
						inputan.nextLine();
					}

					//INPUT WHEEL
					System.out.print("Input wheel [4 <= wheel <= 6]: ");
					Enam=inputan.nextInt();
					inputan.nextLine();
					while(Enam<4||Enam>6) {
						System.out.print("Input wheel [4 <= wheel <= 6]: ");
						Enam=inputan.nextInt();
						inputan.nextLine();
					}

					//INPUT TYPE MOBIL
					System.out.print("Input type [SUV | Supercar | Minivan]: ");
					Tujuh=inputan.nextLine();
	
					//INPUT ENTERTAINMENT SYSTEM
					System.out.print("Input entertainment system amount[>=1]: ");
					Delapan=inputan.nextInt();
					inputan.nextLine();
					while(Delapan<1) {
						System.out.print("Input entertainment system amount[>=1]: ");
						Delapan=inputan.nextInt();
						inputan.nextLine();
					}
					
					//TOMBOL ENTER
					System.out.println("ENTER to return");
					String enter;
					enter=inputan.nextLine();
 					
					//MENGIRIM DATA KE MEMORI
					Mobil masuk1=new Mobil(namaKendaraan,Dua,Satu,Dua, Tiga,Tujuh,Lima,Enam,Empat,Delapan);
 					vec_mob.add(masuk1);
					Motor masuk2=new Motor("-","-","-","-","-","-",0,0,0,0);
					vec_mot.add(masuk2);
					Turunan masuk3=new Turunan(namaKendaraan,Dua);
					vec_kend.add(masuk3);
				}
				else {
					//INPUT BRAND
					System.out.print("Input brand[>=5]: ");
					Satu=inputan.nextLine();
					while(Satu.length()<5) {
						System.out.print("Input brand[>=5]: ");
						Satu=inputan.nextLine();
					}
					
					//INPUT NAME
					System.out.print("Input name[>=5]:");
					Dua=inputan.nextLine();
					while(Dua.length()<5) {
						System.out.print("Input name[>=5]: ");
						Dua=inputan.nextLine();						
					}
					
					//INPUT LICENSE
					int check=1,pos=0,akhir=0,count=0;
					check=1;
					pos=0;
					count=0;
					akhir=0;
					System.out.print("Input license: ");
					Tiga=inputan.nextLine();
					for(int i=1;i<Tiga.length();i++){
						if(Tiga.charAt(i)!=' '&&Tiga.charAt(i-1)==' ') {
							pos=pos+1;
						}
					}
					if(pos!=2)check=0;
					if(Tiga.charAt(0)<'A'||Tiga.charAt(0)>'Z'||Tiga.charAt(1)!=' ')check=0;
					count=0;
					for(int i=Tiga.length()-1;i>=0;i--) {
						if(Tiga.charAt(i)==' ') {
							akhir=i-1;
							break;
						}
						else if(Tiga.charAt(i)<='Z'&&Tiga.charAt(i)>='A')count++;
						else {
							check=0;
							break;
						}
					}
					if(count>3||count<1)check=0;
					
					count=0;
					for(int i=2;i<=akhir;i++) {
						if(Tiga.charAt(i)>='0'&&Tiga.charAt(i)<='9') {
							count++;
						}
						else {
							check=0;
							break;
						}
					}
					if(count<1||count>4)check=0;
					while(check==0){
						check=1;
						pos=0;
						count=0;
						akhir=0;
						System.out.print("Input license: ");
						Tiga=inputan.nextLine();
						for(int i=1;i<Tiga.length();i++){
							if(Tiga.charAt(i)!=' '&&Tiga.charAt(i-1)==' ') {
								pos=pos+1;
							}
						}
						if(pos!=2)check=0;
						if(Tiga.charAt(0)<'A'||Tiga.charAt(0)>'Z'||Tiga.charAt(1)!=' ')check=0;
						count=0;
						for(int i=Tiga.length()-1;i>=0;i--) {
							if(Tiga.charAt(i)==' ') {
								akhir=i-1;
								break;
							}
							else if(Tiga.charAt(i)<='Z'&&Tiga.charAt(i)>='A')count++;
							else {
								check=0;
								break;
							}
						}
						if(count>3||count<1)check=0;
						
						count=0;
						for(int i=2;i<=akhir;i++) {
							if(Tiga.charAt(i)>='0'&&Tiga.charAt(i)<='9') {
								count++;
							}
							else {
								check=0;
								break;
							}
						}
						if(count<1||count>4)check=0;
					}	        
 
					//INPUT TOP SPEED
					System.out.print("Input top speed[100 <= topSpeed <= 250]: ");
					Empat=inputan.nextInt();
					inputan.nextLine();
					while(Empat<100||Empat>250) {
						System.out.print("Input top speed[100 <= topSpeed <= 250]: ");
						Empat=inputan.nextInt();
						inputan.nextLine();
					}
 
					//INPUT GAS CAPACITY
					System.out.print("Input gas capacity[30 <= gasCap <=60]: ");
					Lima=inputan.nextInt();
					inputan.nextLine();
					while(Lima<30||Lima>60) {
						System.out.print("Input gas capacity[30 <= gasCap <=60]: ");
						Lima=inputan.nextInt();
						inputan.nextLine();
					}

					//INPUT WHEEL
					System.out.print("Input wheel [4 <= wheel <= 6]: ");
					Enam=inputan.nextInt();
					inputan.nextLine();
					while(Enam<4||Enam>6) {
						System.out.print("Input wheel [4 <= wheel <= 6]: ");
						Enam=inputan.nextInt();
						inputan.nextLine();
					}
					
					//INPUT TYPE MOTOR
					System.out.print("Input type [Automatic | Manual]: ");
					Tujuh=inputan.nextLine();
 
					//INPUT JUMLAH MOTOR
					int helm;
					System.out.print("Input helm amount[>=1]: ");
					helm= inputan.nextInt();
					inputan.nextLine();
					while(helm<1) {
						System.out.print("Input helm amount[>=1]: ");
						helm= inputan.nextInt();
						inputan.nextLine();
					}
 
					//TOMBOL ENTER
					System.out.println("ENTER to return");
					String enter;
					enter=inputan.nextLine();
 					
					//MENGIRIM DATA KE MEMORI
					Motor masuk1=new Motor(namaKendaraan,Dua,Satu,Dua,Tiga,Tujuh,Lima,Enam,Empat,helm);
 					vec_mot.add(masuk1);
					Mobil masuk2 =new Mobil("-","-","-","-","-","-",0,0,0,0);
					vec_mob.add(masuk2);
					Turunan masuk3=new Turunan(namaKendaraan,Dua);
					vec_kend.add(masuk3);
				}

				
			}
			else if(pilihan==2) {
				System.out.println("|No |  Type  |    Name     |");
				System.out.println("----------------------------");
				for(int i=0;i<vec_kend.size();i++) {
					System.out.print((i+1)+" ");
					System.out.print(vec_kend.get(i).name_kendaraan+" ");
					System.out.println(vec_kend.get(i).type_kendaraan+" ");
				}
				System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
				int test_drive=inputan.nextInt();
				inputan.nextLine();
				test_drive=test_drive-1;
				
				while(test_drive<-1||test_drive>=vec_kend.size()) {
					System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
					test_drive=inputan.nextInt();
					inputan.nextLine();
					test_drive=test_drive-1;
				}
				
				if(test_drive>=0) {
 					if(vec_kend.get(test_drive).name_kendaraan.equals("Car")) {
 						System.out.println("Brand: "+vec_mob.get(test_drive).brand);
						System.out.println("Name: "+vec_mob.get(test_drive).name);
						System.out.println("License Plate: "+vec_mob.get(test_drive).license_plate);
						System.out.println("Type: "+vec_mob.get(test_drive).type_mobil);
						System.out.println("Gas Capacity: "+vec_mob.get(test_drive).gas_cap);
						System.out.println("Top Speed: "+vec_mob.get(test_drive).top_speed);
						System.out.println("Wheel(s): "+vec_mob.get(test_drive).wheel);
						System.out.println("Entertainment System: "+vec_mob.get(test_drive).entertainment_system);
 						
						if(vec_mob.get(test_drive).type_mobil.equals("Supercar")) {
							First_Attempt jenis_keluaran = new CarIsSupercar();
							jenis_keluaran.result_final();
 						}
						else {
							First_Attempt jenis_keluaran = new NotSupercar();
							jenis_keluaran.result_final();							
						}
						
						//TOMBOL ENTER
						System.out.println("ENTER to return");
						String enter;
						enter=inputan.nextLine();
					}
					else {
						System.out.println("Brand: "+vec_mot.get(test_drive).brand);
						System.out.println("Name: "+vec_mot.get(test_drive).name);
						System.out.println("License Plate: "+vec_mot.get(test_drive).license_plate);
						System.out.println("Type: "+vec_mot.get(test_drive).type_motor);
						System.out.println("Gas Capacity: "+vec_mot.get(test_drive).gas_cap);
						System.out.println("Top Speed: "+vec_mot.get(test_drive).top_speed);
						System.out.println("Wheel(s): "+vec_mot.get(test_drive).wheel);
						System.out.println("Jumlah Helm: "+vec_mot.get(test_drive).jumlah_helm);						
						System.out.println(vec_mot.get(test_drive).name+" is standing!");
						System.out.print("Masukkan Harga Helm:");
						int angka=inputan.nextInt();
						inputan.nextLine();
						System.out.println("Price: "+(vec_mot.get(test_drive).jumlah_helm)*angka);
						
						//TOMBOL ENTER
						System.out.println("ENTER to return");
						String enter;
						enter=inputan.nextLine();
					}
					
				}
				


			}
			
			
		}

	}
}