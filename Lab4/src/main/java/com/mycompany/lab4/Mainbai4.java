/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Admin
 */
public class Mainbai4 {
    public static void main(String[] args) {
      
        bai4 sp1 = new bai4("Laptop", 15000000, 1000000);
      
        System.out.println("=== THÔNG TIN BAN ĐẦU ===");
        System.out.println("Tên sản phẩm (getter): " + sp1.getTenSp());
        System.out.println("Đơn giá (getter): " + sp1.getDonGia());
        System.out.println("Giảm giá (getter): " + sp1.getGiamGia());
       
        System.out.println("\n=== SAU KHI THAY ĐỔI (SETTER) ===");
        sp1.setTenSp("Laptop Dell Gaming");
        sp1.setDonGia(18000000);
        sp1.setGiamGia(1500000);
        
        sp1.xuat();
        
        System.out.println("=== TEST VALIDATION ===");
        sp1.setDonGia(-5000000); 
        sp1.setGiamGia(20000000); 
    }
}
