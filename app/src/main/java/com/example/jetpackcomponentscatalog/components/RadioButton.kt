package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable()
fun MyRadioButtonList(name: String, onItemSelected:(String) -> Unit) {

    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Daniel", onClick = { onItemSelected("Daniel")})
            Text(text = "Daniel")
        }
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Camilo", onClick = { onItemSelected("Camilo") })
            Text(text = "Camilo")
        }
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Victor", onClick = { onItemSelected("Victor") })
            Text(text = "Victor")
        }
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Cristina", onClick = { onItemSelected("Cristina") })
            Text(text = "Cristina")
        }
    }
}

@Composable()
fun MyRadioButton() {

    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        var state by rememberSaveable { mutableStateOf(false) }

        RadioButton(selected = state, onClick = { state = !state }, colors = RadioButtonDefaults.colors(
            selectedColor = Color.Red,
            unselectedColor = Color.Yellow,
            disabledColor = Color.Green
        ))
        Text(text = "My Radio button")
    }

}