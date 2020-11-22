# ex1:
I added comments on top of each function that explains what it does.
I will write down the important things here again:

I impleented this data structure by having two corresponding hashmaps per each nodes. one containes the neighbors and one contains the weights. they have identicle keys and there for i can know which weight goes with which neighbor.
Dijkstra:
The Dijkstra method is biult using a priority queue of course. it goes over all the nodes that are connected to the src node and sets their tag to be the shortest distance from the src.
BFS:
I used this function again in this assignment because it is more efficient than Dijkstra, and for isConnected function you dont need all of Dijkstra.
