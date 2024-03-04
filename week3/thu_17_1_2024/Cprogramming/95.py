class Fact:
    def __init__(self, attributes):
        self.attributes = attributes

class Rule:
    def __init__(self, condition, action):
        self.condition = condition
        self.action = action

class ReteNetwork:
    def __init__(self):
        self.alpha_memory = []

    def add_fact(self, fact):
        self.alpha_memory.append(fact)

    def execute_rules(self):
        for fact in self.alpha_memory:
            for rule in rules:
                if self.match_rule(fact, rule.condition):
                    self.execute_action(rule.action)

    def match_rule(self, fact, condition):
        
        return all(attr in fact.attributes for attr in condition)

    def execute_action(self, action):
        
        print(f"Action executed: {action}")


fact1 = Fact(["temperature", "high"])
fact2 = Fact(["humidity", "low"])

rule1 = Rule(["temperature", "high"], "turn_on_heater")
rule2 = Rule(["humidity", "low"], "turn_on_air_conditioner")

rules = [rule1, rule2]

rete_network = ReteNetwork()
rete_network.add_fact(fact1)
rete_network.add_fact(fact2)

rete_network.execute_rules()
