package com.example.HmjPolines;

import java.util.ArrayList;

public class HmjData {
    public static  String[][] data = new String [][]{
            {"0",
                    "HMJ Elektro",
                    "Himpunan Mahasiswa Elektro Terdiri dari 5 program studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, dan D4 Teknik Telekomunikasi ",
                    "https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1",
                    "HMJ Sipil",
                    "Himpunan Mahasiswa Jurusan Teknik Sipil adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organis asi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tekni k Sipil untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi",
                    "https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"2",
                    "HMJ Mesin",
                    "Himpunan Mahasiswa Jurusan Teknik Mesin adalah salah satu HimpunanMahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organis asi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tekni k Mesin untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.",
                    "https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"3",
                    "HMJ Akuntansi",
                    "Himpunan Mahasiswa Jurusan Akutansi adalah salah satu Himpunan Mah asiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan akutansi untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi",
                    "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            {"4",
                    "HMJ Administrasi Bisnis",
                    "Himpunan Mahasiswa Jurusan Administrasi Bisnis adalah salah satu H impunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusa n Administrasi Bisnis untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi",
                    "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"},
    };
    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String [] aData : data){
            Hmj hmj=new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);

        }
        return list;
    }
}
