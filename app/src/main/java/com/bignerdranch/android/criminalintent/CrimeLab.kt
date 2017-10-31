package com.bignerdranch.android.criminalintent

import android.content.Context
import java.util.*

/**
 * Created by alessio.lagonigro on 30/10/2017.
 */

class CrimeLab(context: Context) {
    //INIZIALIZZA : for i = 1 to 100
    val crimes = (0 until 100).map { Crime("Crime #$it", it % 2 == 0) }

    fun getCrime(id: UUID): Crime? {
        return crimes.firstOrNull { it.id == id }
    }



    companion object {
        private var sCrimeLab: CrimeLab? = null

        @JvmStatic operator fun get(context: Context): CrimeLab {

            if (sCrimeLab == null) {
                sCrimeLab = CrimeLab(context)
            }

            return sCrimeLab as CrimeLab
        }
    }


}
