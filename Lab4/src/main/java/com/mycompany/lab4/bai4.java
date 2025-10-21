/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai4 {
    
    private String tenSp;
    private double donGia;
    private double giamGia;

   
    public bai4(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    
    public bai4(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

   
    public String getTenSp() {
        return this.tenSp;
    }
    
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

   
    public double getDonGia() {
        return this.donGia;
    }
    
    public void setDonGia(double donGia) {
       
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            System.out.println("Giá sản phẩm không thể âm!");
        }
    }

   
    public double getGiamGia() {
        return this.giamGia;
    }
    
    public void setGiamGia(double giamGia) {
        
        if (giamGia >= 0 && giamGia <= this.donGia) {
            this.giamGia = giamGia;
        } else {
            System.out.println("Giảm giá không hợp lệ!");
        }
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
}
