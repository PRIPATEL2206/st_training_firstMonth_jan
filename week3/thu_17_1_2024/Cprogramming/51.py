# file 51.py
# Example usage of a network flow library like NetworkX
import networkx as nx

def minimum_cost_flow(graph, source, target, flow_demand):
    min_cost_flow = nx.min_cost_flow(graph, capacity='capacity', demand='demand')
    return min_cost_flow[source][target] if target in min_cost_flow[source] else 0

# Example input
G = nx.DiGraph()
G.add_edge('source', 'A', capacity=10, weight=2)
G.add_edge('source', 'B', capacity=5, weight=5)
G.add_edge('A', 'B', capacity=15, weight=1)
G.add_edge('A', 'target', capacity=10, weight=2)
G.add_edge('B', 'target', capacity=10, weight=4)

G.nodes['source']['demand'] = -15  # Negative demand at source (flow out)
G.nodes['target']['demand'] = 15   # Positive demand at target (flow in)

result = minimum_cost_flow(G, 'source', 'target', 15)
print(f"Minimum cost for the given flow demand: {result}")