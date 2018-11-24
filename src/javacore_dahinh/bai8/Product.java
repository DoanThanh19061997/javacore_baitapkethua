package javacore_dahinh.bai8;

import java.util.Scanner;

public class Product {
    private  String maHang;
    private  String tenHang;
    private  int soLuongTon;
    private int donGia;

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public Product() {
        this.maHang = "";
        if (tenHang.equals(" ")) {
            return;
        }else {
            this.tenHang ="";
        }
        this.donGia = 1;
        this.soLuongTon = 1;

    }
    public void nhapProduct(){
        System.out.println(" nhập vào mã : ");
        this.maHang = new Scanner(System.in).nextLine();
        System.out.println(" nhập vào tên hàng : ");
        this.tenHang = new Scanner(System.in).nextLine();
        System.out.println(" nhập vào đơn giá : ");
        this.donGia = new Scanner(System.in).nextInt();
        System.out.println(" nhập vào số lượng tồn kho : ");
        this.soLuongTon = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return " thông tin sản phẩm : "+maHang+tenHang+donGia+soLuongTon;
    }
}
