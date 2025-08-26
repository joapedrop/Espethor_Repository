public class JoaoPereira_1091_DivisaoDaNlogonia {

    static java.util.Scanner ler = new java.util.Scanner(System.in);

    public static int LerNumInt() {
        int numero = 0;

        numero = ler.nextInt();

        return numero;
    }

    public static void ImprimirDivisaoDaNlogonia(int lugardacasaX, int lugardacasaY, int pontodivisorX,
            int pontodivisorY, int consultas) {
        while (consultas != 0) {

            consultas = LerNumInt();
            if (consultas != 0) {

                pontodivisorX = LerNumInt();

                pontodivisorY = LerNumInt();

                for (int i = 0; i < consultas; i++) {
                    lugardacasaX = LerNumInt();

                    lugardacasaY = LerNumInt();

                    if (EhDivisa(lugardacasaX, lugardacasaY, pontodivisorX, pontodivisorY)) {
                        System.out.println("divisa");
                    } else {
                        if (EhNoroeste(lugardacasaX, lugardacasaY, pontodivisorX, pontodivisorY)) {
                            System.out.println("NO");
                        } else {
                            if (EhNordeste(lugardacasaX, lugardacasaY, pontodivisorX, pontodivisorY)) {
                                System.out.println("NE");
                            } else {
                                if (EhSudeste(lugardacasaX, lugardacasaY, pontodivisorX, pontodivisorY)) {
                                    System.out.println("SE");
                                } else {
                                    if (EhSudoeste(lugardacasaX, lugardacasaY, pontodivisorX, pontodivisorY)) {
                                        System.out.println("SO");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean EhDivisa(int lugardacasaX, int lugardacasaY, int pontodivisorX, int pontodivisorY) {
        boolean EhDivisa = false;

        if (lugardacasaX == pontodivisorX || lugardacasaY == pontodivisorY) {
            EhDivisa = true;
        }

        return EhDivisa;
    }

    public static boolean EhNordeste(int lugardacasaX, int lugardacasaY, int pontodivisorX, int pontodivisorY) {
        boolean EhNE = false;

        if (lugardacasaX > pontodivisorX && lugardacasaY > pontodivisorY) {
            EhNE = true;
        }

        return EhNE;
    }

    public static boolean EhNoroeste(int lugardacasaX, int lugardacasaY, int pontodivisorX, int pontodivisorY) {
        boolean EhNO = false;

        if (lugardacasaX < pontodivisorX && lugardacasaY > pontodivisorY) {
            EhNO = true;
        }

        return EhNO;
    }

    public static boolean EhSudeste(int lugardacasaX, int lugardacasaY, int pontodivisorX, int pontodivisorY) {
        boolean EhSE = false;

        if (lugardacasaX > pontodivisorX && lugardacasaY < pontodivisorY) {
            EhSE = true;
        }

        return EhSE;
    }

    public static boolean EhSudoeste(int lugardacasaX, int lugardacasaY, int pontodivisorX, int pontodivisorY) {
        boolean EhSO = false;

        if (lugardacasaX < pontodivisorX && lugardacasaY < pontodivisorY) {
            EhSO = true;
        }

        return EhSO;
    }

    public static void main(String[] args) {
        int lugardacasaX = 0;
        int lugardacasaY = 0;
        int pontodivisorX = 0;
        int pontodivisorY = 0;
        int consultas = 1;

        ImprimirDivisaoDaNlogonia(lugardacasaX, lugardacasaY, pontodivisorX, pontodivisorY, consultas);
    }
}
