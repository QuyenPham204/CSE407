/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhansu;

/**
 *
 * @author Admin
 */
// Lớp con NhanVienBanThoiGian kế thừa từ NhanVien
public class NhanVienBanThoiGian extends NhanVien {

    public NhanVienBanThoiGian() {
        super();
    }

    @Override
    public double tinhLuong() {
        return this.getSoGioLam() * 30000;
    }
}
