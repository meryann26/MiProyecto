/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quintaclase;

/**
 *
 * @author Meryan
 */
public class MiQuintoPrograma {

    public static void main(String[] args) {

        int nivelAzucar = 0;
        boolean hayCafeHecho = false;
        boolean estaDulce = false;

        System.out.println("Quiero cafe");

        if (hayCafeHecho) {
            System.out.println("Calendar cafe");
        } else {
            System.out.println("Hacer cafe");
        }
        System.out.println("Servir en taza y añadir azucar");

        while (!estaDulce) {
            System.out.println("Añadir azucar");
            nivelAzucar++;
            if (nivelAzucar == 10) {
                estaDulce = true;
                System.out.println("Tomar cafe");
            }
        }

        int combo = 17;

        String t = imprimirEncabezado("El Cafe del programador");
        switch (combo) {
            case 1: {
                t = imprimirCombo1(t);
                break;
            }
            case 2: {
                t = imprimirCombo2(t);
                break;
            }
            case 3: {
                t = imprimirCombo3(t);
                break;
            }
            case 4: {
                t = imprimirCombo4(t);
                break;
            }
            case 5: {
                t = imprimirCombo5(t);
                break;
            }      
            case 7: {
                t = imprimirCombo7(t);
                break;
            }
            case 8: {
                t = imprimirCombo8(t);
                break;
            }
             case 9: {
                t = imprimirCombo9(t);
                break;
            }
             case 10: {
                t = imprimirCombo10(t);
                break;
            }
            case 11: {
                t = imprimirCombo11(t);
                break;
            }
            case 13: {
                t = imprimirCombo13(t);
                break;
            }
            case 14: {
                t = imprimirCombo14(t);
                break;
            }
            case 15: {
                t = imprimirCombo15(t);
                break;
            }      
            case 16: {
                t = imprimirCombo16(t);
                break;
            }
            case 17: {
                t = imprimirCombo17(t);
                break;
            }
            case 18: {
                t = imprimirCombo18(t);
                break;
            }
             case 19: {
                t = imprimirCombo19(t);
                break;
            }
             case 20: {
                t = imprimirCombo20(t);
                break;
            }
             case 21: {
                t = imprimirCombo21(t);
                break;
            }
             case 22: {
                t = imprimirCombo22(t);
                break;
            } 
             case 23: {
                t = imprimirCombo23(t);
                break;
            }
             case 24: {
                t = imprimirCombo24(t);
                break;
            }
             case 25: {
                t = imprimirCombo25(t);
                break;
            }
        }
        t = imprimirPie(t);

        System.out.println(t);
    }//fin main

    //METODOS CONTRATADOS
    public static String imprimirEncabezado(String texto) {
        String encabezado = "-----"+texto+"-----\n\n";
        String encabezadoTodoMayus = (encabezado).toUpperCase();
        return encabezadoTodoMayus;

    }

    public static String imprimirCombo1(String texto) {
        String producto = texto + "hamburguesa con papas /n 2000\n";

        return producto;
    }

    public static String imprimirCombo2(String texto) {
        String resultado = "combo2:\n Alfajores,\n Cafe, \n Con leche,\n precio 3600 \n";
        return texto + resultado;
    }

    public static String imprimirCombo4(String texto) {
        String resultado = "Café negro o Café con leche, Burrito de Gallo pinto con queso y natilla\n";

        return texto + resultado;
    }

    public static String imprimirCombo5(String texto) {
        String resultado = texto + "Combo 5: Sandwich cubano con latte \n ₡3500\n";
        return resultado;
    }

    public static String imprimirCombo8(String texto) {
        String resultado = texto + "Quesoburguesa más papas y refresco mediano \n Precio ₡4000 \n";

        return resultado;
    }

    public static String imprimirCombo10(String texto) {

        String menu = "En este combo ofrecemos:\n Capuchino a la Java\n Dados de queso o papas fritas especiadas"
                + "\n Hamburguesa de pollo a la Italiana\n";
        String precio = "\n Y el precio de este combo es de tan solo 5640+IVA%\n";
        String resultado = (texto + menu + precio);
        return resultado;
    }

    public static String imprimirCombo11(String texto) {
        String resultado = texto + "Lasaña de carne con Coca Cola \n";

        return resultado;
    }

    public static String imprimirCombo14(String texto) {
        String resultado = "Combo 14: \n Papas,\n Hamburguesas, \n Pepsi, \n Precio: 7$  \n";
        return texto + resultado;
    }

    public static String imprimirCombo20(String texto) {
        String descripcionCombo;

        descripcionCombo = texto + "El combo incluye: \n Un Cafe Java más un sandwich de Jamón \n Precio 3500 Colones\n";

        return descripcionCombo;

    }

    public static String imprimirCombo3(String combo) {
        String menu = "Cafe mocha con pastel\n";
        String resultado =  combo + menu;
        return resultado;
    }

    public static String imprimirCombo17(String combo17) {
        String resultado = "Hamburguesa y papas\n";
        String combo = "fresco de Coca Cola\n";
        combo17 = combo17 + resultado + " y " + combo;
        return combo17;
    }

    public static String imprimirCombo15(String texto) {
        String resultado = "combo15:\n Sandwich,\n Papas, \n Coca,\n precio 3600 \n";
        return texto + resultado;
    }

    public static String imprimirCombo9(String texto) {
        String resultado = "Café con Quesadillas\n";
        int precio = 3200;
        return resultado + precio;
    }

    public static String imprimirCombo13(String texto) {
        String resultado = texto + "cafe mas rosquillas de caramelo y un sandwich = 1500 colones\n";

        return resultado;
    }

    public static String imprimirCombo16(String combo16) {
        String resultado = combo16 + "24 alitas + refresco + postre + precio 7000\n";

        return resultado;

    }

    public static String imprimirCombo19(String texto) {
        String resultado = texto + "Un café Americano + 2 Muffin = ₡1500\n";

        return resultado;

    }

    public static String imprimirCombo22(String texto) {
        String resultado = "sandwich con gaseosa 1200\n\n";
        return resultado;
    }

    public static String imprimirCombo7(String texto) {
        String resultado = texto + "Combo7 2 cafe, enchilada, pastel de carne 2300\n";

        return resultado;
    }

    public static String imprimirCombo23(String texto) {
        String resultado = texto + " 2 café o té con 6 muffins\n";

        return resultado;
    }

    public static String imprimirCombo24(String combo24) {
        String resultado = combo24 + "Pasta en salsa roja\n + Pan con ajo\n + Limonada\n + Postre del día\n + Precio: 4,500\n";
        return resultado;
    }

    public static String imprimirCombo25(String texto) {
        String combo;
        combo = texto + "te frio con pañuelos rellenos\n";

        return combo;
    }

    public static String imprimirCombo21(String texto) {
        String resultado = texto + "frappuccino mocha grande = ₡3500\n";

        return resultado;
    }

    public static String imprimirPie(String texto) {

        texto += "-*-*-*Menu de la Cefeteria*-*-*-\n";

        return texto;
    }

    public static String imprimirCombo18(String texto) {
        String resultado;
        resultado = texto + "Chocolate con palitos de ajonjoli\n";

        return resultado;
    }

}
