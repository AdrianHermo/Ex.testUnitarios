Pruebas Unitarias para la Clase Main

Descripción del Proyecto

Este repositorio contiene la implementación de pruebas unitarias para la clase Main, que verifica la validez de un DNI y su letra correspondiente. Se han implementado pruebas con parámetros utilizando JUnit 5.

Apartados

1. Pruebas Unitarias (4 puntos)

Se han implementado dos pruebas unitarias parametrizadas:

testComprobarDNI: Verifica si comprobarDNI devuelve el resultado esperado al comparar la letra calculada con la proporcionada.

testCalcularLetraDNI: Confirma que calcularLetraDNI devuelve la letra correcta según el algoritmo de cálculo.

Ambas pruebas incluyen múltiples casos para asegurar la fiabilidad del código.

2. Error Encontrado en el Código (2 puntos)

Se identificó un error en la función calcularLetraDNI. El código no valida que la longitud del dni sea exactamente 8 caracteres antes de convertirlo en un número. Esto puede causar errores al recibir una cadena más corta o con caracteres no numéricos.

Solución propuesta:
Agregar una validación en comprobarDNI para asegurarse de que el dni tenga exactamente 8 caracteres numéricos antes de calcular la letra.

3. Modificación de Tests ante la Falta de Validación de Longitud (3 puntos)

Si no existiera una validación de longitud, los tests deberían incluir:

Casos con DNIs de menos de 8 caracteres.

Casos con DNIs que contengan letras.

Verificación de que el código maneja estos casos correctamente (ya sea lanzando una excepción o devolviendo un resultado esperado).

4. Entrega del Repositorio (1 punto)

El código y las pruebas unitarias han sido documentados correctamente. 
