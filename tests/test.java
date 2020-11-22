package ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import ex1.WGraph_Algo;
import ex1.WGraph_DS;
import ex1.WGraph_DS.nodeInfo;
//import org.junit.jupiter.api.Assertions;

public class test {

    @Test
    public void twoNodesNotConnected() {
        WGraph_DS gr = new WGraph_DS();
        WGraph_DS.nodeInfo N1 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N2 = new WGraph_DS.nodeInfo();

        //  int S=N.getKey();
        gr.addNode(N1);
        gr.addNode(N2);
//        for (int i = 1; i < 3; i++) {
//            N = new WGraph_DS.nodeInfo();
//            gr.addNode(N);
//        }
        WGraph_Algo G1 = new WGraph_Algo();
        G1.init(gr);
        boolean flag = G1.isConnected();
        Assertions.assertFalse(flag);

    }
    @Test
    public void twoNodesConnected() {
        WGraph_DS gr = new WGraph_DS();
        WGraph_DS.nodeInfo N1 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N2 = new WGraph_DS.nodeInfo();

        //  int S=N.getKey();
        gr.addNode(N1);
        gr.addNode(N2);
        gr.connect(N1.getKey(),N2.getKey(),5.2);
//        for (int i = 1; i < 3; i++) {
//            N = new WGraph_DS.nodeInfo();
//            gr.addNode(N);
//        }
        WGraph_Algo G1 = new WGraph_Algo();
        G1.init(gr);
        boolean flag = G1.isConnected();
        Assertions.assertTrue(flag);

    }
    @Test
    public void tenNodesSeventeenEdgesConnected() {
        WGraph_DS gr = new WGraph_DS();
        WGraph_DS.nodeInfo N1 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N2 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N3 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N4 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N5 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N6 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N7 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N8 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N9 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N10 = new WGraph_DS.nodeInfo();
        gr.addNode(N1);
        gr.addNode(N2);
        gr.addNode(N3);
        gr.addNode(N4);
        gr.addNode(N5);
        gr.addNode(N6);
        gr.addNode(N7);
        gr.addNode(N8);
        gr.addNode(N9);
        gr.addNode(N10);
        gr.connect(N1.getKey(),N2.getKey(),1.2);
        gr.connect(N1.getKey(),N4.getKey(),3.6);
        gr.connect(N1.getKey(),N8.getKey(),3);
        gr.connect(N2.getKey(),N3.getKey(),2.9);
        gr.connect(N3.getKey(),N6.getKey(),8.6);
        gr.connect(N5.getKey(),N9.getKey(),6.6);
        gr.connect(N6.getKey(),N8.getKey(),4.3);
        gr.connect(N8.getKey(),N10.getKey(),7.2);
        gr.connect(N3.getKey(),N7.getKey(),5.9);
        gr.connect(N7.getKey(),N6.getKey(),8.1);
        gr.connect(N4.getKey(),N10.getKey(),4);
        gr.connect(N2.getKey(),N9.getKey(),1.0);
        gr.connect(N9.getKey(),N10.getKey(),6.5);
        gr.connect(N5.getKey(),N7.getKey(),4.8);
        gr.connect(N6.getKey(),N10.getKey(),6);
        gr.connect(N10.getKey(),N8.getKey(),5);
        gr.connect(N4.getKey(),N8.getKey(),1.2);
        WGraph_Algo G1 = new WGraph_Algo();
        G1.init(gr);
        boolean flag = G1.isConnected();
        Assertions.assertTrue(flag);

    }

