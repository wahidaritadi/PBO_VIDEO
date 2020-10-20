package com.tutorial;

class Polos{
    String dataString;
    int dataInteger;
}

class mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Constructor {
    public static void main(String[] args) throws Exception {

        mahasiswa mahasiswa1 = new mahasiswa("ucup","13305041","teknik perteknikan");
        mahasiswa mahasiswa2 = new mahasiswa("otong","13305042","teknik pertambangan");

    }
}