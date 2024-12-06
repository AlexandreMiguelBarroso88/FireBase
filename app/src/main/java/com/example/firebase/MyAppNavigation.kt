package com.example.firebase

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebase.pages.HomePage
import com.example.firebase.pages.LoginPage
import com.example.firebase.pages.SignUpPage

@Composable
fun MyNavigationController(modifier: Modifier = Modifier, authViewModel: AuthViewModel){
    val navController = rememberNavController()
    NavHost(navController, startDestination = "login", builder = {
        composable("login"){
            LoginPage(modifier, navController, authViewModel)
        }
        composable("signup"){
            SignUpPage(modifier, navController, authViewModel)
        }
        composable("home"){
            HomePage(modifier, navController, authViewModel)
        }

    })
}