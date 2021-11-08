package com.lz_saigao.demo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.lz_saigao.snake_tab.IndicatorRule
import com.lz_saigao.snake_tab.TabAlignment
import com.lz_saigao.snake_tab.TabAxisAlignment


class DemoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "SnakeScrollTab",modifier=Modifier.fillMaxWidth(),textAlign = TextAlign.Center,color = Color.Red)
                Button(onClick = {
                    SnakeTabSetting.tabAlignment = TabAlignment.Top
                    startActivity(Intent(this@DemoActivity, SnakeScrollTabActivity::class.java))
                }) {
                    Text(text = "Top Alignment SnakeTab ")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    SnakeTabSetting.tabAlignment = TabAlignment.Center
                    startActivity(Intent(this@DemoActivity, SnakeScrollTabActivity::class.java))
                }) {
                    Text(text = "Center Alignment SnakeTab")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    SnakeTabSetting.tabAlignment = TabAlignment.Bottom
                    startActivity(Intent(this@DemoActivity, SnakeScrollTabActivity::class.java))
                }) {
                    Text(text = "Bottom Alignment SnakeTab")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    SnakeTabSetting.indicatorRule = IndicatorRule.FixedSize
                    startActivity(Intent(this@DemoActivity, SnakeScrollTabActivity::class.java))
                }) {
                    Text(text = "Fixed Size Indicator")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    SnakeTabSetting.indicatorRule = IndicatorRule.FillTab
                    startActivity(Intent(this@DemoActivity, SnakeScrollTabActivity::class.java))
                }) {
                    Text(text = "Fill Tab Indicator")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    SnakeTabSetting.moveByOther = true
                    startActivity(Intent(this@DemoActivity, SnakeScrollTabActivity::class.java))
                }) {
                    Text(text = "Move Tab When Move Pager")
                }

                Spacer(modifier = Modifier.height(60.dp))
                Text(text = "SnakeRowTab",modifier=Modifier.fillMaxWidth(),textAlign = TextAlign.Center,color = Color.Red)
                Button(onClick = {
                    SnakeTabSetting.tabAxisAlignment=TabAxisAlignment.SpaceBetween
                    SnakeTabSetting.moveByOther = true
                    startActivity(Intent(this@DemoActivity, SnakeRowTabActivity::class.java))
                }) {
                    Text(text = "SpaceBetween Tab&&Move Tab When Move Pager")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    SnakeTabSetting.tabAxisAlignment=TabAxisAlignment.SpaceAround
                    SnakeTabSetting.moveByOther = true
                    startActivity(Intent(this@DemoActivity, SnakeRowTabActivity::class.java))
                }) {
                    Text(text = "SpaceAround Tab&&Move Tab When Move Pager")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    SnakeTabSetting.moveByOther = true
                    SnakeTabSetting.tabAxisAlignment=TabAxisAlignment.SpaceEvenly
                    startActivity(Intent(this@DemoActivity, SnakeRowTabActivity::class.java))
                }) {
                    Text(text = "SpaceEvenly Tab&&Move Tab When Move Pager")
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        SnakeTabSetting.moveByOther=false
    }
}
