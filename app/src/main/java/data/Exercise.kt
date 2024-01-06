package data

data class Exercise(val name: String, val muscleGroup: String) {
    companion object ExerciseSampler {
        val exerciseList = listOf(
            Exercise("dumbell curl", "biceps"),
            Exercise("hamer curl", "biceps"),
            Exercise("skullcrushers", "triceps"),
            Exercise("dips", "chest, shoulders, triceps"),
        )
        fun getAllExercises(): List<Exercise> {
            return exerciseList
        }
    }
}
