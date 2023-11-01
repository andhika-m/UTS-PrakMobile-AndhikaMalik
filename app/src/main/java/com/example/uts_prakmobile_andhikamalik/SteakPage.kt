package com.example.uts_prakmobile_andhikamalik

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.uts_prakmobile_andhikamalik.ui.theme.*
import com.example.uts_prakmobile_andhikamalik.ui.theme.UTSPrakMobileAndhikaMalikTheme

@Composable
fun SteakPage(nama: String?, lokasi: String?, navController: NavController?) {
    val pesanan: String = stringResource(R.string.value_steak)
    Column (
        modifier = Modifier.background(color = White01),
        ) {
        Box(
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier
        ) {
            Image(painter = painterResource(
                id = R.drawable.__steakd),
                contentDescription = null
            )
            Text(
                text = pesanan,
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 32.dp, bottom = 16.dp)
            )
        }

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(22.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = "Price: Rp 99.000,00",
                    fontWeight = FontWeight.Bold,
                    color = Orange01,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = stringResource(id = R.string.steak_desc_lengkap),
                    textAlign = TextAlign.Justify,
                    color = Orange01,
                )
            }
            Button(
                onClick = {
                    navController?.navigate(Screen.OrderDetail.withArgs(nama!!, lokasi!!, pesanan))
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Color(0xffe74c3c)),
                modifier = Modifier
                    .padding(top = 26.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Order Now",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF)
                )
            }
            Button(
                onClick = {
                    navController?.navigate(Screen.ThirdPage.withArgs(nama!!, lokasi!!))
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Color(0xffe74c3c)),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Back",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF)
                )
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SteakPagePreview() {
    UTSPrakMobileAndhikaMalikTheme {
//        SteakPage("nama", rememberNavController())
    }
}