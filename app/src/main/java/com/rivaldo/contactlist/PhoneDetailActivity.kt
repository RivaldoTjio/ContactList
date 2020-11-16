package com.rivaldo.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phone_detail.*


class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            tv_item_id.text = partId
            tv_item_name.text = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
        }
    }
}