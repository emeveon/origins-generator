package data.powers

import data.conditions.ICondition

sealed class PredefinedPower: Power() {

    class Featherweight(
        override var name: String? = null,
        override var hidden: Boolean = false,
        override var condition: ICondition? = null,
        override var loadingPriority: Int = 0,
        override var conditionSupported: Boolean = true
    ): PredefinedPower() {
        override var type: PowerType = PowerType.Featherweight
        override var description: String? = "You have permanent slow falling, unless you sneak. This is inverted while using an Elytra."
    }

    class FreshAir(
        override var name: String? = null,
        override var hidden: Boolean = false,
        override var condition: ICondition? = null,
        override var loadingPriority: Int = 0,
        override var conditionSupported: Boolean = true
    ): PredefinedPower() {
        override var type: PowerType = PowerType.FreshAir
        override var description: String? = "You cannot sleep below y=86."
    }

    class LikeAir(
        override var name: String? = null,
        override var hidden: Boolean = false,
        override var condition: ICondition? = null,
        override var loadingPriority: Int = 0,
        override var conditionSupported: Boolean = true
    ): PredefinedPower() {
        override var type: PowerType = PowerType.LikeAir
        override var description: String? = "Your airspeed is always equal to your walking speed."
    }

    class Tailwind(
        override var name: String? = null,
        override var hidden: Boolean = false,
        override var condition: ICondition? = null,
        override var loadingPriority: Int = 0,
        override var conditionSupported: Boolean = true
    ): PredefinedPower() {
        override var type: PowerType = PowerType.Tailwind
        override var description: String? = "Your normal speed is slightly increased."
    }

    class Oviparous(
        override var name: String? = null,
        override var hidden: Boolean = false,
        override var condition: ICondition? = null,
        override var loadingPriority: Int = 0,
        override var conditionSupported: Boolean = true
    ): PredefinedPower() {
        override var type: PowerType = PowerType.Oviparous
        override var description: String? = "After successfully sleeping, an egg will be added to your inventory."
    }

    class Vegetarian(
        override var name: String? = null,
        override var hidden: Boolean = false,
        override var condition: ICondition? = null,
        override var loadingPriority: Int = 0,
        override var conditionSupported: Boolean = true
    ): PredefinedPower() {
        override var type: PowerType = PowerType.Vegetarian
        override var description: String? = "You cannot eat food items defined in the tag origins:meat, unless they are also defined in the origins:ignore_diet tag."
    }

}