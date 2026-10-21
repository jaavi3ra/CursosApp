package com.example.appcursos.ui.components.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.appcursos.ui.components.molecules.OpcionPerfil

@Composable
fun OpcionesPerfil() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column {

            OpcionPerfil(
                texto = "Editar perfil"
            )

            OpcionPerfil(
                texto = "Notificaciones"
            )

            OpcionPerfil(
                texto = "Ayuda"
            )
        }
    }
}