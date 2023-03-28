#include <iostream>
#include <fstream>
using namespace std;

int main() {
    srand((unsigned) time(NULL));
    std::ofstream outputFile("output.txt");
    for (int i = 0; i < 1000000; i++) {
        outputFile << rand() % 10 << '\n';
    }
    // Close the output file
    outputFile.close();

    // Done!
    std::cout << "Done writing output.txt\n";
    return 0;
}