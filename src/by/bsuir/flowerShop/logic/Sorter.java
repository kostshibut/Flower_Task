package by.bsuir.flowerShop.logic;



import by.bsuir.flowerShop.entity.Bouquet;
import by.bsuir.flowerShop.entity.CutFlower;
import by.bsuir.flowerShop.exception.IncorrectInputException;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter {
    public static Bouquet sortByFreshness(Bouquet bouquet) throws IncorrectInputException{
        ArrayList<CutFlower> flowers = bouquet.getFlowers();
        flowers.sort(new flowerFreshnessComparator());
        bouquet.setFlowers(flowers);
        return bouquet;
    }
    static class flowerFreshnessComparator implements Comparator<CutFlower>{
        @Override
        public int compare(CutFlower flower1, CutFlower flower2){
            if(flower1.getFreshness() - flower2.getFreshness() < 0){
                return 1;
            } else if(flower2.getFreshness() - flower1.getFreshness() < 0){
                return -1;
            }else{
                return 0;
            }

        }
    }
}
