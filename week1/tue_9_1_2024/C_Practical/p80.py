import time
import threading
import random

def produce(item:list):
    forever=True
    i=0
    while forever:
        time.sleep(2)
        v=int(random.random()*100)
        item.append(v)
        print("item ",v," is Produced")
        i+=1

def consume(item:list):
    forever=True
    while forever:
        time.sleep(2)
        if len(item)==0:
            print("item is empty while consuming")
            continue
        v=item.pop(0)
        print("item ",v," is consumed")
items=[]
producer=threading.Thread(target=produce,args=(items,))
consumer=threading.Thread(target=consume,args=(items,))

producer.start()
consumer.start()
