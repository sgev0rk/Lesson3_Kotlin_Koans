class LazyProperty(val initializer: () -> Int) {
    var vala: Int? = null
    val lazy: Int
        get() {
            if (vala == null){
                vala = initializer()
            }
            return vala!!
        }
}
