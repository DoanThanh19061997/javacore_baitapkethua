package javacore_dahinh.bai8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SanhSu extends  Product {
    private Date ngaySanXuat;
    private Date ngayNhapKho;

    public SanhSu(Date ngaySanXuat, Date ngayNhapKho) {
        super();
        this.ngaySanXuat = ngaySanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public void nhapProduct() {
        super.nhapProduct();
        System.out.println(" nhap ngay sản xuất : ");
        String ngay = new Scanner(System.in).nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaySanXuat = df.parse(ngay);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(" nhập vào ngày ton kho : ");
        String ngayhh = new Scanner(System.in).nextLine();
        SimpleDateFormat dfh = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayNhapKho = dfh.parse(ngayhh);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
