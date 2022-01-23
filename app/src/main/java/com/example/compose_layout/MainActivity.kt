package com.example.compose_layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_layout.ui.theme.ComposeLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    ComposeLayoutTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            //ColumnLayoutArrangementTop()
            //ColumnLayoutArrangementCenter()
            //ColumnLayoutArrangementBottom()
            //ColumnLayoutArrangementSpaceAround()
            //ColumnLayoutArrangementSpaceBetween()
            //ColumnLayoutArrangementSpaceEvenly()
            //ColumnLayoutAlignmentStart()
            //ColumnLayoutAlignmentCenterHorizontally()
            //ColumnLayoutAlignmentEnd()
            //RowLayout()
            //RowLayoutStart()
            //RowLayoutCenter()
            //RowLayoutEnd()
            //RowLayoutSpaceAround()
            //RowLayoutSpaceBetween()
            //RowLayoutSpaceEvenly()
            //RowLayoutTop()
            //RowLayoutCenterVertically()
            RowLayoutBottom()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLayoutTheme {
        MyApp()
    }
}

//Vertical Arrangement Example

//Top – align children to the top of the column
@Composable
fun ColumnLayoutArrangementTop() {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)
            .border(2.dp, Color.Black)
            .padding(8.dp)
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}


//Center-align children at the center of the column
@Composable
fun ColumnLayoutArrangementCenter() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)
            .border(2.dp, Color.Black)
            .padding(8.dp)
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}

//Bottom – align children to the bottom of the column
@Composable
fun ColumnLayoutArrangementBottom() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)//outer padding
            .border(2.dp, Color.Black)
            .padding(8.dp)//inner padding
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}

//Space Around – evenly distribute the children within the column.
// As well as adding space before the first child and after the last child,
// half of that spacing will also be added between each consecutive child.
@Composable
fun ColumnLayoutArrangementSpaceAround() {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)//outer padding
            .border(2.dp, Color.Black)
            .padding(8.dp)//inner padding
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}

//Space Between – evenly distribute the children within the column,
// without adding space before the first child or after the last child
@Composable
fun ColumnLayoutArrangementSpaceBetween() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)//outer padding
            .border(2.dp, Color.Black)
            .padding(8.dp)//inner padding
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}

//Space Evenly – evenly distribute the children within the column,
// also adding space before the first child and after the last child
@Composable
fun ColumnLayoutArrangementSpaceEvenly() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)//outer padding
            .border(2.dp, Color.Black)
            .padding(8.dp)//inner padding
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}

//Horizontal Arrangement Example
// :this allows us to position all of the Column children on the horizontal axis.

//Start – align the children to the start of the horizontal axis
@Composable
fun ColumnLayoutAlignmentStart() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)//outer padding
            .border(2.dp, Color.Black)
            .padding(8.dp)//inner padding
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}

//CenterHorizontally – align the children at the center of the horizontal axis
@Composable
fun ColumnLayoutAlignmentCenterHorizontally() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)//outer padding
            .border(2.dp, Color.Black)
            .padding(8.dp)//inner padding
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}

//End – align the children at the end of the horizontal axis
@Composable
fun ColumnLayoutAlignmentEnd() {
    Column(
        horizontalAlignment = Alignment.End,
        modifier = Modifier
            .fillMaxSize()
            .height(250.dp)
            .padding(10.dp)//outer padding
            .border(2.dp, Color.Black)
            .padding(8.dp)//inner padding
    ) {
        Text(text = "line number 1")
        Text(text = "line number 2")
    }
}


//ROW LAYOUT

@Composable
fun RowLayout() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}
//horizontalArrangement:
//It’s the same as the column’s verticalArrangement, but the direction will be in the vertical axis.

//Start– align children to the start of the row
@Composable
fun RowLayoutStart() {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}

//Center – align children at the center of the row
@Composable
fun RowLayoutCenter() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}

//End – align the children at the end of the row
@Composable
fun RowLayoutEnd() {
    Row(
        horizontalArrangement = Arrangement.End,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}

//Space Around – evenly distribute the children within the row.
// As well as adding space before the first child and after the last child,
// half of that spacing will also be added between each consecutive child.
@Composable
fun RowLayoutSpaceAround() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}

//Space Between – evenly distribute the children within the row,
//without adding space before the first child or after the last child.
@Composable
fun RowLayoutSpaceBetween() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}
//Space Evenly – evenly distribute the children within the row,
// also adding space before the first child and after the last child.
@Composable
fun RowLayoutSpaceEvenly() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Composable
fun RowLayoutTop() {
    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Composable
fun RowLayoutCenterVertically() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Composable
fun RowLayoutBottom() {
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box One", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Red)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Two", modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(100.dp, 100.dp)
        ) {
            Text(text = "Box Three", modifier = Modifier.align(Alignment.Center))
        }
    }
}