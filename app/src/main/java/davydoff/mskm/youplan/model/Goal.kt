package davydoff.mskm.youplan.model

import davydoff.mskm.youplan.model.DB.Entity

/**
 * Created by mskm on 22.01.2017.
 */

data class Goal (override val id: Long,
                        val user : User,
                        var text : String,
                        var limit : Int) : Entity
