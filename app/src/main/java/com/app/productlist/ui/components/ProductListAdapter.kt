package com.app.productlist.ui.components

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.productlist.R
import com.app.productlist.models.Product

class ProductListAdapter(
    private val products: List<Product>,
    private val context: Context
): RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun link(products: Product){
            val productName = itemView.findViewById<TextView>(R.id.product)
            productName.text = products.name

            val productDescription = itemView.findViewById<TextView>(R.id.description)
            productDescription.text = products.description

            val productPrice = itemView.findViewById<TextView>(R.id.price)
            productPrice.text = (products.price).toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val linkProducts = products[position]
        holder.link(linkProducts)
    }

    override fun getItemCount(): Int = products.size
}
