/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnhansu;

/**
 *
 * @author Admin
 */
// Lớp con NhanVienToanThoiGian kế thừa từ NhanVien
public class NhanVienToanThoiGian extends NhanVien {

    public NhanVienToanThoiGian() {
        super();
    }

    @Override
    public double tinhLuong() {
        return this.getSoGioLam() * 50000;
    }
}

