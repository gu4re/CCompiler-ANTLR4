// Creamos las fabricas
    pthread_create(&tid_fabric[0], NULL, fabricar, &cero);
    pthread_create(&tid_fabric[1], NULL, fabricar, &uno);
    pthread_create(&tid_fabric[2], NULL, fabricar, &dos);

    for (i = 0; i < NUM_TANDAS; i++){
        for(j = 0; j < config_inicial[3]; j++){
            // Creamos los habitantes asignandoles un numero aleatorio entre 1 y 1200 sin repeticiones
            k = rand()%((config_inicial[0]+1)-1) + 1;
            pthread_create(&tid_habs[k], NULL, vacunarse, &id_habs[k]);
        }
        // Esperamos a que el ultimo thread de la tanda haya acabado para proceder con la siguiente tanda
        pthread_join(tid_habs[k], NULL);
    }