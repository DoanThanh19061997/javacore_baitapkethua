package javacore_dahinh.bai8;

public class test {
    public static void main(String[] args) {
        Food f = new Food();
        f.nhapProduct();
        Product a = new Food();
        ((Food) a).getNhacungcap();
        Food b = (Food) new Product();
        b.getSoLuongTon();
    }
}
