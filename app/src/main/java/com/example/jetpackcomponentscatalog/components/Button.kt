package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable()
fun MyButtonExample() {

    var enabled by rememberSaveable { mutableStateOf(true) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            //onClick = { Log.i("daniel", "esto es un ejemplo") },
            onClick = { enabled = false },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta, contentColor = Color.Blue),
            border = BorderStroke(5.dp, Color.Black)
        ) {
            Text(text = "Press")
        }

        OutlinedButton(
            onClick = { enabled = false },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Magenta,
                contentColor = Color.Blue,
                disabledBackgroundColor = Color.Red,
                disabledContentColor = Color.Black
            ),
        ) {
            Text(text = "Press")
        }

        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Press")
        }
    }
}