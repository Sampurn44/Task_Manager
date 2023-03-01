package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   TaskToDo()
                }
            }
        }
    }
}

@Composable
fun TaskToDo(){
    TaskManan(
        imagePainter = painterResource(R.drawable.ic_task_completed),
        firstline = stringResource(R.string.completion),
        secondline = stringResource(R.string.nicework)
    )
}
@Composable
fun TaskManan(imagePainter : Painter, firstline : String , secondline : String) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column ( modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Image(painter = image, contentDescription =null)
        Text(
            text = firstline,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = secondline,
            fontSize = 16.sp
        )

    }
}

@Preview(showBackground = true)
@Composable
fun TaskMananPreview() {
    TaskManagerTheme {
        TaskToDo()
    }
}