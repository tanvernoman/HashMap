/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author afnan
 */
public class HashMap_ {

    int SIZE_OF_TABLE = 128;
    HashEntry[] table;

    HashMap_() {
        table = new HashEntry[SIZE_OF_TABLE];
        for (int i = 0; i < SIZE_OF_TABLE; i++) {
            table[i] = null;
        }
    }

    public void put(int key, int value) {
        int index = hash(key);
        
        HashEntry hashEntry = new HashEntry(key, value);
        if (table[index] == null) {
            table[index] = hashEntry;
        } else {
            HashEntry runner = table[index];
            while (runner.next != null) {
                if (runner.key == hashEntry.key) {
                    runner.value = hashEntry.value;
                    break;
                } else {
                    runner = runner.next;
                }
            }
            if (runner.next == null) {
                if (runner.key == hashEntry.key) {
                    runner.value = hashEntry.value;
                } else {
                    runner.next = hashEntry;
                }
            }
        }
    }
 private int hash(int key){
        return Math.abs(k.hashCode()) % SIZE_OF_TABLE;
    }

    
    
    public void display(){
       
       for(int i=0;i<SIZE_OF_TABLE;i++){
           if(table[i]!=null){
                  HashEntry entry=table[i];
                  while(entry!=null){
                        System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
                        entry=entry.next;
                  }
           }
       } 
    }
}
