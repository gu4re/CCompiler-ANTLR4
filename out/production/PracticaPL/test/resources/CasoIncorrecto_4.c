void Main() {
    int edad = 18;
    if (edad >= 18) 
        printf("Eres mayor de edad.\n");
    else 
        printf("Eres menor de edad.\n");

    int contador = 0;
    while (contador < 5)
        printf("Contador: %d\n", contador++);
    
    
    int contador2 = 0;
    do
        printf("Contador: %d\n", contador2++);
    while (contador2 < 5);
}
