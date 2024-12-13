package com.example.mvvmdatabase.ui.viewmodel

import androidx.core.app.NotificationCompat.MessagingStyle.Message
import com.example.mvvmdatabase.data.entity.Mahasiswa

data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)