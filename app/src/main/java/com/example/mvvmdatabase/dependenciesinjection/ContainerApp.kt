package com.example.mvvmdatabase.dependenciesinjection

import android.content.Context
import com.example.mvvmdatabase.data.database.KrsDatabase
import com.example.mvvmdatabase.repositroy.LocalRepositoryMhs
import com.example.mvvmdatabase.repositroy.RepositoryMhs

interface InterfaceContainerApp{
    val repositoryMhs: RepositoryMhs
}

class ContainerApp (private val context: Context): InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}