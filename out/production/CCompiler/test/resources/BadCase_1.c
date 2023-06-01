void Main() {
    int x = 5;
    int y = 10;
    
    if (x > y)
        printf("x es mayor que y.\n");
    else if (x < y)
        printf("x es menor que y.\n");
    else
        printf("x es igual a y.\n");
    
    else // Error: 'else' sin 'if' correspondiente
        printf("Este mensaje nunca se imprimirá.\n");
    
    return 0;
}
