/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai3 {
    private String tenSp;
    private double donGia;
    private double giamGia;
    
    
    public bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
   
    public bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
    
    
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế thu nhập: " + getThueThuNhap());
        System.out.println("Giá sau thuế: " + (donGia - giamGia + getThueThuNhap()));
        System.out.println("------------------------");
    }
    
    
    private double getThueThuNhap() {
        return donGia * 0.1;
    }
    
    
    public String getTenSp() {
        return tenSp;
    }
    
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    
    public double getDonGia() {
        return donGia;
    }
    
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public double getGiamGia() {
        return giamGia;
    }
    
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
}
