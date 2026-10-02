package Task;
//https://acmp.ru/index.asp?main=task&id_task=293
//N - число фирм (0 < N ≤ 100)
//N целых неотрицательных чисел, не превышающих 154 - доходы фирм
// N целых чисел от 0 до 100 - налоги фирм в процентах.
//выведите одно число - номер фирмы, от которой государство получает наибольший налог. Если таких фирм несколько, выведите фирму с наименьшим номером.

public class Firm {
    private int numberFirm;
    private int income;
    private int percentTax;

    public Firm(int numberFirm, int income, int percentTax) {
        this.numberFirm = numberFirm;
        this.income = income;
        this.percentTax = percentTax;
    }

    public int getNumberFirm() {
        return numberFirm;
    }

    public int getIncome() {
        return income;
    }

    public int getPercentTax() {
        return percentTax;
    }

    //добавить фирму
    public static Firm[] addFirm() {
        int countFirm = Integer.parseInt(IO.readln("Какое количество фирм? "));
        Firm[] firms = new Firm[countFirm];

        for (int i = 0; i < countFirm; i++) {
            int numberFirm = Integer.parseInt(IO.readln("  номер: "));
            int income = Integer.parseInt(IO.readln("  доход: "));
            int percentTax = Integer.parseInt(IO.readln("  процент налога: "));
            firms[i] = new Firm(numberFirm, income, percentTax);
        }
        return firms;
    }

    //доход от налогов
    public double tax() {
        return income * percentTax / 100.0;
    }

//найти номер фирмы, где наибольший налог.
// Если фирм несколько, наименьший номер.
    public static int numberFirm(Firm[] firms) {

        int bestNumber = firms[0].numberFirm;
        double maxTax   = firms[0].tax();

        for (int i = 1; i < firms.length; i++) {
            int currentNumber = firms[i].numberFirm;
            double currentTax = firms[i].tax();

            if (currentTax > maxTax) {
                maxTax = currentTax;
                bestNumber = currentNumber;
            } else if (currentTax == maxTax && currentNumber < bestNumber) {
                // налог одинаковый, но номер меньше — заменяем
                bestNumber = currentNumber;
            }
        }
            return bestNumber;
    }


    public static void main(String[] args) {
        Firm[] firms = addFirm();
        System.out.println("Номер фирмы с наибольшим налогом: " + numberFirm(firms));
        }
    }



