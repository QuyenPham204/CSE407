/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlnhansu;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;

// Chương trình chính
public class QLNhanSu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear bộ đệm

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
            System.out.print("Nhân viên toàn thời gian (1) hay bán thời gian (2)? ");
            int loai = sc.nextInt();
            sc.nextLine(); // Clear bộ đệm

            NhanVien nv;
            if (loai == 1) {
                nv = new NhanVienToanThoiGian();
            } else {
                nv = new NhanVienBanThoiGian();
            }
            nv.nhapThongTin();
            danhSachNhanVien.add(nv);
        }

        System.out.println("\n=== BẢNG LƯƠNG NHÂN VIÊN ===");
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
            System.out.println("Lương: " + nv.tinhLuong() + " VND");
            System.out.println("-------------------------");
        }
    }
}
