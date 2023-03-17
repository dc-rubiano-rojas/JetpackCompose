package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.layout.Column
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.RangeSlider
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment

@Composable
fun BasicSlider() {
    Column() {
        var sliderPosition by remember { mutableStateOf(0f) }
        Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
        Text(text = sliderPosition.toString())
    }
}

@Composable
fun AdvancedSlider() {
    Column() {
        var sliderPosition by remember { mutableStateOf(0f) }
        var completeValue by remember { mutableStateOf("") }

        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            onValueChangeFinished = { completeValue = sliderPosition.toString() },
            valueRange = 0f..10f,
            steps = 9
        )
        Text(text = completeValue)
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MyRangeSlider() {
    var currentRange by remember {
        mutableStateOf(5f..10f)
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        RangeSlider(
            values = currentRange,
            onValueChange = { currentRange = it },
            valueRange = 0f..15f,
            steps = 9
        )

        Text(text = "Valor Inferior ${currentRange.start}")
        Text(text = "Valor Superior ${currentRange.endInclusive}")
    }
}