package davydoff.mskm.youplan.model.DB

import davydoff.mskm.youplan.model.Goal

/**
 * Created by mskm on 26.01.2017.
 */
public class MapRepo<T : Entity>(val map : MutableMap<Long, T>) : Repo<T> {

    override fun getByCondition(condition: (T) -> Boolean) : Collection<T> {
        return map.values.filter(condition)
    }

    override fun getEntity(id: Long): T? {
        return map.get(id)
    }

    override fun getAll(): Collection<T> {
        return map.values
    }

    override fun removeAll() {
        map.clear()
    }

    override fun save(entity : T): Long {
        map.put(entity.id, entity)
        return entity.id
    }
}
