package com.bignerdranch.android.criminalintent

import android.content.Context

import java.util.ArrayList
import java.util.UUID

/**
 * Created by alessio.lagonigro on 30/10/2017.
 */

class CrimeLab(context: Context) {
    val crimes: List<Crime>

    init {
        crimes = ArrayList()
        for(i in 0..100-1){
            var crime = Crime()
            crime.title = "Crime #$i"
            crime.solved=i%2==0
            crimes.add(crime)
        }

    }

    fun getCrime(id: UUID): Crime? {
        return crimes.firstOrNull { it.id == id}
    }

    companion object {
        private var sCrimeLab: CrimeLab? = null

        operator fun get(context: Context): CrimeLab {

            sCrimeLab = when (sCrimeLab) {
                null -> CrimeLab(context)
                else -> sCrimeLab
            }
            return sCrimeLab as CrimeLab
        }
    }


}
