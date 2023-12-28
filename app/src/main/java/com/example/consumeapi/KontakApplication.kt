package com.example.consumeapi

import android.app.Application
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.consumeapi.repositori.AppContainer
import com.example.consumeapi.repositori.KontakContainer

class KontakApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }

    @Composable
    fun TopAppBarKontak(
        title: String,
        canNavigateBack: Boolean,
        modifier: Modifier = Modifier,
        scrollBehavior: TopAppBarScrollBehavior? = null,
        navigateUp: () -> Unit = {}
    ){

    }
}