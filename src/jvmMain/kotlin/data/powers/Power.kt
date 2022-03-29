package data.powers

import data.conditions.ICondition

abstract class Power {
    open var type: PowerType = PowerType.Simple
    open var name: String? = null
    open var description: String? = null
    open var hidden: Boolean = false
    open var condition: ICondition? = null
    open var loadingPriority: Int = 0
    open var conditionSupported: Boolean = true

    fun isValid(): Boolean {
        return !(!conditionSupported && condition != null)
    }
}