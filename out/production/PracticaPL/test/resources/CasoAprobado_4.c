// Funcion main principal
void Main (){
    integer numero1 = 10;
	integer numero2 = 20;
    
	// if-else anidados
    if (numero1 > 0){
        printf("El primer número es positivo.\n");
		if (numero2 > 0){
			printf("El segundo número es positivo.\n");
		} else {
			printf("El segundo número es negativo.\n");
		}
    } else { 
        printf("El primer número es negativo.\n");
		if (numero2 > 0){
			printf("El segundo número es positivo.\n");
		} else {
			printf("El segundo número es negativo.\n");
		}
    }
	// while anidado
    integer i = 1;
	while(i <= 5){
		printf("Iteración externa %d\n", i);
		integer j = 1;
		while(j <= 3){
			printf("Iteración interna %d\n", j);
			j = j + 1;
		}
		i = i + 1;
	}
	// do-while
	integer contador = 0;
	do{
		printf("El contador es %d.\n", contador);
		contador = contador + 1;
	} while(contador <= 5);
	return(0);
}