package com.rbs.workout.freak

class AppSettings {
    companion object {
        //this flag will be handled by subscription
        var isUserPaid = false

        // enable admob or facebook ads, by default admob ads are enable
        // set flags true or false
        val enableAdmobAds = true
        val enableFacebookAds = false

        //place your one signal id
        val oneSignalId = "e2fd7919-6087-4589-8938-597bf4c6436d"

        //Subscription id's
        val one_month_subscription_id = "put your one month subscription id here"
        val three_month_subscription_id = "put your three months subscription id here"
        val one_year_subscription_id = "put your one year subscription id here"
    }
}