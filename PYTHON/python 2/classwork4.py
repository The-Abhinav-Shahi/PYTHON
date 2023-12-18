#dictionary
a={}
b=dict()
print(type(b))
a={'sam':26,"ram":45,"hari":90}
print(a)
#heterogenous
infex={'name':'umesh','salary':5.01,'age':28,'employee':True}
print(infex)
#repeated key replaces the first value
#key should be unique
b={'ram':25,"sam":56,'ram':35}
print(b)
print(len(b))
print('ram'in b)
print('atharva'in a)
print(b['ram'])
print(a["sam"])
a['hari']=57
print(a['hari'])
a['atharva']=45
print(a)
c={'colors':['red','white','black'],'class':11}
print(c)
d=[('ram',67),('sam',98),('hari',87)]
print(d)
del d[0]
print(d)
e={'name':'atharva','salary':500.01,'address':{'city':'kathmandu','tole':'ason'}}
e['name']='umesh'
e['name']='atharva'
print(e)
print(e['address']['tole'])
