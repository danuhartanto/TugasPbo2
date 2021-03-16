/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2pbo;
 import java.util.Scanner;

/**
 *
 * @author Danu Hartanto
 */
public class Tugas2PBO {

  public static void main(String[] args) {
	boolean isExit = false;
        pbo pb = new pbo();//materi minggu kedua
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("========= Kalkulator Console =========");
                System.out.println("========= Danu Hartanto =========");
                
		System.out.println("Menu : ");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("5. Modulus");
                System.out.println("6. Exit");
		System.out.print("Pilih salah satu menu : ");
		int menuSelect = scanner.nextInt();
                
                
                
		if (menuSelect == 6) {
			isExit = true;
		} else {
			if (menuSelect == 1) { 
				System.out.println("Penjumlahan ");
			} else if (menuSelect == 2) { 
				System.out.println("Pengurangan ");
			} else if (menuSelect == 3) { 
				System.out.println("Perkalian ");
			} else if (menuSelect == 4) { 
				System.out.println("Pembagian ");
			}else if (menuSelect == 5){
                            System.out.println("Modulus ");
                        }
			int n=2;
                      
			
			
			
			
			if (menuSelect == 1) { 
                              for(int a=1;a<n;a++){
                            System.out.print("angka yang dihitung : ");
                            a=scanner.nextInt();
                            
                            for(int b=1;b<n;b++ ){
                            System.out.print("angka yang dihitung : ");
                            b=scanner.nextInt();
                            pb.penjumlahan(a, b);
                            System.out.println(" ");
                            }}
                              
			} else if (menuSelect == 2) { //soal 2
                           for(int i=1;i<n;i++){
                           System.out.print("angka yang dihitung : ");
                           i=scanner.nextInt();
                           
                           for(int j=1;j<n;j++ ){
                           System.out.print("angka yang dihitung : ");
                           j=scanner.nextInt();
                           pb.penngurangan(i, j);
                           System.out.println(" ");
				
                           }}
                           
			} else if (menuSelect == 3) {//perkallian
                            for(int i=1;i<n;i++){
                            System.out.print("angka yang dihitung : ");
                            i=scanner.nextInt();
                            
                            for(int j=1;j<=n;j++ ){
                            System.out.print("angka yang dihitung : ");
                            j=scanner.nextInt();
                            pb.perkalian(i, j);
                            System.out.println(" ");
                            }}
			} else if (menuSelect == 4) { //pembagian
                            for(int i=1;i<n;i++){
                            System.out.print("angka yang dihitung : ");
                            i=scanner.nextInt();
                            
                            for(int j=1;j<n;j++ ){
                            System.out.print("angka yang dihitung : ");
                            j=scanner.nextInt();
                            pb.pembagian(i, j);
                            System.out.println(" ");
		            }}
                            
			} else if (menuSelect == 5){//modulus
                            for(int i=1; i<n;i++){
                            System.out.print("angka yang dihitung : ");
                            i=scanner.nextInt();
                            for(int j =1;j<n;j++){
                                
                            System.out.print("angka yang dihitung : ");
                            j=scanner.nextInt();
                            pb.modulus(i, j);
                            System.out.println(" ");
                            }}
                        }
			
			
			System.out.print("Ketik 6 untuk keluar, ketik 0 untuk ke menu utama : ");
			menuSelect = scanner.nextInt();
			if (menuSelect == 6)
				isExit = true;
		}			
	} while (!isExit);
	scanner.close();
}
    
}
