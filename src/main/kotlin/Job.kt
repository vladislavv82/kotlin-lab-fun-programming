class Job(var workplace: String, var responsibilities: MutableList<String>, var position: String) {
    override fun toString(): String {
        return "Место работы='$workplace, \n обязанности =$responsibilities, \n должность = $position, \n"
    }
}
