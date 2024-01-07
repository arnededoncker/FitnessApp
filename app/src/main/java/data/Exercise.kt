package data

data class Exercise(val name: String, val muscleGroup: String) {
    companion object ExerciseSampler {
        val exerciseList = listOf(
            Exercise("dumbell curl", "biceps"),
            Exercise("hammer curl", "biceps"),
            Exercise("skullcrushers", "triceps"),
            Exercise("dips", "chest, shoulders, triceps"),
            Exercise("bench press", "chest, triceps, shoulders"), // New exercise
            Exercise("deadlifts", "back, legs"), // New exercise
            Exercise("lunges", "quadriceps, hamstrings, glutes"), // New exercise
            Exercise("shoulder press", "shoulders"), // New exercise
            Exercise("pull-ups", "back, biceps") // New exercise
        )

        fun getAllExercises(): List<Exercise> {
            return exerciseList
        }
    }
}
