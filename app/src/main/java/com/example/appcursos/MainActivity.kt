package com.example.appcursos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcursos.ui.theme.AppCursosTheme
import com.example.appcursos.ui.components.screens.InicioScreen
import com.example.appcursos.ui.components.screens.CursosScreen
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.appcursos.ui.components.screens.PerfilScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppCursosTheme {
                var pantallaActual by remember {
                    mutableStateOf("Inicio")
                }

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    when (pantallaActual) {

                        "Inicio" -> InicioScreen(
                            modifier = Modifier.padding(innerPadding),
                            onOpcionClick = { opcion ->
                                pantallaActual = opcion
                            }
                        )

                        "Cursos" -> CursosScreen(
                            modifier = Modifier.padding(innerPadding),
                            onOpcionClick = { opcion ->
                                pantallaActual = opcion
                            },
                            onCursoClick = { curso ->
                                // Después puedes navegar al detalle del curso
                            }
                        )


                        "Perfil" -> PerfilScreen(
                            modifier = Modifier.padding(innerPadding),
                            onOpcionClick = { opcion ->
                                pantallaActual = opcion
                            }
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun InicioPreview() {
    AppCursosTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->

            InicioScreen(
                modifier = Modifier.padding(innerPadding),
                onOpcionClick = { }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CursosPreview() {
    AppCursosTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->

            CursosScreen(
                modifier = Modifier.padding(innerPadding),
                onOpcionClick = { }
            ) { }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PerfilPreview() {
    AppCursosTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->

            PerfilScreen(
                modifier = Modifier.padding(innerPadding),
                onOpcionClick = { }
            )
        }
    }
}