    @Test
    public void tenNodesSeventeenEdgesShortestPathDist() {
        WGraph_DS gr = new WGraph_DS();
        WGraph_DS.nodeInfo N1 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N2 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N3 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N4 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N5 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N6 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N7 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N8 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N9 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N10 = new WGraph_DS.nodeInfo();
        gr.addNode(N1);
        gr.addNode(N2);
        gr.addNode(N3);
        gr.addNode(N4);
        gr.addNode(N5);
        gr.addNode(N6);
        gr.addNode(N7);
        gr.addNode(N8);
        gr.addNode(N9);
        gr.addNode(N10);
        gr.connect(N1.getKey(),N2.getKey(),1.2);
        gr.connect(N1.getKey(),N4.getKey(),3.6);
        gr.connect(N1.getKey(),N8.getKey(),3.0);
        gr.connect(N2.getKey(),N3.getKey(),2.9);
        gr.connect(N3.getKey(),N6.getKey(),8.6);
        gr.connect(N5.getKey(),N9.getKey(),6.6);
        gr.connect(N6.getKey(),N8.getKey(),4.3);
        gr.connect(N8.getKey(),N10.getKey(),7.2);
        gr.connect(N3.getKey(),N7.getKey(),5.9);
        gr.connect(N7.getKey(),N6.getKey(),8.1);
        gr.connect(N4.getKey(),N10.getKey(),4.0);
        gr.connect(N2.getKey(),N9.getKey(),1.0);
        gr.connect(N9.getKey(),N10.getKey(),6.5);
        gr.connect(N5.getKey(),N7.getKey(),4.8);
        gr.connect(N6.getKey(),N10.getKey(),6.0);
        gr.connect(N10.getKey(),N5.getKey(),5.0);
        gr.connect(N4.getKey(),N8.getKey(),1.2);
        WGraph_Algo G1 = new WGraph_Algo();
        G1.init(gr);
        if(G1.isConnected()){
        double n = G1.shortestPathDist(N4.getKey(),N8.getKey());
        Assertions.assertEquals(1.2,n);}

    }

