package com.example.ikqr

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {

    private val _isloading = MutableStateFlow(true)
    val isloading = _isloading
    init {
        viewModelScope.launch {
            delay(2000)
            _isloading.value= false
        }
    }
}