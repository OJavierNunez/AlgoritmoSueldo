#include <iostream>

using namespace std;

double horasDiarias, horasSemana, sueldo;
int contador;

int main() {
  horasDiarias=0;
  horasSemana=0;
  for(contador=1;contador<=5;contador++){
    cout<<"Ingrese las horas que trabajo el pasante el día "<<contador<<" : "<<endl;
    cin>>horasDiarias;
    horasSemana = horasDiarias + horasSemana;
  }
  
  cout<<"Ingrese el sueldo del pasante $ "<<endl;
  cin>>sueldo;
  sueldo = sueldo * horasSemana;
  cout<<"Las horas trabajadas en la semana son: "<<horasSemana<<endl;
  cout<<"El sueldo a recibir es $ "<<sueldo<<endl;

}