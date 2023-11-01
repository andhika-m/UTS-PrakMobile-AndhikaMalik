package com.example.uts_prakmobile_andhikamalik

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.uts_prakmobile_andhikamalik.ui.theme.*
import com.example.uts_prakmobile_andhikamalik.ui.theme.UTSPrakMobileAndhikaMalikTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodApp(navController: NavController) {
    val options = listOf("Cibiru", "Cihampelas", "Ujung Berung")
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[0]) }

    Column (
        modifier = Modifier.background(color = White01),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            val image = painterResource(id = R.drawable.pizza_shop)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .requiredSize(220.dp)
            )
            Text(
                text = stringResource(R.string.lokasi_store),
                fontSize = 21.sp,
                color = Red01,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 50.dp, bottom = 10.dp)
            )

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded }
            ) {
                TextField(
                    value = selectedOptionText,
                    onValueChange = { },
                    readOnly = true,
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = "Dropdown",
                            tint = Red01,
                            modifier = Modifier.size(55.dp)
                        )
                    },
                    modifier = Modifier.menuAnchor(),
                    colors = ExposedDropdownMenuDefaults.textFieldColors(
                        textColor = Color.Black,
                        containerColor = Red02
                    )
                )
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    options.forEach { selectionOption ->
                        DropdownMenuItem(
                            text = {
                                Text(
                                    text = selectionOption,
                                    fontSize = 16.sp
                                )
                            },
                            onClick = {
                                selectedOptionText = selectionOption
                                expanded = false
                            },
                        )
                    }
                }
            }

            Text(
                text = stringResource(R.string.your_name),
                fontSize = 21.sp,
                color = Red01,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 30.dp, bottom = 10.dp)
            )

            var customerName by remember {
                mutableStateOf("")
            }
            TextField(
                value = customerName,
                placeholder = { Text(text = "Please Fill Your Name", color = Color.Gray)},
                onValueChange = { customerName = it },
                colors = ExposedDropdownMenuDefaults.textFieldColors(
                    containerColor = Red02,
                    textColor = Color.Black
                ),
            )

            Button(
                onClick = {
                    navController.navigate(Screen.SecondPage.withArgs(customerName, selectedOptionText))
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Red01),
                modifier = Modifier
                    .padding(top = 26.dp)
                    .widthIn(280.dp)
            ) {
                Text(
                    text = "Submit",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = White01
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FoodAppPreview() {
    UTSPrakMobileAndhikaMalikTheme {
        FoodApp(rememberNavController())
    }
}