package com.example.uts_prakmobile_andhikamalik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.uts_prakmobile_andhikamalik.ui.theme.UTSPrakMobileAndhikaMalikTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UTSPrakMobileAndhikaMalikTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.FoodApp.route) {
        composable(route = Screen.FoodApp.route) {
            FoodApp(navController = navController)
        }
        composable(
            route = Screen.SecondPage.route + "/{nama}/{lokasi}",
            arguments = listOf(
                navArgument("nama") {
                    type = NavType.StringType
                    defaultValue = "Andhika Malik"
                    nullable = true
                },
                navArgument("lokasi") {
                    type = NavType.StringType
                    defaultValue = "Cibiru"
                    nullable = true
                }
            )
        ) { entry ->
            SecondPage(
                nama = entry.arguments?.getString("nama"),
                lokasi = entry.arguments?.getString("lokasi"),
                navController = navController
            )
        }
        composable(
            route = Screen.ThirdPage.route + "/{nama}/{lokasi}",
            arguments = listOf(
                navArgument("nama") {
                    type = NavType.StringType
                    defaultValue = "Andhika Malik"
                    nullable = true
                },
                navArgument("lokasi") {
                    type = NavType.StringType
                    defaultValue = "Cibiru"
                    nullable = true
                }
            )
        ){entry ->
            ThirdPage(
                nama = entry.arguments?.getString("nama"),
                lokasi = entry.arguments?.getString("lokasi"),
                navController = navController
            )
        }
        composable(
            route = Screen.PizzaPage.route + "/{nama}/{lokasi}",
            arguments = listOf(
                navArgument("nama") {
                    type = NavType.StringType
                    defaultValue = "Andhika Malik"
                    nullable = true
                },
                navArgument("lokasi") {
                    type = NavType.StringType
                    defaultValue = "Cibiru"
                    nullable = true
                }
            )
        ) {entry ->
            PizzaPage(
                nama = entry.arguments?.getString("nama"),
                lokasi = entry.arguments?.getString("lokasi"),
                navController = navController
            )
        }
        composable(
            route = Screen.SteakPage.route + "/{nama}/{lokasi}",
            arguments = listOf(
                navArgument("nama") {
                    type = NavType.StringType
                    defaultValue = "Andhika Malik"
                    nullable = true
                },
                navArgument("lokasi") {
                    type = NavType.StringType
                    defaultValue = "Cibiru"
                    nullable = true
                }
            )
        ) {entry ->
            SteakPage(
                nama = entry.arguments?.getString("nama"),
                lokasi = entry.arguments?.getString("lokasi"),
                navController = navController
            )
        }
        composable(
            route = Screen.SpaghettiPage.route + "/{nama}/{lokasi}",
            arguments = listOf(
                navArgument("nama") {
                    type = NavType.StringType
                    defaultValue = "Andhika Malik"
                    nullable = true
                },
                navArgument("lokasi") {
                    type = NavType.StringType
                    defaultValue = "Cibiru"
                    nullable = true
                }
            )
        ) {entry ->
            SpaghettiPage(
                nama = entry.arguments?.getString("nama"),
                lokasi = entry.arguments?.getString("lokasi"),
                navController = navController
            )
        }
        composable(
            route = Screen.BurgerPage.route + "/{nama}/{lokasi}",
            arguments = listOf(
                navArgument("nama") {
                    type = NavType.StringType
                    defaultValue = "Andhika Malik"
                    nullable = true
                },
                navArgument("lokasi") {
                    type = NavType.StringType
                    defaultValue = "Cibiru"
                    nullable = true
                }
            )
        ) {entry ->
            BurgerPage(
                nama = entry.arguments?.getString("nama"),
                lokasi = entry.arguments?.getString("lokasi"),
                navController = navController
            )
        }
        composable(
            route = Screen.OrderDetail.route + "/{nama}/{lokasi}/{pesanan}",
            arguments = listOf(
                navArgument("nama") {
                    type = NavType.StringType
                    defaultValue = "Andhika Malik"
                    nullable = true
                },
                navArgument("lokasi") {
                    type = NavType.StringType
                    defaultValue = "Cibiru"
                    nullable = true
                },
                navArgument("pesanan") {
                    type = NavType.StringType
                    defaultValue = "Burger Spongebob"
                    nullable = true
                }
            )
        ) { entry ->
            OrderDetail(
                nama = entry.arguments?.getString("nama"),
                lokasi = entry.arguments?.getString("lokasi"),
                pesanan = entry.arguments?.getString("pesanan"),
                navController = navController
            )
        }
    }
}
