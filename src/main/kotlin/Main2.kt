class Arrays(val array: Array<Int>) {
    var uno: Array<Int> = Array(20){0}
    fun rellenar(): Array<Int> {
        println("Creamos el Array")
        for (i in 0..uno.size - 1) {
            array[i] = (0..1000).random()
        }
        uno = array
        return uno
    }

    fun ordenar(): Array<Int> {
        println("Vamos a ordenar el Array")
        array.sort()
        uno = array
        return uno
    }

    fun escribir(): Array<Int> {
        rellenar()
        ordenar()
        return uno
    }
}

fun main(){
    val dos: Array<Int> = Array(20){0}
    val clase = Arrays(dos)
    val tres = clase.escribir()
    println("Asi quedaria el Array ordenado")
    tres.forEach { print("$it ") }
    println("")
    println("Procedemos a ver que numeros son los pares ")
    var cuatro: Array<Int> = Array(20){0}
    for (i in 0.. tres.size-1){
        if (tres[i] %2 == 0 )
        cuatro[i] = tres[i]
    }
    println("Ordenamos de nuevo")
    cuatro.sort()
    cuatro.forEach { print("$it ") }
    println("")
    println("Primer variable del Array")
    print(cuatro[0])
    println("")
    println("Ultimo variable del Array")
    print(cuatro[cuatro.size-1])
    println("")
    println("Suma de todos los elemento del Array")
    var suma = 0
    for (i in 0.. cuatro.size-1){
        suma += cuatro[i]
}
    println(suma)
    println("Se muestra por pantalla los elementos del Array")
    cuatro.forEach { print("$it ") }
}