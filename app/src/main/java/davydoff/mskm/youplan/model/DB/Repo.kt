package davydoff.mskm.youplan.model.DB

/**
 * Created by mskm on 22.01.2017.
 */
interface Repo<T : Entity> {
    fun getEntity(id: Long): T?
    fun getAll(): Collection<T>
    fun removeAll()
    fun save(entity : T) : Long
    fun getByCondition(condition : (T) -> Boolean) : Collection<T>
}

