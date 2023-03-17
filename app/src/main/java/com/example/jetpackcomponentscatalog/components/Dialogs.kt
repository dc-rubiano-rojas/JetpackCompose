package com.example.jetpackcomponentscatalog.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.jetpackcomponentscatalog.MyRadioButtonList
import com.example.jetpackcomponentscatalog.R

@Composable
fun MyConfirmationDialog(
    show: Boolean,
    onDismiss: () -> Unit,
) {
    if(!show) {return}

    Dialog(onDismissRequest = { onDismiss() }) {
        Column(
            Modifier
                .background(Color.White, shape = RoundedCornerShape(percent = 2))
                .fillMaxWidth(),
        ) {
            MyDialogTitle(text = "Phone ringtone", Modifier.padding(24.dp))
            Divider(Modifier.fillMaxWidth(), color = Color.LightGray)

            var status by remember { mutableStateOf("") }
            MyRadioButtonList(status) { status = it }
            Divider(Modifier.fillMaxWidth(), color = Color.LightGray)

            Row(Modifier.align(Alignment.End).padding(8.dp)) {
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Cancel")
                }
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Ok")
                }
            }
        }
    }
}

@Composable
fun MyCustomDialog(
    show: Boolean,
    onDismiss: () -> Unit,
) {
    if(!show) {return}

    Dialog(
        onDismissRequest = { onDismiss() }){
        Column(
            Modifier
                .background(Color.White)
                .padding(24.dp)
                .fillMaxWidth()) {

            MyDialogTitle(text = "Set backup account")

            AccountItem("ejemplo1@gmail.com", R.drawable.avatar)
            AccountItem("ejemplo2@gmail.com", R.drawable.avatar)

            AccountItem("Add new account", R.drawable.add)
        }
    }
}

@Composable
fun AccountItem(email: String, @DrawableRes drawable: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = drawable),
            contentDescription = "Avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(40.dp)
                .clip(CircleShape)
        )

        Text(
            text = email,
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun MyDialogTitle(text: String, modifier: Modifier = Modifier.padding(bottom = 12.dp)) {
    Text(
        text = text,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        modifier = modifier
    )
}


@Composable
fun MySimpleCustomDialog(
    show: Boolean,
    onDismiss: () -> Unit,
) {
    if(!show) {return}

    Dialog(
        onDismissRequest = { onDismiss() },
        properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = true)
    ) {
        Column(
            Modifier
                .background(Color.White)
                .padding(24.dp)
                .fillMaxWidth()) {
            Text(text = "EXAMPLE")
        }
    }
}

@Composable
fun MyAlertDialog(
    show: Boolean,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    if(!show) {return}

    AlertDialog(
        onDismissRequest = {onDismiss()},
        title = { Text("Title") },
        text = { Text(text = "Description") },
        confirmButton = {
            TextButton(onClick = {onConfirm()}) {
                Text(text = "Confirm")
            }
        },
        dismissButton = {
            TextButton(onClick = {onDismiss()}) {
                Text(text = "Dismiss")
            }
        }
    )
}