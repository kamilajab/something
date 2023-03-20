//Bugs introduced BS

int main()
{
    int a = 0, b = 1;
    int sum_even = 0;
    while (b < 4000000) {
        if (b % 2 == 0) {
            sum_even += b;
        }
        int temp = b;
        b = a + b;
        a = tem;
    }
    std::cout << sum_even << std::endl;


}

// answer should be 4613732
