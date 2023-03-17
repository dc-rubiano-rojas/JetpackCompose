package com.example.jetpackcomponentscatalog

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarBorder
import androidx.compose.material.icons.rounded.Verified
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomponentscatalog.components.MyAlertDialog
import com.example.jetpackcomponentscatalog.ui.theme.JetpackComponentsCatalogTheme
import com.example.jetpackcomponentscatalog.utils.CheckInfo
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComponentsCatalogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //MyBox()
                    //MyColum()
                    //MyRow()
                    //MyComplexLayout()
                    //MyStateExample()

                   // MyText()

                    //var myText by remember { mutableStateOf("") }
                    //MyTextField(myText) { myText = it }

                    //MyTextFieldAdvanced()

                    //Column() {
                     //   MyTextFieldOutlined()
                    //}

                    //MyButtonExample()

                    //MyImage()
                    //MyImageAdvanced()
                    //MyIcon()

                    //MyProgress()
                    //MyProgressAdvanced()

                    //MySwitch()


                    //MyCheckBox()
                    val myOption = getOptions(titles = listOf("a", "b", "c"))
                    var selected by remember {
                          mutableStateOf("Daniel")
                    }
                    //Column() {
                        //MyCheckBoxWithText()
                        //MyTriStatusCheckBox()
                        //myOption.forEach {
                        //    MyCheckBoxWithTextCompleted(it)
                        //}
                        //MyRadioButton()
                        //MyRadioButtonList(selected) { selected = it }
                    //}

                    //Column() {
                        //MyCard()
                    //}

                    //Column() {
                    //    MyBadgeBox()
                    //}
                    Divider()

                    //Column() {
                      //  MyDropDownMenu()
                    //}

                    //Column() {
                        //BasicSlider()
                      //  AdvancedSlider()
                        //MyRangeSlider()
                    //}
                    MyAlertDialog()

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComponentsCatalogTheme {
        //MyTextField()
        //MyTextField()
        //MyTextFieldAdvanced()
        //MyTextFieldOutlined()
        //MyButtonExample()
        //MyImage()
        //MyImageAdvanced()
        // MyIcon()
        //MyProgress()
        //MyProgressAdvanced()
        //MySwitch()
        //MyCheckBox()

        //MyCheckBoxWithTextCompleted()
        MyBadgeBox()
        MyDivider()
        MyDropDownMenu()
    }
}


@Composable()
fun MyDivider() {
    Divider(
        Modifier
            .fillMaxWidth()
            .padding(45.dp), color = Color.Red)
}

@Composable
fun MyBadgeBox() {
    Column() {
        BadgedBox(modifier = Modifier.padding(16.dp),
            badge = {
                Badge(backgroundColor = Color.Green){
                    Text("30")
                }

            },
            content = {
                Icon(imageVector = Icons.Default.Star, contentDescription = "estrella")
            })
    }
}

@Composable()
fun MySwitch() {
    var state by rememberSaveable { mutableStateOf(true) }
    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            checkedThumbColor = Color.Green,
            uncheckedTrackColor = Color.Magenta,
            checkedTrackColor = Color.Cyan,
            uncheckedTrackAlpha = 0.1f,
            checkedTrackAlpha = 0.1f
        )
    )
}








