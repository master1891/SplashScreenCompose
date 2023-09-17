package com.nels.master.splashscreencompose

import android.view.View
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {


    var loadingSplash by mutableStateOf(true)
        private set


    /*fun setLoading() {
        Thread.sleep(5000)
        loadingSplash = false
    }*/

    //Segunda forma
    fun setLoading() {
        viewModelScope.launch {
            delay(6000)
            loadingSplash = false
        }

    }


}