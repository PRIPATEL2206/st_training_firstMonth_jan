class PriQue:
    q=[]
    def add(self,d):
        i=0
        n=len(self.q)
        while(i<n-1):
            if(self.q[i]<d):
                break
            i+=1
        
        self.q=self.q[:i]+[d]+self.q[i:]
    
    def deleteMax(self):
        if len(self.q)==0:
            return None
        v=self.q[0]
        self.q=self.q[1:]
        return v
    
    def max(self):
        if len(self.q)==0:
            return None
        return self.q[0]
    

pq=PriQue()
pq.add(1)
pq.add(2)
pq.add(6)
pq.add(4)
pq.add(5)
print(pq.max())
print(pq.deleteMax())
print(pq.max())
