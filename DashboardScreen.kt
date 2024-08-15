package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_PROPERTY

@Composable
fun DashboardScreen(  navController: NavController){

    Column {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "MagicBricks",
                fontSize = 60.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Magenta,
            )
            Spacer(modifier = Modifier.height(10.dp))

            Image(
                painter = painterResource(id = R.drawable.house9) ,
                contentDescription ="home",
                modifier = Modifier
                    .size(150.dp),
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Manage your properties with ease",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Column (){
//Start of main card
                Card (modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                    shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                    colors = CardDefaults.cardColors(Color.Gray)
                ){
                    //Row1
                    Row (modifier = Modifier.padding(20.dp)){
                        //CARD
                        Card(modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(ROUT_PROPERTY)
                            },
                            elevation = CardDefaults.elevatedCardElevation()) {

                            Column {
                                Spacer(modifier = Modifier.height(10.dp))

                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                    Image(
                                        painter = painterResource(id = R.drawable.apartment),
                                        contentDescription = "home",
                                        modifier = Modifier.size(100.dp)
                                    )


                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "ApartmentComplex",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )


                            }
                        }


                        Spacer(modifier = Modifier.width(10.dp))

                        Card(modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(ROUT_PROPERTY)
                            },
                            elevation = CardDefaults.elevatedCardElevation()) {

                            Column {
                                Spacer(modifier = Modifier.height(10.dp))

                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                    Image(
                                        painter = painterResource(id = R.drawable.picsss),
                                        contentDescription = "home",
                                        modifier = Modifier.size(100.dp)
                                    )


                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "home",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }

                    //Row1
                    Row (modifier = Modifier.padding(20.dp)){
                        //CARD
                        Card(modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(ROUT_PROPERTY)
                            },
                            elevation = CardDefaults.elevatedCardElevation()) {

                            Column {
                                Spacer(modifier = Modifier.height(10.dp))

                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                    Image(
                                        painter = painterResource(id = R.drawable.house10),
                                        contentDescription = "home",
                                        modifier = Modifier.size(100.dp)
                                    )


                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Cafeteria SetUp",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )


                            }
                        }


                        Spacer(modifier = Modifier.width(10.dp))

                        Card(modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(ROUT_PROPERTY)
                            },
                            elevation = CardDefaults.elevatedCardElevation()) {

                            Column {
                                Spacer(modifier = Modifier.height(10.dp))

                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                    Image(
                                        painter = painterResource(id = R.drawable.building),
                                        contentDescription = "home",
                                        modifier = Modifier.size(100.dp)
                                    )


                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "ECO-friendly",
                                    fontSize = 18.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )


                            }
                        }
                    }
                }
            }



        }
        //END OF CARD




    }



//end of row




//End of main card






















}




    @Composable
    @Preview(showBackground = true)
    fun DashboardScreenPreview(){
        DashboardScreen(rememberNavController())
    }
