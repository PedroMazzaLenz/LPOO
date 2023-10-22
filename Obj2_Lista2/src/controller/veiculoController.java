package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class veiculoController {

    public static void main(String[] args) {

        bicicleta b1 = new bicicleta(2, "Humana", "Caloi", "Velox MY23", 2023, 29, "AB123CE4");
        //QUESTÃO 2
        bicicleta b2 = new bicicleta(1, "Elétrica", "Trek", "E-Commuter", 2019, 28, "XY456FG7");
        bicicleta b3 = new bicicleta(2, "Humana", "Giant", "Anthem Pro", 2022, 27, "CD789HI2");
        bicicleta b4 = new bicicleta(3, "Elétrica", "Specialized", "Turbo Levo", 2021, 29, "EF012JK3");
        bicicleta b5 = new bicicleta(1, "Humana", "Schwinn", "Discover", 2020, 26, "LM345NO8");

        carro car1 = new carro(2, "Gasolina", "Hyundai", "Creta", 2019, 422, "323245", "HML3452", "ITU3249");
        //QUESTÃO 2
        carro car2 = new carro(2, "Elétrico", "Tesla", "Model 3", 2023, 425, "423421", "TSLA1234", "ABC5678");
        carro car3 = new carro(4, "Gasolina", "Ford", "Focus", 2010, 400, "523124", "FORD5678", "XYZ1234");
        carro car4 = new carro(2, "Híbrido", "Toyota", "Prius", 2016, 350, "623527", "TOYT5678", "IEF7890");
        carro car5 = new carro(2, "Diesel", "Volkswagen", "Golf", 2009, 380, "723823", "VW1234", "GHI5678");


        caminhao c1 = new caminhao(4, "Diesel", "Volvo", "FH 540", 2015, 7500, "9675384", "OIO34235", "OTA3476");
        //QUESTÃO 2
        caminhao c2 = new caminhao(6, "Diesel", "Mercedes-Benz", "Actros", 2020, 12000, "8326491", "MBZ1257", "IBX7890");
        caminhao c3 = new caminhao(8, "Diesel", "Scania", "R 650", 2018, 15000, "7392852", "SCN5678", "SCA4321");
        caminhao c4 = new caminhao(4, "Elétrico", "Tesla", "Semi Truck", 2023, 8000, "6329485", "TSLA9876", "TST5432");
        caminhao c5 = new caminhao(6, "Diesel", "Volvo", "FH 460", 2017, 11000, "8492357", "VOL1234", "VLF6789");

        System.out.println(b1);
        System.out.println(car1);
        System.out.println(c1);

        List<veiculo> veiculos = new ArrayList<>();
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        veiculos.add(b5);
        veiculos.add(car1);
        veiculos.add(car2);
        veiculos.add(car3);
        veiculos.add(car4);
        veiculos.add(car5);
        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(c4);
        veiculos.add(c5);

        veiculos.sort(Comparator.comparing(veiculo::getAnoFabricacao).reversed());
        System.out.println();
        System.out.print("Lista por ano de fabricação (veiculos):");
        System.out.println(veiculos);

        System.out.println();
        System.out.print("Lista por ano de fabricação (automóveis):");
        veiculos.forEach(auto -> {
            if (auto instanceof automovel) {
                System.out.print(auto);
            }
        });

        System.out.println("\n");
        System.out.print("Lista por ano de fabricação (bicicletas):");
        veiculos.forEach(bici -> {
            if (bici instanceof bicicleta) {
                System.out.print(bici);
            }
        });
        System.out.println("\n");
        System.out.print("Lista de veículos em que a placa começa com I:");
        veiculos.forEach(i -> {
            if (i instanceof automovel) {
                if( ((automovel) i).getPlaca().startsWith("I")) {
                    System.out.print(i);
                }
            }
        });

    }
}
