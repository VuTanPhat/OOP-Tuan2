package Bai2;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static void nhap(CD cd) {
		Scanner sc=new Scanner(System.in);
		System.out.print("nhập mã Cd: ");
		cd.setMacd(sc.nextInt());
		sc.nextInt();
		System.out.print("nhập tựa Cd: ");
		cd.setTuacd(sc.nextLine());
		sc.nextLine();
		System.out.print("nhập số bài hát: ");
		cd.setSobaihat(sc.nextInt());
		sc.nextInt();
		System.out.print("nhập giá: ");
		cd.setGia(sc.nextFloat());
		sc.nextFloat();
	}

	public static void main(String[] args) {
		CD cd[] = null;
		int a, n = 0;
		boolean flag = true;
		do {
			System.out.println("Bạn chọn làm gì?");
			System.out.println("1.Nhập thông tin CD \n" +"2.Xuất danh sách Album.\n" + "3.Tính tổng giá thành \n" + "4.Tổng số lượng CD \n" +"5.Sắp xếp giảm dần theo giá thành\n"+"6.Sắp xếp tăng dần theo tựa CD\n"+"Nhập số khác để thoát");
			a = sc.nextInt();
			switch (a) {
			case 1:
			System.out.println("Nhập số lượng CD : ");
			n = sc.nextInt();
			cd = new CD[n];
			for (int i = 0; i < n; i++) {
				System.out.println("CD thứ " + (i + 1)+": ");
				cd[i] = new CD();
				nhap(cd[1]);
			}
			break;
			case 2:
				System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Tên ca sỹ", "Số bài hát", "Giá thành");
				for (int i = 0; i < n; i++) {
					cd[i].hienThiAlbum();
				}
				break;
			case 3:
				int tong = 0;
				for (int i = 0; i < n; i++) {
					tong += cd[i].getGia();
				}
				System.out.println("" +"Tổng giá thành là : " + tong);
				break;
			case 4:
				System.out.println("Tổng số lượng CD là : " + n);
				break;
			case 5:
				CD temp = cd[0];
				for (int i = 0; i < n - 1; i++) {
					for (int j = i + 1; j < n; j++) {
						if (cd[i].getGia() < cd[j].getGia()) {
							temp = cd[j];
							cd[j] = cd[i];
							cd[i] = temp;
						}
					}
				}
				System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
				break;
			case 6:
				temp = cd[0];
				for (int i = 0; i < n - 1; i++) {
					for (int j = i + 1; j < n; j++) {
						if (cd[i].getTuacd().compareTo(cd[j].getTuacd())>0) {
							temp = cd[j];
							cd[j] = cd[i];
	cd[i] = temp;
	}
	}
	}
	System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
	break;
	default:
	System.out.println("Goodbye");
	flag = false;
	break;
			}
		}while(flag)
    }
}
