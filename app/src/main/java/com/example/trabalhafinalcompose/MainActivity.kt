package com.example.trabalhafinalcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.trabalhafinalcompose.ui.AppLancamentos
import com.example.trabalhafinalcompose.ui.theme.TrabalhaFinalComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrabalhaFinalComposeTheme {
                AppLancamentos()
            }
        }
    }
}