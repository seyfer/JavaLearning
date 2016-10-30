package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable<Beach>
{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {

//        if (name.equals(o.getName())) {
//            if (distance == o.distance) {
//                if (quality == o.quality) {
//                    return 0;
//                }
//
//                if (quality > o.quality) {
//                    return 1;
//                }
//                if (quality < o.quality) {
//                    return -1;
//                }
//            }
//
//            if (distance > o.distance) {
//                return 1;
//            }
//            if (distance < o.distance) {
//                return -1;
//            }
//        } else {
//            return name.compareTo(o.getName());
//        }
//
//        return 0;

//        if (this.quality > o.getQuality()) return -1;
//        else if (this.quality < o.getQuality()) return 1;
//        else if (this.distance > o.getDistance()) return -1;
//        else if (this.distance < o.getDistance()) return 1;
//        else return 0;

        int distanceParam = (int) (distance - o.getDistance());
        int qualityParam = quality - o.getQuality();
        return 10000 * name.compareTo(o.getName()) + 100 * distanceParam + qualityParam;
    }

//    public static void main(String[] args) {
//
//        TreeSet<Beach> beachSet = new TreeSet<Beach>();
//
//        beachSet.add(new Beach("beach1", 125.6f, 7));
//        beachSet.add(new Beach("beach2", 124.6f, 8));
//        beachSet.add(new Beach("beach3", 124.6f, 7));
//        beachSet.add(new Beach("beach4", 124.2f, 7));
//        beachSet.add(new Beach("beach5", 124.6f, 9));
//        beachSet.add(new Beach("beach6", 124.6f, 6));
//
//        for (Beach x : beachSet) {
//            System.out.println(x.getName() + " " + x.getDistance() + " " + x.getQuality());
//        }
//    }
}


