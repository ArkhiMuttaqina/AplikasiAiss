package com.DetechtiveCode.aplikasiaiss;

import java.util.Arrays;

public class SoalPilihanGanda {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Salah satu tarian daerah dari betawi adalah ?",
            "Tari inai adalah salah satu dari macam-macam tarian daerah jambi lebih tepatnya dari Desa teluk majelis. Apa tujuan dari tarian tersebut ?",
            "Suku yang merupakan suku terbesar ke 2 setelah suku Jawa adalah.. ?",
            "Bagaimana kehidupan suku baduy .. ?",
            "Salah satu suku yang sangat dikenal dengan hal-hal mistis dan kesakralan adat budayanya adalah ",
            "Makanan paling khas dari suku madura yang terkenal adalah.. ?",
            "Musik Tradisional Kolintang adalah musik yang cara memainkanya dengan cara dipukul dengan alat tertentu. Dari manakah asal Musik Tradisional kolintang ini ?",
            "Seluang adalah alat musik trditional yang berasal dari Minangkabau. Terbuat dari apakah alat musik ini ?",
            "Bagaimanakah cara memainkan alat musik gambus ?",
            "Aramba adalah salah satu jenis alat musik yang cara memainkanya dengan cara dipukul. Terbuat dari bahan apakah alamat musik tersebut ?",
            "Selaso jatuh kembar adalah rumah adat yang berasa dari riau. Apa makna dari nama tersebut ?",
            "Dari manakah asal dari rumah gadang ?",
            "Rumah baloy adalah rumah adat kalimantan utara. Bagaimanakah bentuk rumah baloy ?",
            "Rumah adat dari Provinsi DKI Jakarta disebut dengan rumah kebaya. Rumah ini adalah ciri kas dari suku ?",
            "Sebutkan bagian-bagian rumah dari rumah adat walewangko sulawesi utara ?",
            "Tari guel adalah tarian adat yang berasal dari ?",
            "Tari barong merupakan tarian peninggalan kebudayaan pra Hindu. Kata barong berasal dari kata bahruang yang dianggap sebagai ?",
    };

    //membuat array untuk pilihan jawaban
    public String pilihanJawaban[][] = {
            {"Tari Modern Betawi", "Tari Piring Betawi", "Tari Topeng Betawi"},
            {"Untuk ritual kepada nenek moyang ketika memiliki keturunan", "Sebagai ritual menjaga calon mempelai wanita dari gangguan supranatural", "Sebagai ritual mendapatkan kekayaan 7 turunan"},//b//
            {"Suku Betawi", "Suku Sunda", "Suku Madura"},
            {"Sangat modern dan maju", "Sangat tradisional terisolasi dari Dunia luar", "Aman Tentram Sejahtera"},
            {"Suku baduy", "Suku jawa dari Daerah Istimewa Jogjayakarta", "Suku Betawi"},
            {"Rawon Madura", "Sate Madura", "Soto Madura"},
            {"Betawi", "Minahasa", "Samarinda"},
            {"Emas", "Batok Kelapa", "Bambu"},
            {"Ditiup", "Dipetik", "Digesek"},
            {"Besi dan Tembaga", "Kuningan", "Kulit Sapi dan kayu"},
            {"Memiliki 2 sisi atap yang sama antara depan dan belakang serta pada bagian depan rumah terdapat teras yang letaknya dibaag rumah", "Karena memiliki selasar yang lebih rendah dibandingkan dengan ruang tengah dan beberbentuk sama pada sisi kiri dan kanan tangga masuk.", "Perpaduan antara rumah tradisional Riau dengan rumah Modern Minimalis"},
            {"Sumatra Barat", "Sumatra Selatan", "Sumatra Utara"},
            {"Atapnya berbentuk melengkung terbuat dari kayu jati", "Berbentuk panggung dan terbuat dari kayu ulin", "Atap nya membulat terbuat dari Semak atau rumput Berukuran besar"},
            {"Betawi", "Banten", "Riau"},
            {"Lesar, sekey, pores", "Pores, jintu, Lesar", "Mina, jintu, sedah"},
            {"Aceh", "Padang", "Banten"},
            {"Hewan pelindung", "Hewan peramal", "Hewan perusak"},
    };

    //membuat array untuk jawaban benar
    public String jawabanBenar[] = {
            "Tari Piring Betawi",
            "Sebagai ritual menjaga calon mempelai wanita dari gangguan supranatural",
            "Suku Sunda",
            "Sangat tradisional terisolasi dari Dunia luar",
            "Suku jawa dari Daerah Istimewa Jogjayakarta",
            "Sate Madura",
            "Minahasa",
            "Bambu",
            "Dipetik",
            "Besi dan Tembaga",
            "Karena memiliki selasar yang lebih rendah dibandingkan dengan ruang tengah dan beberbentuk sama pada sisi kiri dan kanan tangga masuk.",
            "Sumatra Barat",
            "Berbentuk panggung dan terbuat dari kayu ulin",
            "Betawi",
            "Lesar, sekey, pores",
            "Aceh",
            "Hewan pelindung",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}