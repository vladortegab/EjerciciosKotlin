fun SacarImpuestoSalario(){

     var salarioBruto = 0.0
     var porcentajeImpuestoMes = 0.0

        println("Ingrese el valor de su Salario mensual bruto")
        salarioBruto = readLine()!!.toDouble()

        println("Ingrese el valor del % Impuestos Mensual")
        porcentajeImpuestoMes = readLine()!!.toDouble()


        val impuestoneto =  salarioBruto * porcentajeImpuestoMes/100
        val salarioneto = salarioBruto - impuestoneto

        val formato = "#,###.00"


        println("""
            **Recibo**
             Salario mensual neto: ${DecimalFormat(formato).format(salarioneto)}
             Impuestos a pagar por mes:  $${DecimalFormat(formato).format(impuestoneto)}
        """.trimIndent())
   
        }
