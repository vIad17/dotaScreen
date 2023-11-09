package com.example.myapplication.app

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.myapplication.features.Footer
import com.example.myapplication.features.Header
import com.example.myapplication.features.Main

@Composable
fun App() {
    LazyColumn() {
        item { Header() }
        item { Main() }
        item { Footer() }
    }
}