    @Test
    public void tenNodesSeventeenEdgesSP() {
        WGraph_DS gr = new WGraph_DS();
        WGraph_DS.nodeInfo N1 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N2 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N3 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N4 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N5 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N6 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N7 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N8 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N9 = new WGraph_DS.nodeInfo();
        WGraph_DS.nodeInfo N10 = new WGraph_DS.nodeInfo();
        gr.addNode(N1);
        gr.addNode(N2);
        gr.addNode(N3);
        gr.addNode(N4);
        gr.addNode(N5);
        gr.addNode(N6);
        gr.addNode(N7);
        gr.addNode(N8);
        gr.addNode(N9);
        gr.addNode(N10);
        gr.connect(N1.getKey(),N2.getKey(),5.2);
        gr.connect(N1.getKey(),N4.getKey(),3.6);
        gr.connect(N1.getKey(),N8.getKey(),3);
        gr.connect(N2.getKey(),N3.getKey(),2.9);
        gr.connect(N3.getKey(),N6.getKey(),8.6);
        gr.connect(N5.getKey(),N9.getKey(),6.6);
        gr.connect(N6.getKey(),N8.getKey(),4.3);
        gr.connect(N8.getKey(),N10.getKey(),7.2);
        gr.connect(N3.getKey(),N7.getKey(),5.9);
        gr.connect(N7.getKey(),N6.getKey(),8.1);
        gr.connect(N4.getKey(),N10.getKey(),4);
        gr.connect(N2.getKey(),N9.getKey(),12);
        gr.connect(N9.getKey(),N10.getKey(),6.5);
        gr.connect(N5.getKey(),N7.getKey(),4.8);
        gr.connect(N6.getKey(),N10.getKey(),6);
        gr.connect(N10.getKey(),N8.getKey(),5);
        gr.connect(N4.getKey(),N8.getKey(),1.2);
        WGraph_Algo G1 = new WGraph_Algo();
        G1.init(gr);
        int n = G1.shortestPath(N4.getKey(),N8.getKey()).size();
        Assertions.assertEquals(2,n);
    }
    @Test
    public void connectivety() {
        WGraph_DS gr = new WGraph_DS();
//        WGraph_DS.nodeInfo N1 = new WGraph_DS.nodeInfo();
//        WGraph_DS.nodeInfo N2 = new WGraph_DS.nodeInfo();

        //  int S=N.getKey();
//        gr.addNode(N1);
//        gr.addNode(N2);
        int num=1000;
        int numOfEdges=8500;
        for (int i = 0; i < num; i++) {
           nodeInfo N=new nodeInfo();
            gr.addNode(N);
        }
        for (int i = 0; i < numOfEdges; i++)
        {
            int Rand1=(int)(Math.random()*num);
            int Rand2=(int)(Math.random()*num);
            double RandW=(int)(Math.random()*100+1);
            while(gr.hasEdge(Rand1, Rand2) || Rand1==Rand2)
            {
                Rand1=(int)(Math.random()*num);
                Rand2=(int)(Math.random()*num);
            }
            //System.out.println("Node with key: "+Rand1+" is Connected to Node with key: "+Rand2+" the edge price is : "+RandW);
            if(Rand1!=0 && Rand2!=0)
            gr.connect(Rand1, Rand2, RandW);
        }
        WGraph_Algo G1 = new WGraph_Algo();
        G1.init(gr);
        boolean flag = G1.isConnected();
        Assertions.assertFalse(flag);
    }
    @Test
    public void copyCheck() {
        WGraph_DS gr = new WGraph_DS();
//
        int num=20;
        int numOfEdges=52;
        for (int i = 0; i < num; i++) {
            nodeInfo N=new nodeInfo();
            gr.addNode(N);
        }
        for (int i = 0; i < numOfEdges; i++)
        {
            int Rand1=(int)(Math.random()*num);
            int Rand2=(int)(Math.random()*num);
            double RandW=(int)(Math.random()*100+1);
            while(gr.hasEdge(Rand1, Rand2) || Rand1==Rand2)
            {
                Rand1=(int)(Math.random()*num);
                Rand2=(int)(Math.random()*num);
            }
            //System.out.println("Node with key: "+Rand1+" is Connected to Node with key: "+Rand2+" the edge price is : "+RandW);
            if(Rand1!=0 && Rand2!=0)
                gr.connect(Rand1, Rand2, RandW);
        }
        WGraph_Algo A1 = new WGraph_Algo();
        A1.init(gr);
        WGraph_DS G1 =(WGraph_DS)A1.copy();
        boolean flag = G1.equals(gr);
        Assertions.assertTrue(flag);
    }
    public void removeCheck() {
        WGraph_DS gr = new WGraph_DS();
//
        int num=20;
        int numOfEdges=52;
        for (int i = 0; i < num; i++) {
            nodeInfo N=new nodeInfo();
            gr.addNode(N);
        }
        for (int i = 0; i < numOfEdges; i++)
        {
            int Rand1=(int)(Math.random()*num);
            int Rand2=(int)(Math.random()*num);
            double RandW=(int)(Math.random()*100+1);
            while(gr.hasEdge(Rand1, Rand2) || Rand1==Rand2)
            {
                Rand1=(int)(Math.random()*num);
                Rand2=(int)(Math.random()*num);
            }
            //System.out.println("Node with key: "+Rand1+" is Connected to Node with key: "+Rand2+" the edge price is : "+RandW);
            if(Rand1!=0 && Rand2!=0)
                gr.connect(Rand1, Rand2, RandW);
        }
        WGraph_Algo G1 = new WGraph_Algo();
        G1.init(gr);
        for(int i=0; i<3; i++){
            gr.removeNode(i);
        }
        boolean flag = G1.equals(gr);
        Assertions.assertFalse(flag);
    }
    @Test
    public void saveAndLoad() {
        WGraph_DS gr = new WGraph_DS();
//
        int num=10;
        int numOfEdges=30;
        for (int i = 0; i < num; i++) {
            nodeInfo N=new nodeInfo();
            gr.addNode(N);
        }
        for (int i = 0; i < numOfEdges; i++)
        {
            int Rand1=(int)(Math.random()*num);
            int Rand2=(int)(Math.random()*num);
            double RandW=(int)(Math.random()*100+1);
            while(gr.hasEdge(Rand1, Rand2) || Rand1==Rand2)
            {
                Rand1=(int)(Math.random()*num);
                Rand2=(int)(Math.random()*num);
            }
            //System.out.println("Node with key: "+Rand1+" is Connected to Node with key: "+Rand2+" the edge price is : "+RandW);
            if(Rand1!=0 && Rand2!=0)
                gr.connect(Rand1, Rand2, RandW);
        }
        WGraph_Algo G1 = new WGraph_Algo();
        G1.init(gr);
        String filesrc="testing.txt";
        G1.save(filesrc);
        boolean flag = G1.load(filesrc);
        Assertions.assertTrue(flag);
    }

}

