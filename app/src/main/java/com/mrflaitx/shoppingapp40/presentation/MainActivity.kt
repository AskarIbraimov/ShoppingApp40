package com.mrflaitx.shoppingapp40.presentation

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mrflaitx.shoppingapp40.R
import com.mrflaitx.shoppingapp40.databinding.ActivityMainBinding
import com.mrflaitx.shoppingapp40.domain.entity.ShopItem

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()
    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding.apply {
            btnAdd.setOnClickListener {
                viewModel.addShopItem(
                    ShopItem(
                        etField.text.toString(),
                        2,
                        false
                    )
                )
            }

            btnDelete.setOnClickListener {
                viewModel.removeShopItem(
                    ShopItem(
                        "potato",
                        2,
                        false,
                        etField.text.toString().toInt()
                    )
                )
            }

            btnEdit.setOnClickListener {
                viewModel.editShopItem(
                    ShopItem(
                        "tomato",
                        14,
                        false,
                        etField.text.toString().toInt()
                    )
                )
            }

            btn.setOnClickListener {
                Log.e("TAG", "initListeners: ${viewModel.getShopList()}")
            }
            btnGetItem.setOnClickListener {
                Log.e(TAG, "initListeners: ${viewModel.getSHopItem( etField.text.toString().toInt())}")
            }
        }
    }
}