/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Admin
 */
public class Mainbai2 {
    public static void main(String[] args) {
        
        bai2 sp1 = new bai2();
        bai2 sp2 = new bai2();

        
        System.out.println("Nhập thông tin sản phẩm 1:");
        sp1.nhap();

        System.out.println("Nhập thông tin sản phẩm 2:");
        sp2.nhap();

        
        System.out.println("\n--- Thông tin sản phẩm 1 ---");
        sp1.xuat();

        System.out.println("\n--- Thông tin sản phẩm 2 ---");
        sp2.xuat();
    }
}
