<?php

/**
 * Suma dos valores y devuelve el resultado.
 *
 * Esta función toma dos números como parámetros y devuelve su suma.
 *
 * @param float $a Primer número a sumar.
 * @param float $b Segundo número a sumar.
 * @return float Resultado de la suma de $a y $b.
 */
function sumar($a, $b) {
    return $a + $b;
}

// Ejemplo de uso
$resultado = sumar(5.5, 4.5);
echo "El resultado de la suma es: " . $resultado;

?>
