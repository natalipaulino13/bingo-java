# 🔷 Bingo — Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![POO](https://img.shields.io/badge/POO-Programación%20Orientada%20a%20Objetos-4CAF50?style=for-the-badge)
![Random](https://img.shields.io/badge/Random-Números%20Aleatorios-2196F3?style=for-the-badge)

Práctica del módulo de **Programación del ciclo de Desarrollo de Aplicaciones Web (DAW)**.

Proyecto desarrollado en **Java** para simular una partida de **bingo** con varios jugadores, utilizando **Programación Orientada a Objetos (POO)**, números aleatorios y comprobación de coincidencias.

El programa simula una partida con **cinco jugadores**, cada uno con un cartón formado por tres números diferentes entre 1 y 20.

La partida continúa hasta que uno de los jugadores consigue acertar sus tres números.

---

## 🎯 Objetivo del proyecto

El objetivo principal es practicar los fundamentos de la **Programación Orientada a Objetos en Java**, trabajando con:

* Clases y objetos.
* Constructores.
* Encapsulamiento.
* Getters y setters.
* Métodos.
* Números aleatorios.
* Valores booleanos.
* Bucles `while` y `do-while`.
* Condicionales `if` / `else if`.
* Comprobación de coincidencias.
* Interacción con el usuario mediante `Scanner`.

---

## 🎰 Bombo

La clase `Bombo` representa el bombo encargado de sacar las bolas.

Dispone del atributo:

```text
ultimaBola
```

El método:

```java
sacarBola()
```

genera aleatoriamente un número entre **1 y 20**, evitando repetir la última bola extraída.

---

## 👥 Jugadores

La clase `Jugador` representa a cada participante de la partida.

Cada jugador dispone de:

* 👤 Nombre.
* 🎫 Tres números en su cartón.
* ✅ Tres valores booleanos para controlar los aciertos.

### Jugadores

| Jugador | Participante |
| ------- | ------------ |
| 👩      | Irene        |
| 👩      | Nataly       |
| 👩      | Milena       |
| 👩      | Rocío        |
| 👩      | Kimmy        |

---

## 🎫 Cartones

Cada jugador recibe automáticamente un cartón con **tres números diferentes entre 1 y 20**.

El método:

```java
asignarCarton()
```

se encarga de generar los números aleatoriamente.

Los números pueden variar en cada ejecución debido a la generación aleatoria.

---

## 🔎 Comprobación de bolas

Cada vez que el bombo extrae una bola, se comprueba si el número aparece en el cartón de alguno de los jugadores.

El método:

```java
comprobarBola()
```

comprueba las coincidencias y marca los números acertados mediante valores booleanos.

Cuando un jugador consigue acertar sus tres números, el método:

```java
esGanador()
```

determina que ha conseguido el bingo.

---

## 🏆 Ganador

La partida continúa mientras ningún jugador haya conseguido sus tres aciertos.

```text
🎰 Bombo
   │
   └── 🎱 Bola aleatoria
           │
           ▼
      👥 Jugadores
           │
           ├── 🔎 Comprobar coincidencia
           │
           └── ✅ Comprobar ganador
                    │
                    ▼
                 🏆 Bingo
```

Cuando un jugador consigue sus tres números, se muestra el ganador y finaliza la partida.

---

## ⚙️ Funcionamiento

1. 👥 Se crean los cinco jugadores.
2. 🎫 Se asignan tres números aleatorios y diferentes a cada jugador.
3. 🎰 Se crea el bombo.
4. ⏎ El usuario pulsa **ENTER** para sacar una bola.
5. 🎱 El bombo genera un número aleatorio entre 1 y 20.
6. 🔎 Se comprueba el número en los cartones.
7. ✅ Se actualizan los aciertos de los jugadores.
8. 🏆 Se comprueba si existe un ganador.
9. 🔄 Si no hay ganador, se pulsa **ENTER** para continuar.
10. 🎉 La partida finaliza cuando un jugador consigue los tres aciertos.

---

## 📋 Ejemplo de ejecución

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

Los números generados y el ganador pueden variar en cada ejecución debido al uso de valores aleatorios.

---

## 🧠 Conceptos utilizados

* Java.
* Programación Orientada a Objetos (POO).
* Clases y objetos.
* Constructores.
* Encapsulamiento.
* Getters y setters.
* Métodos.
* `Random`.
* `Scanner`.
* Bucles `while` y `do-while`.
* Condicionales `if` / `else if`.
* Valores booleanos.
* Generación de números aleatorios.
* Comprobación de coincidencias.
* Control de estados mediante booleanos.

---

## 📦 Estructura

```text
📦 paq
 ┣ 📜 Bombo.java
 ┣ 📜 Jugador.java
 ┗ 📜 Main.java
```

---

## 👤 Autor

**Nataly Github** — DAW 2025/2026
