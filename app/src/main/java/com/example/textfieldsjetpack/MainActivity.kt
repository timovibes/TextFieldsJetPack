package com.example.textfieldsjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfieldsjetpack.ui.theme.TextFieldsJetPackTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextFieldsJetPackTheme {
                Surface(modifier = Modifier.fillMaxSize()){
                    TextFieldsJetPack()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldsJetPack() {
    var name by remember { mutableStateOf("") }
    var goal by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, top = 40.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        Text(text = "Please Enter your name: ")
        TextField(
            value = name,
            onValueChange = {name = it},
            label = { Text("Name") }
        )

        Text(text = "Enter your goal:")
        OutlinedTextField(
            value = goal,
            onValueChange = { goal = it },
            label = { Text("Goal") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "👋 Hello $name, your goal is: $goal")
    }
}