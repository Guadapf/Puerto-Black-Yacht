El Club de Yacht Puerto Black necesita llevar el registro de los Yates que se amarran en su fondeadero.
Se considera “AMARRA” a la superficie de espejo de agua destinado a mantener fondeada una embarcación deportiva.
El Club cuenta con un máximo de 70 amarras y se permite fondear yates de propulsión a vela y a motor.
De los yates a Motor se registra:
1. Nombre: AZ1
2. Dueño: Adrés Borgeat
3. Manga (ancho): 18,87 m
4. Calado: 5,15 m
5. Eslora (largo): 119 m
6. Tripulación: 37
7. Peso: 5500 t
8. Desplazamiento: 5959 t
9. Propulsión: 2 × motores diésel MAN RK2805
10. Potencia: 9000 kw
11. Velocidad: 23 nudos
12. Autonomía: 6500 mn

De los Yates de Vela se registra:
1. Nombre: XXR
2. Dueño: Sebastián Pardo
3. Manga: 6.90 m
4. Calado: 2.7 m
5. Eslora: 13.45 m
6. Tripulación: 5
7. Peso: 1400 Kg
8. Altura mástil: 21.5 m
9. Superficie Vélica Mayor: 85 m2
10. Superficie total (vela mayor y foque): 133 m2

Implementar las clases necesarias para dar solución a los siguientes requerimientos:
1. Crear el Fondeadero recibiendo como parámetro la cantidad máxima de amarras.
2. amararYate(Yate yate): amarra el yate. Deberá lanzar una Excepción si no existe amarra disponible.
3. desamarrarYate(Yate yate): libera la amarra.
4. obtenerCantidadDeYatesAmarrados: devuelve el total de amarras ocupadas.
5. obtenerCantidadDeAmarrasDisponibles: devuelve el total de amarras libres.
6. obtenerPrecioDeAmarre(Yate yate): devuelve el importe en PESOS que debe abonar por la amarra mensualmente el dueño. El costo mensual estará dado dos parámetros: tipo (Motor: $ 10.000 / Vela $ 9000) y Eslora (hasta 20 mts.: $2.000 y mayores a 20 mts.: $3.000).
7. obtenerRecaudacionTotal: devuelve el total recaudado por la ocupación de amarras actual.
8. Implementar SEIS (6) casos de prueba representativos de la clase Fondeadero.
