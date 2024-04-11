fun main() {

    println("Escribe el número de la opción correcta")
    println("1: \"Celsius a Fahrenheit\"\n" +
            "2: \"Kelvin a Celsius\"\n" +
            "3: \"Fahrenheit a Kelvin\"")
    val numberOption = readln()
    val optionSelect = numberOption.toInt()

    val result = when (optionSelect) {
        1 -> "Celsius a Fahrenheit"
        2 -> "Kelvin a Celsius"
        3 -> "Fahrenheit a Kelvin"
        else -> "Option Invalid."
    }

    if(result === "Celsius a Fahrenheit"){

        println("Escribe los grados Celsius a convertir")
        val gradosCelsius  = readln()
        val gradosC = gradosCelsius.toInt()

        //°F = 9/5 (°C) + 32

        val resultadoF = gradosC * 9/5 + 32

        println("$resultadoF °F")

    } else if (result === "Kelvin a Celsius"){

        println("Escribe los grados Celsius a convertir")
        val gradosKelvin  = readln()
        val gradosK = gradosKelvin.toInt()

        //°C = K - 273.15

        val resultadoC = gradosK - 273.15

        println("$resultadoC °C")

    } else if (result === "Fahrenheit a Kelvin"){

        println("Escribe los grados Fahrenheit a convertir")
        val gradosFahrenheit  = readln()
        val gradosF = gradosFahrenheit.toInt()

        //(32 °F − 32) × 5/9 + 273.15

        val resultadoK =  ( gradosF - 32 ) * 5/9 + 273.15

        println("$resultadoK °K")
    }
}