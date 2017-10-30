package com.bignerdranch.android.criminalintent

import java.util.Date
import java.util.UUID

/**
 * Created by alessio.lagonigro on 27/10/2017.
 */

class Crime {

    val id : UUID = UUID.randomUUID()
    val date : Date = Date()
    var title : String? = null
    var solved : Boolean = false

}
