class Solution {

    public List<String> getNeighbours(String word, HashSet<String> set){
        List<String>  neigh = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            for(char ch = 'a' ; ch <= 'z'; ch++){
                if(ch == word.charAt(i)){
                    continue;
                }
                String newWord = word.substring(0,i) + ch + word.substring(i+1, word.length());
                if(set.contains(newWord)){
                    neigh.add(newWord);
                }
            }
        }

        return neigh;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        // set end word hai hi nahi toh return 0
        if(!set.contains(endWord)){
            return 0;
        }

        if(set.contains(beginWord)){
            set.remove(beginWord);
        }

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        int level = 0;
        while(!q.isEmpty()){
            int currLevelSize = q.size();
            for(int i = 0; i < currLevelSize; i++){
                String node = q.poll();

                if(node.equals(endWord)){
                    return level + 1;
                }

                List<String> neigh = getNeighbours(node,set);
                for(String word : neigh){
                    if(set.contains(word)){
                        q.offer(word);
                        set.remove(word);
                    }
                }
            }
            level++;
        }

        return 0;
    }
}