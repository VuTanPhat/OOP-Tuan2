package Bai2;

import java.util.Scanner;

public class CD {
	private int macd;
	private String tuacd;
	private int sobaihat;
	private float gia;
	void CD(){
		macd=999999;
		tuacd="chưa xác định";
	}
	private void CD(int macd,String tuacd,int sobaihat,float gia) {
		this.macd=macd;
		this.tuacd=tuacd;
		this.sobaihat=sobaihat;
		this.gia=gia;	
	}
	int getMacd(){
		return macd;
	}
	void setMacd(int macd) {
		if(macd==999999||macd<=0) {
			this.macd=999999;
		}else {
			this.macd=macd;
		}
	}
	String getTuacd(){
		return tuacd;
	}
	void setTuacd(String tuacd) {
		if(tuacd==null) {
			this.tuacd="không hợp lệ";
		}else {
			this.tuacd=tuacd;
		}
	}
	int getSobaihat(){
		return macd;
	}
	void setSobaihat(int sobaihat) {
		this.sobaihat=sobaihat;
	}
	float getGia(){
		return gia;
	}
	void setGia(float gia) {
		
		this.gia=gia;
	}
	@Override
	public String toString() {
		return getMacd()+getTuacd()+getSobaihat()+getGia();	
	}
	void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("nhập mã Cd: ");
		macd=sc.nextInt();
		System.out.print("nhập tựa Cd: ");
		tuacd=sc.nextLine();
		System.out.print("nhập số bài hát: ");
		sobaihat=sc.nextInt();
		System.out.print("nhập giá: ");
		gia=sc.nextFloat();
	}
	public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",macd,tuacd,sobaihat,gia);
    }
}