package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Verified
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable()
fun MyIcon() {
    Column(Modifier.fillMaxSize()) {
        Icon(imageVector = Icons.Rounded.Verified, contentDescription = "Icono", tint = Color.Green)
    }
}

@Composable()
fun MyImageAdvanced() {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "My description",
            // alpha is Opacity
            alpha = 0.5f,
            //modifier = Modifier.clip(RoundedCornerShape(100f))
            modifier = Modifier
                .clip(CircleShape)
                .border(5.dp, Color.Red, CircleShape)
        )
    }
}

@Composable()
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "My description",
        // alpha is Opacity
        alpha = 0.5f
    )
}