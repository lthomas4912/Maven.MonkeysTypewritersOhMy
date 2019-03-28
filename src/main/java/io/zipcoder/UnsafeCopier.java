package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier  {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        while (stringIterator.hasNext()){
            if(System.currentTimeMillis() % (3|11) == 0){
                copied += "No bananas!" + stringIterator.next() + " ";
            } else {
                copied += stringIterator.next() + " ";
            }
        }
    }
}
