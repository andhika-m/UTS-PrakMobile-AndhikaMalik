package com.example.uts_prakmobile_andhikamalik

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.uts_prakmobile_andhikamalik.ui.theme.*
import com.example.uts_prakmobile_andhikamalik.ui.theme.UTSPrakMobileAndhikaMalikTheme

@Composable
fun OrderDetail(nama: String?, lokasi: String?, pesanan: String?, navController: NavController?) {
    var selectedDeliveryOption by remember { mutableStateOf<DeliveryOption?>(null) }
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .background(color = White01)
            .padding(start = 48.dp, top = 30.dp, end = 48.dp)
    ) {
        Column(
            modifier = Modifier
                .background(color = White01)
        ) {
            Text(
                text = "Order Detail",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(bottom = 18.dp)
            )
            Text(
                text = "$nama",
                color = Color.Black,
            )
            Text(
                text = "Store: $lokasi",
                color = Color.Black,
            )
            Text(
                text = "$pesanan sudah dipesan",
                color = Color.Black,
            )

            Text(
                text = "Pengiriman",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 20.dp)
            )
            val options = listOf(
                DeliveryOption(name = "Ambil Sendiri", message = "dapat diambil di store $lokasi"),
                DeliveryOption(name = "Fast Delivery (Minimal 30 menit sampai)", message = "dikirim menggunakan fast delivery")
            )
            options.forEach { option ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    val isChecked = option == selectedDeliveryOption
                    Checkbox(
                        checked = isChecked,
                        onCheckedChange = {
                            if (it) {
                                selectedDeliveryOption = option
                            }
                        },
                        enabled = true,
                        colors = CheckboxDefaults.colors(
                            checkedColor = Orange01,
                            uncheckedColor = Color.DarkGray,
                            checkmarkColor = Color.Black
                        ),
                    )
                    Text(
                        text = option.name,
                        color = Orange01
                    )
                }
            }
        }
        val openDialog = remember { mutableStateOf(false) }

        Button(
            onClick = {
                      openDialog.value = true
            },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xffe74c3c)),
            modifier = Modifier
                .padding(top = 66.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Order Now",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF)
            )
        }
        if (openDialog.value) {
            AlertDialog(
                onDismissRequest = {
                    openDialog.value = false
                },
                title = {
                    Text("Terima Kasih $nama")
                },
                text = {
                    Text(
                        "Pesanan $pesanan anda akan ${
                            selectedDeliveryOption?.message ?: "Tidak ada metode pengiriman terpilih"
                        }"
                    )
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            openDialog.value = false
                        }
                    ) {
                        Text("OK")
                    }
                }
            )
        }
    }
}

data class DeliveryOption(val name: String, val message: String)

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OrderDetailPreview() {
    UTSPrakMobileAndhikaMalikTheme {
        OrderDetail("nama", "Bandung", "Burger", rememberNavController())
    }
}