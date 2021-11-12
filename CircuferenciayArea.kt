fun Ejercicio3(){

        var radio = 0.0
        var pi = 3.141592654

        println("Ingrese el radio en centimetros:")
        radio= readLine()!!.toDouble()

        var area = radio*radio * pi
        var circuferencia = radio * (2*pi)

        val formato = "###,###.00"

        println("""
            ***Centimetros***
            Área            | ${DecimalFormat(formato).format(area)}
            Circuferencia   |${DecimalFormat(formato).format(circuferencia)}
            
            
            ****Pulgadas***
           Área            | ${'$'}${DecimalFormat(formato).format(area/2.54)}
            Circuferencia   |${'$'}${DecimalFormat(formato).format(circuferencia/2.54)}
            
        """.trimIndent())

    }
