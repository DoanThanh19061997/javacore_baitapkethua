package javacore_dahinh.bai8;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Food extends  Product{
    private String nhacungcap;
    private Date ngayNhap;
    private Date ngayHetHan;

    public  Food(){
    super();
    }
    public Food(String nhacungcap, Date ngayNhap, Date ngayHetHan) {
        super();
        this.nhacungcap = nhacungcap;
        this.ngayNhap = ngayNhap;

        this.ngayHetHan = ngayHetHan;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    @Override
    public void nhapProduct() {
        super.nhapProduct();
        System.out.println(" nhập vào ngày: ");
        String ngay = new Scanner(System.in).nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayNhap = df.parse(ngay);
        } catch (Exception e) {
            e.printStackTrace();
        }

    System.out.println(" nhập vào ngày hết hạn : ");
    String ngayhh = new Scanner(System.in).nextLine();
        DateFormat dfh = new SimpleDateFormat("dd/MM/yyyy");
        try {
        this.ngayHetHan = dfh.parse(ngayhh);
    }catch (Exception e){
        e.printStackTrace();
    }
        System.out.println(" nhập vào nhà cung cấp : ");
        this.nhacungcap = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+ nhacungcap+ngayNhap+ngayHetHan;

    }
    // so sánh ngày tháng

}
