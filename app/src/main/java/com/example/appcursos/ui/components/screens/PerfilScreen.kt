package com.example.appcursos.ui.components.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.appcursos.ui.components.atoms.BotonRojo
import com.example.appcursos.ui.components.molecules.InfoPerfil
import com.example.appcursos.ui.components.molecules.PerfilUsuarioCard
import com.example.appcursos.ui.components.organisms.BottomNavigation
import com.example.appcursos.ui.components.organisms.HeaderInicio
import com.example.appcursos.ui.components.organisms.OpcionesPerfil

@Composable
fun PerfilScreen(
    modifier: Modifier = Modifier,
    onOpcionClick: (String) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6))
            .padding(20.dp)
    ) {

        HeaderInicio(
            seccion = "Perfil"
        )
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            PerfilUsuarioCard(
                nombre = "Alex Mendoza",
                correo = "alex@ejemplo.com"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                InfoPerfil(
                    numero = "3",
                    texto = "Cursos",
                    modifier = Modifier.weight(1f)
                )

                InfoPerfil(
                    numero = "4",
                    texto = "Certificados",
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            OpcionesPerfil()

            Spacer(modifier = Modifier.height(24.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                BotonRojo(
                    texto = "Cerrar sesión",
                    onClick = { }
                )
            }
        }

        BottomNavigation(
            opcionSeleccionada = "Perfil",
            onOpcionClick = onOpcionClick
        )
    }


}

@Composable
fun InfoPerfil(numero: String, texto: String, modifier: Modifier) {
    TODO("Not yet implemented")
}

@Composable
fun PerfilUsuarioCard(nombre: String, correo: String) {
    TODO("Not yet implemented")
}
