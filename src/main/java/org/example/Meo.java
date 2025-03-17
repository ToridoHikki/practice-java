package org.example;

public class Meo extends DongVat implements Animal {
    public String ten;
    public int tuoi;
    public String mau;

    // Phuong thuc keu cua meo
    void keu() {
        System.out.println("Meo keu: Meo meo meo");
    }

    //nap chong (overloading) phuong thuc keu, same method name, different parameter
    public void keu (String tiengNguoi) {
        System.out.println("Meo keu: " + tiengNguoi);
    }

    //ghi de (overriding) method an() cua class cha DongVat
    public void an() {
        System.out.println("meo an ca");
    }


    @Override
    public void ngu() {
        System.out.println("meo ngu");
    }

    @Override
    public void chao() {

    }

    @Override
    public void hello() {

    }

    @Override
    public void noiD() {
        System.out.println("meo noi");
    }
}


