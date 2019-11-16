package com.example.memberExo;

import java.util.ArrayList;

public class ExoData {
    public static String [][] data = new String[][] {
            {"0", "Xiumin EXO",
                    "Kim Min-seok (lahir 26 Maret 1990; umur 29 tahun) atau yang lebih dikenal dengan nama panggung Xiumin, adalah seorang penyanyi dan aktor berkebangsaan Korea Selatan. Ia dikenal sebagai anggota boyband Tiongkok-Korea Selatan Exo, sub-kelompoknya Exo-M, dan sub-unitnya Exo-CBX.",
                    "https://i.postimg.cc/jjmcwr1b/xiumin.jpg"},
            {"1", "Suho EXO",
                    "Kim Joon-myeon (lahir 22 Mei 1991; umur 28 tahun), lebih dikenal dengan nama panggungnya Suho adalah penyanyi dan aktor Korea Selatan. Saat ini ia adalah pemimpin dari grup laki-laki Korea Selatan EXO.",
                    "https://i.postimg.cc/J0bpCdPW/suhoo.jpg"},
            {"2", "Lay EXO",
                    "Zhang Yixing (Hanzi sederhana: 张艺兴; Hanzi tradisional: 張藝興) dikenal dengan nama panggung Lay (bahasa Korea: 레이), adalah seorang penyanyi, penulis lagu, penari, dan aktor Tiongkok. Saat ini ia adalah anggota boyband EXO-M, subkelompok dari boyband China-Korea Selatan EXO. Ia merupakan penari utama di EXO-M. Ia pertama kali dikenal setelah berpartisipasi dalam pertunjukan bakat TV China Star Academy pada tahun 2005.",
                    "https://i.postimg.cc/25Ffk2yr/lay.jpg"},
            {"3", "Baekhyun EXO",
                    "Byun Baek-hyun (lahir 6 Mei 1992; umur 27 tahun), dikenal dengan mononim Baekhyun adalah penyanyi dan aktor Korea Selatan. Ia adalah anggota dari grup vokal pria Korea Selatan EXO, sub kelompoknya EXO-K, dan sub unitnya EXO-CBX.",
                    "https://i.postimg.cc/k5Bwg5fs/baekhyun.jpg"},
            {"4", "Chen EXO",
                    "Kim Jong-dae (lahir 21 September 1992; umur 27 tahun), lebih dikenal nama panggungnya Chen adalah penyanyi dan penulis lagu. Korea Selatan. Saat ini ia adalah anggota boyband Korea Selatan-Tiongkok EXO dan sub unitnya EXO-CBX, serta grup balada S.M. Entertainment S.M. The Ballad.",
                    "https://i.postimg.cc/mkxmqG3w/chen.jpg"},
            {"5", "Chanyeol EXO",
                    "Park Chan-yeol (lahir 27 November 1992; umur 26 tahun),[1] lebih dikenal dengan mononim Chanyeol adalah rapper, penyanyi, penulis lagu, dan aktor Korea Selatan. Ia adalah anggota dari grup penyanyi laki-laki Tiongkok-Korea Selatan EXO dan sub kelompoknya EXO-K.",
                    "https://i.postimg.cc/7YkBnwZP/cy.jpg"},
            {"6", "D.O EXO",
                    "Do Kyung-soo (lahir 12 Januari 1993; umur 26 tahun), lebih dikenal dengan nama panggungnya D.O., adalah penyanyi dan aktor Korea Selatan. Ia dikenal sebagai anggota dan salah satu vokalis utama grup penyanyi laki-laki Tiongkok-Korea Selatan EXO Selain melakukan kegiatan bersama grupnya, D.O. juga membintangi berbagai drama televisi dan film seperti Pure Love (2016), My Annoying Brother (2016), Swing Kids (2018), dan 100 Days My Prince (2018)",
                    "https://i.postimg.cc/9FYLxKDd/do.jpg"},
            {"7", "Kai EXO",
                    "Kim Jong-in (lahir 14 Januari 1994; umur 25 tahun), atau yang lebih dikenal dengan nama Kai, adalah penyanyi, aktor, dan penari Korea Selatan. Ia adalah anggota grup penyanyi Korea Selatan-Tiongkok EXO dan subkelompok-nya EXO-K.",
                    "https://i.postimg.cc/MpZdg5Bh/kaii.jpg"},
            {"8", "Oh-Sehun EXO",
                    "Oh Se-hun (lahir 12 April 1994; umur 25 tahun), lebih dikenal dengan mononim Sehun, adalah penyanyi, rapper, model, dan aktor asal Korea Selatan. Ia dikenal sebagai anggota dari boyband Korea Selatan-Tiongkok EXO dan sub kelompoknya EXO-K.",
                    "https://i.postimg.cc/L8yNSPBh/sehun.jpg"},

    };

    public static ArrayList<Exo> getListData(){
        ArrayList<Exo> list = new ArrayList<>();
        for (String[] aData : data){
            Exo exo = new Exo();
            exo.setId(Integer.parseInt(aData[0]));
            exo.setName(aData[1]);
            exo.setDescription(aData[2]);
            exo.setPhoto(aData[3]);

            list.add(exo);
        }
        return list;
    }
}
