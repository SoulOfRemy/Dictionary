
package Repository;

import java.util.HashMap;


public interface IDictionaryRepository {
    void readFile(HashMap<String, String> hm);

    void addNewWord(HashMap<String, String> hm);

    void deleteWord(HashMap<String, String> hm);

    void translate(HashMap<String, String> hm);
}
