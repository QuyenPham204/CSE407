/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhansu;

/**
 *
 * @author Admin
 */
// Lớp cha NhanVien
public class NhanVien {
    private String ten;
    private int soGioLam;

    public NhanVien() {}

    public NhanVien(String ten, int soGioLam) {
        this.ten = ten;
        this.soGioLam = soGioLam;
    }

    public String getTen() {
        return ten;
    }

    public int getSoGioLam() {
        return soGioLam;
    }
    
    public void nhapThongTin() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập tên nhân viên: ");
        ten = sc.nextLine();
        System.out.print("Nhập số giờ làm việc: ");
        soGioLam = sc.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Số giờ làm: " + soGioLam);
    }

    public double tinhLuong() {
        return 0; // Phương thức sẽ được override ở lớp con
    }
}

