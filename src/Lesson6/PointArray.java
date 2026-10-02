package Lesson6;

    public class PointArray {
        double x;
        double y;

        public PointArray(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distanceTo(PointArray other) {
            return Math.sqrt((other.x - this.x) * (other.x - this.x) + (other.y - this.y) * (other.y - this.y));
        }

        static double getDistance(PointArray p1, PointArray p2) {
            return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
        }

        static double getTriangleSquare(PointArray a, PointArray b, PointArray c) {
            if (!(getDistance(a, b) + getDistance(a, c) <= getDistance(b, c)) && !(getDistance(a, b) + getDistance(b, c) <= getDistance(a, c)) && !(getDistance(a, c) + getDistance(b, c) <= getDistance(a, b))) {
                double triangleSquare = (double)0.5F * ((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y));
                return triangleSquare;
            } else {
                System.out.println("ААААА сумма одна сторона больше суммы двух других !");
                return (double)0.0F;
            }
        }

        static double maxSegment(PointArray a, PointArray b, PointArray c) {
            double ab = getDistance(a, b);
            double ac = getDistance(a, c);
            double bc = getDistance(b, c);
            double maks = Math.max(ab, ac);
            maks = Math.max(maks, bc);
            return maks;
        }

        public static PointArray[] findClosestPair(PointArray[] mas) {
            PointArray[] pair = new PointArray[2];
            double minDelta = (double)99999.0F;

            for(int i = 0; i < mas.length; ++i) {
                for(int j = 1 + i; j < mas.length; ++j) {
                    double delta = PointArray.getDistance(mas[i], mas[j]);
                    if (delta < minDelta) {
                        minDelta = delta;
                        pair[0] = mas[i];
                        pair[1] = mas[j];
                    }
                }
            }

            return pair;
        }

    public static void main(String[] args) {
        PointArray[] mas = new PointArray[]{new PointArray((double)1.0F, (double)0.0F), new PointArray((double)-10.0F, (double)-5.0F), new PointArray((double)4.0F, (double)0.0F), new PointArray((double)0.0F, (double)10.0F), new PointArray((double)5.0F, (double)20.0F)};
        PointArray[] closest = findClosestPair(mas);
        System.out.println(closest[0].x + "; " + closest[0].y);
        System.out.println(closest[1].x + "; " + closest[1].y);

    }
    }
