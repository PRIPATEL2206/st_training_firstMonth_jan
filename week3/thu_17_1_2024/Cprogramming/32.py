import math
class Solution:
 
    def __init__(self):
         
        
        self.cost = [[]]*31
        for i in range(31):
            self.cost[i] = [0]*31
 
        self.n = 0; 
        self.max_match = 0; 
        self.lx = [0]*31 
        self.ly = [0]*31 
        self.xy = [0]*31 
        self.yx = [0]*31 
        self.S = [False]*31 
        self.T = [False]*31 
        self.slack = [0]*31 
        self.slackx = [0]*31 
        self.prev_ious = [0]*31 
         
   
    def init_labels(self):
        for i in range(len(self.lx)):
            self.lx[i] = 0
        for i in range(len(self.ly)):
            self.ly[i] = 0      
 
         
        for x in range(self.n):
            for y in range(self.n):
                self.lx[x] = max(self.lx[x], self.cost[x][y])
     
      
    def update_labels(self):
        x = 0
        y = 0
        delta = 99999999 
         
        for y in range(self.n): 
            if this.T[y] == False:
                delta = math.min(delta, self.slack[y])
                 
                 
        for x in range(self.n):
            if self.S[x] == True: 
                self.lx[x] -= delta
 
        for y in range(self.n):
            if self.T[y] == True:
                self.ly[y] += delta 
         
        for y in range(self.n):
            if self.T[y] == False:
                self.slack[y] -= delta 
     
     
    def add_to_tree(self, x, prev_iousx):
         
    
    
        self.S[x] = True 
        self.prev_ious[x] = prev_iousx 
        for y in range(self.n):
            if self.lx[x] + self.ly[y] - self.cost[x][y] < self.slack[y]:
                self.slack[y] = self.lx[x] + self.ly[y] - self.cost[x][y]
                self.slackx[y] = x
     
     
     
    def augment(self): 
        if self.max_match == self.n:
            return 
        x= 0
        y = 0
        root = 0 
        q= [0]*31
        wr = 0
        rd = 0 
        
        for i in range(len(self.S)):
            self.S[i] = False 
        for i in range(len(self.T)):
            self.T[i] = False 
        for i in range(len(self.prev_ious)):
            self.prev_ious[i] = -1 
         
        for x in range(self.n): 
            if self.xy[x] == -1:
                q[wr] = root = x
                wr = wr + 1
                self.prev_ious[x] = -2
                self.S[x] = True
                break
 
        for y in range(self.n): 
            self.slack[y] = self.lx[root] + self.ly[y] - self.cost[root][y]
            self.slackx[y] = root
         
        
        while (True): 
         
            while (rd < wr): 
                x = q[rd]
                rd = rd + 1 
                for y in range(self.n): 
                    if self.cost[x][y] == self.lx[x] + self.ly[y] and self.T[y] == False:
                        if self.yx[y] == -1:
                            break 
                                                
                        this.T[y] = True 
                        q[wr] = self.yx[y] 
                        wr = wr + 1
                        
                        self.add_to_tree(self.yx[y], x) 
         
                if y < self.n:
                    break 
            if y < self.n:
                break 
             
            self.update_labels() 
             
            wr = 0
            rd = 0
         
            for y in range(self.n):
                if self.T[y] == False and self.slack[y] == 0:
                    if self.yx[y] == -1: 
                        x = self.slackx[y]
                        break
                    else:
                        self.T[y] = True 
                        if self.S[self.yx[y]] == False:
                     
                            q[wr] = self.yx[y] 
                            wr = wr + 1
                            
                            self.add_to_tree(self.yx[y], self.slackx[y]); 
                            
            if y < self.n:
                break 
         
        if y < self.n: 
            self.max_match = self.max_match + 1 
            
            cx = x
            cy = y
            ty = 0
            while(cx != -2):
                 
                ty  = self.xy[cx]
                self.yx[cy] = cx
                self.xy[cx] = cy
             
                cx = self.prev_ious[cx]
                cy = ty
            self.augment() 
        
      
    def hungarian(self):
         
        ret = 0 
        self.max_match = 0; 
        for i in range(len(self.xy)):
            self.xy[i] = -1
        for i in range(len(self.yx)):
            self.yx[i] = -1
 
        self.init_labels() 
        self.augment() 
         
        for x in range(self.n):
            ret += self.cost[x][self.xy[x]]
         
        return ret
     
    def assignmentProblem(self, Arr, N):
         
        self.n = N
        for i in range(self.n):
            for j in range(self.n):
                self.cost[i][j] = -1*Arr[i*self.n + j]
                 
        ans = -1 * self.hungarian()
         
        return ans - 2000
 
 
n=3
Arr = [1500,4000,4500,2000,6000,3500,2000,4000,2500]   
ob = Solution()
print(ob.assignmentProblem( Arr,n))