/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Admin
 */
public class Mainbai3 {
    public static void main(String[] args) {
        
        bai3 sp1 = new bai3("Laptop Dell", 15000000, 1000000);
        
        
        bai3 sp2 = new bai3("Macbook Pro", 30000000);
        
        
        System.out.println("=== THÔNG TIN SẢN PHẨM 1 (CÓ GIẢM GIÁ) ===");
        sp1.xuat();
        
        System.out.println("=== THÔNG TIN SẢN PHẨM 2 (KHÔNG GIẢM GIÁ) ===");
        sp2.xuat();
    }
}
