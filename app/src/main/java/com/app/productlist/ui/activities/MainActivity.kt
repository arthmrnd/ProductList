package com.app.productlist.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.app.productlist.R
import com.app.productlist.models.Product
import com.app.productlist.ui.components.ProductListAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val productListView = findViewById<RecyclerView>(R.id.product_list)
        val productList = listOf(
            Product("Mouse", "Razer DeathAdder Essential Gaming Mouse: 6400 DPI", BigDecimal(19.99)),
            Product("Keyboard", "Razer Ornata Chroma Gaming Keyboard: Hybrid Mechanical Key Switches", BigDecimal(59.99)),
            Product("Headset","HyperX Cloud II Wireless - Gaming Headset", BigDecimal(129.99))
        )

        productListView.adapter = ProductListAdapter(productList, this)
    }
}