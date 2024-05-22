
#include <stdio.h>

int main() {
    int a, b, c;

    printf("Enter three values: ");
    scanf("%d %d %d", &a, &b, &c

    if (a < b) {
        printf("A is greater than B\n");
    } else if (b < c) {
        printf("B is greater than C\n");
    } else {
        printf("C is greater than or equal to A\n"); 
    }

    return 0; 
}