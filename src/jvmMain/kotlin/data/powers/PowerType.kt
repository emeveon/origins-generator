package data.powers

enum class PowerType(val id: String) {
    Simple("origins:simple"),
    Featherweight("origins:slow_falling"),
    FreshAir("origins:fresh_air"),
    LikeAir("origins:like_air"),
    Tailwind("origins:tailwind"),
    Oviparous("origins:lay_eggs"),
    Vegetarian("origins:vegetarian");

    fun getValues(): Set<PowerType> {
        return PowerType.values().toSet()
    }
}