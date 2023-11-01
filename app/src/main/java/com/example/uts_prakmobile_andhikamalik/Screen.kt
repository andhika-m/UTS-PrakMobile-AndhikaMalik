package com.example.uts_prakmobile_andhikamalik

sealed class Screen (val route: String) {
    object FoodApp : Screen("food_app")
    object SecondPage : Screen(route = "second_page")
    object ThirdPage : Screen(route = "third_page")
    object PizzaPage : Screen(route = "pizza_page")
    object SteakPage : Screen(route = "steak_page")
    object SpaghettiPage : Screen(route = "spaghetti_page")
    object BurgerPage : Screen(route = "burger_page")
    object OrderDetail : Screen(route = "order_detail")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}