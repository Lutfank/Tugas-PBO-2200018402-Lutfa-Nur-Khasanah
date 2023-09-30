#include <iostream>
#include <vector>

using namespace std;

int main() {
    int jumlahAngka;
    
    cout << "Masukkan jumlah angka: ";
    cin >> jumlahAngka;
    
    vector<double> angka(jumlahAngka);
    
    for (int i = 0; i < jumlahAngka; i++) {
        cout << "Masukkan angka ke-" << (i + 1) << ": ";
        cin >> angka[i];
    }
    
    double total = 0;
    for (int i = 0; i < jumlahAngka; i++) {
        total += angka[i];
    }
    
    double rataRata = total / jumlahAngka;
    
    cout << "Rata-rata: " << rataRata << endl;
    
    cout << "Angka yang lebih besar dari rata-rata:" << endl;
    for (int i = 0; i < jumlahAngka; i++) {
        if (angka[i] > rataRata) {
            cout << angka[i] << endl;
        }
    }
    
    cout << "Angka yang lebih kecil dari rata-rata:" << endl;
    int i = 0;
    while (i < jumlahAngka) {
        if (angka[i] < rataRata) {
            cout << angka[i] << endl;
        }
        i++;
    }
    
    return 0;
}
