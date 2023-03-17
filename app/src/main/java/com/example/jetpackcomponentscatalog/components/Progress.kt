package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable()
fun MyProgressAdvanced() {
    var progressStatus by rememberSaveable { mutableStateOf(0f) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp), Arrangement.Center, Alignment.CenterHorizontally) {
        CircularProgressIndicator(progress = progressStatus)
        LinearProgressIndicator(progress = progressStatus, Modifier.padding(32.dp), color = Color.Red, backgroundColor = Color.Green)

        Row(Modifier.fillMaxWidth(), Arrangement.Center) {
            Button(onClick = { progressStatus += 0.1f }) {
                Text(text = "+")
            }
            Button(onClick = { progressStatus -= 0.1f }) {
                Text(text = "-")
            }
        }
    }
}

@Composable()
fun MyProgress() {
    var showLoading by rememberSaveable { mutableStateOf(false) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp), Arrangement.Center, Alignment.CenterHorizontally) {
        if (showLoading) {
            CircularProgressIndicator(color= Color.Red, strokeWidth = 10.dp)
            LinearProgressIndicator(Modifier.padding(32.dp), color = Color.Red, backgroundColor = Color.Green)
        }

        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "Press")
        }
    }
}