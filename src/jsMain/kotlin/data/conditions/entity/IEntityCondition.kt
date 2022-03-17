package data.conditions.entity

import data.conditions.Condition
import data.conditions.ICondition

interface IEntityCondition: ICondition {
    val type: Condition.Entity
}