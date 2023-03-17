package com.example.jetpackcomponentscatalog

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun MyStateExample() {

    var counter by rememberSaveable { mutableStateOf(0) }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado ${counter} veces")
    }
}

@Composable
fun MySpacer(size: Int){
    Spacer(modifier = Modifier.height(size.dp))
}

// Column - Row - Box - Text - Spacer
@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            Alignment.Center
        ){
            Text(text = "Ejemplo 1")
        }

        MySpacer(size = 30)

        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)){
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow),
                Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }

        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Red), Alignment.BottomCenter
        ){
            Text(text = "Ejemplo 4")
        }
    }
}

@Composable
fun MyRow() {
/*    Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Ejemplo 1")
        Text(text = "Ejemplo 2")
        Text(text = "Ejemplo 3")
    }*/
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())) {
        Text(text = "Ejemplo 1", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo 2", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo 3", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo 4", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo 5", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo 6", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo 7", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo 8", modifier = Modifier.weight(1f))
    }
}

@Composable
fun MyColum() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Ejemplo 1", modifier = Modifier.background(Color.Blue)
            //  .weight(2f)
        )
        Text(text = "Ejemplo 2", modifier = Modifier.background(Color.Red)
            //    .weight(1f)
        )
        Text(text = "Ejemplo 3", modifier = Modifier.background(Color.Cyan)
            //    .weight(1f)
        )
    }
}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .background(Color.Cyan)
            .verticalScroll(rememberScrollState()),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "HELLO MY NAME IS ...")
        }
    }
}