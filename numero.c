#include <stdio.h>

int main(){
    int N, suma = 0;
    printf("Ingresa un número: ");
    scanf("%d",&N);
    
    for(int i = 1; i <= N; i++){
        suma += i;
    }
    printf("La suma de los primeros %d números es: %d\n", N, suma);

    return 0;
}
