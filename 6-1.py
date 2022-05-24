#!/usr/bin/env python
# coding: utf-8

# In[11]:


import pandas as pd
import numpy as np

raw_data = {'first_name': ['Jason', np.nan, 'Tina', 'Jake', 'Amy'],
           'last_name': ['Miller', np.nan, 'Ali', 'Milner', 'Cooze'],
           'age': [42, np.nan, 36, 24, 73],
           'sex': ['m', np.nan, 'f', 'm', 'f'],
           'preTestScore': [4, np.nan, np.nan, 2, 3],
           'postTestScore': [25, np.nan, np.nan, 62, 70]}
df=pd.DataFrame(raw_data, columns = {'first_name', 'last_name', 'age', 'sex', 'preTestScore', 'postTestScore'})
df


# In[12]:


df.isnull().sum() / len(df)


# In[13]:


df.dropna()


# In[17]:


df_no_missing=df.dropna()
df_no_missing


# In[18]:


df_cleaned=df.dropna(how='all')
df_cleaned


# In[20]:


df['location']=np.nan
df.dropna(axis=1, how='all')


# In[22]:


df.dropna(axis=0, thresh=1)


# In[23]:


df.dropna(thresh=5)


# In[24]:


df.fillna(0)


# In[25]:


df["preTestScore"].fillna(df["preTestScore"].mean(), inplace=True)
df


# In[26]:


df.groupby("sex")[
    "postTestScore"].transform("mean")


# In[28]:


df["postTestScore"].fillna(
df.groupby("sex")["postTestScore"].transform("mean"), inplace=True)
df


# In[29]:


edges = pd.DataFrame({'source':[0,1,2], 'target':[2,2,3],
                     'weight':[3,4,5], 'color':['red', 'blue','blue']})
edges


# In[30]:


edges.dtypes


# In[31]:


pd.get_dummies(edges)


# In[32]:


pd.get_dummies(edges["color"])


# In[33]:


pd.get_dummies(edges[["color"]])


# In[34]:


weight_dict={3:"M", 4:"L", 5:"XL"}
edges["weight_sign"] = edges["weight"].map(weight_dict)
weight_sign=pd.get_dummies(edges["weight_sign"])
weight_sign


# In[35]:


pd.concat([edges, weight_sign], axis=1)


# In[36]:


raw_data={'regiment':['Nighthawks', 'Nighthawks', 'Nighthawks', 'Nighthawks',                       'Dragons', 'Dragons', 'Dragons', 'Dragons',
                     'Scouts', 'Scots', 'Scouts', 'Scouts'],
         'company': ['1st', '1st', '2nd', '2nd', '1st', '1st', '2nd', '2nd', '1st', '1st', '2nd', '2nd'],
         'name':['Miller', 'Jacobson', 'All', 'Milner', 'Cooze', 'Jacon', 'Ryner', 'Sone', 'Sloan', 'Piger', 'Riani', 'Ali'],
         'preTestScore':[4,24,31,2,3,4,24,31,2,3,2,3],
         'postTestScore':[25,94,57,62,70,25,94,57,62,70,62,70]}
df=pd.DataFrame(raw_data, columns=['regiment','company','name','preTestScore','postTestScore'])
df


# In[37]:


bins=[0,25,50,75,100]
group_names=['Low','Okay','Good','Great']
categories=pd.cut(df['postTestScore'], bins, labels=group_names)
categories


# In[39]:


df=pd.DataFrame(
{'A':[14.00, 90.20, 90.95, 96.27, 91.21],
'B':[103.02, 107.26, 110.35, 114.23, 114.68],
'C':['big', 'small', 'big', 'small','small']})
df


# In[40]:


df["A"]-df["A"].min()


# In[41]:


(df["A"]-df["A"].min())/(df["A"].max()-df["A"].min())


# In[42]:


(df["B"]-df["B"].mean())/(df["B"].std())


# In[ ]:




