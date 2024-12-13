package com.example.mvvmdatabase.repositroy

import com.example.mvvmdatabase.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMahasiswa():Flow<List<Mahasiswa>>
}