package com.example.parquimetroeval1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.parquimetroeval1.navigation.AppNavigation
import com.example.parquimetroeval1.ui.theme.ParquimetroEval1Theme
import com.example.parquimetroeval1.ui.theme.ParquimetroEval1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ParquimetroEval1Theme {
                AppNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ParquimetroEval1Theme {
    }
}