package com.rivaldo.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createPhoneData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter = ContactAdapter(testData, { phoneData: PhoneData -> phoneItemClicked(phoneData)  } )
        
    }

    private fun phoneItemClicked(phoneItem: PhoneData) {
        val showDetailActivityIntent = Intent(this, PhoneDetailActivity::class.java)
    showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.phone.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_COMPONENT_NAME, phoneItem.contactName.toString())
        startActivity(showDetailActivityIntent)
    }

    private fun createPhoneData() : List<PhoneData> {
        val partList = ArrayList<PhoneData>()
        partList.add(PhoneData(9864934,"Helmy Kurniawan"))
        partList.add(PhoneData(1341933,"Cready Gilbransen"))
        partList.add(PhoneData(1401624,"Yudha Yunanto Putra"))
        partList.add(PhoneData(2981914,"Arrandi Muhammad Riesta"))
        partList.add(PhoneData(1401624,"Muhammad Burhannudin Fawaz"))
        return partList
    }

}