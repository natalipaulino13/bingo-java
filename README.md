# Bingo — Java (POO + Random)

Práctica del módulo Programación (DAW). Simulación de una partida de bingo con varios jugadores. El programa utiliza clases, objetos, números aleatorios y comprobación de números hasta encontrar un ganador.

## Enunciado

El programa simula una partida de bingo en la que participan **cinco jugadores**. Cada jugador recibe un cartón con **3 números diferentes entre 1 y 20**.

El bombo va sacando bolas de forma aleatoria sin repetir la última bola extraída. Cada número que sale se comprueba en los cartones de los jugadores.

La partida continúa hasta que uno de los jugadores consigue acertar sus tres números.

## Clases

### Bombo

Atributo: `ultimaBola`

Métodos:

* `sacarBola()` — genera una bola aleatoria entre 1 y 20 evitando repetir la última bola
* Getters y setters

### Jugador

Atributos: nombre, tres números del cartón y tres booleanos para controlar los aciertos.

Métodos:

* `asignarCarton()` — genera tres números diferentes entre 1 y 20
* `comprobarBola()` — comprueba si la bola extraída coincide con alguno de sus números
* `esGanador()` — comprueba si ha acertado los tres números
* Getters y setters

### Main

Clase principal del programa.

Crea el bombo y cinco jugadores:

* Irene
* Nataly
* Milena
* Rocío
* Kimmy

Asigna un cartón a cada jugador y comienza la partida. En cada turno se extrae una bola y se comprueba en los cartones hasta que un jugador consigue acertar sus tres números.

## Funcionamiento

1. Se crean los cinco jugadores.
2. Se asignan tres números aleatorios y diferentes a cada jugador.
3. Se crea el bombo.
4. El usuario pulsa ENTER para sacar una bola.
5. El bombo genera un número aleatorio entre 1 y 20.
6. Se comprueba el número en los cartones de todos los jugadores.
7. Si un jugador consigue los tres aciertos, gana la partida.
8. Si no hay ganador, se pulsa ENTER para sacar otra bola.
9. La partida finaliza cuando aparece un ganador.

## Ejemplo de ejecución

```text
Los números de Irene son 4, 12 y 19
Los números de Nataly son 2, 8 y 15
Los números de Milena son 6, 10 y 17
Los números de Rocío son 1, 9 y 20
Los números de Kimmy son 3, 7 y 14

Pulsa ENTER para sacar una bola

Ha salido la bola 8

La jugadora Nataly tiene el número 8

Pulsa ENTER para sacar una bola

Ha salido la bola 15

La jugadora Nataly tiene el número 15

...

La jugadora Nataly tiene el número 2

La jugadora Nataly ha ganado
La partida ha finalizado
```

*Los números y el ganador pueden variar en cada ejecución debido a la generación aleatoria.*

## Conceptos utilizados

* Programación Orientada a Objetos (POO)
* Clases y objetos
* Constructores
* Encapsulamiento
* Getters y setters
* Métodos
* `Random`
* `Scanner`
* Bucles `while` y `do-while`
* Condicionales `if` / `else if`
* Valores booleanos
* Generación de números aleatorios
* Comprobación de coincidencias

## Autor

[Nataly Github](https://github.com/natalipaulino13) — DAW 2025/2026
