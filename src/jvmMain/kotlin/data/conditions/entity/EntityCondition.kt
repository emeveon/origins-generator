package data.conditions.entity

import data.conditions.Condition
import data.conditions.ICondition
import data.minecraft.MinecraftEntity

sealed class EntityCondition : ICondition {
    abstract val type: Condition.Entity

    class ExposedToSky : EntityCondition() {
        override val type = Condition.Entity.ExposedToSky
    }

    class InRain : EntityCondition() {
        override val type: Condition.Entity = Condition.Entity.InRain
    }

    class Sprinting : EntityCondition() {
        override val type = Condition.Entity.Sprinting
    }

    class Swimming : EntityCondition() {
        override val type: Condition.Entity = Condition.Entity.Swimming
    }

    class EntityType(val entity: MinecraftEntity): EntityCondition() {
        override val type: Condition.Entity = Condition.Entity.EntityType
    }
}