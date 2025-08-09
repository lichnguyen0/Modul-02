package sss;

import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import com.codegym.collectionutils.CollectionUtils;


public class CollectionUtilsAdapter implements CollectionOperations {

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> list = new ArrayList<>(numbers);
        CollectionUtils utils = new CollectionUtils();

        return utils.findMax(list);
    }
}
