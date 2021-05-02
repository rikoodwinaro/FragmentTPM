package com.example.cryptolist;

import java.util.ArrayList;

public class Data {
    private static String[] appNames = {
            "Bitcoin (BTC)",
            "Ethereum (ETH)",
            "Ripple (XRP)",
            "Litecoin (LTC)",
            "Cardano (ADA)",
            "Stellar (XLM)",
            "Binance (BNB)",
            "Dogecoin",
            "Yearn (YFI)",
    };

    private static String[] appDetails = {
            "Secara sederhana, Bitcoin bisa dibayangkan seperti versi digital dari uang tunai. Pemilik Bitcoin dapat menggunakan mata uang digital itu sebagai alat pembayaran untuk membeli produk atau membayar jasa. Penemu Bitcoin adalah Satoshi Nakamoto, yang diketahui meluncurkan mata uang digital tersebut pertama kali ke internet pada 2009.",
            "Ethereum diciptakan oleh Vitalik Buterin pada 2013 lalu. Ethereum sendiri merupakan jaringan peer-to-peer publik atau blockchain dengan mata uang digitalnya sendiri yang disebut ether. Dengan jaringan tersebut, maka para pengembang dapat memproduksi sebuah aplikasi. Melalui cara tersebut, ethereum bekerja sebagai sebuah platform software yang terdesentralisasi. Hal itu berbeda dengan bitcoin yang memang hanya didesain untuk menjadi mata uang.",
            "Ripple adalah network yang memungkinkan pengiriman mata uang antara dua pihak dengan waktu yang sangat cepat. Token yang digunakan dalam network ripple inilah yang disebut dengan XRP. Semua bisa ditukarkan ke dalam bentuk XRP, baik mata uang fiat (Rupiah, dolar, lainnya), emas, bahkan miles pesawat terbang. Dan perlu Anda ketahui, ripple tidak menggunakan energi maupun proof of work seperti bitcoin.",
            "Diluncurkan pada tahun 2011, Litecoin (LTC) merupakan salah satu cryptocurrency atau aset kripto tertua di pasar. Berbeda dengan Bitcoin yang disering disebut emas, LItecoin sering disebut sebagai “perak”. Hal ini dikarenakan Bitcoin menggunakan kode yang sama seperti Bitcoin dan memiliki banyak persamaan lainnya, tetapi lebih cepat dan lebih murah. Meskipun Litecoin memiliki protokol yang sama dengan Bitcoin, Litecoin berada pada blockchain terpisah.",
            "Cardano adalah proyek blockchain publik terdesentralisasi dan salah satu mata uang kripto yang sepenuhnya diciptakan secara Open Source. Cardano memiliki fitur Smart Contracts yang berusaha menghadirkan fitur lebih maju daripada protokol yang dikembangkan oleh mata uang kripto lain sebelumnya. Ini adalah platform blockchain pertama yang berkembang dari filosofi ilmiah dengan pendekatan berbasis penelitian.",
            "Stellar merupakan mata uang digital yang berfokus pada pembayaran dalam jaringan blockchain terdesentralisasi. Ada yang menyebut Stellar sebagai \"anak\" dari XRP dan Bitcoin.",
            "Binance coin (BNB) adalah aset crypto yang diterbitkan oleh Binance Exchange, dan diperdagangan dengan simbol BNB. Koin BNB adalah berjenis token ERC-20 yang berjalan di atas blockchain Ethereum. Nah, BNB ini memiliki total persedian sebanyak 200 juta token BNB. Binance exchange sendiri merupakan bursa crypto nomor satu jika dilihat dari volume transaksi dan jumlah pengguna aktif.",
            "Dogecoin adalah sejenis mata uang kripto (cryptocurrency), seperti Bitcoin, Etherium, Litecoin dan sebagainya. Dogecoin diperkenalkan sejak Desember 2013. Dogecoin mulanya dibuat untuk lelucon semata. Mata uang kripto ini dikembangkan oleh software engineer IBM Billy Markus dan engineer Adobe Jackson Palmer. Markus dan Palmer pun sengaja membuat logo Dogecoin seunik mungkin, tidak seperti logo futuristik ala Bitcoin atau mata uang kripto lain.",
            "Yearn Finance sendiri masuk ke dalam protokol Decentralized Finance (DeFi) yang menawarkan kegiatan yield farming. Sebagai aggregator, Yearn Finance ini juga menggunakan protokol DeFi lain seperti Curve, Compound, Aave, dan dYDX untuk mengoptimalkan peminjaman token. Sebelum Yearn Finance diciptakan, seorang pengguna harus secara manual memeriksa, melihat hasil, dan memasukan mata uang crypto mereka ke dalam protokol-protokol tersebut. Namun, hal itu dibuat mudah dengan Yearn Finance ini."
    };

    private static String[] appImages = {
            "https://bitcoin.org/img/home/bitcoin-img.svg?1618067549",
            "https://upload.wikimedia.org/wikipedia/commons/b/b7/ETHEREUM-YOUTUBE-PROFILE-PIC.png",
            "https://pbs.twimg.com/profile_images/1313197587323912195/ryyrCapt_400x400.jpg",
            "https://qph.fs.quoracdn.net/main-qimg-78cd18f4b01f7ca0f72dbaa263ed6d4f",
            "https://upload.wikimedia.org/wikipedia/commons/c/c0/Cardano_Logo.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/5/56/Stellar_Symbol.png",
            "https://academy.binance.com/_next/image?url=https%3A%2F%2Fimage.binance.vision%2Fuploads%2FtemteDDYwoldaMDkkLdm.png&w=750&q=75",
            "https://upload.wikimedia.org/wikipedia/commons/d/d0/Dogecoin_Logo.png",
            "https://defirate.com/wp-content/uploads/2020/05/iEarn.png",
    };

    static ArrayList<Crypto> getListData() {
        ArrayList<Crypto> list = new ArrayList<>();

        for (int position = 0; position < appNames.length; position++) {
            Crypto crypto = new Crypto();
            crypto.setsName(appNames[position]);
            crypto.setsDetail(appDetails[position]);
            crypto.setsPhoto(appImages[position]);
            list.add(crypto);
        }
        return list;
    }
}
