package com.example.mvvmdatabase.ui.viewmodel

import com.example.mvvmdatabase.data.entity.Mahasiswa

fun Mahasiswa.toDetailUiEvent():MahasiswaEvent{
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}