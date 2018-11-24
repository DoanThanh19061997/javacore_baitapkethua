package javacore_dahinh.bai8;

import java.util.Scanner;

public class DienMay extends  Product {
    private int soThangBaoHanh;
    private int congSuat;

    public DienMay(int soThangBaoHanh, int congSuat) {
        super();
        this.soThangBaoHanh = soThangBaoHanh;
        this.congSuat = congSuat;
    }
    public DienMay(){
        super();
        this.soThangBaoHanh = 1;
        this.congSuat = 1;
    }
    public int getSoThangBaoHanh() {
        return soThangBaoHanh;
    }

    public void setSoThangBaoHanh(int soThangBaoHanh) {
        this.soThangBaoHanh = soThangBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void nhapProduct() {
        super.nhapProduct();
        System.out.println("số tháng bảo hành: ");
        this.soThangBaoHanh = new Scanner(System.in).nextInt();
        System.out.println("nhập công suất : ");
        this.congSuat = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+soThangBaoHanh+congSuat;
    }
}
