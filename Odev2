import java.util.HashMap;
//huffmanKodla metodu verilen girdi metnini bir Huffman ağacı oluşturarak kodlar. Aynı zamanda parametre olarak gönderilen Huffman ağacını doldurur. Test işlemleri geri dönen kod ve ağaç üzerinden gerçekleştirilmektedir.
//@param girdi Girdi metni
//@param agac boş olarak verilen ağaç(HuffmanTree)
//@return kodlanmış metni döndürür
public class Odev2 {

    //girdi ve bos agac gonderiliryor
    public static String huffmanKodla(String girdi, HuffmanTree agac) {
                String[] words = girdi.split("");
                HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
                for (String a : words) {
                Integer freq = hm.get(a);
                hm.put(a, (freq == null) ? 1 : freq + 1);
                } 
                HuffmanNode[] hArray = new HuffmanNode[hm.size()];
                int index = 0;
                //>>>>>>>>>>>>>>
                for (Object key : hm.keySet()) {
                    int frequency = hm.get(key);
                    String MyKeyInString = key.toString();
                
                    char MyKeyInChar = 'X';
                    if (MyKeyInString == "") {
                        return null;
                    }
                    else
                    {
                        MyKeyInChar = MyKeyInString.charAt(0);
                    }
                    HuffmanNode MYNode = new HuffmanNode(MyKeyInChar,frequency,null,null);
                    hArray[index] = MYNode;
                    index++;
                }
                //^^^^^^^^^^^^^^
                agac.addAll(hArray);
                HashMap myMap =new HashMap();
                /**/
                myMap = findPath(agac.root);
                /**/
                Object[] myKeys = myMap.keySet().toArray();
                Object[] myValues = myMap.values().toArray();
                String myString = "";
                int i = 0;
                int j = 0;
                //>>>>>>>>>>>>>>
                for (String a: words) {
                    char c = a.charAt(0);
                    for(Object cc: myKeys)
                    {
                        cc = c;
                        if (myKeys[j].equals(c)) {
                            myString = myString + myValues[j];
                        }
                        j++;
                    }
                    j=0;
                    i++;
                }
                //^^^^^^^^^^^^^^
        agac.addAll(hArray);
        return myString;
    }
    
    static public HashMap findPath (HuffmanNode root){
    HashMap map = new HashMap();
    HuffmanNode current = root;
    String path = "";
    while(true){
        //yaprak ise
        if (isLeaf(current)) {
            map.put(current.value, path);
            if (path.length() > 0) {
                path = sil(path);
            }
            current = findParent(current, root);
            if (current == null) {
                    //kok e geri geldimi gelme
                return map;
            }
            //map da var ise node sil
            if (current.left != null) {
                    //map da var ise sil
                    if (map.get(current.left.value) != null) {
                    current.left=null;
                }
            }
            if (current.right != null) {
                    //map da var ise sil
                    if (map.get(current.right.value) != null) {
                    current.right=null;
                }
            }
            //kok e geri geldimi gelme
            else{
                return map;
            }
        }
        //if not ok current = null
        else if (LeftOk(current)) {
            path = path + "0";
            current = goLeft(current);
            continue;
        }
        else if (RightOk(current)) {
            path = path + "1";
            current = goRight(current);
            continue;
        }
        //ustte gelme
        else{
            if (!isLeaf(current)) {
                if (path.length() > 0) {
                    path = sil(path);
                }
                current = findParent(current, root);
                if (current == null) {
                    //kok e geri geldimi gelme
                    return map;
                }
                if (current.left != null) {
                    if (!isLeaf(current.left)) {
                    current.left = null;
                    }
                }
                if (current.right != null) {
                    if (!isLeaf(current.right) && !isNode(current.right)) {
                    current.right = null;
                    }
                }
            }
        }
    }
        
        
        
        
        
        
        
        
        
        
    } 
    static public boolean isNode(HuffmanNode node){
        if (node.value == null && node.left == null && node.right == null) {
            return false;
        }
        else{
            return true;
        }
    }  
    static public HuffmanNode goLeft(HuffmanNode node){
        node = node.left;
        return node;
    }   
    static public HuffmanNode goRight(HuffmanNode node){
        node = node.right;
        return node;
    }  
    static public boolean LeftOk(HuffmanNode node){
        if (node.left != null) {
            return true;
        }
        else{
            return false;
        }
    }
    static public boolean RightOk(HuffmanNode node){
        if (node.right != null) {
            return true;
        }
        else{
            return false;
        }
    }
    static public boolean isLeaf(HuffmanNode node){
        if (node != null && node.value != null && node.right == null && node.left == null) {
            return true;
        }
        else{
            return false;
        }
    }
    static public HuffmanNode findParent(HuffmanNode node,HuffmanNode root)/*10*/ {
        HuffmanNode parent = new HuffmanNode(null,0,null,null);
        HuffmanNode current = root;
        if(current==node)
        {parent=current;return null;}//node kok ise
            while(true)
            {
                if(current.equals(node))
                {return parent;}
                else if(current.left != null){
                    parent=current;
                    current=current.left;
                    continue;
                }
                else if(current.right != null){
                    parent=current;
                    current=current.right;
                    continue;
                }
                else{
                    if (current.left== null ){
                        current = parent;
                        current.left = null;
                    }
                    else if ( current.right == null){
                        current = parent;
                        current.right = null;
                    }
                }
            }
        }
    static public String sil (String a){
        StringBuilder bulid = new StringBuilder(a);
        bulid.deleteCharAt(a.length()-1);
        a=bulid.toString(); 
        return a;
    }
}
