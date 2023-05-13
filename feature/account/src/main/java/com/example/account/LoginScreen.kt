package com.example.account

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.component.SpotifyField
import com.example.ui.component.SpotifyPrimaryButton

@Composable
internal fun LoginRoute() {
    LoginScreen()
}

@Composable
internal fun LoginScreen() {
    Row(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(180.dp)
            )
            
            Spacer(modifier = Modifier.height(30.dp))

            SpotifyField(
                label = "Usuário"
            ) {

            }

            Spacer(modifier = Modifier.height(30.dp))

            SpotifyField(
                label = "Senha",
                imeAction = ImeAction.Done,
                isPassword = true
            ) {

            }

            Spacer(modifier = Modifier.height(30.dp))

            SpotifyPrimaryButton(
                title = "Entrar"
            ) {

            }
        }
    }
}