package com.example.uts_prakmobile_andhikamalik

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.navigation.NavController
import com.example.uts_prakmobile_andhikamalik.ui.theme.*
import com.example.uts_prakmobile_andhikamalik.ui.theme.UTSPrakMobileAndhikaMalikTheme

@Composable
fun SecondPage(nama: String?, lokasi: String?, navController: NavController?) {
    Column (
        modifier = Modifier.background(color = White01),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            val iconUser = painterResource(id = R.drawable.user)
            Image(
                painter = iconUser,
                contentDescription = null,
                modifier = Modifier
                    .requiredSize(72.dp)
                    .padding(18.dp)
            )

            Text(
                text = "Hello, $nama",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.Black
            )
        }
        Image(
            painter = painterResource(id = R.drawable.ciwalk_bandung),
            contentDescription = null,
            modifier = Modifier
                .requiredSize(height = 240.dp, width = 500.dp)
                .fillMaxWidth()
        )
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 24.dp, start = 24.dp, end = 24.dp)
        ) {
            Text(
                text = stringResource(R.string.lokasi_store),
                fontSize = 21.sp,
                color = Color(0xffe74c3c),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "$lokasi",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color(0xffe74c3c),
            )
        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 20.dp, start = 24.dp, end = 24.dp)
        ) {
            Text(
                text = "Location",
                fontSize = 21.sp,
                color = Color(0xffe74c3c),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Row (
                verticalAlignment = Alignment.Bottom,
            ) {
                Text(
                    text = "Find on Maps",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color(0xffe74c3c),
                    modifier = Modifier.padding(end = 8.dp)
                )
                val placeholder = painterResource(id = R.drawable.placeholder)
                Image(
                    painter = placeholder,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color(0xffe74c3c)),
                    modifier = Modifier.requiredSize(26.dp)
                )
            }
        }
        Button(
            onClick = {
                navController?.navigate(Screen.ThirdPage.withArgs(nama!!, lokasi!!))
            },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xffe74c3c)),
            modifier = Modifier
                .padding(top = 26.dp)
                .widthIn(280.dp)
        ) {
            Text(
                text = "Submit",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SecondPagePreview() {
    UTSPrakMobileAndhikaMalikTheme {
//        SecondPage("Dhika", "Cibiru")
    }
}