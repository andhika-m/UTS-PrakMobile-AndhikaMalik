package com.example.uts_prakmobile_andhikamalik

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.uts_prakmobile_andhikamalik.ui.theme.*
import com.example.uts_prakmobile_andhikamalik.ui.theme.UTSPrakMobileAndhikaMalikTheme

@Composable
fun ThirdPage(nama: String?, lokasi: String?, navController: NavController?) {
    var isPopupVisible by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.background(color = White01)
    ) {
        Box(
            contentAlignment = Alignment.BottomEnd,
        ) {
            Column(
                modifier = Modifier.background(color = White01),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp)
                ) {
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
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp)
                        .clickable {
                            navController?.navigate(Screen.PizzaPage.withArgs(nama!!, lokasi!!))
                        }
                ) {
                    Spacer(modifier = Modifier.width(18.dp))
                    Image(
                        painter = painterResource(id = R.drawable.__pepperoni_pizza),
                        contentDescription = null,
                        modifier = Modifier
                            .size(126.dp)
                            .clip(CircleShape)
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp)
                    ) {
                        Text(
                            text = "Pepperoni Pizza",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Red01
                        )
                        Text(
                            text = stringResource(R.string.pepperoni_pizza_desc),
                            fontSize = 16.sp,
                            color = Red01
                        )
                    }
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp)
                        .clickable {
                            navController?.navigate(Screen.SpaghettiPage.withArgs(nama!!, lokasi!!))
                        }
                ) {
                    Spacer(modifier = Modifier.width(18.dp))
                    Image(
                        painter = painterResource(id = R.drawable.__spaghetti_poll_pedas),
                        contentDescription = null,
                        modifier = Modifier
                            .size(126.dp)
                            .clip(CircleShape)
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp)
                    ) {
                        Text(
                            text = "Spaghetti",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Red01
                        )
                        Text(
                            text = stringResource(R.string.spaghetti_desc),
                            fontSize = 16.sp,
                            color = Red01
                        )
                    }
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp)
                        .clickable {
                            navController?.navigate(Screen.BurgerPage.withArgs(nama!!, lokasi!!))
                        }
                ) {
                    Spacer(modifier = Modifier.width(18.dp))
                    Image(
                        painter = painterResource(id = R.drawable.__burger),
                        contentDescription = null,
                        modifier = Modifier
                            .size(126.dp)
                            .clip(CircleShape)
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp)
                    ) {
                        Text(
                            text = "Burger",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Red01
                        )
                        Text(
                            text = stringResource(R.string.burger_desc),
                            fontSize = 16.sp,
                            color = Red01
                        )
                    }
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp)
                        .clickable {
                            navController?.navigate(Screen.SteakPage.withArgs(nama!!, lokasi!!))
                        }
                ) {
                    Spacer(modifier = Modifier.width(18.dp))
                    Image(
                        painter = painterResource(id = R.drawable.__steak),
                        contentDescription = null,
                        modifier = Modifier
                            .size(126.dp)
                            .clip(CircleShape)
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp)
                    ) {
                        Text(
                            text = "Steak",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Red01
                        )
                        Text(
                            text = stringResource(R.string.steak_desc),
                            fontSize = 16.sp,
                            color = Red01
                        )
                    }
                }
            }
            Box(
                contentAlignment = Alignment.BottomEnd,
                modifier = Modifier
                    .padding(end = 22.dp)
                    .clickable {
                        isPopupVisible = true
                    }

            ) {
                Image(
                    painter = painterResource(id = R.drawable.plus_positive_add_mathematical_symbol),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(White01),
                    modifier = Modifier
                        .size(62.dp)
                        .clip(CircleShape)
                        .background(Red01)
                        .padding(13.dp)
                )
            }
            if (isPopupVisible) {
                DropdownMenu(
                    expanded = isPopupVisible,
                    onDismissRequest = { isPopupVisible = false },
                    modifier = Modifier
                        .requiredSize(height = 260.dp, width = 300.dp)
                        .background(Red02)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Pilih Menu:",
                        color = Red01,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                    // Tambahkan item menu
                    DropdownMenuItem(text = { Text(text = "Pepperoni Pizza", color = Red01, fontSize = 16.sp) }, onClick = {
                        isPopupVisible = false
                        navController?.navigate(Screen.PizzaPage.withArgs(nama!!, lokasi!!))
                    })

                    DropdownMenuItem(text = { Text(text = "Spaghetti", color = Red01, fontSize = 16.sp) },onClick = {
                        isPopupVisible = false
                        navController?.navigate(Screen.SpaghettiPage.withArgs(nama!!, lokasi!!))
                    })

                    DropdownMenuItem(text = { Text(text = "Burger", color = Red01, fontSize = 16.sp) }, onClick = {
                        isPopupVisible = false
                        navController?.navigate(Screen.BurgerPage.withArgs(nama!!, lokasi!!))
                    })

                    DropdownMenuItem(text = { Text(text = "Steak", color = Red01, fontSize = 16.sp) },onClick = {
                        isPopupVisible = false
                        navController?.navigate(Screen.SteakPage.withArgs(nama!!, lokasi!!))
                    })
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ThridPagePreview() {
    UTSPrakMobileAndhikaMalikTheme {
//        ThirdPage("Dhika")
    }
}