package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.material.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import com.example.jetpackcomponentscatalog.utils.CheckInfo

@Composable()
fun MyTriStatusCheckBox() {
    var state by rememberSaveable { mutableStateOf(ToggleableState.Off) }
    TriStateCheckbox(state = state, onClick = {
        state = when(state){
            ToggleableState.On -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })
}

@Composable()
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var status by rememberSaveable { mutableStateOf(false) }
        CheckInfo(
            title = it,
            selected = status,
            //onCheckedChange = {status = it}
            onCheckedChange = {myNewStatus -> status = myNewStatus}
        )
    }

}

@Composable()
fun MyCheckBoxWithTextCompleted(checkInfo: CheckInfo) {
    Row(
        Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkInfo.selected,
            onCheckedChange = { checkInfo.onCheckedChange(!checkInfo.selected) })
        Spacer (modifier = Modifier.width(8.dp))
        Text (text = checkInfo.title)
    }
}

@Composable()
fun MyCheckBoxWithText() {
    var state by rememberSaveable { mutableStateOf(true) }
    Row(
        Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(checked = state, onCheckedChange = { state = !state })
        Spacer (modifier = Modifier.width(8.dp))
        Text (text = "Ejemplo 1 ")
    }
}

@Composable()
fun MyCheckBox() {
    var state by rememberSaveable { mutableStateOf(true) }
    Checkbox(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Green,
            uncheckedColor = Color.Red,
            checkmarkColor = Color.Blue
        )
    )
}