package balance;

/**
 * https://www.jianshu.com/p/159fb7805147
 */
public class App {
    public static void main(String[] args) {
        /**
         * 假设有三个服务器权重配置如下：
         * server A  weight = 4 ;
         * server B  weight = 3 ;
         * server C  weight = 2 ;
         */
        Node serverA = new Node("serverA", 4);
        Node serverB = new Node("serverB", 3);
        Node serverC = new Node("serverC", 2);

        SmoothWeightedRoundRobin smoothWeightedRoundRobin = new SmoothWeightedRoundRobin(serverA,serverB ,serverC);
        for (int i = 0; i <460; i++) {
            long startTime = System.currentTimeMillis();
            long startno=System.nanoTime();
            Node i1 = smoothWeightedRoundRobin.select();
//            if (i==1) {
//                i1 = smoothWeightedRoundRobin.select();
//            }
            long endTime = System.currentTimeMillis();
            long endno=System.nanoTime();
            System.out.println(i+":"+i1.getServerName()+","+(endTime-startTime)+"ms,"+(endno-startno)+"ns");
        }
    }
}
